package o0oo00O0;

import java.io.IOException;
import oOO00oo.C34406OooO00o;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: renamed from: o0oo00O0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31197OooO00o implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NetLogInterceptor");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        StringBuilder sb = new StringBuilder("Send a request ");
        Request request = realInterceptorChain.f124446OooO0o0;
        sb.append(request);
        c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
        Response responseOooO00o = realInterceptorChain.OooO00o(request);
        c20358OooO00o.OooOOO0("NetLogInterceptor");
        c20358OooO00o.OooO0o0("Receive a response " + responseOooO00o, new Object[0]);
        return responseOooO00o;
    }
}
