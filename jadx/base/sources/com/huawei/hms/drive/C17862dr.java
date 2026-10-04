package com.huawei.hms.drive;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.huawei.hms.drive.dr */
/* JADX INFO: loaded from: classes6.dex */
public final class C17862dr implements InterfaceC17865du {

    /* JADX INFO: renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f53396a = new LinkedHashMap();

    public C17862dr(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f53396a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f53396a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.huawei.hms.drive.InterfaceC17865du
    /* JADX INFO: renamed from: a */
    public X509Certificate mo76736a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f53396a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C17862dr) && ((C17862dr) obj).f53396a.equals(this.f53396a);
    }

    public int hashCode() {
        return this.f53396a.hashCode();
    }
}
