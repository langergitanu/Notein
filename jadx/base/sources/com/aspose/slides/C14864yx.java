package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.yx */
/* JADX INFO: loaded from: classes3.dex */
class C14864yx {
    /* JADX INFO: renamed from: k4 */
    public static void m74127k4(IFormat iFormat, AbstractC4685kk<C8087kh> abstractC4685kk, u8s u8sVar, Object obj, boolean z) {
        if (z || m74129k4(iFormat, obj)) {
            final C8087kh c8087khInvoke = abstractC4685kk.invoke();
            C1169h1.m6956k4(iFormat.getFill(), new C7394ca.k4() { // from class: com.aspose.slides.yx.1
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
            euh.m5726k4(iFormat.getLine(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.yx.2
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
            C1158gq.m6877k4(iFormat.getEffect(), new C7394ca.k4() { // from class: com.aspose.slides.yx.3
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
            b6z.m4032k4(iFormat.getEffect3D(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.yx.4
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
            }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.yx.5
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
            c8087khInvoke.m35379k4(((Format) iFormat).m1556to().m4044k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74128k4(IFormat iFormat, C8087kh c8087kh, gnb gnbVar) {
        if (c8087kh == null) {
            return;
        }
        C1169h1.m6958k4(iFormat.getFill(), c8087kh.m35371dy(), gnbVar);
        euh.m5728k4(iFormat.getLine(), c8087kh.m35368c5());
        C1158gq.m6878k4(iFormat.getEffect(), c8087kh.m35374jd(), gnbVar);
        b6z.m4033k4(iFormat.getEffect3D(), c8087kh.m35369ck(), c8087kh.m35372fa(), (C7317be) null);
        ((Format) iFormat).m1556to().m4045k4(c8087kh.m35389up());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m74129k4(IFormat iFormat, Object obj) {
        boolean z = (iFormat.getFill().getFillType() == -1 && iFormat.getLine().isFormatNotDefined() && iFormat.getEffect().isNoEffects() && !b6z.m4035k4(iFormat.getEffect3D(), true)) ? false : true;
        if (C7019kk.m27469x1(obj, DataLabel.class)) {
            DataLabel dataLabel = (DataLabel) C7019kk.m27452k4(obj, DataLabel.class);
            if (dataLabel.m1302m9() != null && dataLabel.m1302m9().getParagraphs().getCount() != 0 && ((TextFrame) dataLabel.m1302m9()).f3519k4.getRotationAngle() != 0.0f && !C14064he.m66715kk(((TextFrame) dataLabel.m1302m9()).f3519k4.getRotationAngle())) {
                return true;
            }
        }
        return z;
    }
}
