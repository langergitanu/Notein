package com.aspose.words.internal;

import OooOoO.C20509OooO0oo;
import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOY implements zzH2 {
    private zzP5 zzGA;
    private zzP5 zzGB;
    private zzP8 zzGC = new zzP8();
    private float zzGD;
    private zzP5 zzSo;

    private zzOY(float f) {
        this.zzGD = f;
    }

    public static long zzP(long j, long j2, long j3, long j4) {
        float fZzYC = zzZPY.zzYC(j2) - zzZPY.zzYC(j);
        int i = (int) j;
        int i2 = (int) j2;
        float fIntBitsToFloat = Float.intBitsToFloat(i) - Float.intBitsToFloat(i2);
        float fZzYC2 = (zzZPY.zzYC(j) * fIntBitsToFloat) + (Float.intBitsToFloat(i) * fZzYC);
        float fZzYC3 = zzZPY.zzYC(j4) - zzZPY.zzYC(j3);
        int i3 = (int) j3;
        int i4 = (int) j4;
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4);
        float fZzYC4 = (zzZPY.zzYC(j3) * fIntBitsToFloat2) + (Float.intBitsToFloat(i3) * fZzYC3);
        float f = (fZzYC * fIntBitsToFloat2) - (fZzYC3 * fIntBitsToFloat);
        if (!zzAN.zzf(f)) {
            float fOooO0O0 = C20509OooO0oo.OooO0O0(fIntBitsToFloat, fZzYC4, fIntBitsToFloat2 * fZzYC2, f);
            float fOooO0O02 = C20509OooO0oo.OooO0O0(fZzYC3, fZzYC2, fZzYC * fZzYC4, f);
            float fZzR = zzAN.zzR(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)) - 1.0f;
            float fZzQ = zzAN.zzQ(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)) + 1.0f;
            float fZzR2 = zzAN.zzR(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3), zzZPY.zzYC(j4)) - 1.0f;
            float fZzQ2 = zzAN.zzQ(zzZPY.zzYC(j), zzZPY.zzYC(j2), zzZPY.zzYC(j3), zzZPY.zzYC(j4)) + 1.0f;
            float f2 = (fZzQ - fZzR) / 2.0f;
            float f3 = (fZzQ2 - fZzR2) / 2.0f;
            if (fOooO0O0 >= fZzR - f2 && fOooO0O0 <= fZzQ + f2 && fOooO0O02 >= fZzR2 - f3 && fOooO0O02 <= fZzQ2 + f3) {
                return zzZPY.zzG(fOooO0O0, fOooO0O02);
            }
        }
        return j2;
    }

    private long zzW(zzOW zzow) {
        int iIndexOf = this.zzSo.zzNY().indexOf(zzow) + 1;
        return iIndexOf < this.zzSo.zzNY().size() ? this.zzSo.zzNY().get(iIndexOf).zzPR() : this.zzSo.isClosed() ? this.zzSo.zzNY().get(0).zzPR() : zzow.zzPQ();
    }

    private long zzX(zzOW zzow) {
        int iIndexOf = this.zzSo.zzNY().indexOf(zzow) - 1;
        return iIndexOf >= 0 ? this.zzSo.zzNY().get(iIndexOf).zzPQ() : this.zzSo.isClosed() ? this.zzSo.zzNY().get(this.zzSo.zzNY().size() - 1).zzPQ() : zzow.zzPR();
    }

    public static zzP8 zzZ(zzP8 zzp8, zzOU zzou) throws Exception {
        if (zzou == null) {
            return zzp8;
        }
        zzOY zzoy = new zzOY(zzou.getWidth());
        zzp8.zzY(zzoy);
        return zzoy.zzGC;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(zzP5 zzp5) {
        if (zzp5.isClosed()) {
            this.zzGB.zze(true);
            this.zzGA.zze(true);
            zzZQG.zzZ(this.zzGC.zzO7(), this.zzGB);
            zzZQG.zzZ(this.zzGC.zzO7(), this.zzGA);
        } else {
            this.zzGB.zzU(this.zzGA);
            this.zzGB.zze(true);
            zzZQG.zzZ(this.zzGC.zzO7(), this.zzGB);
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzP5 zzp5) {
        this.zzSo = zzp5;
        this.zzGB = new zzP5();
        this.zzGA = new zzP5();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzOS zzos) {
        long jZzX = zzX(zzos);
        long jZzW = zzW(zzos);
        Ref<long[]> ref = new Ref<>(null);
        Ref<long[]> ref2 = new Ref<>(null);
        zzZ(zzos.zzNu(), jZzX, jZzW, ref, ref2);
        zzZ(new zzOS(ref.get(), false), new zzOS(ref2.get(), false));
        return true;
    }

    public static long[] zzY(long j, long j2, float f) {
        int i = (int) j;
        int i2 = (int) j2;
        double dAtan2 = Math.atan2(zzZPY.zzYC(j) - zzZPY.zzYC(j2), Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
        float fSin = ((float) Math.sin(dAtan2)) * f;
        float fCos = (-f) * ((float) Math.cos(dAtan2));
        return new long[]{C22243OooO0Oo.OooO00o(fCos, Float.intBitsToFloat(i) + fSin, j), C22243OooO0Oo.OooO00o(fCos, Float.intBitsToFloat(i2) + fSin, j2)};
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(zzPZ zzpz) {
        long jZzX = zzX(zzpz);
        long jZzW = zzW(zzpz);
        zz0Q zz0q = new zz0Q();
        zz0q.add(zzpz.zzPX());
        zz0q.add(zzpz.zzPL());
        zz0q.add(zzpz.zzPK());
        zz0q.add(zzpz.zzPW());
        Ref<long[]> ref = new Ref<>(null);
        Ref<long[]> ref2 = new Ref<>(null);
        zzZ(zz0q, jZzX, jZzW, ref, ref2);
        zzZ(new zzPZ(ref.get()), new zzPZ(ref2.get()));
        return true;
    }

    private void zzZ(zzOW zzow, zzOW zzow2) {
        zzZQG.zzZ(this.zzGB.zzNY(), zzow);
        if (this.zzSo.isClosed()) {
            zzZQG.zzZ(this.zzGA.zzNY(), zzow2);
        } else {
            this.zzGA.zzNY().add(0, zzow2);
        }
    }

    private void zzZ(zz0Q zz0q, long j, long j2, Ref<long[]> ref, Ref<long[]> ref2) {
        ref.set(new long[zz0q.getCount()]);
        ref2.set(new long[zz0q.getCount()]);
        long j3 = j;
        int i = 0;
        while (i < zz0q.getCount()) {
            long j4 = zz0q.get(i);
            long[] jArrZzZ = zzZ(j3, j4, i < zz0q.getCount() - 1 ? zz0q.get(i + 1) : j2, this.zzGD);
            ref.get()[i] = jArrZzZ[0];
            ref2.get()[this.zzSo.isClosed() ? i : (ref2.get().length - i) - 1] = jArrZzZ[1];
            i++;
            j3 = j4;
        }
    }

    private static long[] zzZ(long j, long j2, long j3, float f) {
        long jZzP;
        long jZzP2;
        float f2 = f / 2.0f;
        long[] jArrZzY = zzY(j, j2, f2);
        long[] jArrZzY2 = zzY(j2, j3, f2);
        float f3 = -f2;
        long[] jArrZzY3 = zzY(j, j2, f3);
        long[] jArrZzY4 = zzY(j2, j3, f3);
        if (zzZPY.zzD(j, j2)) {
            jZzP = jArrZzY2[0];
            jZzP2 = jArrZzY4[0];
        } else if (zzZPY.zzD(j2, j3)) {
            jZzP = jArrZzY[1];
            jZzP2 = jArrZzY3[1];
        } else {
            jZzP = zzP(jArrZzY[0], jArrZzY[1], jArrZzY2[0], jArrZzY2[1]);
            jZzP2 = zzP(jArrZzY3[0], jArrZzY3[1], jArrZzY4[0], jArrZzY4[1]);
        }
        return new long[]{jZzP, jZzP2};
    }
}
