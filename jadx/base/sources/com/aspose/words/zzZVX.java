package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVX {
    private zzZ9O zzYMT;
    private com.aspose.words.internal.zzQG[] zzYMU;
    private int zzYMV;
    private int zzYMW;
    private float zzYMX;
    private float zzYMY;
    private int zzZFz;
    private IWarningCallback zzZG0;

    public zzZVX(zzZS8 zzzs8, IWarningCallback iWarningCallback, zzZ9O zzz9o) {
        this.zzYMX = zzzs8.zzZhw();
        this.zzYMY = zzzs8.zzZhv();
        this.zzYMW = zzzs8.zzZhu();
        this.zzZFz = zzzs8.getShapeType();
        this.zzZG0 = iWarningCallback;
        this.zzYMT = zzz9o;
    }

    private long[] zzB(long[] jArr) {
        long j;
        long[] jArr2 = new long[jArr.length];
        float fZzZjX = zzZjX();
        long j2 = jArr[jArr.length - 1];
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        while (i < jArr.length) {
            if (i == 0) {
                j = jArr[i];
                j4 = jArr[i + 1];
            } else {
                j = j4;
                j4 = i == jArr.length + (-1) ? jArr[0] : jArr[i + 1];
                j2 = j3;
            }
            j3 = j;
            jArr2[i] = com.aspose.words.internal.zzJ6.zzY(j2, j3, j4, fZzZjX)[0];
            i++;
        }
        return jArr2;
    }

    private com.aspose.words.internal.zzQG zzS(com.aspose.words.internal.zzQG zzqg) {
        boolean z = zzqg.getCount() > 1;
        com.aspose.words.internal.zzQG zzqg2 = new com.aspose.words.internal.zzQG(zzqg.zzQv(), 1, zzqg.getOrder(), (com.aspose.words.internal.zzOU) null, zzqg.zzZ1());
        for (int i = 0; i < zzqg.getCount(); i++) {
            com.aspose.words.internal.zzQD zzqdZzYi = zzqg.zzYi(i);
            com.aspose.words.internal.zzQD zzqdZzZ = zzZ(zzqdZzYi, z);
            if (zzqdZzZ == null) {
                zzqg2.zzZ(zzqdZzYi);
                zzY1Z.zzZ(this.zzZG0, WarningType.MINOR_FORMATTING_LOSS_CATEGORY, 4, "Unsupported bevel options for shape.");
            } else {
                int i2 = this.zzYMW;
                if (i2 == 0 || i2 == 1) {
                    zzX(zzqdZzYi, zzqdZzZ, zzqg);
                } else if (i2 == 3) {
                    zzY(zzqdZzYi, zzqdZzZ, zzqg);
                } else if (i2 == 4) {
                    zzZ(zzqdZzYi, zzqdZzZ, zzqg);
                }
                zzqg2.zzZ(zzqdZzZ);
            }
        }
        return zzqg2;
    }

    private long[] zzW(long[] jArr, boolean z) {
        long[] jArrZzZ = this.zzYMT.zzZ(jArr, zzZjX(), z);
        if (jArrZzZ == null) {
            return null;
        }
        if (jArr.length > jArrZzZ.length || this.zzZFz == 72) {
            return (jArr.length <= 150 || jArr.length >= 350 || jArr.length - jArrZzZ.length <= 10) ? zzY(zzB(jArr), jArrZzZ) : zzY(jArr, jArrZzZ);
        }
        return jArrZzZ;
    }

    private void zzX(com.aspose.words.internal.zzQD zzqd, com.aspose.words.internal.zzQD zzqd2, com.aspose.words.internal.zzQG zzqg) {
        float fZzZjY = zzZjY();
        for (float f = 0.0f; f < 1.0f; f += fZzZjY) {
            int i = 0;
            while (i < zzqd.getCount()) {
                com.aspose.words.internal.zzQD zzqd3 = zzqd;
                com.aspose.words.internal.zzQD zzqd4 = zzqd2;
                com.aspose.words.internal.zzQ9[] zzq9ArrZzZ = zzZ(zzqd3, zzqd4, i, f, f + fZzZjY);
                com.aspose.words.internal.zzQG[] zzqgArr = this.zzYMU;
                int i2 = this.zzYMV;
                this.zzYMV = i2 + 1;
                zzqgArr[i2] = zzZ(zzq9ArrZzZ, zzqg);
                i++;
                zzqd = zzqd3;
                zzqd2 = zzqd4;
            }
        }
    }

    private static long[] zzY(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            float f = Float.MAX_VALUE;
            int i2 = 0;
            for (int i3 = 0; i3 < jArr2.length; i3++) {
                float fZzL = com.aspose.words.internal.zzJ6.zzL(jArr[i], jArr2[i3]);
                if (f > fZzL) {
                    i2 = i3;
                    f = fZzL;
                }
            }
            jArr3[i] = jArr2[i2];
        }
        return jArr3;
    }

    private float zzZjW() {
        float f = this.zzYMX;
        return this.zzYMW == 0 ? f - (f / 3.0f) : f;
    }

    private float zzZjX() {
        float f = this.zzYMY;
        return this.zzYMW == 3 ? f / 2.0f : f;
    }

    private float zzZjY() {
        return this.zzYMW != 1 ? 0.03f : 0.09f;
    }

    public final int zzV(com.aspose.words.internal.zzQG[] zzqgArr) {
        int count;
        int length = zzqgArr.length;
        int iZzZjY = (int) ((1.0f / zzZjY()) + 1.0f);
        for (int i = 0; i < zzqgArr.length; i++) {
            com.aspose.words.internal.zzQG zzqg = zzqgArr[i];
            if (i <= 0 && (zzqg.zzZ1() != null || zzqg.zzZ2() == null)) {
                for (com.aspose.words.internal.zzQD zzqd : zzqg.zzQw()) {
                    int i2 = this.zzYMW;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            count = zzqd.getCount() * iZzZjY;
                        } else if (i2 == 3) {
                            count = zzqd.getCount() * 2;
                        } else if (i2 == 4) {
                            count = zzqd.getCount();
                        }
                        length += count;
                    } else {
                        length = (zzqd.getCount() * iZzZjY) + length;
                    }
                }
            }
        }
        return length;
    }

    public final com.aspose.words.internal.zzQG[] zzZ(com.aspose.words.internal.zzQG[] zzqgArr, int i) {
        this.zzYMV = 0;
        this.zzYMU = new com.aspose.words.internal.zzQG[i];
        for (int i2 = 0; i2 < zzqgArr.length; i2++) {
            com.aspose.words.internal.zzQG zzqg = zzqgArr[i2];
            if (i2 > 0 || (zzqg.zzZ1() == null && zzqg.zzZ2() != null)) {
                com.aspose.words.internal.zzQG[] zzqgArr2 = this.zzYMU;
                int i3 = this.zzYMV;
                this.zzYMV = i3 + 1;
                zzqgArr2[i3] = zzqg;
            } else {
                com.aspose.words.internal.zzQG[] zzqgArr3 = this.zzYMU;
                int i4 = this.zzYMV;
                this.zzYMV = i4 + 1;
                zzqgArr3[i4] = zzS(zzqg);
            }
        }
        int i5 = this.zzYMV;
        com.aspose.words.internal.zzQG[] zzqgArr4 = this.zzYMU;
        if (i5 >= zzqgArr4.length) {
            return zzqgArr4;
        }
        com.aspose.words.internal.zzQG[] zzqgArr5 = new com.aspose.words.internal.zzQG[i5];
        for (int i6 = 0; i6 < this.zzYMV; i6++) {
            zzqgArr5[i6] = this.zzYMU[i6];
        }
        return zzqgArr5;
    }

    private com.aspose.words.internal.zzQ9 zzX(com.aspose.words.internal.zzQ9 zzq9, float f, com.aspose.words.internal.zzQ9 zzq92) {
        com.aspose.words.internal.zzQ9 zzq93 = (com.aspose.words.internal.zzQ9) zzq9.zzQc();
        com.aspose.words.internal.zzQ9 zzq94 = (com.aspose.words.internal.zzQ9) zzq9.zzQc();
        zzq94.zz9(zzq94.zzQa() + ((double) (this.zzYMX / 5.0f)));
        double dZzQb = zzq9.zzQb();
        double dZzYm = zzq9.zzYm();
        double dZzQa = zzq9.zzQa();
        float f2 = this.zzYMX;
        return com.aspose.words.internal.zzJ6.zzZ(new com.aspose.words.internal.zzQ9[]{zzq93, zzq94, new com.aspose.words.internal.zzQ9(dZzQb, dZzYm, (dZzQa + ((double) f2)) - ((double) (f2 / 28.0f))), (com.aspose.words.internal.zzQ9) zzq92.zzQc()}, f);
    }

    private void zzY(com.aspose.words.internal.zzQD zzqd, com.aspose.words.internal.zzQD zzqd2, com.aspose.words.internal.zzQG zzqg) {
        int i = 0;
        while (i < zzqd.getCount()) {
            int i2 = i < zzqd2.getCount() + (-1) ? i + 1 : 0;
            com.aspose.words.internal.zzQ9 zzq9 = (com.aspose.words.internal.zzQ9) zzqd2.zzYi(i).zzQc();
            com.aspose.words.internal.zzQ9 zzq92 = (com.aspose.words.internal.zzQ9) zzqd2.zzYi(i2).zzQc();
            zzq9.zz9(0.0d);
            zzq92.zz9(0.0d);
            com.aspose.words.internal.zzQ9[] zzq9Arr = {zzqd.zzYi(i), zzq9, zzq92, zzqd.zzYi(i2)};
            com.aspose.words.internal.zzQG[] zzqgArr = this.zzYMU;
            int i3 = this.zzYMV;
            this.zzYMV = i3 + 1;
            zzqgArr[i3] = zzZ(zzq9Arr, zzqg);
            com.aspose.words.internal.zzQ9[] zzq9Arr2 = {zzq9, zzqd2.zzYi(i), zzqd2.zzYi(i2), zzq92};
            com.aspose.words.internal.zzQG[] zzqgArr2 = this.zzYMU;
            int i4 = this.zzYMV;
            this.zzYMV = i4 + 1;
            zzqgArr2[i4] = zzZ(zzq9Arr2, zzqg);
            i++;
        }
    }

    private static com.aspose.words.internal.zzQ6 zzW(com.aspose.words.internal.zzQD zzqd) {
        com.aspose.words.internal.zzQ6 zzq6ZzX = new com.aspose.words.internal.zzQ6(zzqd.zzYi(0), zzqd.zzYi(3)).zzX(new com.aspose.words.internal.zzQ6(zzqd.zzYi(0), zzqd.zzYi(1)));
        zzq6ZzX.normalize();
        return zzq6ZzX;
    }

    private com.aspose.words.internal.zzQD zzZ(com.aspose.words.internal.zzQD zzqd, boolean z) {
        long[] jArr = new long[zzqd.getCount()];
        for (int i = 0; i < zzqd.getCount(); i++) {
            jArr[i] = com.aspose.words.internal.zzSA.zzZ(zzqd.zzYi(i));
        }
        long[] jArrZzW = zzW(jArr, z);
        if (jArrZzW == null) {
            return null;
        }
        return zzY(jArrZzW, zzZjW());
    }

    private static com.aspose.words.internal.zzQD zzY(long[] jArr, float f) {
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD(true);
        for (long j : jArr) {
            zzqd.zzZ(new com.aspose.words.internal.zzQ9(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j), f));
        }
        return zzqd;
    }

    private void zzZ(com.aspose.words.internal.zzQD zzqd, com.aspose.words.internal.zzQD zzqd2, com.aspose.words.internal.zzQG zzqg) {
        int count = zzqd.getCount();
        int i = 0;
        while (i < count) {
            int i2 = i < count + (-1) ? i + 1 : 0;
            com.aspose.words.internal.zzQ9[] zzq9Arr = {zzqd.zzYi(i), zzqd2.zzYi(i), zzqd2.zzYi(i2), zzqd.zzYi(i2)};
            com.aspose.words.internal.zzQG[] zzqgArr = this.zzYMU;
            int i3 = this.zzYMV;
            this.zzYMV = i3 + 1;
            zzqgArr[i3] = zzZ(zzq9Arr, zzqg);
            i++;
        }
    }

    private static com.aspose.words.internal.zzQG zzZ(com.aspose.words.internal.zzQ9[] zzq9Arr, com.aspose.words.internal.zzQG zzqg) {
        com.aspose.words.internal.zzQD zzqd = new com.aspose.words.internal.zzQD();
        zzqd.zzQp();
        zzqd.zzZ(zzq9Arr[0]);
        zzqd.zzZ(zzq9Arr[1]);
        zzqd.zzZ(zzq9Arr[2]);
        zzqd.zzZ(zzq9Arr[3]);
        com.aspose.words.internal.zzQG zzqg2 = new com.aspose.words.internal.zzQG(zzW(zzqd), 16, zzqg.getOrder(), (com.aspose.words.internal.zzOU) null, zzqg.zzZ1());
        zzqg2.zzZ(zzqd);
        return zzqg2;
    }

    private com.aspose.words.internal.zzQ9 zzY(com.aspose.words.internal.zzQ9 zzq9, float f, com.aspose.words.internal.zzQ9 zzq92) {
        com.aspose.words.internal.zzQ9 zzq93 = (com.aspose.words.internal.zzQ9) zzq9.zzQc();
        com.aspose.words.internal.zzQ9 zzq94 = new com.aspose.words.internal.zzQ9(zzq9.zzQb(), zzq9.zzYm(), zzq92.zzQa());
        com.aspose.words.internal.zzQ9 zzq95 = new com.aspose.words.internal.zzQ9((zzq92.zzQb() + zzq9.zzQb()) / 2.0d, (zzq92.zzYm() + zzq9.zzYm()) / 2.0d, 1.7d * ((double) this.zzYMX));
        com.aspose.words.internal.zzQ9 zzq96 = (com.aspose.words.internal.zzQ9) zzq95.zzQc();
        zzq96.zz9(zzq92.zzQa());
        return com.aspose.words.internal.zzJ6.zzZ(new com.aspose.words.internal.zzQ9[]{zzq93, zzq94, zzq95, zzq96, new com.aspose.words.internal.zzQ9(zzq92.zzQb(), zzq92.zzYm(), zzq92.zzQa())}, f);
    }

    private com.aspose.words.internal.zzQ9[] zzZ(com.aspose.words.internal.zzQD zzqd, com.aspose.words.internal.zzQD zzqd2, int i, float f, float f2) {
        com.aspose.words.internal.zzQ9 zzq9;
        com.aspose.words.internal.zzQ9 zzq92 = (com.aspose.words.internal.zzQ9) zzqd.zzYi(i).zzQc();
        if (i < zzqd.getCount() - 1) {
            zzq9 = (com.aspose.words.internal.zzQ9) zzqd.zzYi(i + 1).zzQc();
        } else {
            zzq9 = (com.aspose.words.internal.zzQ9) zzqd.zzYi(0).zzQc();
        }
        com.aspose.words.internal.zzQ9 zzq9ZzYi = zzqd2.zzYi(i);
        com.aspose.words.internal.zzQ9 zzq9ZzYi2 = i < zzqd.getCount() + (-1) ? zzqd2.zzYi(i + 1) : zzqd2.zzYi(0);
        return new com.aspose.words.internal.zzQ9[]{zzZ(zzq92, f, zzq9ZzYi), zzZ(zzq92, f2, zzq9ZzYi), zzZ(zzq9, f2, zzq9ZzYi2), zzZ(zzq9, f, zzq9ZzYi2)};
    }

    private com.aspose.words.internal.zzQ9 zzZ(com.aspose.words.internal.zzQ9 zzq9, float f, com.aspose.words.internal.zzQ9 zzq92) {
        com.aspose.words.internal.zzQ9 zzq93 = new com.aspose.words.internal.zzQ9();
        if (this.zzYMW == 1) {
            zzq93 = zzX(zzq9, f, zzq92);
        }
        return this.zzYMW == 0 ? zzY(zzq9, f, zzq92) : zzq93;
    }
}
