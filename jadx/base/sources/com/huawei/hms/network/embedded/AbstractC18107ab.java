package com.huawei.hms.network.embedded;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.ab */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18107ab {
    /* JADX INFO: renamed from: a */
    public static AbstractC18107ab m77911a(X509TrustManager x509TrustManager) {
        return C18406wa.m79845f().mo79423a(x509TrustManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo77913a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;

    /* JADX INFO: renamed from: a */
    public static AbstractC18107ab m77912a(X509Certificate... x509CertificateArr) {
        return new C18432ya(new C18445za(x509CertificateArr));
    }
}
