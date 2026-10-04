package com.google.android.datatransport.runtime;

import android.os.Bundle;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.SendRequest;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_SendRequest extends SendRequest {
    private final Encoding encoding;
    private final Event<?> event;
    private final Transformer<?, byte[]> transformer;
    private final TransportContext transportContext;
    private final String transportName;

    public static final class Builder extends SendRequest.Builder {
        private Encoding encoding;
        private Event<?> event;
        private Transformer<?, byte[]> transformer;
        private TransportContext transportContext;
        private String transportName;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest build() {
            String str = this.transportContext == null ? " transportContext" : "";
            String str2 = str;
            if (this.transportName == null) {
                str2 = Bundle.getInt(str);
            }
            String str3 = str2;
            if (this.event == null) {
                str3 = Bundle.getInt(str2);
            }
            String str4 = str3;
            if (this.transformer == null) {
                str4 = Bundle.getInt(str3);
            }
            String str5 = str4;
            if (this.encoding == null) {
                str5 = Bundle.getInt(str4);
            }
            if (str5.isEmpty()) {
                return new AutoValue_SendRequest(this.transportContext, this.transportName, this.event, this.transformer, this.encoding);
            }
            throw new IllegalStateException("Missing required properties:".concat(str5));
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEncoding(Encoding encoding) {
            if (encoding == null) {
                throw new NullPointerException("Null encoding");
            }
            this.encoding = encoding;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setEvent(Event<?> event) {
            if (event == null) {
                throw new NullPointerException("Null event");
            }
            this.event = event;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransformer(Transformer<?, byte[]> transformer) {
            if (transformer == null) {
                throw new NullPointerException("Null transformer");
            }
            this.transformer = transformer;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.transportContext = transportContext;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public SendRequest.Builder setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.transportName = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SendRequest) {
            SendRequest sendRequest = (SendRequest) obj;
            if (this.transportContext.equals(sendRequest.getTransportContext()) && this.transportName.equals(sendRequest.getTransportName()) && this.event.equals(sendRequest.getEvent()) && this.transformer.equals(sendRequest.getTransformer()) && this.encoding.equals(sendRequest.getEncoding())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Encoding getEncoding() {
        return this.encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Event<?> getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public Transformer<?, byte[]> getTransformer() {
        return this.transformer;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        return ((((((((this.transportContext.hashCode() ^ 1000003) * 1000003) ^ this.transportName.hashCode()) * 1000003) ^ this.event.hashCode()) * 1000003) ^ this.transformer.hashCode()) * 1000003) ^ this.encoding.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.transportContext + ", transportName=" + this.transportName + ", event=" + this.event + ", transformer=" + this.transformer + ", encoding=" + this.encoding + "}";
    }

    private AutoValue_SendRequest(TransportContext transportContext, String str, Event<?> event, Transformer<?, byte[]> transformer, Encoding encoding) {
        this.transportContext = transportContext;
        this.transportName = str;
        this.event = event;
        this.transformer = transformer;
        this.encoding = encoding;
    }
}
