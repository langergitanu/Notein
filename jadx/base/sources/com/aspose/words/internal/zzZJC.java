package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJC {
    zzZOP zzZKe;
    boolean zzZKa = false;
    byte[] zzZKd = new byte[256];
    int zzZKc = 0;
    int zzZKb = 8;

    public zzZJC(zzZOP zzzop, boolean z) {
        this.zzZKe = zzzop;
    }

    public final void flush() throws Exception {
        int i = this.zzZKc + (this.zzZKb == 8 ? 0 : 1);
        if (i > 0) {
            if (this.zzZKa) {
                this.zzZKe.writeByte((byte) i);
            }
            this.zzZKe.write(this.zzZKd, 0, i);
            this.zzZKd[0] = 0;
            this.zzZKc = 0;
            this.zzZKb = 8;
        }
    }

    public final void zzYS(int i, int i2) throws Exception {
        do {
            int i3 = this.zzZKc;
            if ((i3 == 254 && this.zzZKb == 0) || i3 > 254) {
                if (this.zzZKa) {
                    this.zzZKe.writeByte((byte) -1);
                }
                this.zzZKe.write(this.zzZKd, 0, 255);
                this.zzZKd[0] = 0;
                this.zzZKc = 0;
                this.zzZKb = 8;
            }
            int i4 = this.zzZKb;
            if (i2 <= i4) {
                if (this.zzZKa) {
                    byte[] bArr = this.zzZKd;
                    int i5 = this.zzZKc;
                    bArr[i5] = (byte) (((i & ((1 << i2) - 1)) << (8 - i4)) | bArr[i5]);
                    this.zzZKb = i4 - i2;
                } else {
                    byte[] bArr2 = this.zzZKd;
                    int i6 = this.zzZKc;
                    bArr2[i6] = (byte) (((i & ((1 << i2) - 1)) << (i4 - i2)) | bArr2[i6]);
                    this.zzZKb = i4 - i2;
                }
                i2 = 0;
            } else if (this.zzZKa) {
                byte[] bArr3 = this.zzZKd;
                int i7 = this.zzZKc;
                bArr3[i7] = (byte) (bArr3[i7] | ((((1 << i4) - 1) & i) << (8 - i4)));
                i >>= i4;
                i2 -= i4;
                int i8 = i7 + 1;
                this.zzZKc = i8;
                bArr3[i8] = 0;
                this.zzZKb = 8;
            } else {
                byte[] bArr4 = this.zzZKd;
                int i9 = this.zzZKc;
                bArr4[i9] = (byte) (((i >>> (i2 - i4)) & ((1 << i4) - 1)) | bArr4[i9]);
                i2 -= i4;
                int i10 = i9 + 1;
                this.zzZKc = i10;
                bArr4[i10] = 0;
                this.zzZKb = 8;
            }
        } while (i2 != 0);
    }
}
