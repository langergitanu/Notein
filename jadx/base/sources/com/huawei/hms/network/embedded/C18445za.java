package com.huawei.hms.network.embedded;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.za */
/* JADX INFO: loaded from: classes9.dex */
public final class C18445za implements InterfaceC18149db {

    /* JADX INFO: renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f56865a = new LinkedHashMap();

    public C18445za(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f56865a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f56865a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18149db
    /* JADX INFO: renamed from: a */
    public X509Certificate mo78256a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f56865a.get(x509Certificate.getIssuerX500Principal());
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
        return (obj instanceof C18445za) && ((C18445za) obj).f56865a.equals(this.f56865a);
    }

    public int hashCode() {
        return this.f56865a.hashCode();
    }
}
