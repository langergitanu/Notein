package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3A extends zzDL {
    private zz3B zzYZL;

    public zz3A(zzGK zzgk) {
        super(zzgk);
        this.zzYZL = (zz3B) zzgk;
    }

    private boolean zzZwe() {
        return this.zzYZL.zzZwf() == 0;
    }

    private boolean zzZyL() {
        return this.zzYZL.zzZwf() == 1;
    }

    @Override // com.aspose.words.zzDL
    public final void zzZ(zzZCP zzzcp, zzDI zzdi) throws Exception {
        zzDI zzdi2;
        zzZCP zzzcp2;
        for (ChartSeries chartSeries : this.zzYZL.zzZPj()) {
            long[] jArrZzK = zzzcp.zzK(chartSeries);
            int length = jArrZzK.length;
            long[] jArr = new long[length + 1];
            System.arraycopy(jArrZzK, 0, jArr, 0, jArrZzK.length);
            jArr[length] = jArr[0];
            if (zzZwe()) {
                zzdi.zzW(zzdi.zzKy(2));
                zzdi2 = zzdi;
                zz5W.zzZ(jArr, true, zzdi2, chartSeries, true, chartSeries.getSmooth());
                zzdi2.zzZI();
                zzzcp2 = zzzcp;
                jArr = jArr;
            } else {
                zzdi2 = zzdi;
                zzzcp2 = zzzcp;
                zzZ(zzzcp2, zzdi2, chartSeries, jArrZzK.length, jArr);
            }
            zzZ(zzFR.zzZ(zzZIE(), chartSeries, jArr, zzzcp2.zzZKr()));
            zzzcp = zzzcp2;
            zzdi = zzdi2;
        }
    }

    private void zzZ(zzZCP zzzcp, zzDI zzdi, ChartSeries chartSeries, int i, long[] jArr) throws Exception {
        int[] iArrZzJ = zzzcp.zzJ(chartSeries);
        if (iArrZzJ.length > 1) {
            int i2 = 0;
            if (iArrZzJ[iArrZzJ.length - 2] + iArrZzJ[iArrZzJ.length - 1] == i && iArrZzJ[0] == 0) {
                i2 = 1;
            }
            int length = iArrZzJ.length - 1;
            iArrZzJ[length] = iArrZzJ[length] + i2;
            zzDG.zzZ(zzDG.zzZ(jArr, iArrZzJ), zzdi, chartSeries, zzZwe(), zzZyL(), true);
        }
    }

    @Override // com.aspose.words.zzDL
    public final zzEO zzZ(int i, ChartDataPoint chartDataPoint, zzEM zzem, zzDI zzdi) throws Exception {
        if (zzZwe()) {
            return super.zzZ(i, chartDataPoint, zzem, zzdi);
        }
        return zzEN.zzZ(true, zzZyL(), i, chartDataPoint, zzem.zzZLC(), zzem.zzZLz(), zzdi);
    }
}
