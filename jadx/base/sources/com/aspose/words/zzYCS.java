package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCS {
    public static String zz1(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return "";
        }
        int length = (iArr.length - 1) % 97;
        StringBuilder sb = new StringBuilder(iArr.length - 1);
        for (int i = 0; i < iArr.length - 1; i++) {
            sb.append((char) iArr[i]);
            length = (length + iArr[i]) % 97;
        }
        if (iArr[iArr.length - 1] == length) {
            return zzBc(sb.toString());
        }
        throw new IllegalStateException();
    }

    private static String zzBc(String str) {
        String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 110, 101, 100, 116, PatternStyle.Divot, 116, 120});
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) ^ strZzYP.charAt(i % strZzYP.length())));
        }
        return sb.toString();
    }
}
