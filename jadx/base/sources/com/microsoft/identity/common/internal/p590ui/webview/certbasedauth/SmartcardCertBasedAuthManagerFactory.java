package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import android.content.Context;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.logging.Logger;
import com.yubico.yubikit.android.transport.nfc.OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public class SmartcardCertBasedAuthManagerFactory {
    private static final String TAG = "SmartcardCertBasedAuthManagerFactory";

    public static AbstractNfcSmartcardCertBasedAuthManager createNfcSmartcardCertBasedAuthManager(Context context) {
        try {
            return new YubiKitNfcSmartcardCertBasedAuthManager(context);
        } catch (OooO0OO unused) {
            Logger.info(OooO00o.OooO0OO(new StringBuilder(), TAG, ":createNfcSmartcardCertBasedAuthManager"), "Device does not support NFC capabilities.");
            return null;
        }
    }

    public static AbstractUsbSmartcardCertBasedAuthManager createUsbSmartcardCertBasedAuthManager(Context context) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":createUsbSmartcardCertBasedAuthManager");
        if (context.getSystemService("usb") != null) {
            return new YubiKitUsbSmartcardCertBasedAuthManager(context);
        }
        Logger.info(strOooO0OO, "Certificate Based Authentication via YubiKey not enabled due to device not supporting the USB_SERVICE system service.");
        return null;
    }
}
