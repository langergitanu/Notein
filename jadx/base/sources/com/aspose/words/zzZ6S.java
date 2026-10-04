package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ6S {
    private com.aspose.words.internal.zzP9 zzFW;
    private Object zzYg9;
    private Object zzYga;
    zzYMD zzYgb;
    zzYMD zzYgm;
    private com.aspose.words.internal.zzZQ4 zzZFV = com.aspose.words.internal.zzZQ4.zz2T;

    public zzZ6S(zzYMD zzymd) {
        this.zzYgm = zzymd;
    }

    private static zzYMD zzx(zzYMD zzymd) {
        return zzYJP.zzl(zzymd) ? ((zzYBL) zzymd.zzZZJ()).zzi(zzymd) : zzymd;
    }

    public float getHeight() throws Exception {
        return this.zzYgm.getHeight() / 1000.0f;
    }

    public final int getStoryType() {
        return this.zzYgm.zzaa().getStoryType();
    }

    public float getWidth() throws Exception {
        return this.zzYgm.getWidth() / 1000.0f;
    }

    public final com.aspose.words.internal.zzZQ4 zzJH() throws Exception {
        return new com.aspose.words.internal.zzZQ4(zzZm(), zzZo(), getWidth(), getHeight());
    }

    public final void zzL(com.aspose.words.internal.zzP9 zzp9) {
        this.zzFW = zzp9;
    }

    public final com.aspose.words.internal.zzP9 zzNb() {
        return this.zzFW;
    }

    public void zzY(long j) {
        zzZ0(Float.intBitsToFloat((int) j));
        zzZ1(com.aspose.words.internal.zzZPY.zzYC(j));
    }

    public void zzZ(zzZ61 zzz61) throws Exception {
    }

    public final void zzZ0(float f) {
        this.zzYga = Float.valueOf(f);
    }

    public final void zzZ1(float f) {
        this.zzYg9 = Float.valueOf(f);
    }

    public long zzZT() throws Exception {
        return com.aspose.words.internal.zzZPY.zzG(zzZm(), zzZo());
    }

    public float zzZm() throws Exception {
        Object obj = this.zzYga;
        return obj != null ? ((Float) obj).floatValue() : this.zzYgm.getX() / 1000.0f;
    }

    public float zzZo() throws Exception {
        Object obj = this.zzYg9;
        return obj != null ? ((Float) obj).floatValue() : this.zzYgm.getY() / 1000.0f;
    }

    public final boolean zzbK() throws Exception {
        return !zzbL().equals(com.aspose.words.internal.zzZQ4.zz2T);
    }

    public com.aspose.words.internal.zzZQ4 zzbL() throws Exception {
        return this.zzZFV;
    }

    public static void zzZ(zzZ61 zzz61, zzYMD zzymd) throws Exception {
        while (zzymd != null) {
            zzYMD zzymdZzx = zzx(zzymd);
            if (zzymdZzx != zzymd) {
                zzymd = zzymdZzx;
            } else {
                zzZ6S zzz63 = zzymd.zz60() != 32 ? new zzZ63(zzymd) : new zzZ6N(zzymd);
                zzz63.zzZ(zzz61);
                zzymd = zzz63.zzYgb;
            }
        }
    }

    public static void zzZ(zzZ61 zzz61, Iterable<zzZNO> iterable) throws Exception {
        zzZ6S zzz63;
        zzTC zztc;
        if (iterable == null) {
            return;
        }
        for (zzZNO zzzno : iterable) {
            if (!zzzno.zzZ8W() && zzzno.zzZ99() != 25604) {
                zzZ6S zzz6s = new zzZ6S(zzzno.zzZ93());
                zzz6s.zzFW = new com.aspose.words.internal.zzP9();
                if (!zzzno.zzZ8T()) {
                    zzzno.zzZ8Y();
                }
                com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzSA.zzY(zzzno.zzZ8V().zz7G());
                if (zzzno.zzZ8G().zz6c()) {
                    float f = zzzno.zzZ8G().getOrientation() == 3 ? -90 : 90;
                    zzz6s.zzFW.zzX(f, 1);
                    if (f > 0.0f) {
                        zzz6s.zzFW.zzY(zzzq4ZzY.getWidth(), 0.0f, 1);
                    } else {
                        zzz6s.zzFW.zzY(0.0f, zzzq4ZzY.getHeight(), 1);
                    }
                }
                zzz6s.zzFW.zzY(zzzq4ZzY.getX(), zzzq4ZzY.getY(), 1);
                if (zzzno.zzZ99() == 21537) {
                    zzz6s.zzZFV = zzZ(zzzno, zzz6s.zzFW);
                }
                zzz61.zzX(zzz6s);
                zzzno.zzZ91().isActive();
                zzzno.zzZ93().isActive();
                zzTC zztcZzZXK = ((zzTC) zzzno.zzZ91()).zzZXK();
                zzTC zztcZzZXK2 = (zzTC) zzzno.zzZ93();
                while (zztcZzZXK2 != zztcZzZXK) {
                    long jZzF = com.aspose.words.internal.zzSA.zzF(com.aspose.words.internal.zzZPZ.zzZm(zztcZzZXK2.getX(), zztcZzZXK2.getY()));
                    int iZzZ99 = zzzno.zzZ99();
                    if (iZzZ99 == 21595) {
                        zzz63 = new zzZ63(zztcZzZXK2);
                        zztcZzZXK2 = zztcZzZXK;
                    } else if (iZzZ99 != 25604) {
                        if (zztcZzZXK2.zz60() == 32) {
                            zzz63 = new zzZ6N(zztcZzZXK2);
                            zztc = (zzTC) zztcZzZXK2.zza9().zz6w();
                        } else {
                            zzz63 = new zzZ63(zztcZzZXK2);
                            zztc = (zzYIA) ((zzYIC) ((zzYIA) zztcZzZXK2).zza5().zza6().zzZXY()).zz6w();
                        }
                        zztcZzZXK2 = zztc.zzZXK();
                    } else {
                        throw new IllegalStateException();
                    }
                    zzz63.zzY(jZzF);
                    zzz63.zzZ(zzz61);
                }
                zzz61.zzW(zzz6s);
            }
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zzZNO zzzno, com.aspose.words.internal.zzP9 zzp9) throws Exception {
        float fZzZ8d;
        boolean zZz6c = zzzno.zzZ8G().zz6c();
        float fZzZ8e = 0.0f;
        float fZzZXQ = zzzno.zzZXQ() == Integer.MIN_VALUE ? 0.0f : zzzno.zzZXQ() / 1000.0f;
        if (!zzzno.zzZ8T()) {
            zzzno.zzZ8Y();
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzSA.zzY(zzzno.zzZ8V().zz7G());
        com.aspose.words.internal.zzZQ4 zzzq4ZzY2 = com.aspose.words.internal.zzSA.zzY(zzzno.zzZ8R().zz7G());
        if (zZz6c) {
            zzzq4ZzY = zzp9.zzO(zzzq4ZzY);
            zzzq4ZzY2 = zzp9.zzO(zzzq4ZzY2);
            zzZNM zzznm = (zzZNM) zzzno;
            fZzZ8e = zzznm.zzZ8e() / 1000.0f;
            fZzZ8d = zzznm.zzZ8d() / 1000.0f;
        } else {
            fZzZ8d = 0.0f;
        }
        return com.aspose.words.internal.zzZQ4.zzX(new com.aspose.words.internal.zzZQ4((zzzq4ZzY2.getX() - zzzq4ZzY.getX()) - fZzZ8e, (zzzq4ZzY2.getY() - zzzq4ZzY.getY()) + fZzZXQ, zzzq4ZzY2.getWidth() + fZzZ8e + fZzZ8d, zzzq4ZzY2.getHeight()), 0.4f, 0.6f);
    }
}
