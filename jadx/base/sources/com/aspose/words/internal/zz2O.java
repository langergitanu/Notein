package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2O extends zz33 {
    zz2O zzgA;
    zz2O zzgB;
    zz2O zzgC;
    zz2O zzgD;
    zz2O zzgE;
    private boolean zzgF;
    private zz2P zzgG;
    private boolean zzmc;

    public zz2O(zz4W zz4w, zz2P zz2p, boolean z, boolean z2) {
        super(zz4w);
        this.zzgG = zz2p;
        this.zzmc = z;
        this.zzgF = z2;
    }

    private void zzA(zzFY zzfy) throws Exception {
        zz2P zz2p = this.zzgG;
        zzfy.zzC("/Title", (zz2p == null || !zzZYD.zzXk(zz2p.getTitle())) ? " " : this.zzgG.getTitle());
        zzfy.zzZ("/Parent", this.zzgE);
        zz2O zz2o = this.zzgD;
        if (zz2o != null) {
            zzfy.zzZ("/Prev", zz2o);
        }
        zz2O zz2o2 = this.zzgC;
        if (zz2o2 != null) {
            zzfy.zzZ("/Next", zz2o2);
        }
        zz2O zz2o3 = this.zzgB;
        if (zz2o3 != null) {
            zzfy.zzZ("/First", zz2o3);
        }
        zz2O zz2o4 = this.zzgA;
        if (zz2o4 != null) {
            zzfy.zzZ("/Last", zz2o4);
        }
        if (this.zzgB != null) {
            int iZztr = zztr();
            if (!this.zzmc) {
                iZztr = -iZztr;
            }
            zzfy.zzM("/Count", iZztr);
        }
        zz2P zz2p2 = this.zzgG;
        if (zz2p2 == null || zz2p2.zzts() == null) {
            return;
        }
        zzfy.zzYY("/Dest");
        this.zzgG.zzts().zzW(zzfy);
    }

    private void zzB(zzFY zzfy) throws Exception {
        zzfy.zzH("/Type", "/Outlines");
        zz2O zz2o = this.zzgB;
        if (zz2o != null) {
            zzfy.zzZ("/First", zz2o);
        }
        zz2O zz2o2 = this.zzgA;
        if (zz2o2 != null) {
            zzfy.zzZ("/Last", zz2o2);
        }
        if (this.zzgB != null) {
            zzfy.zzM("/Count", zztr());
        }
    }

    private int zztr() {
        int iZztr = 0;
        for (zz2O zz2o = this.zzgB; zz2o != null; zz2o = zz2o.zzgC) {
            iZztr++;
            if (zz2o.zzmc) {
                iZztr += zz2o.zztr();
            }
        }
        return iZztr;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        if (this.zzgF) {
            zzB(zzfy);
        } else {
            zzA(zzfy);
        }
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        for (zz2O zz2o = this.zzgB; zz2o != null; zz2o = zz2o.zzgC) {
            zz2o.zzY(zzfx);
        }
    }

    public final void zzZ(zz2O zz2o) {
        if (this.zzgB == null) {
            this.zzgB = zz2o;
        } else {
            zz2O zz2o2 = this.zzgA;
            zz2o2.zzgC = zz2o;
            zz2o.zzgD = zz2o2;
        }
        this.zzgA = zz2o;
        zz2o.zzgE = this;
    }
}
