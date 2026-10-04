package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.app.Activity;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager;
import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;
import com.yubico.yubikit.android.transport.usb.C23919OooO0oO;
import com.yubico.yubikit.android.transport.usb.OooO;
import com.yubico.yubikit.android.transport.usb.OooO0O0;
import com.yubico.yubikit.core.smartcard.OooO0o;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Callable;
import o0ooooo0.C31884OooO0oO;
import oO00000.C31906OooO0Oo;
import oO00000.OooO00o;
import oO00000o.C31909OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
public class YubiKitUsbSmartcardCertBasedAuthManager extends AbstractUsbSmartcardCertBasedAuthManager {
    private static final String DEVICE_ERROR_MESSAGE = "No USB device is currently connected.";
    private static final String TAG = "YubiKitUsbSmartcardCertBasedAuthManager";
    public static final int YUBICO_VENDOR_ID = 4176;
    private static final Object sDeviceLock = new Object();
    private C23919OooO0oO mUsbDevice;
    private final OooO mUsbYubiKeyManager;

    public YubiKitUsbSmartcardCertBasedAuthManager(Context context) {
        this.mUsbYubiKeyManager = new OooO(context.getApplicationContext());
        Iterator<UsbDevice> it = ((UsbManager) context.getSystemService("usb")).getDeviceList().values().iterator();
        while (it.hasNext()) {
            if (it.next().getVendorId() == 4176) {
                Logger.verbose(TAG, "A YubiKey device is plugged-in upon manager start-up.");
                this.mUsbDeviceInitiallyPluggedIn = true;
                return;
            }
        }
    }

    public OooO00o<OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> getPivProviderCallback() {
        final String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, "getPivProviderCallback:");
        return new OooO00o<OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.3
            @Override // oO00000.OooO00o
            public void invoke(final OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>> oooO00o) {
                synchronized (YubiKitUsbSmartcardCertBasedAuthManager.sDeviceLock) {
                    try {
                        if (YubiKitUsbSmartcardCertBasedAuthManager.this.isDeviceConnected()) {
                            YubiKitUsbSmartcardCertBasedAuthManager.this.mUsbDevice.OooO00o(new OooO00o<C31906OooO0Oo<C31884OooO0oO, IOException>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.3.1
                                @Override // oO00000.OooO00o
                                public void invoke(final C31906OooO0Oo<C31884OooO0oO, IOException> c31906OooO0Oo) {
                                    oooO00o.invoke(C31906OooO0Oo.OooO0OO(new Callable<C31909OooO0o0>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.3.1.1
                                        @Override // java.util.concurrent.Callable
                                        public C31909OooO0o0 call() throws Exception {
                                            return new C31909OooO0o0((OooO0o) c31906OooO0Oo.OooO0O0());
                                        }
                                    }));
                                }
                            });
                        } else {
                            Logger.error(strOooO0OO, YubiKitUsbSmartcardCertBasedAuthManager.DEVICE_ERROR_MESSAGE, null);
                            oooO00o.invoke(C31906OooO0Oo.OooO00o(new Exception(YubiKitUsbSmartcardCertBasedAuthManager.DEVICE_ERROR_MESSAGE)));
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
            z = this.mUsbDevice != null;
        }
        return z;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void onDestroy(Activity activity) {
        stopDiscovery(activity);
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void requestDeviceSession(final AbstractSmartcardCertBasedAuthManager.ISessionCallback iSessionCallback) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, "requestDeviceSession:");
        synchronized (sDeviceLock) {
            try {
                if (isDeviceConnected()) {
                    this.mUsbDevice.OooO00o(new OooO00o<C31906OooO0Oo<C31884OooO0oO, IOException>>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.2
                        @Override // oO00000.OooO00o
                        public void invoke(C31906OooO0Oo<C31884OooO0oO, IOException> c31906OooO0Oo) {
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
        Logger.info(str, "Starting YubiKey discovery for USB");
        this.mUsbYubiKeyManager.OooO0O0(new OooO0O0(), new OooO00o<C23919OooO0oO>() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.1
            @Override // oO00000.OooO00o
            public void invoke(C23919OooO0oO c23919OooO0oO) {
                Logger.info(str, "A YubiKey device was connected via USB.");
                synchronized (YubiKitUsbSmartcardCertBasedAuthManager.sDeviceLock) {
                    try {
                        YubiKitUsbSmartcardCertBasedAuthManager.this.mUsbDevice = c23919OooO0oO;
                        IConnectionCallback iConnectionCallback = YubiKitUsbSmartcardCertBasedAuthManager.this.mConnectionCallback;
                        if (iConnectionCallback != null) {
                            iConnectionCallback.onCreateConnection();
                        }
                        C23919OooO0oO c23919OooO0oO2 = YubiKitUsbSmartcardCertBasedAuthManager.this.mUsbDevice;
                        Runnable runnable = new Runnable() { // from class: com.microsoft.identity.common.internal.ui.webview.certbasedauth.YubiKitUsbSmartcardCertBasedAuthManager.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Logger.info(str, "A YubiKey device was disconnected via USB.");
                                synchronized (YubiKitUsbSmartcardCertBasedAuthManager.sDeviceLock) {
                                    YubiKitUsbSmartcardCertBasedAuthManager.this.mUsbDevice = null;
                                }
                                YubiKeyPivProviderManager.removePivProvider();
                                IDisconnectionCallback iDisconnectionCallback = YubiKitUsbSmartcardCertBasedAuthManager.this.mDisconnectionCallback;
                                if (iDisconnectionCallback != null) {
                                    iDisconnectionCallback.onClosedConnection();
                                }
                            }
                        };
                        if (c23919OooO0oO2.f80266OooOo0o.isTerminated()) {
                            runnable.run();
                        } else {
                            c23919OooO0oO2.f80270OooOoo = runnable;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        return true;
    }

    @Override // com.microsoft.identity.common.internal.p590ui.webview.certbasedauth.AbstractSmartcardCertBasedAuthManager
    public void stopDiscovery(Activity activity) {
        Logger.info(TAG + ":stopDiscovery", "Stopping YubiKey discovery for USB");
        synchronized (sDeviceLock) {
            this.mUsbDevice = null;
            this.mUsbYubiKeyManager.OooO00o();
        }
    }
}
