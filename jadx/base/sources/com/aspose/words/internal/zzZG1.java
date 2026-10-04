package com.aspose.words.internal;

import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG1 extends zzZG3 {
    String zzWMX;
    final char[] zzWMY;
    protected final zzZQY zzWMZ;

    public zzZG1(zzZQY zzzqy, String str, URL url, char[] cArr, zzZQY zzzqy2) {
        super(zzzqy, str, url);
        this.zzWMX = null;
        this.zzWMY = cArr;
        this.zzWMZ = zzzqy2;
    }

    public static zzZG1 zzR(String str, char[] cArr) {
        zzZF2 zzzf2ZzXN8 = zzZF2.zzXN8();
        return new zzZG1(zzzf2ZzXN8, str, null, cArr, zzzf2ZzXN8);
    }

    public static zzZG1 zzXP(String str, String str2) {
        return zzR(str, str2.toCharArray());
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getNotationName() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getPublicId() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getSystemId() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final boolean isExternal() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final boolean zzXNK() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final zzZF1 zzZ(zzZF1 zzzf1, zzZQT zzzqt, zzZHC zzzhc, int i) {
        String str = this.mName;
        char[] cArr = this.zzWMY;
        return zzZFD.zzZ(zzzf1, str, cArr, cArr.length, this.zzWMZ);
    }

    @Override // com.aspose.words.internal.zzZG3, com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String zzlc() {
        if (this.zzWMX == null) {
            char[] cArr = this.zzWMY;
            this.zzWMX = cArr.length == 0 ? "" : new String(cArr);
        }
        return this.zzWMX;
    }
}
