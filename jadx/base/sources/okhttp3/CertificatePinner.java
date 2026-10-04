package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.OooO00o;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.OooOo;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/CertificatePinner;", "", "Builder", "Companion", "Pin", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Companion f124046OooO0OO = new Companion(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final CertificatePinner f124047OooO0Oo = new CertificatePinner(OooOo.o0OO00O(new Builder().f124050OooO00o), null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<Pin> f124048OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CertificateChainCleaner f124049OooO0O0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f124050OooO00o = new ArrayList();
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Pin {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            pin.getClass();
            pin.getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        this.f124048OooO00o = set;
        this.f124049OooO0O0 = certificateChainCleaner;
    }

    public final void OooO00o(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        OooOOO0.OooO0oO(hostname, "hostname");
        OooOOO0.OooO0oO(peerCertificates, "peerCertificates");
        OooO0O0(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void OooO0O0(String hostname, OooO00o<? extends List<? extends X509Certificate>> oooO00o) {
        OooOOO0.OooO0oO(hostname, "hostname");
        Iterator<T> it = this.f124048OooO00o.iterator();
        if (it.hasNext()) {
            ((Pin) it.next()).getClass();
            C33595OooOOo.OooOoO0(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return OooOOO0.OooO0O0(certificatePinner.f124048OooO00o, this.f124048OooO00o) && OooOOO0.OooO0O0(certificatePinner.f124049OooO0O0, this.f124049OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = (this.f124048OooO00o.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f124049OooO0O0;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
