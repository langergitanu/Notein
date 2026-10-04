package com.huawei.cloud.base.services;

import com.huawei.cloud.base.batch.BatchRequest;
import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpRequestFactory;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.util.ObjectParser;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.StringUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractClient {
    private String applicationName;
    private BaseRequestInitializer baseRequestInitializer;
    private final String batchPath;
    private ObjectParser objectParser;
    private HttpRequestFactory requestFactory;
    private String rootUrl;
    private String servicePath;
    private final boolean suppressRequiredParameterChecks;

    public static abstract class Builder {
        private String applicationName;
        private BaseRequestInitializer baseRequestInitializer;
        private String batchPath;
        private HttpRequestInitializer httpRequestInitializer;
        private boolean ignoreRequiredParameterVerify;
        private ObjectParser objectParser;
        private String rootUrl;
        private String servicePath;
        private HttpTransport transport;

        public Builder(HttpTransport httpTransport, String str, String str2, ObjectParser objectParser, HttpRequestInitializer httpRequestInitializer) {
            this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            this.objectParser = objectParser;
            setRootUrl(str);
            setServicePath(str2);
            this.httpRequestInitializer = httpRequestInitializer;
        }

        public abstract AbstractClient build();

        public final String getApplicationName() {
            return this.applicationName;
        }

        public final BaseRequestInitializer getGoogleClientRequestInitializer() {
            return this.baseRequestInitializer;
        }

        public final HttpRequestInitializer getHttpRequestInitializer() {
            return this.httpRequestInitializer;
        }

        public final boolean getIgnoreRequiredParameterVerify() {
            return this.ignoreRequiredParameterVerify;
        }

        public ObjectParser getObjectParser() {
            return this.objectParser;
        }

        public final String getRootUrl() {
            return this.rootUrl;
        }

        public final String getServicePath() {
            return this.servicePath;
        }

        public final HttpTransport getTransport() {
            return this.transport;
        }

        public Builder setApplicationName(String str) {
            this.applicationName = str;
            return this;
        }

        public Builder setBaseRequestInitializer(BaseRequestInitializer baseRequestInitializer) {
            this.baseRequestInitializer = baseRequestInitializer;
            return this;
        }

        public Builder setBatchPath(String str) {
            this.batchPath = str;
            return this;
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.httpRequestInitializer = httpRequestInitializer;
            return this;
        }

        public Builder setIgnoreRequiredParameterVerify(boolean z) {
            this.ignoreRequiredParameterVerify = z;
            return this;
        }

        public Builder setRootUrl(String str) {
            this.rootUrl = AbstractClient.normalizeRootUrl(str);
            return this;
        }

        public Builder setServicePath(String str) {
            this.servicePath = AbstractClient.normalizeServicePath(str);
            return this;
        }

        public Builder setSuppressAllChecks(boolean z) {
            return setIgnoreRequiredParameterVerify(z);
        }
    }

    public AbstractClient(Builder builder) {
        this.baseRequestInitializer = builder.baseRequestInitializer;
        this.rootUrl = normalizeRootUrl(builder.rootUrl);
        this.servicePath = normalizeServicePath(builder.servicePath);
        this.batchPath = builder.batchPath;
        this.requestFactory = builder.httpRequestInitializer == null ? builder.transport.createRequestFactory() : builder.transport.createRequestFactory(builder.httpRequestInitializer);
        this.objectParser = builder.objectParser;
        this.suppressRequiredParameterChecks = builder.ignoreRequiredParameterVerify;
        this.applicationName = builder.applicationName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeRootUrl(String str) {
        Preconditions.checkNotNull(str, "root URL cannot be null.");
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeServicePath(String str) {
        Preconditions.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            Preconditions.checkArgument("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        }
        if (str.length() <= 0) {
            return str;
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }

    public final BatchRequest batch() {
        BatchRequest batchRequest = new BatchRequest(getRequestFactory().getTransport(), getRequestFactory().getInitializer());
        if (StringUtils.isNullOrEmpty(this.batchPath)) {
            batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + "batch"));
            return batchRequest;
        }
        batchRequest.setBatchUrl(new GenericUrl(getRootUrl() + this.batchPath));
        return batchRequest;
    }

    public final String getApplicationName() {
        return this.applicationName;
    }

    public final BaseRequestInitializer getBaseRequestInitializer() {
        return this.baseRequestInitializer;
    }

    public final String getBaseUrl() {
        return this.rootUrl + this.servicePath;
    }

    public ObjectParser getObjectParser() {
        return this.objectParser;
    }

    public final HttpRequestFactory getRequestFactory() {
        return this.requestFactory;
    }

    public final String getRootUrl() {
        return this.rootUrl;
    }

    public final String getServicePath() {
        return this.servicePath;
    }

    public final boolean getSuppressRequiredParameterChecks() {
        return this.suppressRequiredParameterChecks;
    }

    public void initialize(AbstractClientRequest<?> abstractClientRequest) throws IOException {
        if (getBaseRequestInitializer() != null) {
            getBaseRequestInitializer().initialize(abstractClientRequest);
        }
    }
}
