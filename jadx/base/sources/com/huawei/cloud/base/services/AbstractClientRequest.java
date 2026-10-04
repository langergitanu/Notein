package com.huawei.cloud.base.services;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.cloud.base.MethodOverride;
import com.huawei.cloud.base.batch.BatchCallback;
import com.huawei.cloud.base.batch.BatchRequest;
import com.huawei.cloud.base.http.AbstractInputStreamContent;
import com.huawei.cloud.base.http.EmptyContent;
import com.huawei.cloud.base.http.GZipEncoding;
import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpContent;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestFactory;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpResponseException;
import com.huawei.cloud.base.http.HttpResponseInterceptor;
import com.huawei.cloud.base.http.HttpStatusCodes;
import com.huawei.cloud.base.http.UriTemplate;
import com.huawei.cloud.base.http.model.ErrorResponse;
import com.huawei.cloud.base.media.MediaHttpDownloader;
import com.huawei.cloud.base.media.MediaHttpUploader;
import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.hms.drive.C17872g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractClientRequest<T> extends GenericData {
    private final AbstractClient abstractClient;
    private boolean disableGZip;
    private MediaHttpDownloader downloader;
    private final HttpContent httpContent;
    private HttpHeaders lastResponseHeaders;
    private ErrorResponse lastStatusError;
    private String lastStatusMessage;
    private final String requestMethod;
    private Class<T> responseClass;
    private MediaHttpUploader uploader;
    private final String uriTemplate;
    private static final String TAG = "AbstractClientRequest";
    private static final Logger LOGGER = Logger.getLogger(TAG);
    private HttpHeaders headers = new HttpHeaders();
    private int lastStatusCode = -1;

    public AbstractClientRequest(AbstractClient abstractClient, String str, String str2, HttpContent httpContent, Class<T> cls) {
        this.responseClass = (Class) Preconditions.checkNotNull(cls);
        this.abstractClient = (AbstractClient) Preconditions.checkNotNull(abstractClient);
        this.requestMethod = (String) Preconditions.checkNotNull(str);
        this.uriTemplate = (String) Preconditions.checkNotNull(str2);
        this.httpContent = httpContent;
        String applicationName = abstractClient.getApplicationName();
        if (applicationName != null) {
            this.headers.set("x-hw-app-name", (Object) applicationName);
        }
    }

    private HttpRequest buildHttpRequest() throws IOException {
        final HttpRequest httpRequestBuildRequest = this.abstractClient.getRequestFactory().buildRequest(this.requestMethod, buildHttpRequestUrl(), this.httpContent);
        new MethodOverride().intercept(httpRequestBuildRequest);
        httpRequestBuildRequest.setParser(this.abstractClient.getObjectParser());
        if (this.httpContent == null && (this.requestMethod.equals("POST") || this.requestMethod.equals("PUT") || this.requestMethod.equals("PATCH"))) {
            httpRequestBuildRequest.setContent(new EmptyContent());
        }
        httpRequestBuildRequest.getHeaders().putAll(this.headers);
        if (!this.disableGZip) {
            httpRequestBuildRequest.setEncoding(new GZipEncoding());
        }
        final HttpResponseInterceptor responseInterceptor = httpRequestBuildRequest.getResponseInterceptor();
        httpRequestBuildRequest.setResponseInterceptor(new HttpResponseInterceptor() { // from class: com.huawei.cloud.base.services.AbstractClientRequest.1
            @Override // com.huawei.cloud.base.http.HttpResponseInterceptor
            public void interceptResponse(HttpResponse httpResponse) throws IOException {
                HttpResponseInterceptor httpResponseInterceptor = responseInterceptor;
                if (httpResponseInterceptor != null) {
                    httpResponseInterceptor.interceptResponse(httpResponse);
                }
                if (!httpResponse.isSuccessStatusCode() && httpRequestBuildRequest.getThrowExceptionOnExecuteError()) {
                    throw AbstractClientRequest.this.newExceptionOnError(httpResponse);
                }
            }
        });
        return httpRequestBuildRequest;
    }

    private HttpResponse executeUnparsed() throws IOException {
        HttpResponse httpResponseUpload;
        if (this.uploader == null) {
            httpResponseUpload = buildHttpRequest().execute();
        } else {
            GenericUrl genericUrlBuildHttpRequestUrl = buildHttpRequestUrl();
            boolean throwExceptionOnExecuteError = getAbstractClient().getRequestFactory().buildRequest(this.requestMethod, genericUrlBuildHttpRequestUrl, this.httpContent).getThrowExceptionOnExecuteError();
            this.headers.set("x-hw-trace-id", (Object) C17872g.m76783a("12214"));
            httpResponseUpload = this.uploader.setInitiationHeaders(this.headers).setDisableGZipContent(this.disableGZip).upload(genericUrlBuildHttpRequestUrl);
            httpResponseUpload.getRequest().setParser(getAbstractClient().getObjectParser());
            if (!httpResponseUpload.isSuccessStatusCode()) {
                IOException iOExceptionNewExceptionOnError = newExceptionOnError(httpResponseUpload);
                if (throwExceptionOnExecuteError) {
                    throw iOExceptionNewExceptionOnError;
                }
            }
        }
        this.lastResponseHeaders = httpResponseUpload.getHeaders();
        this.lastStatusCode = httpResponseUpload.getStatusCode();
        this.lastStatusMessage = httpResponseUpload.getStatusMessage();
        if (!HttpStatusCodes.isSuccess(this.lastStatusCode)) {
            this.lastStatusError = (ErrorResponse) getAbstractClient().getObjectParser().parseAndClose(httpResponseUpload.getContent(), httpResponseUpload.getContentCharset(), (Class) ErrorResponse.class);
        }
        return httpResponseUpload;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IOException newExceptionOnError(HttpResponse httpResponse) {
        return new HttpResponseException(httpResponse);
    }

    public GenericUrl buildHttpRequestUrl() {
        return new GenericUrl(UriTemplate.expand(this.abstractClient.getBaseUrl(), this.uriTemplate, this, true));
    }

    public final void checkRequiredParameter(Object obj, String str) {
        Preconditions.checkArgument(this.abstractClient.getSuppressRequiredParameterChecks() || obj != null, "Required parameter %s must be specified", str);
    }

    public T execute() throws IOException {
        return (T) executeUnparsed().parseAs((Class) this.responseClass);
    }

    public void executeAndDownloadTo(OutputStream outputStream) throws IOException {
        executeUnparsed().download(outputStream);
    }

    public InputStream executeAsInputStream() throws IOException {
        return executeUnparsed().getContent();
    }

    public HttpResponse executeContent() throws IOException {
        set("form", (Object) FirebaseAnalytics.Param.CONTENT);
        return executeUnparsed();
    }

    public void executeContentAndDownloadTo(OutputStream outputStream) throws IOException {
        if (this.downloader == null) {
            executeContent().download(outputStream);
            return;
        }
        this.headers.set("x-hw-trace-id", (Object) C17872g.m76783a("12215"));
        GenericUrl genericUrlBuildHttpRequestUrl = buildHttpRequestUrl();
        boolean throwExceptionOnExecuteError = getAbstractClient().getRequestFactory().buildGetRequest(genericUrlBuildHttpRequestUrl).getThrowExceptionOnExecuteError();
        try {
            this.downloader.download(genericUrlBuildHttpRequestUrl, this.headers, outputStream);
        } catch (IOException e) {
            if (throwExceptionOnExecuteError) {
                throw e;
            }
        }
    }

    public InputStream executeContentAsInputStream() throws IOException {
        return executeContent().getContent();
    }

    public AbstractClient getAbstractClient() {
        return this.abstractClient;
    }

    public final boolean getDisableGZip() {
        return this.disableGZip;
    }

    public final HttpHeaders getHeaders() {
        return this.headers;
    }

    public final HttpContent getHttpContent() {
        return this.httpContent;
    }

    public final HttpHeaders getLastResponseHeaders() {
        return this.lastResponseHeaders;
    }

    public final int getLastStatusCode() {
        return this.lastStatusCode;
    }

    public ErrorResponse getLastStatusError() {
        return this.lastStatusError;
    }

    public final String getLastStatusMessage() {
        return this.lastStatusMessage;
    }

    public final MediaHttpDownloader getMediaHttpDownloader() {
        return this.downloader;
    }

    public final MediaHttpUploader getMediaHttpUploader() {
        return this.uploader;
    }

    public final String getRequestMethod() {
        return this.requestMethod;
    }

    public final Class<T> getResponseClass() {
        return this.responseClass;
    }

    public final String getUriTemplate() {
        return this.uriTemplate;
    }

    public final void initializeMediaDownload() {
        HttpRequestFactory requestFactory = this.abstractClient.getRequestFactory();
        this.downloader = new MediaHttpDownloader(requestFactory.getTransport(), requestFactory.getInitializer());
    }

    public final void initializeMediaUpload(AbstractInputStreamContent abstractInputStreamContent) {
        HttpRequestFactory requestFactory = this.abstractClient.getRequestFactory();
        MediaHttpUploader mediaHttpUploader = new MediaHttpUploader(abstractInputStreamContent, requestFactory.getTransport(), requestFactory.getInitializer());
        this.uploader = mediaHttpUploader;
        mediaHttpUploader.setInitiationRequestMethod(this.requestMethod);
        HttpContent httpContent = this.httpContent;
        if (httpContent != null) {
            this.uploader.setMetadata(httpContent);
        }
    }

    public final <E> void queue(BatchRequest batchRequest, Class<E> cls, BatchCallback<T, E> batchCallback) throws IOException {
        Preconditions.checkArgument(this.uploader == null, "Batching media requests is not supported");
        batchRequest.queue(buildHttpRequest(), getResponseClass(), cls, batchCallback);
    }

    public AbstractClientRequest<T> setDisableGZip(boolean z) {
        this.disableGZip = z;
        return this;
    }

    public AbstractClientRequest<T> setHeaders(HttpHeaders httpHeaders) {
        this.headers = httpHeaders;
        return this;
    }

    @Override // com.huawei.cloud.base.util.GenericData
    public AbstractClientRequest<T> set(String str, Object obj) {
        return (AbstractClientRequest) super.set(str, obj);
    }
}
