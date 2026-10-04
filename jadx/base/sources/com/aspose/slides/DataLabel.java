package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class DataLabel implements IDataLabel, InterfaceC14397rj {

    /* JADX INFO: renamed from: c5 */
    private float f2083c5;

    /* JADX INFO: renamed from: ck */
    private float f2084ck;

    /* JADX INFO: renamed from: du */
    private ChartSeries f2085du;

    /* JADX INFO: renamed from: dy */
    private String f2086dy;

    /* JADX INFO: renamed from: fa */
    private float f2087fa;

    /* JADX INFO: renamed from: h4 */
    private C14355qp f2088h4;

    /* JADX INFO: renamed from: jd */
    private float f2089jd;

    /* JADX INFO: renamed from: k4 */
    private DataLabelFormat f2090k4;

    /* JADX INFO: renamed from: kk */
    private C0799b6 f2091kk;

    /* JADX INFO: renamed from: m9 */
    private GeometryShape f2092m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f2093to;

    /* JADX INFO: renamed from: x1 */
    private TextFrame f2094x1;

    public DataLabel(ChartDataPointLevel chartDataPointLevel) {
        this.f2093to = chartDataPointLevel;
        this.f2085du = chartDataPointLevel.m652m9().m596to().m640x1();
        m1288fa();
    }

    /* JADX INFO: renamed from: ck */
    private String m1287ck() {
        return (m1294dy().getName().getDataSourceType() != 0 || ((ChartData) m1294dy().getChart().getChartData()).m553x1().mo5710kk() == 2) ? m1294dy().getName().toString() : m1294dy().m725jd();
    }

    /* JADX INFO: renamed from: fa */
    private void m1288fa() {
        boolean zM2138ix = ((DataLabelFormat) this.f2085du.getLabels().getDefaultDataLabelFormat()).m2138ix();
        this.f2090k4 = new DataLabelFormat(this);
        if (zM2138ix) {
            ((Format) getDataLabelFormat().getFormat()).m1555k4(this.f2085du.getLabels().getDefaultDataLabelFormat().getFormat());
            this.f2090k4.setNumberFormatLinkedToSource(this.f2085du.getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource());
            this.f2090k4.setNumberFormat(this.f2085du.getLabels().getDefaultDataLabelFormat().getNumberFormat());
            this.f2090k4.setPosition(this.f2085du.getLabels().getDefaultDataLabelFormat().getPosition());
            this.f2090k4.setSeparator(this.f2085du.getLabels().getDefaultDataLabelFormat().getSeparator());
            this.f2090k4.setShowBubbleSize(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowBubbleSize());
            this.f2090k4.setShowCategoryName(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowCategoryName());
            this.f2090k4.setShowLegendKey(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowLegendKey());
            this.f2090k4.setShowPercentage(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowPercentage());
            this.f2090k4.setShowSeriesName(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowSeriesName());
            this.f2090k4.setShowValue(this.f2085du.getLabels().getDefaultDataLabelFormat().getShowValue());
            TextFrame textFrame = new TextFrame(this);
            ((ChartTextFormat) this.f2085du.getLabels().getDefaultDataLabelFormat().getTextFormat()).copyTo(textFrame);
            ((ChartTextFormat) this.f2090k4.getTextFormat()).copyFrom(textFrame);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX INFO: renamed from: jd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String m1289jd() {
        int iIndexOf = m1294dy().getLabels().indexOf(this);
        if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(m1294dy().getType())) {
            return (((ChartDataPointCollection) C7019kk.m27452k4((Object) m1294dy().getDataPoints(), ChartDataPointCollection.class)).getDataSourceTypeForXValues() != 0 || ((ChartData) m1294dy().getChart().getChartData()).m553x1().mo5710kk() == 2) ? (m1294dy().getDataPoints().get_Item(iIndexOf).getXValue().getAsCell() == null || m1294dy().getDataPoints().get_Item(iIndexOf).getXValue().getAsCell().getValue() == null) ? "" : m1294dy().getDataPoints().get_Item(iIndexOf).getXValue().getAsCell().getValue().toString() : ((ChartDataPoint) C7019kk.m27452k4((Object) m1294dy().getDataPoints().get_Item(iIndexOf), ChartDataPoint.class)).m585jd().m71989k4().toString();
        }
        if (iIndexOf == m1294dy().getLabels().getCount() - 1 && (m1294dy().getType() == 28 || m1294dy().getType() == 31)) {
            return "Other";
        }
        List list = new List();
        if (m1294dy().getPlotOnSecondAxis()) {
            C14365qy.m69815k4(getChart().getChartData().getSecondaryCategories(), (List<C1210hn>) list, (Chart) getChart());
            if (getChart().getChartData().getSecondaryCategories().getGroupingLevelCount() > 1) {
                C14365qy.m69811h4(list);
            }
        } else {
            C14365qy.m69815k4(getChart().getChartData().getCategories(), (List<C1210hn>) list, (Chart) getChart());
            if (getChart().getChartData().getCategories().getGroupingLevelCount() > 1) {
            }
        }
        if (iIndexOf >= list.size()) {
            return C14057f9.m66586k4(iIndexOf + 1, (InterfaceC14073kp) C11697x1.m55250kk());
        }
        C1210hn c1210hn = (C1210hn) list.get_Item(iIndexOf);
        return C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), false);
    }

    /* JADX INFO: renamed from: up */
    private C14355qp m1291up() {
        if (this.f2088h4 == null) {
            this.f2088h4 = new C14355qp(this.f2093to);
        }
        return this.f2088h4;
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame addTextFrameForOverriding(String str) {
        ((ParagraphCollection) getTextFrameForOverriding().getParagraphs()).m2178k4(str);
        return this.f2094x1;
    }

    /* JADX INFO: renamed from: c5 */
    public final GeometryShape m1292c5() {
        if (!getDataLabelFormat().getShowLabelAsDataCallout()) {
            return null;
        }
        if (this.f2092m9 == null) {
            AutoShape autoShape = new AutoShape(this);
            this.f2092m9 = autoShape;
            autoShape.setShapeType(117);
            DataLabelCollection dataLabelCollection = (DataLabelCollection) this.f2085du.getLabels();
            if (dataLabelCollection.m1310to() != null && dataLabelCollection.m1310to().mo272to().m70448jd() != null) {
                this.f2092m9.setShapeType(dataLabelCollection.m1310to().mo272to().m70448jd().m64257dy());
            }
        }
        return this.f2092m9;
    }

    /* JADX INFO: renamed from: du */
    public final String m1293du() {
        int iIndexOf = m1294dy().getLabels().indexOf(this);
        if (!ChartTypeCharacterizer.isSeriesUsesValueCoordinate(m1294dy().getType())) {
            if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(m1294dy().getType())) {
                if (((ChartDataPointCollection) C7019kk.m27452k4((Object) m1294dy().getDataPoints(), ChartDataPointCollection.class)).getDataSourceTypeForYValues() == 0 && ((ChartData) m1294dy().getChart().getChartData()).m553x1().mo5710kk() != 2) {
                    return C13729ki.m63880k4(((ChartDataPoint) C7019kk.m27452k4((Object) m1294dy().getDataPoints().get_Item(iIndexOf), ChartDataPoint.class)).m580ck().m71989k4(), getDataLabelFormat().getNumberFormat(), false);
                }
                if (m1294dy().getDataPoints().get_Item(iIndexOf).getYValue().getAsCell() != null && m1294dy().getDataPoints().get_Item(iIndexOf).getYValue().getAsCell().getValue() != null) {
                    return m1294dy().getDataPoints().get_Item(iIndexOf).getYValue().getAsCell().getValue().toString();
                }
            }
            return "";
        }
        String numberFormat = getDataLabelFormat().getNumberFormat();
        if (C14113y2.m67411k4(numberFormat) || "General".equals(numberFormat)) {
            numberFormat = m1294dy().getNumberFormatOfValues();
        }
        if (((ChartDataPointCollection) C7019kk.m27452k4((Object) m1294dy().getDataPoints(), ChartDataPointCollection.class)).getDataSourceTypeForValues() == 0 && ((ChartData) m1294dy().getChart().getChartData()).m553x1().mo5710kk() != 2) {
            ChartDataPoint chartDataPoint = (ChartDataPoint) C7019kk.m27452k4((Object) m1294dy().getDataPoints().get_Item(iIndexOf), ChartDataPoint.class);
            if ("General".equals(numberFormat) && !"General".equals(chartDataPoint.m579c5().m71992x1()) && !C14113y2.m67411k4(chartDataPoint.m579c5().m71992x1())) {
                numberFormat = chartDataPoint.m579c5().m71992x1();
            }
            return C13729ki.m63880k4(chartDataPoint.m579c5().m71989k4(), numberFormat, false);
        }
        if (((ChartDataPointCollection) C7019kk.m27452k4((Object) m1294dy().getDataPoints(), ChartDataPointCollection.class)).getDataSourceTypeForValues() == 2) {
            return C13729ki.m63880k4((Object) Double.valueOf(m1294dy().getDataPoints().get_Item(iIndexOf).getValue().getAsLiteralDouble()), numberFormat, false);
        }
        if (m1294dy().getDataPoints().get_Item(iIndexOf).getValue().getAsCell() == null || m1294dy().getDataPoints().get_Item(iIndexOf).getValue().getAsCell().getValue() == null) {
            return "";
        }
        double[] dArr = {0.0d};
        return C14044b3.m66435k4(m1294dy().getDataPoints().get_Item(iIndexOf).getValue().getAsCell().getValue().toString(), 231, C11683c5.m55033ck(), dArr) ? C13729ki.m63880k4((Object) Double.valueOf(dArr[0]), numberFormat, false) : m1294dy().getDataPoints().get_Item(iIndexOf).getValue().getAsCell().getValue().toString();
    }

    /* JADX INFO: renamed from: dy */
    public final ChartSeries m1294dy() {
        return this.f2085du;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualHeight() {
        return this.f2087fa;
    }

    @Override // com.aspose.slides.IDataLabel
    public final String getActualLabelText() {
        if (getTextFrameForOverriding() != null && !C14113y2.m67411k4(getTextFrameForOverriding().getText())) {
            return getTextFrameForOverriding().getText();
        }
        List list = new List();
        IDataLabelFormat dataLabelFormat = getDataLabelFormat();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m1287ck());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m1289jd());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m1293du());
        }
        if ((ChartTypeCharacterizer.isChartTypePie(m1294dy().getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(m1294dy().getType())) && dataLabelFormat.getShowPercentage()) {
            list.addItem(m1295h4());
        }
        if (ChartTypeCharacterizer.isChartTypeBubble(m1294dy().getType()) && dataLabelFormat.getShowBubbleSize()) {
            list.addItem(m1303to());
        }
        String separator = (dataLabelFormat.getShowSeriesName() || !dataLabelFormat.getShowCategoryName() || dataLabelFormat.getShowValue() || !dataLabelFormat.getShowPercentage()) ? "; " : IOUtils.LINE_SEPARATOR_UNIX;
        if (!C14113y2.m67411k4(getDataLabelFormat().getSeparator())) {
            separator = getDataLabelFormat().getSeparator();
        }
        return C14113y2.m67403k4(separator, (String[]) list.toArray(new String[0]));
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualWidth() {
        return this.f2084ck;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualX() {
        return this.f2083c5;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualY() {
        return this.f2089jd;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getBottom() {
        return m1305x1().getBottom();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return m1294dy().getChart();
    }

    @Override // com.aspose.slides.IDataLabel
    public final IDataLabelFormat getDataLabelFormat() {
        if (this.f2090k4 == null) {
            this.f2090k4 = new DataLabelFormat(this);
        }
        return this.f2090k4;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getHeight() {
        return m1305x1().getHeight();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2093to;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return this.f2085du.getPresentation();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getRight() {
        return m1305x1().getRight();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return this.f2085du.getSlide();
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        return this.f2090k4.getTextFormat();
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame getTextFrameForOverriding() {
        if (this.f2094x1 == null) {
            this.f2094x1 = new TextFrame(this);
        }
        return this.f2094x1;
    }

    @Override // com.aspose.slides.IDataLabel
    public final IChartDataCell getValueFromCell() {
        return m1291up().m69722k4();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getWidth() {
        return m1305x1().getWidth();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getX() {
        return m1305x1().getX();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getY() {
        return m1305x1().getY();
    }

    /* JADX INFO: renamed from: h4 */
    public final String m1295h4() {
        DataLabel dataLabel = this;
        int iIndexOf = m1294dy().getLabels().indexOf(dataLabel);
        if (!ChartTypeCharacterizer.isChartTypePie(dataLabel.m1294dy().getType())) {
            return "";
        }
        ChartData chartData = (ChartData) dataLabel.m1294dy().getChart().getChartData();
        double[] dArr = new double[dataLabel.m1294dy().getDataPoints().size()];
        double d = 0.0d;
        double dM66903fa = 0.0d;
        for (int i = 0; i < dataLabel.m1294dy().getDataPoints().size(); i++) {
            dM66903fa += chartData.m553x1().mo5710kk() != 2 ? C14080ne.m66903fa(((ChartDataPoint) C7019kk.m27452k4((Object) dataLabel.m1294dy().getDataPoints().get_Item(i), ChartDataPoint.class)).m579c5().m71989k4()) : DoubleChartValue.m1356x1(dataLabel.m1294dy().getDataPoints().get_Item(i).getValue());
        }
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (i2 < dataLabel.m1294dy().getDataPoints().size()) {
            int i4 = iIndexOf;
            double dM67475k4 = C14116yg.m67475k4(chartData.m553x1().mo5710kk() != 2 ? C14080ne.m66903fa(((ChartDataPoint) C7019kk.m27452k4((Object) dataLabel.m1294dy().getDataPoints().get_Item(i2), ChartDataPoint.class)).m579c5().m71989k4()) : DoubleChartValue.m1356x1(dataLabel.m1294dy().getDataPoints().get_Item(i2).getValue())) / dM66903fa;
            dArr[i2] = dM67475k4;
            double dM67478k4 = C14116yg.m67478k4(dM67475k4, 2, (short) 1);
            d += dM67478k4;
            float fM67475k4 = (float) C14116yg.m67475k4(dM67478k4 - dArr[i2]);
            if (fM67475k4 > f) {
                f = fM67475k4;
                i3 = i2;
            }
            i2++;
            dataLabel = this;
            iIndexOf = i4;
        }
        int i5 = iIndexOf;
        if (d > 1.0d && i3 != -1) {
            dArr[i3] = C14116yg.m67478k4(dArr[i3], 2, (short) 1) - (d - 1.0d);
        }
        return C13729ki.m63880k4((Object) Double.valueOf(dArr[i5]), "".equals(getDataLabelFormat().getNumberFormat()) ? "0%" : getDataLabelFormat().getNumberFormat(), false);
    }

    @Override // com.aspose.slides.IDataLabel
    public final void hide() {
        this.f2090k4.setShowLegendKey(false);
        this.f2090k4.setShowValue(false);
        this.f2090k4.setShowCategoryName(false);
        this.f2090k4.setShowSeriesName(false);
        this.f2090k4.setShowPercentage(false);
        this.f2090k4.setShowBubbleSize(false);
        this.f2090k4.setShowLabelValueFromCell(false);
    }

    @Override // com.aspose.slides.IDataLabel
    public final boolean isVisible() {
        return this.f2090k4.getShowLegendKey() || this.f2090k4.getShowValue() || this.f2090k4.getShowCategoryName() || this.f2090k4.getShowSeriesName() || this.f2090k4.getShowPercentage() || this.f2090k4.getShowBubbleSize() || this.f2090k4.getShowLabelValueFromCell();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m1296k4() {
        return this.f2086dy;
    }

    /* JADX INFO: renamed from: kk */
    public final C0799b6 m1300kk() {
        return this.f2091kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final ITextFrame m1302m9() {
        return this.f2094x1;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setHeight(float f) {
        m1305x1().setHeight(f);
    }

    @Override // com.aspose.slides.IDataLabel
    public final void setValueFromCell(IChartDataCell iChartDataCell) {
        m1291up().m69723k4((ChartDataCell) iChartDataCell);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setWidth(float f) {
        m1305x1().setWidth(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setX(float f) {
        m1305x1().setX(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setY(float f) {
        m1305x1().setY(f);
    }

    /* JADX INFO: renamed from: to */
    public final String m1303to() {
        int iIndexOf = m1294dy().getLabels().indexOf(this);
        if (ChartTypeCharacterizer.isChartTypeBubble(getChart().getType())) {
            if (((ChartDataPointCollection) m1294dy().getDataPoints()).getDataSourceTypeForBubbleSizes() == 0 && ((ChartData) m1294dy().getChart().getChartData()).m553x1().mo5710kk() != 2) {
                Object objM71989k4 = ((ChartDataPoint) m1294dy().getDataPoints().get_Item(iIndexOf)).m583fa().m71989k4();
                if (objM71989k4 == null) {
                    return null;
                }
                return objM71989k4.toString();
            }
            if (m1294dy().getDataPoints().get_Item(iIndexOf).getBubbleSize().getAsCell() != null && m1294dy().getDataPoints().get_Item(iIndexOf).getBubbleSize().getAsCell().getValue() != null) {
                return m1294dy().getDataPoints().get_Item(iIndexOf).getBubbleSize().getAsCell().getValue().toString();
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: x1 */
    public final C0799b6 m1305x1() {
        if (this.f2091kk == null) {
            this.f2091kk = new C0799b6(this.f2085du.getChart());
        }
        return this.f2091kk;
    }

    public DataLabel(IChartDataPoint iChartDataPoint) {
        this.f2093to = (InterfaceC14397rj) iChartDataPoint;
        this.f2085du = ((ChartDataPoint) iChartDataPoint).m596to().m640x1();
        m1288fa();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m1290k4(IChartSeries iChartSeries, int i) {
        return i == -1 ? "" : (iChartSeries.getType() == 0 || iChartSeries.getType() == 34 || iChartSeries.getType() == 79 || iChartSeries.getType() == 76) ? (i == 2 || i == 3 || i == 4 || i == 6) ? "" : C14113y2.m67408k4(C14042ak.m66410k4(LegendDataLabelPosition.class, 2L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 3L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 4L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 6L)) : (iChartSeries.getType() == 1 || iChartSeries.getType() == 2 || iChartSeries.getType() == 35 || iChartSeries.getType() == 32) ? (i == 2 || i == 3 || i == 4) ? "" : C14113y2.m67408k4(C14042ak.m66410k4(LegendDataLabelPosition.class, 2L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 3L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 4L)) : (iChartSeries.getType() == 26 || iChartSeries.getType() == 27 || iChartSeries.getType() == 28 || iChartSeries.getType() == 31 || iChartSeries.getType() == 29 || iChartSeries.getType() == 30 || ((iChartSeries.getType() == 66 || iChartSeries.getType() == 67) && (iChartSeries.getDoughnutHoleSize() & 255) == 0)) ? (i == 2 || i == 4 || i == 1 || i == 6) ? "" : C14113y2.m67408k4(C14042ak.m66410k4(LegendDataLabelPosition.class, 2L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 4L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 1L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 6L)) : (iChartSeries.getType() == 22 || iChartSeries.getType() == 23 || iChartSeries.getType() == 24 || iChartSeries.getType() == 19 || iChartSeries.getType() == 21 || iChartSeries.getType() == 20 || iChartSeries.getType() == 53 || iChartSeries.getType() == 55 || iChartSeries.getType() == 54 || iChartSeries.getType() == 57 || iChartSeries.getType() == 56 || iChartSeries.getType() == 58 || iChartSeries.getType() == 59 || iChartSeries.getType() == 60 || iChartSeries.getType() == 61 || iChartSeries.getType() == 68 || iChartSeries.getType() == 69) ? (i == 2 || i == 0 || i == 8 || i == 5 || i == 7) ? "" : C14113y2.m67408k4(C14042ak.m66410k4(LegendDataLabelPosition.class, 2L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 0L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 8L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 5L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 7L)) : iChartSeries.getType() == 78 ? (i == 5 || i == 7 || i == 8 || i == 0) ? "" : C14113y2.m67408k4(C14042ak.m66410k4(LegendDataLabelPosition.class, 5L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 7L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 8L), ", ", C14042ak.m66410k4(LegendDataLabelPosition.class, 0L)) : "supports only default value";
    }

    /* JADX INFO: renamed from: kk */
    public final void m1301kk(float f) {
        this.f2084ck = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m1304to(float f) {
        this.f2087fa = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1306x1(float f) {
        this.f2089jd = f;
    }

    public DataLabel(C0791b3 c0791b3) {
        this.f2093to = c0791b3;
        this.f2085du = c0791b3.m3947ck();
        this.f2088h4 = new C14355qp(this.f2093to);
        m1288fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1297k4(float f) {
        this.f2083c5 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1298k4(IDataLabel iDataLabel) {
        this.f2090k4.m1317k4((DataLabelFormat) iDataLabel.getDataLabelFormat());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1299k4(String str) {
        this.f2086dy = str;
    }
}
