package com.huawei.cloud.base;

import com.huawei.cloud.base.http.EmptyContent;
import com.huawei.cloud.base.http.HttpExecuteInterceptor;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.UrlEncodedContent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class MethodOverride implements HttpExecuteInterceptor, HttpRequestInitializer {
    public static final String HEADER = "X-HTTP-Method-Override";
    static final int MAX_URL_LENGTH = 2048;
    private final boolean overrideAllMethods;

    public static final class Builder {
        private boolean overrideAllMethods;

        public MethodOverride build() {
            return new MethodOverride(this.overrideAllMethods);
        }

        public boolean getOverrideAllMethods() {
            return this.overrideAllMethods;
        }

        public Builder setOverrideAllMethods(boolean z) {
            this.overrideAllMethods = z;
            return this;
        }
    }

    public MethodOverride() {
        this(false);
    }

    private boolean overrideThisMethod(HttpRequest httpRequest) throws IOException {
        String requestMethod = httpRequest.getRequestMethod();
        if (requestMethod.equals("POST")) {
            return false;
        }
        if (!requestMethod.equals("GET") ? this.overrideAllMethods : httpRequest.getUrl().build().length() > 2048) {
            return !httpRequest.getTransport().supportsMethod(requestMethod);
        }
        return true;
    }

    @Override // com.huawei.cloud.base.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
    }

    @Override // com.huawei.cloud.base.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        if (overrideThisMethod(httpRequest)) {
            String requestMethod = httpRequest.getRequestMethod();
            httpRequest.setRequestMethod("POST");
            httpRequest.getHeaders().set("X-HTTP-Method-Override", (Object) requestMethod);
            if (requestMethod.equals("GET")) {
                httpRequest.setContent(new UrlEncodedContent(httpRequest.getUrl().clone()));
                httpRequest.getUrl().clear();
            } else if (httpRequest.getContent() == null) {
                httpRequest.setContent(new EmptyContent());
            }
        }
    }

    public MethodOverride(boolean z) {
        this.overrideAllMethods = z;
    }
}
