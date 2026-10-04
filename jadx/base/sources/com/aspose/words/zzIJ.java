package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIJ extends zzIL {
    private int zzTn;

    public zzIJ(long j, int i, int i2, float f, int i3) {
        super(j, i, i2, f);
        this.zzTn = i3;
    }

    @Override // com.aspose.words.zzIL
    public final void zzZ(zzIE zzie) {
        if (zzZRE().zzZRx().zzZA().size() >= this.zzTn) {
            zzZRE().zzZRz();
        }
        if (zzZRE().zzX(zzie)) {
            return;
        }
        zzZ(zzZRE().zzZy(zzZRE().zzV(zzie)));
        zzZRE().zzX(zzie);
    }
}
