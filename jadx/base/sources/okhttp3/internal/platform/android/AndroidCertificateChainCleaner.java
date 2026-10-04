package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Companion f124687OooO0Oo = new Companion(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final X509TrustManager f124688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final X509TrustManagerExtensions f124689OooO0OO;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidCertificateChainCleaner$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        OooOOO0.OooO0oO(trustManager, "trustManager");
        this.f124688OooO0O0 = trustManager;
        this.f124689OooO0OO = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final List OooO00o(String hostname, List chain) throws SSLPeerUnverifiedException {
        OooOOO0.OooO0oO(chain, "chain");
        OooOOO0.OooO0oO(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.f124689OooO0OO.checkServerTrusted((X509Certificate[]) array, AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, hostname);
            OooOOO0.OooO0o(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f124688OooO0O0 == this.f124688OooO0O0;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f124688OooO0O0);
    }
}
