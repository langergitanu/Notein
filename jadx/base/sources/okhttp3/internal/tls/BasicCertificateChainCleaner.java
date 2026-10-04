package okhttp3.internal.tls;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TrustRootIndex f124721OooO0O0;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner$Companion;", "", "()V", "MAX_SIGNERS", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        OooOOO0.OooO0oO(trustRootIndex, "trustRootIndex");
        this.f124721OooO0O0 = trustRootIndex;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final List OooO00o(String hostname, List chain) throws SSLPeerUnverifiedException {
        OooOOO0.OooO0oO(chain, "chain");
        OooOOO0.OooO0oO(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        OooOOO0.OooO0o(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate = (X509Certificate) C21505OooO0Oo.OooO00o(1, arrayList);
            X509Certificate x509CertificateOooO00o = this.f124721OooO0O0.OooO00o(x509Certificate);
            if (x509CertificateOooO00o == null) {
                Iterator it = arrayDeque.iterator();
                OooOOO0.OooO0o(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (OooOOO0.OooO0O0(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException(OooOOO0.OooOOO0(x509Certificate, "Failed to find a trusted cert that signed "));
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateOooO00o)) {
                arrayList.add(x509CertificateOooO00o);
            }
            if (OooOOO0.OooO0O0(x509CertificateOooO00o.getIssuerDN(), x509CertificateOooO00o.getSubjectDN())) {
                try {
                    x509CertificateOooO00o.verify(x509CertificateOooO00o.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException(OooOOO0.OooOOO0(arrayList, "Certificate chain too long: "));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && OooOOO0.OooO0O0(((BasicCertificateChainCleaner) obj).f124721OooO0O0, this.f124721OooO0O0);
    }

    public final int hashCode() {
        return this.f124721OooO0O0.hashCode();
    }
}
