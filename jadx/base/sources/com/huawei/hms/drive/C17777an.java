package com.huawei.hms.drive;

import com.huawei.hms.network.embedded.C18187g7;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: renamed from: com.huawei.hms.drive.an */
/* JADX INFO: loaded from: classes6.dex */
public final class C17777an {

    /* JADX INFO: renamed from: a */
    public static final C17777an f52586a = new a().m75988a();

    /* JADX INFO: renamed from: b */
    private final Set<b> f52587b;

    /* JADX INFO: renamed from: c */
    private final AbstractC17863ds f52588c;

    /* JADX INFO: renamed from: com.huawei.hms.drive.an$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<b> f52589a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C17777an m75988a() {
            return new C17777an(new LinkedHashSet(this.f52589a), null);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.an$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        final String f52590a;

        /* JADX INFO: renamed from: b */
        final String f52591b;

        /* JADX INFO: renamed from: c */
        final String f52592c;

        /* JADX INFO: renamed from: d */
        final C34527OooO0oO f52593d;

        /* JADX INFO: renamed from: a */
        public boolean m75989a(String str) {
            if (!this.f52590a.startsWith(C18187g7.b.f54919e)) {
                return str.equals(this.f52591b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f52591b.length()) {
                return false;
            }
            String str2 = this.f52591b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f52590a.equals(bVar.f52590a) && this.f52592c.equals(bVar.f52592c) && this.f52593d.equals(bVar.f52593d);
        }

        public int hashCode() {
            return this.f52593d.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(527, 31, this.f52590a), 31, this.f52592c);
        }

        public String toString() {
            return this.f52592c + this.f52593d.OooO00o();
        }
    }

    public C17777an(Set<b> set, AbstractC17863ds abstractC17863ds) {
        this.f52587b = set;
        this.f52588c = abstractC17863ds;
    }

    /* JADX INFO: renamed from: b */
    public static C34527OooO0oO m75984b(X509Certificate x509Certificate) {
        return C34527OooO0oO.OooO0oO(x509Certificate.getPublicKey().getEncoded()).OooO0O0(KeyUtil.HMAC_KEY_HASH_ALGORITHM);
    }

    /* JADX INFO: renamed from: a */
    public void m75987a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listM75986a = m75986a(str);
        if (listM75986a.isEmpty()) {
            return;
        }
        AbstractC17863ds abstractC17863ds = this.f52588c;
        if (abstractC17863ds != null) {
            list = abstractC17863ds.mo76735a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listM75986a.size();
            C34527OooO0oO c34527OooO0oOM75984b = null;
            C34527OooO0oO c34527OooO0oOM75983a = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = listM75986a.get(i2);
                if (bVar.f52592c.equals("sha256/")) {
                    if (c34527OooO0oOM75984b == null) {
                        c34527OooO0oOM75984b = m75984b(x509Certificate);
                    }
                    if (bVar.f52593d.equals(c34527OooO0oOM75984b)) {
                        return;
                    }
                } else {
                    if (!bVar.f52592c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f52592c);
                    }
                    if (c34527OooO0oOM75983a == null) {
                        c34527OooO0oOM75983a = m75983a(x509Certificate);
                    }
                    if (bVar.f52593d.equals(c34527OooO0oOM75983a)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m75982a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(C18241k5.f55433h);
        int size4 = listM75986a.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = listM75986a.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17777an)) {
            return false;
        }
        C17777an c17777an = (C17777an) obj;
        return C17806bp.m76342a(this.f52588c, c17777an.f52588c) && this.f52587b.equals(c17777an.f52587b);
    }

    public int hashCode() {
        AbstractC17863ds abstractC17863ds = this.f52588c;
        return this.f52587b.hashCode() + ((abstractC17863ds != null ? abstractC17863ds.hashCode() : 0) * 31);
    }

    /* JADX INFO: renamed from: a */
    public List<b> m75986a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f52587b) {
            if (bVar.m75989a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public C17777an m75985a(AbstractC17863ds abstractC17863ds) {
        return C17806bp.m76342a(this.f52588c, abstractC17863ds) ? this : new C17777an(this.f52587b, abstractC17863ds);
    }

    /* JADX INFO: renamed from: a */
    public static String m75982a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m75984b((X509Certificate) certificate).OooO00o();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* JADX INFO: renamed from: a */
    public static C34527OooO0oO m75983a(X509Certificate x509Certificate) {
        return C34527OooO0oO.OooO0oO(x509Certificate.getPublicKey().getEncoded()).OooO0O0(IDevicePopManager.SHA_1);
    }
}
