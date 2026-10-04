package com.huawei.cloud.base.services.json;

import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.json.JsonFactory;
import com.huawei.cloud.base.json.JsonObjectParser;
import com.huawei.cloud.base.services.AbstractClient;
import com.huawei.cloud.base.services.BaseRequestInitializer;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractJsonClient extends AbstractClient {

    public static abstract class Builder extends AbstractClient.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory, String str, String str2, HttpRequestInitializer httpRequestInitializer) {
            super(httpTransport, str, str2, new JsonObjectParser.Builder(jsonFactory).setWrapperKeys(Collections.EMPTY_SET).build(), httpRequestInitializer);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public abstract AbstractJsonClient build();

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public final JsonObjectParser getObjectParser() {
            return (JsonObjectParser) super.getObjectParser();
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setApplicationName(String str) {
            return (Builder) super.setApplicationName(str);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setBaseRequestInitializer(BaseRequestInitializer baseRequestInitializer) {
            return (Builder) super.setBaseRequestInitializer(baseRequestInitializer);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setBatchPath(String str) {
            return (Builder) super.setBatchPath(str);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setIgnoreRequiredParameterVerify(boolean z) {
            return (Builder) super.setIgnoreRequiredParameterVerify(z);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setRootUrl(String str) {
            return (Builder) super.setRootUrl(str);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setServicePath(String str) {
            return (Builder) super.setServicePath(str);
        }

        @Override // com.huawei.cloud.base.services.AbstractClient.Builder
        public Builder setSuppressAllChecks(boolean z) {
            return (Builder) super.setSuppressAllChecks(z);
        }
    }

    public AbstractJsonClient(Builder builder) {
        super(builder);
    }

    public final JsonFactory getJsonFactory() {
        return getObjectParser().getJsonFactory();
    }

    @Override // com.huawei.cloud.base.services.AbstractClient
    public JsonObjectParser getObjectParser() {
        return (JsonObjectParser) super.getObjectParser();
    }
}
