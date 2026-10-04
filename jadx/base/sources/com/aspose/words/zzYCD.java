package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCD {
    private com.aspose.words.internal.zzZG zzOV;
    private com.aspose.words.internal.zzP5 zzSo;
    private zzYC8 zzXn7;
    private zzY61 zzXn8;
    private boolean zzXn9;
    private zzYC5 zzXna;
    private zzYBX zzXnb;
    private com.aspose.words.internal.zzPY zzXnc;
    private com.aspose.words.internal.zzOU zzXnd;
    private Object zzXne;
    private boolean zzXnf;
    private zzZ5I zzXng;
    private long zzXnh = 0;
    private com.aspose.words.internal.zzOW zzXni;
    private Shape zzZ2R;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzG zzbp;

    public zzYCD(zzYC5 zzyc5, zzZL4 zzzl4, IWarningCallback iWarningCallback) {
        this.zzXna = zzyc5;
        this.zzZG0 = iWarningCallback;
        this.zzZ2R = (Shape) zzyc5.zz7u();
        long size = zzyc5.zz7u().getSize();
        long size2 = zzyc5.zz7u().zzYzG().getSize();
        if (!com.aspose.words.internal.zzZPW.zzYF(zzyc5.zzY8U())) {
            size = zzyc5.zzY8U();
            size2 = zzyc5.zzY8T();
        }
        long j = size;
        this.zzXnb = new zzYBX(this.zzZ2R, j, zzzl4);
        this.zzbp = new com.aspose.words.internal.zzG();
        zzYC8 zzyc8ZzZ = zzZLG.zzZ(this.zzZ2R, j, size2, this.zzXnb);
        this.zzXn7 = zzyc8ZzZ;
        this.zzXn8 = new zzY61(this.zzZ2R, this.zzXnb, zzyc8ZzZ);
    }

    private float zzYaf() {
        if (this.zzXne == null) {
            this.zzXne = Float.valueOf((float) Math.max(this.zzXna.zzY8P(), 0.14d));
        }
        return ((Float) this.zzXne).floatValue();
    }

    private boolean zzYao() throws Exception {
        return this.zzZ2R.zzZid() && (this.zzZ2R.getOleFormat() != null && this.zzZ2R.getOleFormat().zzYrB() != null && !this.zzZ2R.getOleFormat().zzYrB().isForms2OleControlInternal()) && this.zzZ2R.getDirectShapeAttr(443) == null && this.zzZ2R.zzZjT();
    }

    private void zzYap() throws Exception {
        zzZAW zzzawZzY9J = this.zzZ2R.zzY9J();
        if (!zzzawZzY9J.getOn() || this.zzZ2R.zzYaB() || zzYao() || zzYCC.zzZx(this.zzZ2R)) {
            this.zzXnc = null;
        } else {
            this.zzXnc = zzXN.zzZ(zzzawZzY9J, this.zzXn7.zzY8Y(), this.zzZ2R.zzYaC() ? (float) this.zzZ2R.getRotation() : 0.0f, this.zzXnb, this.zzXn9, this.zzOV);
        }
    }

    private void zzYaq() throws Exception {
        if (this.zzZ2R.getStroked()) {
            this.zzXnd = zzYLX.zzZ(this.zzZ2R.getStroke(), zzYaf(), this.zzZG0);
        } else {
            this.zzXnd = null;
        }
    }

    private void zzYar() throws Exception {
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        this.zzSo = zzp5;
        zzp5.zze(false);
        com.aspose.words.internal.zzZQG.zzZ(zzRV().zzZ0().zzO7(), this.zzSo);
    }

    private void zzYas() throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        this.zzOV = zzzg;
        zzzg.zzX(zzSe());
        this.zzOV.zzY(zzYak());
        this.zzbp.zzX(this.zzOV);
    }

    public final Shape getShape() {
        return this.zzZ2R;
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    public final void zz1(com.aspose.words.internal.zzG zzg) {
        this.zzbp = zzg;
    }

    public final com.aspose.words.internal.zzG zz7v() {
        return this.zzbp;
    }

    public final void zzQU(boolean z) {
        this.zzXn9 = z;
    }

    public final void zzQV(boolean z) {
        this.zzXnf = z;
    }

    public final com.aspose.words.internal.zzZG zzRV() throws Exception {
        if (this.zzOV == null) {
            zzYas();
        }
        return this.zzOV;
    }

    public final com.aspose.words.internal.zzOU zzSe() throws Exception {
        if (this.zzXnd == null) {
            zzYaq();
        }
        return this.zzXnd;
    }

    public final void zzU(com.aspose.words.internal.zzOW zzow) {
        this.zzXni = zzow;
    }

    public final void zzY(long j, zzZ5I zzz5i) {
        this.zzXnh = j;
        this.zzXng = zzz5i;
    }

    public final zzY61 zzYad() {
        return this.zzXn8;
    }

    public final zzYC8 zzYae() {
        return this.zzXn7;
    }

    public final com.aspose.words.internal.zzOW zzYag() {
        return this.zzXni;
    }

    public final boolean zzYah() {
        return this.zzXnf;
    }

    public final zzZ5I zzYai() {
        return this.zzXng;
    }

    public final long zzYaj() {
        return this.zzXnh;
    }

    public final com.aspose.words.internal.zzPY zzYak() throws Exception {
        com.aspose.words.internal.zzPY zzpy = this.zzXnc;
        if (zzpy == null || (zzpy instanceof com.aspose.words.internal.zzP0)) {
            zzYap();
        }
        return this.zzXnc;
    }

    public final zzYBX zzYal() {
        return this.zzXnb;
    }

    public final void zzYam() {
        this.zzSo = null;
        this.zzXnh = 0L;
        this.zzXnf = false;
        this.zzXni = null;
    }

    public final void zzYan() {
        this.zzOV = null;
        this.zzXnd = null;
        this.zzXne = null;
        zzYam();
    }

    public final void zzYat() {
        this.zzXn8 = new zzY61(this.zzZ2R, this.zzXnb, this.zzXn7);
    }

    public final com.aspose.words.internal.zzP5 zzzz() throws Exception {
        if (this.zzSo == null) {
            zzYar();
        }
        return this.zzSo;
    }
}
