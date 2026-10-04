package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.t7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18364t7 {

    /* JADX INFO: renamed from: a */
    public final EnumC18230j8 f56240a;

    /* JADX INFO: renamed from: b */
    public final C18215i7 f56241b;

    /* JADX INFO: renamed from: c */
    public final List<Certificate> f56242c;

    /* JADX INFO: renamed from: d */
    public final List<Certificate> f56243d;

    public C18364t7(EnumC18230j8 enumC18230j8, C18215i7 c18215i7, List<Certificate> list, List<Certificate> list2) {
        this.f56240a = enumC18230j8;
        this.f56241b = c18215i7;
        this.f56242c = list;
        this.f56243d = list2;
    }

    /* JADX INFO: renamed from: a */
    public C18215i7 m79560a() {
        return this.f56241b;
    }

    /* JADX INFO: renamed from: b */
    public List<Certificate> m79561b() {
        return this.f56243d;
    }

    /* JADX INFO: renamed from: c */
    public Principal m79562c() {
        if (this.f56243d.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f56243d.get(0)).getSubjectX500Principal();
    }

    /* JADX INFO: renamed from: d */
    public List<Certificate> m79563d() {
        return this.f56242c;
    }

    /* JADX INFO: renamed from: e */
    public Principal m79564e() {
        if (this.f56242c.isEmpty()) {
            return null;
        }
        return ((X509Certificate) this.f56242c.get(0)).getSubjectX500Principal();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18364t7)) {
            return false;
        }
        C18364t7 c18364t7 = (C18364t7) obj;
        return this.f56240a.equals(c18364t7.f56240a) && this.f56241b.equals(c18364t7.f56241b) && this.f56242c.equals(c18364t7.f56242c) && this.f56243d.equals(c18364t7.f56243d);
    }

    /* JADX INFO: renamed from: f */
    public EnumC18230j8 m79565f() {
        return this.f56240a;
    }

    public int hashCode() {
        return this.f56243d.hashCode() + ((this.f56242c.hashCode() + ((this.f56241b.hashCode() + ((this.f56240a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f56240a + " cipherSuite=" + this.f56241b + " peerCertificates=" + m79559a(this.f56242c) + " localCertificates=" + m79559a(this.f56243d) + '}';
    }

    /* JADX INFO: renamed from: a */
    public static C18364t7 m79557a(EnumC18230j8 enumC18230j8, C18215i7 c18215i7, List<Certificate> list, List<Certificate> list2) {
        if (enumC18230j8 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        if (c18215i7 != null) {
            return new C18364t7(enumC18230j8, c18215i7, C18313p8.m79372a(list), C18313p8.m79372a(list2));
        }
        throw new NullPointerException("cipherSuite == null");
    }

    /* JADX INFO: renamed from: a */
    public static C18364t7 m79558a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C18215i7 c18215i7M78761a = C18215i7.m78761a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC18230j8 enumC18230j8M78883a = EnumC18230j8.m78883a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM79373a = peerCertificates != null ? C18313p8.m79373a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C18364t7(enumC18230j8M78883a, c18215i7M78761a, listM79373a, localCertificates != null ? C18313p8.m79373a(localCertificates) : Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    private List<String> m79559a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }
}
