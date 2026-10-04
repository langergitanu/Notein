package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZS6 extends com.aspose.words.internal.zz6 implements com.aspose.words.internal.zzH2 {
    protected boolean zzYIf;
    private boolean zzYIg;
    protected boolean zzYIh;
    private com.aspose.words.internal.zzP9 zzYIi;
    private com.aspose.words.internal.zzG zzYIj;
    protected zzB zzYIk;
    protected com.aspose.words.internal.zzP9 zzYIl = new com.aspose.words.internal.zzP9();
    protected int zzYMF;
    protected zzZS8 zzYMH;
    protected com.aspose.words.internal.zzG zzp2;

    public zzZS6(zzZS8 zzzs8, int i) {
        this.zzYMH = zzzs8;
        this.zzYMF = i;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        this.zzYIi = zzp9;
        zzp9.zzZ(this.zzYMH.getScaleX(), this.zzYMH.getScaleY(), 0);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        return true;
    }

    public abstract zzB zzZhl();

    public void zzZhm() throws Exception {
        this.zzYIh = true;
    }

    public final com.aspose.words.internal.zzG zzv(com.aspose.words.internal.zzG zzg) throws Exception {
        return zzY(zzg, false);
    }

    public final com.aspose.words.internal.zzG zzY(com.aspose.words.internal.zzG zzg, boolean z) throws Exception {
        this.zzYIf = z;
        this.zzYIk = zzZhl();
        this.zzp2 = new com.aspose.words.internal.zzG();
        zzg.zzZ(this);
        return this.zzp2;
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(com.aspose.words.internal.zzG zzg) throws Exception {
        if (zzg.zzZO() != null) {
            this.zzYIl.zzZ(zzg.zzZO(), 1);
        }
        this.zzYIj = zzg;
        super.zzZ(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        this.zzYIh = false;
        this.zzYIk.zzQ(zzzg.zzZ1());
        this.zzYIk.zzX(zzzg.zzZ2());
        this.zzYIk.zzZ(this.zzYMH.zzZhT(), zzzg.zzZ2(), zzzg.zzZ1());
        zzzg.zzZ0().zzY(this);
        super.zzZ(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public void zzY(com.aspose.words.internal.zzG zzg) throws Exception {
        if (!this.zzYIh) {
            zzZhm();
        }
        super.zzY(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) throws Exception {
        this.zzYIh = false;
        this.zzYIk.zzQ(zzZVJ.zzZ(new com.aspose.words.internal.zzOH(zzzp.getImageBytes(), 4), zzzp.zzZj(), this.zzYMF));
        this.zzYIk.zzZJ(this.zzYMH.zzZhT());
        this.zzYIk.zz4(zzzp.zzZj());
        super.zzZ(zzzp);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
        zzos.zzY(this.zzYIi);
        this.zzYIk.zzY(zzos.zzNu(), this.zzYIg);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        this.zzYIg = zzp5.isClosed();
        return true;
    }
}
