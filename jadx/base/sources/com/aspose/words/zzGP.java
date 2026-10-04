package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGP extends zzDL {
    private zzGQ zzZg6;
    private float zzZg7;

    public zzGP(zzGK zzgk) {
        super(zzgk);
        this.zzZg6 = (zzGQ) zzgk;
    }

    private float zzV(zzCF zzcf) {
        double value;
        if (zzCF.zzR(zzcf) || com.aspose.words.internal.zzAN.zzf(this.zzZg6.zzZPB())) {
            return 0.0f;
        }
        if (this.zzZg6.zzZPD() == 0) {
            double value2 = zzcf.getValue();
            float f = this.zzZg7;
            value = Math.sqrt((value2 * ((double) (f * f))) / ((double) this.zzZg6.zzZPB()));
        } else {
            value = (zzcf.getValue() * ((double) this.zzZg7)) / ((double) this.zzZg6.zzZPB());
        }
        return (float) (((value * 2.0d) * ((double) this.zzZg6.zzZPE())) / 100.0d);
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        this.zzZg7 = Math.min(zzzcp.zzZKC(), zzzcp.zzZKB()) / 8.0f;
        zzZII().zzW(zzzcp, zzdi);
        zzdi.zzW(zzdi.zzKy(15));
        for (ChartSeries chartSeries : this.zzZg6.zzZPj()) {
            for (int i = 0; i < chartSeries.getValueCount(); i++) {
                zzCF zzcfZzL0 = chartSeries.zz2z().zzL0(i);
                zzCF zzcfZzL02 = chartSeries.zz2y().zzL0(i);
                float fZzV = zzV(chartSeries.zz2x().zzL0(i));
                if (!zzCF.zzR(zzcfZzL0) && !zzCF.zzR(zzcfZzL02) && !com.aspose.words.internal.zzAN.zzf(fZzV)) {
                    zzG3 zzg3 = new zzG3(zzzcp.zzt(zzcfZzL0.getValue(), zzcfZzL02.getValue()), fZzV);
                    zzdi.zzsD().zzX(zzZ(chartSeries.getIndex(), this.zzZg6.getBubble3D(), chartSeries.zzNM(i), new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) zzg3.zzYK()) - (zzg3.getSize() / 2.0f), com.aspose.words.internal.zzZPY.zzYC(zzg3.zzYK()) - (zzg3.getSize() / 2.0f), zzg3.getSize(), zzg3.getSize()), zzdi));
                    zzW(zzFR.zzZ(zzZIE(), i, chartSeries, zzg3));
                }
            }
        }
        zzdi.zzZI();
        zzCN.zzZ(this.zzZg6, zzzcp, zzdi);
    }

    @Override // com.aspose.words.zzDL
    public final zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        return zzEN.zzZ(i, this.zzZg6.getBubble3D(), chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }

    public static com.aspose.words.internal.zzZG zzZ(int i, boolean z, ChartDataPoint chartDataPoint, com.aspose.words.internal.zzZQ4 zzzq4, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzQ5 zzq5 = new com.aspose.words.internal.zzQ5(zzzq4);
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(zzq5);
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        zzDG.zzZ(zzzg, chartDataPoint, zzdi.zzZIC().zzZMK(), i);
        if (!z && !chartDataPoint.getBubble3D()) {
            return zzzg;
        }
        zzzg.zzY(zzGJ.zzZ(zzzg.zzZ1(), zzzq4, zzdi.zzZIw()));
        return zzzg;
    }
}
