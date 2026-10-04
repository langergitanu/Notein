package com.huawei.cloud.base.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class HttpRequestFactory {
    private final HttpRequestInitializer initializer;
    private final HttpTransport transport;

    public HttpRequestFactory(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.transport = httpTransport;
        this.initializer = httpRequestInitializer;
    }

    public HttpRequest buildDeleteRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("DELETE", genericUrl, null);
    }

    public HttpRequest buildGetRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("GET", genericUrl, null);
    }

    public HttpRequest buildHeadRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("HEAD", genericUrl, null);
    }

    public HttpRequest buildPatchRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("PATCH", genericUrl, httpContent);
    }

    public HttpRequest buildPostRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("POST", genericUrl, httpContent);
    }

    public HttpRequest buildPutRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("PUT", genericUrl, httpContent);
    }

    public HttpRequest buildRequest(String str, GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        HttpRequest httpRequestBuildRequest = this.transport.buildRequest();
        HttpRequestInitializer httpRequestInitializer = this.initializer;
        if (httpRequestInitializer != null) {
            httpRequestInitializer.initialize(httpRequestBuildRequest);
        }
        httpRequestBuildRequest.setRequestMethod(str);
        if (genericUrl != null) {
            httpRequestBuildRequest.setUrl(genericUrl);
        }
        if (httpContent != null) {
            httpRequestBuildRequest.setContent(httpContent);
        }
        return httpRequestBuildRequest;
    }

    public HttpRequestInitializer getInitializer() {
        return this.initializer;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }
}
