package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzGY implements zzZCS {
    private int zzUG;
    private double zzZgm;
    private int zzZgn;
    private double zzZgp;
    private double zzZgo = 1.0d;
    private double zzZgl = 1.0d;

    private void zzO(com.aspose.words.internal.zzOH zzoh) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((float) this.zzZgp, (float) this.zzZgm, 1);
        zzoh.zzNb().zzZ(zzp9, 1);
    }

    private void zzP(com.aspose.words.internal.zzOH zzoh) {
        int i = this.zzZgn;
        if (i == 0) {
            zzoh.zzXR(0);
            return;
        }
        if (i == 1) {
            zzoh.zzXR(1);
        } else if (i == 2) {
            zzoh.zzXR(2);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException();
            }
            zzoh.zzXR(3);
        }
    }

    private void zzY(com.aspose.words.internal.zzOH zzoh, zzGR zzgr, com.aspose.words.internal.zzEG zzeg) {
        float f;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fZzYC;
        float fZzYC2;
        float fIntBitsToFloat3 = 0.0f;
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzeg.zzDQ(), zzeg.zzDP());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ((float) this.zzZgo, (float) this.zzZgl, 1);
        com.aspose.words.internal.zzZQ4 zzzq4ZzO = zzp9.zzO(zzzq4);
        long jZzB = com.aspose.words.internal.zzJ6.zzB(zzzq4ZzO);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZPK = zzgr.zzZPK();
        com.aspose.words.internal.zzZQ4 zzzq42 = new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZPK.getWidth(), zzzq4ZzZPK.getHeight());
        long jZzB2 = com.aspose.words.internal.zzJ6.zzB(zzzq42);
        switch (this.zzUG) {
            case 0:
                f = 0.0f;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 1:
                fIntBitsToFloat = Float.intBitsToFloat((int) jZzB2);
                fIntBitsToFloat2 = Float.intBitsToFloat((int) jZzB);
                float f2 = fIntBitsToFloat3;
                fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat2;
                f = f2;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 2:
                fIntBitsToFloat = zzzq42.zzkw();
                fIntBitsToFloat2 = zzzq4ZzO.zzkw();
                float f22 = fIntBitsToFloat3;
                fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat2;
                f = f22;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 3:
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzB2);
                fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzB);
                f = fZzYC - fZzYC2;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 4:
                fIntBitsToFloat3 = Float.intBitsToFloat((int) jZzB2) - Float.intBitsToFloat((int) jZzB);
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzB2);
                fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(jZzB);
                f = fZzYC - fZzYC2;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 5:
                fIntBitsToFloat3 = com.aspose.words.internal.zzZPY.zzYC(jZzB2) - com.aspose.words.internal.zzZPY.zzYC(jZzB);
                fIntBitsToFloat = zzzq42.zzkw();
                fIntBitsToFloat2 = zzzq4ZzO.zzkw();
                float f222 = fIntBitsToFloat3;
                fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat2;
                f = f222;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 6:
                fZzYC = zzzq42.zzZn();
                fZzYC2 = zzzq4ZzO.zzZn();
                f = fZzYC - fZzYC2;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 7:
                fIntBitsToFloat3 = zzzq42.zzZn() - zzzq4ZzO.zzZn();
                fIntBitsToFloat = Float.intBitsToFloat((int) jZzB2);
                fIntBitsToFloat2 = Float.intBitsToFloat((int) jZzB);
                float f2222 = fIntBitsToFloat3;
                fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat2;
                f = f2222;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            case 8:
                fIntBitsToFloat3 = zzzq42.zzZn() - zzzq4ZzO.zzZn();
                fIntBitsToFloat = zzzq42.zzkw();
                fIntBitsToFloat2 = zzzq4ZzO.zzkw();
                float f22222 = fIntBitsToFloat3;
                fIntBitsToFloat3 = fIntBitsToFloat - fIntBitsToFloat2;
                f = f22222;
                zzoh.zzNb().zzY(fIntBitsToFloat3, f, 1);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzGY zzgy = (zzGY) obj;
        return zzgy.zzUG == this.zzUG && zzgy.zzZgn == this.zzZgn && com.aspose.words.internal.zzAN.zzL(zzgy.zzZgp, this.zzZgp) && com.aspose.words.internal.zzAN.zzL(zzgy.zzZgo, this.zzZgo) && com.aspose.words.internal.zzAN.zzL(zzgy.zzZgm, this.zzZgm) && com.aspose.words.internal.zzAN.zzL(zzgy.zzZgl, this.zzZgl);
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    @Override // com.aspose.words.zzZCS
    public final int getFillType() {
        return 2;
    }

    public int hashCode() {
        return ((((this.zzUG ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgp)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgo)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgm)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgl)) ^ this.zzZgn;
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void zzLB(int i) {
        this.zzZgn = i;
    }

    public final void zzYM(double d) {
        this.zzZgm = d;
    }

    public final void zzYN(double d) {
        this.zzZgp = d;
    }

    public final void zzYO(double d) {
        this.zzZgl = d;
    }

    public final void zzYP(double d) {
        this.zzZgo = d;
    }

    @Override // com.aspose.words.zzZCS
    public final void zzZ(com.aspose.words.internal.zzOH zzoh, zzGR zzgr, com.aspose.words.internal.zzEG zzeg) {
        zzP(zzoh);
        zzY(zzoh, zzeg);
        zzY(zzoh, zzgr, zzeg);
        zzO(zzoh);
    }

    @Override // com.aspose.words.zzZCS
    public final boolean zzZPU() {
        return false;
    }

    @Override // com.aspose.words.zzZCS
    public final zzZCS zzZPW() {
        zzGY zzgy = new zzGY();
        zzgy.zzUG = this.zzUG;
        zzgy.zzZgp = this.zzZgp;
        zzgy.zzZgo = this.zzZgo;
        zzgy.zzZgm = this.zzZgm;
        zzgy.zzZgl = this.zzZgl;
        zzgy.zzZgn = this.zzZgn;
        return zzgy;
    }

    @Override // com.aspose.words.zzZCS
    public final void zzZ(zzZYD zzzyd) {
        boolean z = zzzyd.zzZtY() == 2;
        zzzyd.zzY("a:tile");
        zzzyd.zzO("tx", this.zzZgp);
        zzzyd.zzO("ty", this.zzZgm);
        zzzyd.zz0("sx", zz3W.zzS(this.zzZgo, z));
        zzzyd.zz0("sy", zz3W.zzS(this.zzZgl, z));
        zzzyd.zz0("flip", zz84.zzIO(this.zzZgn));
        zzzyd.zz0("algn", zz84.zzIw(this.zzUG));
        zzzyd.zzo();
    }

    private void zzY(com.aspose.words.internal.zzOH zzoh, com.aspose.words.internal.zzEG zzeg) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ((float) this.zzZgo, (float) this.zzZgl, 1);
        zzp9.zzZ((float) ((1.0d / zzeg.getHorizontalResolution()) * 72.0d), (float) ((1.0d / zzeg.getVerticalResolution()) * 72.0d), 1);
        zzoh.zzNb().zzZ(zzp9, 1);
    }
}
