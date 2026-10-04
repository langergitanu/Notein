package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZ {
    private int mLength;
    private int zzZDR;
    private int zzZEl;
    private int zzZEr;

    public zzYZ(int i, int i2, int i3, int i4) {
        this.zzZEr = i;
        this.zzZDR = i2;
        this.zzZEl = i3;
        this.mLength = i4;
    }

    public final int getStartPosition() {
        return this.zzZEl;
    }

    public final byte[] zzYF(byte[] bArr) {
        int i = this.mLength;
        byte[] bArr2 = new byte[i];
        com.aspose.words.internal.zzZKV.zzZ(bArr, this.zzZEl, bArr2, 0, i);
        return bArr2;
    }

    public final void zzZ(com.aspose.words.internal.zzXE zzxe, byte[] bArr, zzZA zzza) {
        int iZzaN = zzza.zzaN();
        int i = this.zzZEl;
        zzza.zzZ(zzxe, bArr, iZzaN - i, i + this.mLength);
    }

    public final int zzaM() {
        return this.zzZDR;
    }

    public final int zzaP() {
        return this.zzZEr;
    }

    public final String zzZ(com.aspose.words.internal.zzXE zzxe, zzYYH zzyyh) {
        return zzyyh.zzZ(zzxe, this.zzZEr);
    }
}
