package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzGL extends zzGK implements zzZCR {
    private ChartAxis zzZfW;
    private ChartAxis zzZfX;

    public void zzR(ChartAxis chartAxis) {
        this.zzZfW = chartAxis;
    }

    public void zzS(ChartAxis chartAxis) {
        this.zzZfX = chartAxis;
    }

    public ChartAxis zzZPs() {
        if (this.zzZfW == null) {
            this.zzZfW = zz45().zzKE(zzZPu());
        }
        return this.zzZfW;
    }

    public ChartAxis zzZPt() {
        if (this.zzZfX == null) {
            this.zzZfX = zz45().zzY5(zzZPu(), zzZPv());
        }
        return this.zzZfX;
    }

    public final int zzZPu() {
        return ((Integer) zzZPg().zzLv(1)).intValue();
    }

    public final int zzZPv() {
        return ((Integer) zzZPg().zzLv(0)).intValue();
    }
}
