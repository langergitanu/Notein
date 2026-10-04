package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2T extends zzDL {
    private zz2U zzYZv;

    public zz2T(zzGK zzgk) {
        super(zzgk);
        this.zzYZv = (zz2U) zzgk;
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        for (ChartSeries chartSeries : this.zzYZv.zzZPj()) {
            if (!chartSeries.zz2y().isEmpty() && chartSeries.zz2y().zzZMv().zzZIg()) {
                zzZII().zzW(zzzcp, zzdi);
                long[] jArrZzK = zzzcp.zzK(chartSeries);
                zzDI zzdi2 = zzdi;
                zzDG.zzZ(zzDG.zzZ(jArrZzK, zzzcp.zzJ(chartSeries)), zzdi2, chartSeries, false, this.zzYZv.zzZyL(), this.zzYZv.zzZvH());
                zzZ(zzFR.zzZ(zzZIE(), chartSeries, jArrZzK));
                zzdi = zzdi2;
            }
        }
        zzCN.zzZ(this.zzYZv, zzzcp, zzdi);
    }

    @Override // com.aspose.words.zzDL
    public final zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        return zzEN.zzZ(true, this.zzYZv.zzZyL(), i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }
}
