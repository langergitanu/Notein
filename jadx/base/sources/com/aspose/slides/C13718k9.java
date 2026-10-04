package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7571eh;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8985uy;

/* JADX INFO: renamed from: com.aspose.slides.k9 */
/* JADX INFO: loaded from: classes3.dex */
class C13718k9 {
    /* JADX INFO: renamed from: k4 */
    public static void m63721k4(IChartLinesFormat iChartLinesFormat, C7571eh c7571eh, gnb gnbVar) {
        C8087kh c8087khM31083x1;
        iChartLinesFormat.getLine().getFillFormat().setFillType(c7571eh == null ? (byte) 0 : (byte) -1);
        if (c7571eh == null || (c8087khM31083x1 = c7571eh.m31083x1()) == null) {
            return;
        }
        ikd.m7666k4(iChartLinesFormat.getLine().getFillFormat(), c8087khM31083x1.m35371dy());
        if (c8087khM31083x1.m35369ck() != null || c8087khM31083x1.m35372fa() != null) {
            throw new NotImplementedException();
        }
        euh.m5728k4(iChartLinesFormat.getLine(), c8087khM31083x1.m35368c5());
        C1158gq.m6878k4(iChartLinesFormat.getEffect(), c8087khM31083x1.m35374jd(), gnbVar);
        ((ChartLinesFormat) iChartLinesFormat).m708k4().m74514k4(c8087khM31083x1.m35389up());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63722k4(IChartLinesFormat iChartLinesFormat, C7571eh c7571eh, u8s u8sVar) {
        if (c7571eh == null || iChartLinesFormat == null) {
            return;
        }
        if (iChartLinesFormat.getLine().isFormatNotDefined() && iChartLinesFormat.getEffect().isNoEffects()) {
            return;
        }
        final C8087kh c8087khM31082k4 = c7571eh.m31082k4();
        euh.m5726k4(iChartLinesFormat.getLine(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.k9.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khM31082k4;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8985uy invoke() {
                return c8087khM31082k4.m35391x1();
            }
        });
        C1158gq.m6877k4(iChartLinesFormat.getEffect(), new C7394ca.k4() { // from class: com.aspose.slides.k9.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                new StringBuilder();
                C8087kh c8087kh = c8087khM31082k4;
                return StringBuffer.toString();
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8087khM31082k4.m35375k4(str);
            }
        }, u8sVar);
        c8087khM31082k4.m35379k4(((ChartLinesFormat) iChartLinesFormat).m708k4().m74513k4());
    }
}
