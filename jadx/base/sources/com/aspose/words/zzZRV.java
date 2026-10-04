package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRV extends zzZRU {
    private ChartSeries zzYHY;

    public zzZRV(Document document, ChartSeries chartSeries) {
        super(document, chartSeries.getName());
        this.zzYHY = chartSeries;
    }

    public final void zzA(ChartSeries chartSeries) {
        this.zzYHY = chartSeries;
    }

    @Override // com.aspose.words.zzZRK
    public final void zzMr(String str) {
        this.zzYHY.setName(str);
    }

    public final ChartSeries zzZhd() {
        return this.zzYHY;
    }

    @Override // com.aspose.words.zzZRS
    public final int zzZhe() {
        return 2;
    }
}
