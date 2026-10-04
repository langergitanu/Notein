package OooOOOo;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {
    public static boolean OooO00o(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean OooO0O0(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
