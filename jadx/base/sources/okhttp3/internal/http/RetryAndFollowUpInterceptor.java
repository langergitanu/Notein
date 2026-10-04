package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.ExchangeFinder;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OkHttpClient f124453OooO00o;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public RetryAndFollowUpInterceptor(OkHttpClient client) {
        OooOOO0.OooO0oO(client, "client");
        this.f124453OooO00o = client;
    }

    public static int OooO0OO(Response response, int i) {
        String strOooO00o = Response.OooO00o("Retry-After", response);
        if (strOooO00o == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        OooOOO0.OooO0o(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strOooO00o).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strOooO00o);
        OooOOO0.OooO0o(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request OooO00o(Response response, Exchange exchange) throws IOException {
        RealConnection realConnection;
        String strOooO00o;
        RequestBody requestBody;
        Response response2;
        Route route = (exchange == null || (realConnection = exchange.f124352OooO0oO) == null) ? null : realConnection.f124398OooO0O0;
        int i = response.f124259OooOoO;
        Request request = response.f124258OooOo0o;
        String str = request.f124239OooO0O0;
        if (i == 307 || i == 308) {
            OkHttpClient okHttpClient = this.f124453OooO00o;
            if (okHttpClient.f124180OooOooO && (strOooO00o = Response.OooO00o("Location", response)) != null) {
                Request request2 = response.f124258OooOo0o;
                HttpUrl httpUrl = request2.f124238OooO00o;
                httpUrl.getClass();
                HttpUrl.Builder builderOooO0oO = httpUrl.OooO0oO(strOooO00o);
                HttpUrl httpUrlOooO0OO = builderOooO0oO == null ? null : builderOooO0oO.OooO0OO();
                if (httpUrlOooO0OO != null) {
                    if (OooOOO0.OooO0O0(httpUrlOooO0OO.f124129OooO00o, request2.f124238OooO00o.f124129OooO00o) || okHttpClient.f124181OooOooo) {
                        Request.Builder builderOooO00o = request2.OooO00o();
                        if (HttpMethod.OooO00o(str)) {
                            HttpMethod.f124439OooO00o.getClass();
                            boolean zEquals = str.equals("PROPFIND");
                            int i2 = response.f124259OooOoO;
                            boolean z = zEquals || i2 == 308 || i2 == 307;
                            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                builderOooO00o.OooO0Oo(str, z ? request2.f124241OooO0Oo : null);
                            } else {
                                builderOooO00o.OooO0Oo("GET", null);
                            }
                            if (!z) {
                                builderOooO00o.f124246OooO0OO.OooO0Oo(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
                                builderOooO00o.f124246OooO0OO.OooO0Oo("Content-Length");
                                builderOooO00o.f124246OooO0OO.OooO0Oo("Content-Type");
                            }
                        }
                        if (!Util.OooO00o(request2.f124238OooO00o, httpUrlOooO0OO)) {
                            builderOooO00o.f124246OooO0OO.OooO0Oo("Authorization");
                        }
                        builderOooO00o.f124244OooO00o = httpUrlOooO0OO;
                        return builderOooO00o.OooO0O0();
                    }
                }
            }
        } else {
            if (i == 401) {
                return this.f124453OooO00o.f124178OooOoo.authenticate(route, response);
            }
            if (i == 421) {
                RequestBody requestBody2 = request.f124241OooO0Oo;
                if ((requestBody2 == null || !requestBody2.isOneShot()) && exchange != null && !OooOOO0.OooO0O0(exchange.f124348OooO0OO.f124366OooO0O0.f124018OooO.f124132OooO0Oo, exchange.f124352OooO0oO.f124398OooO0O0.f124290OooO00o.f124018OooO.f124132OooO0Oo)) {
                    RealConnection realConnection2 = exchange.f124352OooO0oO;
                    synchronized (realConnection2) {
                        realConnection2.f124406OooOO0O = true;
                    }
                    return response.f124258OooOo0o;
                }
            } else if (i == 503) {
                Response response3 = response.f124267Oooo000;
                if ((response3 == null || response3.f124259OooOoO != 503) && OooO0OO(response, Integer.MAX_VALUE) == 0) {
                    return response.f124258OooOo0o;
                }
            } else {
                if (i == 407) {
                    OooOOO0.OooO0Oo(route);
                    if (route.f124291OooO0O0.type() == Proxy.Type.HTTP) {
                        return this.f124453OooO00o.f124187Oooo0O0.authenticate(route, response);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                        default:
                            return null;
                    }
                } else if (this.f124453OooO00o.f124179OooOoo0 && (((requestBody = request.f124241OooO0Oo) == null || !requestBody.isOneShot()) && (((response2 = response.f124267Oooo000) == null || response2.f124259OooOoO != 408) && OooO0OO(response, 0) <= 0))) {
                    return response.f124258OooOo0o;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OooO0O0(IOException iOException, RealCall realCall, Request request, boolean z) {
        ExchangeFinder exchangeFinder;
        int i;
        boolean zOooO00o;
        RouteSelector routeSelector;
        RealConnection realConnection;
        RequestBody requestBody;
        if (!this.f124453OooO00o.f124179OooOoo0 || ((z && (((requestBody = request.f124241OooO0Oo) != null && requestBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            exchangeFinder = realCall.f124382OooOooo;
            OooOOO0.OooO0Oo(exchangeFinder);
            i = exchangeFinder.f124371OooO0oO;
            if (i != 0) {
                if (exchangeFinder.f124373OooOO0 == null) {
                }
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z) {
            exchangeFinder = realCall.f124382OooOooo;
            OooOOO0.OooO0Oo(exchangeFinder);
            i = exchangeFinder.f124371OooO0oO;
            if (i != 0 && exchangeFinder.f124372OooO0oo == 0 && exchangeFinder.f124364OooO == 0) {
                zOooO00o = false;
            } else if (exchangeFinder.f124373OooOO0 == null) {
                zOooO00o = true;
            } else {
                Route route = null;
                if (i <= 1 && exchangeFinder.f124372OooO0oo <= 1 && exchangeFinder.f124364OooO <= 0 && (realConnection = exchangeFinder.f124367OooO0OO.f124384Oooo000) != null) {
                    synchronized (realConnection) {
                        if (realConnection.f124407OooOO0o == 0 && Util.OooO00o(realConnection.f124398OooO0O0.f124290OooO00o.f124018OooO, exchangeFinder.f124366OooO0O0.f124018OooO)) {
                            route = realConnection.f124398OooO0O0;
                        }
                    }
                }
                if (route != null) {
                    exchangeFinder.f124373OooOO0 = route;
                } else {
                    RouteSelector.Selection selection = exchangeFinder.f124370OooO0o0;
                    if ((selection == null || !selection.OooO00o()) && (routeSelector = exchangeFinder.f124369OooO0o) != null) {
                        zOooO00o = routeSelector.OooO00o();
                    }
                }
                zOooO00o = true;
            }
            if (zOooO00o) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r9 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        r0 = r0.OooOOO0();
        r2 = r9.OooOOO0();
        r2.f124277OooO0oO = null;
        r2 = r2.OooO00o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r2.f124262OooOoo != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        r0.f124279OooOO0 = r2;
        r0 = r0.OooO00o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        throw new java.lang.IllegalArgumentException("priorResponse.body != null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        r0 = r4.f124386Oooo00o;
        r5 = OooO00o(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r5 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        if (r0.f124351OooO0o0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if (r4.f124385Oooo00O != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        r4.f124385Oooo00O = true;
        r4.f124380OooOoo0.exit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d7, code lost:
    
        r4.OooO0Oo(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        r0 = r5.f124241OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (r0 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        if (r0.isOneShot() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        r4.OooO0Oo(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        r0 = r9.f124262OooOoo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        okhttp3.internal.Util.OooO0OO(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f4, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        if (r10 > 20) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010d, code lost:
    
        throw new java.net.ProtocolException(kotlin.jvm.internal.OooOOO0.OooOOO0(java.lang.Integer.valueOf(r10), "Too many follow-up requests: "));
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f124446OooO0o0;
        RealCall realCall = realInterceptorChain.f124441OooO00o;
        List listOooooOo = C34434OooOoO.f123453OooOo0o;
        Response response = null;
        int i = 0;
        Request request2 = request;
        while (true) {
            boolean z = true;
            while (true) {
                realCall.getClass();
                OooOOO0.OooO0oO(request2, "request");
                if (realCall.f124386Oooo00o != null) {
                    throw new IllegalStateException("Check failed.");
                }
                synchronized (realCall) {
                    if (realCall.f124387Oooo0O0) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (realCall.f124383Oooo0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                if (z) {
                    RealConnectionPool realConnectionPool = realCall.f124376OooOoO;
                    HttpUrl httpUrl = request2.f124238OooO00o;
                    boolean z2 = httpUrl.f124137OooOO0;
                    OkHttpClient okHttpClient = realCall.f124375OooOo0o;
                    if (z2) {
                        SSLSocketFactory sSLSocketFactory2 = okHttpClient.f124190Oooo0o0;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        HostnameVerifier hostnameVerifier2 = okHttpClient.f124182Oooo;
                        certificatePinner = okHttpClient.f124195OoooO00;
                        sSLSocketFactory = sSLSocketFactory2;
                        hostnameVerifier = hostnameVerifier2;
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        certificatePinner = null;
                    }
                    realCall.f124382OooOooo = new ExchangeFinder(realConnectionPool, new Address(httpUrl.f124132OooO0Oo, httpUrl.f124134OooO0o0, okHttpClient.f124185Oooo00O, okHttpClient.f124188Oooo0OO, sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.f124187Oooo0O0, okHttpClient.f124186Oooo00o, okHttpClient.f124192Oooo0oo, okHttpClient.f124191Oooo0oO, okHttpClient.f124183Oooo0), realCall, realCall.f124378OooOoOO);
                }
                try {
                    if (realCall.f124390Oooo0o0) {
                        throw new IOException("Canceled");
                    }
                    try {
                        Response responseOooO00o = realInterceptorChain.OooO00o(request2);
                        break;
                    } catch (IOException e) {
                        if (!OooO0O0(e, realCall, request2, !(e instanceof ConnectionShutdownException))) {
                            Util.OooOoo0(e, listOooooOo);
                            throw e;
                        }
                        listOooooOo = OooOo.OooooOo(listOooooOo, e);
                        realCall.OooO0Oo(true);
                        z = false;
                    } catch (RouteException e2) {
                        if (!OooO0O0(e2.f124421OooOo, realCall, request2, false)) {
                            IOException iOException = e2.f124422OooOo0o;
                            Util.OooOoo0(iOException, listOooooOo);
                            throw iOException;
                        }
                        listOooooOo = OooOo.OooooOo(listOooooOo, e2.f124422OooOo0o);
                        realCall.OooO0Oo(true);
                        z = false;
                    }
                } catch (Throwable th) {
                    realCall.OooO0Oo(true);
                    throw th;
                }
            }
            realCall.OooO0Oo(true);
        }
    }
}
