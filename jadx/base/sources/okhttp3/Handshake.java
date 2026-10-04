package okhttp3;

import OooOoOO.C20519OooO0Oo;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32447OooOOo;
import oO0O000o.OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Handshake;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Handshake {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Companion f124116OooO0o0 = new Companion(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TlsVersion f124117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final CipherSuite f124118OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Certificate> f124119OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C32447OooOOo f124120OooO0Oo;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static Handshake OooO00o(SSLSession sSLSession) throws IOException {
            Certificate[] peerCertificates;
            List listOooOO0o = C34434OooOoO.f123453OooOo0o;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(OooOOO0.OooOOO0(cipherSuite, "cipherSuite == "));
            }
            CipherSuite cipherSuiteOooO0O0 = CipherSuite.f124057OooO0O0.OooO0O0(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.f124293OooOo.getClass();
            TlsVersion tlsVersionOooO00o = TlsVersion.Companion.OooO00o(protocol);
            try {
                peerCertificates = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
            }
            List listOooOO0o2 = peerCertificates != null ? Util.OooOO0o(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listOooOO0o;
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listOooOO0o = Util.OooOO0o(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new Handshake(tlsVersionOooO00o, cipherSuiteOooO0O0, listOooOO0o, new Handshake$Companion$handshake$1(listOooOO0o2));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, OooO00o<? extends List<? extends Certificate>> oooO00o) {
        this.f124117OooO00o = tlsVersion;
        this.f124118OooO0O0 = cipherSuite;
        this.f124119OooO0OO = list;
        this.f124120OooO0Oo = C20519OooO0Oo.OooO0OO(new Handshake$peerCertificates$2(oooO00o));
    }

    public final List<Certificate> OooO00o() {
        return (List) this.f124120OooO0Oo.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f124117OooO00o == this.f124117OooO00o && OooOOO0.OooO0O0(handshake.f124118OooO0O0, this.f124118OooO0O0) && OooOOO0.OooO0O0(handshake.OooO00o(), OooO00o()) && OooOOO0.OooO0O0(handshake.f124119OooO0OO, this.f124119OooO0OO);
    }

    public final int hashCode() {
        return this.f124119OooO0OO.hashCode() + ((OooO00o().hashCode() + ((this.f124118OooO0O0.hashCode() + ((this.f124117OooO00o.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listOooO00o = OooO00o();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO00o, 10));
        for (Certificate certificate : listOooO00o) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                OooOOO0.OooO0o(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f124117OooO00o);
        sb.append(" cipherSuite=");
        sb.append(this.f124118OooO0O0);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f124119OooO0OO;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                OooOOO0.OooO0o(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
