package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ConnectInterceptor f124341OooO00o = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        RealCall realCall = realInterceptorChain.f124441OooO00o;
        realCall.getClass();
        synchronized (realCall) {
            if (!realCall.f124388Oooo0OO) {
                throw new IllegalStateException("released");
            }
            if (realCall.f124387Oooo0O0) {
                throw new IllegalStateException("Check failed.");
            }
            if (realCall.f124383Oooo0) {
                throw new IllegalStateException("Check failed.");
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        ExchangeFinder exchangeFinder = realCall.f124382OooOooo;
        OooOOO0.OooO0Oo(exchangeFinder);
        OkHttpClient client = realCall.f124375OooOo0o;
        OooOOO0.OooO0oO(client, "client");
        try {
            Exchange exchange = new Exchange(realCall, realCall.f124378OooOoOO, exchangeFinder, exchangeFinder.OooO00o(realInterceptorChain.f124445OooO0o, realInterceptorChain.f124447OooO0oO, realInterceptorChain.f124448OooO0oo, client.f124179OooOoo0, !OooOOO0.OooO0O0(realInterceptorChain.f124446OooO0o0.f124239OooO0O0, "GET")).OooOO0(client, realInterceptorChain));
            realCall.f124386Oooo00o = exchange;
            realCall.f124389Oooo0o = exchange;
            synchronized (realCall) {
                realCall.f124383Oooo0 = true;
                realCall.f124387Oooo0O0 = true;
            }
            if (realCall.f124390Oooo0o0) {
                throw new IOException("Canceled");
            }
            return RealInterceptorChain.OooO0O0(realInterceptorChain, 0, exchange, null, 61).OooO00o(realInterceptorChain.f124446OooO0o0);
        } catch (IOException e) {
            exchangeFinder.OooO0OO(e);
            throw new RouteException(e);
        } catch (RouteException e2) {
            exchangeFinder.OooO0OO(e2.f124421OooOo);
            throw e2;
        }
    }
}
