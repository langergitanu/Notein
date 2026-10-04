package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZO8 {
    private int zzL4;
    private zzYLM zzYzn;
    private zzYLL zzYzo;

    public zzZO8(int i) {
        this.zzL4 = i;
        this.zzYzo = new zzYLL();
        this.zzYzn = new zzYLM();
    }

    public final void zzBY(int i) {
        this.zzYzn.zzX(i, null);
    }

    public final zzZO9 zzBZ(int i) {
        int iZzTh = this.zzYzo.zzTh(i);
        if (iZzTh < 0) {
            return null;
        }
        return new zzZO9(this.zzYzn.zzTe(iZzTh), this.zzYzn.zzTe(iZzTh + 1), this.zzYzo.get(iZzTh).zzYvb);
    }

    public final void zzZ(zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzZRG zzzrg = new zzZRG((int) zzzow.zzq().getPosition(), this.zzYzo.zzV(zzzow));
        zzZRG zzzrg2 = new zzZRG((int) zzzow.zzq().getPosition(), this.zzYzn.zzV(zzzow));
        int i = this.zzL4;
        if (i == 0) {
            zzYJ2 zzyj2 = zzzra.zzYGE;
            zzyj2.zzXAD = zzzrg;
            zzyj2.zzXAC = zzzrg2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            zzYJ2 zzyj22 = zzzra.zzYGE;
            zzyj22.zzXzV = zzzrg;
            zzyj22.zzXzU = zzzrg2;
        }
    }

    public final zzYLM zzZ9P() {
        return this.zzYzn;
    }

    public final zzYLL zzZ9Q() {
        return this.zzYzo;
    }

    public final void zzZX(int i, boolean z) {
        zzZLR zzzlr = new zzZLR();
        zzzlr.zzYvb = z;
        this.zzYzo.zzX(i, zzzlr);
    }

    public zzZO8(int i, zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this(i);
        boolean z = i == 0;
        zzYLL zzyll = this.zzYzo;
        zzYJ2 zzyj2 = zzzra.zzYGE;
        zzyll.zzZ(zzzox, z ? zzyj2.zzXAD : zzyj2.zzXzV);
        this.zzYzn.zzZ(zzzox, z ? zzzra.zzYGE.zzXAC : zzzra.zzYGE.zzXzU);
    }
}
