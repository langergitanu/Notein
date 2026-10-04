package com.aspose.words.internal;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH8 {
    private static final zzZ zzWOW;

    public static final class zzZ {
        public static zzZR1 zzl(String str, String str2, String str3) {
            return new zzZR1(str, str2, str3);
        }
    }

    static {
        zzZ zzz;
        try {
            zzz = new zzZ();
            zzZ.zzl("elem", "http://dummy", "ns");
        } catch (Throwable th) {
            String str = "Could not construct QNameCreator.Helper; assume 3-arg QName constructor not available and use 2-arg method instead. Problem: " + th.getMessage();
            try {
                Logger.getLogger("com.ctc.wstx.compat.QNameCreator").warning(str);
            } catch (Throwable unused) {
                System.err.println("ERROR: failed to log error using Logger (problem " + th.getMessage() + "), original problem: " + str);
            }
            zzz = null;
        }
        zzWOW = zzz;
    }

    public static zzZR1 zzl(String str, String str2, String str3) {
        return zzWOW == null ? new zzZR1(str, str2) : zzZ.zzl(str, str2, str3);
    }
}
