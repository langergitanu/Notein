package com.huawei.hms.drive;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.huawei.hms.drive.ax */
/* JADX INFO: loaded from: classes6.dex */
public final class C17787ax {

    /* JADX INFO: renamed from: a */
    private final EnumC17803bm f52746a;

    /* JADX INFO: renamed from: b */
    private final C17778ao f52747b;

    /* JADX INFO: renamed from: c */
    private final List<Certificate> f52748c;

    /* JADX INFO: renamed from: d */
    private final List<Certificate> f52749d;

    private C17787ax(EnumC17803bm enumC17803bm, C17778ao c17778ao, List<Certificate> list, List<Certificate> list2) {
        this.f52746a = enumC17803bm;
        this.f52747b = c17778ao;
        this.f52748c = list;
        this.f52749d = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C17787ax m76066a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C17778ao c17778aoM75990a = C17778ao.m75990a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC17803bm enumC17803bmM76319a = EnumC17803bm.m76319a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM76333a = peerCertificates != null ? C17806bp.m76333a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C17787ax(enumC17803bmM76319a, c17778aoM75990a, listM76333a, localCertificates != null ? C17806bp.m76333a(localCertificates) : Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: b */
    public List<Certificate> m76068b() {
        return this.f52748c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17787ax)) {
            return false;
        }
        C17787ax c17787ax = (C17787ax) obj;
        return this.f52746a.equals(c17787ax.f52746a) && this.f52747b.equals(c17787ax.f52747b) && this.f52748c.equals(c17787ax.f52748c) && this.f52749d.equals(c17787ax.f52749d);
    }

    public int hashCode() {
        return this.f52749d.hashCode() + ((this.f52748c.hashCode() + ((this.f52747b.hashCode() + ((this.f52746a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: a */
    public C17778ao m76067a() {
        return this.f52747b;
    }
}
