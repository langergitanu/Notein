package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C9296ym;

/* JADX INFO: renamed from: com.aspose.slides.pr */
/* JADX INFO: loaded from: classes3.dex */
class C14299pr {
    /* JADX INFO: renamed from: k4 */
    public static void m69195k4(ChartDataPointLevel chartDataPointLevel, AbstractC4685kk<C9296ym> abstractC4685kk, u8s u8sVar) {
        if (abstractC4685kk == null || chartDataPointLevel.getFormat() == null || !C14864yx.m74129k4(chartDataPointLevel.getFormat(), null)) {
            return;
        }
        final C9296ym c9296ymInvoke = abstractC4685kk.invoke();
        c9296ymInvoke.m45058k4(((long) chartDataPointLevel.m646dy()) & 4294967295L);
        C14864yx.m74127k4(chartDataPointLevel.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pr.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9296ymInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataPointElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c9296ymInvoke.m45057k4();
            }
        }, u8sVar, null, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69196k4(IChartDataPoint iChartDataPoint, AbstractC4685kk<C9296ym> abstractC4685kk, long j, u8s u8sVar) {
        if (abstractC4685kk == null || !C14864yx.m74129k4(iChartDataPoint.getFormat(), null)) {
            return;
        }
        final C9296ym c9296ymInvoke = abstractC4685kk.invoke();
        c9296ymInvoke.m45058k4(j);
        c9296ymInvoke.m45059k4(((ChartDataPoint) iChartDataPoint).m590kk().m64770kk());
        C14864yx.m74127k4(iChartDataPoint.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pr.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9296ymInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataPointElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c9296ymInvoke.m45057k4();
            }
        }, u8sVar, null, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69197k4(IChartDataPoint iChartDataPoint, C9296ym c9296ym, gnb gnbVar) {
        if (c9296ym == null) {
            return;
        }
        C14864yx.m74128k4(iChartDataPoint.getFormat(), c9296ym.m45060kk(), gnbVar);
        ((ChartDataPoint) iChartDataPoint).m590kk().m64767k4(c9296ym.m45061to());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69198k4(C0791b3 c0791b3, AbstractC4685kk<C9296ym> abstractC4685kk, long j, u8s u8sVar) {
        if (abstractC4685kk == null || c0791b3.m3949dy() == null || !C14864yx.m74129k4(c0791b3.m3949dy(), null)) {
            return;
        }
        final C9296ym c9296ymInvoke = abstractC4685kk.invoke();
        c9296ymInvoke.m45058k4(j);
        C14864yx.m74127k4(c0791b3.m3949dy(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.pr.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9296ymInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_DataPointElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c9296ymInvoke.m45057k4();
            }
        }, u8sVar, null, false);
    }
}
