package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import java.security.cert.X509Certificate;
import oO00000o.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public class YubiKitCertDetails implements ICertDetails {
    private final X509Certificate mCert;
    private final OooO0o mSlot;

    public YubiKitCertDetails(X509Certificate x509Certificate, OooO0o oooO0o) {
        this.mCert = x509Certificate;
        this.mSlot = oooO0o;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.ICertDetails
    public X509Certificate getCertificate() {
        return this.mCert;
    }

    public OooO0o getSlot() {
        return this.mSlot;
    }
}
