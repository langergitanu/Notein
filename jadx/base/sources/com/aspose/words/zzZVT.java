package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.lang.reflect.Array;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVT implements zzZBQ {
    private boolean zzYMD;
    private int zzYMF;
    private boolean zzYMG;
    private zzZS8 zzYMH;
    private boolean zzYMI;
    private com.aspose.words.internal.zzIQ zzYMJ;
    private boolean zzYMK;
    private float zzYML;
    private float zzYMM;
    private float zzYMN;
    private boolean zzYMO;
    private com.aspose.words.internal.zzPY zzYMP;
    private com.aspose.words.internal.zzIQ zzYMQ;
    private com.aspose.words.internal.zzQC[] zzYMS;
    private com.aspose.words.internal.zzZQ4 zzYME = com.aspose.words.internal.zzZQ4.zz2T;
    private HashMap<com.aspose.words.internal.zzQC, com.aspose.words.internal.zzQ6> zzYMR = new HashMap<>();

    public zzZVT(com.aspose.words.internal.zzQC[] zzqcArr, zzZS8 zzzs8, boolean z, int i) {
        com.aspose.words.internal.zzQC[] zzqcArr2 = new com.aspose.words.internal.zzQC[2];
        this.zzYMS = zzqcArr2;
        System.arraycopy(zzqcArr, 0, zzqcArr2, 0, 2);
        this.zzYMN = zzzs8.zzZhE();
        this.zzYMM = zzzs8.zzZhB();
        this.zzYML = (float) Math.pow(zzzs8.zzZhA(), 2.0d);
        this.zzYMK = zzzs8.zzZhD();
        this.zzYMI = zzzs8.zzZhz();
        this.zzYMH = zzzs8;
        this.zzYMG = z;
        this.zzYMF = i;
    }

    private static long zzN(com.aspose.words.internal.zz0Q zz0q) {
        int iMax = Integer.MIN_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (int i = 0; i < zz0q.getCount(); i++) {
            long j = zz0q.get(i);
            iMax = Math.max(iMax, (int) Float.intBitsToFloat((int) j));
            iMax2 = Math.max(iMax2, (int) com.aspose.words.internal.zzZPY.zzYC(j));
        }
        if (iMax == 0) {
            iMax = 1;
        }
        if (iMax2 == 0) {
            iMax2 = 1;
        }
        return com.aspose.words.internal.zzZPX.zzZm(iMax, iMax2);
    }

    private float zzR(float f, float f2, float f3) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        float f4 = this.zzYMN;
        return (f4 + f3) * (1.0f - f4) * f2 * f * this.zzYML;
    }

    private com.aspose.words.internal.zzPY zzY(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzQB zzqb, int i, com.aspose.words.internal.zzPY zzpy) throws Exception {
        com.aspose.words.internal.zzOH zzoh = (com.aspose.words.internal.zzOH) zzpy;
        zzoh.zzL(zzoh.zzNb().zzOh());
        if (this.zzYMH.zzZhy() == 1 && zzzg.zzZ0().getCount() == 1) {
            com.aspose.words.internal.zzP5 zzp5 = zzzg.zzZ0().zzO7().get(0);
            com.aspose.words.internal.zzOS zzos = zzp5.getCount() == 1 ? (com.aspose.words.internal.zzOS) com.aspose.words.internal.zzZKW.zzZ(zzp5.zzNY().get(0), com.aspose.words.internal.zzOS.class) : null;
            if (zzos != null) {
                com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzP6.zzY(zzos);
                com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
                for (int i2 = 0; i2 < zzos.zzNu().getCount(); i2++) {
                    zz0q.add(com.aspose.words.internal.zzZPY.zzG((float) (((double) (Float.intBitsToFloat((int) zzos.zzNu().get(i2)) - zzzq4ZzY.getX())) / 12700.0d), (float) (((double) (com.aspose.words.internal.zzZPY.zzYC(zzos.zzNu().get(i2)) - zzzq4ZzY.getY())) / 12700.0d)));
                }
                zzZ(zzoh, zz0q);
                zzoh.zzL(new com.aspose.words.internal.zzP9());
                zzoh.zzNb().zzY(zzzq4ZzY.getX(), zzzq4ZzY.getY(), 1);
                zzoh.zzNb().zzY((-zzzq4ZzY.getWidth()) / 2.0f, (-zzzq4ZzY.getHeight()) / 2.0f, 1);
                zzoh.zzNb().zzZ(1.01f, 1.01f, 1);
                zzoh.zzNb().zzY(zzzq4ZzY.getWidth() / 2.0f, zzzq4ZzY.getHeight() / 2.0f, 1);
                return zzoh;
            }
        }
        return zzZ(zzoh, zzqb, i);
    }

    @Override // com.aspose.words.zzZBQ
    public final void zzQ(com.aspose.words.internal.zzPY zzpy) {
        if (com.aspose.words.internal.zzPV.zzZ(this.zzYMH.zzZhC(), com.aspose.words.internal.zzPV.zzHZ) && com.aspose.words.internal.zzPV.zzZ(this.zzYMH.zzZt(), com.aspose.words.internal.zzPV.zzHZ)) {
            this.zzYMH.zzd(com.aspose.words.internal.zzPV.zzJu);
        }
        com.aspose.words.internal.zzIQ zziq = new com.aspose.words.internal.zzIQ(!com.aspose.words.internal.zzPV.zzZ(this.zzYMH.zzZhC(), com.aspose.words.internal.zzPV.zzHZ) ? this.zzYMH.zzZhC() : this.zzYMH.zzZt());
        this.zzYMJ = zziq;
        this.zzYMP = zzpy != null ? zzpy : new com.aspose.words.internal.zzOI(zziq.zzGx());
        this.zzYMQ = new com.aspose.words.internal.zzIQ(zzpy instanceof com.aspose.words.internal.zzOI ? ((com.aspose.words.internal.zzOI) zzpy).zzZy() : this.zzYMH.zzZt());
        this.zzYMJ = !com.aspose.words.internal.zzPV.zzZ(this.zzYMH.zzZhC(), com.aspose.words.internal.zzPV.zzHZ) ? new com.aspose.words.internal.zzIQ(this.zzYMH.zzZhC()) : this.zzYMQ;
        this.zzYMO = zzpy != null;
    }

    @Override // com.aspose.words.zzZBQ
    public final void zzX(com.aspose.words.internal.zzOU zzou) {
    }

    @Override // com.aspose.words.zzZBQ
    public final com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzQG zzqg, com.aspose.words.internal.zzQB zzqb, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        com.aspose.words.internal.zzQ6 zzq6ZzQv = zzqg.zzQv();
        int type = zzqg.getType();
        com.aspose.words.internal.zzPY zzpyZzPI = this.zzYMP.zzPI();
        if (!com.aspose.words.internal.zzZQ4.zzV(this.zzYME, zzzq4)) {
            this.zzYME = zzzq4;
            this.zzYMD = false;
        }
        if (type == 5 || type == 6) {
            zzzg.zzX((zzpyZzPI.zzPH() == 0 && ((com.aspose.words.internal.zzOI) zzpyZzPI).zzZy().zzPD() == 255) ? new com.aspose.words.internal.zzOU(zzZ(zzq6ZzQv, type)) : new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzI0));
            return zzzg;
        }
        if (zzqg.zzZ1() != null && zzqg.zzZ1().zzPH() == 0 && com.aspose.words.internal.zzQE.zzYe(type) && com.aspose.words.internal.zzPV.zzZ(this.zzYMH.zzZhC(), com.aspose.words.internal.zzPV.zzJu)) {
            zzzg.zzY(zzqg.zzZ1());
            return zzzg;
        }
        if (this.zzYMO || !com.aspose.words.internal.zzQE.zzYe(type)) {
            zzzg.zzY(zzZ(zzzg, zzq6ZzQv, type, zzqb, zzpyZzPI));
            return zzzg;
        }
        zzzg.zzY(zzqg.zzZ1() != null ? zzqg.zzZ1() : new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(0)));
        zzzg.zzX(zzqg.zzZ2());
        return zzzg;
    }

    private static com.aspose.words.internal.zzPV zzR(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        return new com.aspose.words.internal.zzPV((zzpv2.zzPD() + zzpv.zzPD()) / 2, (zzpv2.zzPC() + zzpv.zzPC()) / 2, (zzpv2.zzPB() + zzpv.zzPB()) / 2, (zzpv2.zzPA() + zzpv.zzPA()) / 2);
    }

    private static byte[] zzX(com.aspose.words.internal.zzXN zzxn, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzxn.zzZ(zzzor, i);
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private float zzQ(float f, float f2, float f3) {
        return (f + 1.0f) * ((f2 * f3) / 2.0f) * this.zzYML;
    }

    private static com.aspose.words.internal.zzQ6 zzY(com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ6 zzq62) {
        double dZzQa = (float) ((zzq62.zzQa() * zzq6.zzQa()) + (zzq62.zzYm() * zzq6.zzYm()) + (zzq62.zzQb() * zzq6.zzQb()));
        return zzq6.zzV(new com.aspose.words.internal.zzQ6(zzq62.zzQb() * dZzQa, zzq62.zzYm() * dZzQa, zzq62.zzQa() * dZzQa));
    }

    private com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzQ6 zzq6, int i, com.aspose.words.internal.zzQB zzqb, com.aspose.words.internal.zzPY zzpy) throws Exception {
        if ((i != 1 && i != 2) || (zzpy.zzPH() == 0 && ((com.aspose.words.internal.zzOI) zzpy).zzZy().zzPD() == 255)) {
            return new com.aspose.words.internal.zzOI(zzZ(zzq6, i));
        }
        return zzZ(zzzg, zzqb, i, zzpy);
    }

    private com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzZG zzzg, com.aspose.words.internal.zzQB zzqb, int i, com.aspose.words.internal.zzPY zzpy) throws Exception {
        if (zzpy.zzPH() == 5 && !this.zzYMK) {
            ((com.aspose.words.internal.zzP0) zzpy).zzR(zzzg.zzZ0());
        }
        if (zzpy.zzPH() != 2 || ((com.aspose.words.internal.zzOH) zzpy).zzNc()) {
            return zzpy;
        }
        if (!this.zzYMG && !this.zzYMD) {
            this.zzYMD = true;
            com.aspose.words.internal.zzOH zzoh = (com.aspose.words.internal.zzOH) zzZVJ.zzZ(zzpy, this.zzYME, this.zzYMF);
            ((com.aspose.words.internal.zzOH) this.zzYMP).zzL(zzoh.zzNb());
            return zzoh;
        }
        return zzY(zzzg, zzqb, i, zzpy);
    }

    private com.aspose.words.internal.zzPY zzZ(com.aspose.words.internal.zzOH zzoh, com.aspose.words.internal.zzQB zzqb, int i) {
        float fZzZhS;
        if (i == 1) {
            fZzZhS = this.zzYMH.zzZhT();
        } else {
            fZzZhS = (-this.zzYMH.zzZhT()) - this.zzYMH.zzZhS();
        }
        com.aspose.words.internal.zzQB zzqb2 = new com.aspose.words.internal.zzQB();
        zzqb2.zzY(0.0d, 0.0d, fZzZhS);
        zzqb2.zzY(zzqb);
        zzoh.zzNb().zzZ(new com.aspose.words.internal.zzP9((float) zzqb2.zzQj(), (float) zzqb2.zzQi(), (float) zzqb2.zzQh(), (float) zzqb2.zzQg(), (float) zzqb2.zzQf(), (float) zzqb2.zzQe()), 1);
        return zzoh;
    }

    private com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzQ6 zzq6, int i) {
        int iZzZ;
        int iZzZ2;
        float fZzZ;
        com.aspose.words.internal.zzIQ zziq = (i == 1 || i == 2) ? this.zzYMQ : this.zzYMJ;
        float fZzGy = zziq.zzGy() * this.zzYMN;
        int i2 = 0;
        float fZzQ = 0.0f;
        float fZzZ2 = 0.0f;
        while (true) {
            com.aspose.words.internal.zzQC[] zzqcArr = this.zzYMS;
            if (i2 >= zzqcArr.length) {
                break;
            }
            com.aspose.words.internal.zzQ6 zzq6ZzZ = zzZ(zzqcArr[i2]);
            float fZzZ3 = zzq6.zzZ(zzq6ZzZ);
            if (this.zzYMS[i2].zzQm()) {
                fZzQ += zzR(fZzZ3, zziq.zzGy(), this.zzYMS[i2].zzQn());
                fZzZ2 += zzZ(zzq6ZzZ, zzq6);
            } else {
                fZzQ += zzQ(fZzZ3, zziq.zzGy(), this.zzYMS[i2].zzQn());
            }
            i2++;
        }
        com.aspose.words.internal.zzPV zzpvZzGx = new com.aspose.words.internal.zzIQ(zziq.zzPD(), zziq.zzGA(), zziq.zzGz(), com.aspose.words.internal.zzAN.zzZ(fZzQ + fZzGy, fZzGy, 255.0f)).zzGx();
        int iZzPC = zzpvZzGx.zzPC();
        int iZzPB = zzpvZzGx.zzPB();
        int iZzPA = zzpvZzGx.zzPA();
        if (this.zzYMI) {
            float f = (fZzZ2 * 1.2f) + 1.0f;
            iZzZ = (int) com.aspose.words.internal.zzAN.zzZ(iZzPC * f, 0.0f, 255.0f);
            iZzZ2 = (int) com.aspose.words.internal.zzAN.zzZ(iZzPB * f, 0.0f, 255.0f);
            fZzZ = com.aspose.words.internal.zzAN.zzZ(iZzPA * f, 0.0f, 255.0f);
        } else {
            float f2 = fZzZ2 * 255.0f;
            iZzZ = (int) com.aspose.words.internal.zzAN.zzZ(iZzPC + f2, 0.0f, 255.0f);
            iZzZ2 = (int) com.aspose.words.internal.zzAN.zzZ(iZzPB + f2, 0.0f, 255.0f);
            fZzZ = com.aspose.words.internal.zzAN.zzZ(iZzPA + f2, 0.0f, 255.0f);
        }
        return new com.aspose.words.internal.zzPV(zzpvZzGx.zzPD(), iZzZ, iZzZ2, (int) fZzZ);
    }

    private float zzZ(com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ6 zzq62) {
        com.aspose.words.internal.zzQ6 zzq6ZzX = zzq62.zzX(new com.aspose.words.internal.zzQ6(0.0d, 0.0d, 1.0d));
        if (zzq6ZzX.zzPY() != 0.0d) {
            zzq6 = zzY(zzq6, zzq6ZzX);
        }
        float fAcos = ((zzq6ZzX.zzY(zzq62.zzX(zzq6)) ? 1 : -1) * ((float) Math.acos(zzq62.zzZ(r0)))) + ((float) Math.acos(zzq62.zzZ(zzq6)));
        if (Math.abs(fAcos) >= 0.5235988f) {
            return 0.0f;
        }
        return (((float) Math.cos(fAcos)) * this.zzYMM) / 2.0f;
    }

    private com.aspose.words.internal.zzQ6 zzZ(com.aspose.words.internal.zzQC zzqc) {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYMR, zzqc, ref);
        com.aspose.words.internal.zzQ6 zzq6 = (com.aspose.words.internal.zzQ6) ref.get();
        if (zZzZ) {
            return zzq6;
        }
        com.aspose.words.internal.zzQ6 zzq62 = new com.aspose.words.internal.zzQ6(zzqc.zzQo().zzQb(), zzqc.zzQo().zzYm(), zzqc.zzQo().zzQa());
        com.aspose.words.internal.zzZQF.zzY(this.zzYMR, zzqc, zzq62);
        return zzq62;
    }

    private static void zzZ(com.aspose.words.internal.zzOH zzoh, com.aspose.words.internal.zz0Q zz0q) throws Exception {
        boolean z;
        boolean z2;
        com.aspose.words.internal.zzPV[][] zzpvArr;
        com.aspose.words.internal.zzXN zzxn;
        com.aspose.words.internal.zz0Q zz0q2 = zz0q;
        if (zz0q2.getCount() != 4) {
            return;
        }
        com.aspose.words.internal.zzXN zzxn2 = new com.aspose.words.internal.zzXN(zzoh.getImageBytes());
        long jZzZm = com.aspose.words.internal.zzZPX.zzZm(zzxn2.getWidth(), zzxn2.getHeight());
        com.aspose.words.internal.zzPV[][] zzpvArrZzZ = zzZ(zzxn2, jZzZm);
        long jZzN = zzN(zz0q2);
        int i = (int) jZzN;
        int i2 = (int) (jZzN >>> 32);
        com.aspose.words.internal.zzXN zzxn3 = new com.aspose.words.internal.zzXN(i, i2);
        long j = zz0q2.get(0);
        long j2 = zz0q2.get(1);
        long j3 = zz0q2.get(2);
        long j4 = zz0q2.get(3);
        com.aspose.words.internal.zzPV[][] zzpvArr2 = zzpvArrZzZ;
        com.aspose.words.internal.zzXN zzxn4 = zzxn3;
        com.aspose.words.internal.zzPG zzpg = new com.aspose.words.internal.zzPG(j, j2);
        com.aspose.words.internal.zzPG zzpg2 = new com.aspose.words.internal.zzPG(j, j4);
        com.aspose.words.internal.zzPG zzpg3 = new com.aspose.words.internal.zzPG(j2, j3);
        com.aspose.words.internal.zzPG zzpg4 = new com.aspose.words.internal.zzPG(j3, j4);
        com.aspose.words.internal.zzPG[] zzpgArr = {zzpg2, zzpg, zzpg3, zzpg4};
        long[] jArr = new long[1];
        boolean z3 = !com.aspose.words.internal.zzPG.zzZ(zzpg, zzpg4, jArr, true);
        long j5 = jArr[0];
        boolean zZzZ = true ^ com.aspose.words.internal.zzPG.zzZ(zzpg2, zzpg3, jArr, true);
        long j6 = jArr[0];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = 0;
            while (i4 < i) {
                int i5 = i;
                long jZzG = com.aspose.words.internal.zzZPY.zzG(i4, i3);
                boolean z4 = z3;
                boolean z5 = zZzZ;
                long j7 = j5;
                long j8 = j6;
                int i6 = i2;
                com.aspose.words.internal.zzPG[] zzpgArr2 = zzpgArr;
                long jZzZ = zzZ(zzZ(zzpgArr2, zz0q2, jZzG, z4, z5, j7, j8), jZzG, jZzZm);
                if (((int) jZzZ) <= ((int) jZzZm)) {
                    z = z4;
                    z2 = z5;
                    if (((int) (jZzZ >> 32)) <= ((int) (jZzZm >>> 32))) {
                        zzpvArr = zzpvArr2;
                        com.aspose.words.internal.zzPV zzpvZzZ = zzZ(jZzZ, jZzZm, zzpvArr);
                        if (zzpvZzZ.zzPD() != 0) {
                            zzxn = zzxn4;
                            zzxn.zzZ(i4, i3, zzpvZzZ);
                        }
                        i4++;
                        zz0q2 = zz0q;
                        zzxn4 = zzxn;
                        zzpvArr2 = zzpvArr;
                        z3 = z;
                        i2 = i6;
                        zZzZ = z2;
                        zzpgArr = zzpgArr2;
                        i = i5;
                        j5 = j7;
                        j6 = j8;
                    }
                    zzxn = zzxn4;
                    i4++;
                    zz0q2 = zz0q;
                    zzxn4 = zzxn;
                    zzpvArr2 = zzpvArr;
                    z3 = z;
                    i2 = i6;
                    zZzZ = z2;
                    zzpgArr = zzpgArr2;
                    i = i5;
                    j5 = j7;
                    j6 = j8;
                } else {
                    z = z4;
                    z2 = z5;
                }
                zzpvArr = zzpvArr2;
                zzxn = zzxn4;
                i4++;
                zz0q2 = zz0q;
                zzxn4 = zzxn;
                zzpvArr2 = zzpvArr;
                z3 = z;
                i2 = i6;
                zZzZ = z2;
                zzpgArr = zzpgArr2;
                i = i5;
                j5 = j7;
                j6 = j8;
            }
            i3++;
            zz0q2 = zz0q;
            i2 = i2;
            zzpgArr = zzpgArr;
            i = i;
            j5 = j5;
            j6 = j6;
        }
        zzoh.setImageBytes(zzX(zzxn4, zzxn2.getImageType()));
        zzoh.zzE(com.aspose.words.internal.zzZQ4.zz2T);
    }

    private static com.aspose.words.internal.zzPV[][] zzZ(com.aspose.words.internal.zzXN zzxn, long j) {
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        com.aspose.words.internal.zzPV[][] zzpvArr = (com.aspose.words.internal.zzPV[][]) Array.newInstance((Class<?>) com.aspose.words.internal.zzPV.class, i, i2);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                zzpvArr[i3][i4] = new com.aspose.words.internal.zzPV(zzxn.getPixel(i3, i4));
            }
        }
        return zzpvArr;
    }

    private static long[] zzZ(com.aspose.words.internal.zzPG[] zzpgArr, com.aspose.words.internal.zz0Q zz0q, long j, boolean z, boolean z2, long j2, long j3) {
        com.aspose.words.internal.zzPG zzpg;
        char c;
        long j4;
        com.aspose.words.internal.zzPG zzpg2;
        long j5 = zz0q.get(0);
        long j6 = zz0q.get(1);
        long j7 = zz0q.get(2);
        long j8 = zz0q.get(3);
        if (z) {
            zzpg = zzpgArr[1];
            c = 0;
            j4 = j5;
        } else {
            c = 0;
            j4 = j5;
            zzpg = new com.aspose.words.internal.zzPG(j, j2);
        }
        if (z2) {
            zzpg2 = zzpgArr[2];
        } else {
            zzpg2 = new com.aspose.words.internal.zzPG(j3, j);
        }
        long[] jArr = new long[1];
        com.aspose.words.internal.zzPG zzpgZzr = zzpg.zzr(j);
        com.aspose.words.internal.zzPG zzpgZzr2 = zzpg2.zzr(j);
        if (com.aspose.words.internal.zzPG.zzZ(zzpgZzr, zzpgArr[c], jArr, true)) {
            j4 = jArr[c];
        }
        if (com.aspose.words.internal.zzPG.zzZ(zzpgZzr2, zzpgArr[1], jArr, true)) {
            j6 = jArr[c];
        }
        if (com.aspose.words.internal.zzPG.zzZ(zzpgZzr, zzpgArr[2], jArr, true)) {
            j7 = jArr[c];
        }
        if (com.aspose.words.internal.zzPG.zzZ(zzpgZzr2, zzpgArr[3], jArr, true)) {
            j8 = jArr[c];
        }
        long[] jArr2 = new long[4];
        jArr2[c] = j4;
        jArr2[1] = j6;
        jArr2[2] = j7;
        jArr2[3] = j8;
        return jArr2;
    }

    private static long zzZ(long[] jArr, long j, long j2) {
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        return com.aspose.words.internal.zzZPZ.zzZm((int) (((double) ((int) j2)) * ((double) (com.aspose.words.internal.zzJ6.zzO(j3, j) / com.aspose.words.internal.zzJ6.zzO(j3, j5)))), (int) (((double) ((int) (j2 >>> 32))) * ((double) (com.aspose.words.internal.zzJ6.zzO(j4, j) / com.aspose.words.internal.zzJ6.zzO(j4, j6)))));
    }

    private static com.aspose.words.internal.zzPV zzZ(long j, long j2, com.aspose.words.internal.zzPV[][] zzpvArr) {
        com.aspose.words.internal.zzPV zzpv;
        com.aspose.words.internal.zzPV[][] zzpvArr2 = (com.aspose.words.internal.zzPV[][]) Array.newInstance((Class<?>) com.aspose.words.internal.zzPV.class, 2, 2);
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = ((int) j) + i;
                int i4 = ((int) (j >> 32)) + i2;
                com.aspose.words.internal.zzPV[] zzpvArr3 = zzpvArr2[i];
                if (i3 < ((int) j2) && i4 < ((int) (j2 >>> 32))) {
                    zzpv = zzpvArr[i3][i4];
                } else {
                    zzpv = com.aspose.words.internal.zzPV.zzI0;
                }
                zzpvArr3[i2] = zzpv;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            com.aspose.words.internal.zzPV[] zzpvArr4 = zzpvArr2[0];
            zzpvArr4[i5] = zzR(zzpvArr4[i5], zzpvArr2[1][i5]);
        }
        com.aspose.words.internal.zzPV[] zzpvArr5 = zzpvArr2[0];
        return zzR(zzpvArr5[0], zzpvArr5[1]);
    }
}
