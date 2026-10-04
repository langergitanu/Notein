package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSO extends zzZTQ {
    private byte[] zzTZ;

    public zzZSO(int i, int i2) {
        super(i, i2);
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzTZ = zzzox.zzn(zzZiF());
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeBytes(this.zzTZ);
    }

    public final byte[] zzZi2() {
        return this.zzTZ;
    }

    public zzZSO(byte[] bArr) {
        super(780, bArr.length);
        this.zzTZ = bArr;
    }
}
