package com.aspose.words;

import android.os.Bundle;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes6.dex */
final class zz14 extends zzDL {
    private zz15 zzYYc;
    private com.aspose.words.internal.zzZYV<zzZ> zzYYd;
    private float zzw1;
    private float zzw2;

    public final class zzY {
        public float zzYY7;
        public float zzYY8;
        public float zzYY9;

        public zzY(long j, float f) {
            this.zzYY8 = Float.intBitsToFloat((int) j);
            this.zzYY7 = com.aspose.words.internal.zzZPY.zzYC(j);
            this.zzYY9 = f;
        }
    }

    public zz14(zzGK zzgk) {
        super(zzgk);
        this.zzw2 = Float.NaN;
        this.zzw1 = Float.NaN;
        this.zzYYd = new com.aspose.words.internal.zzZYV<>();
        this.zzYYc = (zz15) zzgk;
    }

    private zzZ zzGT(int i) {
        if (this.zzYYd.get(i) == null) {
            this.zzYYd.set(i, new zzZ((byte) 0));
        }
        return this.zzYYd.get(i);
    }

    private static float zzS(float f, float f2, float f3) {
        return zzT(com.aspose.words.internal.zzZPY.zzG(0.0f, f), com.aspose.words.internal.zzZPY.zzG(1.0f, f2), f3);
    }

    private static boolean zzT(float f, float f2, float f3, float f4) {
        return zzT(f, f3, f4) && zzT(f2, f3, f4);
    }

    private static int zzXY(int i, int i2) {
        if (i < 0) {
            i = (i % i2) + i2;
        }
        return i >= i2 ? i % i2 : i;
    }

    private zzY[][] zzY(zzZCP zzzcp) throws Exception {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        boolean reverseOrder = this.zzYYc.zzZQM().getReverseOrder();
        if (reverseOrder) {
            float count = this.zzYYc.zzZPj().getCount() - 1;
            zzp9.zzY(zzzcp.zzZK9() * count, (-zzzcp.zzZK8()) * count, 0);
        }
        zzY[][] zzyArr = (zzY[][]) Array.newInstance((Class<?>) zzY.class, this.zzYYc.zzZPj().getCount(), this.zzYYc.zzZPb());
        for (int i = 0; i < this.zzYYc.zzZPj().getCount(); i++) {
            ChartSeries chartSeries = this.zzYYc.zzZPj().get(i);
            long[] jArrZzK = zzzcp.zzK(chartSeries);
            zzp9.zzZ(jArrZzK);
            for (int i2 = 0; i2 < jArrZzK.length; i2++) {
                zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(i2);
                zzyArr[i][i2] = new zzY(jArrZzK[i2], (float) ((zzCF.zzR(zzcfZzL0) || zzDG.zzZ(this.zzYYc.zzZPs(), zzcfZzL0.getValue())) ? this.zzYYc.zzZPs().zz41().zzZOR() : zzcfZzL0.getValue()));
            }
            zzp9.zzY((reverseOrder ? -1 : 1) * zzzcp.zzZK9(), (-r6) * zzzcp.zzZK8(), 0);
        }
        return zzyArr;
    }

    private void zzZ(zzEM zzem, zzDI zzdi, int i, String str) throws Exception {
        zzem.zzZ(zzEN.zzZ(this.zzYYc.zzZtT().zzLt(i), i, zzem.zzZLC(), this.zzYYc.zzZtS(), zzdi), str);
    }

    private float zzZtP() {
        if (Float.isNaN(this.zzw1)) {
            zzZtR();
        }
        return this.zzw1;
    }

    private float zzZtQ() {
        if (Float.isNaN(this.zzw2)) {
            zzZtR();
        }
        return this.zzw2;
    }

