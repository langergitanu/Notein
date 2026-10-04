package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIN extends zzZIO {
    byte[] data;
    byte[][] zzZIM;

    public zzZIN(int i) {
        super(0, i);
        byte[] bArr = new byte[i];
        this.data = bArr;
        this.zzZIM = new byte[][]{bArr};
    }

    public final byte[] getData() {
        return this.data;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return this.data[i + this.offset] & 255;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return this.zzZIM[i][i2 + this.zzZIN[i]] & 255;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIM[i][i2 + this.zzZIN[i]] = (byte) i3;
    }

    public zzZIN(int i, int i2) {
        super(0, i, i2);
        this.zzZIM = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIM[i3] = new byte[i];
        }
        this.data = this.zzZIM[0];
    }
}
