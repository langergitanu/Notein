package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements o000OOO.OooO {
    public static int OooO0O0(Chart chart, int i) {
        return chart.getChartData().getSeries().get_Item(i).getParentSeriesGroup().getGapDepth();
    }

    @Override // o000OOO.OooO
    public double OooO00o(double d) {
        double d2;
        double dPow = d < 0.0d ? -d : d;
        if (dPow >= 0.0031308049535603718d) {
            dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
            d2 = 0.9478672985781991d;
        } else {
            d2 = 0.07739938080495357d;
        }
        return Math.copySign(dPow / d2, d);
    }
}
