package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYC4 extends zzYBL {
    private int zzXmu;
    private zzY9X zzXmv;
    private Shading zzZ3P;

    public zzYC4(zzY9X zzy9x) {
        this.zzXmv = zzy9x;
    }

    public final Shading getShading() {
        return this.zzZ3P;
    }

    @Override // com.aspose.words.zzYMD
    public final int getX() {
        return 0;
    }

    @Override // com.aspose.words.zzYMD
    public final int getY() {
        return 0;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 2048;
    }

    @Override // com.aspose.words.zzTF
    public final void zzY(zzYMD zzymd, boolean z) throws Exception {
        super.zzY(zzymd, false);
    }

    public final int zzY8M() {
        return this.zzXmu;
    }

    public final zzY9X zzY8N() {
        return this.zzXmv;
    }

    public final void zzZ(Shading shading) {
        this.zzZ3P = shading;
    }

    @Override // com.aspose.words.zzYBL
    public final boolean zzZZK() {
        return zzYo1() != null;
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            super.zzF(zz5.zzZ((zzTF) this, true));
        }
        return super.zzbF();
    }

    public final void zzm4(int i) {
        this.zzXmu = i;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zzqh(int i) {
        zzYMD zzymdZzqh = super.zzqh(i);
        return zzymdZzqh == null ? this.zzXmv.zzqh(i) : zzymdZzqh;
    }
}
