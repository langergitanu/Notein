package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.sa */
/* JADX INFO: loaded from: classes9.dex */
public class C18354sa extends C18406wa {
    /* JADX INFO: renamed from: i */
    public static C18354sa m79535i() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C18354sa();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private Provider m79536j() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: a */
    public void mo79399a(SSLSocket sSLSocket, String str, List<EnumC18132c8> list) throws IOException {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo79399a(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C18406wa.m79840a(list).toArray(new String[0]));
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public String mo79400b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo79400b(sSLSocket);
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: c */
    public X509TrustManager mo79431c(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo79431c(sSLSocketFactory);
        }
        try {
            Object objM79839a = C18406wa.m79839a(sSLSocketFactory, (Class<Object>) Object.class, "sslParameters");
            if (objM79839a != null) {
                return (X509TrustManager) C18406wa.m79839a(objM79839a, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public SSLContext mo79429b() {
        try {
            return SSLContext.getInstance("TLSv1.3", m79536j());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m79536j());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.C18406wa
    /* JADX INFO: renamed from: b */
    public void mo79537b(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
