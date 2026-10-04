package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz9D extends zz9J {
    private zzIL zzZ5K;
    private zzHZ zzZ5L;
    private zz65 zzZ5M;

    public zz9D(zz8Z zz8z) {
        super(zz8z);
        this.zzZ5L = new zzHZ();
    }

    private static int zzJ0(int i) {
        for (int i2 = 1; i2 <= i; i2++) {
            if (i <= i2 * i2) {
                return i2;
            }
        }
        return 1;
    }

    private long zzX(zzII zzii) {
        return this.zzZ5L.zzZRl().zzZX(zzii.zzZRA()).getSize();
    }

    private void zzY(zzII zzii) {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZX = this.zzZ5L.zzZRl().zzZX(zzii.zzZRA());
        long jZzG = com.aspose.words.internal.zzZPW.zzG(-zzzq4ZzZX.getX(), -zzzq4ZzZX.getY());
        zzI3 zzi3ZzYa = this.zzZ5L.zzZRl().zzYa(this.zzZ5L.zzZRG(), this.zzZ5L.zzZRF());
        for (zzID zzid : zzii.zzZRw()) {
            for (zzIE zzie : zzid.zzZA()) {
                if (!zzie.zzZRK()) {
                    com.aspose.words.internal.zzZQ4 zzzq4ZzR = this.zzZ5L.zzZRm().zzR(this.zzZ5L.zzZRl().zzZX(zzi3ZzYa.zzW(new com.aspose.words.internal.zzZQ4(zzie.zzZE(), zzie.getSize()), zzid.zzZSh().getHeight())), zzzq4ZzZX);
                    zzie.zzZSg().zzXX(new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) + zzzq4ZzR.getX(), com.aspose.words.internal.zzZPW.zzYz(jZzG) + zzzq4ZzR.getY()), zzzq4ZzR.getSize()).zzZE());
                }
            }
        }
    }

    private void zzYW(float f) {
        zzZDL().zzZCH().zzZ(this.zzZ5M.zzZze() * f, (zzZC9) this.zzZ5M);
    }

    private zzIL zzZ(long j, int i, float f) {
        int iZzZRo = this.zzZ5L.zzZRo();
        if (iZzZRo == 0) {
            return new zzIJ(j, this.zzZ5L.zzZRt(), this.zzZ5L.getOffset(), f, zzJ0(i));
        }
        if (iZzZRo == 1) {
            return new zzIK(j, this.zzZ5L.zzZRt(), this.zzZ5L.getOffset(), f);
        }
        if (iZzZRo == 2) {
            return new zzIJ(j, this.zzZ5L.zzZRt(), this.zzZ5L.getOffset(), f, this.zzZ5L.zzZRn());
        }
        throw new IllegalStateException("Unexpected breakpoint parameter.");
    }

    private boolean zzZDo() {
        return this.zzZ5L.zzZRo() != 1;
    }

    @Override // com.aspose.words.zz9K
    public final void zzW(com.aspose.words.internal.zzZYT<String> zzzyt) {
        this.zzZ5L.zzX(zzzyt);
    }

    @Override // com.aspose.words.zz9K
    public final void zzXZ(long j) {
        zzXX(this.zzZ5L.zzZSe().zzZ(zzZDQ(), new com.aspose.words.internal.zzZQ4(0L, j)).zzZE());
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDA() {
        this.zzZ5K = zzZ(this.zzZ5L.zzZRl().zzY9(zzZDv()), zzQw().size(), zzHW.zzW(this.zzZ5M));
        for (zz9K zz9k : zzQw()) {
            this.zzZ5K.zzZ(new zzIE(zz9k, this.zzZ5L.zzZRl().zzY9(zz9k.zzZDQ())));
        }
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDC() {
        zzY(this.zzZ5K.zzZRE());
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDE() {
        return zzZDo() || !(Float.isInfinite(Float.intBitsToFloat((int) zzZDv())) || Float.isInfinite(com.aspose.words.internal.zzZPW.zzYz(zzZDv())));
    }

    @Override // com.aspose.words.zz9J
    public final long zzZDw() {
        return zzX(this.zzZ5K.zzZRE());
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDx() {
        return this.zzZ5K.zzZRC();
    }

    @Override // com.aspose.words.zz9J
    public final boolean zzZDy() {
        return this.zzZ5K.zzZRE().zzZRA().isEmpty();
    }

    @Override // com.aspose.words.zz9J
    public final void zzZDz() {
        zzYW(this.zzZ5K.zzZRE().getScale());
        zzZ(this.zzZ5K);
    }

    @Override // com.aspose.words.zz9K
    public final void zzZE0() {
        super.zzZE0();
        this.zzZ5M = zzZDR().zzHW(30);
        zzZDR().zzHW(1);
        zzZDR().zzHW(4);
        zzZDR().zzHW(15);
    }

    private void zzZ(zzIL zzil) {
        for (zzIE zzie : zzil.zzZRE().zzZRv()) {
            zzZDL().zzZCH().zzZ(this.zzZ5L.zzZRl().zzY8(zzie.getSize()), zzie.zzZSg());
        }
    }
}
