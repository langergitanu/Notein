package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7529e1;
import com.aspose.slides.internal.p332p7.C7782go;
import com.aspose.slides.internal.p332p7.C8195ll;
import com.aspose.slides.internal.p332p7.C8824sy;

/* JADX INFO: renamed from: com.aspose.slides.tw */
/* JADX INFO: loaded from: classes3.dex */
class C14579tw {
    /* JADX INFO: renamed from: k4 */
    public static MathBar m71339k4(C8824sy c8824sy, gnb gnbVar) {
        if (c8824sy == null) {
            throw new ArgumentNullException("elementData");
        }
        MathBar mathBar = new MathBar(jz7.m63584k4(c8824sy.m41447x1(), gnbVar));
        if (c8824sy.m41445k4() != null) {
            if (c8824sy.m41445k4().m30737x1() != null) {
                mathBar.setPosition(C14649ut.m71897rv(c8824sy.m41445k4().m30737x1().m36220k4()));
            }
            C13727kg.m63827k4(mathBar.f2722k4, c8824sy.m41445k4().m30736kk(), gnbVar);
        }
        return mathBar;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71340k4(MathBar mathBar, C8824sy c8824sy, u8s u8sVar) {
        if (mathBar == null) {
            throw new ArgumentNullException("domObject");
        }
        if (c8824sy == null) {
            throw new ArgumentNullException("elementData");
        }
        final C7529e1 c7529e1 = new C7529e1();
        C8195ll c8195ll = new C8195ll();
        c8195ll.m36221k4(C14649ut.m71895ks(mathBar.getPosition()));
        c7529e1.m30735k4(c8195ll);
        C13727kg.m63826k4(mathBar.f2722k4, new AbstractC4685kk<C7782go>() { // from class: com.aspose.slides.tw.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7529e1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.m_CT_BarPrElementData.AddCtrlPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7782go invoke() {
                return c7529e1.m30734k4();
            }
        }, u8sVar);
        c8824sy.m41446k4(c7529e1);
        jz7.m63587k4(c8824sy.m41447x1(), mathBar.getBase(), u8sVar);
    }
}
