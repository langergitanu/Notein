package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVA implements zzZ9O {
    private com.aspose.words.internal.zzTH zzZvT;

    public zzVA() {
        com.aspose.words.internal.zzTH zzth = new com.aspose.words.internal.zzTH();
        this.zzZvT = zzth;
        zzth.zzA(5.0d);
    }

    private static com.aspose.words.internal.zz0M zzK(long[] jArr) {
        com.aspose.words.internal.zzD9 zzd9 = new com.aspose.words.internal.zzD9(jArr.length);
        for (int i = 0; i < jArr.length; i++) {
            zzd9.add(new com.aspose.words.internal.zzDA(Float.intBitsToFloat((int) jArr[i]), com.aspose.words.internal.zzZPY.zzYC(jArr[i])));
        }
        com.aspose.words.internal.zz0M zz0m = new com.aspose.words.internal.zz0M((byte) 0);
        zz0m.add(zzd9);
        return zz0m;
    }

    private static long[] zzW(long[] jArr, int i) {
        long[] jArr2 = new long[jArr.length];
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i3 < jArr.length) {
            jArr2[i4] = jArr[i3];
            i3++;
            i4++;
        }
        while (i2 < i) {
            jArr2[i4] = jArr[i2];
            i2++;
            i4++;
        }
        return jArr2;
    }

    private static int zzX(long[] jArr, long j) {
        double d = Double.MAX_VALUE;
        int i = 0;
        for (int i2 = 0; i2 < jArr.length; i2++) {
            double dZzL = com.aspose.words.internal.zzJ6.zzL(jArr[i2], j);
            if (d > dZzL) {
                i = i2;
                d = dZzL;
            }
        }
        return i;
    }

    @Override // com.aspose.words.zzZ9O
    public final long[] zzZ(long[] jArr, float f, boolean z) {
        com.aspose.words.internal.zz0M zz0mZzK = zzK(jArr);
        com.aspose.words.internal.zz0M zz0m = new com.aspose.words.internal.zz0M((byte) 0);
        boolean zZzZ = com.aspose.words.internal.zzTK.zzZ(zz0mZzK.get(0));
        float f2 = !zZzZ ? 1.0f : -1.0f;
        this.zzZvT.zzX(zz0mZzK);
        float fZzZ = zzZ(zz0mZzK, f);
        if (z) {
            while (zz0m.getCount() != 1 && fZzZ > 0.0f) {
                this.zzZvT.zzZ(zz0m, fZzZ * f2);
                fZzZ -= 2.0f;
            }
        } else {
            this.zzZvT.zzZ(zz0m, f2 * fZzZ);
        }
        if (zz0m.getCount() == 0) {
            return null;
        }
        com.aspose.words.internal.zzD9 zzd9 = zz0m.get(0);
        if (!zZzZ) {
            zzd9.reverse();
        }
        int count = zzd9.getCount();
        long[] jArrZzZ = new long[count];
        for (int i = 0; i < zzd9.getCount(); i++) {
            jArrZzZ[i] = com.aspose.words.internal.zzZPY.zzG(zzd9.get(i).zzuS, zzd9.get(i).zzuR);
        }
        if (jArr.length == count) {
            jArrZzZ = zzZ(jArrZzZ, jArr, fZzZ);
        }
        this.zzZvT.clear();
        return jArrZzZ;
    }

    private static float zzZ(com.aspose.words.internal.zz0M zz0m, float f) {
        com.aspose.words.internal.zzD8 zzd8ZzY = com.aspose.words.internal.zzTJ.zzY(zz0m);
        float fMin = Math.min(zzd8ZzY.zzuN - zzd8ZzY.zzuP, zzd8ZzY.zzuO - zzd8ZzY.zzuQ) / 2.0f;
        return f > fMin ? fMin : f;
    }

    private static long[] zzZ(long[] jArr, long[] jArr2, float f) {
        return zzW(jArr, zzX(jArr, com.aspose.words.internal.zzJ6.zzY(jArr2[jArr2.length - 1], jArr2[0], jArr2[1], f)[0]));
    }
}
