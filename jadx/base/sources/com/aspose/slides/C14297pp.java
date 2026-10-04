package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7650fa;
import com.aspose.slides.internal.p332p7.AbstractC8968up;
import com.aspose.slides.internal.p332p7.C7964iv;
import com.aspose.slides.internal.p332p7.C8318n9;
import com.aspose.slides.internal.p332p7.C8910tz;

/* JADX INFO: renamed from: com.aspose.slides.pp */
/* JADX INFO: loaded from: classes3.dex */
class C14297pp {
    /* JADX INFO: renamed from: k4 */
    private static void m69180k4(IGraphicalObject iGraphicalObject, AbstractC7650fa abstractC7650fa) {
        GraphicalObject graphicalObject = (GraphicalObject) iGraphicalObject;
        C13722kb c13722kbMo272to = graphicalObject.mo272to();
        if (abstractC7650fa.mo31680x1() != null) {
            nd1 nd1VarMo1214P_ = graphicalObject.mo1214P_();
            tbp tbpVar = new tbp();
            tbp tbpVar2 = new tbp();
            C1258im c1258im = new C1258im();
            tbp[] tbpVarArr = {tbpVar};
            tbp[] tbpVarArr2 = {tbpVar2};
            C1258im[] c1258imArr = {c1258im};
            ai9.m3628k4(abstractC7650fa.mo31680x1(), tbpVarArr, tbpVarArr2, c1258imArr);
            tbpVarArr[0].CloneTo(tbpVar);
            tbpVarArr2[0].CloneTo(tbpVar2);
            c1258imArr[0].CloneTo(c1258im);
            nd1VarMo1214P_.m67987k4(tbpVar.Clone());
            graphicalObject.mo1650kk(tbpVar2.Clone());
            nd1VarMo1214P_.m67986k4(c1258im.Clone());
        }
        c13722kbMo272to.m63743kk(abstractC7650fa.mo31676k4().mo33835x1().m37332kk());
        c13722kbMo272to.m63747to(abstractC7650fa.mo31679to());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69183x1(IGraphicalObject iGraphicalObject, AbstractC7650fa abstractC7650fa, u8s u8sVar) {
        GraphicalObject graphicalObject = (GraphicalObject) iGraphicalObject;
        C13722kb c13722kbMo272to = graphicalObject.mo272to();
        if (C7019kk.m27469x1(abstractC7650fa, com.aspose.slides.internal.p332p7.pij.class)) {
            abstractC7650fa.mo31677k4(c13722kbMo272to.m63746rv());
        } else {
            C7019kk.m27469x1(abstractC7650fa, C8910tz.class);
        }
        ai9.m3626k4(graphicalObject, abstractC7650fa.mo31680x1(), u8sVar.m71531dy());
        abstractC7650fa.mo31676k4().mo33835x1().m37331k4(c13722kbMo272to.m63744ks());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69181k4(IGraphicalObject iGraphicalObject, AbstractC7650fa abstractC7650fa, bjs bjsVar) {
        if (abstractC7650fa == null) {
            return;
        }
        m69180k4(iGraphicalObject, abstractC7650fa);
        AbstractC8968up abstractC8968upMo31676k4 = abstractC7650fa.mo31676k4();
        axn.m3764k4(iGraphicalObject, abstractC8968upMo31676k4.mo33834kk(), bjsVar);
        axn.m3762k4(iGraphicalObject, abstractC8968upMo31676k4.mo33833k4(), bjsVar);
        C13812lw.m64608k4(iGraphicalObject.getGraphicalObjectLock(), abstractC8968upMo31676k4.mo33835x1().m37333x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69182k4(IGraphicalObject iGraphicalObject, AbstractC7650fa abstractC7650fa, u8s u8sVar) {
        AbstractC8968up abstractC8968upMo31676k4 = abstractC7650fa.mo31676k4();
        axn.m3765k4(iGraphicalObject, abstractC8968upMo31676k4.mo33834kk(), u8sVar);
        axn.m3763k4(iGraphicalObject, abstractC8968upMo31676k4.mo33833k4(), u8sVar);
        final C8318n9 c8318n9Mo33835x1 = abstractC8968upMo31676k4.mo33835x1();
        C14883zf.m74500k4((GraphicalObjectLock) iGraphicalObject.getGraphicalObjectLock(), new AbstractC4685kk<C7964iv>() { // from class: com.aspose.slides.pp.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8318n9Mo33835x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualGraphicFramePropertiesElementData.AddGraphicFrameLocks()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7964iv invoke() {
                return c8318n9Mo33835x1.m37330k4();
            }
        });
        m69183x1(iGraphicalObject, abstractC7650fa, u8sVar);
    }
}
