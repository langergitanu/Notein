package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVJ {
    private String zzZwc;
    private String zzZwd;

    private zzVJ(String str, String str2) {
        this.zzZwd = str;
        this.zzZwc = str2;
    }

    public static zzVJ zzZ(byte[] bArr, com.aspose.words.internal.zzZO0 zzzo0) {
        int i;
        String str = null;
        if (bArr == null) {
            return new zzVJ(null, null);
        }
        int i2 = 4;
        String str2 = null;
        while (i2 < bArr.length && (i = i2 + 4) < bArr.length) {
            short sZzB = com.aspose.words.internal.zzZQK.zzB(bArr, i2);
            short sZzB2 = com.aspose.words.internal.zzZQK.zzB(bArr, i2 + 2);
            if (sZzB == 0 || sZzB == 2) {
                int i3 = i + sZzB2;
                if (i3 > bArr.length) {
                    break;
                }
                if (sZzB2 > 0) {
                    String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(zzzo0.zzR(bArr, i, sZzB2 - 1));
                    if (com.aspose.words.internal.zzZVR.zzWx(strZzU2)) {
                        if (sZzB == 0) {
                            str = strZzU2;
                        } else {
                            str2 = strZzU2;
                        }
                    }
                }
                i2 = i3;
            } else {
                i2 = sZzB2 + i;
            }
        }
        return new zzVJ(str, str2);
    }

    public final String zz17() {
        return this.zzZwc;
    }

    public final String zz18() {
        return this.zzZwd;
    }
}
