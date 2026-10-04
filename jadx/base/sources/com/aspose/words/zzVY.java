package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVY extends MorphDataControl {
    private zzYO8 zzZxa;

    public zzVY(String str) {
        super(str);
        this.zzZxa = zzYO8.zzh(108.0d, 18.0d);
        zztJ(4);
        zzZ(this.zzZxa);
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "8bd21d40-ec42-11ce-9e0d-00aa006002f3";
    }

    public final String getFontName() {
        return (String) this.zzYvV.zzPj(31600);
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 3;
    }

    public final int zz1B() {
        return ((Integer) this.zzYvV.zzPj(31625)).intValue();
    }

    public final int zz1C() {
        return ((Integer) this.zzYvV.zzPj(31605)).intValue();
    }

    public final int zz1D() {
        return ((Integer) this.zzYvV.zzPj(31610)).intValue();
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int zz1E() {
        return 26;
    }
}
