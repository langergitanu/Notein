package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8442oh;
import com.aspose.slides.internal.p332p7.C8453om;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8985uy;

/* JADX INFO: renamed from: com.aspose.slides.p6 */
/* JADX INFO: loaded from: classes3.dex */
class C14268p6 {
    /* JADX INFO: renamed from: k4 */
    private static void m68949k4(ChartDataPoint chartDataPoint, AbstractC4685kk<C8087kh> abstractC4685kk, u8s u8sVar) {
        IFormat iFormatM584h4 = chartDataPoint.m584h4();
        IFormat format = chartDataPoint.getFormat();
        IFillFormat fill = format.getFill().getFillType() == -1 ? iFormatM584h4.getFill() : format.getFill();
        ILineFormat line = format.getLine().isFormatNotDefined() ? iFormatM584h4.getLine() : format.getLine();
        IEffectFormat effect = format.getEffect().isNoEffects() ? iFormatM584h4.getEffect() : format.getEffect();
        IThreeDFormat effect3D = b6z.m4035k4(format.getEffect3D(), true) ? format.getEffect3D() : iFormatM584h4.getEffect3D();
        final C8087kh c8087khInvoke = abstractC4685kk.invoke();
        C1169h1.m6956k4(fill, new C7394ca.k4() { // from class: com.aspose.slides.p6.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khInvoke;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8087khInvoke.m35390x1(str);
            }
        }, u8sVar);
        euh.m5726k4(line, new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.p6.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khInvoke;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8087khInvoke.m35391x1();
            }
        });
        C1158gq.m6877k4(effect, new C7394ca.k4() { // from class: com.aspose.slides.p6.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khInvoke;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8087khInvoke.m35375k4(str);
            }
        }, u8sVar);
        b6z.m4032k4(effect3D, new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.p6.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khInvoke;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8820sx invoke() {
                return c8087khInvoke.m35385kk();
            }
        }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.p6.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khInvoke;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8638qy invoke() {
                return c8087khInvoke.m35388to();
            }
        }, (AbstractC4685kk<C7317be>) null);
        c8087khInvoke.m35379k4(((Format) chartDataPoint.getFormat()).m1556to().m4044k4());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m68954x1(IChartDataPoint iChartDataPoint, C8442oh c8442oh, gnb gnbVar) {
        C13822m6 c13822m6M590kk = ((ChartDataPoint) iChartDataPoint).m590kk();
        iChartDataPoint.setInvertIfNegative(c8442oh.m38264m9() != null ? c8442oh.m38264m9().m41467k4() : !C13831md.m64855k4(gnbVar));
        c13822m6M590kk.m64769k4(c8442oh.m38257fa());
        c13822m6M590kk.m64768k4(c8442oh.m38266up());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68950k4(IChartDataPoint iChartDataPoint, AbstractC4685kk<C8442oh> abstractC4685kk, long j, long j2, u8s u8sVar) {
        ChartDataPoint chartDataPoint = (ChartDataPoint) iChartDataPoint;
        if (abstractC4685kk == null || !m68953k4(chartDataPoint)) {
            return;
        }
        final C8442oh c8442ohInvoke = abstractC4685kk.invoke();
        c8442ohInvoke.m38258h4().m38333k4(j);
        if (iChartDataPoint.isBubble3D()) {
            c8442ohInvoke.m38263kk();
        }
        if (iChartDataPoint.getExplosion() != -1) {
            c8442ohInvoke.m38265to().m38333k4(((long) iChartDataPoint.getExplosion()) & 4294967295L);
        }
        if (chartDataPoint.m593m9()) {
            m68949k4(chartDataPoint, new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.p6.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8442ohInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DPtElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8442ohInvoke.m38255du();
                }
            }, u8sVar);
        } else {
            C14864yx.m74127k4(iChartDataPoint.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.p6.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8442ohInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DPtElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8442ohInvoke.m38255du();
                }
            }, u8sVar, null, false);
        }
        v9z.m72101k4(iChartDataPoint.getMarker(), new AbstractC4685kk<C8453om>() { // from class: com.aspose.slides.p6.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8442ohInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DPtElementData.AddMarker()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8453om invoke() {
                return c8442ohInvoke.m38267x1();
            }
        }, u8sVar);
        m68951k4(iChartDataPoint, c8442ohInvoke);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68951k4(IChartDataPoint iChartDataPoint, C8442oh c8442oh) {
        C13822m6 c13822m6M590kk = ((ChartDataPoint) iChartDataPoint).m590kk();
        c8442oh.m38260k4();
        c8442oh.m38264m9().m41466k4(iChartDataPoint.getInvertIfNegative());
        c8442oh.m38262k4(c13822m6M590kk.m64766k4());
        c8442oh.m38261k4(c13822m6M590kk.m64771x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68952k4(IChartDataPoint iChartDataPoint, C8442oh c8442oh, gnb gnbVar) {
        if (c8442oh == null) {
            return;
        }
        if (c8442oh.m38253c5() != null) {
            iChartDataPoint.setBubble3D(c8442oh.m38253c5().m41467k4());
        }
        if (c8442oh.m38259jd() != null) {
            iChartDataPoint.setExplosion((int) c8442oh.m38259jd().m38332k4());
        }
        C14864yx.m74128k4(iChartDataPoint.getFormat(), c8442oh.m38254ck(), gnbVar);
        v9z.m72102k4(iChartDataPoint.getMarker(), c8442oh.m38256dy(), gnbVar);
        m68954x1(iChartDataPoint, c8442oh, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m68953k4(ChartDataPoint chartDataPoint) {
        C13822m6 c13822m6M590kk = chartDataPoint.m590kk();
        ChartSeries chartSeriesM640x1 = chartDataPoint.m596to().m640x1();
        if (chartDataPoint.isBubble3D() || chartDataPoint.getExplosion() != -1) {
            return true;
        }
        if ((chartDataPoint.m586k4() == null || !C14864yx.m74129k4(chartDataPoint.getFormat(), null)) && !chartDataPoint.m593m9()) {
            return ((chartDataPoint.m599x1() == null || !v9z.m72103k4(chartDataPoint.getMarker())) && chartDataPoint.getInvertIfNegative() == chartSeriesM640x1.getInvertIfNegative() && c13822m6M590kk.m64766k4() == null && c13822m6M590kk.m64771x1() == null) ? false : true;
        }
        return true;
    }
}
