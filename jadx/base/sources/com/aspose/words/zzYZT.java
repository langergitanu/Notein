package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZT extends zzZ13 {
    private zzZ13 zzY0A;
    private int zzY0y;
    private zzZ13 zzY0z;
    private zzZ13 zzY2k;

    public zzYZT(zzZ14 zzz14, OfficeMath officeMath) {
        super(zzz14, officeMath);
        this.zzY0y = 0;
        this.zzY0A = new zzZ13(zzz14, officeMath);
        this.zzY2k = new zzZ13(zzz14, officeMath, (byte) 0);
        this.zzY0z = new zzZ13(zzz14, officeMath);
        super.zzZ(this.zzY0A);
        super.zzZ(this.zzY0z);
        super.zzZ(this.zzY2k);
    }

    private void zzX(com.aspose.words.internal.zzZG zzzg, float f) throws Exception {
        float f2 = 0.06f * f;
        float f3 = 0.014f * f;
        float f4 = (this.zzY0y == 0 ? -0.06f : -0.02f) * f;
        float f5 = f / 15.5f;
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzG0().zzZ((com.aspose.words.internal.zzZL) zzzg);
        float fZzZo = (f5 / 2.0f) + zzzq4ZzZ.zzZo();
        com.aspose.words.internal.zzP5 zzp5ZzS = com.aspose.words.internal.zzP5.zzS(com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzkw(), fZzZo), com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.zzkw() + this.zzY2k.getWidth() + f4, fZzZo));
        com.aspose.words.internal.zzZG zzzg2 = new com.aspose.words.internal.zzZG();
        zzzg2.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOI(zzZy()), f5));
        com.aspose.words.internal.zzZQG.zzZ(zzzg2.zzZ0().zzO7(), zzp5ZzS);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY((-zzzq4ZzZ.getX()) + f3, (-zzzq4ZzZ.getY()) + f2, 1);
        zzzg.zzY(zzp9);
        zzzg2.zzY(zzp9);
        this.zzY0z.zzYp(zzi(zzzq4ZzZ.getHeight(), f2));
        this.zzY0z.zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzzq4ZzZ.getWidth() + f4 + f3, zzzq4ZzZ.getHeight() + f2));
        this.zzY0z.zzYGn().zzX(zzzg);
        this.zzY0z.zzYGn().zzX(zzzg2);
        this.zzY0z.zzY25 = false;
    }

    private void zzYEk() throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZj = this.zzY0A.zzZj();
        this.zzY0A.zzI(new com.aspose.words.internal.zzZQ4(zzzq4ZzZj.getX(), zzzq4ZzZj.getY(), zzzq4ZzZj.getWidth() - (zzZr().zzPg() / 2.0f), zzzq4ZzZj.getHeight()));
        zzZ13 zzz13 = this.zzY0A;
        zzz13.zzYp(zzz13.zzZj().getHeight());
        this.zzY0A.zzR(zzYq(0.5f));
    }

    private void zzYEl() throws Exception {
        if (!zzYGe()) {
            this.zzY0y = 6;
            zzYEm();
            return;
        }
        com.aspose.words.internal.zzD4 zzd4ZzYGI = zzZ15.zzYGI();
        for (int i = 0; i < 6; i++) {
            com.aspose.words.internal.zzZG zzzgZzZ = zzZ11.zzZ(zzd4ZzYGI.get(i), zzYGf(), zzYG0(), zzZy());
            float fCeil = (float) ((Math.ceil(((double) zzG0().zzZ((com.aspose.words.internal.zzZL) zzzgZzZ).getHeight()) * 20.0d) - Math.ceil(((double) zzYG0()) * ((isInline() || zzZ11.zzP(this)) ? 2.9d : 4.65d))) / 20.0d);
            if (this.zzY2k.getHeight() < fCeil) {
                this.zzY0y = i;
                zzX(zzzgZzZ, zzYG0());
                return;
            } else {
                if (i == 5 && this.zzY2k.getHeight() > fCeil) {
                    this.zzY0y = 6;
                    zzYEm();
                }
            }
        }
    }

    private void zzYEm() throws Exception {
        com.aspose.words.internal.zzPM zzpmZzY = zztv().zzY(getFontName(), zzZr().zzPg(), 0);
        long jZz6 = zzpmZzY.zz6(Character.toString((char) 8730));
        float size = (zzZYh().getSize() * 0.15f) + this.zzY2k.getHeight();
        int i = (int) jZz6;
        long jZzG = com.aspose.words.internal.zzZPY.zzG((zzZYh().getSize() * 0.01f) + Float.intBitsToFloat(i) + this.zzY2k.getWidth(), zzZYh().getSize() * 0.05f);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - (zzZYh().getSize() * 0.085f), zzZYh().getSize() * 0.05f);
        long jZzG3 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - (zzZYh().getSize() * 0.085f), size);
        long jZzG4 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) * 0.2f, (zzZYh().getSize() * 0.025f) + (size - zzpmZzY.zzPf()));
        long jZzG5 = com.aspose.words.internal.zzZPY.zzG(0.0f, size - (zzpmZzY.zzPf() * 0.86f));
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        zzzg.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOI(zzZy()), zzYG0() / 15.5f));
        com.aspose.words.internal.zzP5 zzp5ZzS = com.aspose.words.internal.zzP5.zzS(jZzG, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG2) - ((zzYG0() / 15.5f) / 2.0f), com.aspose.words.internal.zzZPY.zzYC(jZzG2)));
        com.aspose.words.internal.zzP5 zzp5ZzS2 = com.aspose.words.internal.zzP5.zzS(jZzG2, jZzG3);
        int i2 = (int) jZzG4;
        com.aspose.words.internal.zzP5 zzp5ZzS3 = com.aspose.words.internal.zzP5.zzS(jZzG3, com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2), com.aspose.words.internal.zzZPY.zzYC(jZzG4)));
        com.aspose.words.internal.zzP5 zzp5ZzS4 = com.aspose.words.internal.zzP5.zzS(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2), ((zzYG0() / 15.5f) / 2.0f) + com.aspose.words.internal.zzZPY.zzYC(jZzG4)), jZzG5);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzS);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzS2);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5ZzS4);
        com.aspose.words.internal.zzZG zzzg2 = new com.aspose.words.internal.zzZG();
        zzzg2.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzOI(zzZy()), (zzYG0() / 15.5f) * 1.5f));
        com.aspose.words.internal.zzZQG.zzZ(zzzg2.zzZ0().zzO7(), zzp5ZzS3);
        this.zzY0z.zzYGn().zzX(zzzg);
        this.zzY0z.zzYGn().zzX(zzzg2);
        this.zzY0z.zzI(new com.aspose.words.internal.zzZQ4(this.zzY0z.zzZj().getX(), this.zzY0z.zzZj().getY(), Float.intBitsToFloat(i), size));
        zzZ13 zzz13 = this.zzY0z;
        zzz13.zzYp(zzz13.getHeight() - zzYG5());
        this.zzY0z.zzY25 = false;
    }

    private float zzi(float f, float f2) throws Exception {
        float fZzYG0 = zzYG0() * 0.6f;
        float fMax = Math.max(this.zzY2k.zzYGq() - (fZzYG0 - zzYG2()), 0.0f);
        float fMax2 = Math.max((this.zzY2k.getHeight() - this.zzY2k.zzYGq()) - zzYG2(), 0.0f);
        float f3 = (this.zzY0y != 0 || this.zzY2k.getHeight() >= fZzYG0) ? 0.5f : 1.0f;
        return (((fMax * f3) + ((f / 2.0f) + f2)) - (f3 * fMax2)) - (zzYG0() * ((zzYGa() || zzYGb()) ? 0.15f : 0.0f));
    }

    @Override // com.aspose.words.zzZ13
    public final void layoutChildren() throws Exception {
        this.zzY0A.zzZE4();
        this.zzY2k.zzZE4();
        zzYEl();
        this.zzY0z.zzZE4();
        if (this.zzY0A.zzZj().getWidth() > 0.0f) {
            zzYEk();
        }
        super.layoutChildren();
    }

    @Override // com.aspose.words.zzZ13
    public final boolean zzYGs() {
        return false;
    }

    @Override // com.aspose.words.zzZ13
    public final void zzYHg() throws Exception {
        super.zzYHg();
        if (!zzYG7() || zzYG9()) {
            return;
        }
        zzZ11.zzT(this);
        zzZ11.zzY(this, zzYG0() * 0.1f);
    }

    @Override // com.aspose.words.zzZ13
    public final void zzZ(zzZ13 zzz13) {
        int mathObjectType = zzz13.zzYGk().zzZsL().getMathObjectType();
        if (mathObjectType == 7) {
            this.zzY0A.zzZ(zzz13);
        } else {
            if (mathObjectType != 8) {
                throw new IllegalArgumentException("Cannot add child of this type to the Radical element. Only Argument and Degree parts are allowed.");
            }
            this.zzY2k.zzZ(zzz13);
        }
    }
}
