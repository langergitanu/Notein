package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8E {
    private float zzYjy;
    private float zzYjz;

    private static int zzY(int i, int i2, com.aspose.words.internal.zzOT zzot) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (zzot.zzNE()[(i * i2) + i3] != 0) {
                return i3;
            }
        }
        return -1;
    }

    private zzYL9 zzY4(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(bArr);
        try {
            zzYL9 zzyl9ZzZ = zzZ(zzxn.zzWE(), zzxn.getWidth(), zzxn.getHeight());
            this.zzYjz = zzxn.getWidth();
            this.zzYjy = zzxn.getHeight();
            return zzyl9ZzZ;
        } finally {
            zzxn.dispose();
        }
    }

    public static zzYL9 zzZ(byte[] bArr, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        if (com.aspose.words.internal.zzEF.zzZH(bArr)) {
            return new zzYL9(new zzYLC(zzzq4));
        }
        zzZ8E zzz8e = new zzZ8E();
        zzYL9 zzyl9ZzY4 = zzz8e.zzY4(bArr);
        if (zzyl9ZzY4.zzYna() == 0) {
            return new zzYL9();
        }
        float f = zzz8e.zzYjz;
        float f2 = zzz8e.zzYjy;
        if ((zzzq4.getWidth() != f || zzzq4.getHeight() != f2) && f != 0.0f && f2 != 0.0f && !com.aspose.words.internal.zzZQ4.zzV(zzzq4, com.aspose.words.internal.zzZQ4.zz2T)) {
            com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
            zzp9.zzY(zzzq4.getX(), zzzq4.getY(), 1);
            zzp9.zzZ(zzzq4.getWidth() / f, zzzq4.getHeight() / f2, 1);
            for (int i = 0; i < zzyl9ZzY4.zzYna(); i++) {
                zzyl9ZzY4.zzq0(i).zzq(zzp9);
            }
        }
        return zzyl9ZzY4;
    }

    private static zzYL9 zzZ(com.aspose.words.internal.zzOT zzot, int i, int i2) {
        if (!zzot.zzND()) {
            float f = i;
            float f2 = i2;
            return new zzYL9(new zzYLC(new long[]{com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f), com.aspose.words.internal.zzZPY.zzG(f, 0.0f), com.aspose.words.internal.zzZPY.zzG(f, f2), com.aspose.words.internal.zzZPY.zzG(0.0f, f2)}));
        }
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        zzZ(zzot, i, i2, iArr, iArr2);
        zzYL9 zzyl9 = new zzYL9();
        zzYLC zzylc = new zzYLC();
        boolean z = true;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            int i4 = iArr2[i3];
            if (i4 != -1) {
                zzZ(zzylc, com.aspose.words.internal.zzZPY.zzG(i4, i3));
                if (!z) {
                    i2 = i3 + 1;
                }
                if (i3 == 0) {
                    zzZ(zzylc, iArr, i3, i2);
                }
                z = true;
            } else if (z) {
                zzZ(zzylc, iArr, i3, i2);
                zzyl9.zzU(zzylc);
                zzylc = new zzYLC();
                z = false;
            }
        }
        if (zzylc.zzYnj() > 0) {
            zzyl9.zzU(zzylc);
        }
        return zzyl9;
    }

    private static void zzZ(zzYLC zzylc, int[] iArr, int i, int i2) {
        while (i < i2) {
            int i3 = iArr[i];
            if (i3 != -1) {
                zzZ(zzylc, com.aspose.words.internal.zzZPY.zzG(i3, i));
            }
            i++;
        }
    }

    private static void zzZ(com.aspose.words.internal.zzOT zzot, int i, int i2, int[] iArr, int[] iArr2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int iZzZ = zzZ(i3, i, zzot);
            iArr[i3] = iZzZ;
            if (iZzZ != -1) {
                iArr2[i3] = zzY(i3, i, zzot);
            } else {
                iArr2[i3] = -1;
            }
        }
    }

    private static int zzZ(int i, int i2, com.aspose.words.internal.zzOT zzot) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (zzot.zzNE()[(i * i2) + i3] != 0) {
                return i3;
            }
        }
        return -1;
    }

    private static void zzZ(zzYLC zzylc, long j) {
        int iZzYnj = zzylc.zzYnj();
        if (iZzYnj < 2) {
            zzylc.zzXx(j);
            return;
        }
        long jZzYn8 = zzylc.zzq1(iZzYnj - 2).zzYn8();
        int i = iZzYnj - 1;
        int iZzYn8 = (int) zzylc.zzq1(i).zzYn8();
        if (Float.intBitsToFloat((int) jZzYn8) == Float.intBitsToFloat(iZzYn8) && Float.intBitsToFloat(iZzYn8) == Float.intBitsToFloat((int) j)) {
            zzylc.zzY(i, new zzYL8(j));
        } else {
            zzylc.zzXx(j);
        }
    }
}
