package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8070kb;
import com.aspose.slides.internal.p332p7.C8195ll;
import com.aspose.slides.internal.p332p7.C8376ns;
import com.aspose.slides.internal.p332p7.C8539pp;

/* JADX INFO: renamed from: com.aspose.slides.mn */
/* JADX INFO: loaded from: classes3.dex */
class C13843mn {
    /* JADX INFO: renamed from: k4 */
    public static MathGroupingCharacter m64924k4(C8539pp c8539pp, gnb gnbVar) {
        char cM37838k4;
        int iM71897rv;
        if (c8539pp == null) {
            throw new ArgumentNullException("elementData");
        }
        if (c8539pp.m39040k4() != null) {
            cM37838k4 = c8539pp.m39040k4().m35258x1() != null ? c8539pp.m39040k4().m35258x1().m37838k4() : (char) 0;
            int iM71897rv2 = c8539pp.m39040k4().m35256kk() != null ? C14649ut.m71897rv(c8539pp.m39040k4().m35256kk().m36220k4()) : 2;
            iM71897rv = c8539pp.m39040k4().m35257to() != null ? C14649ut.m71897rv(c8539pp.m39040k4().m35257to().m36220k4()) : 2;
            i = iM71897rv2;
        } else {
            cM37838k4 = 9183;
            iM71897rv = 1;
        }
        MathGroupingCharacter mathGroupingCharacter = new MathGroupingCharacter(jz7.m63584k4(c8539pp.m39042x1(), gnbVar), cM37838k4, i, iM71897rv);
        if (c8539pp.m39040k4() != null) {
            C13727kg.m63827k4(mathGroupingCharacter.f2765k4, c8539pp.m39040k4().m35252du(), gnbVar);
        }
        return mathGroupingCharacter;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64925k4(MathGroupingCharacter mathGroupingCharacter, C8539pp c8539pp, u8s u8sVar) {
        if (mathGroupingCharacter == null) {
            throw new ArgumentNullException("domObject");
        }
        if (c8539pp == null) {
            throw new ArgumentNullException("elementData");
        }
        final C8070kb c8070kb = new C8070kb();
        C8195ll c8195ll = new C8195ll();
        c8195ll.m36221k4(C14649ut.m71895ks(mathGroupingCharacter.getPosition()));
        c8070kb.m35254k4(c8195ll);
        C8195ll c8195ll2 = new C8195ll();
        c8195ll2.m36221k4(C14649ut.m71895ks(mathGroupingCharacter.getVerticalJustification()));
        c8070kb.m35259x1(c8195ll2);
        C8376ns c8376ns = new C8376ns();
        c8376ns.m37839k4(mathGroupingCharacter.getCharacter());
        c8070kb.m35255k4(c8376ns);
        C13727kg.m63826k4(mathGroupingCharacter.f2765k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.mn.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8070kb) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_GroupChrPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c8070kb.m35253k4();
            }
        }, u8sVar);
        c8539pp.m39041k4(c8070kb);
        jz7.m63587k4(c8539pp.m39042x1(), mathGroupingCharacter.getBase(), u8sVar);
    }
}
