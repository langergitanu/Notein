package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8605qj;
import com.aspose.slides.internal.p332p7.C8740s4;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ur7 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49374k4 = new C7017h4("ln", "lnRef");

    /* JADX INFO: renamed from: k4 */
    public static void m71856k4(tx4 tx4Var, AbstractC4685kk<C8605qj> abstractC4685kk) {
        if (tx4Var.m71384k4() == 0) {
            return;
        }
        C8605qj c8605qjInvoke = abstractC4685kk.invoke();
        byte bM71384k4 = tx4Var.m71384k4();
        if (bM71384k4 == 1) {
            euh.m5730x1(tx4Var.m71390x1(), (C8985uy) c8605qjInvoke.m39522k4("ln").m29542x1());
        } else {
            if (bM71384k4 != 2) {
                return;
            }
            final C8740s4 c8740s4 = (C8740s4) c8605qjInvoke.m39522k4("lnRef").m29542x1();
            C1246ib.m7609k4(tx4Var.m71388kk(), new C7394ca.k4() { // from class: com.aspose.slides.ur7.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8740s4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StyleMatrixReferenceElementData.AddColor(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8740s4.m40766k4(str);
                }
            });
            c8740s4.m40767k4(tx4Var.m71389to());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71857k4(tx4 tx4Var, C8605qj c8605qj) {
        if (c8605qj == null) {
            return;
        }
        tx4Var.m71387k4(0L);
        tx4Var.m71386k4((byte) 0);
        if (c8605qj.m39521k4() != null) {
            int iM27428k4 = f49374k4.m27428k4(c8605qj.m39521k4().m29539k4());
            if (iM27428k4 == 0) {
                C8985uy c8985uy = (C8985uy) c8605qj.m39521k4().m29542x1();
                tx4Var.m71386k4((byte) 1);
                euh.m5728k4(tx4Var.m71390x1(), c8985uy);
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c8605qj.m39521k4().m29539k4(), "\""));
                }
                C8740s4 c8740s4 = (C8740s4) c8605qj.m39521k4().m29542x1();
                tx4Var.m71386k4((byte) 2);
                C1246ib.m7610k4(tx4Var.m71388kk(), c8740s4.m40769x1());
                tx4Var.m71387k4(c8740s4.m40765k4());
            }
        }
    }
}
