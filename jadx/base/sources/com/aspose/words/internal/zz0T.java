package com.aspose.words.internal;

import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0T {
    private static String zzex;
    private static String zzey;
    private static final int zzez = zzso();

    static {
        if (!zzsq()) {
            zzex = "X:\\Aspose.Data\\";
        } else {
            zzey = "/sdcard/";
            zzex = new File(zzey, "Aspose.Data").getPath();
        }
    }

    public static zz0H zzsn() {
        return new zz0H(new Exception("not implement yet"));
    }

    private static int zzso() {
        String property = System.getProperty("os.name");
        if (property.startsWith("Windows")) {
            return 0;
        }
        if (property.startsWith("Mac OS")) {
            return 2;
        }
        return System.getProperty("java.runtime.name").startsWith(AuthenticationConstants.AAD.ADAL_ID_PLATFORM_VALUE) ? 3 : 1;
    }

    public static boolean zzsp() {
        int i = zzez;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public static boolean zzsq() {
        return zzez == 3;
    }

    public static boolean zzsr() {
        return zzez == 1;
    }

    public static boolean zzss() {
        return zzez == 0;
    }

    public static int zzst() {
        return zzez;
    }
}
