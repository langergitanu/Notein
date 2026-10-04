package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractNfcSmartcardCertBasedAuthManager extends AbstractSmartcardCertBasedAuthManager {
    protected boolean isDeviceChanged;

    public abstract void disconnect(IDisconnectionCallback iDisconnectionCallback);

    public boolean isDeviceChanged() {
        return this.isDeviceChanged;
    }
}
