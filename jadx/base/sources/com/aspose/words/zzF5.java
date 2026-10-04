package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzF5 extends zzGL {
    private ChartAxis zzZcU;
    private ChartAxis zzZcV;

    @Override // com.aspose.words.zzGL, com.aspose.words.zzZCR
    public final void zzR(ChartAxis chartAxis) {
        this.zzZcU = chartAxis;
    }

    @Override // com.aspose.words.zzGL, com.aspose.words.zzZCR
    public final void zzS(ChartAxis chartAxis) {
        this.zzZcV = chartAxis;
    }

    @Override // com.aspose.words.zzGL, com.aspose.words.zzZCR
    public final ChartAxis zzZPs() {
        ChartAxis chartAxisZzKE = zz45().zzKE(zzZPu());
        if (chartAxisZzKE != null) {
            return chartAxisZzKE;
        }
        if (this.zzZcU == null) {
            this.zzZcU = new ChartAxis(2, this, getDocument(), true);
        }
        return this.zzZcU;
    }

    @Override // com.aspose.words.zzGL, com.aspose.words.zzZCR
    public final ChartAxis zzZPt() {
        ChartAxis chartAxisZzY5 = zz45().zzY5(zzZPu(), zzZPv());
        if (chartAxisZzY5 != null) {
            return chartAxisZzY5;
        }
        if (this.zzZcV == null) {
            this.zzZcV = new ChartAxis(0, this, getDocument(), true);
        }
        return this.zzZcV;
    }

    @Override // com.aspose.words.zzGK
    public final int zzZQO() {
        return 16;
    }
}
