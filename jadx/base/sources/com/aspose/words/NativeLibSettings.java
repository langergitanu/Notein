package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
public final class NativeLibSettings {
    private NativeLibSettings() {
    }

    public static String getTmpDirectoryPath() {
        return com.aspose.words.internal.zzZKN.zzU3(System.getProperty("com.aspose.tmpdir")) ? System.getProperty("java.io.tmpdir") : System.getProperty("com.aspose.tmpdir");
    }

    public static boolean isHarfBuzzNativeLibLoaded() {
        return System.getProperty("com.aspose.skip_hb_native_lib") == null;
    }

    public static boolean isWinNativeLibLoaded() {
        return System.getProperty("com.aspose.skip_win_native_lib") == null;
    }

    public static void loadHarfBuzzNativeLib() {
        System.clearProperty("com.aspose.skip_hb_native_lib");
    }

    public static void loadWinNativeLib() {
        System.clearProperty("com.aspose.skip_win_native_lib");
    }

    public static void setTmpDirectoryPath(String str) throws IllegalArgumentException {
        if (com.aspose.words.internal.zzZKN.zzU3(str) || !com.aspose.words.internal.zzZOQ.zzVc(str)) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Custom path ", str, " is invalid"));
        }
        System.setProperty("com.aspose.tmpdir", str);
    }

    public static void skipHarfBuzzNativeLib() {
        System.setProperty("com.aspose.skip_hb_native_lib", TelemetryEventStrings.Value.TRUE);
    }

    public static void skipWinNativeLib() {
        System.setProperty("com.aspose.skip_win_native_lib", TelemetryEventStrings.Value.TRUE);
    }
}
