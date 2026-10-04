package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTP extends zzYOE {
    private byte[] zzTZ;

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0003OCXDATA";
    }

    public final void setData(byte[] bArr) {
        this.zzTZ = bArr;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeBytes(this.zzTZ);
    }
}
