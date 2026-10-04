package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzH0 extends zz7X {
    private zzZCI zzZgr;
    private int zzZgu;
    private zzZCS zzZgv;
    private zzH1 zzZgw;
    private com.aspose.words.internal.zzEG zzM = null;
    private boolean zzZgt = true;
    private zz3Z zzZgs = new zz3Z();

    private void zzQ(com.aspose.words.internal.zzOH zzoh) {
        if (zzZPZ().isEmpty()) {
            zzoh.zzE(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, this.zzM.getWidth(), this.zzM.getHeight()));
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZQ3 = zzZQ3();
        zzoh.zzE(zzZO(zzzq4ZzZQ3));
        zzoh.zzNb().zzZ(com.aspose.words.internal.zzP9.zzZ(zzzq4ZzZQ3, zzoh.zzNd()), 1);
    }

    private com.aspose.words.internal.zzEG zzT(com.aspose.words.internal.zzEG zzeg) {
        if (this.zzZgu == 0) {
            return zzeg;
        }
        int left = zzeg.getLeft();
        int top = zzeg.getTop();
        int right = zzeg.getRight();
        int bottom = zzeg.getBottom();
        int i = this.zzZgu;
        return com.aspose.words.internal.zzEG.zzZ(left, top, right, bottom, i, i);
    }

    private com.aspose.words.internal.zzZQ4 zzZO(com.aspose.words.internal.zzZQ4 zzzq4) {
        return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzZm() < 0.0f ? 0.0f : zzzq4.zzZm(), zzzq4.zzZo() >= 0.0f ? zzzq4.zzZo() : 0.0f, zzzq4.zzkw() > ((float) this.zzM.getRight()) ? this.zzM.getRight() : zzzq4.zzkw(), zzzq4.zzZn() > ((float) this.zzM.getBottom()) ? this.zzM.getBottom() : zzzq4.zzZn());
    }

    private zzZCI zzZPX() {
        if (this.zzZgr == null) {
            this.zzZgr = new zz88();
        }
        return this.zzZgr;
    }

    private zzHP zzZQ2() {
        for (int size = zzZQ1().zzZQ7().size() - 1; size >= 0; size--) {
            if (zzZQ1().zzZQ7().get(size).getType() == 5) {
                return (zzHP) zzZQ1().zzZQ7().get(size);
            }
        }
        return null;
    }

    @Override // com.aspose.words.zz7X
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zzH0 zzh0 = (zzH0) obj;
        return zzh0.zzZgu == this.zzZgu && zzh0.zzZgt == this.zzZgt && com.aspose.words.internal.zzZKO.equals(zzh0.zzZPZ(), zzZPZ()) && com.aspose.words.internal.zzZKO.equals(zzh0.zzZPY(), zzZPY()) && com.aspose.words.internal.zzZKO.equals(zzh0.zzZQ1(), zzZQ1());
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final int getFillType() {
        zzZCS zzzcs = this.zzZgv;
        return (zzzcs == null || zzzcs.getFillType() == 3) ? 3 : 2;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final byte[] getImageBytes() throws Exception {
        return zzZQ1().getImageBytes();
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final double getOpacity() {
        zzHP zzhpZzZQ2 = zzZQ2();
        if (zzhpZzZQ2 == null) {
            return 1.0d;
        }
        return zzhpZzZQ2.zzZQV();
    }

    @Override // com.aspose.words.zz7X
    public int hashCode() {
        int iHashCode = (super.hashCode() ^ com.aspose.words.internal.zzZKP.zzYs(this.zzZgu)) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZgt);
        if (zzZPZ() != null) {
            iHashCode ^= zzZPZ().hashCode();
        }
        if (zzZPY() != null) {
            iHashCode ^= zzZPY().hashCode();
        }
        return zzZQ1() != null ? iHashCode ^ zzZQ1().hashCode() : iHashCode;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void setOpacity(double d) {
        zzHP zzhpZzZQ2 = zzZQ2();
        if (zzhpZzZQ2 == null) {
            zzhpZzZQ2 = new zzHP();
            zzZQ1().zzZQ7().add(zzhpZzZQ2);
        }
        zzhpZzZQ2.zzYU(d);
    }

    public final void zzLC(int i) {
        this.zzZgu = i;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final Shading zzX(zzGR zzgr) {
        return zzYCL.zzZI(com.aspose.words.internal.zzPV.zzHZ);
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPV zzY(zzGR zzgr) {
        return com.aspose.words.internal.zzPV.zzKa;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final void zzY6(boolean z) {
        this.zzZgt = z;
    }

    @Override // com.aspose.words.zz7X
    public final com.aspose.words.internal.zzPY zzZ(zzGR zzgr) throws Exception {
        byte[] imageBytes = zzZQ1().getImageBytes();
        if (imageBytes == null) {
            return new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzHZ);
        }
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(imageBytes, (byte) 0);
        zzZPX().zzZ(zzoh, zzgr, zzZQ1().zzZQ7());
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(imageBytes);
        this.zzM = zzegZzZT;
        this.zzM = zzT(zzegZzZT);
        zzZ(zzoh, zzgr);
        if (this.zzZgt) {
            zzY(zzoh, zzgr);
        }
        return zzoh;
    }

    public final zzZCS zzZPY() {
        if (this.zzZgv == null) {
            this.zzZgv = new zzGZ();
        }
        return this.zzZgv;
    }

    public final zz3Z zzZPZ() {
        if (this.zzZgs == null) {
            this.zzZgs = new zz3Z();
        }
        return this.zzZgs;
    }

    public final int zzZQ0() {
        return this.zzZgu;
    }

    public final zzH1 zzZQ1() {
        if (this.zzZgw == null) {
            this.zzZgw = new zzH1();
        }
        return this.zzZgw;
    }

    public final com.aspose.words.internal.zzZQ4 zzZQ3() {
        return zzZPZ().zzZu(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, this.zzM.getWidth(), this.zzM.getHeight()));
    }

    @Override // com.aspose.words.zz7X
    public final int zzZQ4() {
        return 0;
    }

    @Override // com.aspose.words.zz7X, com.aspose.words.zzZAW
    public final boolean zzZQ5() {
        return this.zzZgt;
    }

    @Override // com.aspose.words.zz7X
    public final zz7X zzZQ6() {
        zzH0 zzh0 = new zzH0();
        zzh0.zzZgu = this.zzZgu;
        zzh0.zzZgt = this.zzZgt;
        zz3Z zz3z = this.zzZgs;
        if (zz3z != null) {
            zzh0.zzZgs = zz3z.zzZwI();
        }
        zzZCS zzzcs = this.zzZgv;
        if (zzzcs != null) {
            zzh0.zzZgv = zzzcs.zzZPW();
        }
        zzH1 zzh1 = this.zzZgw;
        if (zzh1 != null) {
            zzh0.zzZgw = zzh1.zzZQc();
        }
        return zzh0;
    }

    private static void zzY(com.aspose.words.internal.zzOH zzoh, zzGR zzgr) {
        zzoh.zzNb().zzZ(zz32.zzZ(zzgr, com.aspose.words.internal.zzZPY.zzG(zzgr.zzZPK().getWidth() / 2.0f, zzgr.zzZPK().getHeight() / 2.0f)), 1);
    }

    public final void zzY(zzH1 zzh1) {
        this.zzZgw = zzh1;
    }

    private void zzZ(com.aspose.words.internal.zzOH zzoh, zzGR zzgr) {
        zzQ(zzoh);
        zzZPY().zzZ(zzoh, zzgr, this.zzM);
    }

    public final void zzZ(zz3Z zz3z) {
        this.zzZgs = zz3z;
    }

    public final void zzZ(zzZCS zzzcs) {
        this.zzZgv = zzzcs;
    }
}
