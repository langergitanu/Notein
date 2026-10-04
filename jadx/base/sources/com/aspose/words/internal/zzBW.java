package com.aspose.words.internal;

import OooooOo.C21392OooOo00;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzBW implements zzH2 {
    private float zzGD;
    private zzOU zzYs;
    private ArrayList<zzZG> zzt3;
    private zzZG zzt4;
    private boolean zzt5;
    private zzPF zzt6;

    private zzPO zzBJ() {
        return this.zzt5 ? this.zzt6.zzOB().zzOx() : this.zzt6.zzOA().zzOx();
    }

    private int zzBK() {
        return (this.zzt5 ? this.zzt6.zzOB() : this.zzt6.zzOA()).getType();
    }

    private float zzM(int i, int i2, int i3) {
        if (i != 5) {
            return 0.0f;
        }
        return this.zzGD * zzBV.zzsX[i2][i3];
    }

    private static void zzT(ArrayList<zzOW> arrayList) {
        zzQ5 zzq5 = new zzQ5();
        zzq5.zzA(zzZPY.zzG(-1.5f, -1.5f));
        zzq5.setSize(zzZPW.zzG(3.0f, 3.0f));
        zzq5.zz6(0.0d);
        zzq5.zz5(360.0d);
        zzQ2 zzq2ZzPV = zzq5.zzPV();
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            zzZQG.zzZ((ArrayList<zzPZ>) arrayList, new zzPZ(zzq2ZzPV, i));
        }
    }

    private static float zzZQ(long j) {
        int i = (int) j;
        float fZzZK = (float) zzAN.zzZK(Math.acos((-zzZPY.zzYC(j)) / ((float) Math.sqrt((zzZPY.zzYC(j) * zzZPY.zzYC(j)) + (Float.intBitsToFloat(i) * Float.intBitsToFloat(i))))));
        return Float.intBitsToFloat(i) < 0.0f ? 360.0f - fZzZK : fZzZK;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        return true;
    }

    private void zzY(ArrayList<zzZG> arrayList, zzZG zzzg, zzPF zzpf) throws Exception {
        zzPF zzpfZzOC = zzpf.zzOC();
        this.zzt6 = zzpfZzOC;
        if (zzZ(zzpfZzOC)) {
            zzOR.zzP(zzzg.zzZ0());
            zzZG zzzg2 = new zzZG();
            this.zzt4 = zzzg2;
            zzzg2.zzY(zzzg.zzZ2().zzZ1());
            this.zzGD = this.zzt6.getWidth() > 0.75f ? this.zzt6.getWidth() : 0.75f;
            float width = zzzg.zzZ2() == null ? 0.0f : zzzg.zzZ2().getWidth();
            this.zzt3 = new ArrayList<>();
            zzOU zzouZzNQ = zzzg.zzZ2().zzNQ();
            this.zzYs = zzouZzNQ;
            zzouZzNQ.setDashStyle(0);
            for (int i = 0; i < zzzg.zzZ0().getCount(); i++) {
                zzP5 zzp5 = zzzg.zzZ0().zzO7().get(i);
                if (!zzp5.isClosed() && zzp5.getCount() != 0) {
                    this.zzt5 = true;
                    zzY(zzp5, width);
                    this.zzt5 = false;
                    zzY(zzp5, width);
                }
            }
            if (this.zzt4.zzZ0().getCount() == 0 && this.zzt3.size() == 0) {
                return;
            }
            arrayList.ensureCapacity(this.zzt3.size() + this.zzt4.zzZ0().getCount() + arrayList.size());
            for (int i2 = 0; i2 < this.zzt3.size(); i2++) {
                zzZQG.zzZ(arrayList, zz6G.zzZ(this.zzt3.get(i2), false));
            }
            for (int i3 = 0; i3 < this.zzt4.zzZ0().getCount(); i3++) {
                zzZG zzzg3 = new zzZG();
                zzZQG.zzZ(zzzg3.zzZ0().zzO7(), this.zzt4.zzZ0().zzO7().get(i3));
                if (zzzg.zzZ2() != null) {
                    zzzg3.zzY(zzzg.zzZ2().zzZ1());
                }
                zzzg3.zzX(null);
                zzZQG.zzZ(arrayList, zz6G.zzZ(zzzg3, false));
            }
        }
    }

    public static void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg, zzPF zzpf) throws Exception {
        if (zzpf == null || zzzg.zzZ2() == null) {
            return;
        }
        new zzBW().zzY(arrayList, zzzg, zzpf);
    }

    public static boolean zzZ(zzPF zzpf) {
        if (zzpf == null) {
            return false;
        }
        return (zzpf.zzOz() == 1 && zzpf.zzOB().getType() == 0 && zzpf.zzOA().getType() == 0) ? false : true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        int iZzBK;
        int width;
        int length;
        long j;
        if (zzos.zzNu().getCount() < 2 || (iZzBK = zzBK()) == 0) {
            return true;
        }
        int iZzZ = zzBV.zzZ(zzos, this.zzt5);
        long j2 = zzos.zzNu().get(iZzZ);
        if (this.zzt5) {
            width = this.zzt6.zzOB().getWidth();
            length = this.zzt6.zzOB().getLength();
        } else {
            width = this.zzt6.zzOA().getWidth();
            length = this.zzt6.zzOA().getLength();
        }
        int i = width;
        int i2 = length;
        float fZzZ = zzX7.zzZ(iZzBK, this.zzGD, i, i2, zzBV.zzZ(this.zzt5, this.zzt6));
        if (!zzX7.zzZ(zzos, iZzBK, fZzZ, this.zzt5)) {
            return true;
        }
        if (fZzZ < 0.0f) {
            j = zzos.zzNu().get(this.zzt5 ? 2 : zzos.zzNu().getCount() - 3);
        } else {
            j = zzos.zzNu().get(this.zzt5 ? 0 : zzos.zzNu().getCount() - 1);
        }
        if (zzZPY.zzD(j, j2)) {
            if (zzos.zzNu().getCount() < 2) {
                return false;
            }
            j = zzos.zzNu().get(iZzZ + (this.zzt5 ? 1 : -1));
        }
        long jZzG = zzZPY.zzG(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j), zzZPY.zzYC(j2) - zzZPY.zzYC(j));
        zzZ(j2, (Float.intBitsToFloat((int) jZzG) == 0.0f && zzZPY.zzYC(jZzG) == 0.0f) ? 0.0f : zzZQ(jZzG), i, i2);
        return true;
    }

    private void zzY(zzP5 zzp5, float f) throws Exception {
        int count = zzp5.getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            zzZQ4 zzzq4ZzY = zzP6.zzY(this.zzt5 ? zzp5.zzNY().get(i2) : zzp5.zzNY().get((count - i2) - 1));
            if (zzzq4ZzY.getWidth() >= f || zzzq4ZzY.getHeight() >= f) {
                i = i2;
                break;
            }
        }
        ArrayList<zzOW> arrayListZzNY = zzp5.zzNY();
        if (!this.zzt5) {
            i = (count - i) - 1;
        }
        arrayListZzNY.get(i).zzZ(this);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        int length;
        int i;
        int i2;
        long j;
        int i3 = 0;
        int iZzBK = zzBK();
        if (iZzBK == 0) {
            return true;
        }
        long[] jArr = {zzpz.zzPX(), zzpz.zzPL(), zzpz.zzPK(), zzpz.zzPW()};
        if (this.zzt5) {
            int width = this.zzt6.zzOB().getWidth();
            length = this.zzt6.zzOB().getLength();
            i = width;
            i2 = 1;
        } else {
            int width2 = this.zzt6.zzOA().getWidth();
            length = this.zzt6.zzOA().getLength();
            i = width2;
            i2 = -1;
            i3 = 3;
        }
        int i4 = length;
        long j2 = jArr[i3];
        int i5 = i3 + i2;
        long j3 = jArr[i5];
        while (zzZPY.zzD(j2, j3) && i5 > 0 && i5 < 3) {
            i5 += i2;
            j3 = jArr[i5];
        }
        long jZzG = zzZPY.zzG(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j3), zzZPY.zzYC(j2) - zzZPY.zzYC(j3));
        if (zzZPY.zzYC(jZzG) == 0.0f) {
            j = j2;
            jZzG = zzZ(zzpz, jZzG, j);
        } else {
            j = j2;
        }
        if (zzZPY.zzYF(jZzG)) {
            return true;
        }
        long j4 = j;
        int i6 = i;
        zzZ(j4, zzZQ(jZzG), i6, i4);
        zzX7.zzZ(zzpz, zzX7.zzZ(iZzBK, this.zzGD, i6, i4, zzBV.zzZ(this.zzt5, this.zzt6)), this.zzt5);
        return true;
    }

    private void zzY(float f, long j) {
        zzPO zzpoZzBJ = zzBJ();
        int iZzPq = zzpoZzBJ.zzPq();
        if (iZzPq == 0) {
            zzZ((zzP7) zzpoZzBJ, j, f);
        } else if (iZzPq != 1) {
            throw new IllegalArgumentException();
        }
    }

    private long zzZ(zzPZ zzpz, long j, long j2) {
        zzPB zzpb = new zzPB(this.zzt5 ? zzpz.zzPX() : zzpz.zzPW(), this.zzt5 ? zzpz.zzPW() : zzpz.zzPX());
        if (!zzpb.zzOD() && Math.abs(zzpb.zzOE()) <= 30.0f) {
            return j;
        }
        long jZzU = zzpz.zzU(this.zzt5 ? 0.075f : 0.925f);
        return zzZPY.zzG(Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) jZzU), zzZPY.zzYC(j2) - zzZPY.zzYC(jZzU));
    }

    private void zzZ(long j, float f, int i, int i2) {
        int iZzBK = zzBK();
        zzP5 zzp5 = new zzP5();
        ArrayList<zzOW> arrayList = new ArrayList<>();
        float f2 = this.zzGD;
        if (f2 <= 2.0d) {
            f2 = 2.0f;
        }
        zzp5.zze(true);
        float[] fArr = zzBV.zzsZ;
        float f3 = fArr[i];
        float f4 = fArr[i2];
        switch (iZzBK) {
            case 0:
                break;
            case 1:
                zzZQG.zzZ((ArrayList<zzOS>) arrayList, new zzOS(zzBV.zzt2));
                break;
            case 2:
                zzZQG.zzZ((ArrayList<zzOS>) arrayList, new zzOS(zzBV.zzt1));
                break;
            case 3:
                zzZQG.zzZ((ArrayList<zzOS>) arrayList, new zzOS(zzBV.zzt0));
                break;
            case 4:
                zzT(arrayList);
                break;
            case 5:
                zzZ(arrayList, i, i2);
                f2 = 1.0f;
                f4 = 1.0f;
                f3 = 1.0f;
                break;
            case 6:
                zzY(f, j);
                return;
            default:
                throw new IllegalStateException("Unknown line end type.");
        }
        if (arrayList.size() == 0) {
            return;
        }
        float f5 = f3 * f2;
        float f6 = f4 * f2;
        zzP9 zzp9 = new zzP9();
        zzp9.zzZ(f5, f6, 0);
        zzp9.zzY(0.0f, zzM(iZzBK, i, i2), 1);
        zzp9.zzX(f, 1);
        zzp9.zzY(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), 1);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            zzOW zzow = arrayList.get(i3);
            zzow.zzY(zzp9);
            zzZQG.zzZ(zzp5.zzNY(), zzow);
        }
        OooO00o.OooO00o(this.zzt4, zzp5);
    }

    private void zzZ(ArrayList<zzOW> arrayList, int i, int i2) {
        long j = zzBV.zzsY[i][i2];
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYz = zzZPW.zzYz(j);
        float f = this.zzGD;
        if (f < 2.0f) {
            f = 2.0f;
        }
        float f2 = f * 3.5f;
        zzZQG.zzZ((ArrayList<zzOS>) arrayList, new zzOS(new float[]{0.0f, 0.0f}));
        float f3 = this.zzGD;
        long jZzG = zzZPY.zzG(C21392OooOo00.OooO00o(f3, 0.25f, 0.577f * f2, fIntBitsToFloat), ((f3 * 0.433f) + f2) * fZzYz);
        zzZ(arrayList, jZzG, 330.0d);
        zzZQG.zzZ((ArrayList<zzOS>) arrayList, new zzOS(new float[]{0.0f, this.zzGD * 2.0f * zzBV.zzsW[i][i2]}));
        zzZ(arrayList, zzZPY.zzG(-Float.intBitsToFloat((int) jZzG), zzZPY.zzYC(jZzG)), 30.0d);
    }

    private void zzZ(ArrayList<zzOW> arrayList, long j, double d) {
        zzQ5 zzq5 = new zzQ5();
        zzq5.zzA(zzZPY.zzG(Float.intBitsToFloat((int) j) - (this.zzGD * 0.5f), zzZPY.zzYC(j) - (this.zzGD * 0.5f)));
        float f = this.zzGD;
        zzq5.setSize(zzZPW.zzG(f, f));
        zzq5.zz6(d);
        zzq5.zz5(180.0d);
        zzQ2 zzq2ZzPV = zzq5.zzPV();
        for (int i = 0; i < zzq2ZzPV.getCount(); i++) {
            zzZQG.zzZ((ArrayList<zzPZ>) arrayList, new zzPZ(zzq2ZzPV, i));
        }
    }

    private void zzZ(zzP7 zzp7, long j, float f) {
        if (zzp7.zzUu() != null) {
            zzZG zzzg = new zzZG(zzp7.zzUu().zzO8());
            float fZzZJ = (float) zzAN.zzZJ(f - 180.0f);
            zzP9 zzp9 = new zzP9();
            float fZzPp = zzp7.zzPp() * this.zzGD;
            zzp9.zzZ(fZzPp, fZzPp, 1);
            zzp9.zzX(fZzZJ, 1);
            zzp9.zzY(Float.intBitsToFloat((int) j), zzZPY.zzYC(j), 1);
            zzzg.zzY(zzp9);
            zzZ(zzzg, zzp7);
            zzZQG.zzZ(this.zzt3, zzzg);
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: path");
    }

    private void zzZ(zzZG zzzg, zzP7 zzp7) {
        if (zzp7.zzO4()) {
            zzzg.zzX(null);
            zzOU zzou = this.zzYs;
            if (zzou != null) {
                zzzg.zzY(zzou.zzZ1());
                return;
            }
            return;
        }
        zzzg.zzX(this.zzYs.zzNQ());
        zzzg.zzZ2().setWidth(zzp7.zzPp() * zzzg.zzZ2().getWidth());
        zzzg.zzZ2().zzXX(zzp7.zzO3());
        zzzg.zzZ2().setEndCap(zzp7.zzO2());
        zzzg.zzZ2().zzXW(zzp7.zzO1());
        zzzg.zzZ2().zzA(zzp7.zzO0());
        zzzg.zzY((zzPY) null);
    }
}
