package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "Factory", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class DeferredSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Factory f124709OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SocketAdapter f124710OooO0O0;

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface Factory {
        boolean OooO00o(SSLSocket sSLSocket);

        SocketAdapter OooO0O0(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        OooOOO0.OooO0oO(socketAdapterFactory, "socketAdapterFactory");
        this.f124709OooO00o = socketAdapterFactory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return this.f124709OooO00o.OooO00o(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String OooO0O0(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterOooO0Oo = OooO0Oo(sSLSocket);
        if (socketAdapterOooO0Oo == null) {
            return null;
        }
        return socketAdapterOooO0Oo.OooO0O0(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void OooO0OO(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
        SocketAdapter socketAdapterOooO0Oo = OooO0Oo(sSLSocket);
        if (socketAdapterOooO0Oo == null) {
            return;
        }
        socketAdapterOooO0Oo.OooO0OO(sSLSocket, str, protocols);
    }

    public final synchronized SocketAdapter OooO0Oo(SSLSocket sSLSocket) {
        try {
            if (this.f124710OooO0O0 == null && this.f124709OooO00o.OooO00o(sSLSocket)) {
                this.f124710OooO0O0 = this.f124709OooO00o.OooO0O0(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f124710OooO0O0;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        return true;
    }
}
