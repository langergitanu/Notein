package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzU0 extends zzU1 {

    public static class zzY {
        String zzRG;
        int[] zzRH;

        public zzY(String str, int[] iArr) {
            this.zzRG = str;
            this.zzRH = iArr;
        }
    }

    private static int zzY(zzUU zzuu, int[] iArr, byte[] bArr) {
        return new zzZ(iArr, bArr).zzZ(zzuu, (byte) 32);
    }

    public static int zzZ(zzUU zzuu, int[] iArr, byte[] bArr) {
        return zzY(zzuu, iArr, bArr);
    }

    public static class zzZ {
        private byte zzRI;
        private byte[] zzRL;
        private int[] zzRM;
        private int zzVQ = 0;
        private int zzRN = 0;
        private int zzRJ = 0;
        private int zzRK = 0;

        public zzZ(int[] iArr, byte[] bArr) {
            this.zzRM = iArr;
            this.zzRL = bArr;
        }

        private void zzX(zzUU zzuu) {
            while (true) {
                boolean z = false;
                while (true) {
                    int iZzY = zzY(zzuu);
                    if (iZzY < 0) {
                        return;
                    }
                    byte b = this.zzRL[iZzY];
                    if (b != 0) {
                        if (b != this.zzRI || !z) {
                            zzZ5(b & 255);
                        }
                        if (b == this.zzRI) {
                            z = true;
                        }
                    }
                }
            }
        }

        private static int zzY(int[] iArr, int i) {
            int i2 = iArr[32] > i ? 0 : 32;
            int i3 = i2 + 16;
            if (iArr[i3] <= i) {
                i2 = i3;
            }
            int i4 = i2 + 8;
            if (iArr[i4] <= i) {
                i2 = i4;
            }
            int i5 = i2 + 4;
            if (iArr[i5] <= i) {
                i2 = i5;
            }
            int i6 = i2 + 2;
            if (iArr[i6] <= i) {
                i2 = i6;
            }
            int i7 = i2 + 1;
            if (iArr[i7] <= i) {
                i2 = i7;
            }
            if (iArr[i2] > i) {
                i2--;
            }
            if (i2 < 0 || iArr[i2] != i) {
                return -1;
            }
            return i2;
        }

        private void zzZ5(int i) {
            int i2 = 16777215 & ((this.zzRN << 8) + (i & 255));
            this.zzRN = i2;
            zzZ6(i2);
        }

        private void zzZ6(int i) {
            this.zzRK++;
            if (zzY(this.zzRM, i) >= 0) {
                this.zzRJ++;
            }
        }

        public final int zzZ(zzUU zzuu, byte b) {
            this.zzRI = (byte) 32;
            zzX(zzuu);
            zzZ5(this.zzRI & 255);
            double d = ((double) this.zzRJ) / ((double) this.zzRK);
            if (d > 0.33d) {
                return 98;
            }
            return (int) (d * 300.0d);
        }

        private int zzY(zzUU zzuu) {
            if (this.zzVQ >= zzuu.zzUe()) {
                return -1;
            }
            byte[] bArrZzUg = zzuu.zzUg();
            int i = this.zzVQ;
            this.zzVQ = i + 1;
            return bArrZzUg[i] & 255;
        }
    }
}
