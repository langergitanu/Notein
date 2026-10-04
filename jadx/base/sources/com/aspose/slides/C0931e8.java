package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8740s4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.e8 */
/* JADX INFO: loaded from: classes3.dex */
class C0931e8 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4719k4 = new C7017h4("bgPr", "bgRef");

    /* JADX INFO: renamed from: k4 */
    public static void m5378k4(IBackground iBackground, AbstractC4685kk<com.aspose.slides.internal.p332p7.e7g> abstractC4685kk, u8s u8sVar) {
        if (iBackground == null || iBackground.getType() == -1) {
            return;
        }
        C0816bg c0816bgM338to = ((Background) iBackground).m338to();
        com.aspose.slides.internal.p332p7.e7g e7gVarInvoke = abstractC4685kk.invoke();
        e7gVarInvoke.m30807k4(c0816bgM338to.m4203k4());
        byte type = iBackground.getType();
        if (type == 0) {
            final C8740s4 c8740s4 = (C8740s4) e7gVarInvoke.m30806k4("bgRef").m29542x1();
            C1246ib.m7609k4(iBackground.getStyleColor(), new C7394ca.k4() { // from class: com.aspose.slides.e8.3
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
            c8740s4.m40767k4(c0816bgM338to.m4202du());
        } else {
            if (type != 1) {
                throw new Exception();
            }
            final com.aspose.slides.internal.p332p7.q1f q1fVar = (com.aspose.slides.internal.p332p7.q1f) e7gVarInvoke.m30806k4("bgPr").m29542x1();
            C1169h1.m6956k4(iBackground.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.e8.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(q1fVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_BackgroundPropertiesElementData.AddFillProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return q1fVar.m39293x1(str);
                }
            }, u8sVar);
            C1158gq.m6877k4(iBackground.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.e8.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(q1fVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_BackgroundPropertiesElementData.AddEffectProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return q1fVar.m39286k4(str);
                }
            }, u8sVar);
            q1fVar.m39288k4(c0816bgM338to.m4209kk());
            q1fVar.m39287k4(c0816bgM338to.m4211x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5379k4(IBackground iBackground, com.aspose.slides.internal.p332p7.e7g e7gVar, gnb gnbVar) {
        if (e7gVar == null) {
            return;
        }
        C0816bg c0816bgM338to = ((Background) iBackground).m338to();
        c0816bgM338to.m4204k4(e7gVar.m30805k4());
        int iM27428k4 = f4719k4.m27428k4(e7gVar.m30808x1().m29539k4());
        if (iM27428k4 != 0) {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", e7gVar.m30808x1().m29539k4(), "\""));
            }
            C8740s4 c8740s4 = (C8740s4) e7gVar.m30808x1().m29542x1();
            iBackground.setType((byte) 0);
            c0816bgM338to.m4205k4(c8740s4.m40765k4());
            C1246ib.m7610k4(iBackground.getStyleColor(), c8740s4.m40769x1());
            return;
        }
        com.aspose.slides.internal.p332p7.q1f q1fVar = (com.aspose.slides.internal.p332p7.q1f) e7gVar.m30808x1().m29542x1();
        iBackground.setType((byte) 1);
        C1169h1.m6958k4(iBackground.getFillFormat(), q1fVar.m39292x1(), gnbVar);
        C1158gq.m6878k4(iBackground.getEffectFormat(), q1fVar.m39290kk(), gnbVar);
        c0816bgM338to.m4208k4(q1fVar.m39289k4());
        if (c0816bgM338to.m4209kk() && iBackground.getFillFormat().getFillType() == 2) {
            c0816bgM338to.m4206k4(((BaseSlide) iBackground.getSlide()).m391k4((byte) 0));
            if (c0816bgM338to.m4210to() == null) {
                c0816bgM338to.m4206k4(((BaseSlide) iBackground.getSlide()).m391k4((byte) 2));
            }
        }
        c0816bgM338to.m4207k4(q1fVar.m39291to());
    }
}
