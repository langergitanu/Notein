package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7788gq;
import com.aspose.slides.internal.p332p7.C8028jp;
import com.aspose.slides.internal.p332p7.C8317n8;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.bo */
/* JADX INFO: loaded from: classes3.dex */
class C0825bo extends AbstractC14443sc {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4225k4 = new C7017h4("binSize", "binCount");

    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4281k4(ChartSeries chartSeries, C8317n8 c8317n8) {
        int i;
        if (chartSeries.getChart().getChartData().getSeries().size() > 1) {
            return;
        }
        IAxis horizontalAxis = chartSeries.getChart().getAxes().getHorizontalAxis();
        if (C7019kk.m27469x1(c8317n8.m37324kk().m29542x1(), C8028jp.class)) {
            C8028jp c8028jp = (C8028jp) c8317n8.m37324kk().m29542x1();
            if (c8028jp.m34862kk() == null) {
                horizontalAxis.setAggregationType(1);
            } else {
                int iM27428k4 = f4225k4.m27428k4(c8028jp.m34862kk().m29539k4());
                if (iM27428k4 == 0) {
                    horizontalAxis.setBinWidth(((Double) C7019kk.m27464to(c8028jp.m34862kk().m29541kk(), Double.TYPE)).doubleValue());
                    i = 2;
                } else {
                    if (iM27428k4 != 1) {
                        throw new NotImplementedException();
                    }
                    horizontalAxis.setNumberOfBins(((Long) C7019kk.m27464to(c8028jp.m34862kk().m29541kk(), Long.TYPE)).longValue());
                    i = 3;
                }
                horizontalAxis.setAggregationType(i);
            }
            if (c8028jp.m34864x1() != null) {
                horizontalAxis.setOverflowBin(true);
                if ("auto".equals(c8028jp.m34864x1())) {
                    horizontalAxis.setAutomaticOverflowBin(true);
                } else {
                    horizontalAxis.setAutomaticOverflowBin(false);
                    horizontalAxis.setOverflowBin(C13850af.m65132uz(c8028jp.m34864x1()));
                }
            }
            if (c8028jp.m34860k4() != null) {
                horizontalAxis.setUnderflowBin(true);
                if ("auto".equals(c8028jp.m34860k4())) {
                    horizontalAxis.setAutomaticUnderflowBin(true);
                } else {
                    horizontalAxis.setAutomaticUnderflowBin(false);
                    horizontalAxis.setUnderflowBin(C13850af.m65132uz(c8028jp.m34860k4()));
                }
            }
        }
        if (C7019kk.m27469x1(c8317n8.m37324kk().m29542x1(), C7788gq.class)) {
            horizontalAxis.setAggregationType(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4282k4(ChartSeries chartSeries, C8324nc c8324nc) {
        C8028jp c8028jp;
        C7394ca c7394caM34859k4;
        Object objValueOf;
        IAxis horizontalAxis = chartSeries.getChart().getAxes().getHorizontalAxis();
        C8317n8 c8317n8 = new C8317n8();
        int aggregationType = horizontalAxis.getAggregationType();
        if (aggregationType != 0) {
            if (aggregationType != 1) {
                if (aggregationType == 2) {
                    c8028jp = (C8028jp) C7019kk.m27452k4((Object) c8317n8.m37317k4("binning").m29542x1(), C8028jp.class);
                    c7394caM34859k4 = c8028jp.m34859k4("binSize");
                    objValueOf = Double.valueOf(horizontalAxis.getBinWidth());
                } else if (aggregationType == 3) {
                    c8028jp = (C8028jp) C7019kk.m27452k4((Object) c8317n8.m37317k4("binning").m29542x1(), C8028jp.class);
                    c7394caM34859k4 = c8028jp.m34859k4("binCount");
                    objValueOf = Long.valueOf(horizontalAxis.getNumberOfBins());
                }
                c7394caM34859k4.m29540k4(objValueOf);
            } else {
                c8028jp = (C8028jp) C7019kk.m27452k4((Object) c8317n8.m37317k4("binning").m29542x1(), C8028jp.class);
            }
            if (c8028jp != null) {
                c8028jp.m34861k4(2);
                if (horizontalAxis.isOverflowBin()) {
                    c8028jp.m34863kk(horizontalAxis.isAutomaticOverflowBin() ? "auto" : C13850af.m65101k4(horizontalAxis.getOverflowBin()));
                }
                if (horizontalAxis.isUnderflowBin()) {
                    c8028jp.m34865x1(horizontalAxis.isAutomaticUnderflowBin() ? "auto" : C13850af.m65101k4(horizontalAxis.getUnderflowBin()));
                }
            }
            c8324nc.m37389k4(c8317n8);
        }
        c8317n8.m37317k4("aggregation");
        c8028jp = null;
        if (c8028jp != null) {
        }
        c8324nc.m37389k4(c8317n8);
    }
}
