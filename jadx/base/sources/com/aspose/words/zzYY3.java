package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY3 {
    private ArrayList<zzYY1> zzXXT;
    private int[] zzXXU;
    private int[] zzXXV;
    private zzYY2[] zzXXW;

    public zzYY3(zzYY2[] zzyy2Arr, int[] iArr, int[] iArr2, ArrayList<zzYY1> arrayList) {
        this.zzXXW = zzyy2Arr;
        this.zzXXV = iArr;
        this.zzXXU = iArr2;
        this.zzXXT = arrayList;
    }

    private static long zzp(byte[] bArr, int i) {
        int iMin = Math.min(8, bArr.length - i);
        long j = 0;
        for (int i2 = i; i2 < i + iMin; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j << ((8 - iMin) * 8);
    }

    public final void zzZ(byte[] bArr, int i, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        long j;
        long j2;
        int i2 = i * 8;
        long jZzp = zzp(bArr, 0);
        int i3 = 4;
        int i4 = 32;
        while (true) {
            if (i4 <= 0) {
                jZzp = zzp(bArr, i3);
                i3 += 4;
                i4 += 32;
            }
            int i5 = (int) (jZzp >> i4);
            zzYY2 zzyy2 = this.zzXXW[(int) (((long) (i5 >>> 24)) & 4294967295L)];
            int iZzYCB = zzyy2.zzYCB();
            int i6 = i5 >>> (32 - iZzYCB);
            int iZzYCA = zzyy2.zzYCA();
            if (zzyy2.isTerminated()) {
                j = jZzp;
                j2 = 4294967295L;
            } else {
                int i7 = this.zzXXV[iZzYCB];
                j2 = 4294967295L;
                while (true) {
                    j = jZzp;
                    if ((((long) i6) & 4294967295L) >= (((long) i7) & 4294967295L)) {
                        break;
                    }
                    iZzYCB++;
                    i6 = i5 >>> (32 - iZzYCB);
                    i7 = this.zzXXV[iZzYCB];
                    jZzp = j;
                }
                iZzYCA = this.zzXXU[iZzYCB];
            }
            i4 -= iZzYCB;
            i2 -= iZzYCB;
            if (i2 < 0) {
                return;
            }
            int i8 = (int) ((((long) iZzYCA) & j2) - (((long) i6) & j2));
            zzYY1 zzyy1 = this.zzXXT.get(i8);
            if (zzyy1.zz1z()) {
                this.zzXXT.set(i8, null);
                com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
                try {
                    zzZ(zzyy1.getBytes(), zzyy1.getBytes().length, zzzor2);
                    zzyy1 = new zzYY1(zzzor2.zzWy(), false);
                    this.zzXXT.set(i8, zzyy1);
                } finally {
                    zzzor2.close();
                }
            }
            zzzor.write(zzyy1.getBytes(), 0, zzyy1.getBytes().length);
            jZzp = j;
        }
    }
}
