package com.huawei.hms.network.embedded;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ya */
/* JADX INFO: loaded from: classes9.dex */
public final class C18432ya extends AbstractC18107ab {

    /* JADX INFO: renamed from: b */
    public static final int f56727b = 9;

    /* JADX INFO: renamed from: a */
    public final InterfaceC18149db f56728a;

    public C18432ya(InterfaceC18149db interfaceC18149db) {
        this.f56728a = interfaceC18149db;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18107ab
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo77913a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) C21505OooO0Oo.OooO00o(1, arrayList);
            X509Certificate x509CertificateMo78256a = this.f56728a.mo78256a(x509Certificate);
            if (x509CertificateMo78256a == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m79997a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo78256a)) {
                arrayList.add(x509CertificateMo78256a);
            }
            if (m79997a(x509CertificateMo78256a, x509CertificateMo78256a)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C18432ya) && ((C18432ya) obj).f56728a.equals(this.f56728a);
    }

    public int hashCode() {
        return this.f56728a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    private boolean m79997a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
