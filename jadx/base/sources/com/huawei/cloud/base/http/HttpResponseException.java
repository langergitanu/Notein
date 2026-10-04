package com.huawei.cloud.base.http;

import com.aspose.words.ControlChar;
import com.huawei.cloud.base.http.model.ErrorResponse;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.StringUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes8.dex */
public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    private final String content;
    private final ErrorResponse error;
    private final transient HttpHeaders headers;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(HttpResponse httpResponse) {
        this(new Builder(httpResponse));
    }

    public static StringBuilder computeMessageBuffer(HttpResponse httpResponse) {
        StringBuilder sb = new StringBuilder();
        int statusCode = httpResponse.getStatusCode();
        if (statusCode != 0) {
            sb.append(statusCode);
        }
        String statusMessage = httpResponse.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode != 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(statusMessage);
        }
        return sb;
    }

    public final String getContent() {
        return this.content;
    }

    public final ErrorResponse getError() {
        return this.error;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final boolean isSuccessStatusCode() {
        return HttpStatusCodes.isSuccess(this.statusCode);
    }

    public HttpResponseException(Builder builder) {
        super(builder.message);
        this.statusCode = builder.statusCode;
        this.statusMessage = builder.statusMessage;
        this.headers = builder.headers;
        this.content = builder.content;
        this.error = builder.error;
    }

    public static class Builder {
        String content;
        ErrorResponse error;
        HttpHeaders headers;
        String message;
        int statusCode;
        String statusMessage;

        public Builder(int i, String str, HttpHeaders httpHeaders) {
            setStatusCode(i);
            setStatusMessage(str);
            setHeaders(httpHeaders);
        }

        public HttpResponseException build() {
            return new HttpResponseException(this);
        }

        public final String getContent() {
            return this.content;
        }

        public ErrorResponse getError() {
            return this.error;
        }

        public HttpHeaders getHeaders() {
            return this.headers;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final String getStatusMessage() {
            return this.statusMessage;
        }

        public Builder setContent(String str) {
            this.content = str;
            return this;
        }

        public Builder setError(ErrorResponse errorResponse) {
            this.error = errorResponse;
            return this;
        }

        public Builder setHeaders(HttpHeaders httpHeaders) {
            this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
            return this;
        }

        public Builder setMessage(String str) {
            this.message = str;
            return this;
        }

        public Builder setStatusCode(int i) {
            Preconditions.checkArgument(i >= 0);
            this.statusCode = i;
            return this;
        }

        public Builder setStatusMessage(String str) {
            this.statusMessage = str;
            return this;
        }

        public Builder(HttpResponse httpResponse) {
            this(httpResponse.getStatusCode(), httpResponse.getStatusMessage(), httpResponse.getHeaders());
            try {
                this.content = httpResponse.parseAsString();
                this.error = (ErrorResponse) httpResponse.getRequest().getParser().parseAndClose((Reader) new StringReader(this.content), ErrorResponse.class);
            } catch (IOException e) {
                Logger.getLogger("HttpResponseException").m75690e(e.toString());
            } catch (IllegalArgumentException unused) {
                Logger.getLogger("HttpResponseException").m75690e(this.content);
            }
            StringBuilder sbComputeMessageBuffer = HttpResponseException.computeMessageBuffer(httpResponse);
            if (this.content != null) {
                sbComputeMessageBuffer.append(StringUtils.LINE_SEPARATOR);
                sbComputeMessageBuffer.append(this.content);
            }
            this.message = sbComputeMessageBuffer.toString();
        }
    }
}
