package okhttp3.internal.http;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f124440OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RealCall f124441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f124442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f124443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Exchange f124444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f124445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Request f124446OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f124447OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f124448OooO0oo;

    public RealInterceptorChain(RealCall call, ArrayList arrayList, int i, Exchange exchange, Request request, int i2, int i3, int i4) {
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(request, "request");
        this.f124441OooO00o = call;
        this.f124442OooO0O0 = arrayList;
        this.f124443OooO0OO = i;
        this.f124444OooO0Oo = exchange;
        this.f124446OooO0o0 = request;
        this.f124445OooO0o = i2;
        this.f124447OooO0oO = i3;
        this.f124448OooO0oo = i4;
    }

    public static RealInterceptorChain OooO0O0(RealInterceptorChain realInterceptorChain, int i, Exchange exchange, Request request, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.f124443OooO0OO;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            exchange = realInterceptorChain.f124444OooO0Oo;
        }
        Exchange exchange2 = exchange;
        if ((i2 & 4) != 0) {
            request = realInterceptorChain.f124446OooO0o0;
        }
        Request request2 = request;
        OooOOO0.OooO0oO(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f124441OooO00o, realInterceptorChain.f124442OooO0O0, i3, exchange2, request2, realInterceptorChain.f124445OooO0o, realInterceptorChain.f124447OooO0oO, realInterceptorChain.f124448OooO0oo);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response OooO00o(Request request) throws IOException {
        OooOOO0.OooO0oO(request, "request");
        ArrayList arrayList = this.f124442OooO0O0;
        int size = arrayList.size();
        int i = this.f124443OooO0OO;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f124440OooO++;
        Exchange exchange = this.f124444OooO0Oo;
        if (exchange != null) {
            if (!exchange.f124348OooO0OO.OooO0O0(request.f124238OooO00o)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.f124440OooO != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        RealInterceptorChain realInterceptorChainOooO0O0 = OooO0O0(this, i2, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        Response responseIntercept = interceptor.intercept(realInterceptorChainOooO0O0);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange != null && i2 < arrayList.size() && realInterceptorChainOooO0O0.f124440OooO != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.f124262OooOoo != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    /* JADX INFO: renamed from: request, reason: from getter */
    public final Request getF124446OooO0o0() {
        return this.f124446OooO0o0;
    }
}