    private void zzZtR() {
        for (ChartSeries chartSeries : this.zzYYc.zzZPj()) {
            for (int i = 0; i < chartSeries.getValueCount(); i++) {
                zzCF zzcfZzL0 = chartSeries.zz2y().zzL0(i);
                if (!zzCF.zzR(zzcfZzL0)) {
                    this.zzw2 = Float.isNaN(this.zzw2) ? (float) zzcfZzL0.getValue() : Math.max(this.zzw2, (float) zzcfZzL0.getValue());
                    this.zzw1 = Float.isNaN(this.zzw1) ? (float) zzcfZzL0.getValue() : Math.min(this.zzw1, (float) zzcfZzL0.getValue());
                }
            }
        }
    }

    @Override // com.aspose.words.zzDL
    public final void zzU(zzEM zzem, zzDI zzdi) throws Exception {
        ChartAxis chartAxisZzZPs;
        if (this.zzYYc.zzZPs().zz41().zzZOQ()) {
            chartAxisZzZPs = this.zzYYc.zzZPs();
        } else {
            chartAxisZzZPs = this.zzYYc.zzZPs().zz47();
            chartAxisZzZPs.zz0(this.zzYYc.zz45().zzZ(this.zzYYc, new com.aspose.words.internal.zzZQ4(0L, zzdi.zzZIz()), zzdi, true));
            chartAxisZzZPs.zzZ(zzdi);
            chartAxisZzZPs.zzYr(true);
            chartAxisZzZPs.zzYq(this.zzYYc.zzZP7());
            for (ChartSeries chartSeries : this.zzYYc.zzZPj()) {
                chartAxisZzZPs.zz41().zzZ(chartSeries.zz2y(), chartSeries.zz2u(), chartSeries.getValueCount());
            }
        }
        int length = 0;
        boolean z = zzem.getPosition() == 1 || zzem.getPosition() == 4;
        if ((chartAxisZzZPs.getScaling().getOrientation() == 0) ^ z) {
            while (length < chartAxisZzZPs.zz41().zzZOV().length - 1) {
                int i = length + 1;
                String str = com.aspose.words.internal.zzZKN.format("{0}-{1}", Float.valueOf((float) chartAxisZzZPs.zz41().zzZOV()[length].getValue()), Float.valueOf((float) chartAxisZzZPs.zz41().zzZOV()[i].getValue()));
                if (!z) {
                    length = chartAxisZzZPs.zz41().zzZOV().length - (length + 2);
                }
                zzZ(zzem, zzdi, length, str);
                length = i;
            }
            return;
        }
        for (int length2 = chartAxisZzZPs.zz41().zzZOV().length - 1; length2 > 0; length2--) {
            int length3 = length2 - 1;
            String str2 = com.aspose.words.internal.zzZKN.format("{0}-{1}", Float.valueOf((float) chartAxisZzZPs.zz41().zzZOV()[length3].getValue()), Float.valueOf((float) chartAxisZzZPs.zz41().zzZOV()[length2].getValue()));
            if (z) {
                length3 = chartAxisZzZPs.zz41().zzZOV().length - (length2 + 1);
            }
            zzZ(zzem, zzdi, length3, str2);
        }
    }

    @Override // com.aspose.words.zzDL
    public final void zzV(zzEM zzem, zzDI zzdi) throws Exception {
        zzU(zzem, zzdi);
    }

    public static class zzZ {
        private int zzYYa;
        private int zzYYb;
        private com.aspose.words.internal.zzG zzf9;

        private zzZ() {
            this.zzf9 = new com.aspose.words.internal.zzG();
        }

        public final void zzGS(int i) {
            if (i == this.zzYYb) {
                return;
            }
            this.zzYYb = i;
            this.zzYYa = 0;
        }

        public final void zzX(com.aspose.words.internal.zzZL zzzl) {
            if (zzzl == null) {
                return;
            }
            this.zzf9.zzZ(this.zzYYa, zzzl);
            this.zzYYa++;
        }

