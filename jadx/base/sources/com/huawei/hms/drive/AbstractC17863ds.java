package com.huawei.hms.drive;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.ds */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17863ds {
    /* JADX INFO: renamed from: a */
    public static AbstractC17863ds m76765a(X509TrustManager x509TrustManager) {
        return C17858dn.m76756e().mo76727a(x509TrustManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo76735a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
