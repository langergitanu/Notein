package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7251ai;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11860yg;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class mfs {
    /* JADX INFO: renamed from: k4 */
    public static void m64872k4(Ink ink, com.aspose.slides.internal.p332p7.jbq jbqVar, bjs bjsVar) {
        if (jbqVar == null) {
            return;
        }
        new ral(bjsVar.m4229k4().m55338u4().m55303k4(jbqVar.m34637to()).m55296x1(), bjsVar.m4229k4()).m70042k4(ink);
        axn.m3764k4(ink, jbqVar.m34631du().m29764kk(), bjsVar);
        axn.m3762k4(ink, jbqVar.m34631du().m29762k4(), bjsVar);
        ink.setBlackWhiteMode(jbqVar.m34636kk());
        if (jbqVar.m34632h4() != null) {
            tbp tbpVar = new tbp();
            tbp tbpVar2 = new tbp();
            C1258im c1258im = new C1258im();
            tbp[] tbpVarArr = {tbpVar};
            tbp[] tbpVarArr2 = {tbpVar2};
            C1258im[] c1258imArr = {c1258im};
            ai9.m3628k4(jbqVar.m34632h4(), tbpVarArr, tbpVarArr2, c1258imArr);
            tbpVarArr[0].CloneTo(tbpVar);
            tbpVarArr2[0].CloneTo(tbpVar2);
            c1258imArr[0].CloneTo(c1258im);
            nd1 nd1VarM2548dq = ink.m2548dq();
            nd1VarM2548dq.m67987k4(tbpVar.Clone());
            ink.mo1650kk(tbpVar2.Clone());
            nd1VarM2548dq.m67986k4(c1258im.Clone());
        }
        ink.m1772k4(jbqVar.m34631du().m29765x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64873k4(Ink ink, com.aspose.slides.internal.p332p7.jbq jbqVar, final u8s u8sVar) {
        new C7251ai();
        C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4(C14113y2.m67408k4("/", u8sVar.m71531dy() ? "drs" : "ppt", "/ink/ink{0}.xml"), new AbstractC11760jd.k4() { // from class: com.aspose.slides.mfs.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextInkFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVar.m71528ck();
            }
        }, new C11860yg());
        new ral(c11791osM55394k4, u8sVar).m70043k4(ink, jbqVar, u8sVar);
        jbqVar.m34635k4(u8sVar.m55433g8().m55311x1(c11791osM55394k4).m55289du());
        jbqVar.m34634k4(ink.getBlackWhiteMode());
        com.aspose.slides.internal.p332p7.cs2 cs2VarM34633k4 = jbqVar.m34633k4();
        cs2VarM34633k4.m29763k4(ink.m1775to());
        axn.m3765k4(ink, cs2VarM34633k4.m29764kk(), u8sVar);
        axn.m3763k4(ink, cs2VarM34633k4.m29762k4(), u8sVar);
        ai9.m3624k4(ink.getFrame(), jbqVar.m34638x1());
    }
}
