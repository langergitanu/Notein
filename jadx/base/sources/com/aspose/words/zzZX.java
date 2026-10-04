package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX implements zzZ8R {
    int zzZFc;
    int zzZFd;
    com.aspose.words.internal.zzZQ9 zzZFe = com.aspose.words.internal.zzZQ9.zz35;
    int zzZFf;
    int zzZFg;
    String zzZFh;

    public zzZX() {
    }

    public final void zzV(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZFe = zzKE.zzM4(zzzox.zzXc());
        zzzox.zzXa();
        this.zzZFc = zzzox.zzXc();
        this.zzZFd = zzzox.zzXc();
        zzzox.zzXc();
    }

    public final void zzX(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzKE.zzZ(this.zzZFe, zzzow);
        zzzow.zzK((short) 0);
        zzzow.zzl(this.zzZFc);
        zzzow.zzl(this.zzZFd);
        zzzow.zzl(0);
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZZQ.zzZ(this.zzZFh, zzzow, 20);
        zzzow.zzK((short) this.zzZFg);
        zzzow.zzK((short) 0);
        zzzow.zzK((short) 0);
        zzzow.zzl(this.zzZFf);
    }

    public zzZX(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZFh = zzZZR.zzS(zzzox, 20);
        this.zzZFg = zzzox.zzXa();
        zzzox.zzXa();
        zzzox.zzXa();
        this.zzZFf = zzzox.zzXc();
    }
}
