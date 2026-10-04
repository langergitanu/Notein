package com.microsoft.identity.common.internal.p590ui.webview.certbasedauth;

import com.microsoft.identity.common.java.opentelemetry.ICertBasedAuthTelemetryHelper;
import com.microsoft.identity.common.logging.Logger;
import java.security.Security;
import oO00000.C31906OooO0Oo;
import oO00000.OooO00o;
import oO00000o.C31909OooO0o0;
import oO0000O.C31924OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public class YubiKeyPivProviderManager {
    private static final String TAG = "YubiKeyPivProviderManager";
    protected static final String YUBIKEY_PROVIDER = "YKPiv";

    public static void addPivProvider(ICertBasedAuthTelemetryHelper iCertBasedAuthTelemetryHelper, OooO00o<OooO00o<C31906OooO0Oo<C31909OooO0o0, Exception>>> oooO00o) {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":addPivProvider");
        if (Security.getProvider(YUBIKEY_PROVIDER) != null) {
            Security.removeProvider(YUBIKEY_PROVIDER);
            iCertBasedAuthTelemetryHelper.setExistingPivProviderPresent(true);
            Logger.info(strOooO0OO, "Existing PivProvider was present in Security static list.");
        } else {
            iCertBasedAuthTelemetryHelper.setExistingPivProviderPresent(false);
            Logger.info(strOooO0OO, "Security static list does not have existing PivProvider.");
        }
        Security.insertProviderAt(new C31924OooOoO(oooO00o), 1);
        Logger.info(strOooO0OO, "An instance of PivProvider was added to Security static list.");
    }

    public static void removePivProvider() {
        if (Security.getProvider(YUBIKEY_PROVIDER) == null) {
            return;
        }
        Security.removeProvider(YUBIKEY_PROVIDER);
        Logger.info(TAG, "An instance of PivProvider was removed from Security static list.");
    }
}
