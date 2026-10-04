package androidx.biometric;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static boolean OooO00o(int i) {
        return (i & 32768) != 0;
    }

    public static boolean OooO0O0(int i) {
        if (i != 15 && i != 255) {
            if (i == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i != 32783) {
                return i == 33023 || i == 0;
            }
            int i2 = Build.VERSION.SDK_INT;
            return i2 < 28 || i2 > 29;
        }
        return true;
    }
}
