package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOOO;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/platform/Android10Platform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Android10Platform extends Platform {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final boolean f124653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Companion f124654OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f124655OooO0Oo;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/Android10Platform$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        boolean z = false;
        z = false;
        f124654OooO0o0 = new Companion(z ? 1 : 0);
        Platform.f124683OooO00o.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        f124653OooO0o = z;
    }

    public Android10Platform() {
        Android10SocketAdapter.f124686OooO00o.getClass();
        Platform.f124683OooO00o.getClass();
        Android10SocketAdapter android10SocketAdapter = (!"Dalvik".equals(System.getProperty("java.vm.name")) || Build.VERSION.SDK_INT < 29) ? null : new Android10SocketAdapter();
        AndroidSocketAdapter.f124694OooO0o.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f124695OooO0oO);
        ConscryptSocketAdapter.f124707OooO00o.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f124708OooO0O0);
        BouncyCastleSocketAdapter.f124701OooO00o.getClass();
        ArrayList arrayListOooOoO = OooOOO.OooOoO(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f124702OooO0O0)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListOooOoO) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f124655OooO0Oo = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner OooO0O0(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        OooOOO0.OooO0oO(trustManager, "trustManager");
        AndroidCertificateChainCleaner.f124687OooO0Oo.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(trustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner == null ? super.OooO0O0(trustManager) : androidCertificateChainCleaner;
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        Object next;
        OooOOO0.OooO0oO(protocols, "protocols");
        Iterator it = this.f124655OooO0Oo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SocketAdapter) next).OooO00o(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return;
        }
        socketAdapter.OooO0OO(sSLSocket, str, protocols);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String OooO0o(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f124655OooO0Oo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((SocketAdapter) next).OooO00o(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) next;
        if (socketAdapter == null) {
            return null;
        }
        return socketAdapter.OooO0O0(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean OooO0oo(String hostname) {
        OooOOO0.OooO0oO(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
