package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
final class zzES {
    private int[][] zzwE;
    private int[] zzwF;
    private int zzwG;
    private static zzZYV<zzZ> zzwD = new zzZYV<>();
    private static Object zzwC = new Object();

    public static class zzY {
        private int[] zzww;
        private int[] zzwx;
        private int[] zzwy;
        private int[] zzwz;

        public zzY(int i) {
            this.zzwz = new int[i];
            this.zzwy = new int[i];
            this.zzwx = new int[i];
            this.zzww = new int[i];
        }

        public final int[] zzE0() {
            return this.zzww;
        }

        public final int[] zzE1() {
            return this.zzwx;
        }

        public final int[] zzE2() {
            return this.zzwy;
        }

        public final int[] zzE3() {
            return this.zzwz;
        }
    }

    public static class zzZ {
        int[][] zzwA;
        int[] zzwB;

        public zzZ(int[] iArr, int[][] iArr2) {
            this.zzwB = iArr;
            this.zzwA = iArr2;
        }
    }

    public zzES(int i) {
        init(i);
    }

    private void init(int i) {
        int iMin = Math.min(Math.max(1, i), StyleIdentifier.LIGHT_GRID_ACCENT_6);
        this.zzwG = iMin;
        zzZ zzzZzVZ = zzVZ(iMin);
        if (zzzZzVZ != null) {
            this.zzwF = zzzZzVZ.zzwB;
            this.zzwE = zzzZzVZ.zzwA;
            return;
        }
        int i2 = (iMin * 2) + 1;
        this.zzwF = new int[i2];
        this.zzwE = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, 256);
        for (int i3 = 1; i3 < iMin; i3++) {
            int i4 = iMin - i3;
            int i5 = iMin + i3;
            int[] iArr = this.zzwF;
            int i6 = i4 * i4;
            iArr[i5] = i6;
            iArr[i4] = i6;
            for (int i7 = 0; i7 < 256; i7++) {
                int[][] iArr2 = this.zzwE;
                int[] iArr3 = iArr2[i5];
                int i8 = this.zzwF[i4] * i7;
                iArr3[i7] = i8;
                iArr2[i4][i7] = i8;
            }
        }
        this.zzwF[iMin] = iMin * iMin;
        for (int i9 = 0; i9 < 256; i9++) {
            this.zzwE[iMin][i9] = this.zzwF[iMin] * i9;
        }
        zzZ(iMin, new zzZ(this.zzwF, this.zzwE));
    }

    private static zzZ zzVZ(int i) {
        zzZ zzz;
        synchronized (zzwC) {
            zzz = zzwD.get(i);
        }
        return zzz;
    }

    private void zzY(zzXN zzxn, zzY zzy) {
        zzXQ zzxqZzWz = zzxn.zzWz();
        for (int i = 0; i < zzxn.getHeight(); i++) {
            int i2 = i - this.zzwG;
            int width = zzxn.getWidth() * i2;
            for (int i3 = 0; i3 < zzxn.getWidth(); i3++) {
                int width2 = width + i3;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = i2;
                for (int i10 = 0; i10 < this.zzwF.length; i10++) {
                    if (i9 >= 0 && i9 < zzxn.getHeight()) {
                        i8 += this.zzwE[i10][zzy.zzE3()[width2]];
                        i7 += this.zzwE[i10][zzy.zzE2()[width2]];
                        i6 += this.zzwE[i10][zzy.zzE1()[width2]];
                        i4 += this.zzwE[i10][zzy.zzE0()[width2]];
                        i5 += this.zzwF[i10];
                    }
                    width2 += zzxn.getWidth();
                    i9++;
                }
                zzxqZzWz.zzY((zzxn.getWidth() * i) + i3, (byte) (i4 / i5), (byte) (i6 / i5), (byte) (i7 / i5), (byte) (i8 / i5));
            }
        }
        zzxqZzWz.zzWQ();
    }

    private static void zzZ(zzXN zzxn, zzY zzy) {
        int i = 0;
        for (int i2 = 0; i2 < zzxn.getHeight(); i2++) {
            for (int i3 = 0; i3 < zzxn.getWidth(); i3++) {
                zzPV zzpv = new zzPV(zzxn.getPixel(i3, i2));
                zzy.zzE3()[i] = zzpv.zzPA();
                zzy.zzE2()[i] = zzpv.zzPB();
                zzy.zzE1()[i] = zzpv.zzPC();
                zzy.zzE0()[i] = zzpv.zzPD();
                i++;
            }
        }
    }

    public final void zzX(zzXN zzxn) {
        int height = zzxn.getHeight() * zzxn.getWidth();
        zzY zzy = new zzY(height);
        zzZ(zzxn, zzy);
        zzY zzy2 = new zzY(height);
        zzZ(zzxn, zzy, zzy2);
        zzY(zzxn, zzy2);
    }

    private void zzZ(zzXN zzxn, zzY zzy, zzY zzy2) {
        int i = 0;
        int width = 0;
        for (int i2 = 0; i2 < zzxn.getHeight(); i2++) {
            for (int i3 = 0; i3 < zzxn.getWidth(); i3++) {
                int i4 = i - this.zzwG;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < this.zzwF.length; i10++) {
                    if (i4 >= width && i4 < zzxn.getWidth() + width) {
                        i5 += this.zzwE[i10][zzy.zzE3()[i4]];
                        i7 += this.zzwE[i10][zzy.zzE2()[i4]];
                        i8 += this.zzwE[i10][zzy.zzE1()[i4]];
                        i9 += this.zzwE[i10][zzy.zzE0()[i4]];
                        i6 += this.zzwF[i10];
                    }
                    i4++;
                }
                zzy2.zzE3()[i] = i5 / i6;
                zzy2.zzE2()[i] = i7 / i6;
                zzy2.zzE1()[i] = i8 / i6;
                zzy2.zzE0()[i] = i9 / i6;
                i++;
            }
            width += zzxn.getWidth();
        }
    }

    private static void zzZ(int i, zzZ zzz) {
        synchronized (zzwC) {
            try {
                if (!zzwD.zzVE(i)) {
                    zzwD.set(i, zzz);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
