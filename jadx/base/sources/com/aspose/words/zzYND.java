package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYND {
    private byte[] zzXI0;
    private byte[] zzXI2;
    private int zzXI4;
    private int zzXI5;
    private int zzXI6;
    private int zzYG;
    private byte[][] zzXI3 = new byte[3][];
    private byte[][] zzXI1 = new byte[3][];

    public zzYND(int i, int i2, int i3, int i4) {
        this.zzYG = i;
        this.zzXI6 = i2;
        this.zzXI5 = i3;
        this.zzXI4 = i4;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final byte[] zzWq(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? new byte[0] : this.zzXI3[i2] : this.zzXI2 : this.zzXI0 : this.zzXI1[i2];
    }

    public final float zzYqA() {
        return this.zzXI4 / this.zzXI6;
    }

    public final float zzYqB() {
        return this.zzXI5 / this.zzXI6;
    }

    public final void zzZ(int i, int i2, byte[] bArr) {
        if (i == 0) {
            this.zzXI1[i2] = bArr;
            return;
        }
        if (i == 1) {
            this.zzXI0 = bArr;
        } else if (i == 2) {
            this.zzXI2 = bArr;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: borderType");
            }
            this.zzXI3[i2] = bArr;
        }
    }
}
