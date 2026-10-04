package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzXV extends zzXX implements zzZOY {
    private zzZOW zzW5;

    public zzXV(zzZOP zzzop, boolean z) throws Exception {
        super(z);
        this.zzW5 = new zzZOW(zzzop);
    }

    private void zzC(boolean z) {
        this.zzVT = (byte) zzXU.zzZ(this.zzVT & 255, zzX1() & 255, z);
    }

    private void zzWY() throws Exception {
        this.zzW5.writeByte(this.zzVT);
        this.zzW5.flush();
    }

    private void zzZ(byte b, int i) throws Exception {
        if (i == 0) {
            return;
        }
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberOfBitsFromRight");
        }
        int i2 = 1 << (i - 1);
        for (int i3 = 0; i3 < i; i3++) {
            zzD(((b & 255) & i2) != 0);
            i2 >>= 1;
        }
    }

    @Override // com.aspose.words.internal.zzZOY
    public final void dispose() throws Exception {
        this.zzW5.close();
    }

    public final void flush() throws Exception {
        if (this.zzVS <= 0) {
            return;
        }
        zzWY();
    }

    public final void zzD(boolean z) throws Exception {
        zzC(z);
        int i = this.zzVS + 1;
        this.zzVS = i;
        if (i < 8) {
            return;
        }
        zzWY();
        zzX2();
    }

    public final void zzO(int i, int i2) throws Exception {
        if (i2 == 0) {
            return;
        }
        if (i2 < 0 || i2 > 31) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: numberOfBitsFromRight");
        }
        byte[] bytes = zzZQK.getBytes(i);
        int i3 = (i2 - 1) / 8;
        zzZ(bytes[i3], i2 - (i3 * 8));
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            zzZ(bytes[i4], 8);
        }
    }
}