        public final com.aspose.words.internal.zzG zzZtO() {
            return this.zzf9;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static boolean zzT(float f, float f2, float f3) {
        if (com.aspose.words.internal.zzAN.zzP(f, f2) && com.aspose.words.internal.zzAN.zzR(f, f3)) {
            return true;
        }
        return com.aspose.words.internal.zzAN.zzP(f, f3) && com.aspose.words.internal.zzAN.zzR(f, f2);
    }

    private static float zzT(long j, long j2, float f) {
        int i = (int) j;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j);
        if (com.aspose.words.internal.zzAN.zzf(fIntBitsToFloat)) {
            return Float.intBitsToFloat(i);
        }
        if (com.aspose.words.internal.zzAN.zzf(fZzYC)) {
            return Float.NaN;
        }
        float fZzYC2 = f - com.aspose.words.internal.zzZPY.zzYC(j);
        return Float.intBitsToFloat(i) + (fZzYC2 / (fZzYC / fIntBitsToFloat));
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzY[][] zzyArrZzY = zzY(zzzcp);
        for (int i = 0; i < this.zzYYc.zzZPj().getCount() - 1; i++) {
            int i2 = 0;
            while (i2 < this.zzYYc.zzZPb() - 1) {
                zzY[] zzyArr = zzyArrZzY[i];
                zzY zzy = zzyArr[i2];
                zzY[] zzyArr2 = zzyArrZzY[i + 1];
                zzY zzy2 = zzyArr2[i2];
                i2++;
                zzZ(i, zzzcp, new zzY[]{zzy, zzy2, zzyArr2[i2], zzyArr[i2]}, zzdi);
            }
        }
        com.aspose.words.internal.zzG zzgZzKy = zzdi.zzKy(7);
        for (int i3 = 0; i3 < this.zzYYd.getCount(); i3++) {
            zzZ zzzZzVY = this.zzYYd.zzVY(zzzcp.zzZKb() == 0 ? this.zzYYd.getCount() - (i3 + 1) : i3);
            if (zzzZzVY.zzZtO().getCount() > 0) {
                zzgZzKy.zzX((com.aspose.words.internal.zzZL) zzzZzVY.zzZtO());
            }
        }
    }

