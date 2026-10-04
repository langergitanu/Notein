package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNF {
    public static int zzIx(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return (str.length() * 2) + 2;
        }
        return 2;
    }

    public static void zzU(com.aspose.words.internal.zzZOW zzzow, String str) throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzzow.zzJ((short) 0);
        } else {
            zzzow.zzJ((short) str.length());
            zzzow.writeBytes(zzZZ7.zzWB(true).getBytes(str));
        }
    }

    public static String zzd(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        short sZzX9 = zzzox.zzX9();
        int i = sZzX9 & Short.MAX_VALUE;
        boolean z = (sZzX9 & Short.MIN_VALUE) == 0;
        if (i <= 0) {
            return "";
        }
        if (z) {
            i *= 2;
        }
        return zzZZ7.zzWB(z).zzZn(zzzox.zzn(i));
    }
}
