package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zzSO implements zzH2 {
    static float[] zzOZ = new float[0];
    private zzSN zzP0;
    private ArrayList<zzZG> zzP1;

    private void zzS1() {
        if (this.zzP0.zzRQ().zzNu().getCount() < 2 || ((zzOS) this.zzP0.zzRT()).zzNu().getCount() < 2) {
            return;
        }
        zzOS zzos = (zzOS) this.zzP0.zzRT();
        long[] jArr = {0};
        if (zzPG.zzZ(new zzPG(this.zzP0.zzRQ().zzNu().get(0), this.zzP0.zzRQ().zzNu().get(1)), new zzPG(zzos.zzNu().get(zzos.zzNu().getCount() - 2), zzos.zzNu().get(zzos.zzNu().getCount() - 1)), jArr, true)) {
            this.zzP0.zzRQ().zzNu().set(0, jArr[0]);
            ((zzOS) this.zzP0.zzRT()).zzNu().set(zzos.zzNu().getCount() - 1, jArr[0]);
        }
    }

    private void zzS2() {
        this.zzP0.zzW(zzCY.zzZ(this.zzP0.zzRQ(), this.zzP0.zzRP(), true));
    }

    private void zzS3() {
        this.zzP0.zzV(zzCY.zzZ((zzOS) this.zzP0.zzRT(), this.zzP0.zzRO(), false));
    }

    private void zzS4() {
        zzZZK zzzzkZzZ = zzCY.zzZ(this.zzP0.zzRO(), this.zzP0.zzRP(), true);
        if (zzzzkZzZ.zzrz()) {
            zzZ(zzzzkZzZ, this.zzP0.zzRO(), this.zzP0.zzRP(), true);
            return;
        }
        zzOQ zzoqZzrC = zzzzkZzZ.zzrC();
        zzOQ zzoqZzrB = zzzzkZzZ.zzrB();
        this.zzP0.zzV(zzoqZzrC);
        this.zzP0.zzW(zzoqZzrB);
    }

    private void zzS5() {
        if (this.zzP0.zzRS()) {
            zzS3();
        } else {
            zzS4();
        }
    }

    private void zzS6() {
        if (this.zzP0.zzRS()) {
            zzS1();
        } else {
            zzS2();
        }
    }

    private void zzS7() {
        if (this.zzP0.zzRR()) {
            zzS6();
        } else {
            zzS5();
        }
    }

    private static zzZV4[] zzU(zzOU zzou) {
        int length = zzou.zzNG().length / 2;
        if (length == 0) {
            return null;
        }
        zzZV4[] zzzv4Arr = new zzZV4[length];
        float width = zzou.getWidth() / 2.0f;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < zzou.zzNG().length) {
            float f2 = zzou.zzNG()[i];
            if (f2 < 0.0f || f2 > 1.0f || f2 < f) {
                return null;
            }
            if (z) {
                zzzv4Arr[i2] = new zzZV4(zzou.getWidth() * (f2 - f), (((f + f2) * zzou.getWidth()) / 2.0f) - width);
                i2++;
                z = false;
            } else {
                z = true;
            }
            i++;
            f = f2;
        }
        return zzzv4Arr;
    }

    private zzOS zzW(zzOS zzos) {
        long jZzPW;
        long jZzPW2 = 0;
        if (this.zzP0.zzRU() instanceof zzPZ) {
            jZzPW = ((zzPZ) this.zzP0.zzRU()).zzPW();
            zzPZ zzpz = (zzPZ) zzZKW.zzZ(this.zzP0.zzRT(), zzPZ.class);
            if (zzpz != null) {
                jZzPW2 = zzpz.zzPW();
            }
        } else if (this.zzP0.zzRU() instanceof zzOS) {
            zzOS zzos2 = (zzOS) this.zzP0.zzRU();
            jZzPW = zzos2.zzNu().get(zzos2.zzNu().getCount() - 1);
            zzOS zzos3 = (zzOS) zzZKW.zzZ(this.zzP0.zzRT(), zzOS.class);
            if (zzos3 != null) {
                jZzPW2 = zzos3.zzNu().get(zzos3.zzNu().getCount() - 1);
            }
        } else {
            jZzPW = 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzPW2) - Float.intBitsToFloat((int) jZzPW);
        float fZzYC = zzZPY.zzYC(jZzPW2) - zzZPY.zzYC(jZzPW);
        long j = zzos.zzNu().get(0);
        return new zzOS(new long[]{C22243OooO0Oo.OooO00o(fZzYC, Float.intBitsToFloat((int) j) + fIntBitsToFloat, j)}, false);
    }

    public final ArrayList<zzZG> zzRZ() {
        return this.zzP1;
    }

    public final zzSN zzS0() {
        return this.zzP0;
    }

    public final void zzX(ArrayList<zzZG> arrayList, zzZG zzzg) {
        if (zzzg.zzZ2() == null || zzzg.zzZ2().getAlignment() == 1) {
            zzZQG.zzZ(arrayList, zzzg);
            return;
        }
        if (!zzJ6.zzT(zzzg.zzZ2().zzNG())) {
            zzZQG.zzZ(arrayList, zzzg);
            return;
        }
        if (zzzg.zzZ2().getDashStyle() == 2 && zzzg.zzZ2().zzNJ() == 2) {
            zzZQG.zzZ(arrayList, zzzg);
            return;
        }
        zzZV4[] zzzv4ArrZzU = zzU(zzzg.zzZ2());
        if (zzzv4ArrZzU == null) {
            zzZQG.zzZ(arrayList, zzzg);
            return;
        }
        arrayList.ensureCapacity(arrayList.size() + zzzv4ArrZzU.length);
        for (zzZV4 zzzv4 : zzzv4ArrZzU) {
            zzZQG.zzZ((ArrayList) arrayList, (Iterable) zzZ(zzzg, zzzv4));
        }
    }

    public void zzY(ArrayList<zzZG> arrayList, zzZG zzzg) {
        new zzSO().zzX(arrayList, zzzg);
    }

    public ArrayList<zzZG> zzZ(zzZG zzzg, zzZV4 zzzv4) {
        try {
            this.zzP0 = new zzSN(zzzg, zzzv4);
            this.zzP1 = new ArrayList<>();
            zzzg.zzZ0().zzY(this);
            zzZQG.zzZ(this.zzP1, zzY(zzzg, zzzv4));
            return this.zzP1;
        } catch (Exception unused) {
            ArrayList<zzZG> arrayList = new ArrayList<>();
            arrayList.add(new zzZG());
            return arrayList;
        }
    }

    public static zzZG zzY(zzZG zzzg, float f) {
        return new zzSO().zzY(zzzg, new zzZV4(1.0f, f));
    }

    public zzZG zzY(zzZG zzzg, zzZV4 zzzv4) {
        try {
            this.zzP0 = new zzSN(zzzg, zzzv4);
            zzzg.zzZ0().zzY(this);
            zzZG zzzgZzRV = this.zzP0.zzRV();
            if (zzzgZzRV.zzZ2().getWidth() >= 1.0f) {
                return zzzgZzRV;
            }
            zzPY zzpyZzZ1 = zzzgZzRV.zzZ2().zzZ1();
            zzZG zzzg2 = new zzZG(zzOY.zzZ(zzzgZzRV.zzZ0(), zzzgZzRV.zzZ2()));
            zzzg2.zzY(zzpyZzZ1);
            return zzzg2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzP0.zzX(zzp5);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public boolean zzZ(zzOS zzos) {
        zzSN zzsn = this.zzP0;
        zzsn.zzYH(zzsn.zzRL() + 1);
        zzOS zzosZzY = zzY(zzos, this.zzP0.zzRW().zzn1());
        if (zzosZzY != null) {
            zzZQG.zzZ((ArrayList<zzOS>) this.zzP0.zzRX().zzNY(), zzosZzY);
        }
        return true;
    }

    public zzOS zzY(zzOS zzos, float f) {
        zzOS zzosZzW;
        int count = zzos.zzNu().getCount();
        if (count <= 0) {
            return zzos;
        }
        if (count == 1) {
            zzosZzW = zzW(zzos);
        } else if (count != 2) {
            zzosZzW = zzZ(zzos, count, f);
        } else {
            zzosZzW = zzZ(zzos, f);
        }
        zzX(zzos, zzosZzW);
        return zzosZzW;
    }

    private zzOQ zzX(zzOQ zzoq) {
        zzOQ zzoqZzZ = zzCY.zzZ((zzOS) this.zzP0.zzRT(), zzoq, false);
        zzoq.clear();
        for (int count = zzoqZzZ.getCount() - 1; count >= 0; count--) {
            zzoq.zzY(zzoqZzZ, count);
        }
        return zzoq;
    }

    @Override // com.aspose.words.internal.zzH2
    public boolean zzZ(zzPZ zzpz) {
        zzSN zzsn = this.zzP0;
        zzsn.zzYH(zzsn.zzRL() + 1);
        for (zzPZ zzpz2 : zzZ(zzpz, this.zzP0.zzRW().zzn1())) {
            zzZQG.zzZ((ArrayList<zzPZ>) this.zzP0.zzRX().zzNY(), zzpz2);
        }
        return true;
    }

    private zzOQ zzY(zzOQ zzoq) {
        zzZZK zzzzkZzZ = zzCY.zzZ(this.zzP0.zzRP(), zzoq, false);
        if (zzzzkZzZ.zzrz()) {
            zzZ(zzzzkZzZ, this.zzP0.zzRP(), zzoq, false);
            return zzoq;
        }
        zzOQ zzoqZzrC = zzzzkZzZ.zzrC();
        zzOQ zzoqZzrB = zzzzkZzZ.zzrB();
        zzoqZzrC.zzW(zzoqZzrC.getCount() - 1, zzoqZzrB.zzYd(zzoqZzrB.getCount() - 1));
        this.zzP0.zzW(zzoqZzrC);
        zzoq.clear();
        for (int count = zzoqZzrB.getCount() - 1; count >= 0; count--) {
            zzoq.zzY(zzoqZzrB, count);
        }
        return zzoq;
    }

    public zzOS zzZ(zzOS zzos, float f) {
        long[] jArr = {0};
        zzPG zzpg = new zzPG(zzos.zzNu().get(0), zzos.zzNu().get(1));
        if (zzW(zzos.zzNu().get(0), zzos.zzNu().get(1))) {
            f *= -1.0f;
        }
        zzPG zzpgZzM = zzpg.zzM(f);
        zzPG zzpgZzs = zzpg.zzs(zzos.zzNu().get(0));
        zzPG zzpgZzs2 = zzpg.zzs(zzos.zzNu().get(1));
        long[] jArr2 = {0, 0};
        zzPG.zzZ(zzpgZzM, zzpgZzs, jArr);
        jArr2[0] = jArr[0];
        zzPG.zzZ(zzpgZzM, zzpgZzs2, jArr);
        jArr2[1] = jArr[0];
        return new zzOS(jArr2, false);
    }

    private boolean zzW(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j);
        float fZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        if (this.zzP0.zzRM()) {
            fIntBitsToFloat *= -1.0f;
            fZzYC *= -1.0f;
        }
        return zzAN.zzY(fIntBitsToFloat, 0.0f, 0.001f) ? fZzYC < 0.0f : fIntBitsToFloat > 0.0f;
    }

    public void zzX(zzOS zzos, zzOS zzos2) {
        if (this.zzP0.zzRT() != null) {
            if (this.zzP0.zzRS()) {
                zzCY.zzU(zzos2, (zzOS) this.zzP0.zzRT());
            } else {
                this.zzP0.zzW(zzCY.zzZ(zzos2, this.zzP0.zzRP(), true));
                this.zzP0.zzRY();
            }
        }
        this.zzP0.zzV(zzos2, zzos);
    }

    public final void zzX(ArrayList<zzZG> arrayList) {
        this.zzP1 = arrayList;
    }

    private static long zzX(long j, long j2) {
        return zzZPY.zzG(zzZKQ.zzZN(Float.intBitsToFloat((int) j) - Float.intBitsToFloat((int) j2)), zzZKQ.zzZN(zzZPY.zzYC(j) - zzZPY.zzYC(j2)));
    }

    private zzOS zzZ(zzOS zzos, int i, float f) {
        boolean zZzRN = this.zzP0.zzRN();
        if (zzJ6.zzN(zzos.zzNu().get(0), zzos.zzNu().get(i - 1))) {
            i--;
            zZzRN = true;
        }
        ArrayList<zzPG> arrayList = new ArrayList<>(i);
        zzZ(zzos, arrayList, i, f);
        zzOS zzos2 = new zzOS(zzZ(zzos, arrayList, f), false);
        this.zzP0.zzl(zZzRN);
        return zzos2;
    }

    @Override // com.aspose.words.internal.zzH2
    public boolean zzY(zzP5 zzp5) {
        if (zzp5.zzNY().size() > 1 && zzp5.isClosed()) {
            zzS7();
        }
        return true;
    }

    private void zzZ(zzOS zzos, ArrayList<zzPG> arrayList, int i, float f) {
        int i2 = 0;
        while (i2 < i) {
            boolean z = i2 == i + (-1);
            arrayList.add(new zzPG(zzos.zzNu().get(i2), zzos.zzNu().get(z ? 0 : i2 + 1)).zzM(zzW(zzos.zzNu().get(i2), zzos.zzNu().get(z ? 0 : i2 + 1)) ? (-1.0f) * f : f));
            i2++;
        }
    }

    private long[] zzZ(zzOS zzos, ArrayList<zzPG> arrayList, float f) {
        zzOS zzos2;
        ArrayList<zzPG> arrayList2;
        float f2;
        int size = arrayList.size();
        long[] jArr = new long[size];
        long[] jArr2 = {0};
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i == arrayList.size() - 1 ? 0 : i + 1;
            long[] jArrZzZ = zzZ(zzos, i, arrayList.get(i));
            boolean z = this.zzP0.zzRN() && this.zzP0.zzRK() == 1;
            boolean zZzZ = zzPG.zzZ(arrayList.get(i), arrayList.get(i2), jArr2, true);
            jArr[i2] = jArr2[0];
            if (i == 0) {
                jArr[0] = jArrZzZ[0];
            }
            if (i == size - 2 && !z) {
                jArr[size - 1] = jArrZzZ[1];
                return jArr;
            }
            if (zZzZ) {
                zzos2 = zzos;
                arrayList2 = arrayList;
                f2 = f;
            } else {
                zzos2 = zzos;
                arrayList2 = arrayList;
                f2 = f;
                zzZ(zzos2, f2, arrayList2, i, jArr2);
            }
            i++;
            zzos = zzos2;
            f = f2;
            arrayList = arrayList2;
        }
        return jArr;
    }

    private static long[] zzZ(zzOS zzos, int i, zzPG zzpg) {
        long[] jArr = {0};
        boolean z = i == zzos.zzNu().getCount() - 1;
        long j = zzos.zzNu().get(i);
        long j2 = zzos.zzNu().get(z ? 0 : i + 1);
        zzPG zzpgZzs = new zzPG(j, j2).zzs(j);
        zzPG zzpgZzs2 = new zzPG(j, j2).zzs(j2);
        zzPG.zzZ(zzpg, zzpgZzs, jArr);
        long j3 = jArr[0];
        zzPG.zzZ(zzpg, zzpgZzs2, jArr);
        return new long[]{j3, jArr[0]};
    }

    private void zzZ(zzOS zzos, float f, ArrayList<zzPG> arrayList, int i, long[] jArr) {
        if (!zzW(zzos.zzNu().get(i), zzos.zzNu().get(i == zzos.zzNu().getCount() - 1 ? 0 : i + 1))) {
            f *= -1.0f;
        }
        zzPG.zzZ(arrayList.get(i), arrayList.get(i).zzM(f).zzs(zzos.zzNu().get(i)).zzM(f), jArr);
    }

    public final zzPZ[] zzZ(zzPZ zzpz, float f) {
        zzOQ zzoqZzPP = zzpz.zzPP();
        for (int i = 0; i < zzoqZzPP.getCount(); i++) {
            zzZ(zzoqZzPP, i, f);
        }
        zzCY.zzU(zzoqZzPP);
        return zzZ(zzpz, zzZ(zzoqZzPP));
    }

    private void zzZ(zzOQ zzoq, int i, float f) {
        long jZzYd = zzoq.zzYd(i);
        long jZzXT = zzoq.zzXT(i);
        long jZzYa = zzoq.zzYa(i);
        zzPG zzpg = new zzPG(jZzYd, jZzXT);
        zzPG zzpg2 = new zzPG(jZzYa, jZzXT);
        zzPG zzpgZzs = zzpg.zzs(jZzYd);
        zzPG zzpgZzs2 = zzpg2.zzs(jZzYa);
        long[] jArr = {0};
        zzpgZzs.zzZ(jZzYd, zzW(jZzYd, jZzXT) ? f * (-1.0f) : f, jArr);
        long j = jArr[0];
        zzpgZzs2.zzZ(jZzYa, zzW(jZzXT, jZzYa) ? f * (-1.0f) : f, jArr);
        long j2 = jArr[0];
        long jZzZ = zzZ(zzoq, i, zzpg, zzpg2, j, j2);
        zzoq.zzZ(i, j);
        zzoq.zzW(i, j2);
        zzoq.zzV(i, jZzZ);
    }

    private static long zzZ(zzOQ zzoq, int i, zzPG zzpg, zzPG zzpg2, long j, long j2) {
        long[] jArr = {0};
        boolean zZzZ = zzPG.zzZ(zzpg, zzpg2);
        zzPG zzpgZzr = zzpg.zzr(j);
        if (zZzZ) {
            zzPG.zzZ(zzpgZzr, zzpg.zzs(zzoq.zzXT(i)), jArr);
        } else {
            zzPG.zzZ(zzpgZzr, zzpg2.zzr(j2), jArr);
        }
        return jArr[0];
    }

    private zzOQ zzZ(zzOQ zzoq) {
        if (this.zzP0.zzRT() == null) {
            return zzoq;
        }
        if (this.zzP0.zzRS()) {
            return zzX(zzoq);
        }
        return zzY(zzoq);
    }

    private void zzZ(zzZZK zzzzk, zzOQ zzoq, zzOQ zzoq2, boolean z) {
        if (zzzzk.zzrz()) {
            long[] jArrZzY = zzCY.zzY(zzoq, z);
            long[] jArrZzY2 = zzCY.zzY(zzoq2, !z);
            long jZzrA = zzzzk.zzrA();
            if (zzZ(jZzrA, jArrZzY, jArrZzY2)) {
                float fZzO = zzJ6.zzO(jArrZzY2[0], jZzrA);
                float fZzNt = zzoq2.zzNt();
                if (fZzO < fZzNt) {
                    this.zzP0.zzRX().zzZ(new long[]{jZzrA}, false);
                    return;
                } else {
                    zzZ(jArrZzY, jArrZzY2, jZzrA, fZzO, fZzNt, z);
                    return;
                }
            }
            this.zzP0.zzRX().zzZ(new long[]{zzZPY.zzG(((Float.intBitsToFloat((int) jArrZzY2[1]) - Float.intBitsToFloat((int) jArrZzY[1])) / 2.0f) + Float.intBitsToFloat((int) jArrZzY[1]), ((zzZPY.zzYC(jArrZzY2[1]) - zzZPY.zzYC(jArrZzY[1])) / 2.0f) + zzZPY.zzYC(jArrZzY[1]))}, false);
        }
    }

    private void zzZ(long[] jArr, long[] jArr2, long j, float f, float f2, boolean z) {
        float fIntBitsToFloat;
        float f3 = f > f2 ? f2 : f;
        zzPG zzpg = new zzPG(jArr[0], jArr[1]);
        zzPG zzpg2 = new zzPG(jArr2[0], jArr2[1]);
        long jZzZ = zzZ(zzpg, jArr[1], jArr2[1], j, f3);
        long jZzZ2 = zzZ(zzpg2, jArr2[1], jArr[1], j, f3);
        if (!zzZPY.zzD(jZzZ, 0L) && !zzZPY.zzD(jZzZ2, 0L)) {
            this.zzP0.zzRX().zzX(new long[]{jArr[1], jZzZ, jZzZ2, jArr2[1]});
            return;
        }
        long j2 = j;
        if (f > f2) {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) j2);
            if (z) {
                fIntBitsToFloat = Float.intBitsToFloat((int) jArr2[0]);
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) jArr2[1]);
            }
            boolean z2 = fIntBitsToFloat2 < fIntBitsToFloat;
            long[] jArr3 = {0};
            long j3 = z ? jArr2[0] : jArr2[1];
            if (z2) {
                f3 = -f3;
            }
            zzpg2.zzZ(j3, f3, jArr3);
            j2 = jArr3[0];
        }
        this.zzP0.zzRX().zzZ(new long[]{j2}, false);
    }

    private static boolean zzZ(long j, long[] jArr, long[] jArr2) {
        return zzZ(jArr2, j) && zzZ(jArr, j);
    }

    private static boolean zzZ(long[] jArr, long j) {
        long jZzX = zzX(jArr[0], jArr[1]);
        long jZzX2 = zzX(jArr[0], j);
        int i = (int) jZzX;
        int i2 = (int) jZzX2;
        return (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2) || Float.intBitsToFloat(i) == 0.0f || Float.intBitsToFloat(i2) == 0.0f) && (zzZPY.zzYC(jZzX) == zzZPY.zzYC(jZzX2) || zzZPY.zzYC(jZzX) == 0.0f || zzZPY.zzYC(jZzX2) == 0.0f);
    }

    private static long zzZ(zzPG zzpg, long j, long j2, long j3, float f) {
        float fZzO = zzJ6.zzO(j3, j);
        float fZzO2 = zzJ6.zzO(j3, j2);
        float fZzO3 = zzJ6.zzO(j2, j);
        float f2 = (((fZzO + fZzO2) - (f - (2.0f * fZzO3))) * fZzO) / ((fZzO - fZzO3) + fZzO2);
        if (f2 <= 0.0f) {
            return 0L;
        }
        if (f2 > fZzO) {
            f2 -= fZzO;
        }
        long[] jArr = new long[1];
        int iZzZN = zzZKQ.zzZN(zzZPY.zzYC(j3) - zzZPY.zzYC(j));
        if (iZzZN == 0) {
            iZzZN = zzZKQ.zzZN(Float.intBitsToFloat((int) j3) - Float.intBitsToFloat((int) j));
        }
        zzpg.zzZ(j3, (-iZzZN) * f2, jArr);
        return jArr[0];
    }

    private zzPZ[] zzZ(zzPZ zzpz, zzOQ zzoq) {
        int count = zzoq.getCount();
        zzPZ[] zzpzArr = new zzPZ[count];
        for (int i = 0; i < count; i++) {
            zzpzArr[i] = new zzPZ(zzoq, i);
        }
        this.zzP0.zzZ(zzoq, zzpzArr, zzpz);
        return zzpzArr;
    }

    public final void zzZ(zzSN zzsn) {
        this.zzP0 = zzsn;
    }
}
