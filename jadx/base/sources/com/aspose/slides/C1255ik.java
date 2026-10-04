package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7314bd;
import com.aspose.slides.internal.p332p7.C7752ge;
import com.aspose.slides.internal.p332p7.C7922id;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8367np;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C9091w7;

/* JADX INFO: renamed from: com.aspose.slides.ik */
/* JADX INFO: loaded from: classes3.dex */
class C1255ik {
    /* JADX INFO: renamed from: k4 */
    private static IDataLabel m7648k4(IChartSeries iChartSeries, long j) {
        if (iChartSeries.getType() == 76) {
            ChartSeries chartSeries = (ChartSeries) iChartSeries;
            if ((j & 4294967295L) >= chartSeries.m719c5().m72973k4()) {
                return null;
            }
            return chartSeries.m719c5().m72975k4((int) j).m3961m9();
        }
        if (iChartSeries.getType() == 78) {
            int i = 0;
            int i2 = 0;
            while (true) {
                ChartSeries chartSeries2 = (ChartSeries) iChartSeries;
                if (i >= chartSeries2.m719c5().m72973k4()) {
                    break;
                }
                C0791b3 c0791b3M72975k4 = chartSeries2.m719c5().m72975k4(i);
                int iM3963qq = ((int) c0791b3M72975k4.m3963qq()) + i2;
                int i3 = iM3963qq + 3;
                long j2 = j & 4294967295L;
                long j3 = i2;
                if (j2 >= j3 && j2 <= i3) {
                    return j2 == j3 ? c0791b3M72975k4.m3948du() : j2 == ((long) ((((int) c0791b3M72975k4.m3963qq()) + i2) + (-1))) ? c0791b3M72975k4.m3951h4() : j2 == ((long) (((int) c0791b3M72975k4.m3963qq()) + i2)) ? c0791b3M72975k4.m3959kk() : j2 == ((long) ((((int) c0791b3M72975k4.m3963qq()) + i2) + 1)) ? c0791b3M72975k4.m3970x1() : j2 == ((long) ((((int) c0791b3M72975k4.m3963qq()) + i2) + 2)) ? c0791b3M72975k4.m3965to() : j2 == ((long) ((i2 + ((int) c0791b3M72975k4.m3963qq())) + 3)) ? c0791b3M72975k4.m3954k4() : iChartSeries.getDataPoints().getOrCreateDataPointByIdx(j).getLabel();
                }
                i2 = iM3963qq + 4;
                i++;
            }
        }
        if (iChartSeries.getType() != 74 && iChartSeries.getType() != 75) {
            if (iChartSeries.getDataPoints().size() - 1 > (4294967295L & j)) {
                return iChartSeries.getDataPoints().get_Item((int) j).getLabel();
            }
            return null;
        }
        IChartDataPointLevel iChartDataPointLevelM622k4 = ((ChartDataPointCollection) iChartSeries.getDataPoints()).m622k4((int) j);
        if (iChartDataPointLevelM622k4 == null) {
            return null;
        }
        return iChartDataPointLevelM622k4.getLabel();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7653x1(IChartSeries iChartSeries, C7922id c7922id, u8s u8sVar) {
        C7922id c7922id2;
        u8s u8sVar2;
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) iChartSeries.getChart().getChartData().getCategories();
        int i = 0;
        while (i < chartCategoryCollection.size()) {
            int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount() - 1;
            while (groupingLevelCount >= 0 && i <= iChartSeries.getDataPoints().size() - 1) {
                ChartDataPointLevel chartDataPointLevel = (ChartDataPointLevel) C7019kk.m27452k4((Object) iChartSeries.getDataPoints().get_Item(i).getDataPointLevels().get_Item(groupingLevelCount), ChartDataPointLevel.class);
                if (chartDataPointLevel.m646dy() != -1) {
                    c7922id2 = c7922id;
                    u8sVar2 = u8sVar;
                    m7652k4(c7922id2, chartDataPointLevel.getLabel(), ((long) chartDataPointLevel.m646dy()) & 4294967295L, iChartSeries.getLabels(), u8sVar2);
                } else {
                    c7922id2 = c7922id;
                    u8sVar2 = u8sVar;
                }
                groupingLevelCount--;
                c7922id = c7922id2;
                u8sVar = u8sVar2;
            }
            i++;
            c7922id = c7922id;
            u8sVar = u8sVar;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7649k4(IChartSeries iChartSeries, C7922id c7922id, u8s u8sVar) {
        int i = 0;
        if (iChartSeries.getType() == 78) {
            int iM3963qq = 0;
            while (true) {
                ChartSeries chartSeries = (ChartSeries) iChartSeries;
                if (i >= chartSeries.m719c5().m72973k4()) {
                    return;
                }
                C0791b3 c0791b3M72975k4 = chartSeries.m719c5().m72975k4(i);
                long j = ((long) iM3963qq) & 4294967295L;
                m7652k4(c7922id, c0791b3M72975k4.m3948du(), j, iChartSeries.getLabels(), u8sVar);
                m7652k4(c7922id, c0791b3M72975k4.m3951h4(), ((((c0791b3M72975k4.m3963qq() & 4294967295L) + j) & 4294967295L) - 1) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                m7652k4(c7922id, c0791b3M72975k4.m3959kk(), ((c0791b3M72975k4.m3963qq() & 4294967295L) + j) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                m7652k4(c7922id, c0791b3M72975k4.m3970x1(), ((((c0791b3M72975k4.m3963qq() & 4294967295L) + j) & 4294967295L) + 1) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                m7652k4(c7922id, c0791b3M72975k4.m3965to(), ((((c0791b3M72975k4.m3963qq() & 4294967295L) + j) & 4294967295L) + 2) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                m7652k4(c7922id, c0791b3M72975k4.m3954k4(), (((j + (c0791b3M72975k4.m3963qq() & 4294967295L)) & 4294967295L) + 3) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                iM3963qq = iM3963qq + ((int) c0791b3M72975k4.m3963qq()) + 4;
                i++;
            }
        } else {
            if (iChartSeries.getType() != 76) {
                if (iChartSeries.getType() == 74 || iChartSeries.getType() == 75) {
                    m7653x1(iChartSeries, c7922id, u8sVar);
                    return;
                }
                while (i < iChartSeries.getDataPoints().size()) {
                    m7652k4(c7922id, iChartSeries.getDataPoints().get_Item(i).getLabel(), ((long) i) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                    i++;
                }
                return;
            }
            while (true) {
                ChartSeries chartSeries2 = (ChartSeries) iChartSeries;
                if (i >= chartSeries2.m719c5().m72973k4()) {
                    return;
                }
                m7652k4(c7922id, chartSeries2.m719c5().m72975k4(i).m3961m9(), ((long) i) & 4294967295L, iChartSeries.getLabels(), u8sVar);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7650k4(IDataLabelCollection iDataLabelCollection, AbstractC4685kk<C7922id> abstractC4685kk, u8s u8sVar) {
        int i;
        if (C14711vu.m72548k4(iDataLabelCollection)) {
            final C7922id c7922idInvoke = abstractC4685kk.invoke();
            C13735kl c13735klM1311x1 = ((DataLabelCollection) iDataLabelCollection).m1311x1();
            C14864yx.m74127k4(iDataLabelCollection.getDefaultDataLabelFormat().getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.ik.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7922idInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataLabelsElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c7922idInvoke.m34035x1();
                }
            }, u8sVar, null, false);
            C13691jl.m63395k4(iDataLabelCollection.getDefaultDataLabelFormat().getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.ik.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7922idInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataLabelsElementData.AddTxPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return c7922idInvoke.m34030kk();
                }
            }, u8sVar);
            IDataLabelFormat defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
            if (defaultDataLabelFormat.getPosition() != -1) {
                switch (defaultDataLabelFormat.getPosition()) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                }
                c7922idInvoke.m34027k4(i);
            }
            if (!"".equals(defaultDataLabelFormat.getNumberFormat())) {
                C7314bd c7314bdM34026k4 = c7922idInvoke.m34026k4();
                c7314bdM34026k4.m28823k4(defaultDataLabelFormat.getNumberFormat());
                c7314bdM34026k4.m28822k4(defaultDataLabelFormat.isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
            }
            C7752ge c7752geM34033to = c7922idInvoke.m34033to();
            c7752geM34033to.m32482x1(defaultDataLabelFormat.getShowCategoryName() ? (byte) 1 : (byte) 0);
            c7752geM34033to.m32478k4(defaultDataLabelFormat.getShowSeriesName() ? (byte) 1 : (byte) 0);
            c7752geM34033to.m32480kk(defaultDataLabelFormat.getShowValue() ? (byte) 1 : (byte) 0);
            if (!"".equals(defaultDataLabelFormat.getSeparator())) {
                c7922idInvoke.m34029k4(defaultDataLabelFormat.getSeparator());
            }
            m7649k4(iDataLabelCollection.getParentSeries(), c7922idInvoke, u8sVar);
            if (c13735klM1311x1.m63963x1() != null) {
                c7922idInvoke.m34028k4(c13735klM1311x1.m63963x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7651k4(IDataLabelCollection iDataLabelCollection, C7922id c7922id, gnb gnbVar) {
        DataLabelFormat dataLabelFormat;
        int i;
        if (c7922id == null) {
            return;
        }
        C13735kl c13735klM1311x1 = ((DataLabelCollection) iDataLabelCollection).m1311x1();
        if (c7922id.m34019c5() != null) {
            C14864yx.m74128k4(iDataLabelCollection.getDefaultDataLabelFormat().getFormat(), c7922id.m34019c5(), gnbVar);
        }
        if (c7922id.m34025jd() != null) {
            C13691jl.m63398k4(iDataLabelCollection.getDefaultDataLabelFormat().getTextFormat(), c7922id.m34025jd(), gnbVar);
        }
        boolean z = true;
        switch (c7922id.m34032m9()) {
            case 0:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = -1;
                dataLabelFormat.m1316k4(i);
                break;
            case 1:
                ((DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat()).m1316k4(1);
                break;
            case 2:
                ((DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat()).m1316k4(0);
                break;
            case 3:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 2;
                dataLabelFormat.m1316k4(i);
                break;
            case 4:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 3;
                dataLabelFormat.m1316k4(i);
                break;
            case 5:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 4;
                dataLabelFormat.m1316k4(i);
                break;
            case 6:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 5;
                dataLabelFormat.m1316k4(i);
                break;
            case 7:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 6;
                dataLabelFormat.m1316k4(i);
                break;
            case 8:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 7;
                dataLabelFormat.m1316k4(i);
                break;
            case 9:
                dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
                i = 8;
                dataLabelFormat.m1316k4(i);
                break;
        }
        if (c7922id.m34022dy() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setNumberFormat(c7922id.m34022dy().m28821k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setNumberFormatLinkedToSource(c7922id.m34022dy().m28824x1() == 1);
        }
        if (c7922id.m34031ks() != null) {
            c13735klM1311x1.m63960k4(c7922id.m34031ks());
        }
        if (c7922id.m34023fa() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setSeparator(c7922id.m34023fa());
        }
        IDataLabelFormat defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
        if (c7922id.m34020ck() != null) {
            defaultDataLabelFormat.setShowCategoryName(c7922id.m34020ck().m32481x1() == 1);
            defaultDataLabelFormat.setShowSeriesName(c7922id.m34020ck().m32477k4() == 1);
            if (c7922id.m34020ck().m32479kk() != 1) {
                z = false;
            }
        }
        defaultDataLabelFormat.setShowValue(z);
        if (c7922id.m34034up() != null) {
            for (C8367np c8367np : c7922id.m34034up()) {
                IDataLabel iDataLabelM7648k4 = m7648k4(iDataLabelCollection.getParentSeries(), c8367np.m37789du());
                if (iDataLabelM7648k4 != null) {
                    C0871cv.m4820k4(iDataLabelM7648k4, c8367np, gnbVar);
                }
            }
        }
        if (c7922id.m34036yj() != null) {
            for (C9091w7 c9091w7 : c7922id.m34036yj()) {
                IDataLabel iDataLabelM7648k42 = m7648k4(iDataLabelCollection.getParentSeries(), c9091w7.m43527k4());
                if (iDataLabelM7648k42 != null) {
                    iDataLabelM7648k42.hide();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7652k4(final C7922id c7922id, IDataLabel iDataLabel, long j, IDataLabelCollection iDataLabelCollection, u8s u8sVar) {
        if (C14624u9.m71577k4(iDataLabel, iDataLabelCollection.getDefaultDataLabelFormat())) {
            C0871cv.m4819k4(iDataLabel, new AbstractC4685kk<C8367np>() { // from class: com.aspose.slides.ik.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7922id) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataLabelsElementData.AddDataLabel()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8367np invoke() {
                    return c7922id.m34021du();
                }
            }, j, iDataLabelCollection.getDefaultDataLabelFormat(), u8sVar);
        } else if ((iDataLabelCollection.getDefaultDataLabelFormat().getShowValue() || iDataLabelCollection.getDefaultDataLabelFormat().getShowSeriesName() || iDataLabelCollection.getDefaultDataLabelFormat().getShowCategoryName()) && !iDataLabel.isVisible()) {
            c7922id.m34024h4().m43528k4(j & 4294967295L);
        }
    }
}
