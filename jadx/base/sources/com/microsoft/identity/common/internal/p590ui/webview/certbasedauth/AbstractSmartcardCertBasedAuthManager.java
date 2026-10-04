package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractSmartcardCertBasedAuthManager {
    protected IConnectionCallback mConnectionCallback;

    public interface ISessionCallback {
        void onException(Exception exc);

        void onGetSession(ISmartcardSession iSmartcardSession) throws Exception;
    }

    public void clearConnectionCallback() {
        this.mConnectionCallback = null;
    }

    public abstract void initBeforeProceedingWithRequest(ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper);

    public abstract boolean isDeviceConnected();

    public abstract void onDestroy(Activity activity);

    public abstract void requestDeviceSession(ISessionCallback iSessionCallback);

    public void setConnectionCallback(IConnectionCallback iConnectionCallback) {
        this.mConnectionCallback = iConnectionCallback;
    }

    public abstract boolean startDiscovery(Activity activity);

    public abstract void stopDiscovery(Activity activity);
}
