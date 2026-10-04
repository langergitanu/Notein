package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractUsbSmartcardCertBasedAuthManager extends AbstractSmartcardCertBasedAuthManager {
    protected IDisconnectionCallback mDisconnectionCallback;
    protected boolean mUsbDeviceInitiallyPluggedIn;

    public void clearDisconnectionCallback() {
        this.mDisconnectionCallback = null;
    }

    public boolean isUsbDeviceInitiallyPluggedIn() {
        return this.mUsbDeviceInitiallyPluggedIn;
    }

    public void setDisconnectionCallback(IDisconnectionCallback iDisconnectionCallback) {
        this.mDisconnectionCallback = iDisconnectionCallback;
    }
}
