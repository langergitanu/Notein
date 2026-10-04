package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUX extends MorphDataControl {
    private zzYO8 zzZxa;

    public zzUX(String str) {
        super(str);
        this.zzZxa = zzYO8.zzh(72.0d, 18.0d);
        zztJ(3);
        zzZ(this.zzZxa);
    }

    @Override // com.aspose.words.OleControl
    public final String getClsidVirtual() {
        return "8bd21d30-ec42-11ce-9e0d-00aa006002f3";
    }

    public final String getFontName() {
        return (String) this.zzYvV.zzPj(31600);
    }

    @Override // com.aspose.words.Forms2OleControl
    public final int getType() {
        return 6;
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
        return 25;
    }

    public final int zzZZV() {
        return ((Integer) this.zzYvV.zzPj(31140)).intValue();
    }

    public final int zzZZW() {
        return ((Integer) this.zzYvV.zzPj(31135)).intValue();
    }
}
