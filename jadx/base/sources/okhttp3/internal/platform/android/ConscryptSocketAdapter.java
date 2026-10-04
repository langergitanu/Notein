package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Protocol;
import okhttp3.internal.platform.ConscryptPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ConscryptSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Companion f124707OooO00o = new Companion(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ConscryptSocketAdapter$Companion$factory$1 f124708OooO0O0 = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean OooO00o(SSLSocket sSLSocket) {
            ConscryptPlatform.f124666OooO0o0.getClass();
            return ConscryptPlatform.f124665OooO0o && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter OooO0O0(SSLSocket sSLSocket) {
            return new ConscryptSocketAdapter();
        }
    };

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/ConscryptSocketAdapter$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String OooO0O0(SSLSocket sSLSocket) {
        if (OooO00o(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void OooO0OO(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        OooOOO0.OooO0oO(protocols, "protocols");
        if (OooO00o(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Platform.f124683OooO00o.getClass();
            Object[] array = Platform.Companion.OooO00o(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean isSupported() {
        ConscryptPlatform.f124666OooO0o0.getClass();
        return ConscryptPlatform.f124665OooO0o;
    }
}
