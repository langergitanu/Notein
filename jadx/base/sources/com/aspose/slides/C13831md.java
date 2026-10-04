package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8986uz;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7380c6;
import com.aspose.slides.internal.p332p7.C7635f4;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C7948ip;
import com.aspose.slides.internal.p332p7.C8037js;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8178lf;
import com.aspose.slides.internal.p332p7.C8256md;
import com.aspose.slides.internal.p332p7.C8262mg;
import com.aspose.slides.internal.p332p7.C8442oh;
import com.aspose.slides.internal.p332p7.C8453om;
import com.aspose.slides.internal.p332p7.C8589qa;
import com.aspose.slides.internal.p332p7.C8806su;
import com.aspose.slides.internal.p332p7.C8827t0;
import com.aspose.slides.internal.p332p7.C9115wi;
import com.aspose.slides.internal.p332p7.C9398zs;
import com.aspose.slides.internal.p332p7.InterfaceC8466os;
import com.aspose.slides.internal.p332p7.InterfaceC8885tq;
import com.aspose.slides.internal.p332p7.InterfaceC9040vh;
import com.aspose.slides.internal.p332p7.InterfaceC9088w6;
import com.aspose.slides.internal.p332p7.InterfaceC9238xw;
import com.aspose.slides.internal.p332p7.InterfaceC9374zj;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.md */
/* JADX INFO: loaded from: classes3.dex */
class C13831md {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC13703jv m64847k4(IChartSeries iChartSeries, int i) {
        if (i == 0) {
            return ((ChartData) iChartSeries.getChart().getChartData()).m553x1().mo5710kk() == 2 ? new zqr() : new C1084fb();
        }
        if (i == 1) {
            return new vy9();
        }
        if (i == 2) {
            return new C14645uq();
        }
        throw new InvalidOperationException("Unknown data source type");
    }

