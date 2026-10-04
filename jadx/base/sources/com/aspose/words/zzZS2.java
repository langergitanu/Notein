package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZS2 implements zzZ8R {
    int zzYIb;
    int zzYIc;

    public zzZS2() {
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) this.zzYIb);
        zzzow.zzK((short) this.zzYIc);
    }

    public zzZS2(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYIb = zzzox.zzX9() & 65535;
        this.zzYIc = zzzox.zzXa();
    }
}
