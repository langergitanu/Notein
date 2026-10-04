package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzSY extends zzND {
    private zzYBI[] zzZrT;
    private String zzZrU;
    private String zzZrV;

    public zzSY(String str, String str2, String str3) {
        super(str, false);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        com.aspose.words.internal.zzZYD.zzXk(str3);
        com.aspose.words.internal.zzZYD.zzXm(str2);
        com.aspose.words.internal.zzZYD.zzXm(str3);
        this.zzZrV = str2;
        this.zzZrU = str3;
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx(this.zzZrV);
        zzPT zzptZzSx2 = zzps.zzSx(this.zzZrU);
        return new zzSX(zzptZzSx != null ? zzptZzSx.zzZWj().zzZVx() : null, zzptZzSx2 != null ? zzptZzSx2.zzZWj().zzZVx() : null);
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        zzYBI[] zzybiArr = this.zzZrT;
        if (zzybiArr != null) {
            return zzybiArr;
        }
        zzYBI[] zzybiArr2 = {new zzYBI(this.zzZrV, false), new zzYBI(this.zzZrU, false)};
        this.zzZrT = zzybiArr2;
        return zzybiArr2;
    }
}
