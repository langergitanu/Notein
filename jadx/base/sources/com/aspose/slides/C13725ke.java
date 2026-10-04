package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8741s5;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8970uq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ke */
/* JADX INFO: loaded from: classes3.dex */
class C13725ke {
    /* JADX INFO: renamed from: k4 */
    public static void m63776k4(IChartTitle iChartTitle, C8741s5 c8741s5, gnb gnbVar) {
        boolean zM41467k4;
        if (c8741s5 == null) {
            return;
        }
        ChartTitle chartTitle = (ChartTitle) iChartTitle;
        C0811bb c0811bbM754k4 = chartTitle.m754k4();
        String appVersion = ((DocumentProperties) gnbVar.m6801yj().getDocumentProperties()).getAppVersion();
        boolean z = false;
        if (!C14113y2.m67411k4(appVersion)) {
            String[] strArrM67414k4 = C14113y2.m67414k4(appVersion, FilenameUtils.EXTENSION_SEPARATOR);
            if (strArrM67414k4.length > 0) {
                try {
                    if (C14057f9.m66582k4(strArrM67414k4[0]) <= 12) {
                        z = true;
                    }
                } catch (FormatException unused) {
                }
            }
        }
        boolean zM1344m9 = ((DocumentProperties) gnbVar.m6801yj().getDocumentProperties()).m1344m9();
        if (c8741s5.m40780dy() != null) {
            zM41467k4 = c8741s5.m40780dy().m41467k4();
        } else {
            if (!zM1344m9) {
                iChartTitle.setOverlay(true);
                if (c8741s5.m40781h4() != null && "strRef".equals(c8741s5.m40781h4().m42523k4().m29539k4())) {
                    chartTitle.m754k4().m4119k4(c8741s5.m40781h4());
                }
                C14864yx.m74128k4(iChartTitle.getFormat(), c8741s5.m40777c5(), gnbVar);
                rrr.m70334k4(c0811bbM754k4, c8741s5.m40787m9());
                shm.m70628k4(iChartTitle, c8741s5.m40781h4(), c8741s5.m40782jd(), gnbVar);
                c0811bbM754k4.m4118k4(c8741s5.m40778ck());
            }
            zM41467k4 = !z;
        }
        iChartTitle.setOverlay(zM41467k4);
        if (c8741s5.m40781h4() != null) {
            chartTitle.m754k4().m4119k4(c8741s5.m40781h4());
        }
        C14864yx.m74128k4(iChartTitle.getFormat(), c8741s5.m40777c5(), gnbVar);
        rrr.m70334k4(c0811bbM754k4, c8741s5.m40787m9());
        shm.m70628k4(iChartTitle, c8741s5.m40781h4(), c8741s5.m40782jd(), gnbVar);
        c0811bbM754k4.m4118k4(c8741s5.m40778ck());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63777k4(IChartTitle iChartTitle, final C8741s5 c8741s5, u8s u8sVar) {
        C0811bb c0811bbM754k4 = ((ChartTitle) iChartTitle).m754k4();
        c8741s5.m40786kk().m41466k4(iChartTitle.getOverlay());
        C14864yx.m74127k4(iChartTitle.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.ke.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8741s5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TitleElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c8741s5.m40788to();
            }
        }, u8sVar, null, false);
        rrr.m70333k4(c0811bbM754k4, new AbstractC4685kk<C7943in>() { // from class: com.aspose.slides.ke.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8741s5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TitleElementData.AddLayout()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7943in invoke() {
                return c8741s5.m40789x1();
            }
        });
        if (iChartTitle.getTextFrameForOverriding() != null) {
            IGenericEnumerator<IParagraph> it = iChartTitle.getTextFrameForOverriding().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    ((ParagraphFormat) it.next().getParagraphFormat()).m2187c5().m64012k4(true);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        shm.m70626k4(iChartTitle, new AbstractC4685kk<C8970uq>() { // from class: com.aspose.slides.ke.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8741s5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TitleElementData.AddTx()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8970uq invoke() {
                return c8741s5.m40783k4();
            }
        }, new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.ke.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8741s5) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_TitleElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c8741s5.m40779du();
            }
        }, u8sVar);
        ChartTitle chartTitle = (ChartTitle) iChartTitle;
        if (chartTitle.m754k4().m4114du() != null && c8741s5.m40781h4() == null) {
            c8741s5.m40785k4(chartTitle.m754k4().m4114du());
        }
        c8741s5.m40784k4(c0811bbM754k4.m4115k4());
    }
}
