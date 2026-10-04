package com.microsoft.identity.common.java.net;

import com.microsoft.identity.common.java.net.HttpClient;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractHttpClient implements HttpClient {
    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse delete(URL url, Map<String, String> map, byte[] bArr) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.DELETE, url, map, bArr);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse get(URL url, Map<String, String> map) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.GET, url, map, (byte[]) null);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse head(URL url, Map<String, String> map) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.HEAD, url, map, (byte[]) null);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public abstract HttpResponse method(HttpClient.HttpMethod httpMethod, URL url, Map<String, String> map, byte[] bArr) throws IOException;

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse method(String str, URL url, Map<String, String> map, byte[] bArr) throws IOException {
        if (str == null) {
            throw new NullPointerException("httpMethod is marked non-null but is null");
        }
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.validateAndNormalizeMethod(str), url, map, bArr);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse options(URL url, Map<String, String> map) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.OPTIONS, url, map, (byte[]) null);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse patch(URL url, Map<String, String> map, byte[] bArr) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.PATCH, url, map, bArr);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse post(URL url, Map<String, String> map, byte[] bArr) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.POST, url, map, bArr);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse put(URL url, Map<String, String> map, byte[] bArr) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.PUT, url, map, bArr);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.net.HttpClient
    public HttpResponse trace(URL url, Map<String, String> map) throws IOException {
        if (url == null) {
            throw new NullPointerException("requestUrl is marked non-null but is null");
        }
        if (map != null) {
            return method(HttpClient.HttpMethod.TRACE, url, map, (byte[]) null);
        }
        throw new NullPointerException("requestHeaders is marked non-null but is null");
    }
}