    private void zzZ(int i, zzZCP zzzcp, zzY[] zzyArr, zzDI zzdi) throws Exception {
        zzY[] zzyArr2;
        zzY[] zzyArr3;
        int i2;
        char c;
        zzY[] zzyArr4;
        zzY[] zzyArr5;
        com.aspose.words.internal.zz0Q zz0q;
        int i3;
        com.aspose.words.internal.zzZG[] zzzgArr;
        int i4;
        zz14 zz14Var = this;
        boolean zZzZ = zzZ(zzyArr, zzzcp);
        int i5 = 1;
        char c2 = 0;
        boolean z = zzzcp.zzZKb() == 0;
        if (zZzZ) {
            zzyArr2 = new zzY[]{zzyArr[0], zzyArr[1], zzyArr[2]};
            zzyArr3 = new zzY[]{zzyArr[0], zzyArr[3], zzyArr[2]};
        } else {
            zzY zzy = zzyArr[3];
            zzyArr2 = new zzY[]{zzyArr[1], zzyArr[2], zzy};
            zzyArr3 = new zzY[]{zzyArr[1], zzyArr[0], zzy};
        }
        zzY[] zzyArr6 = zzyArr2;
        float[] fArrZzZ = zz14Var.zzZ(zzyArr, zZzZ);
        int i6 = 0;
        while (i6 < zzzcp.zzZKa().length - i5) {
            float value = (float) zzzcp.zzZKa()[i6].getValue();
            int i7 = i6 + 1;
            float value2 = (float) zzzcp.zzZKa()[i7].getValue();
            int length = z ? zzzcp.zzZKa().length - (i6 + 2) : i6;
            if (zz14Var.zzYYc.zzZtS()) {
                int i8 = i6;
                com.aspose.words.internal.zz0Q zz0qZzZ = zzZ(zzyArr6, value, value2);
                com.aspose.words.internal.zz0Q zz0qZzZ2 = zzZ(zzyArr3, value, value2);
                zzZ(zz0qZzZ, zz0qZzZ2);
                com.aspose.words.internal.zzZG[] zzzgArr2 = new com.aspose.words.internal.zzZG[2];
                if (zz0qZzZ.getCount() > 0) {
                    i2 = i5;
                    c = c2;
                    zzzgArr = zzzgArr2;
                    zz0q = zz0qZzZ2;
                    i3 = length;
                    i4 = i8;
                    zzzgArr[c] = zz14Var.zzZ(zz0qZzZ, i3, fArrZzZ[c2], zz14Var.zzYYc.zzZtT().zzLt(length), zzdi);
                } else {
                    zz0q = zz0qZzZ2;
                    i3 = length;
                    i2 = i5;
                    c = c2;
                    zzzgArr = zzzgArr2;
                    i4 = i8;
                }
                if (zz0q.getCount() > 0) {
                    zzzgArr[i2] = zz14Var.zzZ(zz0q, i3, fArrZzZ[c], zz14Var.zzYYc.zzZtT().zzLt(i3), zzdi);
                }
                zz14Var.zzZ(zZzZ, zzzcp.zzZKa().length - i4, i, zzzgArr);
                zzyArr4 = zzyArr6;
                zzyArr5 = zzyArr3;
            } else {
                i2 = i5;
                c = c2;
                int i9 = i6;
                zzY[] zzyArr7 = zzyArr6;
                com.aspose.words.internal.zzZG zzzgZzZ = zz14Var.zzZ(zzyArr7, value, value2, length, fArrZzZ[c], zzdi);
                zzyArr4 = zzyArr7;
                zz14Var = this;
                zzyArr5 = zzyArr3;
                zz14Var.zzZ(zZzZ, i9, i, new com.aspose.words.internal.zzZG[]{zzzgZzZ, zz14Var.zzZ(zzyArr5, value, value2, length, fArrZzZ[i2], zzdi)});
            }
            zzyArr3 = zzyArr5;
            i6 = i7;
            zzyArr6 = zzyArr4;
            i5 = i2;
            c2 = c;
        }
    }

