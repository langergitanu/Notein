package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzYM implements zzHO {
    private zzHL zzXC;
    private ArrayList<zzHK> zzXk;
    private zzFD zzXr;
    private ArrayList<zzYO> zzXz = new ArrayList<>();

    public zzYM(zzFD zzfd, zzHL zzhl) {
        this.zzXr = zzfd;
        this.zzXC = zzhl;
    }

    private int zzE(int i) {
        if (i == this.zzXz.size() - 1 && this.zzXr.zzMe().getAlignment() == 3) {
            return 0;
        }
        return this.zzXr.zzMe().getAlignment();
    }

    private double zzF(int i) {
        return i != 0 ? this.zzXr.zzMe().getLeftMargin() : this.zzXr.zzMe().getLeftMargin() + 0.0d;
    }

    public final void zzQ(double d) throws Exception {
        this.zzXk = new zzYE(this.zzXC).zzZ(this.zzXr);
        this.zzXz = this.zzXC.zzMm().zzZ(this.zzXk, new zzBU(this.zzXr.zzMe(), d), this.zzXr);
    }

    @Override // com.aspose.words.internal.zzHO
    public final zzFD zzYd() {
        return this.zzXr;
    }

    public final zzZL zzYp() throws Exception {
        zzG zzg = new zzG();
        for (zzYO zzyo : this.zzXz) {
            if (zzyo.isVisible()) {
                zzg.zzX(zzyo.zzYp());
            }
        }
        return zzg;
    }

    @Override // com.aspose.words.internal.zzHO
    public final void zzZ(zzHJ zzhj) {
        for (int i = 0; i < this.zzXz.size(); i++) {
            zzhj.zzZ(this.zzXz.get(i), this.zzXr.zzMe().zzMd(), zzF(i), this.zzXr.zzMe().getRightMargin(), zzE(i));
        }
    }
}
