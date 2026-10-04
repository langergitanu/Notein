package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXY {

    public static class zzZ {
        private byte[] zzTZ = new byte[4096];
        private int zzZF;

        public final int getCount() {
            return this.zzZF;
        }

        public final void writeByte(byte b) {
            int i = this.zzZF;
            byte[] bArr = this.zzTZ;
            if (i < bArr.length) {
                bArr[i] = b;
                this.zzZF = i + 1;
            }
        }

        public final void zzH(com.aspose.words.internal.zzZOR zzzor) throws Exception {
            zzzor.write(this.zzTZ, 0, this.zzZF);
        }

        public final void zzT(byte[] bArr, int i, int i2, int i3) {
            int iMin = Math.min(Math.max(i2, 0), i - 1);
            int iMin2 = Math.min(i3, i - iMin);
            for (int i4 = 0; i4 < iMin2; i4++) {
                writeByte(bArr[iMin + i4]);
            }
        }

        public final void zzWD(int i, int i2) {
            byte[] bArr = this.zzTZ;
            zzT(bArr, bArr.length, i, i2);
        }
    }

    public static void zzZ(byte[] bArr, int i, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        int i2 = 0;
        int iMin = Math.min(Math.max(i, 0), bArr.length);
        if (iMin == 0) {
            return;
        }
        zzZ zzz = new zzZ();
        while (i2 < iMin) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            if (b == 0) {
                zzz.writeByte(b);
            } else {
                int i4 = b & 255;
                if (i4 <= 8) {
                    zzz.zzT(bArr, iMin, i3, i4);
                    i2 = i3 + i4;
                } else if (i4 <= 127) {
                    zzz.writeByte(b);
                } else if (i4 <= 191) {
                    int i5 = b & 63;
                    if (i3 < iMin) {
                        i2 += 2;
                        int i6 = (bArr[i3] & 255) | (i5 << 8);
                        zzz.zzWD(zzz.getCount() - ((i6 & 16376) >> 3), (i6 & 7) + 3);
                    }
                } else {
                    zzz.writeByte((byte) 32);
                    zzz.writeByte((byte) (i4 ^ 128));
                }
            }
            i2 = i3;
        }
        zzz.zzH(zzzor);
    }
}
