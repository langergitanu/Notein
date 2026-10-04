package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.Context;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;
import com.yubico.yubikit.android.transport.nfc.C23914OooO0o0;
import com.yubico.yubikit.android.transport.nfc.OooO;
import com.yubico.yubikit.android.transport.nfc.OooO0OO;
import com.yubico.yubikit.android.transport.nfc.OooO0o;
import com.yubico.yubikit.android.transport.nfc.OooOO0O;
import com.yubico.yubikit.android.transport.nfc.RunnableC23915OooO0oO;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import oO00000.C31906OooO0Oo;
import oO00000o.C31909OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
public class YubiKitNfcSmartcardCertBasedAuthManager extends AbstractNfcSmartcardCertBasedAuthManager {
    private static final String DEVICE_ERROR_MESSAGE = "No NFC device is currently connected.";
    private static final int NFC_TIMEOUT = 5000;
    private static final String TAG = "YubiKitNfcSmartcardCertBasedAuthManager";
    private static final Object sDeviceLock = new Object();
    private OooO mNfcDevice;
    private final OooOO0O mNfcYubiKitManager;
    private byte[] mTagId;

    public YubiKitNfcSmartcardCertBasedAuthManager(Context context) throws OooO0OO {
        this.mNfcYubiKitManager = new OooOO0O(context.getApplicationContext());
        this.isDeviceChanged = false;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractNfcSmartcardCertBasedAuthManager
    public void disconnect(final IDisconnectionCallback iDisconnectionCallback) {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":disconnect");
        synchronized (sDeviceLock) {
            try {
                OooO oooO = this.mNfcDevice;
                if (oooO != null) {
                    Runnable runnable = new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.4
                        @Override // java.lang.Runnable
                        public void run() {
                            Logger.info(strOooO0OO, "YubiKey connected via NFC has been disconnected");
                            YubiKitNfcSmartcardCertBasedAuthManager.this.mNfcDevice = null;
                            iDisconnectionCallback.onClosedConnection();
                        }
                    };
                    oooO.f80223OooOo0o.set(true);
                    oooO.f80222OooOo.submit(new RunnableC23915OooO0oO(oooO, runnable));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> getPivProviderCallback() {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, "getPivProviderCallback:");
        return new oO00000.OooO00o<oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.3
            @Override // oO00000.OooO00o
            public void invoke(final oO00000.OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>> oooO00o) {
                synchronized (YubiKitNfcSmartcardCertBasedAuthManager.sDeviceLock) {
                    try {
                        if (YubiKitNfcSmartcardCertBasedAuthManager.this.isDeviceConnected()) {
                            YubiKitNfcSmartcardCertBasedAuthManager.this.mNfcDevice.OooO0OO(new oO00000.OooO00o<C31906OooO0Oo<OooO0o, IOException>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.3.1
                                @Override // oO00000.OooO00o
                                public void invoke(final C31906OooO0Oo<OooO0o, IOException> c31906OooO0Oo) {
                                    oooO00o.invoke(C31906OooO0Oo.OooO0OO(new Callable<C31909OooO0o0>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.3.1.1
                                        @Override // java.util.concurrent.Callable
                                        public C31909OooO0o0 call() throws Exception {
                                            return new C31909OooO0o0((com.yubico.yubikit.core.smartcard.OooO0o) c31906OooO0Oo.OooO0O0());
                                        }
                                    }));
                                }
                            });
                        } else {
                            Logger.error(strOooO0OO, YubiKitNfcSmartcardCertBasedAuthManager.DEVICE_ERROR_MESSAGE, null);
                            oooO00o.invoke(C31906OooO0Oo.OooO00o(new Exception(YubiKitNfcSmartcardCertBasedAuthManager.DEVICE_ERROR_MESSAGE)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void initBeforeProceedingWithRequest(ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper) {
        YubiKeyPivProviderManager.addPivProvider(iCertBasedAuthTelemetryHelper, getPivProviderCallback());
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public boolean isDeviceConnected() {
        boolean z;
        synchronized (sDeviceLock) {
            z = this.mNfcDevice != null;
        }
        return z;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void onDestroy(Activity activity) {
        YubiKeyPivProviderManager.removePivProvider();
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void requestDeviceSession(final AbstractSmartcardCertBasedAuthManager.ISessionCallback iSessionCallback) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, "requestDeviceSession:");
        synchronized (sDeviceLock) {
            try {
                if (isDeviceConnected()) {
                    this.mNfcDevice.OooO0OO(new oO00000.OooO00o<C31906OooO0Oo<OooO0o, IOException>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.2
                        @Override // oO00000.OooO00o
                        public void invoke(C31906OooO0Oo<OooO0o, IOException> c31906OooO0Oo) {
                            try {
                                iSessionCallback.onGetSession(new YubiKitSmartcardSession(new C31909OooO0o0(c31906OooO0Oo.OooO0O0())));
                            } catch (Exception e) {
                                iSessionCallback.onException(e);
                            }
                        }
                    });
                } else {
                    Logger.error(strOooO0OO, DEVICE_ERROR_MESSAGE, null);
                    iSessionCallback.onException(new Exception());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public boolean startDiscovery(Activity activity) {
        final String str = TAG + ":startDiscovery";
        Logger.info(str, "Starting YubiKey discovery for NFC");
        try {
            OooOO0O oooOO0O = this.mNfcYubiKitManager;
            com.yubico.yubikit.android.transport.nfc.OooO00o oooO00o = new com.yubico.yubikit.android.transport.nfc.OooO00o();
            oooO00o.f80226OooO00o = 5000;
            oooOO0O.OooO00o(activity, oooO00o, new oO00000.OooO00o<OooO>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitNfcSmartcardCertBasedAuthManager.1
                @Override // oO00000.OooO00o
                public void invoke(OooO oooO) {
                    Logger.info(str, "A YubiKey device was connected via NFC.");
                    YubiKitNfcSmartcardCertBasedAuthManager.this.mNfcDevice = oooO;
                    byte[] id = YubiKitNfcSmartcardCertBasedAuthManager.this.mNfcDevice.f80225OooOoO0.getId();
                    YubiKitNfcSmartcardCertBasedAuthManager yubiKitNfcSmartcardCertBasedAuthManager = YubiKitNfcSmartcardCertBasedAuthManager.this;
                    yubiKitNfcSmartcardCertBasedAuthManager.isDeviceChanged = (yubiKitNfcSmartcardCertBasedAuthManager.mTagId == null || Arrays.equals(YubiKitNfcSmartcardCertBasedAuthManager.this.mTagId, id)) ? false : true;
                    YubiKitNfcSmartcardCertBasedAuthManager.this.mTagId = id;
                    IConnectionCallback iConnectionCallback = YubiKitNfcSmartcardCertBasedAuthManager.this.mConnectionCallback;
                    if (iConnectionCallback != null) {
                        iConnectionCallback.onCreateConnection();
                    }
                }
            });
            return false;
        } catch (OooO0OO unused) {
            Logger.info(str, "Device has NFC functionality turned off.");
            return true;
        }
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void stopDiscovery(Activity activity) {
        Logger.info(TAG + ":stopDiscovery", "Stopping YubiKey discovery for NFC");
        synchronized (sDeviceLock) {
            this.mNfcDevice = null;
            OooOO0O oooOO0O = this.mNfcYubiKitManager;
            ExecutorService executorService = oooOO0O.f80241OooO0OO;
            if (executorService != null) {
                executorService.shutdown();
                oooOO0O.f80241OooO0OO = null;
            }
            ((C23914OooO0o0) oooOO0O.f80240OooO0O0).f80231OooO00o.disableReaderMode(activity);
        }
    }
}
