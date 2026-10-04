package com.alipay.android.phone.mrpc.core;

import android.net.SSLCertificateSocketFactory;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.slides.C22218Oooo;
import com.google.common.net.HttpHeaders;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0150b implements HttpClient {

    /* JADX INFO: renamed from: a */
    public static long f48a = 160;

    /* JADX INFO: renamed from: b */
    public static String[] f49b = {"text/", "application/xml", "application/json"};

    /* JADX INFO: renamed from: c */
    public static final HttpRequestInterceptor f50c = new C0151c();

    /* JADX INFO: renamed from: d */
    public final HttpClient f51d;

    /* JADX INFO: renamed from: e */
    public RuntimeException f52e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* JADX INFO: renamed from: f */
    public volatile b f53f;

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$a */
    public class a implements HttpRequestInterceptor {
        public a() {
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            b bVar = C0150b.this.f53f;
            if (bVar != null && b.m63a(bVar) && (httpRequest instanceof HttpUriRequest)) {
                b.m62a(bVar, C0150b.m54a((HttpUriRequest) httpRequest));
            }
        }

        public /* synthetic */ a(C0150b c0150b, byte b) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f55a;

        /* JADX INFO: renamed from: b */
        public final int f56b;

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m62a(b bVar, String str) {
            Log.println(bVar.f56b, bVar.f55a, str);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m63a(b bVar) {
            return Log.isLoggable(bVar.f55a, bVar.f56b);
        }
    }

    public C0150b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f51d = new C0152d(this, clientConnectionManager, httpParams);
    }

    /* JADX INFO: renamed from: b */
    public static long m58b(String str) {
        return C0159k.m71a(str);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f51d.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.f51d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.f51d.getParams();
    }

    /* JADX INFO: renamed from: a */
    public static C0150b m52a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        HttpConnectionParams.setSoTimeout(basicHttpParams, SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(AuthenticationConstants.HTTPS_PROTOCOL_STRING, SSLCertificateSocketFactory.getHttpSocketFactory(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS, null), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new C0150b(threadSafeClientConnManager, basicHttpParams);
    }

    /* JADX INFO: renamed from: b */
    public static void m59b(HttpRequest httpRequest) {
        httpRequest.addHeader(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f51d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    /* JADX INFO: renamed from: a */
    public static InputStream m53a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m60b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f49b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f51d.execute(httpUriRequest, responseHandler);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m54a(HttpUriRequest httpUriRequest) throws IOException {
        HttpEntity entity;
        String str;
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (!header.getName().equals("Authorization") && !header.getName().equals(HttpHeaders.COOKIE)) {
                sbOooO0OO.append("--header \"");
                sbOooO0OO.append(header.toString().trim());
                sbOooO0OO.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sbOooO0OO.append("\"");
        sbOooO0OO.append(uri);
        sbOooO0OO.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (m60b(httpUriRequest)) {
                    sbOooO0OO.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String string = byteArrayOutputStream.toString();
                    sbOooO0OO.append(" --data-ascii \"");
                    sbOooO0OO.append(string);
                    sbOooO0OO.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sbOooO0OO.append(str);
        }
        return sbOooO0OO.toString();
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f51d.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f51d.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f51d.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f51d.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f51d.execute(httpUriRequest, httpContext);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractHttpEntity m56a(byte[] bArr) throws IOException {
        if (bArr.length < f48a) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    /* JADX INFO: renamed from: a */
    public static void m57a(HttpRequest httpRequest) {
        httpRequest.addHeader(HttpHeaders.ACCEPT_ENCODING, "gzip");
    }

    /* JADX INFO: renamed from: a */
    public final void m61a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f51d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }
}
