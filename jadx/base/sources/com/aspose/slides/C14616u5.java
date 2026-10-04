package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8985uy;

/* JADX INFO: renamed from: com.aspose.slides.u5 */
/* JADX INFO: loaded from: classes3.dex */
class C14616u5 {
    /* JADX INFO: renamed from: k4 */
    public static void m71484k4(IAxisFormat iAxisFormat, AbstractC4685kk<C8087kh> abstractC4685kk, u8s u8sVar) {
        if (m71487k4(iAxisFormat)) {
            final C8087kh c8087khInvoke = abstractC4685kk.invoke();
            C1169h1.m6956k4(iAxisFormat.getFill(), new C7394ca.k4() { // from class: com.aspose.slides.u5.1
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
            euh.m5726k4(iAxisFormat.getLine(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.u5.2
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
            C1158gq.m6877k4(iAxisFormat.getEffect(), new C7394ca.k4() { // from class: com.aspose.slides.u5.3
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
            m71488x1(iAxisFormat, c8087khInvoke);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m71488x1(IAxisFormat iAxisFormat, C8087kh c8087kh) {
        c8087kh.m35379k4(((AxisFormat) iAxisFormat).m330k4().m64461k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71485k4(IAxisFormat iAxisFormat, C8087kh c8087kh) {
        ((AxisFormat) iAxisFormat).m330k4().m64462k4(c8087kh.m35389up());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71486k4(IAxisFormat iAxisFormat, C8087kh c8087kh, gnb gnbVar) {
        if (c8087kh == null) {
            return;
        }
        if (c8087kh.m35369ck() != null || c8087kh.m35372fa() != null) {
            throw new Exception();
        }
        C1169h1.m6958k4(iAxisFormat.getFill(), c8087kh.m35371dy(), gnbVar);
        euh.m5728k4(iAxisFormat.getLine(), c8087kh.m35368c5());
        C1158gq.m6878k4(iAxisFormat.getEffect(), c8087kh.m35374jd(), gnbVar);
        m71485k4(iAxisFormat, c8087kh);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71487k4(IAxisFormat iAxisFormat) {
        return (iAxisFormat.getFill().getFillType() == -1 && iAxisFormat.getLine().isFormatNotDefined() && iAxisFormat.getEffect().isNoEffects()) ? false : true;
    }
}
