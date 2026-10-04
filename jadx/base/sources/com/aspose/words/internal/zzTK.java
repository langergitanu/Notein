package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.aspose.words.ref.RefLong;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzTK extends zzTJ {
    private boolean zzQX;
    private boolean zzQY;
    private boolean zzQZ;
    private zzCR zzR0;
    private zzCR zzR1;
    private int zzR2;
    private int zzR3;
    private boolean zzR4;
    private Comparator<zzD2> zzR5;
    private zzD1 zzR6;
    private zzZXN zzR7;
    private zzAK zzR8;
    private int zzR9;

    public zzTK() {
        this((byte) 0);
    }

    private static long round(double d) {
        return (long) (d < 0.0d ? d - 0.5d : d + 0.5d);
    }

    private void zzK(long j) {
        zzZXN zzzxnZzK = this.zzQR;
        while (zzzxnZzK != null) {
            double d = j;
            boolean zZzZ = zzZ(zzzxnZzK, d);
            if (zZzZ) {
                zzZXN zzzxnZzR = zzR(zzzxnZzK);
                zZzZ = zzzxnZzR == null || !zzTJ.zzP(zzzxnZzR);
            }
            if (zZzZ) {
                if (this.zzQX) {
                    zzO(zzzxnZzK.zzb2.zzuS);
                }
                zzZXN zzzxn = zzzxnZzK.zzaP;
                zzQ(zzzxnZzK);
                zzzxnZzK = zzzxn == null ? this.zzQR : zzzxn.zzaQ;
            } else {
                if (zzY(zzzxnZzK, d) && zzTJ.zzP(zzzxnZzK.zzaR)) {
                    zzzxnZzK = zzK(zzzxnZzK);
                    if (zzzxnZzK.zzaU >= 0) {
                        zzZ(zzzxnZzK, zzzxnZzK.zzb4);
                    }
                    zzV(zzzxnZzK);
                } else {
                    zzzxnZzK.zzY(new zzDA(zzZ(zzzxnZzK, j), j));
                }
                if (this.zzQX) {
                    zzZXN zzzxn2 = zzzxnZzK.zzaP;
                    if (zzzxnZzK.zzaU >= 0 && zzzxnZzK.zzaX != 0 && zzzxn2 != null && zzzxn2.zzaU >= 0 && zzzxn2.zzpR().zzuS == zzzxnZzK.zzpR().zzuS && zzzxn2.zzaX != 0) {
                        zzDA zzda = new zzDA(zzzxnZzK.zzpR());
                        zzZ(zzZ(zzzxn2, zzda), zzZ(zzzxnZzK, zzda), zzda);
                    }
                }
                zzzxnZzK = zzzxnZzK.zzaQ;
            }
        }
        zzTJ();
        this.zzR8 = null;
        zzZXN zzzxnZzK2 = this.zzQR;
        while (zzzxnZzK2 != null) {
            if (zzY(zzzxnZzK2, j)) {
                zz6X zz6xZzZ = zzzxnZzK2.zzaU >= 0 ? zzZ(zzzxnZzK2, zzzxnZzK2.zzb2) : null;
                zzzxnZzK2 = zzK(zzzxnZzK2);
                zzZXN zzzxn3 = zzzxnZzK2.zzaP;
                zzZXN zzzxn4 = zzzxnZzK2.zzaQ;
                if (zzzxn3 != null && zzzxn3.zzpR().zzuS == zzzxnZzK2.zzb4.zzuS && zzzxn3.zzpR().zzuR == zzzxnZzK2.zzb4.zzuR && zz6xZzZ != null && zzzxn3.zzaU >= 0 && zzzxn3.zzpR().zzuR > zzzxn3.zzb2.zzuR && zzTJ.zzZ(zzzxnZzK2.zzpR(), zzzxnZzK2.zzb2, zzzxn3.zzpR(), zzzxn3.zzb2, this.zzQQ) && zzzxnZzK2.zzaX != 0 && zzzxn3.zzaX != 0) {
                    zzZ(zz6xZzZ, zzZ(zzzxn3, zzzxnZzK2.zzb4), zzzxnZzK2.zzb2);
                } else if (zzzxn4 != null && zzzxn4.zzpR().zzuS == zzzxnZzK2.zzb4.zzuS && zzzxn4.zzpR().zzuR == zzzxnZzK2.zzb4.zzuR && zz6xZzZ != null && zzzxn4.zzaU >= 0 && zzzxn4.zzpR().zzuR > zzzxn4.zzb2.zzuR && zzTJ.zzZ(zzzxnZzK2.zzpR(), zzzxnZzK2.zzb2, zzzxn4.zzpR(), zzzxn4.zzb2, this.zzQQ) && zzzxnZzK2.zzaX != 0 && zzzxn4.zzaX != 0) {
                    zzZ(zz6xZzZ, zzZ(zzzxn4, zzzxnZzK2.zzb4), zzzxnZzK2.zzb2);
                }
            }
            zzzxnZzK2 = zzzxnZzK2.zzaQ;
        }
    }

    private void zzL(long j) {
        zzZXN zzzxn;
        boolean z;
        zzZXN zzzxn2 = this.zzQR;
        if (zzzxn2 == null) {
            return;
        }
        this.zzR7 = zzzxn2;
        while (zzzxn2 != null) {
            zzzxn2.zzaN = zzzxn2.zzaP;
            zzzxn2.zzaO = zzzxn2.zzaQ;
            zzzxn2.zzY(new zzDA(zzZ(zzzxn2, j), zzzxn2.zzpR().zzuR));
            zzzxn2 = zzzxn2.zzaQ;
        }
        for (boolean z2 = true; z2 && (zzzxn = this.zzR7) != null; z2 = z) {
            z = false;
            while (true) {
                zzZXN zzzxn3 = zzzxn.zzaO;
                if (zzzxn3 == null) {
                    break;
                }
                if (zzzxn.zzpR().zzuS > zzzxn3.zzpR().zzuS) {
                    Ref ref = new Ref(null);
                    zzZ(zzzxn, zzzxn3, (Ref<zzDA>) ref);
                    zzDA zzda = (zzDA) ref.get();
                    if (zzda.zzuR < j) {
                        zzda = new zzDA(zzZ(zzzxn, j), j);
                    }
                    zzD2 zzd2 = new zzD2();
                    zzd2.zzuz = zzzxn;
                    zzd2.zzuy = zzzxn3;
                    zzd2.zzux = zzda;
                    this.zzR6.add(zzd2);
                    zzX(zzzxn, zzzxn3);
                    z = true;
                } else {
                    zzzxn = zzzxn3;
                }
            }
            zzZXN zzzxn4 = zzzxn.zzaN;
            if (zzzxn4 == null) {
                break;
            }
            zzzxn4.zzaO = null;
        }
        this.zzR7 = null;
    }

    private boolean zzM(long j) {
        if (this.zzQR == null) {
            return true;
        }
        try {
            zzL(j);
            if (this.zzR6.getCount() == 0) {
                return true;
            }
            if (this.zzR6.getCount() != 1 && !zzTI()) {
                return false;
            }
            zzTH();
            this.zzR7 = null;
            return true;
        } catch (Exception unused) {
            this.zzR7 = null;
            this.zzR6.clear();
            throw new zzTI("ProcessIntersections error");
        }
    }

    private void zzN(long j) {
        zzZXN zzzxn;
        while (true) {
            zzBN zzbnZzJ = zzJ(j);
            if (zzbnZzJ == null) {
                return;
            }
            zzZXN zzzxn2 = zzbnZzJ.zzsO;
            zzZXN zzzxn3 = zzbnZzJ.zzsN;
            if (zzzxn2 == null) {
                zzZ(zzzxn3, (zzZXN) null);
                zzW(zzzxn3);
                if (zzX(zzzxn3)) {
                    zz6xZzY = zzZ(zzzxn3, zzzxn3.zzb4);
                }
            } else if (zzzxn3 == null) {
                zzZ(zzzxn2, (zzZXN) null);
                zzW(zzzxn2);
                zz6xZzY = zzX(zzzxn2) ? zzZ(zzzxn2, zzzxn2.zzb4) : null;
                zzI(zzzxn2.zzb2.zzuR);
            } else {
                zzZ(zzzxn2, (zzZXN) null);
                zzZ(zzzxn3, zzzxn2);
                zzW(zzzxn2);
                zzzxn3.zzaW = zzzxn2.zzaW;
                zzzxn3.zzaV = zzzxn2.zzaV;
                zz6xZzY = zzX(zzzxn2) ? zzY(zzzxn2, zzzxn3, zzzxn2.zzb4) : null;
                zzI(zzzxn2.zzb2.zzuR);
            }
            if (zzzxn3 != null) {
                if (zzTJ.zzP(zzzxn3)) {
                    zzZXN zzzxn4 = zzzxn3.zzaR;
                    if (zzzxn4 != null) {
                        zzI(zzzxn4.zzb2.zzuR);
                    }
                    zzV(zzzxn3);
                } else {
                    zzI(zzzxn3.zzb2.zzuR);
                }
            }
            if (zzzxn2 != null && zzzxn3 != null) {
                if (zz6xZzY != null && zzTJ.zzP(zzzxn3) && this.zzR0.getCount() > 0 && zzzxn3.zzaX != 0) {
                    for (int i = 0; i < this.zzR0.getCount(); i++) {
                        zzCS zzcs = this.zzR0.get(i);
                        if (zzZ(zzcs.zzuc.zzux.zzuS, zzcs.zzua.zzuS, zzzxn3.zzb4.zzuS, zzzxn3.zzb2.zzuS)) {
                            zzZ(zzcs.zzuc, zz6xZzY, zzcs.zzua);
                        }
                    }
                }
                if (zzzxn2.zzaU >= 0 && (zzzxn = zzzxn2.zzaP) != null && zzzxn.zzpR().zzuS == zzzxn2.zzb4.zzuS) {
                    zzZXN zzzxn5 = zzzxn2.zzaP;
                    if (zzzxn5.zzaU >= 0 && zzTJ.zzZ(zzzxn5.zzpR(), zzzxn2.zzaP.zzb2, zzzxn2.zzpR(), zzzxn2.zzb2, this.zzQQ) && zzzxn2.zzaX != 0) {
                        zzZXN zzzxn6 = zzzxn2.zzaP;
                        if (zzzxn6.zzaX != 0) {
                            zzZ(zz6xZzY, zzZ(zzzxn6, zzzxn2.zzb4), zzzxn2.zzb2);
                        }
                    }
                }
                if (zzzxn2.zzaQ != zzzxn3) {
                    if (zzzxn3.zzaU >= 0) {
                        zzZXN zzzxn7 = zzzxn3.zzaP;
                        if (zzzxn7.zzaU >= 0 && zzTJ.zzZ(zzzxn7.zzpR(), zzzxn3.zzaP.zzb2, zzzxn3.zzpR(), zzzxn3.zzb2, this.zzQQ) && zzzxn3.zzaX != 0) {
                            zzZXN zzzxn8 = zzzxn3.zzaP;
                            if (zzzxn8.zzaX != 0) {
                                zzZ(zz6xZzY, zzZ(zzzxn8, zzzxn3.zzb4), zzzxn3.zzb2);
                            }
                        }
                    }
                    zzZXN zzzxn9 = zzzxn2.zzaQ;
                    if (zzzxn9 != null) {
                        while (zzzxn9 != zzzxn3) {
                            zzX(zzzxn3, zzzxn9, zzzxn2.zzpR());
                            zzzxn9 = zzzxn9.zzaQ;
                        }
                    }
                }
            }
        }
    }

    private void zzO(long j) {
        zzAK zzak;
        zzAK zzak2 = new zzAK();
        zzak2.zzuS = j;
        zzAK zzak3 = this.zzR8;
        if (zzak3 == null) {
            this.zzR8 = zzak2;
            zzak2.zzs4 = null;
            zzak2.zzs3 = null;
            return;
        }
        if (j < zzak3.zzuS) {
            zzak2.zzs4 = zzak3;
            zzak2.zzs3 = null;
            this.zzR8 = zzak2;
            return;
        }
        while (true) {
            zzak = zzak3.zzs4;
            if (zzak == null || j < zzak.zzuS) {
                break;
            } else {
                zzak3 = zzak;
            }
        }
        if (j == zzak3.zzuS) {
            return;
        }
        zzak2.zzs4 = zzak;
        zzak2.zzs3 = zzak3;
        zzAK zzak4 = zzak3.zzs4;
        if (zzak4 != null) {
            zzak4.zzs3 = zzak2;
        }
        zzak3.zzs4 = zzak2;
    }

    private void zzQ(zzZXN zzzxn) {
        zzZXN zzzxnZzR = zzR(zzzxn);
        if (zzzxnZzR == null) {
            if (zzzxn.zzaU >= 0) {
                zzZ(zzzxn, zzzxn.zzb2);
            }
            zzJ(zzzxn);
            return;
        }
        while (true) {
            zzZXN zzzxn2 = zzzxn.zzaQ;
            if (zzzxn2 == null || zzzxn2 == zzzxnZzR) {
                break;
            }
            zzX(zzzxn, zzzxn2, zzzxn.zzb2);
            zzV(zzzxn, zzzxn2);
        }
        int i = zzzxn.zzaU;
        if (i == -1 && zzzxnZzR.zzaU == -1) {
            zzJ(zzzxn);
            zzJ(zzzxnZzR);
            return;
        }
        if (i >= 0 && zzzxnZzR.zzaU >= 0) {
            zzZ(zzzxn, zzzxnZzR, zzzxn.zzb2);
            zzJ(zzzxn);
            zzJ(zzzxnZzR);
        } else {
            if (zzzxn.zzaX != 0) {
                throw new zzTI("DoMaxima error");
            }
            if (i >= 0) {
                zzZ(zzzxn, zzzxn.zzb2);
                zzzxn.zzaU = -1;
            }
            zzJ(zzzxn);
            if (zzzxnZzR.zzaU >= 0) {
                zzZ(zzzxnZzR, zzzxn.zzb2);
                zzzxnZzR.zzaU = -1;
            }
            zzJ(zzzxnZzR);
        }
    }

    private static zzZXN zzR(zzZXN zzzxn) {
        zzZXN zzzxnZzS = zzS(zzzxn);
        if (zzzxnZzS == null || zzzxnZzS.zzaU == -2) {
            return null;
        }
        if (zzzxnZzS.zzaQ != zzzxnZzS.zzaP || zzTJ.zzP(zzzxnZzS)) {
            return zzzxnZzS;
        }
        return null;
    }

    private static zzZXN zzS(zzZXN zzzxn) {
        if (zzDA.zzX(zzzxn.zzaT.zzb2, zzzxn.zzb2)) {
            zzZXN zzzxn2 = zzzxn.zzaT;
            if (zzzxn2.zzaR == null) {
                return zzzxn2;
            }
        }
        if (!zzDA.zzX(zzzxn.zzaS.zzb2, zzzxn.zzb2)) {
            return null;
        }
        zzZXN zzzxn3 = zzzxn.zzaS;
        if (zzzxn3.zzaR == null) {
            return zzzxn3;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0209, code lost:
    
        r2 = r1.zzaR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r2 == null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0211, code lost:
    
        if (com.aspose.words.internal.zzTJ.zzP(r2) == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0213, code lost:
    
        r1 = zzK(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0219, code lost:
    
        if (r1.zzaU < 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021b, code lost:
    
        zzZ(r1, r1.zzb4);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[PHI: r16 r18
      0x0071: PHI (r16v5 com.aspose.words.ref.RefInt) = (r16v4 com.aspose.words.ref.RefInt), (r16v6 com.aspose.words.ref.RefInt) binds: [B:37:0x009b, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0071: PHI (r18v3 boolean) = (r18v2 boolean), (r18v6 boolean) binds: [B:37:0x009b, B:26:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzT(zzZXN zzzxn) {
        boolean z;
        RefInt refInt;
        zzZXN zzzxn2;
        RefLong refLong;
        long j;
        boolean z2;
        zzZXN zzzxn3;
        zzZXN zzzxn4;
        RefLong refLong2;
        long j2;
        zzAK zzak;
        zzZXN zzzxn5 = zzzxn;
        boolean z3 = zzzxn5.zzaX == 0;
        RefInt refInt2 = new RefInt(0);
        RefLong refLong3 = new RefLong(0L);
        RefLong refLong4 = new RefLong(0L);
        zzZ(zzzxn5, refInt2, refLong3, refLong4);
        int i = refInt2.get();
        long j3 = refLong3.get();
        long j4 = refLong4.get();
        zzZXN zzzxn6 = zzzxn5;
        while (true) {
            zzZXN zzzxn7 = zzzxn6.zzaR;
            if (zzzxn7 == null || !zzTJ.zzP(zzzxn7)) {
                break;
            } else {
                zzzxn6 = zzzxn6.zzaR;
            }
        }
        zzZXN zzzxnZzS = zzzxn6.zzaR == null ? zzS(zzzxn6) : null;
        zzAK zzak2 = this.zzR8;
        if (zzak2 == null) {
            z = z3;
            refInt = refInt2;
        } else if (i == 1) {
            while (true) {
                refInt = refInt2;
                if (zzak2 == null || zzak2.zzuS > zzzxn5.zzb4.zzuS) {
                    break;
                }
                zzak2 = zzak2.zzs4;
                refInt2 = refInt;
            }
            if (zzak2 != null) {
                z = z3;
                zzak = zzak2;
                if (zzak2.zzuS >= zzzxn6.zzb2.zzuS) {
                    zzak2 = null;
                }
            } else {
                z = z3;
                zzak = zzak2;
            }
            zzak2 = zzak;
        } else {
            z = z3;
            refInt = refInt2;
            while (true) {
                zzAK zzak3 = zzak2.zzs4;
                if (zzak3 == null || zzak3.zzuS >= zzzxn5.zzb4.zzuS) {
                    break;
                }
                zzzxn5 = zzzxn;
                zzak2 = zzak3;
            }
            if (zzak2.zzuS <= zzzxn6.zzb2.zzuS) {
            }
        }
        zzZXN zzzxnZzK = zzzxn;
        zz6X zz6xZzZ = null;
        while (true) {
            boolean z4 = zzzxnZzK == zzzxn6;
            zzZXN zzzxnZzZ = zzZ(zzzxnZzK, i);
            while (true) {
                if (zzzxnZzZ == null) {
                    zzzxn2 = zzzxn6;
                    refLong = refLong4;
                    j = j4;
                    break;
                }
                if (zzak2 == null) {
                    z2 = z4;
                    zzzxn2 = zzzxn6;
                    refLong = refLong4;
                } else if (i != 1) {
                    z2 = z4;
                    zzzxn2 = zzzxn6;
                    refLong = refLong4;
                    j = j4;
                    while (zzak2 != null && zzak2.zzuS > zzzxnZzZ.zzpR().zzuS) {
                        if (zzzxnZzK.zzaU >= 0 && !z) {
                            zzZ(zzzxnZzK, new zzDA(zzak2.zzuS, zzzxnZzK.zzb4.zzuR));
                        }
                        zzak2 = zzak2.zzs3;
                    }
                    if ((i != 1 && zzzxnZzZ.zzpR().zzuS > j) || ((i == 0 && zzzxnZzZ.zzpR().zzuS < j3) || (zzzxnZzZ.zzpR().zzuS == zzzxnZzK.zzb2.zzuS && (zzzxn4 = zzzxnZzK.zzaR) != null && zzzxnZzZ.zzb0 < zzzxn4.zzb0))) {
                        break;
                    }
                    if (zzzxnZzK.zzaU >= 0 && !z) {
                        zz6xZzZ = zzZ(zzzxnZzK, zzzxnZzZ.zzpR());
                        for (zzzxn3 = this.zzR7; zzzxn3 != null; zzzxn3 = zzzxn3.zzaO) {
                            if (zzzxn3.zzaU >= 0 && zzZ(zzzxnZzK.zzb4.zzuS, zzzxnZzK.zzb2.zzuS, zzzxn3.zzb4.zzuS, zzzxn3.zzb2.zzuS)) {
                                zzZ(zzU(zzzxn3), zz6xZzZ, zzzxn3.zzb2);
                            }
                        }
                        zzZ(zz6xZzZ, zzzxnZzK.zzb4);
                    }
                    if (zzzxnZzZ != zzzxnZzS && z2) {
                        if (zzzxnZzK.zzaU >= 0) {
                            zzZ(zzzxnZzK, zzzxnZzS, zzzxnZzK.zzb2);
                        }
                        zzJ(zzzxnZzK);
                        zzJ(zzzxnZzS);
                        return;
                    }
                    if (i == 1) {
                        zzX(zzzxnZzK, zzzxnZzZ, new zzDA(zzzxnZzZ.zzpR().zzuS, zzzxnZzK.zzpR().zzuR));
                    } else {
                        zzX(zzzxnZzZ, zzzxnZzK, new zzDA(zzzxnZzZ.zzpR().zzuS, zzzxnZzK.zzpR().zzuR));
                    }
                    zzZXN zzzxnZzZ2 = zzZ(zzzxnZzZ, i);
                    zzV(zzzxnZzK, zzzxnZzZ);
                    zzzxnZzZ = zzzxnZzZ2;
                    zzzxn6 = zzzxn2;
                    refLong4 = refLong;
                    j4 = j;
                    z4 = z2;
                } else {
                    while (true) {
                        if (zzak2 == null) {
                            z2 = z4;
                            zzzxn2 = zzzxn6;
                            refLong = refLong4;
                            break;
                        }
                        zzzxn2 = zzzxn6;
                        RefLong refLong5 = refLong4;
                        z2 = z4;
                        if (zzak2.zzuS >= zzzxnZzZ.zzpR().zzuS) {
                            refLong = refLong5;
                            break;
                        }
                        if (zzzxnZzK.zzaU < 0 || z) {
                            refLong2 = refLong5;
                            j2 = j4;
                        } else {
                            refLong2 = refLong5;
                            j2 = j4;
                            zzZ(zzzxnZzK, new zzDA(zzak2.zzuS, zzzxnZzK.zzb4.zzuR));
                        }
                        zzak2 = zzak2.zzs4;
                        z4 = z2;
                        zzzxn6 = zzzxn2;
                        refLong4 = refLong2;
                        j4 = j2;
                    }
                }
                j = j4;
                if (i != 1) {
                    if (zzzxnZzK.zzaU >= 0) {
                        zz6xZzZ = zzZ(zzzxnZzK, zzzxnZzZ.zzpR());
                        while (zzzxn3 != null) {
                        }
                        zzZ(zz6xZzZ, zzzxnZzK.zzb4);
                    }
                    if (zzzxnZzZ != zzzxnZzS) {
                    }
                    if (i == 1) {
                    }
                    zzZXN zzzxnZzZ22 = zzZ(zzzxnZzZ, i);
                    zzV(zzzxnZzK, zzzxnZzZ);
                    zzzxnZzZ = zzzxnZzZ22;
                    zzzxn6 = zzzxn2;
                    refLong4 = refLong;
                    j4 = j;
                    z4 = z2;
                } else {
                    if (zzzxnZzK.zzaU >= 0) {
                    }
                    if (zzzxnZzZ != zzzxnZzS) {
                    }
                    if (i == 1) {
                    }
                    zzZXN zzzxnZzZ222 = zzZ(zzzxnZzZ, i);
                    zzV(zzzxnZzK, zzzxnZzZ);
                    zzzxnZzZ = zzzxnZzZ222;
                    zzzxn6 = zzzxn2;
                    refLong4 = refLong;
                    j4 = j;
                    z4 = z2;
                }
            }
            RefInt refInt3 = refInt;
            refInt3.set(i);
            refLong3.set(j3);
            RefLong refLong6 = refLong;
            refLong6.set(j);
            zzZ(zzzxnZzK, refInt3, refLong3, refLong6);
            i = refInt3.get();
            j3 = refLong3.get();
            j4 = refLong6.get();
            refInt = refInt3;
            refLong4 = refLong6;
            zzzxn6 = zzzxn2;
        }
        if (zzzxnZzK.zzaU >= 0 && zz6xZzZ == null) {
            zz6X zz6xZzU = zzU(zzzxnZzK);
            for (zzZXN zzzxn8 = this.zzR7; zzzxn8 != null; zzzxn8 = zzzxn8.zzaO) {
                if (zzzxn8.zzaU >= 0 && zzZ(zzzxnZzK.zzb4.zzuS, zzzxnZzK.zzb2.zzuS, zzzxn8.zzb4.zzuS, zzzxn8.zzb2.zzuS)) {
                    zzZ(zzU(zzzxn8), zz6xZzU, zzzxn8.zzb2);
                }
            }
            zzZ(zz6xZzU, zzzxnZzK.zzb2);
        }
        if (zzzxnZzK.zzaR == null) {
            if (zzzxnZzK.zzaU >= 0) {
                zzZ(zzzxnZzK, zzzxnZzK.zzb2);
            }
            zzJ(zzzxnZzK);
            return;
        }
        if (zzzxnZzK.zzaU < 0) {
            zzK(zzzxnZzK);
            return;
        }
        zz6X zz6xZzZ2 = zzZ(zzzxnZzK, zzzxnZzK.zzb2);
        zzZXN zzzxnZzK2 = zzK(zzzxnZzK);
        if (zzzxnZzK2.zzaX == 0) {
            return;
        }
        zzZXN zzzxn9 = zzzxnZzK2.zzaP;
        zzZXN zzzxn10 = zzzxnZzK2.zzaQ;
        if (zzzxn9 != null && zzzxn9.zzpR().zzuS == zzzxnZzK2.zzb4.zzuS && zzzxn9.zzpR().zzuR == zzzxnZzK2.zzb4.zzuR && zzzxn9.zzaX != 0 && zzzxn9.zzaU >= 0 && zzzxn9.zzpR().zzuR > zzzxn9.zzb2.zzuR && zzTJ.zzZ(zzzxnZzK2, zzzxn9, this.zzQQ)) {
            zzZ(zz6xZzZ2, zzZ(zzzxn9, zzzxnZzK2.zzb4), zzzxnZzK2.zzb2);
            return;
        }
        if (zzzxn10 == null || zzzxn10.zzpR().zzuS != zzzxnZzK2.zzb4.zzuS || zzzxn10.zzpR().zzuR != zzzxnZzK2.zzb4.zzuR || zzzxn10.zzaX == 0 || zzzxn10.zzaU < 0 || zzzxn10.zzpR().zzuR <= zzzxn10.zzb2.zzuR || !zzTJ.zzZ(zzzxnZzK2, zzzxn10, this.zzQQ)) {
            return;
        }
        zzZ(zz6xZzZ2, zzZ(zzzxn10, zzzxnZzK2.zzb4), zzzxnZzK2.zzb2);
    }

    private void zzTF() {
        zz6X zz6x;
        zz6X zz6x2;
        int i = 0;
        while (i < this.zzQS.getCount()) {
            int i2 = i + 1;
            zz6W zz6w = this.zzQS.get(i);
            zz6X zz6x3 = zz6w.zzmr;
            if (zz6x3 != null && !zz6w.zzmt) {
                do {
                    zz6X zz6x4 = zz6x3.zzmw;
                    while (true) {
                        zz6x = zz6w.zzmr;
                        if (zz6x4 == zz6x) {
                            break;
                        }
                        if (zzDA.zzX(zz6x3.zzux, zz6x4.zzux) && zz6x4.zzmw != zz6x3 && (zz6x2 = zz6x4.zzmv) != zz6x3) {
                            zz6X zz6x5 = zz6x3.zzmv;
                            zz6x3.zzmv = zz6x2;
                            zz6x2.zzmw = zz6x3;
                            zz6x4.zzmv = zz6x5;
                            zz6x5.zzmw = zz6x4;
                            zz6w.zzmr = zz6x3;
                            zz6W zz6wZzTA = zzTA();
                            zz6wZzTA.zzmr = zz6x4;
                            zzW(zz6wZzTA);
                            if (zzY(zz6wZzTA.zzmr, zz6w.zzmr)) {
                                zz6wZzTA.zzmu = !zz6w.zzmu;
                                zz6wZzTA.zzms = zz6w;
                                if (this.zzQZ) {
                                    zzW(zz6wZzTA, zz6w);
                                }
                            } else if (zzY(zz6w.zzmr, zz6wZzTA.zzmr)) {
                                boolean z = zz6w.zzmu;
                                zz6wZzTA.zzmu = z;
                                zz6w.zzmu = !z;
                                zz6wZzTA.zzms = zz6w.zzms;
                                zz6w.zzms = zz6wZzTA;
                                if (this.zzQZ) {
                                    zzW(zz6w, zz6wZzTA);
                                }
                            } else {
                                zz6wZzTA.zzmu = zz6w.zzmu;
                                zz6wZzTA.zzms = zz6w.zzms;
                                if (this.zzQZ) {
                                    zzX(zz6w, zz6wZzTA);
                                }
                            }
                            zz6x4 = zz6x3;
                        }
                        zz6x4 = zz6x4.zzmw;
                    }
                    zz6x3 = zz6x3.zzmw;
                } while (zz6x3 != zz6x);
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzTG() {
        for (int i = 0; i < this.zzR1.getCount(); i++) {
            zzCS zzcs = this.zzR1.get(i);
            zz6W zz6wZzYV = zzYV(zzcs.zzuc.zzmx);
            zz6W zz6wZzYV2 = zzYV(zzcs.zzub.zzmx);
            if (zz6wZzYV.zzmr != null && zz6wZzYV2.zzmr != null && !zz6wZzYV.zzmt && !zz6wZzYV2.zzmt) {
                if (zz6wZzYV != zz6wZzYV2) {
                    zz6W zz6wZzZ = zzY(zz6wZzYV, zz6wZzYV2) ? zz6wZzYV2 : zzY(zz6wZzYV2, zz6wZzYV) ? zz6wZzYV : zzZ(zz6wZzYV, zz6wZzYV2);
                    if (zzZ(zzcs, zz6wZzYV, zz6wZzYV2)) {
                        if (zz6wZzYV == zz6wZzYV2) {
                            zz6wZzYV.zzmr = zzcs.zzuc;
                            zz6wZzYV.zzmq = null;
                            zz6W zz6wZzTA = zzTA();
                            zz6wZzTA.zzmr = zzcs.zzub;
                            zzW(zz6wZzTA);
                            if (zzY(zz6wZzTA.zzmr, zz6wZzYV.zzmr)) {
                                zz6wZzTA.zzmu = !zz6wZzYV.zzmu;
                                zz6wZzTA.zzms = zz6wZzYV;
                                if (this.zzQZ) {
                                    zzW(zz6wZzTA, zz6wZzYV);
                                }
                                if ((zz6wZzTA.zzmu ^ this.zzQY) == (zzW(zz6wZzTA.zzmr) > 0.0d)) {
                                    zzY(zz6wZzTA.zzmr);
                                }
                            } else if (zzY(zz6wZzYV.zzmr, zz6wZzTA.zzmr)) {
                                boolean z = zz6wZzYV.zzmu;
                                zz6wZzTA.zzmu = z;
                                zz6wZzYV.zzmu = !z;
                                zz6wZzTA.zzms = zz6wZzYV.zzms;
                                zz6wZzYV.zzms = zz6wZzTA;
                                if (this.zzQZ) {
                                    zzW(zz6wZzYV, zz6wZzTA);
                                }
                                if ((zz6wZzYV.zzmu ^ this.zzQY) == (zzW(zz6wZzYV.zzmr) > 0.0d)) {
                                    zzY(zz6wZzYV.zzmr);
                                }
                            } else {
                                zz6wZzTA.zzmu = zz6wZzYV.zzmu;
                                zz6wZzTA.zzms = zz6wZzYV.zzms;
                                if (this.zzQZ) {
                                    zzX(zz6wZzYV, zz6wZzTA);
                                }
                            }
                        } else {
                            zz6wZzYV2.zzmr = null;
                            zz6wZzYV2.zzmq = null;
                            zz6wZzYV2.zzmx = zz6wZzYV.zzmx;
                            zz6wZzYV.zzmu = zz6wZzZ.zzmu;
                            if (zz6wZzZ == zz6wZzYV2) {
                                zz6wZzYV.zzms = zz6wZzYV2.zzms;
                            }
                            zz6wZzYV2.zzms = zz6wZzYV;
                            if (this.zzQZ) {
                                zzV(zz6wZzYV2, zz6wZzYV);
                            }
                        }
                    }
                }
            }
        }
    }

    private void zzTH() {
        for (int i = 0; i < this.zzR6.getCount(); i++) {
            zzD2 zzd2 = this.zzR6.get(i);
            zzX(zzd2.zzuz, zzd2.zzuy, zzd2.zzux);
            zzV(zzd2.zzuz, zzd2.zzuy);
        }
        this.zzR6.clear();
    }

    private boolean zzTI() {
        this.zzR6.sort(this.zzR5);
        zzTK();
        int count = this.zzR6.getCount();
        for (int i = 0; i < count; i++) {
            if (!zzZ(this.zzR6.get(i))) {
                int i2 = i + 1;
                while (i2 < count && !zzZ(this.zzR6.get(i2))) {
                    i2++;
                }
                if (i2 == count) {
                    return false;
                }
                zzD2 zzd2 = this.zzR6.get(i);
                zzD1 zzd1 = this.zzR6;
                zzd1.set(i, zzd1.get(i2));
                this.zzR6.set(i2, zzd2);
            }
            zzX(this.zzR6.get(i).zzuz, this.zzR6.get(i).zzuy);
        }
        return true;
    }

    private void zzTJ() {
        while (zzTM()) {
            zzT(zzTL());
        }
    }

    private void zzTK() {
        zzZXN zzzxn = this.zzQR;
        this.zzR7 = zzzxn;
        while (zzzxn != null) {
            zzzxn.zzaN = zzzxn.zzaP;
            zzZXN zzzxn2 = zzzxn.zzaQ;
            zzzxn.zzaO = zzzxn2;
            zzzxn = zzzxn2;
        }
    }

    private zzZXN zzTL() {
        zzZXN zzzxn = this.zzR7;
        zzZXN zzzxn2 = zzzxn.zzaO;
        this.zzR7 = zzzxn2;
        if (zzzxn2 != null) {
            zzzxn2.zzaN = null;
        }
        zzzxn.zzaO = null;
        zzzxn.zzaN = null;
        return zzzxn;
    }

    private boolean zzTM() {
        return this.zzR7 != null;
    }

    private void zzTN() {
        for (int i = 0; i < this.zzQS.getCount(); i++) {
            zzYU(i);
        }
        this.zzQS.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r0 = r10.zzQS.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (r0.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r2 = r0.next();
        r4 = r2.zzmr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r4 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r2.zzmt != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r5 = r2.zzmu ^ r10.zzQY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (zzW(r4) <= 0.0d) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r5 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        zzY(r2.zzmr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        zzTG();
        r0 = r10.zzQS.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r1.zzmr == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r1.zzmt == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        zzZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        zzY(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r10.zzQX == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        zzTF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        r10.zzR1.clear();
        r10.zzR0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzTO() {
        try {
            reset();
            this.zzR7 = null;
            this.zzR8 = null;
            if (zzTD()) {
                zzN(0L);
                while (true) {
                    if (!zzTD() && !zzTB()) {
                        break;
                    }
                    long jZzTC = zzTC();
                    zzTJ();
                    this.zzR0.clear();
                    if (zzM(jZzTC)) {
                        zzK(jZzTC);
                        zzN(jZzTC);
                    }
                }
            }
            return false;
        } finally {
            this.zzR1.clear();
            this.zzR0.clear();
        }
    }

    private zz6X zzU(zzZXN zzzxn) {
        zz6W zz6w = this.zzQS.get(zzzxn.zzaU);
        return zzzxn.zzaY == 0 ? zz6w.zzmr : zz6w.zzmr.zzmv;
    }

    private void zzV(zzZXN zzzxn) {
        zzZXN zzzxn2 = this.zzR7;
        if (zzzxn2 == null) {
            this.zzR7 = zzzxn;
            zzzxn.zzaN = null;
            zzzxn.zzaO = null;
        } else {
            zzzxn.zzaO = zzzxn2;
            zzzxn.zzaN = null;
            zzzxn2.zzaN = zzzxn;
            this.zzR7 = zzzxn;
        }
    }

    private void zzW(zzZXN zzzxn) {
        zzZXN zzzxn2;
        zzZXN zzzxn3 = zzzxn.zzaP;
        while (zzzxn3 != null && (zzzxn3.zzaZ != zzzxn.zzaZ || zzzxn3.zzaX == 0)) {
            zzzxn3 = zzzxn3.zzaP;
        }
        if (zzzxn3 == null) {
            int i = zzzxn.zzaZ == 0 ? this.zzR2 : this.zzR3;
            int i2 = zzzxn.zzaX;
            if (i2 == 0) {
                zzzxn.zzaW = i == 3 ? -1 : 1;
            } else {
                zzzxn.zzaW = i2;
            }
            zzzxn.zzaV = 0;
            zzzxn2 = this.zzQR;
        } else {
            if (zzzxn.zzaX == 0 && this.zzR9 != 1) {
                zzzxn.zzaW = 1;
            } else if (zzZ(zzzxn)) {
                int i3 = zzzxn.zzaX;
                if (i3 == 0) {
                    int i4 = 1;
                    for (zzZXN zzzxn4 = zzzxn3.zzaP; zzzxn4 != null; zzzxn4 = zzzxn4.zzaP) {
                        if (zzzxn4.zzaZ == zzzxn3.zzaZ && zzzxn4.zzaX != 0) {
                            i4 ^= 1;
                        }
                    }
                    zzzxn.zzaW = i4 ^ 1;
                } else {
                    zzzxn.zzaW = i3;
                }
                zzzxn.zzaV = zzzxn3.zzaV;
                zzzxn2 = zzzxn3.zzaQ;
            } else {
                int i5 = zzzxn3.zzaW;
                int i6 = zzzxn3.zzaX;
                if (i5 * i6 >= 0) {
                    int i7 = zzzxn.zzaX;
                    if (i7 == 0) {
                        zzzxn.zzaW = i5 < 0 ? i5 - 1 : i5 + 1;
                    } else if (i6 * i7 < 0) {
                        zzzxn.zzaW = i5;
                    } else {
                        zzzxn.zzaW = i5 + i7;
                    }
                } else if (Math.abs(i5) > 1) {
                    int i8 = zzzxn3.zzaX;
                    int i9 = zzzxn.zzaX;
                    if (i8 * i9 < 0) {
                        zzzxn.zzaW = zzzxn3.zzaW;
                    } else {
                        zzzxn.zzaW = zzzxn3.zzaW + i9;
                    }
                } else {
                    int i10 = zzzxn.zzaX;
                    if (i10 == 0) {
                        i10 = 1;
                    }
                    zzzxn.zzaW = i10;
                }
            }
            zzzxn.zzaV = zzzxn3.zzaV;
            zzzxn2 = zzzxn3.zzaQ;
        }
        if (!zzY(zzzxn)) {
            while (zzzxn2 != zzzxn) {
                zzzxn.zzaV += zzzxn2.zzaX;
                zzzxn2 = zzzxn2.zzaQ;
            }
        } else {
            while (zzzxn2 != zzzxn) {
                if (zzzxn2.zzaX != 0) {
                    zzzxn.zzaV = zzzxn.zzaV == 0 ? 1 : 0;
                }
                zzzxn2 = zzzxn2.zzaQ;
            }
        }
    }

    private boolean zzX(zzZXN zzzxn) {
        int i;
        int i2;
        if (zzzxn.zzaZ == 0) {
            i = this.zzR2;
            i2 = this.zzR3;
        } else {
            i = this.zzR3;
            i2 = this.zzR2;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (zzzxn.zzaW != -1) {
                        return false;
                    }
                } else if (zzzxn.zzaW != 1) {
                    return false;
                }
            } else if (Math.abs(zzzxn.zzaW) != 1) {
                return false;
            }
        } else if (zzzxn.zzaX == 0 && zzzxn.zzaW != 1) {
            return false;
        }
        int i3 = this.zzR9;
        if (i3 == 0) {
            return (i2 == 0 || i2 == 1) ? zzzxn.zzaV != 0 : i2 != 2 ? zzzxn.zzaV < 0 : zzzxn.zzaV > 0;
        }
        if (i3 == 1) {
            return (i2 == 0 || i2 == 1) ? zzzxn.zzaV == 0 : i2 != 2 ? zzzxn.zzaV >= 0 : zzzxn.zzaV <= 0;
        }
        if (i3 == 2) {
            return zzzxn.zzaZ == 0 ? (i2 == 0 || i2 == 1) ? zzzxn.zzaV == 0 : i2 != 2 ? zzzxn.zzaV >= 0 : zzzxn.zzaV <= 0 : (i2 == 0 || i2 == 1) ? zzzxn.zzaV != 0 : i2 != 2 ? zzzxn.zzaV < 0 : zzzxn.zzaV > 0;
        }
        if (i3 == 3 && zzzxn.zzaX == 0) {
            return (i2 == 0 || i2 == 1) ? zzzxn.zzaV == 0 : i2 != 2 ? zzzxn.zzaV >= 0 : zzzxn.zzaV <= 0;
        }
        return true;
    }

    private static boolean zzY(zzZXN zzzxn, zzZXN zzzxn2) {
        if (zzzxn2.zzpR().zzuS != zzzxn.zzpR().zzuS) {
            return zzzxn2.zzpR().zzuS < zzzxn.zzpR().zzuS;
        }
        zzDA zzda = zzzxn2.zzb2;
        long j = zzda.zzuR;
        zzDA zzda2 = zzzxn.zzb2;
        long j2 = zzda2.zzuR;
        return j > j2 ? zzda.zzuS < zzZ(zzzxn, j) : zzda2.zzuS > zzZ(zzzxn2, j2);
    }

    private zz6W zzYV(int i) {
        zz6W zz6w = this.zzQS.get(i);
        while (true) {
            zz6W zz6w2 = zz6w;
            if (zz6w2 == this.zzQS.get(zz6w2.zzmx)) {
                return zz6w2;
            }
            zz6w = this.zzQS.get(zz6w2.zzmx);
        }
    }

    private static boolean zzZ(long j, long j2, long j3, long j4) {
        if (j > j2) {
            j2 = j;
            j = j2;
        }
        if (j3 <= j4) {
            j4 = j3;
            j3 = j4;
        }
        return j < j3 && j4 < j2;
    }

    public final void zzq(boolean z) {
        this.zzQY = true;
    }

    private zzTK(byte b) {
        this.zzQT = null;
        this.zzR8 = null;
        this.zzQR = null;
        this.zzR7 = null;
        this.zzR6 = new zzD1();
        this.zzR5 = new zz7U();
        this.zzR4 = false;
        this.zzQZ = false;
        this.zzQS = new zz6V();
        this.zzR1 = new zzCR();
        this.zzR0 = new zzCR();
        this.zzQY = false;
        this.zzQX = false;
        zzp(false);
    }

    public final boolean zzZ(int i, zz0M zz0m, int i2) {
        return zzZ(i, zz0m, i2, i2);
    }

    public final boolean zzZ(int i, zz0M zz0m, int i2, int i3) {
        if (this.zzR4) {
            return false;
        }
        if (!this.zzQP) {
            this.zzR4 = true;
            zz0m.clear();
            this.zzR2 = i2;
            this.zzR3 = i3;
            this.zzR9 = i;
            this.zzQZ = false;
            try {
                boolean zZzTO = zzTO();
                if (zZzTO) {
                    zzZ(zz0m);
                }
                return zZzTO;
            } finally {
                zzTN();
                this.zzR4 = false;
            }
        }
        throw new zzTI("Error: PolyTree struct is needed for open path clipping.");
    }

    private boolean zzY(zzZXN zzzxn) {
        return zzzxn.zzaZ == 0 ? this.zzR3 == 0 : this.zzR2 == 0;
    }

    private void zzV(zz6W zz6w, zz6W zz6w2) {
        for (zz6W zz6w3 : this.zzQS) {
            zz6W zz6wZzX = zzX(zz6w3.zzms);
            if (zz6w3.zzmr != null && zz6wZzX == zz6w) {
                zz6w3.zzms = zz6w2;
            }
        }
    }

    private zz6X zzY(zzZXN zzzxn, zzZXN zzzxn2, zzDA zzda) {
        zz6X zz6xZzZ;
        zzZXN zzzxn3;
        if (!zzTJ.zzP(zzzxn2) && zzzxn.zzb0 <= zzzxn2.zzb0) {
            zz6xZzZ = zzZ(zzzxn2, zzda);
            zzzxn.zzaU = zzzxn2.zzaU;
            zzzxn.zzaY = 1;
            zzzxn2.zzaY = 0;
            zzzxn3 = zzzxn2.zzaP;
            if (zzzxn3 == zzzxn) {
                zzzxn3 = zzzxn.zzaP;
            }
            zzzxn = zzzxn2;
        } else {
            zz6xZzZ = zzZ(zzzxn, zzda);
            zzzxn2.zzaU = zzzxn.zzaU;
            zzzxn.zzaY = 0;
            zzzxn2.zzaY = 1;
            zzzxn3 = zzzxn.zzaP;
            if (zzzxn3 == zzzxn2) {
                zzzxn3 = zzzxn2.zzaP;
            }
        }
        if (zzzxn3 != null && zzzxn3.zzaU >= 0) {
            long j = zzzxn3.zzb2.zzuR;
            long j2 = zzda.zzuR;
            if (j < j2 && zzzxn.zzb2.zzuR < j2) {
                long jZzZ = zzZ(zzzxn3, j2);
                long jZzZ2 = zzZ(zzzxn, zzda.zzuR);
                if (jZzZ == jZzZ2 && zzzxn.zzaX != 0 && zzzxn3.zzaX != 0 && zzTJ.zzZ(new zzDA(jZzZ, zzda.zzuR), zzzxn3.zzb2, new zzDA(jZzZ2, zzda.zzuR), zzzxn.zzb2, this.zzQQ)) {
                    zzZ(zz6xZzZ, zzZ(zzzxn3, zzda), zzzxn.zzb2);
                }
            }
        }
        return zz6xZzZ;
    }

    private void zzZ(zz6X zz6x, zz6X zz6x2, zzDA zzda) {
        zzCS zzcs = new zzCS();
        zzcs.zzuc = zz6x;
        zzcs.zzub = zz6x2;
        zzcs.zzua = zzda;
        this.zzR1.add(zzcs);
    }

    private void zzZ(zz6X zz6x, zzDA zzda) {
        zzCS zzcs = new zzCS();
        zzcs.zzuc = zz6x;
        zzcs.zzua = zzda;
        this.zzR0.add(zzcs);
    }

    private void zzX(zzZXN zzzxn, zzZXN zzzxn2) {
        zzZXN zzzxn3 = zzzxn.zzaO;
        if (zzzxn3 == null && zzzxn.zzaN == null) {
            return;
        }
        zzZXN zzzxn4 = zzzxn2.zzaO;
        if (zzzxn4 == null && zzzxn2.zzaN == null) {
            return;
        }
        if (zzzxn3 == zzzxn2) {
            if (zzzxn4 != null) {
                zzzxn4.zzaN = zzzxn;
            }
            zzZXN zzzxn5 = zzzxn.zzaN;
            if (zzzxn5 != null) {
                zzzxn5.zzaO = zzzxn2;
            }
            zzzxn2.zzaN = zzzxn5;
            zzzxn2.zzaO = zzzxn;
            zzzxn.zzaN = zzzxn2;
            zzzxn.zzaO = zzzxn4;
        } else if (zzzxn4 == zzzxn) {
            if (zzzxn3 != null) {
                zzzxn3.zzaN = zzzxn2;
            }
            zzZXN zzzxn6 = zzzxn2.zzaN;
            if (zzzxn6 != null) {
                zzzxn6.zzaO = zzzxn;
            }
            zzzxn.zzaN = zzzxn6;
            zzzxn.zzaO = zzzxn2;
            zzzxn2.zzaN = zzzxn;
            zzzxn2.zzaO = zzzxn3;
        } else {
            zzZXN zzzxn7 = zzzxn.zzaN;
            zzzxn.zzaO = zzzxn4;
            if (zzzxn4 != null) {
                zzzxn4.zzaN = zzzxn;
            }
            zzZXN zzzxn8 = zzzxn2.zzaN;
            zzzxn.zzaN = zzzxn8;
            if (zzzxn8 != null) {
                zzzxn8.zzaO = zzzxn;
            }
            zzzxn2.zzaO = zzzxn3;
            if (zzzxn3 != null) {
                zzzxn3.zzaN = zzzxn2;
            }
            zzzxn2.zzaN = zzzxn7;
            if (zzzxn7 != null) {
                zzzxn7.zzaO = zzzxn2;
            }
        }
        if (zzzxn.zzaN == null) {
            this.zzR7 = zzzxn;
        } else if (zzzxn2.zzaN == null) {
            this.zzR7 = zzzxn2;
        }
    }

    private void zzZ(zzZXN zzzxn, zzZXN zzzxn2) {
        zzZXN zzzxn3 = this.zzQR;
        if (zzzxn3 == null) {
            zzzxn.zzaP = null;
            zzzxn.zzaQ = null;
            this.zzQR = zzzxn;
            return;
        }
        if (zzzxn2 == null && zzY(zzzxn3, zzzxn)) {
            zzzxn.zzaP = null;
            zzZXN zzzxn4 = this.zzQR;
            zzzxn.zzaQ = zzzxn4;
            zzzxn4.zzaP = zzzxn;
            this.zzQR = zzzxn;
            return;
        }
        if (zzzxn2 == null) {
            zzzxn2 = this.zzQR;
        }
        while (true) {
            zzZXN zzzxn5 = zzzxn2.zzaQ;
            if (zzzxn5 == null || zzY(zzzxn5, zzzxn)) {
                break;
            } else {
                zzzxn2 = zzzxn2.zzaQ;
            }
        }
        zzzxn.zzaQ = zzzxn2.zzaQ;
        zzZXN zzzxn6 = zzzxn2.zzaQ;
        if (zzzxn6 != null) {
            zzzxn6.zzaP = zzzxn;
        }
        zzzxn.zzaP = zzzxn2;
        zzzxn2.zzaQ = zzzxn;
    }

    private static boolean zzY(zz6W zz6w, zz6W zz6w2) {
        do {
            zz6w = zz6w.zzms;
            if (zz6w == zz6w2) {
                return true;
            }
        } while (zz6w != null);
        return false;
    }

    private static void zzY(zz6X zz6x) {
        if (zz6x == null) {
            return;
        }
        zz6X zz6x2 = zz6x;
        while (true) {
            zz6X zz6x3 = zz6x2.zzmw;
            zz6x2.zzmw = zz6x2.zzmv;
            zz6x2.zzmv = zz6x3;
            if (zz6x3 == zz6x) {
                return;
            } else {
                zz6x2 = zz6x3;
            }
        }
    }

    private static boolean zzY(zzZXN zzzxn, double d) {
        return ((double) zzzxn.zzb2.zzuR) == d && zzzxn.zzaR != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r9.zzmr = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzY(zz6W zz6w) {
        zz6X zz6x;
        zz6w.zzmq = null;
        zz6X zz6x2 = zz6w.zzmr;
        boolean z = zzTE() || this.zzQX;
        loop0: while (true) {
            zz6X zz6x3 = null;
            while (true) {
                zz6X zz6x4 = zz6x2.zzmv;
                if (zz6x4 == zz6x2 || zz6x4 == (zz6x = zz6x2.zzmw)) {
                    break loop0;
                }
                if (zzDA.zzX(zz6x2.zzux, zz6x.zzux) || zzDA.zzX(zz6x2.zzux, zz6x2.zzmv.zzux) || (zzTJ.zzZ(zz6x2.zzmv.zzux, zz6x2.zzux, zz6x2.zzmw.zzux, this.zzQQ) && !(z && zzTJ.zzZ(zz6x2.zzmv.zzux, zz6x2.zzux, zz6x2.zzmw.zzux)))) {
                    break;
                }
                if (zz6x2 != zz6x3) {
                    if (zz6x3 == null) {
                        zz6x3 = zz6x2;
                    }
                    zz6x2 = zz6x2.zzmw;
                } else {
                    zz6w.zzmr = zz6x2;
                    return;
                }
            }
            zz6X zz6x5 = zz6x2.zzmv;
            zz6x5.zzmw = zz6x2.zzmw;
            zz6x2.zzmw.zzmv = zz6x5;
            zz6x2 = zz6x2.zzmv;
        }
    }

    private void zzW(zzZXN zzzxn, zzZXN zzzxn2) {
        zz6W zz6wZzZ;
        zz6W zz6w = this.zzQS.get(zzzxn.zzaU);
        zz6W zz6w2 = this.zzQS.get(zzzxn2.zzaU);
        if (zzY(zz6w, zz6w2)) {
            zz6wZzZ = zz6w2;
        } else {
            zz6wZzZ = zzY(zz6w2, zz6w) ? zz6w : zzZ(zz6w, zz6w2);
        }
        zz6X zz6x = zz6w.zzmr;
        zz6X zz6x2 = zz6x.zzmv;
        zz6X zz6x3 = zz6w2.zzmr;
        zz6X zz6x4 = zz6x3.zzmv;
        if (zzzxn.zzaY == 0) {
            if (zzzxn2.zzaY == 0) {
                zzY(zz6x3);
                zz6x3.zzmw = zz6x;
                zz6x.zzmv = zz6x3;
                zz6x2.zzmw = zz6x4;
                zz6x4.zzmv = zz6x2;
                zz6w.zzmr = zz6x4;
            } else {
                zz6x4.zzmw = zz6x;
                zz6x.zzmv = zz6x4;
                zz6x3.zzmv = zz6x2;
                zz6x2.zzmw = zz6x3;
                zz6w.zzmr = zz6x3;
            }
        } else if (zzzxn2.zzaY == 1) {
            zzY(zz6x3);
            zz6x2.zzmw = zz6x4;
            zz6x4.zzmv = zz6x2;
            zz6x3.zzmw = zz6x;
            zz6x.zzmv = zz6x3;
        } else {
            zz6x2.zzmw = zz6x3;
            zz6x3.zzmv = zz6x2;
            zz6x.zzmv = zz6x4;
            zz6x4.zzmw = zz6x;
        }
        zz6w.zzmq = null;
        if (zz6wZzZ == zz6w2) {
            zz6W zz6w3 = zz6w2.zzms;
            if (zz6w3 != zz6w) {
                zz6w.zzms = zz6w3;
            }
            zz6w.zzmu = zz6w2.zzmu;
        }
        zz6w2.zzmr = null;
        zz6w2.zzmq = null;
        zz6w2.zzms = zz6w;
        int i = zzzxn.zzaU;
        int i2 = zzzxn2.zzaU;
        zzzxn.zzaU = -1;
        zzzxn2.zzaU = -1;
        zzZXN zzzxn3 = this.zzQR;
        while (true) {
            if (zzzxn3 == null) {
                break;
            }
            if (zzzxn3.zzaU == i2) {
                zzzxn3.zzaU = i;
                zzzxn3.zzaY = zzzxn.zzaY;
                break;
            }
            zzzxn3 = zzzxn3.zzaQ;
        }
        zz6w2.zzmx = zz6w.zzmx;
    }

    private boolean zzZ(zzZXN zzzxn) {
        return zzzxn.zzaZ == 0 ? this.zzR2 == 0 : this.zzR3 == 0;
    }

    private static boolean zzY(zz6X zz6x, zz6X zz6x2) {
        zz6X zz6x3 = zz6x;
        do {
            int iZzZ = zzZ(zz6x3.zzux, zz6x2);
            if (iZzZ >= 0) {
                return iZzZ > 0;
            }
            zz6x3 = zz6x3.zzmw;
        } while (zz6x3 != zz6x);
        return true;
    }

    private void zzZ(zzZXN zzzxn, zzZXN zzzxn2, zzDA zzda) {
        zzZ(zzzxn, zzda);
        if (zzzxn2.zzaX == 0) {
            zzZ(zzzxn2, zzda);
        }
        int i = zzzxn.zzaU;
        int i2 = zzzxn2.zzaU;
        if (i == i2) {
            zzzxn.zzaU = -1;
            zzzxn2.zzaU = -1;
        } else if (i < i2) {
            zzW(zzzxn, zzzxn2);
        } else {
            zzW(zzzxn2, zzzxn);
        }
    }

    private static double zzY(zzD9 zzd9) {
        int count = zzd9.getCount();
        if (count < 3) {
            return 0.0d;
        }
        double dOooO0O0 = 0.0d;
        int i = count - 1;
        for (int i2 = 0; i2 < count; i2++) {
            dOooO0O0 = C21532OooOOo.OooO0O0(zzd9.get(i).zzuR, zzd9.get(i2).zzuR, zzd9.get(i).zzuS + zzd9.get(i2).zzuS, dOooO0O0);
            i = i2;
        }
        return (-dOooO0O0) * 0.5d;
    }

    private void zzX(zzZXN zzzxn, zzZXN zzzxn2, zzDA zzda) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iAbs;
        int iAbs2;
        int iAbs3;
        int iAbs4;
        int i6 = 0;
        boolean z = zzzxn.zzaU >= 0;
        boolean z2 = zzzxn2.zzaU >= 0;
        int i7 = zzzxn.zzaX;
        if (i7 != 0 && zzzxn2.zzaX != 0) {
            if (zzzxn.zzaZ == zzzxn2.zzaZ) {
                if (zzZ(zzzxn)) {
                    int i8 = zzzxn.zzaW;
                    zzzxn.zzaW = zzzxn2.zzaW;
                    zzzxn2.zzaW = i8;
                } else {
                    int i9 = zzzxn.zzaW;
                    int i10 = zzzxn2.zzaX;
                    if (i9 + i10 == 0) {
                        zzzxn.zzaW = -i9;
                    } else {
                        zzzxn.zzaW = i9 + i10;
                    }
                    int i11 = zzzxn2.zzaW;
                    int i12 = zzzxn.zzaX;
                    if (i11 - i12 == 0) {
                        zzzxn2.zzaW = -i11;
                    } else {
                        zzzxn2.zzaW = i11 - i12;
                    }
                }
            } else {
                if (!zzZ(zzzxn2)) {
                    i = zzzxn.zzaV + zzzxn2.zzaX;
                } else {
                    i = zzzxn.zzaV == 0 ? 1 : 0;
                }
                zzzxn.zzaV = i;
                if (!zzZ(zzzxn)) {
                    i6 = zzzxn2.zzaV - zzzxn.zzaX;
                } else if (zzzxn2.zzaV == 0) {
                    i6 = 1;
                }
                zzzxn2.zzaV = i6;
            }
            if (zzzxn.zzaZ == 0) {
                i2 = this.zzR2;
                i3 = this.zzR3;
            } else {
                i2 = this.zzR3;
                i3 = this.zzR2;
            }
            if (zzzxn2.zzaZ == 0) {
                i4 = this.zzR2;
                i5 = this.zzR3;
            } else {
                i4 = this.zzR3;
                i5 = this.zzR2;
            }
            if (i2 == 2) {
                iAbs = zzzxn.zzaW;
            } else if (i2 != 3) {
                iAbs = Math.abs(zzzxn.zzaW);
            } else {
                iAbs = -zzzxn.zzaW;
            }
            if (i4 == 2) {
                iAbs2 = zzzxn2.zzaW;
            } else if (i4 != 3) {
                iAbs2 = Math.abs(zzzxn2.zzaW);
            } else {
                iAbs2 = -zzzxn2.zzaW;
            }
            if (z && z2) {
                if ((iAbs != 0 && iAbs != 1) || ((iAbs2 != 0 && iAbs2 != 1) || (zzzxn.zzaZ != zzzxn2.zzaZ && this.zzR9 != 3))) {
                    zzZ(zzzxn, zzzxn2, zzda);
                    return;
                }
                zzZ(zzzxn, zzda);
                zzZ(zzzxn2, zzda);
                int i13 = zzzxn.zzaY;
                zzzxn.zzaY = zzzxn2.zzaY;
                zzzxn2.zzaY = i13;
                int i14 = zzzxn.zzaU;
                zzzxn.zzaU = zzzxn2.zzaU;
                zzzxn2.zzaU = i14;
                return;
            }
            if (z) {
                if (iAbs2 == 0 || iAbs2 == 1) {
                    zzZ(zzzxn, zzda);
                    int i15 = zzzxn.zzaY;
                    zzzxn.zzaY = zzzxn2.zzaY;
                    zzzxn2.zzaY = i15;
                    int i16 = zzzxn.zzaU;
                    zzzxn.zzaU = zzzxn2.zzaU;
                    zzzxn2.zzaU = i16;
                    return;
                }
                return;
            }
            if (z2) {
                if (iAbs == 0 || iAbs == 1) {
                    zzZ(zzzxn2, zzda);
                    int i17 = zzzxn.zzaY;
                    zzzxn.zzaY = zzzxn2.zzaY;
                    zzzxn2.zzaY = i17;
                    int i18 = zzzxn.zzaU;
                    zzzxn.zzaU = zzzxn2.zzaU;
                    zzzxn2.zzaU = i18;
                    return;
                }
                return;
            }
            if (iAbs == 0 || iAbs == 1) {
                if (iAbs2 == 0 || iAbs2 == 1) {
                    if (i3 == 2) {
                        iAbs3 = zzzxn.zzaV;
                    } else if (i3 != 3) {
                        iAbs3 = Math.abs(zzzxn.zzaV);
                    } else {
                        iAbs3 = -zzzxn.zzaV;
                    }
                    long j = iAbs3;
                    if (i5 == 2) {
                        iAbs4 = zzzxn2.zzaV;
                    } else if (i5 != 3) {
                        iAbs4 = Math.abs(zzzxn2.zzaV);
                    } else {
                        iAbs4 = -zzzxn2.zzaV;
                    }
                    long j2 = iAbs4;
                    int i19 = zzzxn.zzaZ;
                    if (i19 != zzzxn2.zzaZ) {
                        zzY(zzzxn, zzzxn2, zzda);
                        return;
                    }
                    if (iAbs == 1 && iAbs2 == 1) {
                        int i20 = this.zzR9;
                        if (i20 == 0) {
                            if (j <= 0 || j2 <= 0) {
                                return;
                            }
                            zzY(zzzxn, zzzxn2, zzda);
                            return;
                        }
                        if (i20 == 1) {
                            if (j > 0 || j2 > 0) {
                                return;
                            }
                            zzY(zzzxn, zzzxn2, zzda);
                            return;
                        }
                        if (i20 != 2) {
                            if (i20 != 3) {
                                return;
                            }
                            zzY(zzzxn, zzzxn2, zzda);
                            return;
                        } else {
                            if ((i19 != 1 || j <= 0 || j2 <= 0) && (i19 != 0 || j > 0 || j2 > 0)) {
                                return;
                            }
                            zzY(zzzxn, zzzxn2, zzda);
                            return;
                        }
                    }
                    int i21 = zzzxn.zzaY;
                    zzzxn.zzaY = zzzxn2.zzaY;
                    zzzxn2.zzaY = i21;
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 0 && zzzxn2.zzaX == 0) {
            return;
        }
        int i22 = zzzxn.zzaZ;
        int i23 = zzzxn2.zzaZ;
        if (i22 == i23 && i7 != zzzxn2.zzaX && this.zzR9 == 1) {
            if (i7 == 0) {
                if (z2) {
                    zzZ(zzzxn, zzda);
                    if (z) {
                        zzzxn.zzaU = -1;
                        return;
                    }
                    return;
                }
                return;
            }
            if (z) {
                zzZ(zzzxn2, zzda);
                if (z2) {
                    zzzxn2.zzaU = -1;
                    return;
                }
                return;
            }
            return;
        }
        if (i22 != i23) {
            if (i7 == 0 && Math.abs(zzzxn2.zzaW) == 1 && (this.zzR9 != 1 || zzzxn2.zzaV == 0)) {
                zzZ(zzzxn, zzda);
                if (z) {
                    zzzxn.zzaU = -1;
                    return;
                }
                return;
            }
            if (zzzxn2.zzaX == 0 && Math.abs(zzzxn.zzaW) == 1) {
                if (this.zzR9 != 1 || zzzxn.zzaV == 0) {
                    zzZ(zzzxn2, zzda);
                    if (z2) {
                        zzzxn2.zzaU = -1;
                    }
                }
            }
        }
    }

    private zz6X zzZ(zzZXN zzzxn, zzDA zzda) {
        int i = zzzxn.zzaU;
        if (i < 0) {
            zz6W zz6wZzTA = zzTA();
            zz6wZzTA.zzmt = zzzxn.zzaX == 0;
            zz6X zz6x = new zz6X();
            zz6wZzTA.zzmr = zz6x;
            zz6x.zzmx = zz6wZzTA.zzmx;
            zz6x.zzux = zzda;
            zz6x.zzmw = zz6x;
            zz6x.zzmv = zz6x;
            if (!zz6wZzTA.zzmt) {
                zzZ(zzzxn, zz6wZzTA);
            }
            zzzxn.zzaU = zz6wZzTA.zzmx;
            return zz6x;
        }
        zz6W zz6w = this.zzQS.get(i);
        zz6X zz6x2 = zz6w.zzmr;
        boolean z = zzzxn.zzaY == 0;
        if (z && zzDA.zzX(zzda, zz6x2.zzux)) {
            return zz6x2;
        }
        if (!z && zzDA.zzX(zzda, zz6x2.zzmv.zzux)) {
            return zz6x2.zzmv;
        }
        zz6X zz6x3 = new zz6X();
        zz6x3.zzmx = zz6w.zzmx;
        zz6x3.zzux = zzda;
        zz6x3.zzmw = zz6x2;
        zz6X zz6x4 = zz6x2.zzmv;
        zz6x3.zzmv = zz6x4;
        zz6x4.zzmw = zz6x3;
        zz6x2.zzmv = zz6x3;
        if (z) {
            zz6w.zzmr = zz6x3;
        }
        return zz6x3;
    }

    private void zzZ(zzZXN zzzxn, zz6W zz6w) {
        zzZXN zzzxn2 = null;
        for (zzZXN zzzxn3 = zzzxn.zzaP; zzzxn3 != null; zzzxn3 = zzzxn3.zzaP) {
            int i = zzzxn3.zzaU;
            if (i >= 0 && zzzxn3.zzaX != 0) {
                if (zzzxn2 == null) {
                    zzzxn2 = zzzxn3;
                } else if (zzzxn2.zzaU == i) {
                    zzzxn2 = null;
                }
            }
        }
        if (zzzxn2 == null) {
            zz6w.zzms = null;
        } else {
            zz6W zz6w2 = this.zzQS.get(zzzxn2.zzaU);
            zz6w.zzms = zz6w2;
            boolean z = zz6w2.zzmu ? false : true;
            zz6w.zzmu = z;
        }
        zz6w.zzmu = z;
    }

    private void zzW(zz6W zz6w, zz6W zz6w2) {
        zz6W zz6wZzX;
        zz6W zz6w3 = zz6w2.zzms;
        for (zz6W zz6w4 : this.zzQS) {
            if (zz6w4.zzmr != null && zz6w4 != zz6w2 && zz6w4 != zz6w && ((zz6wZzX = zzX(zz6w4.zzms)) == zz6w3 || zz6wZzX == zz6w || zz6wZzX == zz6w2)) {
                if (zzY(zz6w4.zzmr, zz6w.zzmr)) {
                    zz6w4.zzms = zz6w;
                } else if (zzY(zz6w4.zzmr, zz6w2.zzmr)) {
                    zz6w4.zzms = zz6w2;
                } else {
                    zz6W zz6w5 = zz6w4.zzms;
                    if (zz6w5 == zz6w || zz6w5 == zz6w2) {
                        zz6w4.zzms = zz6w3;
                    }
                }
            }
        }
    }

    private static double zzZ(zzDA zzda, zzDA zzda2) {
        if (zzda.zzuR == zzda2.zzuR) {
            return -3.4E38d;
        }
        return (zzda2.zzuS - zzda.zzuS) / (r2 - r0);
    }

    private static boolean zzZ(zz6X zz6x, zz6X zz6x2) {
        zz6X zz6x3 = zz6x.zzmv;
        while (zzDA.zzX(zz6x3.zzux, zz6x.zzux) && zz6x3 != zz6x) {
            zz6x3 = zz6x3.zzmv;
        }
        double dAbs = Math.abs(zzZ(zz6x.zzux, zz6x3.zzux));
        zz6X zz6x4 = zz6x.zzmw;
        while (zzDA.zzX(zz6x4.zzux, zz6x.zzux) && zz6x4 != zz6x) {
            zz6x4 = zz6x4.zzmw;
        }
        double dAbs2 = Math.abs(zzZ(zz6x.zzux, zz6x4.zzux));
        zz6X zz6x5 = zz6x2.zzmv;
        while (zzDA.zzX(zz6x5.zzux, zz6x2.zzux) && zz6x5 != zz6x2) {
            zz6x5 = zz6x5.zzmv;
        }
        double dAbs3 = Math.abs(zzZ(zz6x2.zzux, zz6x5.zzux));
        zz6X zz6x6 = zz6x2.zzmw;
        while (zzDA.zzX(zz6x6.zzux, zz6x2.zzux) && zz6x6 != zz6x2) {
            zz6x6 = zz6x6.zzmw;
        }
        double dAbs4 = Math.abs(zzZ(zz6x2.zzux, zz6x6.zzux));
        return (Math.max(dAbs, dAbs2) == Math.max(dAbs3, dAbs4) && Math.min(dAbs, dAbs2) == Math.min(dAbs3, dAbs4)) ? zzW(zz6x) > 0.0d : (dAbs >= dAbs3 && dAbs >= dAbs4) || (dAbs2 >= dAbs3 && dAbs2 >= dAbs4);
    }

    private static void zzW(zz6W zz6w) {
        zz6X zz6x = zz6w.zzmr;
        do {
            zz6x.zzmx = zz6w.zzmx;
            zz6x = zz6x.zzmv;
        } while (zz6x != zz6w.zzmr);
    }

    private static double zzW(zz6X zz6x) {
        double d = 0.0d;
        if (zz6x == null) {
            return 0.0d;
        }
        zz6X zz6x2 = zz6x;
        do {
            long j = zz6x2.zzmv.zzux.zzuS;
            zzDA zzda = zz6x2.zzux;
            d += (j + zzda.zzuS) * (r3.zzuR - zzda.zzuR);
            zz6x2 = zz6x2.zzmw;
        } while (zz6x2 != zz6x);
        return d * 0.5d;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zz6X zzZ(zz6X zz6x) {
        zz6X zz6x2 = zz6x.zzmw;
        zz6X zz6x3 = null;
        while (zz6x2 != zz6x) {
            zzDA zzda = zz6x2.zzux;
            long j = zzda.zzuR;
            zzDA zzda2 = zz6x.zzux;
            long j2 = zzda2.zzuR;
            if (j <= j2) {
                if (j == j2) {
                    long j3 = zzda.zzuS;
                    long j4 = zzda2.zzuS;
                    if (j3 <= j4) {
                        if (j3 < j4) {
                            zz6x = zz6x2;
                            zz6x3 = null;
                        } else if (zz6x2.zzmw != zz6x && zz6x2.zzmv != zz6x) {
                            zz6x3 = zz6x2;
                        }
                    }
                }
            }
            zz6x2 = zz6x2.zzmw;
        }
        if (zz6x3 != null) {
            while (zz6x3 != zz6x2) {
                if (!zzZ(zz6x2, zz6x3)) {
                    zz6x = zz6x3;
                }
                do {
                    zz6x3 = zz6x3.zzmw;
                } while (!zzDA.zzX(zz6x3.zzux, zz6x.zzux));
            }
        }
        return zz6x;
    }

    private zz6W zzZ(zz6W zz6w, zz6W zz6w2) {
        if (zz6w.zzmq == null) {
            zz6w.zzmq = zzZ(zz6w.zzmr);
        }
        if (zz6w2.zzmq == null) {
            zz6w2.zzmq = zzZ(zz6w2.zzmr);
        }
        zz6X zz6x = zz6w.zzmq;
        zz6X zz6x2 = zz6w2.zzmq;
        zzDA zzda = zz6x.zzux;
        long j = zzda.zzuR;
        zzDA zzda2 = zz6x2.zzux;
        long j2 = zzda2.zzuR;
        if (j <= j2) {
            if (j >= j2) {
                long j3 = zzda.zzuS;
                long j4 = zzda2.zzuS;
                if (j3 >= j4 && (j3 > j4 || zz6x.zzmw == zz6x || (zz6x2.zzmw != zz6x2 && !zzZ(zz6x, zz6x2)))) {
                }
            }
            return zz6w2;
        }
        return zz6w;
    }

    private static void zzZ(zzZXN zzzxn, RefInt refInt, RefLong refLong, RefLong refLong2) {
        long j = zzzxn.zzb4.zzuS;
        long j2 = zzzxn.zzb2.zzuS;
        if (j < j2) {
            refLong.set(j);
            refLong2.set(zzzxn.zzb2.zzuS);
            refInt.set(1);
        } else {
            refLong.set(j2);
            refLong2.set(zzzxn.zzb4.zzuS);
            refInt.set(0);
        }
    }

    private static zzZXN zzZ(zzZXN zzzxn, int i) {
        return i == 1 ? zzzxn.zzaQ : zzzxn.zzaP;
    }

    private static boolean zzZ(zzZXN zzzxn, double d) {
        return zzzxn != null && ((double) zzzxn.zzb2.zzuR) == d && zzzxn.zzaR == null;
    }

    private static boolean zzZ(zzD2 zzd2) {
        zzZXN zzzxn = zzd2.zzuz;
        zzZXN zzzxn2 = zzzxn.zzaO;
        zzZXN zzzxn3 = zzd2.zzuy;
        return zzzxn2 == zzzxn3 || zzzxn.zzaN == zzzxn3;
    }

    private static long zzZ(zzZXN zzzxn, long j) {
        zzDA zzda = zzzxn.zzb2;
        if (j == zzda.zzuR) {
            return zzda.zzuS;
        }
        return zzzxn.zzb4.zzuS + round(zzzxn.zzb0 * (j - r0.zzuR));
    }

    private static void zzZ(zzZXN zzzxn, zzZXN zzzxn2, Ref<zzDA> ref) {
        ref.set(new zzDA());
        double d = zzzxn.zzb0;
        double d2 = zzzxn2.zzb0;
        if (d == d2) {
            ref.get().zzuR = zzzxn.zzpR().zzuR;
            ref.get().zzuS = zzZ(zzzxn, ref.get().zzuR);
            return;
        }
        if (zzzxn.zzb1.zzuS == 0) {
            ref.get().zzuS = zzzxn.zzb4.zzuS;
            if (zzTJ.zzP(zzzxn2)) {
                ref.get().zzuR = zzzxn2.zzb4.zzuR;
            } else {
                zzDA zzda = zzzxn2.zzb4;
                ref.get().zzuR = round((ref.get().zzuS / zzzxn2.zzb0) + (zzda.zzuR - (zzda.zzuS / zzzxn2.zzb0)));
            }
        } else if (zzzxn2.zzb1.zzuS == 0) {
            ref.get().zzuS = zzzxn2.zzb4.zzuS;
            if (zzTJ.zzP(zzzxn)) {
                ref.get().zzuR = zzzxn.zzb4.zzuR;
            } else {
                zzDA zzda2 = zzzxn.zzb4;
                ref.get().zzuR = round((ref.get().zzuS / zzzxn.zzb0) + (zzda2.zzuR - (zzda2.zzuS / zzzxn.zzb0)));
            }
        } else {
            zzDA zzda3 = zzzxn.zzb4;
            double d3 = zzda3.zzuS - (zzda3.zzuR * d);
            zzDA zzda4 = zzzxn2.zzb4;
            double d4 = zzda4.zzuS - (zzda4.zzuR * d2);
            double d5 = (d4 - d3) / (d - d2);
            ref.get().zzuR = round(d5);
            if (Math.abs(zzzxn.zzb0) < Math.abs(zzzxn2.zzb0)) {
                ref.get().zzuS = round((zzzxn.zzb0 * d5) + d3);
            } else {
                ref.get().zzuS = round((zzzxn2.zzb0 * d5) + d4);
            }
        }
        if (ref.get().zzuR < zzzxn.zzb2.zzuR || ref.get().zzuR < zzzxn2.zzb2.zzuR) {
            if (zzzxn.zzb2.zzuR > zzzxn2.zzb2.zzuR) {
                ref.get().zzuR = zzzxn.zzb2.zzuR;
            } else {
                ref.get().zzuR = zzzxn2.zzb2.zzuR;
            }
            if (Math.abs(zzzxn.zzb0) < Math.abs(zzzxn2.zzb0)) {
                ref.get().zzuS = zzZ(zzzxn, ref.get().zzuR);
            } else {
                ref.get().zzuS = zzZ(zzzxn2, ref.get().zzuR);
            }
        }
        if (ref.get().zzuR > zzzxn.zzpR().zzuR) {
            ref.get().zzuR = zzzxn.zzpR().zzuR;
            if (Math.abs(zzzxn.zzb0) > Math.abs(zzzxn2.zzb0)) {
                ref.get().zzuS = zzZ(zzzxn2, ref.get().zzuR);
            } else {
                ref.get().zzuS = zzZ(zzzxn, ref.get().zzuR);
            }
        }
    }

    private static int zzX(zz6X zz6x) {
        int i = 0;
        if (zz6x == null) {
            return 0;
        }
        zz6X zz6x2 = zz6x;
        do {
            i++;
            zz6x2 = zz6x2.zzmw;
        } while (zz6x2 != zz6x);
        return i;
    }

    private void zzX(zz6W zz6w, zz6W zz6w2) {
        for (zz6W zz6w3 : this.zzQS) {
            zz6W zz6wZzX = zzX(zz6w3.zzms);
            zz6X zz6x = zz6w3.zzmr;
            if (zz6x != null && zz6wZzX == zz6w && zzY(zz6x, zz6w2.zzmr)) {
                zz6w3.zzms = zz6w2;
            }
        }
    }

    private static zz6W zzX(zz6W zz6w) {
        while (zz6w != null && zz6w.zzmr == null) {
            zz6w = zz6w.zzms;
        }
        return zz6w;
    }

    public static boolean zzZ(zzD9 zzd9) {
        return zzY(zzd9) >= 0.0d;
    }

    private void zzZ(zz0M zz0m) {
        int iZzX;
        zz0m.clear();
        zz0m.zzH(this.zzQS.getCount());
        for (int i = 0; i < this.zzQS.getCount(); i++) {
            zz6X zz6x = this.zzQS.get(i).zzmr;
            if (zz6x != null && (iZzX = zzX((zz6x = zz6x.zzmv))) >= 2) {
                zzD9 zzd9 = new zzD9(iZzX);
                for (int i2 = 0; i2 < iZzX; i2++) {
                    zzd9.add(zz6x.zzux);
                    zz6X zz6x2 = zz6x2.zzmv;
                }
                zz0m.add(zzd9);
            }
        }
    }

    private static void zzZ(zz6W zz6w) {
        zz6X zz6x = zz6w.zzmr;
        zz6X zz6x2 = zz6x.zzmv;
        while (zz6x != zz6x2) {
            zz6x = zz6x.zzmw;
            if (zzDA.zzX(zz6x.zzux, zz6x.zzmv.zzux)) {
                if (zz6x == zz6x2) {
                    zz6x2 = zz6x.zzmv;
                }
                zz6X zz6x3 = zz6x.zzmv;
                zz6x3.zzmw = zz6x.zzmw;
                zz6x.zzmw.zzmv = zz6x3;
                zz6x = zz6x3;
            }
        }
        if (zz6x == zz6x.zzmv) {
            zz6w.zzmr = null;
        }
    }

    private static zz6X zzZ(zz6X zz6x, boolean z) {
        zz6X zz6x2 = new zz6X();
        zz6x2.zzux = zz6x.zzux;
        zz6x2.zzmx = zz6x.zzmx;
        if (z) {
            zz6x2.zzmw = zz6x.zzmw;
            zz6x2.zzmv = zz6x;
            zz6x.zzmw.zzmv = zz6x2;
            zz6x.zzmw = zz6x2;
            return zz6x2;
        }
        zz6x2.zzmv = zz6x.zzmv;
        zz6x2.zzmw = zz6x;
        zz6x.zzmv.zzmw = zz6x2;
        zz6x.zzmv = zz6x2;
        return zz6x2;
    }

    private static boolean zzZ(long j, long j2, long j3, long j4, RefLong refLong, RefLong refLong2) {
        if (j < j2) {
            if (j3 < j4) {
                refLong.set(Math.max(j, j3));
                refLong2.set(Math.min(j2, j4));
            } else {
                refLong.set(Math.max(j, j4));
                refLong2.set(Math.min(j2, j3));
            }
        } else if (j3 < j4) {
            refLong.set(Math.max(j2, j3));
            refLong2.set(Math.min(j, j4));
        } else {
            refLong.set(Math.max(j2, j4));
            refLong2.set(Math.min(j, j3));
        }
        return refLong.get() < refLong2.get();
    }

    private static boolean zzZ(zz6X zz6x, zz6X zz6x2, zz6X zz6x3, zz6X zz6x4, zzDA zzda, boolean z) {
        zz6X zz6x5;
        long j;
        zz6X zz6xZzZ;
        zz6X zz6xZzZ2;
        zz6X zz6x6;
        long j2;
        zz6X zz6xZzZ3;
        zz6X zz6xZzZ4;
        zz6X zz6x7;
        long j3;
        zz6X zz6x8;
        long j4;
        zz6X zz6x9 = zz6x;
        boolean z2 = zz6x9.zzux.zzuS <= zz6x2.zzux.zzuS;
        zz6X zz6x10 = zz6x3;
        boolean z3 = zz6x10.zzux.zzuS <= zz6x4.zzux.zzuS;
        if (z2 == z3) {
            return false;
        }
        if (z2) {
            while (true) {
                zz6x8 = zz6x9.zzmw;
                zzDA zzda2 = zz6x8.zzux;
                long j5 = zzda2.zzuS;
                j4 = zzda.zzuS;
                if (j5 > j4 || j5 < zz6x9.zzux.zzuS || zzda2.zzuR != zzda.zzuR) {
                    break;
                }
                zz6x9 = zz6x8;
            }
            if (z && zz6x9.zzux.zzuS != j4) {
                zz6x9 = zz6x8;
            }
            zz6xZzZ = zzZ(zz6x9, !z);
            if (!zzDA.zzX(zz6xZzZ.zzux, zzda)) {
                zz6xZzZ.zzux = zzda;
                zz6xZzZ2 = zzZ(zz6xZzZ, !z);
                zz6X zz6x11 = zz6xZzZ;
                zz6xZzZ = zz6xZzZ2;
                zz6x9 = zz6x11;
            }
        } else {
            while (true) {
                zz6x5 = zz6x9.zzmw;
                zzDA zzda3 = zz6x5.zzux;
                long j6 = zzda3.zzuS;
                j = zzda.zzuS;
                if (j6 < j || j6 > zz6x9.zzux.zzuS || zzda3.zzuR != zzda.zzuR) {
                    break;
                }
                zz6x9 = zz6x5;
            }
            if (!z && zz6x9.zzux.zzuS != j) {
                zz6x9 = zz6x5;
            }
            zz6xZzZ = zzZ(zz6x9, z);
            if (!zzDA.zzX(zz6xZzZ.zzux, zzda)) {
                zz6xZzZ.zzux = zzda;
                zz6xZzZ2 = zzZ(zz6xZzZ, z);
                zz6X zz6x112 = zz6xZzZ;
                zz6xZzZ = zz6xZzZ2;
                zz6x9 = zz6x112;
            }
        }
        if (z3) {
            while (true) {
                zz6x7 = zz6x10.zzmw;
                zzDA zzda4 = zz6x7.zzux;
                long j7 = zzda4.zzuS;
                j3 = zzda.zzuS;
                if (j7 > j3 || j7 < zz6x10.zzux.zzuS || zzda4.zzuR != zzda.zzuR) {
                    break;
                }
                zz6x10 = zz6x7;
            }
            if (z && zz6x10.zzux.zzuS != j3) {
                zz6x10 = zz6x7;
            }
            zz6xZzZ3 = zzZ(zz6x10, !z);
            if (!zzDA.zzX(zz6xZzZ3.zzux, zzda)) {
                zz6xZzZ3.zzux = zzda;
                zz6xZzZ4 = zzZ(zz6xZzZ3, !z);
                zz6x10 = zz6xZzZ3;
                zz6xZzZ3 = zz6xZzZ4;
            }
        } else {
            while (true) {
                zz6x6 = zz6x10.zzmw;
                zzDA zzda5 = zz6x6.zzux;
                long j8 = zzda5.zzuS;
                j2 = zzda.zzuS;
                if (j8 < j2 || j8 > zz6x10.zzux.zzuS || zzda5.zzuR != zzda.zzuR) {
                    break;
                }
                zz6x10 = zz6x6;
            }
            if (!z && zz6x10.zzux.zzuS != j2) {
                zz6x10 = zz6x6;
            }
            zz6xZzZ3 = zzZ(zz6x10, z);
            if (!zzDA.zzX(zz6xZzZ3.zzux, zzda)) {
                zz6xZzZ3.zzux = zzda;
                zz6xZzZ4 = zzZ(zz6xZzZ3, z);
                zz6x10 = zz6xZzZ3;
                zz6xZzZ3 = zz6xZzZ4;
            }
        }
        if ((z2) == z) {
            zz6x9.zzmv = zz6x10;
            zz6x10.zzmw = zz6x9;
            zz6xZzZ.zzmw = zz6xZzZ3;
            zz6xZzZ3.zzmv = zz6xZzZ;
        } else {
            zz6x9.zzmw = zz6x10;
            zz6x10.zzmv = zz6x9;
            zz6xZzZ.zzmv = zz6xZzZ3;
            zz6xZzZ3.zzmw = zz6xZzZ;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0196 A[PHI: r3
      0x0196: PHI (r3v19 com.aspose.words.internal.zzDA) = (r3v16 com.aspose.words.internal.zzDA), (r3v15 com.aspose.words.internal.zzDA) binds: [B:99:0x01a2, B:94:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0198 A[PHI: r3
      0x0198: PHI (r3v17 com.aspose.words.internal.zzDA) = (r3v16 com.aspose.words.internal.zzDA), (r3v15 com.aspose.words.internal.zzDA) binds: [B:99:0x01a2, B:94:0x0194] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean zzZ(zzCS zzcs, zz6W zz6w, zz6W zz6w2) {
        zz6X zz6x;
        zz6X zz6x2;
        zz6X zz6x3;
        zz6X zz6x4;
        boolean z;
        zzDA zzda;
        boolean z2;
        zz6X zz6x5 = zzcs.zzuc;
        zz6X zz6x6 = zzcs.zzub;
        zzDA zzda2 = zz6x5.zzux;
        long j = zzda2.zzuR;
        zzDA zzda3 = zzcs.zzua;
        boolean z3 = j == zzda3.zzuR;
        if (z3 && zzDA.zzX(zzda3, zzda2) && zzDA.zzX(zzcs.zzua, zzcs.zzub.zzux)) {
            if (zz6w != zz6w2) {
                return false;
            }
            zz6X zz6x7 = zzcs.zzuc.zzmw;
            while (zz6x7 != zz6x5 && zzDA.zzX(zz6x7.zzux, zzcs.zzua)) {
                zz6x7 = zz6x7.zzmw;
            }
            boolean z4 = zz6x7.zzux.zzuR > zzcs.zzua.zzuR;
            zz6X zz6x8 = zzcs.zzub.zzmw;
            while (zz6x8 != zz6x6 && zzDA.zzX(zz6x8.zzux, zzcs.zzua)) {
                zz6x8 = zz6x8.zzmw;
            }
            if (z4 == (zz6x8.zzux.zzuR > zzcs.zzua.zzuR)) {
                return false;
            }
            if (z4) {
                zz6X zz6xZzZ = zzZ(zz6x5, false);
                zz6X zz6xZzZ2 = zzZ(zz6x6, true);
                zz6x5.zzmv = zz6x6;
                zz6x6.zzmw = zz6x5;
                zz6xZzZ.zzmw = zz6xZzZ2;
                zz6xZzZ2.zzmv = zz6xZzZ;
                zzcs.zzuc = zz6x5;
                zzcs.zzub = zz6xZzZ;
                return true;
            }
            zz6X zz6xZzZ3 = zzZ(zz6x5, true);
            zz6X zz6xZzZ4 = zzZ(zz6x6, false);
            zz6x5.zzmw = zz6x6;
            zz6x6.zzmv = zz6x5;
            zz6xZzZ3.zzmv = zz6xZzZ4;
            zz6xZzZ4.zzmw = zz6xZzZ3;
            zzcs.zzuc = zz6x5;
            zzcs.zzub = zz6xZzZ3;
            return true;
        }
        if (!z3) {
            zz6X zz6x9 = zz6x5.zzmw;
            while (zzDA.zzX(zz6x9.zzux, zz6x5.zzux) && zz6x9 != zz6x5) {
                zz6x9 = zz6x9.zzmw;
            }
            zzDA zzda4 = zz6x9.zzux;
            long j2 = zzda4.zzuR;
            zzDA zzda5 = zz6x5.zzux;
            boolean z5 = j2 > zzda5.zzuR || !zzTJ.zzZ(zzda5, zzda4, zzcs.zzua, this.zzQQ);
            if (z5) {
                zz6x9 = zz6x5.zzmv;
                while (zzDA.zzX(zz6x9.zzux, zz6x5.zzux) && zz6x9 != zz6x5) {
                    zz6x9 = zz6x9.zzmv;
                }
                zzDA zzda6 = zz6x9.zzux;
                long j3 = zzda6.zzuR;
                zzDA zzda7 = zz6x5.zzux;
                if (j3 > zzda7.zzuR || !zzTJ.zzZ(zzda7, zzda6, zzcs.zzua, this.zzQQ)) {
                    return false;
                }
            }
            zz6X zz6x10 = zz6x6.zzmw;
            while (zzDA.zzX(zz6x10.zzux, zz6x6.zzux) && zz6x10 != zz6x6) {
                zz6x10 = zz6x10.zzmw;
            }
            zzDA zzda8 = zz6x10.zzux;
            long j4 = zzda8.zzuR;
            zzDA zzda9 = zz6x6.zzux;
            boolean z6 = j4 > zzda9.zzuR || !zzTJ.zzZ(zzda9, zzda8, zzcs.zzua, this.zzQQ);
            if (z6) {
                zz6x10 = zz6x6.zzmv;
                while (zzDA.zzX(zz6x10.zzux, zz6x6.zzux) && zz6x10 != zz6x6) {
                    zz6x10 = zz6x10.zzmv;
                }
                zzDA zzda10 = zz6x10.zzux;
                long j5 = zzda10.zzuR;
                zzDA zzda11 = zz6x6.zzux;
                if (j5 > zzda11.zzuR || !zzTJ.zzZ(zzda11, zzda10, zzcs.zzua, this.zzQQ)) {
                    return false;
                }
            }
            if (zz6x9 == zz6x5 || zz6x10 == zz6x6 || zz6x9 == zz6x10 || (zz6w == zz6w2 && z5 == z6)) {
                return false;
            }
            if (z5) {
                zz6X zz6xZzZ5 = zzZ(zz6x5, false);
                zz6X zz6xZzZ6 = zzZ(zz6x6, true);
                zz6x5.zzmv = zz6x6;
                zz6x6.zzmw = zz6x5;
                zz6xZzZ5.zzmw = zz6xZzZ6;
                zz6xZzZ6.zzmv = zz6xZzZ5;
                zzcs.zzuc = zz6x5;
                zzcs.zzub = zz6xZzZ5;
                return true;
            }
            zz6X zz6xZzZ7 = zzZ(zz6x5, true);
            zz6X zz6xZzZ8 = zzZ(zz6x6, false);
            zz6x5.zzmw = zz6x6;
            zz6x6.zzmv = zz6x5;
            zz6xZzZ7.zzmv = zz6xZzZ8;
            zz6xZzZ8.zzmw = zz6xZzZ7;
            zzcs.zzuc = zz6x5;
            zzcs.zzub = zz6xZzZ7;
            return true;
        }
        zz6X zz6x11 = zz6x5;
        while (true) {
            zz6X zz6x12 = zz6x11.zzmv;
            if (zz6x12.zzux.zzuR != zz6x11.zzux.zzuR || zz6x12 == zz6x5 || zz6x12 == zz6x6) {
                break;
            }
            zz6x11 = zz6x12;
        }
        while (true) {
            zz6x = zz6x5.zzmw;
            if (zz6x.zzux.zzuR != zz6x5.zzux.zzuR || zz6x == zz6x11 || zz6x == zz6x6) {
                break;
            }
            zz6x5 = zz6x;
        }
        if (zz6x == zz6x11 || zz6x == zz6x6) {
            return false;
        }
        zz6X zz6x13 = zz6x6;
        while (true) {
            zz6X zz6x14 = zz6x13.zzmv;
            if (zz6x14.zzux.zzuR != zz6x13.zzux.zzuR || zz6x14 == zz6x6 || zz6x14 == zz6x5) {
                break;
            }
            zz6x13 = zz6x14;
        }
        do {
            zz6x2 = zz6x6;
            zz6x6 = zz6x2.zzmw;
            if (zz6x6.zzux.zzuR != zz6x2.zzux.zzuR || zz6x6 == zz6x13) {
                break;
            }
        } while (zz6x6 != zz6x11);
        if (zz6x6 == zz6x13 || zz6x6 == zz6x11) {
            return false;
        }
        RefLong refLong = new RefLong(0L);
        RefLong refLong2 = new RefLong(0L);
        zz6X zz6x15 = zz6x13;
        zz6X zz6x16 = zz6x11;
        boolean zZzZ = zzZ(zz6x11.zzux.zzuS, zz6x5.zzux.zzuS, zz6x13.zzux.zzuS, zz6x2.zzux.zzuS, refLong, refLong2);
        long j6 = refLong.get();
        long j7 = refLong2.get();
        if (!zZzZ) {
            return false;
        }
        zzDA zzda12 = zz6x16.zzux;
        long j8 = zzda12.zzuS;
        if (j8 < j6 || j8 > j7) {
            zz6x3 = zz6x15;
            zzDA zzda13 = zz6x3.zzux;
            long j9 = zzda13.zzuS;
            if (j9 < j6 || j9 > j7) {
                zzDA zzda14 = zz6x5.zzux;
                zz6x4 = zz6x5;
                long j10 = zzda14.zzuS;
                if (j10 < j6 || j10 > j7) {
                    zzda14 = zz6x2.zzux;
                    z = zzda14.zzuS > j9;
                } else if (j10 > j8) {
                }
                zzda = zzda14;
            } else {
                z = j9 > zz6x2.zzux.zzuS;
                zzda = zzda13;
                zz6x4 = zz6x5;
            }
            z2 = z;
        } else {
            zzda = zzda12;
            zz6x4 = zz6x5;
            z2 = j8 > zz6x5.zzux.zzuS;
            zz6x3 = zz6x15;
        }
        zzcs.zzuc = zz6x16;
        zzcs.zzub = zz6x3;
        return zzZ(zz6x16, zz6x4, zz6x3, zz6x2, zzda, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzZ(zzDA zzda, zz6X zz6x) {
        long j;
        int i;
        boolean z;
        long j2 = zzda.zzuS;
        long j3 = zzda.zzuR;
        zzDA zzda2 = zz6x.zzux;
        long j4 = zzda2.zzuS;
        long j5 = zzda2.zzuR;
        zz6X zz6x2 = zz6x;
        int i2 = 0;
        while (true) {
            zz6x2 = zz6x2.zzmw;
            zzDA zzda3 = zz6x2.zzux;
            long j6 = zzda3.zzuS;
            long j7 = zzda3.zzuR;
            if (j7 != j3) {
                j = j7;
                i = -1;
            } else {
                if (j6 == j2) {
                    return -1;
                }
                if (j5 == j3) {
                    boolean z2 = j6 > j2;
                    i = -1;
                    if (j4 < j2) {
                        j = j7;
                        z = true;
                    } else {
                        j = j7;
                        z = false;
                    }
                    if (z2 == z) {
                        return -1;
                    }
                }
            }
            if ((j5 < j3) != (j7 < j3)) {
                if (j4 >= j2) {
                    if (j6 > j2) {
                        i2 = 1 - i2;
                    } else {
                        double d = ((j4 - j2) * (j - j3)) - ((j6 - j2) * (j5 - j3));
                        if (d == 0.0d) {
                            return i;
                        }
                        if ((d > 0.0d) == (j > j5)) {
                        }
                    }
                } else if (j6 > j2) {
                    double d2 = ((j4 - j2) * (j - j3)) - ((j6 - j2) * (j5 - j3));
                    if (d2 == 0.0d) {
                        return i;
                    }
                    if ((d2 > 0.0d) == (j > j5)) {
                    }
                }
            }
            if (zz6x == zz6x2) {
                return i2;
            }
            j4 = j6;
            j5 = j;
        }
    }
}
