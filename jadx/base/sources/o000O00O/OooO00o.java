package o000O00O;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int OooO00o(int i, String minUiDefaultRotation) {
        String str;
        kotlin.jvm.internal.OooOOO0.OooO0oO(minUiDefaultRotation, "minUiDefaultRotation");
        switch (minUiDefaultRotation.hashCode()) {
            case -1965615621:
                if (!minUiDefaultRotation.equals("ROTATION_RIGHT")) {
                    return -1;
                }
                str = "ORIENTATION_90";
                break;
                break;
            case -895101757:
                if (!minUiDefaultRotation.equals("ROTATION_DOWN")) {
                    return -1;
                }
                str = "ORIENTATION_180";
                break;
                break;
            case -894873560:
                if (!minUiDefaultRotation.equals("ROTATION_LEFT")) {
                    return -1;
                }
                str = "ORIENTATION_270";
                break;
                break;
            case -894804135:
                if (!minUiDefaultRotation.equals("ROTATION_NONE")) {
                    return -1;
                }
                str = "ORIENTATION_0";
                break;
                break;
            default:
                return -1;
        }
        return OooO0O0(i, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int OooO0O0(int i, String orientation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(orientation, "orientation");
        switch (orientation.hashCode()) {
            case -1559565983:
                if (orientation.equals("ORIENTATION_0")) {
                    if (i == 0) {
                        return 0;
                    }
                    if (i == 1) {
                        return 4;
                    }
                    if (i != 2) {
                        return i != 3 ? -1 : 7;
                    }
                    return 3;
                }
                Log.w("TRANSFORM_HINT_RESOLVER", "Unknown orientation \"" + orientation + '\"');
                return -1;
            case -1101904890:
                if (orientation.equals("ORIENTATION_90")) {
                    if (i == 0) {
                        return 4;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            return 7;
                        }
                        if (i == 3) {
                            return 0;
                        }
                    }
                    return 3;
                }
                Log.w("TRANSFORM_HINT_RESOLVER", "Unknown orientation \"" + orientation + '\"');
                return -1;
            case 200679386:
                if (orientation.equals("ORIENTATION_180")) {
                    if (i != 0) {
                        if (i == 1) {
                            return 7;
                        }
                        if (i == 2) {
                            return 0;
                        }
                        if (i == 3) {
                            return 4;
                        }
                    }
                    return 3;
                }
                Log.w("TRANSFORM_HINT_RESOLVER", "Unknown orientation \"" + orientation + '\"');
                return -1;
            case 200680316:
                if (orientation.equals("ORIENTATION_270")) {
                    if (i == 0) {
                        return 7;
                    }
                    if (i == 1) {
                        return 0;
                    }
                    if (i == 2) {
                        return 4;
                    }
                    if (i == 3) {
                        return 3;
                    }
                }
                Log.w("TRANSFORM_HINT_RESOLVER", "Unknown orientation \"" + orientation + '\"');
                return -1;
            default:
                Log.w("TRANSFORM_HINT_RESOLVER", "Unknown orientation \"" + orientation + '\"');
                return -1;
        }
    }
}
