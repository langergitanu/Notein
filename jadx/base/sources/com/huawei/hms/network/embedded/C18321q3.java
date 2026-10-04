package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ExtLogger;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.Version;
import com.huawei.hms.network.api.advance.WrapperLogger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18321q3 {

    /* JADX INFO: renamed from: a */
    public static final String f55929a = "SafeApi";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$a */
    public static final class a<T> extends Callback<T> {

        /* JADX INFO: renamed from: a */
        public final Callback<T> f55930a;

        public a(Callback<T> callback) {
            CheckParamUtils.checkNotNull(callback, "SafeCallback<T> callback == null");
            this.f55930a = callback;
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<T> submit, Throwable th) {
            this.f55930a.onFailure(submit, th);
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<T> submit, Response<T> response) throws IOException {
            this.f55930a.onResponse(submit, response);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$b */
    public static final class b extends Interceptor.Chain {

        /* JADX INFO: renamed from: a */
        public final Interceptor.Chain f55931a;

        public b(Interceptor.Chain chain) {
            CheckParamUtils.checkNotNull(chain, "SafeChain chain == null");
            this.f55931a = chain;
        }

        public AbstractC18129c5 getRCEventListener() {
            return ((C18239k3) this.f55931a).getRCEventListener();
        }

        public C18225j3 getRealHttpclient() {
            return (C18225j3) ((C18239k3) this.f55931a).getClient();
        }

        public InterfaceC18267m3 getRequestTask() {
            return ((C18239k3) this.f55931a).getRequestTask();
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public Response<ResponseBody> proceed(Request request) throws IOException {
            return this.f55931a.proceed(request);
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public d request() {
            return (d) this.f55931a.request();
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public RequestFinishedInfo requestFinishedInfo() {
            InterfaceC18267m3 requestTask;
            if (!C18321q3.apiAvailable(5) || (requestTask = ((C18239k3) this.f55931a).getRequestTask()) == null) {
                return null;
            }
            return requestTask.getRequestFinishedInfo();
        }

        public Response<ResponseBody> proceed(RequestContext requestContext, InterfaceC18267m3 interfaceC18267m3) throws IOException {
            return ((C18239k3) this.f55931a).m78963a(requestContext, interfaceC18267m3);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$c */
    public static final class c extends Interceptor {

        /* JADX INFO: renamed from: a */
        public final Interceptor f55932a;

        public c(Interceptor interceptor) {
            CheckParamUtils.checkNotNull(interceptor, "SafeInterceptor interceptor == null");
            this.f55932a = interceptor;
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor
        public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
            return this.f55932a.intercept(chain);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$d */
    public static final class d extends Request {

        /* JADX INFO: renamed from: a */
        public final Request f55933a;

        /* JADX INFO: renamed from: b */
        public C18170f4 f55934b;

        public d(Request request) {
            CheckParamUtils.checkNotNull(request, "SafeRequest request == null");
            this.f55933a = request;
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public RequestBody getBody() {
            return this.f55933a.getBody();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public Map<String, List<String>> getHeaders() {
            return this.f55933a.getHeaders();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getMethod() {
            return this.f55933a.getMethod();
        }

        public C18170f4 getNetConfig() {
            C18170f4 c18170f4 = this.f55934b;
            if (c18170f4 != null) {
                return c18170f4;
            }
            C18170f4 c18170f42 = new C18170f4(getOptions());
            this.f55934b = c18170f42;
            return c18170f42;
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getOptions() {
            return this.f55933a.getOptions();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getUrl() {
            return this.f55933a.getUrl();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public Request.Builder newBuilder() {
            return this.f55933a.newBuilder();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$e */
    public static final class e extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final RequestBody f55935a;

        public e(RequestBody requestBody) {
            CheckParamUtils.checkNotNull(requestBody, "SafeRequestBody requestBody == null");
            this.f55935a = requestBody;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public long contentLength() throws IOException {
            return this.f55935a.contentLength();
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public String contentType() {
            return this.f55935a.contentType();
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public boolean isDuplex() {
            if (C18321q3.apiAvailable(5)) {
                return this.f55935a.isDuplex();
            }
            return false;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public void writeTo(OutputStream outputStream) throws IOException {
            this.f55935a.writeTo(outputStream);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$f */
    public static final class f<T> extends Response<T> {

        /* JADX INFO: renamed from: a */
        public final Response<T> f55936a;

        public f(Response<T> response) {
            CheckParamUtils.checkNotNull(response, "SafeResponse<T> response == null");
            this.f55936a = response;
        }

        @Override // com.huawei.hms.network.httpclient.Response, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55936a.close();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public T getBody() {
            return this.f55936a.getBody();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public int getCode() {
            return this.f55936a.getCode();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public ResponseBody getErrorBody() {
            return this.f55936a.getErrorBody();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public Map<String, List<String>> getHeaders() {
            return this.f55936a.getHeaders();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public String getMessage() {
            return this.f55936a.getMessage();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public String getUrl() {
            return this.f55936a.getUrl();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$g */
    public static final class g extends ResponseBody {

        /* JADX INFO: renamed from: a */
        public final ResponseBody f55937a;

        public g(ResponseBody responseBody) {
            CheckParamUtils.checkNotNull(responseBody, "SafeResponseBody responseBody == null");
            this.f55937a = responseBody;
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f55937a.close();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public long getContentLength() {
            return this.f55937a.getContentLength();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public String getContentType() {
            return this.f55937a.getContentType();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public InputStream getInputStream() {
            return this.f55937a.getInputStream();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$h */
    public static final class h<T> extends Submit<T> {

        /* JADX INFO: renamed from: a */
        public final Submit<T> f55938a;

        public h(Submit<T> submit) {
            CheckParamUtils.checkNotNull(submit, "SafeSubmit<T> submit == null");
            this.f55938a = submit;
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void cancel() {
            this.f55938a.cancel();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        /* JADX INFO: renamed from: clone */
        public Submit<T> mo80715clone() {
            return this.f55938a.mo80715clone();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void enqueue(Callback<T> callback) {
            this.f55938a.enqueue(callback);
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Response<T> execute() throws IOException {
            return this.f55938a.execute();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public RequestFinishedInfo getRequestFinishedInfo() {
            return this.f55938a.getRequestFinishedInfo();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isCanceled() {
            return this.f55938a.isCanceled();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isExecuted() {
            return this.f55938a.isExecuted();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Request request() throws IOException {
            return this.f55938a.request();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$i */
    public static final class i extends WebSocket {

        /* JADX INFO: renamed from: a */
        public final WebSocket f55939a;

        public i(WebSocket webSocket) {
            CheckParamUtils.checkNotNull(webSocket, "SafeWebSocket webSocket == null");
            this.f55939a = webSocket;
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public void cancel() {
            this.f55939a.cancel();
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean close(int i, String str) {
            return this.f55939a.close(i, str);
        }

        public WebSocket getWebSocket() {
            return this.f55939a;
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public long queueSize() {
            return this.f55939a.queueSize();
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public Request request() {
            return this.f55939a.request();
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean send(String str) {
            return this.f55939a.send(str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean send(byte[] bArr) {
            return this.f55939a.send(bArr);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$j */
    public static class j extends WebSocketListener {

        /* JADX INFO: renamed from: a */
        public final WebSocketListener f55940a;

        public j(WebSocketListener webSocketListener) {
            CheckParamUtils.checkNotNull(webSocketListener, "SafeWebSocketListener listener == null");
            this.f55940a = webSocketListener;
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            this.f55940a.onClosed(webSocket, i, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            this.f55940a.onClosing(webSocket, i, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response<ResponseBody> response) {
            this.f55940a.onFailure(webSocket, th, response);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            this.f55940a.onMessage(webSocket, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onOpen(WebSocket webSocket, Response<ResponseBody> response) {
            this.f55940a.onOpen(webSocket, response);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onMessage(WebSocket webSocket, byte[] bArr) {
            this.f55940a.onMessage(webSocket, bArr);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q3$k */
    public static class k extends ExtLogger {

        /* JADX INFO: renamed from: a */
        public final WrapperLogger f55941a;

        public k(WrapperLogger wrapperLogger) {
            CheckParamUtils.checkNotNull(wrapperLogger, "SafeWrapperLogger wrapperLogger == null");
            this.f55941a = wrapperLogger;
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: d */
        public void mo76951d(String str, String str2) {
            this.f55941a.d(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: e */
        public void mo76952e(String str, String str2) {
            this.f55941a.e(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: i */
        public void mo76954i(String str, String str2) {
            this.f55941a.i(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: v */
        public void mo76955v(String str, String str2) {
            this.f55941a.v(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: w */
        public void mo76956w(String str, String str2) {
            this.f55941a.w(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: e */
        public void mo76953e(String str, String str2, Throwable th) {
            this.f55941a.e(str, str2, th);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        /* JADX INFO: renamed from: w */
        public void mo76957w(String str, String str2, Throwable th) {
            this.f55941a.w(str, str2, th);
        }
    }

    public static boolean apiAvailable(int i2) {
        Logger.m76965v(f55929a, "Version.getApi = " + Version.getApi());
        return i2 <= Version.getApi();
    }
}
