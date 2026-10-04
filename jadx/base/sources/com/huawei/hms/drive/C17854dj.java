package com.huawei.hms.drive;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: com.huawei.hms.drive.dj */
/* JADX INFO: loaded from: classes6.dex */
public class C17854dj extends C17858dn {
    private C17854dj() {
    }

    /* JADX INFO: renamed from: b */
    private Provider m76741b() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76721a(SSLSocket sSLSocket, String str, List<EnumC17796bf> list) {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo76721a(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C17858dn.m76754a(list).toArray(new String[0]));
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: c */
    public SSLContext mo76734c() {
        try {
            return SSLContext.getInstance("TLSv1.3", m76741b());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m76741b());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public String mo76720a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo76720a(sSLSocket);
    }

    /* JADX INFO: renamed from: a */
    public static C17854dj m76740a() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C17854dj();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // com.huawei.hms.drive.C17858dn
    /* JADX INFO: renamed from: a */
    public void mo76742a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
