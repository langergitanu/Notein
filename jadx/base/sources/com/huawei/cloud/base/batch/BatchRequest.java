package com.huawei.cloud.base.batch;

import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpExecuteInterceptor;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestFactory;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.http.MultipartContent;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.client.util.AppInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class BatchRequest {
    private static GenericUrl batchUrl;
    private final HttpRequestFactory requestFactory;
    List<RequestInfo<?, ?>> requestInfos = new ArrayList();

    public class BatchInterceptor implements HttpExecuteInterceptor {
        private HttpExecuteInterceptor originalInterceptor;

        public BatchInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.originalInterceptor = httpExecuteInterceptor;
        }

        @Override // com.huawei.cloud.base.http.HttpExecuteInterceptor
        public void intercept(HttpRequest httpRequest) throws IOException {
            HttpExecuteInterceptor httpExecuteInterceptor = this.originalInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(httpRequest);
            }
            for (RequestInfo<?, ?> requestInfo : BatchRequest.this.requestInfos) {
                HttpExecuteInterceptor interceptor = requestInfo.request.getInterceptor();
                if (interceptor != null) {
                    interceptor.intercept(requestInfo.request);
                }
            }
        }
    }

    public static class RequestInfo<T, E> {
        final BatchCallback<T, E> callback;
        final Class<T> dataClass;
        final Class<E> errorClass;
        final HttpRequest request;

        public RequestInfo(BatchCallback<T, E> batchCallback, Class<T> cls, Class<E> cls2, HttpRequest httpRequest) {
            this.callback = batchCallback;
            this.dataClass = cls;
            this.errorClass = cls2;
            this.request = httpRequest;
        }
    }

    public BatchRequest(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    public static GenericUrl getBatchUrl() {
        return batchUrl;
    }

    public void execute() throws IOException {
        boolean z;
        Preconditions.checkState(!this.requestInfos.isEmpty());
        HttpRequest httpRequestBuildPostRequest = this.requestFactory.buildPostRequest(batchUrl, null);
        httpRequestBuildPostRequest.getHeaders().set("version", (Object) AppInfo.SDK_VERSION);
        httpRequestBuildPostRequest.setInterceptor(new BatchInterceptor(httpRequestBuildPostRequest.getInterceptor()));
        httpRequestBuildPostRequest.setParser(this.requestInfos.get(0).request.getParser());
        int numberOfRetries = httpRequestBuildPostRequest.getNumberOfRetries();
        do {
            z = numberOfRetries > 0;
            MultipartContent multipartContent = new MultipartContent();
            multipartContent.getMediaType().setSubType("mixed");
            Iterator<RequestInfo<?, ?>> it = this.requestInfos.iterator();
            int i = 1;
            while (it.hasNext()) {
                multipartContent.addPart(new MultipartContent.Part(new HttpHeaders().setAcceptEncoding(null).set("Content-ID", (Object) Integer.valueOf(i)), new HttpRequestContent(it.next().request)));
                i++;
            }
            httpRequestBuildPostRequest.setContent(multipartContent);
            HttpResponse httpResponseExecute = httpRequestBuildPostRequest.execute();
            try {
                BatchUnparsedResponse batchUnparsedResponse = new BatchUnparsedResponse(httpResponseExecute.getContent(), "--" + httpResponseExecute.getMediaType().getParameter("boundary"), this.requestInfos, z);
                while (batchUnparsedResponse.hasNext) {
                    batchUnparsedResponse.parseNextResponse();
                }
                httpResponseExecute.disconnect();
                List<RequestInfo<?, ?>> list = batchUnparsedResponse.unsuccessfulRequestInfos;
                if (list.isEmpty()) {
                    break;
                }
                this.requestInfos = list;
                numberOfRetries--;
            } catch (Throwable th) {
                httpResponseExecute.disconnect();
                throw th;
            }
        } while (z);
        this.requestInfos.clear();
    }

    public <T, E> BatchRequest queue(HttpRequest httpRequest, Class<T> cls, Class<E> cls2, BatchCallback<T, E> batchCallback) throws IOException {
        Preconditions.checkNotNull(httpRequest);
        Preconditions.checkNotNull(batchCallback);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(cls2);
        this.requestInfos.add(new RequestInfo<>(batchCallback, cls, cls2, httpRequest));
        return this;
    }

    public BatchRequest setBatchUrl(GenericUrl genericUrl) {
        batchUrl = genericUrl;
        return this;
    }

    public int size() {
        return this.requestInfos.size();
    }
}
