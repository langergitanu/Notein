package o00OO0O;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.File;
import o0000OoO.C24224OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static boolean OooO00o(Context context) {
        int length;
        try {
            if (!Build.HARDWARE.contains("goldfish") && !Build.PRODUCT.contains("sdk") && !Build.FINGERPRINT.contains("generic")) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    String deviceId = telephonyManager.getDeviceId();
                    if (deviceId != null && (length = deviceId.length()) != 0) {
                        for (int i = 0; i < length; i++) {
                            if (Character.isWhitespace(deviceId.charAt(i)) || deviceId.charAt(i) == '0') {
                            }
                        }
                    }
                    return true;
                }
                return C24224OooO00o.OooO0O0(Settings.Secure.getString(context.getContentResolver(), "android_id"));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean OooO0O0() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
