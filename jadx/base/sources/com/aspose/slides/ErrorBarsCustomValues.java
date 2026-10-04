package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorBarsCustomValues extends DomObject<ChartDataPoint> implements IErrorBarsCustomValues {

    /* JADX INFO: renamed from: du */
    private final ChartDataPointCollection f2206du;

    /* JADX INFO: renamed from: k4 */
    private DoubleChartValue f2207k4;

    /* JADX INFO: renamed from: kk */
    private DoubleChartValue f2208kk;

    /* JADX INFO: renamed from: to */
    private DoubleChartValue f2209to;

    /* JADX INFO: renamed from: x1 */
    private DoubleChartValue f2210x1;

    public ErrorBarsCustomValues(ChartDataPoint chartDataPoint) {
        super(chartDataPoint);
        this.f2206du = chartDataPoint.m596to();
    }

    @Override // com.aspose.slides.IErrorBarsCustomValues
    public final IDoubleChartValue getXMinus() {
        if (this.f2206du.m640x1().getErrorBarsXFormat() == null || this.f2206du.m640x1().getErrorBarsXFormat().getValueType() != 0) {
            return null;
        }
        if (this.f2207k4 == null) {
            this.f2207k4 = new DoubleChartValue(this, ((DataSourceTypeForErrorBarsCustomValues) this.f2206du.getDataSourceTypeForErrorBarsCustomValues()).m1321k4(), true);
        }
        return this.f2207k4;
    }

    @Override // com.aspose.slides.IErrorBarsCustomValues
    public final IDoubleChartValue getXPlus() {
        if (this.f2206du.m640x1().getErrorBarsXFormat() == null || this.f2206du.m640x1().getErrorBarsXFormat().getValueType() != 0) {
            return null;
        }
        if (this.f2210x1 == null) {
            this.f2210x1 = new DoubleChartValue(this, ((DataSourceTypeForErrorBarsCustomValues) this.f2206du.getDataSourceTypeForErrorBarsCustomValues()).m1324x1(), true);
        }
        return this.f2210x1;
    }

    @Override // com.aspose.slides.IErrorBarsCustomValues
    public final IDoubleChartValue getYMinus() {
        if (this.f2206du.m640x1().getErrorBarsYFormat() == null || this.f2206du.m640x1().getErrorBarsYFormat().getValueType() != 0) {
            return null;
        }
        if (this.f2208kk == null) {
            this.f2208kk = new DoubleChartValue(this, ((DataSourceTypeForErrorBarsCustomValues) this.f2206du.getDataSourceTypeForErrorBarsCustomValues()).m1322kk(), true);
        }
        return this.f2208kk;
    }

    @Override // com.aspose.slides.IErrorBarsCustomValues
    public final IDoubleChartValue getYPlus() {
        if (this.f2206du.m640x1().getErrorBarsYFormat() == null || this.f2206du.m640x1().getErrorBarsYFormat().getValueType() != 0) {
            return null;
        }
        if (this.f2209to == null) {
            this.f2209to = new DoubleChartValue(this, ((DataSourceTypeForErrorBarsCustomValues) this.f2206du.getDataSourceTypeForErrorBarsCustomValues()).m1323to(), true);
        }
        return this.f2209to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final double m1419k4() {
        if (((ChartDataPoint) this.f2127h4).m596to().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXMinusValues() == 2 && getXMinus() != null && !C14044b3.m66437kk(getXMinus().getAsLiteralDouble())) {
            return getXMinus().getAsLiteralDouble();
        }
        if (((ChartData) ((ChartDataPoint) this.f2127h4).m596to().m640x1().getChart().getChartData()).m553x1().mo5710kk() == 2) {
            return DoubleChartValue.m1356x1(getXMinus());
        }
        if (((ChartDataPoint) this.f2127h4).m602yj().m71989k4() == null) {
            return 0.0d;
        }
        return ((Double) C7019kk.m27464to(((ChartDataPoint) this.f2127h4).m602yj().m71989k4(), Double.TYPE)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final double m1420kk() {
        if (((ChartDataPoint) this.f2127h4).m596to().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYMinusValues() == 2 && getYMinus() != null && !C14044b3.m66437kk(getYMinus().getAsLiteralDouble())) {
            return getYMinus().getAsLiteralDouble();
        }
        if (((ChartData) ((ChartDataPoint) this.f2127h4).m596to().m640x1().getChart().getChartData()).m553x1().mo5710kk() == 2) {
            return DoubleChartValue.m1356x1(getYMinus());
        }
        if (((ChartDataPoint) this.f2127h4).m595rv().m71989k4() == null) {
            return 0.0d;
        }
        return ((Double) C7019kk.m27464to(((ChartDataPoint) this.f2127h4).m595rv().m71989k4(), Double.TYPE)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final double m1421to() {
        if (((ChartDataPoint) this.f2127h4).m596to().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYPlusValues() == 2 && getYPlus() != null && !C14044b3.m66437kk(getYPlus().getAsLiteralDouble())) {
            return getYPlus().getAsLiteralDouble();
        }
        if (((ChartData) ((ChartDataPoint) this.f2127h4).m596to().m640x1().getChart().getChartData()).m553x1().mo5710kk() == 2) {
            return DoubleChartValue.m1356x1(getYPlus());
        }
        if (((ChartDataPoint) this.f2127h4).m592ks().m71989k4() == null) {
            return 0.0d;
        }
        return ((Double) C7019kk.m27464to(((ChartDataPoint) this.f2127h4).m592ks().m71989k4(), Double.TYPE)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final double m1422x1() {
        if (((ChartDataPoint) this.f2127h4).m596to().getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXPlusValues() == 2 && getXPlus() != null && !C14044b3.m66437kk(getXPlus().getAsLiteralDouble())) {
            return getXPlus().getAsLiteralDouble();
        }
        if (((ChartData) ((ChartDataPoint) this.f2127h4).m596to().m640x1().getChart().getChartData()).m553x1().mo5710kk() == 2) {
            return DoubleChartValue.m1356x1(getXPlus());
        }
        if (((ChartDataPoint) this.f2127h4).m598up().m71989k4() == null) {
            return 0.0d;
        }
        return ((Double) C7019kk.m27464to(((ChartDataPoint) this.f2127h4).m598up().m71989k4(), Double.TYPE)).doubleValue();
    }
}
