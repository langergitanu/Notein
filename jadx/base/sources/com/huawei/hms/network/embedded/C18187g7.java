package com.huawei.hms.network.embedded;

import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.hms.network.base.util.HttpUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18187g7 {

    /* JADX INFO: renamed from: c */
    public static final C18187g7 f54915c = new a().m78569a();

    /* JADX INFO: renamed from: a */
    public final Set<b> f54916a;

    /* JADX INFO: renamed from: b */
    public final AbstractC18107ab f54917b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<b> f54918a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public a m78568a(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.f54918a.add(new b(str, str2));
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18187g7 m78569a() {
            return new C18187g7(new LinkedHashSet(this.f54918a), null);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g7$b */
    public static final class b {

        /* JADX INFO: renamed from: e */
        public static final String f54919e = "*.";

        /* JADX INFO: renamed from: a */
        public final String f54920a;

        /* JADX INFO: renamed from: b */
        public final String f54921b;

        /* JADX INFO: renamed from: c */
        public final String f54922c;

        /* JADX INFO: renamed from: d */
        public final C18303ob f54923d;

        public b(String str, String str2) {
            String strConcat;
            int i;
            this.f54920a = str;
            if (str.startsWith(f54919e)) {
                strConcat = HttpUtils.HTTP_PREFIX + str.substring(2);
            } else {
                strConcat = HttpUtils.HTTP_PREFIX.concat(str);
            }
            this.f54921b = C18416x7.m79913f(strConcat).m79929h();
            if (str2.startsWith("sha1/")) {
                this.f54922c = "sha1/";
                i = 5;
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                }
                this.f54922c = "sha256/";
                i = 7;
            }
            this.f54923d = C18303ob.m79290a(str2.substring(i));
            if (this.f54923d == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(str2));
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m78570a(String str) {
            if (!this.f54920a.startsWith(f54919e)) {
                return str.equals(this.f54921b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f54921b.length()) {
                return false;
            }
            String str2 = this.f54921b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f54920a.equals(bVar.f54920a) && this.f54922c.equals(bVar.f54922c) && this.f54923d.equals(bVar.f54923d);
        }

        public int hashCode() {
            return this.f54923d.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(527, 31, this.f54920a), 31, this.f54922c);
        }

        public String toString() {
            return this.f54922c + this.f54923d.mo78727b();
        }
    }

    public C18187g7(Set<b> set, AbstractC18107ab abstractC18107ab) {
        this.f54916a = set;
        this.f54917b = abstractC18107ab;
    }

    /* JADX INFO: renamed from: b */
    public static C18303ob m78563b(X509Certificate x509Certificate) {
        return C18303ob.m79300e(x509Certificate.getPublicKey().getEncoded()).mo78735h();
    }

    /* JADX INFO: renamed from: a */
    public C18187g7 m78564a(AbstractC18107ab abstractC18107ab) {
        return Objects.equals(this.f54917b, abstractC18107ab) ? this : new C18187g7(this.f54916a, abstractC18107ab);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18187g7)) {
            return false;
        }
        C18187g7 c18187g7 = (C18187g7) obj;
        return Objects.equals(this.f54917b, c18187g7.f54917b) && this.f54916a.equals(c18187g7.f54916a);
    }

    public int hashCode() {
        return this.f54916a.hashCode() + (Objects.hashCode(this.f54917b) * 31);
    }

    /* JADX INFO: renamed from: a */
    public static C18303ob m78561a(X509Certificate x509Certificate) {
        return C18303ob.m79300e(x509Certificate.getPublicKey().getEncoded()).mo78734g();
    }

    /* JADX INFO: renamed from: a */
    public static String m78562a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m78563b((X509Certificate) certificate).mo78727b();
    }

    /* JADX INFO: renamed from: a */
    public List<b> m78565a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f54916a) {
            if (bVar.m78570a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m78566a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listM78565a = m78565a(str);
        if (listM78565a.isEmpty()) {
            return;
        }
        AbstractC18107ab abstractC18107ab = this.f54917b;
        if (abstractC18107ab != null) {
            list = abstractC18107ab.mo77913a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listM78565a.size();
            C18303ob c18303obM78563b = null;
            C18303ob c18303obM78561a = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = listM78565a.get(i2);
                if (bVar.f54922c.equals("sha256/")) {
                    if (c18303obM78563b == null) {
                        c18303obM78563b = m78563b(x509Certificate);
                    }
                    if (bVar.f54923d.equals(c18303obM78563b)) {
                        return;
                    }
                } else {
                    if (!bVar.f54922c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f54922c);
                    }
                    if (c18303obM78561a == null) {
                        c18303obM78561a = m78561a(x509Certificate);
                    }
                    if (bVar.f54923d.equals(c18303obM78561a)) {
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
            sb.append(m78562a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(C18241k5.f55433h);
        int size4 = listM78565a.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = listM78565a.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public void m78567a(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        m78566a(str, Arrays.asList(certificateArr));
    }
}
