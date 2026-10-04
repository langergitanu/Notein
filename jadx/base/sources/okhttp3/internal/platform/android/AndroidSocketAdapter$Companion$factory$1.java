package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/internal/platform/android/AndroidSocketAdapter$Companion$factory$1", "Lokhttp3/internal/platform/android/DeferredSocketAdapter$Factory;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return C33595OooOOo.OooOoO0(sSLSocket.getClass().getName(), OooOOO0.OooOOO0(".", "com.google.android.gms.org.conscrypt"), false);
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final SocketAdapter OooO0O0(SSLSocket sSLSocket) {
        AndroidSocketAdapter.Companion companion = AndroidSocketAdapter.f124694OooO0o;
        Class<?> cls = sSLSocket.getClass();
        companion.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(OooOOO0.OooOOO0(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new AndroidSocketAdapter(superclass);
    }
}
