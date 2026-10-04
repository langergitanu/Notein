package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7868hn;
import com.aspose.slides.internal.p332p7.C8740s4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class phl {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48059k4 = new C7017h4("effect", "effectRef");

    /* JADX INFO: renamed from: k4 */
    public static void m69055k4(za9 za9Var, C7394ca.k4 k4Var, u8s u8sVar) {
        byte bM74365k4 = za9Var.m74365k4();
        if (bM74365k4 == 1) {
            final C7868hn c7868hn = (C7868hn) k4Var.mo2788k4("effect").m29542x1();
            C1158gq.m6877k4(za9Var.m74370x1(), new C7394ca.k4() { // from class: com.aspose.slides.phl.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c7868hn) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_EffectPropertiesElementData.AddEffectProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c7868hn.m33527k4(str);
                }
            }, u8sVar);
        } else {
            if (bM74365k4 != 2) {
                return;
            }
            final C8740s4 c8740s4 = (C8740s4) k4Var.mo2788k4("effectRef").m29542x1();
            C1246ib.m7609k4(za9Var.m74368kk(), new C7394ca.k4() { // from class: com.aspose.slides.phl.3
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
            c8740s4.m40767k4(za9Var.m74369to());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69056k4(final za9 za9Var, C7394ca c7394ca, gnb gnbVar) {
        if (c7394ca == null) {
            return;
        }
        za9Var.m74367k4(0L);
        za9Var.m74366k4((byte) 0);
        int iM27428k4 = f48059k4.m27428k4(c7394ca.m29539k4());
        if (iM27428k4 == 0) {
            C7868hn c7868hn = (C7868hn) c7394ca.m29542x1();
            za9Var.m74366k4((byte) 1);
            C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.phl.1
                @Override // com.aspose.slides.C1158gq.k4
                /* JADX INFO: renamed from: k4 */
                public IEffectFormat mo3774k4() {
                    return za9Var.m74370x1();
                }
            }, c7868hn.m33526k4(), gnbVar);
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
            }
            C8740s4 c8740s4 = (C8740s4) c7394ca.m29542x1();
            za9Var.m74366k4((byte) 2);
            C1246ib.m7610k4(za9Var.m74368kk(), c8740s4.m40769x1());
            za9Var.m74367k4(c8740s4.m40765k4());
        }
    }
}
