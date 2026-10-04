package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVQ {
    private static final int zzZwT = 32;
    private byte[] zzTZ;
    private int zzZwS;
    private int zzZwU;
    private int zzp8;

    public zzVQ(byte[] bArr) {
        this.zzTZ = bArr;
    }

    private void zzNp(int i) {
        this.zzZwU <<= i;
        this.zzZwS -= i;
    }

    private int zzNq(int i) {
        zzNr(i);
        return (~((-1) << i)) & (this.zzZwU >> (zzZwT - i));
    }

    private void zzNr(int i) {
        while (this.zzZwS < i) {
            int iZzRI = zzRI() | (zzRI() << 8);
            int i2 = this.zzZwU;
            int i3 = zzZwT - 16;
            int i4 = this.zzZwS;
            this.zzZwU = (iZzRI << (i3 - i4)) | i2;
            this.zzZwS = i4 + 16;
        }
    }

    private int zzRI() {
        int i = this.zzp8;
        byte[] bArr = this.zzTZ;
        if (i >= bArr.length) {
            return 0;
        }
        int i2 = bArr[i] & 255;
        this.zzp8 = i + 1;
        return i2;
    }

    public final int zz1o() {
        return this.zzTZ.length - this.zzp8;
    }

    public final void zz1p() {
        if (this.zzZwS != 0) {
            throw new IllegalStateException("The bitstream is not aligned to a word boundary.");
        }
        this.zzp8++;
    }

    public final void zz1q() {
        int i = this.zzZwS;
        this.zzp8 -= (i / 16) * 2;
        zzNp(i);
    }

    public final void zzH(byte[] bArr, int i, int i2) {
        if (this.zzZwS != 0) {
            throw new IllegalStateException("The bitstream is not aligned to a word boundary.");
        }
        com.aspose.words.internal.zzZKV.zzZ(this.zzTZ, this.zzp8, bArr, i, i2);
        this.zzp8 += i2;
    }

    public final int zzNs(int i) {
        int iZzNq = zzNq(i);
        zzNp(i);
        return iZzNq;
    }

    public final int zzXc() {
        if (this.zzZwS != 0) {
            throw new IllegalStateException("The bitstream is not aligned to a word boundary.");
        }
        int iZzA = com.aspose.words.internal.zzZQK.zzA(this.zzTZ, this.zzp8);
        this.zzp8 += 4;
        return iZzA;
    }

    public final int zzZ(int[] iArr, byte[] bArr, int i, int i2) {
        int i3 = iArr[zzNq(i)];
        if (i3 < i2) {
            zzNp(bArr[i3] & 255);
            return i3;
        }
        zzNp(i);
        do {
            int iZzNs = (i3 * 2) + zzNs(1);
            if (iZzNs > iArr.length) {
                return -1;
            }
            i3 = iArr[iZzNs];
        } while (i3 >= i2);
        return i3;
    }
}
