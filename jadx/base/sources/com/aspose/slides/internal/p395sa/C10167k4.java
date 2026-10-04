package com.aspose.slides.internal.p395sa;

import com.aspose.slides.internal.p205ji.C5464rv;
import com.aspose.slides.internal.p452uy.C11566k4;
import com.aspose.slides.p559ms.System.AbstractC14115yd;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.sa.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10167k4 {

    /* JADX INFO: renamed from: k4 */
    private static boolean f36591k4 = true;

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC14083qm m50006k4(AbstractC10169x1 abstractC10169x1) {
        C11566k4 c11566k4 = new C11566k4(abstractC10169x1);
        if (f36591k4) {
            m50009x1(abstractC10169x1, c11566k4);
            return c11566k4;
        }
        m50007k4(abstractC10169x1, c11566k4);
        return c11566k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m50009x1(AbstractC10169x1 abstractC10169x1, C11566k4 c11566k4) {
        C5464rv.m22546k4(new C10168kk(abstractC10169x1, c11566k4));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50007k4(AbstractC10169x1 abstractC10169x1, C11566k4 c11566k4) {
        try {
            abstractC10169x1.beginInvoke();
        } catch (RuntimeException e) {
            abstractC10169x1.getDelegate().setException(e);
        } finally {
            c11566k4.m54569to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m50008k4(AbstractC14115yd abstractC14115yd, InterfaceC14083qm interfaceC14083qm) {
        interfaceC14083qm.mo18731x1().m22558du();
        abstractC14115yd.throwException();
    }
}
