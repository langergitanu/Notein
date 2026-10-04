package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZA {
    private int mLength;
    private int zzZEj;
    private int zzZEl;
    private int zzZEr;

    public zzZA(int i, int i2, int i3, int i4) {
        this.zzZEj = i;
        this.zzZEr = i2;
        this.zzZEl = i3;
        this.mLength = i4;
    }

    private byte[] zzy(byte[] bArr, int i) {
        int i2 = this.mLength;
        byte[] bArr2 = new byte[i2];
        com.aspose.words.internal.zzZKV.zzZ(bArr, i + this.zzZEl, bArr2, 0, i2);
        return bArr2;
    }

    public final void zzZ(com.aspose.words.internal.zzXE zzxe, byte[] bArr, int i, int i2) {
        zzxe.zzZ(i, zzy(bArr, i2));
    }

    public final int zzaN() {
        return this.zzZEj;
    }

    public final int zzaP() {
        return this.zzZEr;
    }
}
