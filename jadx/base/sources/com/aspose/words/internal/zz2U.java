package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2U extends zz21 implements zzFX {
    private zz1D zzh9;
    private zzZOR zzha;
    private zz1D zzhb;
    private int zzhc;
    private int zzhd;

    public zz2U(zz4W zz4w) throws Exception {
        super(zz4w);
        this.zzhb = new zz1D(zzq());
        zzZOR zzzor = new zzZOR();
        this.zzha = zzzor;
        this.zzh9 = new zz1D(zzzor);
    }

    @Override // com.aspose.words.internal.zzFX
    public final zzFY zzF2() {
        return this.zzh9;
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzF3() throws Exception {
        this.zzh9.zzFg();
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzN(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/ObjStm");
        zzfy.zzM("/N", this.zzhc);
        zzfy.zzM("/First", this.zzhd);
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz2V zz2v) {
    }

    public final int zztH() {
        return this.zzhc;
    }

    @Override // com.aspose.words.internal.zz21
    public final void zzuE() throws Exception {
        this.zzhb.zzFg();
        this.zzhd = (int) zzq().getPosition();
        zzq().write(this.zzha.zziA(), 0, (int) this.zzha.getLength());
    }

    @Override // com.aspose.words.internal.zzFX
    public final void zzY(zz33 zz33Var) throws Exception {
        zzuN().zzv3().zzI(zz33Var.zztR(), zztR(), this.zzhc);
        this.zzhb.writeInt(zz33Var.zztR());
        this.zzhb.zzFh();
        this.zzhb.writeInt((int) this.zzha.getPosition());
        this.zzhb.zzFh();
        this.zzhc++;
    }
}
