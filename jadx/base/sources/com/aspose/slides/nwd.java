package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7886hx;
import com.aspose.slides.internal.p332p7.C8740s4;

/* JADX INFO: loaded from: classes3.dex */
class nwd {
    /* JADX INFO: renamed from: k4 */
    public static void m68238k4(faf fafVar, C7394ca.k4 k4Var, u8s u8sVar) {
        byte bM6069to = fafVar.m6069to();
        if (bM6069to == 1) {
            final C7886hx c7886hx = (C7886hx) k4Var.mo2788k4("fill").m29542x1();
            C1169h1.m6957k4(fafVar.m6070x1(), new C7394ca.k4() { // from class: com.aspose.slides.nwd.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7886hx) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_FillPropertiesElementData.AddFillProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7886hx.m33656k4(str);
                }
            }, true, u8sVar);
        } else {
            if (bM6069to != 2) {
                return;
            }
            final C8740s4 c8740s4 = (C8740s4) k4Var.mo2788k4("fillRef").m29542x1();
            C1246ib.m7609k4(fafVar.m6068kk(), new C7394ca.k4() { // from class: com.aspose.slides.nwd.2
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
            c8740s4.m40767k4(fafVar.m6063k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68239k4(faf fafVar, C7394ca c7394ca, gnb gnbVar) {
        if (c7394ca == null) {
            return;
        }
        if ("fill".equals(c7394ca.m29539k4())) {
            fafVar.m6066k4((byte) 1);
            C1169h1.m6958k4(fafVar.m6070x1(), ((C7886hx) c7394ca.m29542x1()).m33655k4(), gnbVar);
        } else {
            if (!"fillRef".equals(c7394ca.m29539k4())) {
                throw new Exception();
            }
            fafVar.m6066k4((byte) 2);
            C8740s4 c8740s4 = (C8740s4) c7394ca.m29542x1();
            C1246ib.m7610k4(fafVar.m6068kk(), c8740s4.m40769x1());
            fafVar.m6067k4(c8740s4.m40765k4());
        }
    }
}
