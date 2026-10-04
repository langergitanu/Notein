package com.google.api.client.http.apache.p562v2;

import com.google.api.client.http.HttpTransport;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

/* JADX INFO: loaded from: classes7.dex */
public final class ApacheHttpTransport extends HttpTransport {
    private final HttpClient httpClient;
    private final boolean isMtls;

    public ApacheHttpTransport() {
        this(newDefaultHttpClient(), false);
    }

    public static HttpClient newDefaultHttpClient() {
        return newDefaultHttpClientBuilder().build();
    }

    public static HttpClientBuilder newDefaultHttpClientBuilder() {
        return HttpClientBuilder.create().useSystemProperties().setSSLSocketFactory(SSLConnectionSocketFactory.getSocketFactory()).setMaxConnTotal(200).setMaxConnPerRoute(20).setConnectionTimeToLive(-1L, TimeUnit.MILLISECONDS).setRoutePlanner(new SystemDefaultRoutePlanner(ProxySelector.getDefault())).disableRedirectHandling().disableAutomaticRetries();
    }

    public HttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.isMtls;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() throws IOException {
        CloseableHttpClient closeableHttpClient = this.httpClient;
        if (closeableHttpClient instanceof CloseableHttpClient) {
            closeableHttpClient.close();
        }
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.isMtls = false;
    }

    @Override // com.google.api.client.http.HttpTransport
    public ApacheHttpRequest buildRequest(String str, String str2) {
        return new ApacheHttpRequest(this.httpClient, str.equals("DELETE") ? new HttpDelete(str2) : str.equals("GET") ? new HttpGet(str2) : str.equals("HEAD") ? new HttpHead(str2) : str.equals("PATCH") ? new HttpPatch(str2) : str.equals("POST") ? new HttpPost(str2) : str.equals("PUT") ? new HttpPut(str2) : str.equals("TRACE") ? new HttpTrace(str2) : str.equals("OPTIONS") ? new HttpOptions(str2) : new HttpExtensionMethod(str, str2));
    }

    public ApacheHttpTransport(HttpClient httpClient, boolean z) {
        this.httpClient = httpClient;
        this.isMtls = z;
    }
}
