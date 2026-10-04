package okhttp3.internal.http;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34533OooOOO0;
import oOo00OoO.C34535OooOOOo;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class BridgeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CookieJar f124434OooO00o;

    public BridgeInterceptor(CookieJar cookieJar) {
        OooOOO0.OooO0oO(cookieJar, "cookieJar");
        this.f124434OooO00o = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.f124446OooO0o0;
        Request.Builder builderOooO00o = request.OooO00o();
        RequestBody requestBody = request.f124241OooO0Oo;
        if (requestBody != null) {
            MediaType f124162OooO0OO = requestBody.getF124249OooO00o();
            if (f124162OooO0OO != null) {
                builderOooO00o.OooO0OO("Content-Type", f124162OooO0OO.f124150OooO00o);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                builderOooO00o.OooO0OO("Content-Length", String.valueOf(jContentLength));
                builderOooO00o.f124246OooO0OO.OooO0Oo(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
            } else {
                builderOooO00o.OooO0OO(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, "chunked");
                builderOooO00o.f124246OooO0OO.OooO0Oo("Content-Length");
            }
        }
        Headers headers = request.f124240OooO0OO;
        String strOooO0O0 = headers.OooO0O0("Host");
        boolean z = false;
        HttpUrl httpUrl = request.f124238OooO00o;
        if (strOooO0O0 == null) {
            builderOooO00o.OooO0OO("Host", Util.OooOo(httpUrl, false));
        }
        if (headers.OooO0O0(com.google.common.net.HttpHeaders.CONNECTION) == null) {
            builderOooO00o.OooO0OO(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        }
        if (headers.OooO0O0(com.google.common.net.HttpHeaders.ACCEPT_ENCODING) == null && headers.OooO0O0("Range") == null) {
            builderOooO00o.OooO0OO(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        CookieJar cookieJar = this.f124434OooO00o;
        cookieJar.OooO00o(httpUrl);
        if (headers.OooO0O0("User-Agent") == null) {
            builderOooO00o.OooO0OO("User-Agent", "okhttp/4.11.0");
        }
        Response responseOooO00o = realInterceptorChain.OooO00o(builderOooO00o.OooO0O0());
        Headers headers2 = responseOooO00o.f124263OooOoo0;
        HttpHeaders.OooO0Oo(cookieJar, httpUrl, headers2);
        Response.Builder builderOooOOO0 = responseOooO00o.OooOOO0();
        builderOooOOO0.f124271OooO00o = request;
        if (z && "gzip".equalsIgnoreCase(Response.OooO00o("Content-Encoding", responseOooO00o)) && HttpHeaders.OooO00o(responseOooO00o) && (responseBody = responseOooO00o.f124262OooOoo) != null) {
            C34533OooOOO0 c34533OooOOO0 = new C34533OooOOO0(responseBody.getF124289OooOoO0());
            Headers.Builder builderOooO0o0 = headers2.OooO0o0();
            builderOooO0o0.OooO0Oo("Content-Encoding");
            builderOooO0o0.OooO0Oo("Content-Length");
            builderOooOOO0.f124275OooO0o = builderOooO0o0.OooO0OO().OooO0o0();
            builderOooOOO0.f124277OooO0oO = new RealResponseBody(Response.OooO00o("Content-Type", responseOooO00o), -1L, C34535OooOOOo.OooO0O0(c34533OooOOO0));
        }
        return builderOooOOO0.OooO00o();
    }
}
