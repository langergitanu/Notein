package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class sm2 extends c0x {

    /* JADX INFO: renamed from: k4 */
    private int f48881k4;

    /* JADX INFO: renamed from: kk */
    private final OdpSerializationContext f48882kk;

    /* JADX INFO: renamed from: x1 */
    private final com.aspose.slides.internal.p332p7.xgo f48883x1;

    public sm2(OdpSerializationContext odpSerializationContext, com.aspose.slides.internal.p332p7.xgo xgoVar) {
        if (xgoVar == null) {
            throw new ArgumentNullException("documentStylesElementData");
        }
        this.f48882kk = odpSerializationContext;
        this.f48883x1 = xgoVar;
        if (m70676k4().m44343du() == null) {
            m70676k4().m44348x1();
        }
        m70671ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m70671ck() {
        com.aspose.slides.internal.p332p7.jlf jlfVar = (com.aspose.slides.internal.p332p7.jlf) m70677m9().m34560k4("page-layout").m29542x1();
        com.aspose.slides.internal.p332p7.axo axoVarM34808k4 = jlfVar.m34808k4();
        com.aspose.slides.internal.p332p7.jlf jlfVar2 = (com.aspose.slides.internal.p332p7.jlf) m70677m9().m34560k4("page-layout").m29542x1();
        com.aspose.slides.internal.p332p7.axo axoVarM34808k42 = jlfVar2.m34808k4();
        jlfVar.m34809k4("pageLayout1");
        jlfVar2.m34809k4("pageLayout3");
        axoVarM34808k4.m28587k4(2);
        axoVarM34808k42.m28587k4(1);
        if (m70678x1().m2051k4().getSlideSize().getOrientation() == 0) {
            axoVarM34808k4.m28588k4(wgi.m72717k4(r8.getSize().getWidth()));
            axoVarM34808k4.m28591x1(wgi.m72717k4(r8.getSize().getHeight()));
            axoVarM34808k42.m28588k4(wgi.m72717k4(r8.getSize().getHeight()));
            axoVarM34808k42.m28591x1(wgi.m72717k4(r8.getSize().getWidth()));
        } else {
            axoVarM34808k42.m28588k4(wgi.m72717k4(r8.getSize().getWidth()));
            axoVarM34808k42.m28591x1(wgi.m72717k4(r8.getSize().getHeight()));
            axoVarM34808k4.m28588k4(wgi.m72717k4(r8.getSize().getHeight()));
            axoVarM34808k4.m28591x1(wgi.m72717k4(r8.getSize().getWidth()));
        }
        com.aspose.slides.internal.p332p7.jlf jlfVar3 = (com.aspose.slides.internal.p332p7.jlf) m70677m9().m34560k4("page-layout").m29542x1();
        com.aspose.slides.internal.p332p7.axo axoVarM34808k43 = jlfVar3.m34808k4();
        jlfVar3.m34809k4("noteLayout1");
        axoVarM34808k43.m28587k4(1);
        INotesSize notesSize = m70678x1().m2051k4().getNotesSize();
        axoVarM34808k43.m28588k4(wgi.m72717k4(notesSize.getSize().getWidth()));
        axoVarM34808k43.m28591x1(wgi.m72717k4(notesSize.getSize().getHeight()));
        m4420du().set_Item("pageLayout1", jlfVar);
        m4420du().set_Item("pageLayout3", jlfVar2);
        m4420du().set_Item("noteLayout1", jlfVar3);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m70672c5() {
        if (m70676k4().m44347to() == null) {
            return 0;
        }
        return m70676k4().m44347to().m36786k4().size() + (m70676k4().m44343du() != null ? m70676k4().m44343du().m34559k4().size() : 0);
    }

    /* JADX INFO: renamed from: dy */
    public final String m70673dy() {
        return (C7019kk.m27469x1(this.f48882kk.m2047dy(), MasterHandoutSlide.class) || C7019kk.m27469x1(this.f48882kk.m2047dy(), MasterNotesSlide.class)) ? "noteLayout1" : this.f48882kk.m2051k4().getSlideSize().getOrientation() == 0 ? "pageLayout1" : "pageLayout3";
    }

    /* JADX INFO: renamed from: h4 */
    public final com.aspose.slides.internal.p332p7.lzc m70674h4() {
        com.aspose.slides.internal.p332p7.lzc lzcVar = (com.aspose.slides.internal.p332p7.lzc) m70677m9().m34560k4("style").m29542x1();
        lzcVar.m36552x1(C14113y2.m67402k4("{0}{1}", "gp", Integer.valueOf(m70672c5())));
        lzcVar.m36547k4(11);
        m4421kk().set_Item(lzcVar.m36546k4(), lzcVar);
        return lzcVar;
    }

    /* JADX INFO: renamed from: jd */
    public final int m70675jd() {
        int i = this.f48881k4 + 1;
        this.f48881k4 = i;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final com.aspose.slides.internal.p332p7.xgo m70676k4() {
        return this.f48883x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final com.aspose.slides.internal.p332p7.j4l m70677m9() {
        return m70676k4().m44343du();
    }

    /* JADX INFO: renamed from: x1 */
    public final OdpSerializationContext m70678x1() {
        return this.f48882kk;
    }
}