    private static void zzZ(com.aspose.words.internal.zz0Q zz0q, com.aspose.words.internal.zz0Q zz0q2) {
        if (zz0q.getCount() == 0 || zz0q2.getCount() == 0) {
            return;
        }
        com.aspose.words.internal.zz0P zz0p = new com.aspose.words.internal.zz0P();
        for (int i = 0; i < zz0q.getCount(); i++) {
            for (int i2 = 0; i2 < zz0q2.getCount(); i2++) {
                if (com.aspose.words.internal.zzJ6.zzN(zz0q.get(i), zz0q2.get(i2))) {
                    zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i, i2));
                }
            }
        }
        if (zz0p.getCount() != 2) {
            return;
        }
        com.aspose.words.internal.zz0Q zz0q3 = new com.aspose.words.internal.zz0Q();
        zzZ(zz0q, zz0q3, (int) zz0p.get(0), (int) zz0p.get(1));
        zzZ(zz0q2, zz0q3, (int) (zz0p.get(1) >> 32), (int) (zz0p.get(0) >> 32));
        zz0q.clear();
        zz0q2.clear();
        zz0q.zzR(zz0q3);
    }

    private static void zzZ(com.aspose.words.internal.zz0Q zz0q, com.aspose.words.internal.zz0Q zz0q2, int i, int i2) {
        if (i == 0 && i2 == zz0q.getCount() - 1) {
            zz0q2.zzR(zz0q);
            return;
        }
        if (i2 == 0 && i == zz0q.getCount() - 1) {
            for (int count = zz0q.getCount() - 1; count >= 0; count--) {
                zz0q2.add(zz0q.get(count));
            }
            return;
        }
        int i3 = 0;
        if (i < i2) {
            while (i3 < zz0q.getCount()) {
                zz0q2.add(zz0q.get(zzXY(i, zz0q.getCount())));
                i--;
                i3++;
            }
            return;
        }
        while (i3 < zz0q.getCount()) {
            zz0q2.add(zz0q.get(zzXY(i, zz0q.getCount())));
            i++;
            i3++;
        }
    }

    private static boolean zzZ(zzY[] zzyArr, zzZCP zzzcp) throws Exception {
        float f = zzyArr[0].zzYY9;
        int i = 0;
        int i2 = 0;
        float f2 = f;
        for (int i3 = 0; i3 < zzyArr.length; i3++) {
            float f3 = zzyArr[i3].zzYY9;
            if (f > f3) {
                i = i3;
                f = f3;
            }
            if (f2 < f3) {
                i2 = i3;
                f2 = f3;
            }
        }
        if (zzzcp.zzZKb() != 0) {
            return i2 == 0 || i2 == 2;
        }
        return ((i == 0 || i == 2) || zzZ(zzyArr[0].zzYY9, zzyArr[2].zzYY9, zzzcp)) && !zzZ(zzyArr[1].zzYY9, zzyArr[3].zzYY9, zzzcp);
    }

    private float[] zzZ(zzY[] zzyArr, boolean z) {
        float f;
        float f2;
        float fZzZPb = 1.0f / this.zzYYc.zzZPb();
        float fZzZtQ = (zzyArr[0].zzYY9 - zzyArr[3].zzYY9) / (zzZtQ() - zzZtP());
        float fZzZtQ2 = (zzyArr[1].zzYY9 - zzyArr[2].zzYY9) / (zzZtQ() - zzZtP());
        if (z) {
            f = zzyArr[0].zzYY9;
            f2 = zzyArr[2].zzYY9;
        } else {
            f = zzyArr[1].zzYY9;
            f2 = zzyArr[3].zzYY9;
        }
        float f3 = (f + f2) / 2.0f;
        float f4 = (z ? zzyArr[1] : zzyArr[0]).zzYY9 - f3;
        float f5 = f3 - (z ? zzyArr[3] : zzyArr[2]).zzYY9;
        int i = f4 > 0.0f ? 1 : -1;
        double d = fZzZPb;
        return new float[]{(((float) Math.sin(Math.atan2(d, fZzZtQ2))) * (f5 > 0.0f ? 1 : -1) * 40.0f) + 60.0f, (((float) Math.sin(Math.atan2(d, fZzZtQ))) * i * 40.0f) + 60.0f};
    }

    private com.aspose.words.internal.zzZG zzZ(zzY[] zzyArr, float f, float f2, int i, float f3, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zz0Q zz0qZzZ = zzZ(zzyArr, f, f2);
        if (zz0qZzZ.getCount() == 0) {
            return null;
        }
        return zzZ(zz0qZzZ, i, f3, this.zzYYc.zzZtT().zzLt(i), zzdi);
    }

    private static com.aspose.words.internal.zz0Q zzZ(zzY[] zzyArr, float f, float f2) {
        zzY zzy;
        com.aspose.words.internal.zz0Q zz0q = new com.aspose.words.internal.zz0Q();
        float fMin = zzyArr[0].zzYY9;
        float fMax = fMin;
        for (zzY zzy2 : zzyArr) {
            fMin = Math.min(fMin, zzy2.zzYY9);
            fMax = Math.max(fMax, zzy2.zzYY9);
        }
        if (!com.aspose.words.internal.zzAN.zzP(fMin, f2) && !com.aspose.words.internal.zzAN.zzR(fMax, f)) {
            int i = 0;
            while (i < zzyArr.length) {
                zzY zzy3 = zzyArr[i];
                i++;
                if (i < zzyArr.length) {
                    zzy = zzyArr[i];
                } else {
                    zzy = zzyArr[0];
                }
                if (zzT(zzy3.zzYY9, zzy.zzYY9, f, f2)) {
                    zzZ(zz0q, com.aspose.words.internal.zzZPY.zzG(zzy3.zzYY8, zzy3.zzYY7));
                    zzZ(zz0q, com.aspose.words.internal.zzZPY.zzG(zzy.zzYY8, zzy.zzYY7));
                } else {
                    if (zzT(zzy3.zzYY9, f, f2)) {
                        zzZ(zz0q, com.aspose.words.internal.zzZPY.zzG(zzy3.zzYY8, zzy3.zzYY7));
                    }
                    if (zzy3.zzYY9 < zzy.zzYY9) {
                        zzZ(f, zzy3, zzy, zz0q);
                        zzZ(f2, zzy3, zzy, zz0q);
                    } else {
                        zzZ(f2, zzy3, zzy, zz0q);
                        zzZ(f, zzy3, zzy, zz0q);
                    }
                    if (zzT(zzy.zzYY9, f, f2)) {
                        zzZ(zz0q, com.aspose.words.internal.zzZPY.zzG(zzy.zzYY8, zzy.zzYY7));
                    }
                }
            }
            if (zz0q.getCount() > 1 && com.aspose.words.internal.zzJ6.zzN(zz0q.get(0), zz0q.get(zz0q.getCount() - 1))) {
                zz0q.removeAt(zz0q.getCount() - 1);
            }
        }
        return zz0q;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [float, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [float, void] */
    /* JADX WARN: Type inference failed for: r1v2, types: [float, java.lang.String] */
    private static void zzZ(float f, zzY zzy, zzY zzy2, com.aspose.words.internal.zz0Q zz0q) {
        if (zzT(f, zzy.zzYY9, zzy2.zzYY9)) {
            float fZzS = zzS(zzy.zzYY9, zzy2.zzYY9, f);
            ?? PutInt = Bundle.putInt(zzy2.zzYY8, zzy.zzYY8);
            float f2 = zzy.zzYY7;
            zzZ(zz0q, com.aspose.words.internal.zzZPY.zzG(PutInt, ((zzy2.zzYY7 - f2) * fZzS) + f2));
        }
    }

    private static void zzZ(com.aspose.words.internal.zz0Q zz0q, long j) {
        if (zz0q.getCount() == 0 || !com.aspose.words.internal.zzJ6.zzN(j, zz0q.get(zz0q.getCount() - 1))) {
            zz0q.add(j);
        }
    }

    private com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zz0Q zz0q, int i, float f, zzD9 zzd9, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(zz0q, false, true);
        zzDG.zzZ(zzzgZzZ, zzd9, (zzE3) null, zzdi.zzZIC().zzZMK(), i);
        if (this.zzYYc.zzZtS()) {
            zzDG.zzB(zzzgZzZ);
            zzzgZzZ.zzY((com.aspose.words.internal.zzPY) null);
        } else {
            zzzgZzZ.zzY(zzGJ.zzZ(zzzgZzZ.zzZ1(), f));
            zzDG.zzB(zzzgZzZ);
        }
        zzzgZzZ.zzZ2().zzXW(1);
        return zzzgZzZ;
    }

    private void zzZ(boolean z, int i, int i2, com.aspose.words.internal.zzZG[] zzzgArr) {
        zzZ zzzZzGT = zzGT(i);
        zzzZzGT.zzGS(i2);
        for (int i3 = 0; i3 < 2; i3++) {
            zzzZzGT.zzX(zzzgArr[z ? i3 : 2 - (i3 + 1)]);
        }
    }

    private static boolean zzZ(float f, float f2, zzZCP zzzcp) throws Exception {
        int i = 0;
        boolean zZzT = false;
        while (i < zzzcp.zzZKa().length - 1) {
            float value = (float) zzzcp.zzZKa()[i].getValue();
            i++;
            zZzT |= zzT(f, f2, value, (float) zzzcp.zzZKa()[i].getValue());
        }
        return zZzT;
    }
}
