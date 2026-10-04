package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZS4 implements zzZ8R {
    int zzYId;
    int zzYIe;

    public zzZS4() {
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) this.zzYIe);
        zzzow.zzJ((short) this.zzYId);
    }

    public zzZS4(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYIe = zzzox.zzX9() & 65535;
        this.zzYId = zzzox.zzX9() & 65535;
    }
}
