package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTB extends zzZTQ {
    private static com.aspose.words.internal.zzZOZ zzYJM = new com.aspose.words.internal.zzZOZ("{937c1a34-151d-4610-9ca6-a8cc9bdb5d83}");
    private byte[] zzYJN;

    public zzZTB(int i, int i2) {
        super(i, i2);
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        com.aspose.words.internal.zzZOZ.zzZ(new com.aspose.words.internal.zzZOZ(zzzox.zzn(16)), zzYJM);
        this.zzYJN = zzzox.zzn(zzzox.zzXc());
    }

    @Override // com.aspose.words.zzZTQ
    public final void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeBytes(zzYJM.toByteArray());
        zzzow.zzl(this.zzYJN.length);
        zzzow.writeBytes(this.zzYJN);
    }

    public final byte[] zzZik() {
        return this.zzYJN;
    }

    public zzZTB(byte[] bArr) {
        super(1792, bArr.length + 20);
        this.zzYJN = bArr;
    }
}
