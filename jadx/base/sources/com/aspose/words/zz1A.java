package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1A extends zzDL {
    private zz1B zzYYg;

    public zz1A(zzGK zzgk) {
        super(zzgk);
        this.zzYYg = (zz1B) zzgk;
    }

    private void zzS(zzZCP zzzcp, zzDI zzdi) throws Exception {
        int count;
        if (this.zzYYg.zzZPg().zzLh(26) && (count = this.zzYYg.zzZPj().getCount()) >= 2) {
            long[] jArrZzK = zzzcp.zzK(this.zzYYg.zzZPj().get(0));
            long[] jArrZzK2 = zzzcp.zzK(this.zzYYg.zzZPj().get(Math.min(3, count - 1)));
            float fZzl = zzzcp.zzl(1, this.zzYYg.zzZyK() != null ? this.zzYYg.zzZyK().getGapWidth() : 0, 0);
            for (int i = 0; i < this.zzYYg.zzZPb(); i++) {
                zzZ(jArrZzK[i], jArrZzK2[i], fZzl, this.zzYYg.zzZyK(), zzdi);
            }
        }
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzZII().zzW(zzzcp, zzdi);
        if (this.zzYYg.zzZQL()) {
            zzV(zzzcp, zzdi);
        }
        zzU(zzzcp, zzdi);
        for (ChartSeries chartSeries : this.zzYYg.zzZPj()) {
            zzZ(zzdi, zzzcp.zzK(chartSeries), chartSeries);
        }
        zzS(zzzcp, zzdi);
        zzCN.zzZ(this.zzYYg, zzzcp, zzdi);
    }

    @Override // com.aspose.words.zzDL
    public final zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        return zzEN.zzY(i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }

    public static void zzZ(long j, long j2, float f, zzCH zzch, zzDI zzdi) throws Exception {
        zzFI zzfiZzZML;
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j2) - com.aspose.words.internal.zzZPY.zzYC(j);
        com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j) - (f / 2.0f), com.aspose.words.internal.zzZPY.zzYC(j), f, fZzYC);
        if (fZzYC < 0.0f) {
            zzfiZzZML = zzdi.zzZIC().zzZMy();
        } else {
            zzfiZzZML = zzdi.zzZIC().zzZML();
        }
        zzD9 zzd9 = new zzD9();
        if (zzch != null) {
            zzd9 = fZzYC < 0.0f ? zzch.zzZGi() : zzch.zzZGh();
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzDG.zzZ(zzzgZzW, zzd9, (zzE3) null, zzfiZzZML, 0);
        zzdi.zzKy(19).zzX(zzzgZzW);
    }

    private void zzZ(zzDI zzdi, long[] jArr, ChartSeries chartSeries) throws Exception {
        if (chartSeries != null) {
            zzDG.zzZ(jArr, 0, zzdi, chartSeries, false, true, true);
            zzZ(zzFR.zzZ(zzZIE(), chartSeries, jArr));
        }
    }
}