    /* JADX INFO: renamed from: x1 */
    private static void m64857x1(IChartSeries iChartSeries, C8806su c8806su, gnb gnbVar) {
        IChartSeries iChartSeries2;
        gnb gnbVar2;
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        C14371r3.m70014k4(chartSeries.getErrorBarsYFormat(), c8806su, gnbVar);
        if (chartSeries.getErrorBarsYFormat().getValueType() == 0) {
            if (c8806su.m41311fa() != null) {
                iChartSeries2 = iChartSeries;
                gnbVar2 = gnbVar;
                m64847k4(iChartSeries, c8806su.m41311fa().mo34167k4()).mo6079k4(iChartSeries2, c8806su.m41311fa(), 7, gnbVar2, false);
            } else {
                iChartSeries2 = iChartSeries;
                gnbVar2 = gnbVar;
            }
            if (c8806su.m41308ck() != null) {
                m64847k4(iChartSeries2, c8806su.m41308ck().mo34167k4()).mo6079k4(iChartSeries2, c8806su.m41308ck(), 6, gnbVar2, false);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m64848k4(C7935ij c7935ij) {
        return c7935ij != null ? m64850k4(c7935ij.m34170to()) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m64849k4(C8262mg c8262mg) {
        return c8262mg != null ? m64850k4(c8262mg.m36931to()) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m64850k4(String str) {
        return str != null ? "Standard".equals(str) ? "General" : str : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64851k4(IChartSeries iChartSeries, C8806su c8806su, gnb gnbVar) {
        IChartSeries iChartSeries2;
        gnb gnbVar2;
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        C14371r3.m70014k4(chartSeries.getErrorBarsXFormat(), c8806su, gnbVar);
        if (chartSeries.getErrorBarsXFormat().getValueType() == 0) {
            if (c8806su.m41311fa() != null) {
                iChartSeries2 = iChartSeries;
                gnbVar2 = gnbVar;
                m64847k4(iChartSeries, c8806su.m41311fa().mo34167k4()).mo6079k4(iChartSeries2, c8806su.m41311fa(), 5, gnbVar2, false);
            } else {
                iChartSeries2 = iChartSeries;
                gnbVar2 = gnbVar;
            }
            if (c8806su.m41308ck() != null) {
                m64847k4(iChartSeries2, c8806su.m41308ck().mo34167k4()).mo6079k4(iChartSeries2, c8806su.m41308ck(), 4, gnbVar2, false);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64852k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl, gnb gnbVar) {
        if (abstractC9120wl.mo30755ar() != null) {
            for (C8806su c8806su : abstractC9120wl.mo30755ar()) {
                if (c8806su.m41318m9().m35296k4() == 1) {
                    m64851k4(iChartSeries, c8806su, gnbVar);
                } else if (c8806su.m41318m9().m35296k4() == 2) {
                    m64857x1(iChartSeries, c8806su, gnbVar);
                }
            }
            return;
        }
        if (abstractC9120wl.mo43745um() != null) {
            C8806su c8806suMo43745um = abstractC9120wl.mo43745um();
            if (c8806suMo43745um.m41318m9() != null) {
                if (c8806suMo43745um.m41318m9().m35296k4() == 1) {
                    m64851k4(iChartSeries, c8806suMo43745um, gnbVar);
                    return;
                } else {
                    if (c8806suMo43745um.m41318m9().m35296k4() == 2) {
                        m64857x1(iChartSeries, c8806suMo43745um, gnbVar);
                        return;
                    }
                    return;
                }
            }
            if (ChartTypeCharacterizer.isErrorBarsXAllowed(iChartSeries.getType()) && !ChartTypeCharacterizer.isErrorBarsYAllowed(iChartSeries.getType())) {
                m64851k4(iChartSeries, c8806suMo43745um, gnbVar);
                return;
            }
            if (!ChartTypeCharacterizer.isErrorBarsXAllowed(iChartSeries.getType()) && ChartTypeCharacterizer.isErrorBarsYAllowed(iChartSeries.getType())) {
                m64857x1(iChartSeries, c8806suMo43745um, gnbVar);
            } else if ((!ChartTypeCharacterizer.isErrorBarsXAllowed(iChartSeries.getType()) && !ChartTypeCharacterizer.isErrorBarsYAllowed(iChartSeries.getType())) || (ChartTypeCharacterizer.isErrorBarsXAllowed(iChartSeries.getType()) && ChartTypeCharacterizer.isErrorBarsYAllowed(iChartSeries.getType()))) {
                throw new Exception("illegal situation");
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64853k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl, AbstractC8986uz abstractC8986uz, C14144mu c14144mu) {
        IChartSeries iChartSeries2;
        if (abstractC9120wl == null) {
            throw new Exception("seriesElementData must not be null.");
        }
        gnb gnbVarM4229k4 = c14144mu.m67731k4().m4229k4();
        C13821m5 c13821m5M726k4 = ((ChartSeries) iChartSeries).m726k4();
        c13821m5M726k4.m64751k4(abstractC9120wl.mo30763k4().m38332k4());
        iChartSeries.setOrder((int) abstractC9120wl.mo30775x1().m38332k4());
        C14764x4.m73098k4(iChartSeries, abstractC9120wl);
        C14864yx.m74128k4(iChartSeries.getFormat(), abstractC9120wl.mo30765kk(), gnbVarM4229k4);
        v9z.m72102k4(iChartSeries.getMarker(), abstractC9120wl.aF_(), gnbVarM4229k4);
        c13821m5M726k4.m64754k4(abstractC9120wl.mo34722qq());
        if (abstractC9120wl.mo39414v4() != null) {
            iChartSeries.setInvertIfNegative(abstractC9120wl.mo39414v4().m41467k4());
        } else if (m64855k4(gnbVarM4229k4)) {
            iChartSeries.setInvertIfNegative(false);
        }
        if (abstractC8986uz.mo42397b3() != null) {
            iChartSeries.setSmooth(abstractC8986uz.mo42397b3().m41467k4());
        }
        if (abstractC9120wl.mo30769rv() != null) {
            iChartSeries.setSmooth(abstractC9120wl.mo30769rv().m41467k4());
        }
        if (abstractC9120wl.mo30773uz() != null) {
            for (C8037js c8037js : abstractC9120wl.mo30773uz()) {
                adk.m3503k4(iChartSeries.getTrendLines().add(c8037js.m34937fa().m41074k4()), c8037js, gnbVarM4229k4);
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, C9398zs.class)) {
            C9398zs c9398zs = (C9398zs) abstractC9120wl;
            if (C7019kk.m27469x1(abstractC8986uz, C7635f4.class)) {
                if (abstractC8986uz.mo31605c6() != null) {
                    iChartSeries.setBar3DShape(abstractC8986uz.mo31605c6().m35219k4());
                }
                if (c9398zs.mo43744b3() != null) {
                    iChartSeries.setBar3DShape(c9398zs.mo43744b3().m35219k4());
                }
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, C8178lf.class)) {
            C8178lf c8178lf = (C8178lf) abstractC9120wl;
            if (c8178lf.mo36036lr() != null) {
                iChartSeries.setExplosion((int) c8178lf.mo36036lr().m38332k4());
            }
        }
        boolean z = c14144mu.m67734kk().m39351m9() == null && C14430s2.m70429k4(abstractC8986uz, c14144mu);
        if (abstractC9120wl.aB_() != null) {
            iChartSeries2 = iChartSeries;
            m64847k4(iChartSeries, abstractC9120wl.aB_().mo34167k4()).mo6079k4(iChartSeries2, abstractC9120wl.aB_(), 0, gnbVarM4229k4, z);
        } else {
            iChartSeries2 = iChartSeries;
        }
        if (abstractC9120wl.aC_() != null) {
            m64847k4(iChartSeries2, abstractC9120wl.aC_().mo34167k4()).mo6079k4(iChartSeries2, abstractC9120wl.aC_(), 1, gnbVarM4229k4, z);
        }
        if (abstractC9120wl.aL_() != null) {
            m64847k4(iChartSeries2, abstractC9120wl.aL_().mo34167k4()).mo6079k4(iChartSeries2, abstractC9120wl.aL_(), 2, gnbVarM4229k4, z);
        }
        if (abstractC9120wl.aH_() != null) {
            m64847k4(iChartSeries2, abstractC9120wl.aH_().mo34167k4()).mo6079k4(iChartSeries2, abstractC9120wl.aH_(), 3, gnbVarM4229k4, z);
        }
        m64852k4(iChartSeries2, abstractC9120wl, gnbVarM4229k4);
        iChartSeries2.setNumberFormatOfValues(m64849k4(abstractC9120wl.aH_()));
        iChartSeries2.setNumberFormatOfXValues(m64848k4(abstractC9120wl.aB_()));
        iChartSeries2.setNumberFormatOfYValues(m64849k4(abstractC9120wl.aC_()));
        iChartSeries2.setNumberFormatOfBubbleSizes(m64849k4(abstractC9120wl.aL_()));
        int size = iChartSeries2.getDataPoints().size();
        if (abstractC9120wl.mo30761ix() != null) {
            ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) iChartSeries2.getDataPoints();
            for (int i = 0; i < abstractC9120wl.mo30761ix().length; i++) {
                C8442oh c8442oh = abstractC9120wl.mo30761ix()[i];
                final long[] jArr = {c8442oh.m38258h4().m38332k4()};
                ChartDataPoint chartDataPoint = (ChartDataPoint) C7019kk.m27452k4((Object) chartDataPointCollection.m621k4(new AbstractC14041ai<IChartDataPoint>() { // from class: com.aspose.slides.md.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public boolean invoke(IChartDataPoint iChartDataPoint) {
                        return iChartDataPoint.getIndex() == jArr[0];
                    }
                }), ChartDataPoint.class);
                if (chartDataPoint == null) {
                    chartDataPoint = (ChartDataPoint) chartDataPointCollection.m618k4();
                    chartDataPoint.m588k4(jArr[0]);
                }
                C14268p6.m68952k4(chartDataPoint, c8442oh, gnbVarM4229k4);
            }
        }
        C14711vu.m72547k4(iChartSeries2.getLabels(), abstractC8986uz.mo28508c5(), gnbVarM4229k4);
        C14711vu.m72547k4(iChartSeries2.getLabels(), abstractC9120wl.mo30776x6(), gnbVarM4229k4);
        if (size < iChartSeries2.getDataPoints().size()) {
            while (size < iChartSeries2.getDataPoints().size()) {
                ((ChartDataPoint) iChartSeries2.getDataPoints().get_Item(size)).m589k4(true);
                size++;
            }
        }
        c13821m5M726k4.m64753k4(abstractC9120wl.mo30758du());
        C8256md c8256mdM34354k4 = C7948ip.m34354k4(abstractC9120wl.mo30758du());
        if (c8256mdM34354k4 != null) {
            C1246ib.m7610k4(iChartSeries2.getInvertedSolidFillColor(), c8256mdM34354k4.m36799k4());
        }
        C14764x4.m73099x1(iChartSeries2, abstractC9120wl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m64854k4(IChartSeries iChartSeries, final AbstractC9120wl abstractC9120wl, AbstractC8986uz abstractC8986uz, C14786xh c14786xh) throws Throwable {
        Class<IDisposable> cls;
        String strM1296k4;
        C13821m5 c13821m5M726k4 = ((ChartSeries) iChartSeries).m726k4();
        u8s u8sVarM70580k4 = c14786xh.m73359k4().m70580k4();
        abstractC9120wl.mo30763k4().m38333k4(c13821m5M726k4.m64750k4());
        long j = 4294967295L;
        abstractC9120wl.mo30775x1().m38333k4(((long) iChartSeries.getOrder()) & 4294967295L);
        m64847k4(iChartSeries, iChartSeries.getName().getDataSourceType()).mo6080k4(iChartSeries, abstractC9120wl);
        C14864yx.m74127k4(iChartSeries.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.md.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC9120wl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseChartSeriesElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return abstractC9120wl.mo30770to();
            }
        }, u8sVarM70580k4, null, false);
        v9z.m72101k4(iChartSeries.getMarker(), new AbstractC4685kk<C8453om>() { // from class: com.aspose.slides.md.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC9120wl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseChartSeriesElementData.AddMarker()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8453om invoke() {
                return abstractC9120wl.mo30766ks();
            }
        }, u8sVarM70580k4);
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC9374zj.class)) {
            ((InterfaceC9374zj) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC9374zj.class)).mo34721k4(c13821m5M726k4.m64761x1());
        }
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        if (chartSeries.getErrorBarsXFormat() != null && chartSeries.getErrorBarsXFormat().isVisible()) {
            C8806su c8806suMo30756bv = abstractC9120wl.mo30756bv();
            c8806suMo30756bv.m41314k4().m35297k4(1);
            C14371r3.m70015k4(chartSeries.getErrorBarsXFormat(), c8806suMo30756bv, u8sVarM70580k4);
            if (chartSeries.getErrorBarsXFormat().getValueType() == 0) {
                m64847k4(iChartSeries, ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXMinusValues()).mo6078k4(iChartSeries, c8806suMo30756bv.m41319to(), 5);
                m64847k4(iChartSeries, ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForXPlusValues()).mo6078k4(iChartSeries, c8806suMo30756bv.m41316kk(), 4);
            }
        }
        int i = 2;
        if (chartSeries.getErrorBarsYFormat() != null && chartSeries.getErrorBarsYFormat().isVisible()) {
            C8806su c8806suMo30756bv2 = abstractC9120wl.mo30756bv();
            c8806suMo30756bv2.m41314k4().m35297k4(2);
            C14371r3.m70015k4(chartSeries.getErrorBarsYFormat(), c8806suMo30756bv2, u8sVarM70580k4);
            if (chartSeries.getErrorBarsYFormat().getValueType() == 0) {
                m64847k4(iChartSeries, ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYMinusValues()).mo6078k4(iChartSeries, c8806suMo30756bv2.m41319to(), 7);
                m64847k4(iChartSeries, ((ChartDataPointCollection) iChartSeries.getDataPoints()).getDataSourceTypeForErrorBarsCustomValues().getDataSourceTypeForYPlusValues()).mo6078k4(iChartSeries, c8806suMo30756bv2.m41316kk(), 6);
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC9238xw.class)) {
            ((InterfaceC9238xw) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC9238xw.class)).mo39416yj().m41466k4(iChartSeries.getInvertIfNegative());
        }
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC9040vh.class)) {
            ((InterfaceC9040vh) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC9040vh.class)).mo30772up().m41466k4(iChartSeries.getSmooth());
        }
        Class<IDisposable> cls2 = IDisposable.class;
        if (iChartSeries.getTrendLines() != null) {
            IGenericEnumerator<ITrendline> it = iChartSeries.getTrendLines().iterator();
            while (it.hasNext()) {
                try {
                    adk.m3504k4(it.next(), abstractC9120wl.mo30774wl(), u8sVarM70580k4);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, cls2)) {
                        it.dispose();
                    }
                }
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, C9398zs.class)) {
            C9398zs c9398zs = (C9398zs) abstractC9120wl;
            if (iChartSeries.getBar3DShape() != -1) {
                c9398zs.mo43746wy().m35220k4(iChartSeries.getBar3DShape());
            }
        } else if (C7019kk.m27469x1(abstractC9120wl, C8178lf.class)) {
            C8178lf c8178lf = (C8178lf) abstractC9120wl;
            if (iChartSeries.getExplosion() != 0) {
                c8178lf.mo36037yd().m38333k4(((long) iChartSeries.getExplosion()) & 4294967295L);
            }
        } else if (C7019kk.m27469x1(abstractC9120wl, C8589qa.class)) {
            ((C8589qa) abstractC9120wl).mo39413dq().m41466k4(iChartSeries.getType() == 69);
        }
        C14711vu.m72546k4(iChartSeries.getLabels(), new AbstractC4685kk<C9115wi>() { // from class: com.aspose.slides.md.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC9120wl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseChartSeriesElementData.AddDLbls()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9115wi invoke() {
                return abstractC9120wl.mo30768ne();
            }
        }, u8sVarM70580k4);
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC8885tq.class)) {
            final InterfaceC8885tq interfaceC8885tq = (InterfaceC8885tq) abstractC9120wl;
            if (!iChartSeries.getPlotOnSecondAxis() || !iChartSeries.getChart().getChartData().getUseSecondaryCategories()) {
                C1233hz.m7335k4(iChartSeries.getChart().getChartData().getCategories(), new AbstractC4685kk<C7935ij>() { // from class: com.aspose.slides.md.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(interfaceC8885tq) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.IHasAddVal.AddCat()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7935ij invoke() {
                        return interfaceC8885tq.mo34720fa();
                    }
                }, (ChartData) iChartSeries.getChart().getChartData());
            } else {
                C1233hz.m7335k4(iChartSeries.getChart().getChartData().getSecondaryCategories(), new AbstractC4685kk<C7935ij>() { // from class: com.aspose.slides.md.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(interfaceC8885tq) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.IHasAddVal.AddCat()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7935ij invoke() {
                        return interfaceC8885tq.mo34720fa();
                    }
                }, (ChartData) iChartSeries.getChart().getChartData());
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC9088w6.class)) {
            AbstractC13703jv abstractC13703jvM64847k4 = m64847k4(iChartSeries, iChartSeries.getDataPoints().getDataSourceTypeForXValues());
            if (abstractC13703jvM64847k4.mo6081k4(iChartSeries, 0)) {
                abstractC13703jvM64847k4.mo6078k4(iChartSeries, ((InterfaceC9088w6) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC9088w6.class)).mo30757c5(), 0);
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC8466os.class)) {
            AbstractC13703jv abstractC13703jvM64847k42 = m64847k4(iChartSeries, iChartSeries.getDataPoints().getDataSourceTypeForYValues());
            if (abstractC13703jvM64847k42.mo6081k4(iChartSeries, 1)) {
                abstractC13703jvM64847k42.mo6078k4(iChartSeries, ((InterfaceC8466os) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC8466os.class)).mo30762jd(), 1);
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, C8589qa.class)) {
            AbstractC13703jv abstractC13703jvM64847k43 = m64847k4(iChartSeries, iChartSeries.getDataPoints().getDataSourceTypeForBubbleSizes());
            if (abstractC13703jvM64847k43.mo6081k4(iChartSeries, 2)) {
                abstractC13703jvM64847k43.mo6078k4(iChartSeries, ((C8589qa) C7019kk.m27452k4((Object) abstractC9120wl, C8589qa.class)).m39415xk(), 2);
            }
        }
        if (C7019kk.m27469x1(abstractC9120wl, InterfaceC8885tq.class)) {
            AbstractC13703jv abstractC13703jvM64847k44 = m64847k4(iChartSeries, iChartSeries.getDataPoints().getDataSourceTypeForValues());
            if (abstractC13703jvM64847k44.mo6081k4(iChartSeries, 3)) {
                abstractC13703jvM64847k44.mo6078k4(iChartSeries, ((InterfaceC8885tq) C7019kk.m27452k4((Object) abstractC9120wl, InterfaceC8885tq.class)).mo34719ck(), 3);
            }
        }
        IGenericEnumerator<IChartDataPoint> it2 = iChartSeries.getDataPoints().iterator();
        while (it2.hasNext()) {
            try {
                IChartDataPoint next = it2.next();
                Class<IDisposable> cls3 = cls2;
                try {
                    long j2 = j;
                    cls = cls3;
                    try {
                        C14268p6.m68950k4(next, new AbstractC4685kk<C8442oh>() { // from class: com.aspose.slides.md.7
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(abstractC9120wl) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseChartSeriesElementData.AddDPt()";
                            }

                            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                            public C8442oh invoke() {
                                return abstractC9120wl.mo30771u4();
                            }
                        }, next.getIndex(), ((long) iChartSeries.getDataPoints().size()) & j2, u8sVarM70580k4);
                        i = 2;
                        cls2 = cls;
                        j = j2;
                    } catch (Throwable th) {
                        th = th;
                        if (C7019kk.m27456k4((Iterator) it2, cls)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cls = cls3;
                }
            } catch (Throwable th3) {
                th = th3;
                cls = cls2;
            }
        }
        int i2 = i;
        if (C7019kk.m27456k4((Iterator) it2, cls2)) {
            it2.dispose();
        }
        abstractC9120wl.mo30764k4(c13821m5M726k4.m64758kk());
        if (iChartSeries.getFormat().getFill().getFillType() == 1 && iChartSeries.getInvertedSolidFillColor().getColorType() != -1) {
            String strM66587k4 = C14057f9.m66587k4(((ColorFormat) iChartSeries.getInvertedSolidFillColor()).m1084to().m56506h4() & 16777215, "X6");
            if (abstractC9120wl.mo30758du() == null) {
                abstractC9120wl.mo30760h4();
            }
            C7948ip.m34356k4(abstractC9120wl.mo30758du(), strM66587k4);
        }
        ChartData chartData = (ChartData) iChartSeries.getChart().getChartData();
        List list = new List();
        if (iChartSeries.getLabels().getDefaultDataLabelFormat().getShowLabelValueFromCell()) {
            if (abstractC9120wl.mo30758du() == null) {
                abstractC9120wl.mo30760h4();
            }
            for (int i3 = 0; i3 < iChartSeries.getLabels().getCount(); i3++) {
                if (chartData.m553x1().mo5710kk() == i2) {
                    if (iChartSeries.getLabels().get_Item(i3).getValueFromCell() == null || iChartSeries.getLabels().get_Item(i3).getValueFromCell().getValue() == null) {
                        list.addItem(null);
                    } else {
                        strM1296k4 = iChartSeries.getLabels().get_Item(i3).getValueFromCell().getValue().toString();
                    }
                } else {
                    strM1296k4 = ((DataLabel) C7019kk.m27452k4((Object) iChartSeries.getLabels().get_Item(i3), DataLabel.class)).m1296k4();
                }
                list.addItem(strM1296k4);
            }
        }
        C7380c6.m29435k4(abstractC9120wl.mo30758du(), iChartSeries.getLabels(), chartData.m553x1().mo5710kk() == i2 ? ((DataLabelCollection) iChartSeries.getLabels()).m1309kk() : ((DataLabelCollection) iChartSeries.getLabels()).m1307k4(), list);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64855k4(gnb gnbVar) {
        String appVersion = ((DocumentProperties) gnbVar.m6801yj().getDocumentProperties()).getAppVersion();
        if (!C14113y2.m67411k4(appVersion)) {
            String[] strArrM67414k4 = C14113y2.m67414k4(appVersion, FilenameUtils.EXTENSION_SEPARATOR);
            if (strArrM67414k4.length > 0) {
                try {
                    if (C14057f9.m66582k4(strArrM67414k4[0]) <= 12) {
                        return true;
                    }
                } catch (FormatException unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64856k4(AbstractC8986uz abstractC8986uz, C14144mu c14144mu) {
        List<Integer> listM69679k4 = C14350qk.m69679k4(c14144mu);
        int i = 0;
        for (C8827t0 c8827t0 : abstractC8986uz.aE_()) {
            if (listM69679k4.containsItem(Integer.valueOf(c8827t0.m41464k4()))) {
                i++;
            }
        }
        if (i == 0) {
            return false;
        }
        if (i <= abstractC8986uz.aE_().length) {
            return true;
        }
        throw new Exception();
    }
}
