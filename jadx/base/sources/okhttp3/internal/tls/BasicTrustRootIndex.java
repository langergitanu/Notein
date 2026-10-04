package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class BasicTrustRootIndex implements TrustRootIndex {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f124722OooO00o;

    public BasicTrustRootIndex(X509Certificate... caCerts) {
        OooOOO0.OooO0oO(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = caCerts[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            OooOOO0.OooO0o(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f124722OooO00o = linkedHashMap;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public final X509Certificate OooO00o(X509Certificate cert) {
        OooOOO0.OooO0oO(cert, "cert");
        Set set = (Set) this.f124722OooO00o.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof BasicTrustRootIndex) && OooOOO0.OooO0O0(((BasicTrustRootIndex) obj).f124722OooO00o, this.f124722OooO00o);
        }
        return true;
    }

    public final int hashCode() {
        return this.f124722OooO00o.hashCode();
    }
}
