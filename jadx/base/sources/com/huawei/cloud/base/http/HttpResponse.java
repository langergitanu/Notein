package com.huawei.cloud.base.http;

import com.aspose.slides.C22218Oooo;
import com.aspose.words.ControlChar;
import com.huawei.cloud.base.util.Charsets;
import com.huawei.cloud.base.util.IOUtils;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.LoggingInputStream;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class HttpResponse {
    private InputStream content;
    private final String contentEncoding;
    private int contentLoggingLimit;
    private boolean contentRead;
    private final String contentType;
    private final HttpMediaType mediaType;
    private final HttpRequest request;
    LowLevelHttpResponse response;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponse(HttpRequest httpRequest, LowLevelHttpResponse lowLevelHttpResponse) throws IOException {
        this.request = httpRequest;
        this.contentLoggingLimit = httpRequest.getContentLoggingLimit();
        this.response = lowLevelHttpResponse;
        this.contentEncoding = lowLevelHttpResponse.getContentEncoding();
        int statusCode = lowLevelHttpResponse.getStatusCode();
        statusCode = statusCode < 0 ? 0 : statusCode;
        this.statusCode = statusCode;
        String reasonPhrase = lowLevelHttpResponse.getReasonPhrase();
        this.statusMessage = reasonPhrase;
        Logger logger = HttpTransport.LOGGER;
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("-------------- RESPONSE --------------");
        String str = StringUtils.LINE_SEPARATOR;
        sbOooO0OO.append(str);
        String statusLine = lowLevelHttpResponse.getStatusLine();
        if (statusLine != null) {
            sbOooO0OO.append(statusLine);
        } else {
            sbOooO0OO.append(statusCode);
            if (reasonPhrase != null) {
                sbOooO0OO.append(ControlChar.SPACE_CHAR);
                sbOooO0OO.append(reasonPhrase);
            }
        }
        sbOooO0OO.append(str);
        httpRequest.getResponseHeaders().fromHttpResponse(lowLevelHttpResponse, sbOooO0OO);
        String contentType = lowLevelHttpResponse.getContentType();
        contentType = contentType == null ? httpRequest.getResponseHeaders().getContentType() : contentType;
        this.contentType = contentType;
        this.mediaType = contentType == null ? null : new HttpMediaType(contentType);
        logger.m75689d(sbOooO0OO.toString(), true);
    }

    private boolean hasMessageBody() throws IOException {
        int statusCode = getStatusCode();
        if (!getRequest().getRequestMethod().equals("HEAD") && statusCode / 100 != 1 && statusCode != 204 && statusCode != 304) {
            return true;
        }
        ignore();
        return false;
    }

    public void disconnect() throws IOException {
        ignore();
        this.response.disconnect();
    }

    public void download(OutputStream outputStream) throws IOException {
        IOUtils.copy(getContent(), outputStream);
    }

    public InputStream getContent() throws Throwable {
        LoggingInputStream loggingInputStream;
        if (!this.contentRead) {
            InputStream content = this.response.getContent();
            if (content != null) {
                Logger logger = HttpTransport.LOGGER;
                try {
                    try {
                        String str = this.contentEncoding;
                        if (str != null && str.contains("gzip")) {
                            content = new GZIPInputStream(content);
                        }
                        loggingInputStream = new LoggingInputStream(content, logger, this.contentLoggingLimit);
                    } catch (EOFException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    this.content = loggingInputStream;
                } catch (EOFException e2) {
                    e = e2;
                    content = loggingInputStream;
                    logger.m75688d(e.toString());
                    content.close();
                } catch (Throwable th2) {
                    th = th2;
                    content = loggingInputStream;
                    content.close();
                    throw th;
                }
            }
            this.contentRead = true;
        }
        return this.content;
    }

    public Charset getContentCharset() {
        HttpMediaType httpMediaType = this.mediaType;
        return (httpMediaType == null || httpMediaType.getCharsetParameter() == null) ? Charsets.UTF_8 : this.mediaType.getCharsetParameter();
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public String getContentType() {
        return this.contentType;
    }

    public HttpHeaders getHeaders() {
        return this.request.getResponseHeaders();
    }

    public HttpMediaType getMediaType() {
        return this.mediaType;
    }

    public HttpRequest getRequest() {
        return this.request;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public HttpTransport getTransport() {
        return this.request.getTransport();
    }

    public void ignore() throws IOException {
        InputStream content = getContent();
        if (content != null) {
            content.close();
        }
    }

    public boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    public <T> T parseAs(Class<T> cls) throws IOException {
        if (hasMessageBody()) {
            return (T) this.request.getParser().parseAndClose(getContent(), getContentCharset(), (Class) cls);
        }
        return null;
    }

    public String parseAsString() throws Throwable {
        InputStream content = getContent();
        if (content == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        IOUtils.copy(content, byteArrayOutputStream);
        return byteArrayOutputStream.toString(getContentCharset().name());
    }

    public HttpResponse setContentLoggingLimit(int i) {
        Preconditions.checkArgument(i >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public Object parseAs(Type type) throws IOException {
        if (hasMessageBody()) {
            return this.request.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
        return null;
    }
}
