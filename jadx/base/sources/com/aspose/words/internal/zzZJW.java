package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJW {
    private zzZJU zzZMD;
    private zzZIO zzZME;
    private zzZIA zzZMF;
    private zzZIS zzZMG;
    private boolean zzZMH;

    private zzZJW(zzZIS zzzis, zzZIA zzzia) {
        this(zzzis, zzzia, null);
    }

    private static zzZIA zzP(int i, int i2, int i3, int i4) {
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = i5;
        }
        return new zzZIB(i, i3, i4, i2, i2, iArr);
    }

    private static zzZJW zzQ(int i, int i2, int i3, int i4) {
        return zzZ(i, i2, false, false, i3, i4);
    }

    public static zzZJW zzY(zzZJU zzzju) {
        zzZJW zzzjwZzZ = zzZ(zzzju.zzdL(), zzzju.zzWL(), zzzju.zzdT(), zzzju.zzdU(), zzzju.zzdD(), zzzju.zzdC(), zzzju.zzdK(), zzzju.getWidth(), zzzju.getHeight());
        zzzjwZzZ.zzZMD = zzzju;
        return zzzjwZzZ;
    }

    public final int getHeight() {
        return this.zzZMD.getHeight();
    }

    public final int getWidth() {
        return this.zzZMD.getWidth();
    }

    public final void zzZ(zzZJU zzzju) {
        this.zzZMD = zzzju;
    }

    public final zzZIA zze2() {
        return this.zzZMF;
    }

    public final zzZIS zze3() {
        return this.zzZMG;
    }

    public final zzZIO zze4() {
        return this.zzZME;
    }

    private zzZJW(zzZIS zzzis, zzZIA zzzia, zzZJU zzzju) {
        this.zzZMG = zzzis;
        this.zzZMF = zzzia;
        this.zzZME = zzzia.zzd0();
        this.zzZMH = this.zzZMG.hasAlpha();
        this.zzZMD = zzzju;
    }

    public static zzZJW zzZ(zzZIS zzzis, zzZIA zzzia, zzZJU zzzju) {
        return new zzZJW(zzzis, zzzia, zzzju);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    private static zzZJW zzZ(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i4, int i5) {
        boolean z;
        int i6;
        int i7;
        ?? r5;
        ?? r0;
        int iZzW;
        boolean z2;
        int i8;
        ?? r3;
        zzZIS zzzisZzZ;
        int i9;
        zzZIR zzzit;
        int i10;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        boolean z5 = false;
        z = false;
        boolean z6 = false;
        if (i3 == 1 && ((i10 = iArr[0]) == 1 || i10 == 2 || i10 == 4 || i10 == 8 || i10 == 16)) {
            if (cArr == null) {
                if (i10 <= 8) {
                    i = 0;
                } else if (iArr2[0] != 2) {
                    i = 1;
                }
                return zzQ(i10, i, i4, i5);
            }
            int i11 = 1 << i10;
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[i11];
            byte[] bArr3 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i12] = (byte) ((cArr[i12] * 255) / 65535);
                bArr2[i12] = (byte) ((cArr[i11 + i12] * 255) / 65535);
                bArr3[i12] = (byte) ((cArr[(i11 * 2) + i12] * 255) / 65535);
            }
            int i13 = iArr[0];
            return zzZ(i13 == 8 ? 0 : 1, i13, bArr, bArr2, bArr3, i4, i5);
        }
        if (i3 == 2 && iArr[0] == 8 && iArr[1] == 8) {
            return zzZ(8, 0, iArr3 != null && iArr3[0] == 1, i4, i5);
        }
        if (i3 == 2 && iArr[0] == 16 && iArr[1] == 16) {
            i = iArr2[0] != 2 ? 1 : 2;
            if (iArr3 != null && iArr3[0] == 1) {
                z4 = true;
            }
            return zzZ(16, i, z4, i4, i5);
        }
        zzZIR zzzirZzPE = zzZIR.zzPE(1000);
        if (i3 == 3 && iArr[0] == 8 && iArr[1] == 8 && iArr[2] == 8) {
            int[] iArr4 = {0, 1, 2};
            if ((i == 6 && i2 != 7 && i2 != 6) || i == 8) {
                zzzirZzPE = zzZIR.zzPE(1004);
            }
            return zzZ(zzzirZzPE, iArr4, 0, false, false, i4, i5);
        }
        if (i3 == 4 && iArr[0] == 8 && iArr[1] == 8 && iArr[2] == 8 && iArr[3] == 8) {
            int[] iArr5 = {0, 1, 2, 3};
            if (i == 5) {
                zzzirZzPE = zzZI9.zzcM();
                z = false;
            } else if (iArr3 == null || iArr3[0] != 1) {
                z = false;
                z5 = true;
            } else {
                z5 = true;
            }
            return zzZ(zzzirZzPE, iArr5, 0, z5, z, i4, i5);
        }
        if (i3 == 3 && iArr[0] == 16 && iArr[1] == 16 && iArr[2] == 16) {
            return zzZ(zzzirZzPE, new int[]{0, 1, 2}, iArr2[0] != 2 ? 1 : 2, false, false, i4, i5);
        }
        zzZIR zzzirZzPE2 = zzzirZzPE;
        if (i3 == 4 && iArr[0] == 16 && iArr[1] == 16 && iArr[2] == 16 && iArr[3] == 16) {
            int[] iArr6 = {0, 1, 2, 3};
            i = iArr2[0] != 2 ? 1 : 2;
            if (iArr3 != null && iArr3[0] == 1) {
                z6 = true;
            }
            return zzZ(zzzirZzPE2, iArr6, i, true, z6, i4, i5);
        }
        if (i == 5 && ((i9 = iArr[0]) == 1 || i9 == 2 || i9 == 4)) {
            if (i3 == 4) {
                zzzit = zzZI9.zzcM();
            } else {
                zzzit = new zzZIT(i3);
            }
            zzZIQ zzziq = new zzZIQ(zzzit, iArr, false, false, 1, 0);
            return new zzZJW(zzziq, zzziq.zzYR(i4, i5));
        }
        int i14 = 0;
        for (int i15 : iArr) {
            i14 += i15;
        }
        if ((i3 != 3 && i3 != 4) || (i14 != 8 && i14 != 16)) {
            if (iArr[0] % 8 == 0) {
                int i16 = 1;
                while (true) {
                    if (i16 < iArr.length) {
                        z2 = z3;
                        if (iArr[i16] != iArr[i16 - 1]) {
                            break;
                        }
                        i16++;
                        z3 = z2 ? 1 : 0;
                    } else {
                        z2 = z3;
                        int i17 = iArr[z2 ? 1 : 0];
                        if (i17 == 8) {
                            if (iArr2[z2 ? 1 : 0] != 3) {
                                i8 = z2 ? 1 : 0;
                                r3 = 1;
                            }
                            i8 = -1;
                            r3 = z2 ? 1 : 0;
                        } else if (i17 != 16) {
                            if (i17 == 32) {
                                i8 = iArr2[z2 ? 1 : 0] == 3 ? 4 : 3;
                                r3 = 1;
                            }
                            i8 = -1;
                            r3 = z2 ? 1 : 0;
                        } else {
                            int i18 = iArr2[z2 ? 1 : 0];
                            if (i18 != 3) {
                                i8 = i18 == 2 ? 2 : 1;
                                r3 = 1;
                            }
                            i8 = -1;
                            r3 = z2 ? 1 : 0;
                        }
                        if (r3 != 0) {
                            zzZIA zzziaZzP = zzP(i8, i3, 1, 1);
                            if (i3 > 0 && i3 <= 4 && (i8 == 3 || i8 == 4)) {
                                if (i3 <= 2) {
                                    zzzirZzPE2 = zzZIR.zzPE(1003);
                                }
                                boolean z7 = i3 % 2 == 0 ? true : z2 ? 1 : 0;
                                zzzisZzZ = zzZ(zzzirZzPE2, i3, i8, z7, (z7 && iArr3 != null && iArr3[z2 ? 1 : 0] == 1) ? true : z2 ? 1 : 0);
                            } else {
                                zzzisZzZ = zzZ(new zzZIT(i3), i3, i8, z2, z2);
                            }
                            return new zzZJW(zzzisZzZ, zzziaZzP.zzYR(i4, i5));
                        }
                    }
                }
                r5 = z2;
            } else {
                r5 = 0;
            }
            if (cArr != null || iArr2[r5] == 3) {
                return null;
            }
            int i19 = 0;
            for (int i20 : iArr) {
                if (i20 > i19) {
                    i19 = i20;
                }
            }
            boolean z8 = iArr2[0] == 2;
            if (i3 == 1) {
                return zzQ(i19, zzZIF.zzw(i19, z8), i4, i5);
            }
            if (i3 == 2) {
                return zzZ(i19, zzZIF.zzw(i19, z8), iArr3 != null && iArr3[0] == 1, i4, i5);
            }
            if (i3 != 3 && i3 != 4) {
                int iZzw = zzZIF.zzw(i19, z8);
                return new zzZJW(zzZ((zzZIR) new zzZIT(i3), i3, iZzw, false, false), zzP(iZzw, i3, i4, i5));
            }
            if (i14 > 32 || z8) {
                if (i3 == 3) {
                    return zzZ(zzzirZzPE2, new int[]{0, 1, 2}, zzZIF.zzw(i19, z8), false, false, i4, i5);
                }
                if (i3 == 4) {
                    return zzZ(zzzirZzPE2, new int[]{0, 1, 2, 3}, zzZIF.zzw(i19, z8), true, iArr3 != null && iArr3[0] == 1, i4, i5);
                }
                return null;
            }
            int iZzW2 = zzZIF.zzW(iArr, 0);
            int iZzW3 = zzZIF.zzW(iArr, 1);
            int iZzW4 = zzZIF.zzW(iArr, 2);
            if (i3 == 4) {
                r0 = 0;
                iZzW = zzZIF.zzW(iArr, 3);
            } else {
                r0 = 0;
                iZzW = 0;
            }
            return zzZ(zzzirZzPE2, iZzW2, iZzW3, iZzW4, iZzW, zzZIF.zzw(i14, r0), (boolean) ((iArr3 == null || iArr3[r0] != 1) ? r0 : 1), i4, i5);
        }
        int iZzW5 = zzZIF.zzW(iArr, 0);
        int iZzW6 = zzZIF.zzW(iArr, 1);
        int iZzW7 = zzZIF.zzW(iArr, 2);
        int iZzW8 = i3 == 4 ? zzZIF.zzW(iArr, 3) : 0;
        int i21 = i14 == 8 ? 0 : 1;
        if (iArr3 == null || iArr3[0] != 1) {
            z = false;
            i6 = iZzW5;
            i7 = iZzW7;
        } else {
            i6 = iZzW5;
            i7 = iZzW7;
            z = true;
        }
        return zzZ(zzzirZzPE2, i6, iZzW6, i7, iZzW8, i21, z, i4, i5);
    }

    private static zzZJW zzZ(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4) {
        zzZIA zzzid;
        if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 8 && i2 != 16) {
            throw new IllegalArgumentException("Bad value for bits!");
        }
        if (i != 0 && i != 2 && i != 1 && i != 3) {
            throw new IllegalArgumentException("Bad value for dataType!");
        }
        if ((i2 > 8 && i == 0) || (i2 > 16 && i != 3)) {
            throw new IllegalArgumentException("Too many bits for dataType!");
        }
        int i5 = 1 << i2;
        if (bArr.length == i5 && bArr2.length == i5 && bArr3.length == i5) {
            zzZIE zzzie = new zzZIE(i2, bArr.length, bArr, bArr2, bArr3);
            if ((i2 == 8 && i == 0) || (i2 == 16 && (i == 2 || i == 1))) {
                zzzid = new zzZIB(i, i3, i4, 1, i3, new int[]{0});
            } else {
                zzzid = new zzZID(i, i3, i4, i2);
            }
            zzZJW zzzjw = new zzZJW(zzzie, zzzid);
            zzzjw.zzZMH = false;
            return zzzjw;
        }
        throw new IllegalArgumentException("LUT has improper length!");
    }

    private static zzZJW zzZ(int i, int i2, boolean z, int i3, int i4) {
        return zzZ(i, i2, true, z, i3, i4);
    }

    public static zzZJW zzZ(zzZIR zzzir, int[] iArr, int i, boolean z, boolean z2, int i2, int i3) {
        if (zzzir != null) {
            if (iArr.length != zzzir.zzd4() + (z ? 1 : 0)) {
                throw new IllegalArgumentException("bandOffsets.length is wrong!");
            }
            if (i != 0 && i != 2 && i != 1 && i != 3 && i != 4 && i != 5) {
                throw new IllegalArgumentException("Bad value for dataType!");
            }
            zzZIS zzzisZzZ = zzZ(zzzir, iArr.length, i, z, z2);
            int iMax = iArr[0];
            int iMin = iMax;
            for (int i4 : iArr) {
                iMin = Math.min(i4, iMin);
                iMax = Math.max(i4, iMax);
            }
            int i5 = (iMax - iMin) + 1;
            return new zzZJW(zzzisZzZ, new zzZIB(i, i2, i3, i5, i2 * i5, iArr));
        }
        throw new IllegalArgumentException("colorSpace == null!");
    }

    private static zzZJW zzZ(zzZIR zzzir, int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7) {
        if (zzzir != null) {
            if (zzzir.getType() != 5) {
                throw new IllegalArgumentException("colorSpace is not of type TYPE_RGB!");
            }
            if (i5 != 0 && i5 != 1 && i5 != 3) {
                throw new IllegalArgumentException("Bad value for transferType!");
            }
            if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
                throw new IllegalArgumentException("No mask has at least 1 bit set!");
            }
            zzZIH zzzih = new zzZIH(zzzir, i, i2, i3, i4, z, i5);
            return new zzZJW(zzzih, zzzih.zzYR(i6, i7));
        }
        throw new IllegalArgumentException("colorSpace == null!");
    }

    private static zzZIS zzZ(zzZIR zzzir, int i, int i2, boolean z, boolean z2) {
        int i3 = z ? 3 : 1;
        if (i2 != 4 && i2 != 5) {
            int[] iArr = new int[i];
            int iZzPB = zzZIO.zzPB(i2);
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = iZzPB;
            }
            return new zzZIQ(zzzir, iArr, z, z2, i3, i2);
        }
        return new zzZIQ(zzzir, z, z2, i3, i2);
    }

    private static zzZJW zzZ(int i, int i2, boolean z, boolean z2, int i3, int i4) {
        zzZIA zzzid;
        zzZIS zzzis;
        if (i != 1 && i != 2 && i != 4 && i != 8 && i != 16) {
            throw new IllegalArgumentException("Bad value for bits!");
        }
        if (i2 != 0 && i2 != 2 && i2 != 1) {
            throw new IllegalArgumentException("Bad value for dataType!");
        }
        if (i > 8 && i2 == 0) {
            throw new IllegalArgumentException("Too many bits for dataType!");
        }
        zzZIR zzzirZzPE = zzZIR.zzPE(1003);
        if ((i == 8 && i2 == 0) || (i == 16 && (i2 == 2 || i2 == 1))) {
            int i5 = z ? 2 : 1;
            int i6 = z ? 3 : 1;
            int[] iArr = new int[i5];
            iArr[0] = i;
            if (i5 == 2) {
                iArr[1] = i;
            }
            zzZIQ zzziq = new zzZIQ(zzzirZzPE, iArr, z, z2, i6, i2);
            int[] iArr2 = new int[i5];
            iArr2[0] = 0;
            if (i5 == 2) {
                iArr2[1] = 1;
            }
            zzzid = new zzZIB(i2, i3, i4, i5, i3 * i5, iArr2);
            zzzis = zzziq;
        } else {
            int i7 = 1 << i;
            byte[] bArr = new byte[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                bArr[i8] = (byte) ((i8 * 255) / (i7 - 1));
            }
            zzZIE zzzie = new zzZIE(i, i7, bArr, bArr, bArr);
            zzzid = new zzZID(i2, i3, i4, i);
            zzzis = zzzie;
        }
        return new zzZJW(zzzis, zzzid);
    }
}
