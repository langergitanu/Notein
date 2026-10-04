package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8450ok;
import com.aspose.slides.internal.p332p7.C8828t1;
import com.aspose.slides.internal.p332p7.C8845t9;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class zk1 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50587k4 = new C7017h4(RequestParameters.SUBRESOURCE_DELETE, "txPr");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m74553k4(IChart iChart, AbstractC4685kk<C8845t9> abstractC4685kk, u8s u8sVar) {
        IGenericEnumerator<IChartDataPoint> it;
        if (iChart.hasLegend()) {
            ILegend legend = iChart.getLegend();
            final C8845t9 c8845t9Invoke = abstractC4685kk.invoke();
            c8845t9Invoke.m41603to().m41466k4(legend.getOverlay());
            c8845t9Invoke.m41600k4().m29000k4(legend.getPosition());
            C14864yx.m74127k4(legend.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.zk1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8845t9Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_LegendElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c8845t9Invoke.m41595du();
                }
            }, u8sVar, null, false);
            C13691jl.m63395k4(legend.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.zk1.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8845t9Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_LegendElementData.AddTxPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return c8845t9Invoke.m41598h4();
                }
            }, u8sVar);
            List list = new List();
            if (iChart.getChartData().getSeries().size() == 1 && (gfh.m6622k4((Chart) iChart) || ChartTypeCharacterizer.isChartTypePie(iChart.getChartData().getSeries().get_Item(0).getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(iChart.getChartData().getSeries().get_Item(0).getType()))) {
                it = iChart.getChartData().getSeries().get_Item(0).getDataPoints().iterator();
                while (it.hasNext()) {
                    try {
                        list.addItem((LegendEntryProperties) it.next().getRelatedLegendEntry());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } else {
                List list2 = new List();
                IGenericEnumerator<IChartSeries> it2 = iChart.getChartData().getSeriesGroups().iterator();
                while (it2.hasNext()) {
                    try {
                        it2 = it2.next().getSeries().iterator();
                        while (it2.hasNext()) {
                            try {
                                IChartSeries next = it2.next();
                                list.addItem((LegendEntryProperties) next.getRelatedLegendEntry());
                                if (next.getTrendLines() != null) {
                                    it = next.getTrendLines().iterator();
                                    while (it.hasNext()) {
                                        try {
                                            list2.addItem((LegendEntryProperties) it.next().getRelatedLegendEntry());
                                        } finally {
                                        }
                                    }
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                list.addRange(list2);
            }
            List.Enumerator it3 = list.iterator();
            while (it3.hasNext()) {
                try {
                    LegendEntryProperties legendEntryProperties = (LegendEntryProperties) it3.next();
                    if (legendEntryProperties.getHide() || C13691jl.m63403k4(legendEntryProperties.getTextFormat()) || legendEntryProperties.m1861kk().m3724k4() != null) {
                        final C8450ok c8450okM41605x1 = c8845t9Invoke.m41605x1();
                        c8450okM41605x1.m38315k4().m38333k4(((long) list.indexOf(legendEntryProperties)) & 4294967295L);
                        if (legendEntryProperties.getHide()) {
                            c8450okM41605x1.m38314k4(RequestParameters.SUBRESOURCE_DELETE);
                        } else {
                            C13691jl.m63397k4(legendEntryProperties.getTextFormat(), new C7394ca.k4() { // from class: com.aspose.slides.zk1.3
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c8450okM41605x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_LegendEntryElementData.AddDeleteOrContent(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str) {
                                    return c8450okM41605x1.m38314k4(str);
                                }
                            }, "txPr", u8sVar);
                        }
                        c8450okM41605x1.m38316k4(legendEntryProperties.m1861kk().m3724k4());
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                it3.dispose();
            }
            m74556x1(legend, c8845t9Invoke);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74556x1(ILegend iLegend, final C8845t9 c8845t9) {
        ffv ffvVarM1859k4 = ((Legend) iLegend).m1859k4();
        rrr.m70333k4(ffvVarM1859k4, new AbstractC4685kk<C7943in>() { // from class: com.aspose.slides.zk1.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8845t9) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_LegendElementData.AddLayout()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7943in invoke() {
                return c8845t9.m41601kk();
            }
        });
        ffvVarM1859k4.m6154k4(c8845t9.m41604up());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m74554k4(IChart iChart, C8845t9 c8845t9, gnb gnbVar) {
        boolean z;
        boolean zM41467k4;
        String appVersion;
        if (c8845t9 == null) {
            iChart.setLegend(false);
            return;
        }
        iChart.setLegend(true);
        ILegend legend = iChart.getLegend();
        m74555k4(legend, c8845t9);
        if (c8845t9.m41599jd() != null) {
            zM41467k4 = c8845t9.m41599jd().m41467k4();
        } else {
            Slide slide = (Slide) C7019kk.m27452k4((Object) iChart.getSlide(), Slide.class);
            if (slide == null || (appVersion = ((DocumentProperties) slide.getPresentation().getDocumentProperties()).getAppVersion()) == null || C14113y2.m67363du(appVersion, C14113y2.f47374k4)) {
                z = false;
                zM41467k4 = !z;
            } else {
                String[] strArrM67414k4 = C14113y2.m67414k4(appVersion, FilenameUtils.EXTENSION_SEPARATOR);
                if (strArrM67414k4.length > 0) {
                    try {
                        if (C14057f9.m66582k4(strArrM67414k4[0]) <= 12) {
                            z = true;
                        }
                    } catch (FormatException unused) {
                    }
                    zM41467k4 = !z;
                }
            }
        }
        legend.setOverlay(zM41467k4);
        if (c8845t9.m41602m9() != null) {
            legend.setPosition(c8845t9.m41602m9().m28999k4());
        }
        C14864yx.m74128k4(legend.getFormat(), c8845t9.m41594ck(), gnbVar);
        C13691jl.m63398k4(legend.getTextFormat(), c8845t9.m41597fa(), gnbVar);
        for (C8450ok c8450ok : c8845t9.m41596dy()) {
            if ((c8450ok.m38315k4().m38332k4() & 4294967295L) < legend.getEntries().getCount()) {
                ILegendEntryProperties iLegendEntryProperties = legend.getEntries().get_Item((int) c8450ok.m38315k4().m38332k4());
                C7394ca c7394caM38318x1 = c8450ok.m38318x1();
                if (c7394caM38318x1 != null) {
                    int iM27428k4 = f50587k4.m27428k4(c7394caM38318x1.m29539k4());
                    if (iM27428k4 == 0) {
                        iLegendEntryProperties.setHide(((C8828t1) c7394caM38318x1.m29542x1()).m41467k4());
                    } else {
                        if (iM27428k4 != 1) {
                            throw new Exception(C14113y2.m67408k4("Unknown element: ", c7394caM38318x1.m29539k4()));
                        }
                        C13691jl.m63398k4(iLegendEntryProperties.getTextFormat(), (C8952ug) c7394caM38318x1.m29542x1(), gnbVar);
                    }
                }
                ((LegendEntryProperties) iLegendEntryProperties).m1861kk().m3725k4(c8450ok.m38317kk());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74555k4(ILegend iLegend, C8845t9 c8845t9) {
        ffv ffvVarM1859k4 = ((Legend) iLegend).m1859k4();
        rrr.m70334k4(ffvVarM1859k4, c8845t9.m41593c5());
        ffvVarM1859k4.m6154k4(c8845t9.m41604up());
    }
}
