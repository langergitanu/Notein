package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEY extends zz80 implements zzZCO, Cloneable {
    private zzC9 zzZcB;
    private zzCU zzZcC;
    private zzCW zzZcD;
    private boolean zzZcE;
    private boolean zzZcF;
    private zzE1 zzZcG;
    private ChartLegend zzZcH;
    private zzCW zzZcI;
    private int zzZcJ = 2;
    private zzCW zzZcK;
    private boolean zzZcL;
    private zzDT zzZyT;
    private zzD8 zzZz1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // com.aspose.words.zzZCO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzCM generateAutoTitle(zzDI zzdi) {
        String name;
        if (getDCTitle() == null) {
            return null;
        }
        if (getDCTitle().zz3u() != null) {
            return getDCTitle().zz3u();
        }
        if (this.zzZyT.zzZJf().size() == 1) {
            zzGK zzgkZzZJd = this.zzZyT.zzZJd();
            if (zzgkZzZJd.zzZPj().getCount() == 1 || !zzgkZzZJd.zzZPc()) {
                ChartSeries chartSeries = zzgkZzZJd.zzZPj().get(0);
                name = chartSeries.zz3u() != null ? chartSeries.getName() : "Chart Title";
            }
        }
        return zzDG.zzRk(name);
    }

    @Override // com.aspose.words.zzZCO
    public final zzD8 getChartSpace() {
        return this.zzZz1;
    }

    @Override // com.aspose.words.zzZCO
    public final zzCU getDCTitle() {
        return this.zzZcC;
    }

    @Override // com.aspose.words.zzZCO
    public final double getDefaultFontSize() {
        return 14.0d;
    }

    @Override // com.aspose.words.zzZCO
    public final String getDefaultTitleText() {
        return zzK6.getTitle();
    }

    public final DocumentBase getDocument() {
        return this.zzZz1.zzZyb().getDocument();
    }

    public final ChartLegend getLegend() {
        return this.zzZcH;
    }

    @Override // com.aspose.words.zzZCO
    public final boolean getTitleDeleted() {
        return this.zzZcL;
    }

    @Override // com.aspose.words.zzZCO
    public final int getTitlePosition() {
        return 0;
    }

    @Override // com.aspose.words.zzZCO
    public final boolean isVisible() {
        return (this.zzZcL || getDCTitle() == null) ? false : true;
    }

    @Override // com.aspose.words.zzZCO
    public final void setDCTitle(zzCU zzcu) {
        this.zzZcC = zzcu;
    }

    @Override // com.aspose.words.zzZCO
    public final void setTitleDeleted(boolean z) {
        this.zzZcL = z;
    }

    public final zzDT zz45() {
        return this.zzZyT;
    }

    public final void zzKT(int i) {
        this.zzZcJ = i;
    }

    public final void zzT(int i, String str) {
        IWarningCallback warningCallback;
        zzD8 zzd8 = this.zzZz1;
        if (zzd8 == null || (warningCallback = zzd8.zzZyb().getDocument().getWarningCallback()) == null) {
            return;
        }
        OooO00o.OooO0O0(warningCallback, i, 2, str);
    }

    public final void zzX(zzCW zzcw) {
        this.zzZcD = zzcw;
    }

    public final void zzXT(boolean z) {
        this.zzZcE = z;
    }

    public final void zzXU(boolean z) {
        this.zzZcF = z;
    }

    public final void zzXV(boolean z) {
        this.zzZcL = z;
    }

    public final void zzY(zzCW zzcw) {
        this.zzZcI = zzcw;
    }

    public final void zzZ(zzD8 zzd8) {
        this.zzZz1 = zzd8;
    }

    public final zzC9 zzZLQ() {
        return this.zzZcB;
    }

    public final zzE1 zzZLR() {
        return this.zzZcG;
    }

    public final int zzZLS() {
        return this.zzZcJ;
    }

    public final zzCW zzZLT() {
        return this.zzZcD;
    }

    public final zzCW zzZLU() {
        return this.zzZcI;
    }

    public final zzCW zzZLV() {
        return this.zzZcK;
    }

    public final boolean zzZLW() {
        return this.zzZcE;
    }

    public final boolean zzZLX() {
        return this.zzZcF;
    }

    public final boolean zzZLY() {
        return this.zzZcL;
    }

    public final zzD8 zzZLZ() {
        return this.zzZz1;
    }

    public final zzEY zzZM0() {
        zzEY zzey = (zzEY) memberwiseClone();
        zzCU zzcu = this.zzZcC;
        if (zzcu != null) {
            zzCU zzcuZzZMt = zzcu.zzZMt();
            zzey.zzZcC = zzcuZzZMt;
            zzcuZzZMt.zzY(zzey);
        }
        zzCW zzcw = this.zzZcK;
        if (zzcw != null) {
            zzey.zzZcK = zzcw.zzZHl();
        }
        zzCW zzcw2 = this.zzZcI;
        if (zzcw2 != null) {
            zzey.zzZcI = zzcw2.zzZHl();
        }
        zzCW zzcw3 = this.zzZcD;
        if (zzcw3 != null) {
            zzey.zzZcD = zzcw3.zzZHl();
        }
        ChartLegend chartLegend = this.zzZcH;
        if (chartLegend != null) {
            zzey.zzZcH = chartLegend.zzZ(zzey);
        }
        zzE1 zze1 = this.zzZcG;
        if (zze1 != null) {
            zzey.zzZcG = zze1.zzZKV();
        }
        zzDT zzdt = this.zzZyT;
        if (zzdt != null) {
            zzDT zzdtZzZJh = zzdt.zzZJh();
            zzdtZzZJh.zzW(zzey);
            zzey.zzZyT = zzdtZzZJh;
        }
        zzC9 zzc9 = this.zzZcB;
        if (zzc9 != null) {
            zzey.zzZcB = zzc9.zzZFX();
        }
        zzey.setExtensions(zzZBz());
        return zzey;
    }

    public final void zzZ(zzCW zzcw) {
        this.zzZcK = zzcw;
    }

    public final void zzZ(ChartLegend chartLegend) {
        this.zzZcH = chartLegend;
    }

    public final void zzZ(zzE1 zze1) {
        this.zzZcG = zze1;
    }

    public final void zzZ(zzDT zzdt) {
        this.zzZyT = zzdt;
    }

    public final void zzZ(zzC9 zzc9) {
        this.zzZcB = zzc9;
    }
}
