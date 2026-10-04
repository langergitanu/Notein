package com.huawei.hms.drive;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.huawei.hms.drive.dq */
/* JADX INFO: loaded from: classes6.dex */
public final class C17861dq extends AbstractC17863ds {

    /* JADX INFO: renamed from: a */
    private final InterfaceC17865du f53395a;

    public C17861dq(InterfaceC17865du interfaceC17865du) {
        this.f53395a = interfaceC17865du;
    }

    @Override // com.huawei.hms.drive.AbstractC17863ds
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo76735a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) C21505OooO0Oo.OooO00o(1, arrayList);
            X509Certificate x509CertificateMo76736a = this.f53395a.mo76736a(x509Certificate);
            if (x509CertificateMo76736a == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m76764a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo76736a)) {
                arrayList.add(x509CertificateMo76736a);
            }
            if (m76764a(x509CertificateMo76736a, x509CertificateMo76736a)) {
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
        return (obj instanceof C17861dq) && ((C17861dq) obj).f53395a.equals(this.f53395a);
    }

    public int hashCode() {
        return this.f53395a.hashCode();
    }

    /* JADX INFO: renamed from: a */
    private boolean m76764a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
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
