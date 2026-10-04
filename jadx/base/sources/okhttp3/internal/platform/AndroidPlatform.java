package okhttp3.internal.platform;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOOO;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.CloseGuard;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Companion", "CustomTrustRootIndex", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class AndroidPlatform extends Platform {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Companion f124656OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f124657OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f124658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CloseGuard f124659OooO0o0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final /* data */ class CustomTrustRootIndex implements TrustRootIndex {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final X509TrustManager f124660OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f124661OooO0O0;

        public CustomTrustRootIndex(X509TrustManager trustManager, Method method) {
            OooOOO0.OooO0oO(trustManager, "trustManager");
            this.f124660OooO00o = trustManager;
            this.f124661OooO0O0 = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate OooO00o(X509Certificate cert) {
            OooOOO0.OooO0oO(cert, "cert");
            try {
                Object objInvoke = this.f124661OooO0O0.invoke(this.f124660OooO00o, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return OooOOO0.OooO0O0(this.f124660OooO00o, customTrustRootIndex.f124660OooO00o) && OooOOO0.OooO0O0(this.f124661OooO0O0, customTrustRootIndex.f124661OooO0O0);
        }

        public final int hashCode() {
            return this.f124661OooO0O0.hashCode() + (this.f124660OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f124660OooO00o + ", findByIssuerAndSignatureMethod=" + this.f124661OooO0O0 + ')';
        }
    }

    static {
        boolean z = false;
        z = false;
        f124656OooO0o = new Companion(z ? 1 : 0);
        Platform.f124683OooO00o.getClass();
        if ("Dalvik".equals(System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f124657OooO0oO = z;
    }

    public AndroidPlatform() throws NoSuchMethodException {
        StandardAndroidSocketAdapter standardAndroidSocketAdapter;
        Method method;
        Method method2;
        StandardAndroidSocketAdapter.f124711OooO0oo.getClass();
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(OooOOO0.OooOOO0(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(OooOOO0.OooOOO0(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(OooOOO0.OooOOO0(".SSLParametersImpl", "com.android.org.conscrypt"));
            standardAndroidSocketAdapter = new StandardAndroidSocketAdapter(cls);
        } catch (Exception e) {
            Platform.f124683OooO00o.getClass();
            Platform.f124684OooO0O0.getClass();
            Platform.OooO("unable to load android socket classes", 5, e);
            standardAndroidSocketAdapter = null;
        }
        AndroidSocketAdapter.f124694OooO0o.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f124695OooO0oO);
        ConscryptSocketAdapter.f124707OooO00o.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f124708OooO0O0);
        BouncyCastleSocketAdapter.f124701OooO00o.getClass();
        ArrayList arrayListOooOoO = OooOOO.OooOoO(new SocketAdapter[]{standardAndroidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f124702OooO0O0)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListOooOoO) {
            if (((SocketAdapter) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f124658OooO0Oo = arrayList;
        CloseGuard.f124703OooO0Oo.getClass();
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f124659OooO0o0 = new CloseGuard(method3, method2, method);
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
    public final TrustRootIndex OooO0OO(X509TrustManager trustManager) {
        OooOOO0.OooO0oO(trustManager, "trustManager");
        try {
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.OooO0OO(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        Object next;
        OooOOO0.OooO0oO(protocols, "protocols");
        Iterator it = this.f124658OooO0Oo.iterator();
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
        Iterator it = this.f124658OooO0Oo.iterator();
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
    public final void OooO0o0(Socket socket, InetSocketAddress address, int i) throws IOException {
        OooOOO0.OooO0oO(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object OooO0oO() {
        CloseGuard closeGuard = this.f124659OooO0o0;
        closeGuard.getClass();
        Method method = closeGuard.f124704OooO00o;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = closeGuard.f124705OooO0O0;
                OooOOO0.OooO0Oo(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean OooO0oo(String hostname) {
        OooOOO0.OooO0oO(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void OooOO0(Object obj, String message) {
        OooOOO0.OooO0oO(message, "message");
        CloseGuard closeGuard = this.f124659OooO0o0;
        closeGuard.getClass();
        if (obj != null) {
            try {
                Method method = closeGuard.f124706OooO0OO;
                OooOOO0.OooO0Oo(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        Platform.OooO(message, 5, null);
    }
}
