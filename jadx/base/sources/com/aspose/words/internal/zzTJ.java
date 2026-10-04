package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzTJ {
    private boolean zzQO;
    zzZXN zzQR;
    zz6V zzQS;
    zzZZ6 zzQT;
    zzZXL zzQU = new zzZXL();
    zzBN zzQW = null;
    zzBN zzQV = null;
    boolean zzQQ = false;
    boolean zzQP = false;

    public static boolean zzB(double d) {
        return d > -1.0E-20d && d < 1.0E-20d;
    }

    private static void zzL(zzZXN zzzxn) {
        zzDA zzda = zzzxn.zzb2;
        long j = zzda.zzuS;
        zzzxn.zzb2 = new zzDA(zzzxn.zzb4.zzuS, zzda.zzuR);
        zzzxn.zzb4 = new zzDA(j, zzzxn.zzb4.zzuR);
    }

    private static void zzM(zzZXN zzzxn) {
        zzDA zzda = zzzxn.zzb1;
        zzDA zzda2 = zzzxn.zzb2;
        long j = zzda2.zzuS;
        zzDA zzda3 = zzzxn.zzb4;
        long j2 = j - zzda3.zzuS;
        zzda.zzuS = j2;
        long j3 = zzda2.zzuR - zzda3.zzuR;
        zzda.zzuR = j3;
        if (j3 == 0) {
            zzzxn.zzb0 = -3.4E38d;
        } else {
            zzzxn.zzb0 = j2 / j3;
        }
    }

    private static zzZXN zzN(zzZXN zzzxn) {
        zzZXN zzzxn2 = zzzxn.zzaS;
        zzzxn2.zzaT = zzzxn.zzaT;
        zzZXN zzzxn3 = zzzxn.zzaT;
        zzzxn3.zzaS = zzzxn2;
        zzzxn.zzaS = null;
        return zzzxn3;
    }

    private static zzZXN zzO(zzZXN zzzxn) {
        while (true) {
            if (!zzDA.zzX(zzzxn.zzb4, zzzxn.zzaS.zzb4) || zzDA.zzX(zzzxn.zzpR(), zzzxn.zzb2)) {
                zzzxn = zzzxn.zzaT;
            } else {
                if (zzzxn.zzb0 != -3.4E38d && zzzxn.zzaS.zzb0 != -3.4E38d) {
                    return zzzxn;
                }
                while (true) {
                    zzZXN zzzxn2 = zzzxn.zzaS;
                    if (zzzxn2.zzb0 != -3.4E38d) {
                        break;
                    }
                    zzzxn = zzzxn2;
                }
                zzZXN zzzxn3 = zzzxn;
                while (zzzxn3.zzb0 == -3.4E38d) {
                    zzzxn3 = zzzxn3.zzaT;
                }
                if (zzzxn3.zzb2.zzuR != zzzxn3.zzaS.zzb4.zzuR) {
                    return zzzxn.zzaS.zzb4.zzuS < zzzxn3.zzb4.zzuS ? zzzxn : zzzxn3;
                }
                zzzxn = zzzxn3;
            }
        }
    }

    public static boolean zzP(zzZXN zzzxn) {
        return zzzxn.zzb1.zzuR == 0;
    }

    private static void zzY(zzZXN zzzxn, int i) {
        if (zzzxn.zzpR().zzuR >= zzzxn.zzaT.zzpR().zzuR) {
            zzzxn.zzb4 = zzzxn.zzpR();
            zzzxn.zzb2 = zzzxn.zzaT.zzpR();
        } else {
            zzzxn.zzb2 = zzzxn.zzpR();
            zzzxn.zzb4 = zzzxn.zzaT.zzpR();
        }
        zzM(zzzxn);
        zzzxn.zzaZ = i;
    }

    public static boolean zzZ(zzZXN zzzxn, zzZXN zzzxn2, boolean z) {
        if (z) {
            return zzDD.zzZ(zzDD.zzJ(zzzxn.zzb1.zzuR, zzzxn2.zzb1.zzuS), zzDD.zzJ(zzzxn.zzb1.zzuS, zzzxn2.zzb1.zzuR));
        }
        zzDA zzda = zzzxn.zzb1;
        long j = zzda.zzuR;
        zzDA zzda2 = zzzxn2.zzb1;
        return j * zzda2.zzuS == zzda.zzuS * zzda2.zzuR;
    }

    public final void reset() {
        zzBN zzbn = this.zzQW;
        this.zzQV = zzbn;
        if (zzbn == null) {
            return;
        }
        this.zzQT = null;
        while (zzbn != null) {
            zzI(zzbn.zzuR);
            zzZXN zzzxn = zzbn.zzsO;
            if (zzzxn != null) {
                zzzxn.zzY(zzzxn.zzb4);
                zzzxn.zzaU = -1;
            }
            zzZXN zzzxn2 = zzbn.zzsN;
            if (zzzxn2 != null) {
                zzzxn2.zzY(zzzxn2.zzb4);
                zzzxn2.zzaU = -1;
            }
            zzbn = zzbn.zzsM;
        }
        this.zzQR = null;
    }

    public final void zzI(long j) {
        zzZZ6 zzzz6;
        zzZZ6 zzzz62 = this.zzQT;
        if (zzzz62 == null) {
            this.zzQT = new zzZZ6(j, null);
            return;
        }
        if (j > zzzz62.zzuR) {
            this.zzQT = new zzZZ6(j, zzzz62);
            return;
        }
        while (true) {
            zzzz6 = zzzz62.zzcu;
            if (zzzz6 == null || j > zzzz6.zzuR) {
                break;
            } else {
                zzzz62 = zzzz6;
            }
        }
        if (j == zzzz62.zzuR) {
            return;
        }
        zzzz62.zzcu = new zzZZ6(j, zzzz6);
    }

    public final zzBN zzJ(long j) {
        zzBN zzbn = this.zzQV;
        if (zzbn == null || zzbn.zzuR != j) {
            return null;
        }
        this.zzQV = zzbn.zzsM;
        return zzbn;
    }

    public final zzZXN zzK(zzZXN zzzxn) {
        zzZXN zzzxn2 = zzzxn.zzaR;
        if (zzzxn2 == null) {
            throw new zzTI("UpdateEdgeIntoAEL: invalid call");
        }
        zzZXN zzzxn3 = zzzxn.zzaP;
        zzZXN zzzxn4 = zzzxn.zzaQ;
        zzzxn2.zzaU = zzzxn.zzaU;
        if (zzzxn3 != null) {
            zzzxn3.zzaQ = zzzxn2;
        } else {
            this.zzQR = zzzxn2;
        }
        if (zzzxn4 != null) {
            zzzxn4.zzaP = zzzxn2;
        }
        zzzxn2.zzaY = zzzxn.zzaY;
        zzzxn2.zzaX = zzzxn.zzaX;
        zzzxn2.zzaW = zzzxn.zzaW;
        zzzxn2.zzaV = zzzxn.zzaV;
        zzzxn2.zzY(zzzxn2.zzb4);
        zzzxn2.zzaP = zzzxn3;
        zzzxn2.zzaQ = zzzxn4;
        if (!zzP(zzzxn2)) {
            zzI(zzzxn2.zzb2.zzuR);
        }
        return zzzxn2;
    }

    public final zz6W zzTA() {
        zz6W zz6w = new zz6W();
        zz6w.zzmx = -1;
        zz6w.zzmu = false;
        zz6w.zzmt = false;
        zz6w.zzms = null;
        zz6w.zzmr = null;
        zz6w.zzmq = null;
        zz6w.zzmp = null;
        this.zzQS.add(zz6w);
        zz6w.zzmx = this.zzQS.getCount() - 1;
        return zz6w;
    }

    public final boolean zzTB() {
        return this.zzQV != null;
    }

    public final long zzTC() {
        zzZZ6 zzzz6 = this.zzQT;
        long j = zzzz6.zzuR;
        this.zzQT = zzzz6.zzcu;
        return j;
    }

    public final boolean zzTD() {
        return this.zzQT != null;
    }

    public final boolean zzTE() {
        return this.zzQO;
    }

    public final void zzV(zzZXN zzzxn, zzZXN zzzxn2) {
        zzZXN zzzxn3;
        zzZXN zzzxn4 = zzzxn.zzaQ;
        zzZXN zzzxn5 = zzzxn.zzaP;
        if (zzzxn4 == zzzxn5 || (zzzxn3 = zzzxn2.zzaQ) == zzzxn2.zzaP) {
            return;
        }
        if (zzzxn4 == zzzxn2) {
            if (zzzxn3 != null) {
                zzzxn3.zzaP = zzzxn;
            }
            zzZXN zzzxn6 = zzzxn.zzaP;
            if (zzzxn6 != null) {
                zzzxn6.zzaQ = zzzxn2;
            }
            zzzxn2.zzaP = zzzxn6;
            zzzxn2.zzaQ = zzzxn;
            zzzxn.zzaP = zzzxn2;
            zzzxn.zzaQ = zzzxn3;
        } else if (zzzxn3 == zzzxn) {
            if (zzzxn4 != null) {
                zzzxn4.zzaP = zzzxn2;
            }
            zzZXN zzzxn7 = zzzxn2.zzaP;
            if (zzzxn7 != null) {
                zzzxn7.zzaQ = zzzxn;
            }
            zzzxn.zzaP = zzzxn7;
            zzzxn.zzaQ = zzzxn2;
            zzzxn2.zzaP = zzzxn;
            zzzxn2.zzaQ = zzzxn4;
        } else {
            zzzxn.zzaQ = zzzxn3;
            if (zzzxn3 != null) {
                zzzxn3.zzaP = zzzxn;
            }
            zzZXN zzzxn8 = zzzxn2.zzaP;
            zzzxn.zzaP = zzzxn8;
            if (zzzxn8 != null) {
                zzzxn8.zzaQ = zzzxn;
            }
            zzzxn2.zzaQ = zzzxn4;
            if (zzzxn4 != null) {
                zzzxn4.zzaP = zzzxn2;
            }
            zzzxn2.zzaP = zzzxn5;
            if (zzzxn5 != null) {
                zzzxn5.zzaQ = zzzxn2;
            }
        }
        if (zzzxn.zzaP == null) {
            this.zzQR = zzzxn;
        } else if (zzzxn2.zzaP == null) {
            this.zzQR = zzzxn2;
        }
    }

    public final void zzYU(int i) {
        this.zzQS.get(i).zzmr = null;
        this.zzQS.set(i, null);
    }

    public final void zzp(boolean z) {
        this.zzQO = false;
    }

    public final void zzJ(zzZXN zzzxn) {
        zzZXN zzzxn2 = zzzxn.zzaP;
        zzZXN zzzxn3 = zzzxn.zzaQ;
        if (zzzxn2 == null && zzzxn3 == null && zzzxn != this.zzQR) {
            return;
        }
        if (zzzxn2 != null) {
            zzzxn2.zzaQ = zzzxn3;
        } else {
            this.zzQR = zzzxn3;
        }
        if (zzzxn3 != null) {
            zzzxn3.zzaP = zzzxn2;
        }
        zzzxn.zzaQ = null;
        zzzxn.zzaP = null;
    }

    public static boolean zzZ(zzDA zzda, zzDA zzda2, zzDA zzda3, boolean z) {
        if (z) {
            return zzDD.zzZ(zzDD.zzJ(zzda.zzuR - zzda2.zzuR, zzda2.zzuS - zzda3.zzuS), zzDD.zzJ(zzda.zzuS - zzda2.zzuS, zzda2.zzuR - zzda3.zzuR));
        }
        long j = zzda.zzuR;
        long j2 = zzda2.zzuR;
        long j3 = zzda2.zzuS;
        return ((j3 - zzda3.zzuS) * (j - j2)) - ((j2 - zzda3.zzuR) * (zzda.zzuS - j3)) == 0;
    }

    public static zzD8 zzY(zz0M zz0m) {
        int count = zz0m.getCount();
        int i = 0;
        while (i < count && zz0m.get(i).getCount() == 0) {
            i++;
        }
        if (i == count) {
            return new zzD8((byte) 0);
        }
        zzD8 zzd8 = new zzD8();
        long j = zz0m.get(i).get(0).zzuS;
        zzd8.zzuQ = j;
        zzd8.zzuO = j;
        long j2 = zz0m.get(i).get(0).zzuR;
        zzd8.zzuP = j2;
        zzd8.zzuN = j2;
        while (i < count) {
            for (int i2 = 0; i2 < zz0m.get(i).getCount(); i2++) {
                if (zz0m.get(i).get(i2).zzuS < zzd8.zzuQ) {
                    zzd8.zzuQ = zz0m.get(i).get(i2).zzuS;
                } else if (zz0m.get(i).get(i2).zzuS > zzd8.zzuO) {
                    zzd8.zzuO = zz0m.get(i).get(i2).zzuS;
                }
                if (zz0m.get(i).get(i2).zzuR < zzd8.zzuP) {
                    zzd8.zzuP = zz0m.get(i).get(i2).zzuR;
                } else if (zz0m.get(i).get(i2).zzuR > zzd8.zzuN) {
                    zzd8.zzuN = zz0m.get(i).get(i2).zzuR;
                }
            }
            i++;
        }
        return zzd8;
    }

    public static boolean zzZ(zzDA zzda, zzDA zzda2, zzDA zzda3, zzDA zzda4, boolean z) {
        if (z) {
            return zzDD.zzZ(zzDD.zzJ(zzda.zzuR - zzda2.zzuR, zzda3.zzuS - zzda4.zzuS), zzDD.zzJ(zzda.zzuS - zzda2.zzuS, zzda3.zzuR - zzda4.zzuR));
        }
        return ((zzda3.zzuS - zzda4.zzuS) * (zzda.zzuR - zzda2.zzuR)) - ((zzda3.zzuR - zzda4.zzuR) * (zzda.zzuS - zzda2.zzuS)) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((-r4) <= 4611686018427387903L) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if ((-r4) <= 1073741823) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzZ(zzDA zzda, boolean z) {
        if (z) {
            long j = zzda.zzuS;
            if (j <= 4611686018427387903L) {
                long j2 = zzda.zzuR;
                if (j2 <= 4611686018427387903L) {
                    if ((-j) <= 4611686018427387903L) {
                    }
                }
            }
            throw new zzTI("Coordinate outside allowed range");
        }
        long j3 = zzda.zzuS;
        if (j3 <= 1073741823) {
            long j4 = zzda.zzuR;
            if (j4 <= 1073741823) {
                if ((-j3) <= 1073741823) {
                }
            }
        }
        return zzZ(zzda, true);
        return z;
    }

    private static void zzZ(zzZXN zzzxn, zzZXN zzzxn2, zzZXN zzzxn3, zzDA zzda) {
        zzzxn.zzaT = zzzxn2;
        zzzxn.zzaS = zzzxn3;
        zzzxn.zzY(zzda);
        zzzxn.zzaU = -1;
    }

    private zzZXN zzZ(zzZXN zzzxn, boolean z) {
        zzZXN zzzxn2;
        zzZXN zzzxn3;
        zzZXN zzzxn4;
        zzZXN zzzxn5;
        if (zzzxn.zzaU == -2) {
            zzZXN zzzxn6 = zzzxn;
            if (z) {
                while (true) {
                    long j = zzzxn6.zzb2.zzuR;
                    zzZXN zzzxn7 = zzzxn6.zzaT;
                    if (j != zzzxn7.zzb4.zzuR) {
                        break;
                    }
                    zzzxn6 = zzzxn7;
                }
                while (zzzxn6 != zzzxn && zzzxn6.zzb0 == -3.4E38d) {
                    zzzxn6 = zzzxn6.zzaS;
                }
            } else {
                while (true) {
                    long j2 = zzzxn6.zzb2.zzuR;
                    zzZXN zzzxn8 = zzzxn6.zzaS;
                    if (j2 != zzzxn8.zzb4.zzuR) {
                        break;
                    }
                    zzzxn6 = zzzxn8;
                }
                while (zzzxn6 != zzzxn && zzzxn6.zzb0 == -3.4E38d) {
                    zzzxn6 = zzzxn6.zzaT;
                }
            }
            if (zzzxn6 == zzzxn) {
                if (z) {
                    return zzzxn6.zzaT;
                }
                return zzzxn6.zzaS;
            }
            if (z) {
                zzzxn5 = zzzxn.zzaT;
            } else {
                zzzxn5 = zzzxn.zzaS;
            }
            zzBN zzbn = new zzBN();
            zzbn.zzsM = null;
            zzbn.zzuR = zzzxn5.zzb4.zzuR;
            zzbn.zzsO = null;
            zzbn.zzsN = zzzxn5;
            zzzxn5.zzaX = 0;
            zzZXN zzzxnZzZ = zzZ(zzzxn5, z);
            zzZ(zzbn);
            return zzzxnZzZ;
        }
        if (zzzxn.zzb0 == -3.4E38d) {
            if (z) {
                zzzxn4 = zzzxn.zzaS;
            } else {
                zzzxn4 = zzzxn.zzaT;
            }
            if (zzzxn4.zzb0 == -3.4E38d) {
                long j3 = zzzxn4.zzb4.zzuS;
                long j4 = zzzxn.zzb4.zzuS;
                if (j3 != j4 && zzzxn4.zzb2.zzuS != j4) {
                    zzL(zzzxn);
                }
            } else if (zzzxn4.zzb4.zzuS != zzzxn.zzb4.zzuS) {
                zzL(zzzxn);
            }
        }
        if (z) {
            zzZXN zzzxn9 = zzzxn;
            while (true) {
                long j5 = zzzxn9.zzb2.zzuR;
                zzzxn3 = zzzxn9.zzaT;
                if (j5 != zzzxn3.zzb4.zzuR || zzzxn3.zzaU == -2) {
                    break;
                }
                zzzxn9 = zzzxn3;
            }
            if (zzzxn9.zzb0 == -3.4E38d && zzzxn3.zzaU != -2) {
                zzZXN zzzxn10 = zzzxn9;
                do {
                    zzzxn10 = zzzxn10.zzaS;
                } while (zzzxn10.zzb0 == -3.4E38d);
                if (zzzxn10.zzb2.zzuS > zzzxn9.zzaT.zzb2.zzuS) {
                    zzzxn9 = zzzxn10;
                }
            }
            zzZXN zzzxn11 = zzzxn;
            while (zzzxn11 != zzzxn9) {
                zzzxn11.zzaR = zzzxn11.zzaT;
                if (zzzxn11.zzb0 == -3.4E38d && zzzxn11 != zzzxn && zzzxn11.zzb4.zzuS != zzzxn11.zzaS.zzb2.zzuS) {
                    zzL(zzzxn11);
                }
                zzzxn11 = zzzxn11.zzaT;
            }
            if (zzzxn11.zzb0 == -3.4E38d && zzzxn11 != zzzxn && zzzxn11.zzb4.zzuS != zzzxn11.zzaS.zzb2.zzuS) {
                zzL(zzzxn11);
            }
            return zzzxn9.zzaT;
        }
        zzZXN zzzxn12 = zzzxn;
        while (true) {
            long j6 = zzzxn12.zzb2.zzuR;
            zzzxn2 = zzzxn12.zzaS;
            if (j6 != zzzxn2.zzb4.zzuR || zzzxn2.zzaU == -2) {
                break;
            }
            zzzxn12 = zzzxn2;
        }
        if (zzzxn12.zzb0 == -3.4E38d && zzzxn2.zzaU != -2) {
            zzZXN zzzxn13 = zzzxn12;
            do {
                zzzxn13 = zzzxn13.zzaT;
            } while (zzzxn13.zzb0 == -3.4E38d);
            long j7 = zzzxn13.zzb2.zzuS;
            long j8 = zzzxn12.zzaS.zzb2.zzuS;
            if (j7 == j8 || j7 > j8) {
                zzzxn12 = zzzxn13;
            }
        }
        zzZXN zzzxn14 = zzzxn;
        while (zzzxn14 != zzzxn12) {
            zzzxn14.zzaR = zzzxn14.zzaS;
            if (zzzxn14.zzb0 == -3.4E38d && zzzxn14 != zzzxn && zzzxn14.zzb4.zzuS != zzzxn14.zzaT.zzb2.zzuS) {
                zzL(zzzxn14);
            }
            zzzxn14 = zzzxn14.zzaS;
        }
        if (zzzxn14.zzb0 == -3.4E38d && zzzxn14 != zzzxn && zzzxn14.zzb4.zzuS != zzzxn14.zzaT.zzb2.zzuS) {
            zzL(zzzxn14);
        }
        return zzzxn12.zzaS;
    }

    public final boolean zzZ(zzD9 zzd9, int i, boolean z) {
        boolean z2;
        int count = zzd9.getCount() - 1;
        while (count > 0 && zzDA.zzX(zzd9.get(count), zzd9.get(0))) {
            count--;
        }
        while (count > 0 && zzDA.zzX(zzd9.get(count), zzd9.get(count - 1))) {
            count--;
        }
        if (count < 2) {
            return false;
        }
        zzZXM zzzxm = new zzZXM(count + 1);
        for (int i2 = 0; i2 <= count; i2++) {
            zzzxm.add(new zzZXN());
        }
        zzzxm.get(1).zzY(zzd9.get(1));
        this.zzQQ = zzZ(zzd9.get(0), this.zzQQ);
        this.zzQQ = zzZ(zzd9.get(count), this.zzQQ);
        zzZ(zzzxm.get(0), zzzxm.get(1), zzzxm.get(count), zzd9.get(0));
        int i3 = count - 1;
        zzZ(zzzxm.get(count), zzzxm.get(0), zzzxm.get(i3), zzd9.get(count));
        while (i3 > 0) {
            this.zzQQ = zzZ(zzd9.get(i3), this.zzQQ);
            zzZ(zzzxm.get(i3), zzzxm.get(i3 + 1), zzzxm.get(i3 - 1), zzd9.get(i3));
            i3--;
        }
        zzZXN zzzxn = zzzxm.get(0);
        zzZXN zzzxn2 = zzzxn;
        zzZXN zzzxnZzN = zzzxn2;
        while (true) {
            if (zzDA.zzX(zzzxn.zzpR(), zzzxn.zzaT.zzpR())) {
                zzZXN zzzxn3 = zzzxn.zzaT;
                if (zzzxn == zzzxn3) {
                    break;
                }
                if (zzzxn == zzzxn2) {
                    zzzxn2 = zzzxn3;
                }
                zzzxnZzN = zzN(zzzxn);
                zzzxn = zzzxnZzN;
            } else {
                zzZXN zzzxn4 = zzzxn.zzaS;
                if (zzzxn4 == zzzxn.zzaT) {
                    break;
                }
                if (zzZ(zzzxn4.zzpR(), zzzxn.zzpR(), zzzxn.zzaT.zzpR(), this.zzQQ) && (!this.zzQO || !zzZ(zzzxn.zzaS.zzpR(), zzzxn.zzpR(), zzzxn.zzaT.zzpR()))) {
                    if (zzzxn == zzzxn2) {
                        zzzxn2 = zzzxn.zzaT;
                    }
                    zzzxnZzN = zzN(zzzxn).zzaS;
                    zzzxn = zzzxnZzN;
                } else {
                    zzzxn = zzzxn.zzaT;
                    if (zzzxn == zzzxnZzN) {
                        break;
                    }
                }
            }
        }
        if (zzzxn.zzaS == zzzxn.zzaT) {
            return false;
        }
        zzZXN zzzxn5 = zzzxn2;
        boolean z3 = true;
        do {
            zzY(zzzxn5, i);
            zzzxn5 = zzzxn5.zzaT;
            if (z3 && zzzxn5.zzpR().zzuR != zzzxn2.zzpR().zzuR) {
                z3 = false;
            }
        } while (zzzxn5 != zzzxn2);
        if (z3) {
            return false;
        }
        this.zzQU.add(zzzxm);
        zzZXN zzzxn6 = zzzxn5.zzaS;
        if (zzDA.zzX(zzzxn6.zzb4, zzzxn6.zzb2)) {
            zzzxn5 = zzzxn5.zzaT;
        }
        zzZXN zzzxn7 = null;
        while (true) {
            zzZXN zzzxnZzO = zzO(zzzxn5);
            if (zzzxnZzO == zzzxn7) {
                return true;
            }
            if (zzzxn7 == null) {
                zzzxn7 = zzzxnZzO;
            }
            zzBN zzbn = new zzBN();
            zzbn.zzsM = null;
            zzbn.zzuR = zzzxnZzO.zzb4.zzuR;
            double d = zzzxnZzO.zzb0;
            zzZXN zzzxn8 = zzzxnZzO.zzaS;
            if (d < zzzxn8.zzb0) {
                zzbn.zzsO = zzzxn8;
                zzbn.zzsN = zzzxnZzO;
                z2 = false;
            } else {
                zzbn.zzsO = zzzxnZzO;
                zzbn.zzsN = zzzxn8;
                z2 = true;
            }
            zzZXN zzzxn9 = zzbn.zzsO;
            zzzxn9.zzaY = 0;
            zzZXN zzzxn10 = zzbn.zzsN;
            zzzxn10.zzaY = 1;
            if (zzzxn9.zzaT == zzzxn10) {
                zzzxn9.zzaX = -1;
            } else {
                zzzxn9.zzaX = 1;
            }
            zzzxn10.zzaX = -zzzxn9.zzaX;
            zzZXN zzzxnZzZ = zzZ(zzzxn9, z2);
            if (zzzxnZzZ.zzaU == -2) {
                zzzxnZzZ = zzZ(zzzxnZzZ, z2);
            }
            zzZXN zzzxnZzZ2 = zzZ(zzbn.zzsN, !z2);
            if (zzzxnZzZ2.zzaU == -2) {
                zzzxnZzZ2 = zzZ(zzzxnZzZ2, !z2);
            }
            if (zzbn.zzsO.zzaU == -2) {
                zzbn.zzsO = null;
            } else if (zzbn.zzsN.zzaU == -2) {
                zzbn.zzsN = null;
            }
            zzZ(zzbn);
            zzzxn5 = !z2 ? zzzxnZzZ2 : zzzxnZzZ;
        }
    }

    public final boolean zzZ(zz0M zz0m, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < zz0m.getCount(); i2++) {
            if (zzZ(zz0m.get(i2), i, true)) {
                z = true;
            }
        }
        return z;
    }

    public static boolean zzZ(zzDA zzda, zzDA zzda2, zzDA zzda3) {
        if (!zzDA.zzX(zzda, zzda3) && !zzDA.zzX(zzda, zzda2) && !zzDA.zzX(zzda3, zzda2)) {
            long j = zzda.zzuS;
            long j2 = zzda3.zzuS;
            if (j != j2) {
                long j3 = zzda2.zzuS;
                return ((j3 > j ? 1 : (j3 == j ? 0 : -1)) > 0) == ((j3 > j2 ? 1 : (j3 == j2 ? 0 : -1)) < 0);
            }
            long j4 = zzda2.zzuR;
            if ((j4 > zzda.zzuR) == (j4 < zzda3.zzuR)) {
                return true;
            }
        }
        return false;
    }

    private void zzZ(zzBN zzbn) {
        zzBN zzbn2;
        zzBN zzbn3 = this.zzQW;
        if (zzbn3 == null) {
            this.zzQW = zzbn;
            return;
        }
        if (zzbn.zzuR >= zzbn3.zzuR) {
            zzbn.zzsM = zzbn3;
            this.zzQW = zzbn;
            return;
        }
        while (true) {
            zzbn2 = zzbn3.zzsM;
            if (zzbn2 == null || zzbn.zzuR >= zzbn2.zzuR) {
                break;
            } else {
                zzbn3 = zzbn2;
            }
        }
        zzbn.zzsM = zzbn2;
        zzbn3.zzsM = zzbn;
    }
}
