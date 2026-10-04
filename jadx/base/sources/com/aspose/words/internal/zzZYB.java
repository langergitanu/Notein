package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYB {
    public static boolean zzW(String str, char c) {
        return str.length() > 0 && str.charAt(0) == c;
    }

    public static void zzZ(char c, char[] cArr) {
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = zzAM.zzV7((c >> '\f') & 15);
        cArr[3] = zzAM.zzV7((c >> '\b') & 15);
        cArr[4] = zzAM.zzV7((c >> 4) & 15);
        cArr[5] = zzAM.zzV7(c & 15);
    }
}
