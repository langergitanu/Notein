package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUG {
    byte[] zzYL0;
    int zzYL1;
    byte[] zzYL2;
    byte[] zzYL3;
    int zzYL4;

    public zzZUG() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(16);
        zzzow.writeBytes(this.zzYL3);
        zzzow.writeBytes(this.zzYL2);
        zzzow.zzl(20);
        zzzow.writeBytes(this.zzYL0);
    }

    public zzZUG(com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        int iZzXc = zzzox.zzXc();
        this.zzYL4 = iZzXc;
        if (iZzXc != 16) {
            throw new IllegalStateException("Unexpected salt size.");
        }
        this.zzYL3 = zzzox.zzn(iZzXc);
        this.zzYL2 = zzzox.zzn(16);
        this.zzYL1 = zzzox.zzXc();
        this.zzYL0 = zzzox.zzn(z ? 32 : 20);
    }
}
