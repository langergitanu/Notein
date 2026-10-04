package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzRG implements zzH2 {
    private boolean zzML;
    private ArrayList<zzZG> zzMM;
    private float[] zzMN;
    private int zzMO;
    private int zzMP;
    private double zzMQ;
    private double[] zzMR;
    private long[] zzMS;
    private zzOU zzYs;

    private zz0Q zzN(double d, double d2) {
        long j;
        long j2;
        long j3;
        zz0Q zz0q = new zz0Q();
        int i = 0;
        long j4 = this.zzMS[0];
        int i2 = 0;
        boolean z = false;
        double d3 = 0.0d;
        long j5 = j4;
        while (i2 < 2) {
            double d4 = z ? d2 : d;
            int i3 = i;
            while (true) {
                long[] jArr = this.zzMS;
                if (i3 >= jArr.length) {
                    j = j4;
                    j2 = j5;
                    break;
                }
                double d5 = this.zzMR[i3];
                if (d4 > d5) {
                    if (!z || d >= d5) {
                        j3 = j4;
                    } else {
                        j3 = j4;
                        zz0q.add(jArr[i3]);
                    }
                    i3++;
                    j4 = j3;
                } else {
                    if (d4 == d5) {
                        j2 = jArr[i3];
                        j = j2;
                    } else {
                        j = jArr[i3];
                        j2 = jArr[i3 - 1];
                    }
                    d3 = d5;
                }
            }
            zz0q.add(zzZ(j2, j, d3 - d4));
            i2++;
            z = true;
            j5 = j2;
            j4 = j;
            i = 0;
        }
        return zz0q;
    }

    private void zzQT() {
        this.zzMS = null;
        this.zzMR = null;
        this.zzMQ = 0.0d;
    }

    private static zzP5 zzV(long j, long j2) {
        zzQ5 zzq5 = new zzQ5();
        zzq5.zz6(0.0d);
        zzq5.zz5(360.0d);
        zzq5.setSize(j);
        zzq5.zzA(zzZPY.zzG(Float.intBitsToFloat((int) j2) - (Float.intBitsToFloat((int) j) / 2.0f), zzZPY.zzYC(j2) - (zzZPW.zzYz(j) / 2.0f)));
        zzQ2 zzq2ZzPV = zzq5.zzPV();
        zzP5 zzp5 = new zzP5();
        zzp5.zze(true);
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            zzZQG.zzZ((ArrayList<zzPZ>) zzp5.zzNY(), new zzPZ(zzq2ZzPV, i));
        }
        return zzp5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r7 = r2;
        r9 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long zzf(double d) {
        double d2;
        long j;
        long j2;
        int i = 0;
        long j3 = this.zzMS[0];
        while (true) {
            long[] jArr = this.zzMS;
            if (i >= jArr.length) {
                d2 = 0.0d;
                break;
            }
            d2 = this.zzMR[i];
            if (d > d2) {
                i++;
            } else if (d == d2) {
                j3 = jArr[i];
            } else {
                long j4 = jArr[i];
                j2 = jArr[i - 1];
                j = j4;
            }
        }
        return zzZ(j2, j, d2 - d);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        return true;
    }

    private void zzY(ArrayList<zzZG> arrayList, zzZG zzzg, int i, int i2, float[] fArr) throws Exception {
        this.zzMP = i;
        this.zzMO = i2;
        this.zzMN = fArr;
        this.zzYs = zzzg.zzZ2() != null ? zzzg.zzZ2() : new zzOU(zzPV.zzI0);
        this.zzMM = arrayList;
        zzzg.zzZ0().zzY(this);
    }

    public static void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg, int i, int i2, float[] fArr) throws Exception {
        new zzRG().zzY(arrayList, zzzg, i, i2, fArr);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzML = zzp5.isClosed();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) throws Exception {
        zzZ(zzos.zzNu());
        double d = 0.0d;
        int i = 0;
        while (true) {
            double d2 = d;
            if (d >= this.zzMQ) {
                break;
            }
            double width = ((double) (this.zzYs.getWidth() * this.zzMN[i])) + d2;
            double d3 = this.zzMQ;
            if (width > d3) {
                width = d3;
            }
            if (i % 2 == 0) {
                zzP5 zzp5 = new zzP5();
                int i2 = this.zzMO;
                if (i2 != 2 || this.zzMP != 2) {
                    if (i2 != 0) {
                        break;
                    }
                    zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), new zzOS(zzN(d2, width), false));
                } else {
                    zzp5 = zzV(zzZPW.zzG(this.zzYs.getWidth(), this.zzYs.getWidth()), zzf(d2 + ((double) this.zzYs.getWidth())));
                }
                zzZG zzzg = new zzZG();
                zzzg.zzX(this.zzYs);
                zzzg.zzY(this.zzYs.zzZ1());
                zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
                zzZG zzzgZzZ = zz6G.zzZ(zzzg, false);
                if (this.zzMO == 0) {
                    zzzgZzZ = zzZVE.zzF(zzzgZzZ);
                }
                this.zzMM.add(zzzgZzZ);
            }
            i = i == this.zzMN.length - 1 ? 0 : i + 1;
            d = width;
        }
        zzQT();
        return true;
    }

    private void zzZ(zz0Q zz0q) {
        long[] jArr;
        int i = 1;
        if (this.zzML) {
            jArr = new long[zz0q.getCount() + 1];
        } else {
            jArr = new long[zz0q.getCount()];
        }
        this.zzMS = jArr;
        zz0q.zzQ(jArr);
        double[] dArr = new double[this.zzMS.length];
        this.zzMR = dArr;
        dArr[0] = 0.0d;
        while (i <= zz0q.getCount()) {
            if (!this.zzML && i == zz0q.getCount()) {
                return;
            }
            double dZzO = this.zzMQ + ((double) zzJ6.zzO(zz0q.get(i - 1), zz0q.get(i == zz0q.getCount() ? 0 : i)));
            this.zzMQ = dZzO;
            this.zzMR[i] = dZzO;
            i++;
        }
    }

    private static long zzZ(long j, long j2, double d) {
        if (zzJ6.zzN(j2, j)) {
            return j2;
        }
        zzPG zzpg = new zzPG(j, j2);
        long[] jArr = new long[1];
        int iZzZN = zzZKQ.zzZN(zzZPY.zzYC(j2) - zzZPY.zzYC(j));
        if (iZzZN == 0) {
            iZzZN = zzZKQ.zzZN(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j));
        }
        zzpg.zzZ(j2, (-iZzZN) * ((float) d), jArr);
        return jArr[0];
    }
}
