package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.q */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0165q implements Callable<C0169u> {

    /* JADX INFO: renamed from: e */
    public static final HttpRequestRetryHandler f94e = new C0149ad();

    /* JADX INFO: renamed from: a */
    public C0160l f95a;

    /* JADX INFO: renamed from: b */
    public Context f96b;

    /* JADX INFO: renamed from: c */
    public C0163o f97c;

    /* JADX INFO: renamed from: d */
    public String f98d;

    /* JADX INFO: renamed from: f */
    public HttpUriRequest f99f;

    /* JADX INFO: renamed from: i */
    public CookieManager f102i;

    /* JADX INFO: renamed from: j */
    public AbstractHttpEntity f103j;

    /* JADX INFO: renamed from: k */
    public HttpHost f104k;

    /* JADX INFO: renamed from: l */
    public URL f105l;

    /* JADX INFO: renamed from: q */
    public String f110q;

    /* JADX INFO: renamed from: g */
    public HttpContext f100g = new BasicHttpContext();

    /* JADX INFO: renamed from: h */
    public CookieStore f101h = new BasicCookieStore();

    /* JADX INFO: renamed from: m */
    public int f106m = 0;

    /* JADX INFO: renamed from: n */
    public boolean f107n = false;

    /* JADX INFO: renamed from: o */
    public boolean f108o = false;

    /* JADX INFO: renamed from: p */
    public String f109p = null;

    public CallableC0165q(C0160l c0160l, C0163o c0163o) {
        this.f95a = c0160l;
        this.f96b = c0160l.f72a;
        this.f97c = c0163o;
    }

    /* JADX INFO: renamed from: a */
    public static long m97a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public static long m102b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split("=");
            if (strArrSplit.length >= 2) {
                try {
                    return m97a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return C0150b.m58b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: c */
    private HttpUriRequest m104c() {
        HttpUriRequest httpUriRequest = this.f99f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f103j == null) {
            byte[] bArrM89b = this.f97c.m89b();
            String strM88b = this.f97c.m88b("gzip");
            if (bArrM89b != null) {
                if (TextUtils.equals(strM88b, TelemetryEventStrings.Value.TRUE)) {
                    this.f103j = C0150b.m56a(bArrM89b);
                } else {
                    this.f103j = new ByteArrayEntity(bArrM89b);
                }
                this.f103j.setContentType(this.f97c.m90c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f103j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(m103b());
            httpPost.setEntity(abstractHttpEntity);
            this.f99f = httpPost;
        } else {
            this.f99f = new HttpGet(m103b());
        }
        return this.f99f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0169u call() throws Throwable {
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.f96b.getSystemService("connectivity")).getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                            ArrayList<Header> arrayListM91d = this.f97c.m91d();
                            if (arrayListM91d != null && !arrayListM91d.isEmpty()) {
                                Iterator<Header> it = arrayListM91d.iterator();
                                while (it.hasNext()) {
                                    m104c().addHeader(it.next());
                                }
                            }
                            C0150b.m57a((HttpRequest) m104c());
                            C0150b.m59b((HttpRequest) m104c());
                            m104c().addHeader("cookie", m110i().getCookie(this.f97c.m82a()));
                            this.f100g.setAttribute("http.cookie-store", this.f101h);
                            this.f95a.m78a().m61a(f94e);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            m107f();
                            this.f99f.getURI().toString();
                            HttpParams params = this.f95a.m78a().getParams();
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f96b.getSystemService("connectivity")).getActiveNetworkInfo();
                            HttpHost httpHost2 = null;
                            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                                httpHost = null;
                            } else {
                                String defaultHost = Proxy.getDefaultHost();
                                int defaultPort = Proxy.getDefaultPort();
                                if (defaultHost != null) {
                                    httpHost = new HttpHost(defaultHost, defaultPort);
                                }
                            }
                            if (httpHost == null || !TextUtils.equals(httpHost.getHostName(), "127.0.0.1") || httpHost.getPort() != 8087) {
                                httpHost2 = httpHost;
                            }
                            params.setParameter("http.route.default-proxy", httpHost2);
                            HttpHost httpHost3 = this.f104k;
                            if (httpHost3 == null) {
                                URL urlM109h = m109h();
                                HttpHost httpHost4 = new HttpHost(urlM109h.getHost(), m108g(), urlM109h.getProtocol());
                                this.f104k = httpHost4;
                                httpHost3 = httpHost4;
                            }
                            if (m108g() == 80) {
                                httpHost3 = new HttpHost(m109h().getHost());
                            }
                            HttpResponse httpResponseExecute = this.f95a.m78a().execute(httpHost3, this.f99f, this.f100g);
                            this.f95a.m80b(System.currentTimeMillis() - jCurrentTimeMillis);
                            List<Cookie> cookies = this.f101h.getCookies();
                            if (this.f97c.m92e()) {
                                m110i().removeAllCookie();
                            }
                            if (!cookies.isEmpty()) {
                                for (Cookie cookie : cookies) {
                                    if (cookie.getDomain() != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(cookie.getName());
                                        sb.append("=");
                                        sb.append(cookie.getValue());
                                        sb.append("; domain=");
                                        sb.append(cookie.getDomain());
                                        sb.append(cookie.isSecure() ? "; Secure" : "");
                                        m110i().setCookie(this.f97c.m82a(), sb.toString());
                                        CookieSyncManager.getInstance().sync();
                                    }
                                }
                            }
                            int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                            String reasonPhrase = httpResponseExecute.getStatusLine().getReasonPhrase();
                            if (statusCode != 200 && statusCode != 304) {
                                throw new HttpException(Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()), httpResponseExecute.getStatusLine().getReasonPhrase());
                            }
                            C0169u c0169uM99a = m99a(httpResponseExecute, statusCode, reasonPhrase);
                            if (((c0169uM99a == null || c0169uM99a.m118b() == null) ? -1L : c0169uM99a.m118b().length) == -1 && (c0169uM99a instanceof C0164p)) {
                                try {
                                    Long.parseLong(((C0164p) c0169uM99a).m93a().getHead("Content-Length"));
                                } catch (Exception unused) {
                                }
                            }
                            if (this.f97c.m82a() != null && !TextUtils.isEmpty(m107f())) {
                                m107f();
                            }
                            return c0169uM99a;
                        }
                    }
                }
                throw new HttpException(1, "The network is not available");
            } catch (HttpException e) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e.getCode();
                    e.getMsg();
                }
                e.toString();
                throw e;
            } catch (NullPointerException e2) {
                m106e();
                int i = this.f106m;
                if (i > 0) {
                    e2.toString();
                    throw new HttpException(0, String.valueOf(e2));
                }
                this.f106m = i + 1;
            } catch (SocketTimeoutException e3) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e3.toString();
                }
                e3.toString();
                throw new HttpException(4, String.valueOf(e3));
            } catch (URISyntaxException e4) {
                throw new RuntimeException("Url parser error!", e4.getCause());
            } catch (UnknownHostException e5) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e5.toString();
                }
                e5.toString();
                throw new HttpException(9, String.valueOf(e5));
            } catch (SSLHandshakeException e6) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e6.toString();
                }
                e6.toString();
                throw new HttpException(2, String.valueOf(e6));
            } catch (SSLPeerUnverifiedException e7) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e7.toString();
                }
                e7.toString();
                throw new HttpException(2, String.valueOf(e7));
            } catch (SSLException e8) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e8.toString();
                }
                e8.toString();
                throw new HttpException(6, String.valueOf(e8));
            } catch (NoHttpResponseException e9) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e9.toString();
                }
                e9.toString();
                throw new HttpException(5, String.valueOf(e9));
            } catch (ConnectionPoolTimeoutException e10) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e10.toString();
                }
                e10.toString();
                throw new HttpException(3, String.valueOf(e10));
            } catch (ConnectTimeoutException e11) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e11.toString();
                }
                e11.toString();
                throw new HttpException(3, String.valueOf(e11));
            } catch (HttpHostConnectException e12) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e12.toString();
                }
                throw new HttpException(8, String.valueOf(e12));
            } catch (IOException e13) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e13.toString();
                }
                e13.toString();
                throw new HttpException(6, String.valueOf(e13));
            } catch (Exception e14) {
                m106e();
                if (this.f97c.m114f() != null) {
                    e14.toString();
                }
                throw new HttpException(0, String.valueOf(e14));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m106e() {
        HttpUriRequest httpUriRequest = this.f99f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    /* JADX INFO: renamed from: f */
    private String m107f() {
        if (!TextUtils.isEmpty(this.f110q)) {
            return this.f110q;
        }
        String strM88b = this.f97c.m88b("operationType");
        this.f110q = strM88b;
        return strM88b;
    }

    /* JADX INFO: renamed from: g */
    private int m108g() {
        URL urlM109h = m109h();
        return urlM109h.getPort() == -1 ? urlM109h.getDefaultPort() : urlM109h.getPort();
    }

    /* JADX INFO: renamed from: h */
    private URL m109h() {
        URL url = this.f105l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f97c.m82a());
        this.f105l = url2;
        return url2;
    }

    /* JADX INFO: renamed from: i */
    private CookieManager m110i() {
        CookieManager cookieManager = this.f102i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f102i = cookieManager2;
        return cookieManager2;
    }

    /* JADX INFO: renamed from: a */
    public static HttpUrlHeader m98a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    /* JADX INFO: renamed from: b */
    private URI m103b() {
        String strM82a = this.f97c.m82a();
        String str = this.f98d;
        if (str != null) {
            strM82a = str;
        }
        if (strM82a != null) {
            return new URI(strM82a);
        }
        throw new RuntimeException("url should not be null");
    }

    /* JADX INFO: renamed from: a */
    public final C0163o m111a() {
        return this.f97c;
    }

    /* JADX INFO: renamed from: a */
    private C0169u m99a(HttpResponse httpResponse, int i, String str) throws Throwable {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                m101a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f108o = false;
                this.f95a.m81c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.f95a.m79a(byteArray.length);
                C0164p c0164p = new C0164p(m98a(httpResponse), i, str, byteArray);
                long jM102b = m102b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> mapM100a = m100a(contentType.getValue());
                    str3 = mapM100a.get("charset");
                    str2 = mapM100a.get("Content-Type");
                } else {
                    str2 = null;
                }
                c0164p.m117b(str2);
                c0164p.m95a(str3);
                c0164p.m94a(System.currentTimeMillis());
                c0164p.m96b(jM102b);
                try {
                    byteArrayOutputStream2.close();
                    return c0164p;
                } catch (IOException e) {
                    throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> m100a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    private void m101a(HttpEntity httpEntity, OutputStream outputStream) throws IOException {
        InputStream inputStreamM53a = C0150b.m53a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStreamM53a.read(bArr);
                    if (i == -1 || this.f97c.m116h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    this.f97c.m114f();
                }
                outputStream.flush();
                C0166r.m112a(inputStreamM53a);
            } catch (Exception e) {
                e.getCause();
                throw new IOException("HttpWorker Request Error!" + e.getLocalizedMessage());
            }
        } catch (Throwable th) {
            C0166r.m112a(inputStreamM53a);
            throw th;
        }
    }
}
