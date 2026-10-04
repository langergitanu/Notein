package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYK extends zzYYJ {
    private zzYYK(String str, String str2, int i) {
        super(i, str, str2, i);
    }

    public static zzYYK zzHP(String str) {
        String strSubstring = str.substring(8, 18);
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(strSubstring);
        if (iZzZo == Integer.MIN_VALUE) {
            return null;
        }
        return new zzYYK(str, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("bm", strSubstring), iZzZo);
    }

    @Override // com.aspose.words.zzYYJ
    public final int zzaP() {
        return 0;
    }
}
