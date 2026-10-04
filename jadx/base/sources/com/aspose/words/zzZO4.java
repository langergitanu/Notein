package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO4 {
    private zzYLI zzYzi;
    private zzYLH zzYzj;
    private zzYLJ zzYzk;
    private int zzYzl;

    public zzZO4(int i) {
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("subDocType");
        }
        this.zzYzl = i;
        this.zzYzk = new zzYLJ();
        this.zzYzj = new zzYLH();
        this.zzYzi = new zzYLI();
    }

    public final zzZO1 zzBW(int i) {
        for (int i2 = 0; i2 < this.zzYzj.getItemCount(); i2++) {
            zzY4U zzy4u = this.zzYzj.get(i2);
            if (zzy4u.zzX20 == i) {
                return new zzZO1(this.zzYzj.zzTe(i2), this.zzYzj.zzTe(i2 + 1), zzy4u);
            }
        }
        return null;
    }

    public final zzZLQ zzBX(int i) {
        int iZzTh = this.zzYzk.zzTh(i);
        if (iZzTh >= 0) {
            return this.zzYzk.get(iZzTh);
        }
        return null;
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZRG zzzrg = new zzZRG((int) zzzow.zzq().getPosition(), this.zzYzk.zzV(zzzow));
        zzZRG zzzrg2 = new zzZRG((int) zzzow.zzq().getPosition(), this.zzYzj.zzV(zzzow));
        zzZRG zzzrg3 = new zzZRG((int) zzzow.zzq().getPosition(), this.zzYzi.zzV(zzzow));
        if (this.zzYzl == 0) {
            zzYJ2 zzyj2 = zzzra.zzYGE;
            zzyj2.zzXA1 = zzzrg;
            zzyj2.zzXzL = zzzrg2;
            zzyj2.zzXzs = zzzrg3;
            return;
        }
        zzYJ2 zzyj22 = zzzra.zzYGE;
        zzyj22.zzXA0 = zzzrg;
        zzyj22.zzXzJ = zzzrg2;
        zzyj22.zzXzr = zzzrg3;
    }

    public final zzYLI zzZ9L() {
        return this.zzYzi;
    }

    public final zzYLH zzZ9M() {
        return this.zzYzj;
    }

    public final zzYLJ zzZ9N() {
        return this.zzYzk;
    }

    public zzZO4(int i, zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this(i);
        boolean z = this.zzYzl == 0;
        zzYJ2 zzyj2 = zzzra.zzYGE;
        this.zzYzk.zzZ(zzzox, z ? zzyj2.zzXA1 : zzyj2.zzXA0);
        zzYJ2 zzyj22 = zzzra.zzYGE;
        this.zzYzj.zzZ(zzzox, z ? zzyj22.zzXzL : zzyj22.zzXzJ);
        this.zzYzi.zzZ(zzzox, z ? zzzra.zzYGE.zzXzs : zzzra.zzYGE.zzXzr);
    }
}
