package com.aspose.words.internal;

import com.aspose.slides.o000oOoO;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzTH {
    private double zzQA;
    private double zzQB;
    private zz0N zzQC;
    private zzDA zzQD;
    private double zzQE;
    private double zzQF;
    private double zzQG;
    private double zzQH;
    private double zzQI;
    private double zzQJ;
    private zzQM zzQK;
    private zzD9 zzQL;
    private zzD9 zzQM;
    private zz0M zzQN;

    public zzTH() {
        this((byte) 0);
    }

    private static long round(double d) {
        return (long) (d < 0.0d ? d - 0.5d : d + 0.5d);
    }

    private void zzTz() {
        long j = this.zzQD.zzuS;
        int i = 0;
        if (j < 0 || zzTK.zzZ(this.zzQC.zzem.get((int) j).zzeq)) {
            while (i < this.zzQC.zzem.size()) {
                zz0N zz0n = this.zzQC.zzem.get(i);
                if (zz0n.zzen == 1 && !zzTK.zzZ(zz0n.zzeq)) {
                    zz0n.zzeq.reverse();
                }
                i++;
            }
            return;
        }
        while (i < this.zzQC.zzem.size()) {
            zz0N zz0n2 = this.zzQC.zzem.get(i);
            int i2 = zz0n2.zzen;
            if (i2 == 0 || (i2 == 1 && zzTK.zzZ(zz0n2.zzeq))) {
                zz0n2.zzeq.reverse();
            }
            i++;
        }
    }

    private int zzU(int i, int i2, int i3) {
        double d = (this.zzQK.get(i2).zzLb * this.zzQK.get(i).zzLa) - (this.zzQK.get(i).zzLb * this.zzQK.get(i2).zzLa);
        this.zzQI = d;
        if (Math.abs(d * this.zzQJ) < 1.0d) {
            if ((this.zzQK.get(i).zzLa * this.zzQK.get(i2).zzLa) + (this.zzQK.get(i2).zzLb * this.zzQK.get(i).zzLb) > 0.0d) {
                this.zzQL.add(new zzDA(round((this.zzQK.get(i2).zzLb * this.zzQJ) + this.zzQM.get(i).zzuS), round((this.zzQK.get(i2).zzLa * this.zzQJ) + this.zzQM.get(i).zzuR)));
                return i2;
            }
        } else {
            double d2 = this.zzQI;
            if (d2 > 1.0d) {
                this.zzQI = 1.0d;
            } else if (d2 < -1.0d) {
                this.zzQI = -1.0d;
            }
        }
        if (this.zzQI * this.zzQJ < 0.0d) {
            this.zzQL.add(new zzDA(round((this.zzQK.get(i2).zzLb * this.zzQJ) + this.zzQM.get(i).zzuS), round((this.zzQK.get(i2).zzLa * this.zzQJ) + this.zzQM.get(i).zzuR)));
            this.zzQL.add(this.zzQM.get(i));
            this.zzQL.add(new zzDA(round((this.zzQK.get(i).zzLb * this.zzQJ) + this.zzQM.get(i).zzuS), round((this.zzQK.get(i).zzLa * this.zzQJ) + this.zzQM.get(i).zzuR)));
            return i;
        }
        if (i3 == 0) {
            zzv(i, i2);
            return i;
        }
        if (i3 == 1) {
            zzu(i, i2);
            return i;
        }
        if (i3 != 2) {
            return i;
        }
        double dOooO00o = o000oOoO.OooO00o(this.zzQK.get(i).zzLa, this.zzQK.get(i2).zzLa, this.zzQK.get(i).zzLb * this.zzQK.get(i2).zzLb, 1.0d);
        if (dOooO00o >= this.zzQF) {
            zzZ(i, i2, dOooO00o);
            return i;
        }
        zzv(i, i2);
        return i;
    }

    private static zzQN zzY(zzDA zzda, zzDA zzda2) {
        double d = zzda2.zzuS - zzda.zzuS;
        double d2 = zzda2.zzuR - zzda.zzuR;
        if (d == 0.0d && d2 == 0.0d) {
            return new zzQN();
        }
        double dSqrt = 1.0d / Math.sqrt((d2 * d2) + (d * d));
        return new zzQN(d2 * dSqrt, -(d * dSqrt));
    }

    private void zzZ(zzD9 zzd9, int i, int i2) {
        int count = zzd9.getCount() - 1;
        if (count < 0) {
            return;
        }
        zz0N zz0n = new zz0N();
        zz0n.zzeo = 2;
        int i3 = 0;
        zz0n.zzen = 0;
        while (count > 0 && zzDA.zzX(zzd9.get(0), zzd9.get(count))) {
            count--;
        }
        zz0n.zzeq.zzH(count + 1);
        zz0n.zzeq.add(zzd9.get(0));
        int i4 = 0;
        for (int i5 = 1; i5 <= count; i5++) {
            if (!zzDA.zzX(zz0n.zzeq.get(i3), zzd9.get(i5))) {
                i3++;
                zz0n.zzeq.add(zzd9.get(i5));
                if (zzd9.get(i5).zzuR > zz0n.zzeq.get(i4).zzuR || (zzd9.get(i5).zzuR == zz0n.zzeq.get(i4).zzuR && zzd9.get(i5).zzuS < zz0n.zzeq.get(i4).zzuS)) {
                    i4 = i3;
                }
            }
        }
        if (i3 < 2) {
            return;
        }
        this.zzQC.zzZ(zz0n);
        long j = this.zzQD.zzuS;
        if (j < 0) {
            this.zzQD = new zzDA(this.zzQC.zzem.size() - 1, i4);
            return;
        }
        zzDA zzda = this.zzQC.zzem.get((int) j).zzeq.get((int) this.zzQD.zzuR);
        if (zz0n.zzeq.get(i4).zzuR > zzda.zzuR || (zz0n.zzeq.get(i4).zzuR == zzda.zzuR && zz0n.zzeq.get(i4).zzuS < zzda.zzuS)) {
            this.zzQD = new zzDA(this.zzQC.zzem.size() - 1, i4);
        }
    }

    private void zzu(int i, int i2) {
        int iMax = Math.max((int) round(Math.abs(Math.atan2(this.zzQI, (this.zzQK.get(i2).zzLa * this.zzQK.get(i).zzLa) + (this.zzQK.get(i2).zzLb * this.zzQK.get(i).zzLb))) * this.zzQE), 1);
        double d = this.zzQK.get(i2).zzLb;
        double d2 = this.zzQK.get(i2).zzLa;
        int i3 = 0;
        while (i3 < iMax) {
            this.zzQL.add(new zzDA(round((this.zzQJ * d) + this.zzQM.get(i).zzuS), round((this.zzQJ * d2) + this.zzQM.get(i).zzuR)));
            double d3 = this.zzQG;
            double d4 = this.zzQH;
            double d5 = (d * d3) - (d4 * d2);
            d2 = (d2 * d3) + (d * d4);
            i3++;
            d = d5;
        }
        this.zzQL.add(new zzDA(round((this.zzQK.get(i).zzLb * this.zzQJ) + this.zzQM.get(i).zzuS), round((this.zzQK.get(i).zzLa * this.zzQJ) + this.zzQM.get(i).zzuR)));
    }

    private void zzv(int i, int i2) {
        double dTan = Math.tan(Math.atan2(this.zzQI, (this.zzQK.get(i2).zzLa * this.zzQK.get(i).zzLa) + (this.zzQK.get(i2).zzLb * this.zzQK.get(i).zzLb)) / 4.0d);
        this.zzQL.add(new zzDA(round(((this.zzQK.get(i2).zzLb - (this.zzQK.get(i2).zzLa * dTan)) * this.zzQJ) + this.zzQM.get(i).zzuS), round((((this.zzQK.get(i2).zzLb * dTan) + this.zzQK.get(i2).zzLa) * this.zzQJ) + this.zzQM.get(i).zzuR)));
        this.zzQL.add(new zzDA(round((((this.zzQK.get(i).zzLa * dTan) + this.zzQK.get(i).zzLb) * this.zzQJ) + this.zzQM.get(i).zzuS), round(((this.zzQK.get(i).zzLa - (this.zzQK.get(i).zzLb * dTan)) * this.zzQJ) + this.zzQM.get(i).zzuR)));
    }

    private void zzz(double d) {
        int i;
        int i2;
        double d2;
        char c;
        double d3;
        int iZzU;
        double d4 = d;
        this.zzQN = new zz0M();
        this.zzQJ = d4;
        int i3 = 0;
        if (zzTJ.zzB(d4)) {
            this.zzQN.zzH(this.zzQC.zzem.size());
            while (i3 < this.zzQC.zzem.size()) {
                zz0N zz0n = this.zzQC.zzem.get(i3);
                if (zz0n.zzen == 0) {
                    this.zzQN.add(zz0n.zzeq);
                }
                i3++;
            }
            return;
        }
        double d5 = this.zzQA;
        if (d5 > 2.0d) {
            this.zzQF = 2.0d / (d5 * d5);
        } else {
            this.zzQF = 0.5d;
        }
        double d6 = this.zzQB;
        double d7 = 0.0d;
        double dAcos = 3.141592653589793d / Math.acos(1.0d - ((d6 > 0.0d ? d6 > Math.abs(d4) * 0.25d ? 0.25d * Math.abs(d4) : this.zzQB : 0.25d) / Math.abs(d4)));
        double d8 = 6.283185307179586d / dAcos;
        this.zzQH = Math.sin(d8);
        this.zzQG = Math.cos(d8);
        this.zzQE = dAcos / 6.283185307179586d;
        if (d4 < 0.0d) {
            this.zzQH = -this.zzQH;
        }
        char c2 = 2;
        this.zzQN.zzH(this.zzQC.zzem.size() * 2);
        int i4 = 0;
        while (i4 < this.zzQC.zzem.size()) {
            zz0N zz0n2 = this.zzQC.zzem.get(i4);
            zzD9 zzd9 = zz0n2.zzeq;
            this.zzQM = zzd9;
            int count = zzd9.getCount();
            if (count == 0 || (d4 <= 0.0d && (count < 3 || zz0n2.zzen != 0))) {
                i = i3;
                i2 = i4;
                d2 = d7;
                c = c2;
            } else {
                this.zzQL = new zzD9();
                int i5 = 1;
                if (count == 1) {
                    if (zz0n2.zzeo == 1) {
                        double d9 = d7;
                        d3 = d9;
                        double d10 = 1.0d;
                        while (i5 <= dAcos) {
                            this.zzQL.add(new zzDA(round((d10 * d4) + this.zzQM.get(i3).zzuS), round((d9 * d4) + this.zzQM.get(i3).zzuR)));
                            double d11 = this.zzQG;
                            double d12 = this.zzQH;
                            double d13 = (d10 * d11) - (d12 * d9);
                            d9 = (d9 * d11) + (d10 * d12);
                            i5++;
                            d10 = d13;
                            i4 = i4;
                            i3 = 0;
                        }
                        i2 = i4;
                    } else {
                        i2 = i4;
                        d3 = d7;
                        int i6 = 0;
                        double d14 = -1.0d;
                        double d15 = -1.0d;
                        while (i6 < 4) {
                            int i7 = i6;
                            this.zzQL.add(new zzDA(round((d14 * d4) + this.zzQM.get(0).zzuS), round((d15 * d) + this.zzQM.get(0).zzuR)));
                            if (d14 < d3) {
                                d14 = 1.0d;
                            } else if (d15 < d3) {
                                d15 = 1.0d;
                            } else {
                                d14 = -1.0d;
                            }
                            i6 = i7 + 1;
                            d4 = d;
                        }
                    }
                    this.zzQN.add(this.zzQL);
                } else {
                    i2 = i4;
                    d3 = d7;
                    this.zzQK.clear();
                    this.zzQK.zzH(count);
                    int i8 = 0;
                    while (true) {
                        iZzU = count - 1;
                        if (i8 >= iZzU) {
                            break;
                        }
                        zzQM zzqm = this.zzQK;
                        zzDA zzda = this.zzQM.get(i8);
                        i8++;
                        zzqm.add(zzY(zzda, this.zzQM.get(i8)));
                    }
                    int i9 = zz0n2.zzen;
                    if (i9 == 1 || i9 == 0) {
                        this.zzQK.add(zzY(this.zzQM.get(iZzU), this.zzQM.get(0)));
                    } else {
                        zzQM zzqm2 = this.zzQK;
                        zzqm2.add(new zzQN(zzqm2.get(count - 2)));
                    }
                    int i10 = zz0n2.zzen;
                    if (i10 == 0) {
                        for (int i11 = 0; i11 < count; i11++) {
                            iZzU = zzU(i11, iZzU, zz0n2.zzeo);
                        }
                        this.zzQN.add(this.zzQL);
                    } else if (i10 == 1) {
                        int iZzU2 = iZzU;
                        for (int i12 = 0; i12 < count; i12++) {
                            iZzU2 = zzU(i12, iZzU2, zz0n2.zzeo);
                        }
                        this.zzQN.add(this.zzQL);
                        this.zzQL = new zzD9();
                        zzQN zzqn = this.zzQK.get(iZzU);
                        for (int i13 = iZzU; i13 > 0; i13--) {
                            zzQM zzqm3 = this.zzQK;
                            int i14 = i13 - 1;
                            zzqm3.set(i13, new zzQN(-zzqm3.get(i14).zzLb, -this.zzQK.get(i14).zzLa));
                        }
                        this.zzQK.set(0, new zzQN(-zzqn.zzLb, -zzqn.zzLa));
                        int iZzU3 = 0;
                        while (iZzU >= 0) {
                            iZzU3 = zzU(iZzU, iZzU3, zz0n2.zzeo);
                            iZzU--;
                        }
                        this.zzQN.add(this.zzQL);
                    } else {
                        int iZzU4 = 0;
                        for (int i15 = 1; i15 < iZzU; i15++) {
                            iZzU4 = zzU(i15, iZzU4, zz0n2.zzeo);
                        }
                        if (zz0n2.zzen == 2) {
                            this.zzQL.add(new zzDA(round((this.zzQK.get(iZzU).zzLb * d) + this.zzQM.get(iZzU).zzuS), round((this.zzQK.get(iZzU).zzLa * d) + this.zzQM.get(iZzU).zzuR)));
                            this.zzQL.add(new zzDA(round(this.zzQM.get(iZzU).zzuS - (this.zzQK.get(iZzU).zzLb * d)), round(this.zzQM.get(iZzU).zzuR - (this.zzQK.get(iZzU).zzLa * d))));
                        } else {
                            int i16 = count - 2;
                            this.zzQI = d3;
                            zzQM zzqm4 = this.zzQK;
                            zzqm4.set(iZzU, new zzQN(-zzqm4.get(iZzU).zzLb, -this.zzQK.get(iZzU).zzLa));
                            if (zz0n2.zzen == 3) {
                                zzv(iZzU, i16);
                            } else {
                                zzu(iZzU, i16);
                            }
                        }
                        for (int i17 = iZzU; i17 > 0; i17--) {
                            zzQM zzqm5 = this.zzQK;
                            int i18 = i17 - 1;
                            zzqm5.set(i17, new zzQN(-zzqm5.get(i18).zzLb, -this.zzQK.get(i18).zzLa));
                        }
                        zzQM zzqm6 = this.zzQK;
                        zzqm6.set(0, new zzQN(-zzqm6.get(1).zzLb, -this.zzQK.get(1).zzLa));
                        for (int i19 = count - 2; i19 > 0; i19--) {
                            iZzU = zzU(i19, iZzU, zz0n2.zzeo);
                        }
                        int i20 = zz0n2.zzen;
                        c = 2;
                        if (i20 == 2) {
                            this.zzQL.add(new zzDA(round(this.zzQM.get(0).zzuS - (this.zzQK.get(0).zzLb * d)), round(this.zzQM.get(0).zzuR - (this.zzQK.get(0).zzLa * d))));
                            this.zzQL.add(new zzDA(round((this.zzQK.get(0).zzLb * d) + this.zzQM.get(0).zzuS), round((this.zzQK.get(0).zzLa * d) + this.zzQM.get(0).zzuR)));
                            d2 = 0.0d;
                            i = 0;
                        } else {
                            d2 = 0.0d;
                            this.zzQI = 0.0d;
                            if (i20 == 3) {
                                i = 0;
                                zzv(0, 1);
                            } else {
                                i = 0;
                                zzu(0, 1);
                            }
                        }
                        this.zzQN.add(this.zzQL);
                    }
                }
                d2 = d3;
                c = 2;
                i = 0;
            }
            c2 = c;
            d7 = d2;
            i3 = i;
            i4 = i2 + 1;
            d4 = d;
        }
    }

    public final void clear() {
        this.zzQC.zzem.clear();
        this.zzQD.zzuS = -1L;
    }

    public final void zzA(double d) {
        this.zzQA = 5.0d;
    }

    public final void zzX(zz0M zz0m) {
        Iterator<zzD9> it = zz0m.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), 2, 0);
        }
    }

    private zzTH(byte b) {
        this.zzQK = new zzQM();
        this.zzQD = new zzDA(0L, 0L);
        this.zzQC = new zz0N();
        this.zzQA = 2.0d;
        this.zzQB = 0.25d;
        this.zzQD.zzuS = -1L;
    }

    public final void zzZ(zz0M zz0m, double d) {
        zz0m.clear();
        zzTz();
        zzz(d);
        zzTK zztk = new zzTK();
        zztk.zzZ(this.zzQN, 0);
        if (d > 0.0d) {
            zztk.zzZ(1, zz0m, 2, 2);
            return;
        }
        zzD8 zzd8ZzY = zzTJ.zzY(this.zzQN);
        zzD9 zzd9 = new zzD9(4);
        zzd9.add(new zzDA(zzd8ZzY.zzuQ - 10, zzd8ZzY.zzuN + 10));
        zzd9.add(new zzDA(zzd8ZzY.zzuO + 10, zzd8ZzY.zzuN + 10));
        zzd9.add(new zzDA(zzd8ZzY.zzuO + 10, zzd8ZzY.zzuP - 10));
        zzd9.add(new zzDA(zzd8ZzY.zzuQ - 10, zzd8ZzY.zzuP - 10));
        zztk.zzZ(zzd9, 0, true);
        zztk.zzq(true);
        zztk.zzZ(1, zz0m, 3, 3);
        if (zz0m.getCount() > 0) {
            zz0m.zzYw();
        }
    }

    private void zzZ(int i, int i2, double d) {
        double d2 = this.zzQJ / d;
        this.zzQL.add(new zzDA(round(((this.zzQK.get(i2).zzLb + this.zzQK.get(i).zzLb) * d2) + this.zzQM.get(i).zzuS), round(((this.zzQK.get(i2).zzLa + this.zzQK.get(i).zzLa) * d2) + this.zzQM.get(i).zzuR)));
    }
}
