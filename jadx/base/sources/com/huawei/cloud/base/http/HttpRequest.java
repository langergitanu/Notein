package com.huawei.cloud.base.http;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.words.ControlChar;
import com.huawei.cloud.base.util.IOUtils;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.LoggingStreamingContent;
import com.huawei.cloud.base.util.ObjectParser;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.StreamingContent;
import com.huawei.cloud.base.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 3;
    public static final long DEFAULT_PROGRESS_STEP_SIZE = 5242880;
    public static final String USER_AGENT_SUFFIX = "Huawei-Drive-API";
    private HttpContent content;
    private LowLevelHttpRequest currentLowLevelHttpRequest;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private HttpRequestInitializer initializer;
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private ProgressListener progressListener;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private boolean isCancel = false;
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 3;
    private int contentLoggingLimit = 16384;
    private int connectTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int readTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private boolean followRedirects = true;
    private boolean throwExceptionOnExecuteError = true;

    public interface ProgressListener {
        void onErrorCallback() throws IOException;

        void onProgress(long j);
    }

    public HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    private void dealHeaders(HttpHeaders httpHeaders, StringBuilder sb, Logger logger, LowLevelHttpRequest lowLevelHttpRequest) throws IOException {
        String userAgent = httpHeaders.getUserAgent();
        httpHeaders.setUserAgent(userAgent == null ? USER_AGENT_SUFFIX : userAgent.concat(" Huawei-Drive-API"));
        HttpHeaders.serializeHeaders(httpHeaders, sb, logger, lowLevelHttpRequest);
        if (httpHeaders.get("x-hw-trace-id") != null) {
            sb.append(" -H '");
            sb.append(httpHeaders.get("x-hw-trace-id"));
            sb.append("'");
        }
        httpHeaders.setUserAgent(userAgent);
    }

    private void dealStream(StreamingContent streamingContent, boolean z, LowLevelHttpRequest lowLevelHttpRequest) throws IOException {
        String name;
        long jComputeLength;
        if (streamingContent != null) {
            String type = this.content.getType();
            StreamingContent loggingStreamingContent = new LoggingStreamingContent(streamingContent, HttpTransport.LOGGER, this.contentLoggingLimit);
            HttpEncoding httpEncoding = this.encoding;
            if (httpEncoding == null) {
                jComputeLength = this.content.getLength();
                name = null;
            } else {
                name = httpEncoding.getName();
                HttpEncodingStreamingContent httpEncodingStreamingContent = new HttpEncodingStreamingContent(loggingStreamingContent, this.encoding);
                loggingStreamingContent = httpEncodingStreamingContent;
                jComputeLength = z ? IOUtils.computeLength(httpEncodingStreamingContent) : -1L;
            }
            lowLevelHttpRequest.setContentType(type);
            lowLevelHttpRequest.setContentEncoding(name);
            lowLevelHttpRequest.setContentLength(jComputeLength);
            lowLevelHttpRequest.setStreamingContent(loggingStreamingContent);
        }
    }

    private HttpResponse executeCurrentRequest(LowLevelHttpRequest lowLevelHttpRequest) throws IOException {
        LowLevelHttpResponse lowLevelHttpResponseExecute = lowLevelHttpRequest.execute();
        try {
            return new HttpResponse(this, lowLevelHttpResponseExecute);
        } catch (Throwable th) {
            InputStream content = lowLevelHttpResponseExecute.getContent();
            if (content != null) {
                content.close();
            }
            throw th;
        }
    }

    private boolean handleResponse(HttpResponse httpResponse, boolean z) throws IOException {
        if (httpResponse != null) {
            try {
                if (!httpResponse.isSuccessStatusCode()) {
                    HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.unsuccessfulResponseHandler;
                    boolean zHandleResponse = httpUnsuccessfulResponseHandler != null ? httpUnsuccessfulResponseHandler.handleResponse(this, httpResponse, z) : false;
                    if (zHandleResponse || !handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders())) {
                        z = zHandleResponse;
                    }
                    boolean z2 = z & z;
                    if (!z2) {
                        return z2;
                    }
                    httpResponse.ignore();
                    return z2;
                }
            } catch (Throwable th) {
                httpResponse.disconnect();
                throw th;
            }
        }
        return z & (httpResponse == null);
    }

    private HttpResponse interceptResponse(HttpResponse httpResponse, IOException iOException) throws IOException {
        if (httpResponse == null) {
            throw iOException;
        }
        HttpResponseInterceptor httpResponseInterceptor = this.responseInterceptor;
        if (httpResponseInterceptor != null) {
            httpResponseInterceptor.interceptResponse(httpResponse);
        }
        if (!this.throwExceptionOnExecuteError || httpResponse.isSuccessStatusCode()) {
            return httpResponse;
        }
        try {
            throw new HttpResponseException(httpResponse);
        } catch (Throwable th) {
            httpResponse.disconnect();
            throw th;
        }
    }

    public void cancel() {
        this.isCancel = true;
        LowLevelHttpRequest lowLevelHttpRequest = this.currentLowLevelHttpRequest;
        if (lowLevelHttpRequest != null) {
            lowLevelHttpRequest.cancel();
        }
    }

    public HttpResponse execute() throws IOException {
        HttpResponse httpResponseExecuteCurrentRequest;
        Preconditions.checkArgument(this.numRetries >= 0);
        int i = this.numRetries;
        Preconditions.checkNotNull(this.requestMethod);
        Preconditions.checkNotNull(this.url);
        HttpResponse httpResponse = null;
        while (true) {
            if (httpResponse != null) {
                httpResponse.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = this.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(this);
            }
            String strBuild = this.url.build();
            LowLevelHttpRequest lowLevelHttpRequestBuildRequest = this.transport.buildRequest(this.requestMethod, strBuild);
            this.currentLowLevelHttpRequest = lowLevelHttpRequestBuildRequest;
            lowLevelHttpRequestBuildRequest.setInitializer(this.initializer);
            this.currentLowLevelHttpRequest.setProgressListener(this.progressListener);
            Logger logger = HttpTransport.LOGGER;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("curl");
            sb.append("-------------- REQUEST  --------------");
            String str = StringUtils.LINE_SEPARATOR;
            sb.append(str);
            sb.append(this.requestMethod);
            sb.append(ControlChar.SPACE_CHAR);
            sb.append(strBuild);
            sb.append(str);
            if (!this.requestMethod.equals("GET")) {
                sb2.append(" -X ");
                sb2.append(this.requestMethod);
            }
            HttpContent httpContent = this.content;
            boolean z = httpContent == null || httpContent.retrySupported();
            dealHeaders(this.headers, sb, logger, this.currentLowLevelHttpRequest);
            dealStream(this.content, z, this.currentLowLevelHttpRequest);
            logger.m75689d(sb.toString(), true);
            sb2.append(" -- '");
            sb2.append(this.url.toURL().getAuthority());
            sb2.append(this.url.toURL().getPath());
            sb2.append("'");
            if (this.headers.get("x-hw-trace-id") != null) {
                sb2.append(" -H '");
                sb2.append(this.headers.get("x-hw-trace-id"));
                sb2.append("'");
            }
            sb2.append(" << $$$");
            logger.m75691i(sb2.toString());
            boolean z2 = z && i > 0;
            this.currentLowLevelHttpRequest.setTimeout(this.connectTimeout, this.readTimeout);
            if (Thread.interrupted()) {
                throw new InterruptedIOException("Thread has been interrupted.");
            }
            try {
                httpResponseExecuteCurrentRequest = executeCurrentRequest(this.currentLowLevelHttpRequest);
                e = null;
            } catch (IOException e) {
                e = e;
                if (this.isCancel) {
                    throw e;
                }
                if ((e instanceof InterruptedIOException) && !(e instanceof SocketTimeoutException)) {
                    throw e;
                }
                HttpIOExceptionHandler httpIOExceptionHandler = this.ioExceptionHandler;
                if (httpIOExceptionHandler == null || !httpIOExceptionHandler.handleIOException(this, z2)) {
                    throw e;
                }
                logger.m75693w("exception thrown while executing request:" + e.getMessage());
                httpResponseExecuteCurrentRequest = null;
            }
            i--;
            if (!handleResponse(httpResponseExecuteCurrentRequest, z2)) {
                return interceptResponse(httpResponseExecuteCurrentRequest, e);
            }
            httpResponse = httpResponseExecuteCurrentRequest;
        }
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public ProgressListener getProgressListener() {
        return this.progressListener;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (!getFollowRedirects() || !HttpStatusCodes.isRedirect(i) || location == null) {
            return false;
        }
        setUrl(new GenericUrl(this.url.toURL(location)));
        if (i == 303) {
            setRequestMethod("GET");
            setContent(null);
        }
        this.headers.setAuthorization((String) null);
        this.headers.setIfMatch(null);
        this.headers.setIfNoneMatch(null);
        this.headers.setIfModifiedSince(null);
        this.headers.setIfUnmodifiedSince(null);
        this.headers.setIfRange(null);
        return true;
    }

    public HttpRequest setConnectTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.connectTimeout = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        Preconditions.checkArgument(i >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public void setInitializer(HttpRequestInitializer httpRequestInitializer) {
        this.initializer = httpRequestInitializer;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i) {
        Preconditions.checkArgument(i >= 0);
        this.numRetries = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    public HttpRequest setReadTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.readTimeout = i;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.throwExceptionOnExecuteError = z;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }
}
