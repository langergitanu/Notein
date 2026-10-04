package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYP {
    private double zzXA;
    private double zzXB;
    private double zzXw;
    private double zzXx;
    private double zzXy;
    private ArrayList<zzHQ> zzXz = new ArrayList<>();

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final void zzV(double d) {
        this.zzXw = d;
    }

    public final void zzW(double d) {
        this.zzXx = d;
    }

    public final void zzX(double d) {
        double d2 = d - this.zzXw;
        this.zzXw = d;
        for (zzHQ zzhq : this.zzXz) {
            zzhq.zzV(zzhq.zzYm() + d2);
        }
    }

    public final boolean zzY(zzHQ zzhq, zzGJ zzgj) {
        return this.zzXz.size() == 0 || zzgj.zzZ(zzhq.zzYn()).getHeight() + this.zzXB <= this.zzXA;
    }

    public final double zzYr() {
        return this.zzXB;
    }

    public final void zzZ(zzHQ zzhq, zzGJ zzgj) {
        zzF5 zzf5ZzZ = zzgj.zzZ(zzhq.zzYn());
        zzhq.zzV(zzf5ZzZ.zzY9() + this.zzXw + this.zzXB);
        this.zzXB = zzf5ZzZ.getLineSpacing() + this.zzXB;
        zzZQG.zzZ(this.zzXz, zzhq);
    }

    public final void zzY(double d) {
        this.zzXB += d;
    }

    public final void zzZ(double d) {
        this.zzXB += d;
    }
}
