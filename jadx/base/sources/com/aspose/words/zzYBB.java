package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYBB extends zzZS6 {
    private boolean zzXea;
    private boolean zzXeb;
    private boolean zzYIm;
    private com.aspose.words.internal.zzG zzZg1;

    public zzYBB(zzZS8 zzzs8, int i) {
        super(zzzs8, i);
        this.zzXeb = (com.aspose.words.internal.zzAN.zzf(this.zzYMH.zzZhQ()) || (com.aspose.words.internal.zzAN.zzf(this.zzYMH.zzZhN()) && com.aspose.words.internal.zzAN.zzf(this.zzYMH.zzZhM()))) ? false : true;
    }

    private com.aspose.words.internal.zzP9 zzY5(float f) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzYMH.zzZT());
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZT());
        zzp9.zzY(-fIntBitsToFloat, -fZzYC, 1);
        zzp9.zzX(f, 1);
        zzp9.zzY(fIntBitsToFloat, fZzYC, 1);
        return zzp9;
    }

    private zzZVR zzY7W() {
        float fSin;
        com.aspose.words.internal.zzQ6 zzq6;
        if (this.zzYMH.zzZhy() == 1) {
            zzq6 = new com.aspose.words.internal.zzQ6(((double) Float.intBitsToFloat((int) this.zzYMH.zzZhP())) - (this.zzYMH.zzZhO().zzQb() + ((double) Float.intBitsToFloat((int) this.zzYMH.zzZT()))), ((double) com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZhP())) - (this.zzYMH.zzZhO().zzYm() + ((double) com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZT()))), -this.zzYMH.zzZhO().zzQa());
        } else {
            float f = 0.0f;
            if (this.zzYMH.zzZhR() != 0.0f) {
                double dZzZL = (float) (3.141592653589793d - com.aspose.words.internal.zzAN.zzZL(this.zzYMH.zzZhR()));
                float fCos = ((float) Math.cos(dZzZL)) / 2.0f;
                fSin = ((float) Math.sin(dZzZL)) / 2.0f;
                f = fCos;
            } else {
                fSin = 0.0f;
            }
            zzq6 = new com.aspose.words.internal.zzQ6(-f, -fSin, -1.0d);
        }
        return zzZ(zzq6, new com.aspose.words.internal.zzQ9(this.zzYMH.zzZhO().zzQb() + ((double) Float.intBitsToFloat((int) this.zzYMH.zzZhP())), this.zzYMH.zzZhO().zzYm() + ((double) com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZhP())), this.zzYMH.zzZhO().zzQa()));
    }

    private long zzY7X() {
        long jZzZT = this.zzYIf ? this.zzYMH.zzZT() : this.zzYIl.zzR(this.zzYMH.zzZT());
        if (!this.zzYIm) {
            return jZzZT;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) this.zzYMH.zzZT());
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(this.zzYMH.zzZT());
        if (!com.aspose.words.internal.zzAN.zzf(this.zzYIl.zzOf())) {
            fIntBitsToFloat /= this.zzYIl.zzOf();
        }
        if (!com.aspose.words.internal.zzAN.zzf(this.zzYIl.zzOc())) {
            fZzYC /= this.zzYIl.zzOc();
        }
        return com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
    }

    @Override // com.aspose.words.zzZS6, com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) throws Exception {
        super.zzY(zzg);
        this.zzZg1 = (com.aspose.words.internal.zzG) this.zzZg1.zzZ5();
    }

    public abstract zzZBP zzY7U();

    public abstract zzZBQ zzY7V();

    public abstract zzZVR zzZ(com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ9 zzq9);

    @Override // com.aspose.words.zzZS6, com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) throws Exception {
        if (this.zzZg1 == null) {
            this.zzZg1 = this.zzp2;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        if (zzg.zzZK()) {
            this.zzYIm = true;
        }
        this.zzZg1.zzX((com.aspose.words.internal.zzZL) zzg2);
        this.zzZg1 = zzg2;
        zzg2.zzW(zzg.zzZO());
        super.zzZ(zzg);
    }

    @Override // com.aspose.words.zzZS6
    public final zzB zzZhl() {
        return new zz6(this.zzYMH.zzZhT(), this.zzYMH.zzZhS());
    }

    @Override // com.aspose.words.zzZS6
    public final void zzZhm() throws Exception {
        if (this.zzYMH.zzZhT() + this.zzYMH.zzZhS() != 0.0f) {
            ((zz6) this.zzYIk).zzZ(zzY7U());
            ((zz6) this.zzYIk).zzZ(new zzZVW());
            ((zz6) this.zzYIk).zzZ(zzY7W());
        }
        float fZzZhN = this.zzYIl.zzOc() < 0.0f ? -this.zzYMH.zzZhN() : this.zzYMH.zzZhN();
        long jZzY7X = zzY7X();
        ((zz6) this.zzYIk).zzZ(zzY7V());
        ((zz6) this.zzYIk).zzW(zzY(jZzY7X, fZzZhN, this.zzYMH.zzZhM(), this.zzYMH.zzZhL()));
        com.aspose.words.internal.zzZL[] zzzlArrZzZ = ((zz6) this.zzYIk).zzZ(zzY(this.zzYMH), this.zzYMH.zzZhx(), this.zzYMH.zzyq());
        if (zzzlArrZzZ != null) {
            if (this.zzXeb && this.zzXea) {
                com.aspose.words.internal.zzP9 zzp9ZzY5 = zzY5(this.zzYMH.zzZhQ());
                for (com.aspose.words.internal.zzZL zzzl : zzzlArrZzZ) {
                    ((com.aspose.words.internal.zzZG) zzzl).zzY(zzp9ZzY5);
                }
                this.zzXea = false;
            }
            this.zzZg1.zzZ(zzzlArrZzZ);
        }
        this.zzYIl.reset();
        super.zzZhm();
    }

    private static com.aspose.words.internal.zzQB zzY(zzZS8 zzzs8) {
        if (zzzs8 == null) {
            return com.aspose.words.internal.zzQB.zzd(0.0d);
        }
        if (zzzs8.zzZhy() != 1) {
            return com.aspose.words.internal.zzQB.zzd(zzzs8.zzZhR());
        }
        return com.aspose.words.internal.zzQB.zzZ(new com.aspose.words.internal.zzQ9(zzzs8.zzZhO().zzQb(), zzzs8.zzZhO().zzYm(), zzzs8.zzZhO().zzQa()), zzzs8.zzZhP());
    }

    @Override // com.aspose.words.zzZS6, com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        if (this.zzXeb) {
            zzzg.zzY(zzY5(-this.zzYMH.zzZhQ()));
            this.zzXea = true;
        }
        super.zzZ(zzzg);
    }

    private static com.aspose.words.internal.zzQB zzY(long j, float f, float f2, float f3) {
        com.aspose.words.internal.zzQB zzqb = new com.aspose.words.internal.zzQB();
        int i = (int) j;
        zzqb.zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(j), 0.0d);
        zzqb.zzX(f, f2, f3);
        zzqb.zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(j), 0.0d);
        return zzqb;
    }
}
