package com.aspose.slides.internal.p258lv;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p138fu.C4129ks;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10958h4;
import com.aspose.slides.internal.p420th.C10959ix;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10967qq;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p460vf.C11641x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p504xm.C12553to;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C6231ar extends AbstractC10972up {

    /* JADX INFO: renamed from: h4 */
    private C3173h4 f17656h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f17657k4;

    /* JADX INFO: renamed from: x1 */
    private C6258x1 f17661x1;

    /* JADX INFO: renamed from: kk */
    private Stack<C6245lr> f17658kk = new Stack<>();

    /* JADX INFO: renamed from: to */
    private C4317dy f17660to = new C4317dy();

    /* JADX INFO: renamed from: du */
    private C11641x1 f17655du = new C11641x1();

    /* JADX INFO: renamed from: m9 */
    private long f17659m9 = 19;

    public C6231ar(AbstractC3150x6 abstractC3150x6, C3173h4 c3173h4, C6244ks c6244ks) {
        this.f17656h4 = new C3173h4();
        this.f17657k4 = abstractC3150x6;
        this.f17661x1 = new C6258x1(new C3152yj(), c6244ks);
        this.f17656h4 = c3173h4;
        this.f17660to.m17336k4(20.0f, 20.0f, 0);
    }

    /* JADX INFO: renamed from: k4 */
    private C6245lr m25226k4(C10959ix c10959ix, C6245lr c6245lr) {
        C6258x1 c6258x1 = this.f17661x1;
        C6245lr c6245lr2 = new C6245lr(c6258x1, c6258x1.m25404x1());
        c6245lr.m25344k4(c6245lr2.m25346x1(), new C4317dy(), C14113y2.m67402k4("hyperlink{0}", Short.valueOf(c6245lr2.m25346x1())));
        this.f17661x1.m25391h4().m25356k4(c6245lr2.m25346x1(), c10959ix);
        this.f17661x1.m25391h4().m25355k4(c6245lr2);
        return c6245lr2;
    }

    /* JADX INFO: renamed from: kk */
    private static C4327up m25230kk(C10970u4 c10970u4) {
        C4327up c4327up = new C4327up(c10970u4.m53082to());
        c4327up.m17386k4(4);
        C4317dy c4317dy = new C4317dy();
        C12553to c12553toM58492ix = C12549du.m58492ix(c10970u4.m53082to());
        c4317dy.m17336k4(c10970u4.m53083x1().m56699x1() / c12553toM58492ix.m58544k4(), c10970u4.m53083x1().m56697kk() / c12553toM58492ix.m58547x1(), 0);
        c4327up.m17387k4(c4317dy);
        return c4327up;
    }

    /* JADX INFO: renamed from: to */
    private C6245lr m25232to() {
        return this.f17658kk.peek();
    }

    /* JADX INFO: renamed from: x1 */
    private void m25233x1() {
        boolean zM25322k4;
        int iM25351k4;
        int iM25359x1;
        C6241jd c6241jd = new C6241jd(this.f17661x1);
        if (this.f17661x1.m25391h4() != null) {
            zM25322k4 = this.f17661x1.m25401kk().m25322k4();
            iM25351k4 = this.f17661x1.m25391h4().m25351k4();
            iM25359x1 = this.f17661x1.m25391h4().m25359x1();
        } else {
            zM25322k4 = this.f17661x1.m25401kk().m25322k4();
            iM25351k4 = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            iM25359x1 = 12000;
        }
        c6241jd.m25274k4(zM25322k4, iM25351k4, iM25359x1);
        this.f17659m9 = this.f17661x1.m25403to().m25292x1().m13442k4().getPosition() - 2;
        new C6250to(this.f17661x1).m25363k4();
        new C6261yj(this.f17661x1).m25416k4(this.f17656h4);
        if (this.f17661x1.m25401kk().m25340x1()) {
            this.f17661x1.m25401kk().m25318k4(65535);
            this.f17661x1.m25401kk().m25336uz().clear();
            this.f17661x1.m25401kk().m25336uz().addItem("actualSizeBtn", "Actual size");
            this.f17661x1.m25401kk().m25336uz().addItem("fitToHeighthBtn", "Fit to height");
            this.f17661x1.m25401kk().m25336uz().addItem("fitToWidthBtn", "Fit to width");
            this.f17661x1.m25401kk().m25336uz().addItem("zoomOutBtn", "Zoom out");
            this.f17661x1.m25401kk().m25336uz().addItem("zoomInBtn", "Zoom in");
            this.f17661x1.m25401kk().m25336uz().addItem("selectionModeSwitcher", "Text selection mode");
            this.f17661x1.m25401kk().m25336uz().addItem("dragModeSwitcher", "Page drag mode");
            this.f17661x1.m25401kk().m25336uz().addItem("singlePageContLayoutBtn", "Enable page scrolling");
            this.f17661x1.m25401kk().m25336uz().addItem("singlePageLayoutBtn", "Single page view");
            this.f17661x1.m25401kk().m25336uz().addItem("twoPageContLayoutBtn", "Two page scrolling");
            this.f17661x1.m25401kk().m25336uz().addItem("twoPageLayoutBtn", "Two page view");
            this.f17661x1.m25401kk().m25336uz().addItem("readModeBtn", "Enable read mode");
            this.f17661x1.m25401kk().m25336uz().addItem("fsBtn", "Switch full screen mode");
            this.f17661x1.m25401kk().m25336uz().addItem("decrementButton", "Previous page");
            this.f17661x1.m25401kk().m25336uz().addItem("textDisplay", "Enter value");
            this.f17661x1.m25401kk().m25336uz().addItem("incrementButton", "Next page");
            this.f17661x1.m25401kk().m25336uz().addItem("searchField", "Enter search term");
            this.f17661x1.m25401kk().m25336uz().addItem("searchBtn", "Search/Next entry");
            this.f17661x1.m25401kk().m25302ar().clear();
            this.f17661x1.m25401kk().m25302ar().addItem("closeBtn", "Exit read mode");
            this.f17661x1.m25401kk().m25337wl().clear();
            this.f17661x1.m25401kk().m25337wl().addItem("aboutBtn", "About this application");
            this.f17661x1.m25401kk().m25337wl().addItem("pagePreviewPane", "Page preview");
            this.f17661x1.m25401kk().m25337wl().addItem("collapsePanelBtn", "Collapse Panel");
            this.f17661x1.m25401kk().m25337wl().addItem("toc", "Document map");
            this.f17661x1.m25403to().m25290k4(C6252um.m25365k4());
            this.f17661x1.m25392k4();
        }
    }

    /* JADX INFO: renamed from: kk */
    private C6245lr m25231kk() {
        return this.f17658kk.pop();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25235k4() {
        m25233x1();
        C6258x1 c6258x1 = this.f17661x1;
        c6258x1.m25397k4(c6258x1.m25401kk().m25340x1());
        this.f17661x1.m25403to().m25283k4(0, 0);
        AbstractC3150x6 abstractC3150x6M13442k4 = this.f17661x1.m25403to().m25292x1().m13442k4();
        abstractC3150x6M13442k4.setPosition(4L);
        this.f17661x1.m25403to().m25291kk((int) abstractC3150x6M13442k4.getLength());
        abstractC3150x6M13442k4.setPosition(this.f17659m9);
        this.f17661x1.m25403to().m25293x1((short) (this.f17661x1.m25389du().size() + (this.f17661x1.m25401kk().m25340x1() ? 2 : 0)));
        abstractC3150x6M13442k4.setPosition(0L);
        if (this.f17661x1.m25401kk().m25322k4()) {
            m25227k4(abstractC3150x6M13442k4);
        } else {
            C12565ks.m58615k4(abstractC3150x6M13442k4, this.f17657k4);
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo16981x1(C10948ar c10948ar) {
        this.f17661x1.m25391h4().m25355k4(m25231kk());
        C6245lr c6245lrM25231kk = m25231kk();
        if (this.f17661x1.m25401kk().m25314h4()) {
            C10971um c10971um = new C10971um();
            C10950bv c10950bv = new C10950bv();
            c10950bv.m52899x1(new C12007ix(0.0f, 0.0f, c10948ar.m52876x1(), c10948ar.m52874kk()));
            c10950bv.m52895k4(true);
            c10971um.m52930k4(c10950bv);
            c10971um.m53101k4(new C4318fa(C5656k4.f15629ze));
            c10971um.m53100k4(new C4320jd(new C4318fa(C5656k4.f15518dy), 1.0f));
            c6245lrM25231kk.m25345k4(this.f17661x1.m25391h4().m25353k4(c10971um), this.f17660to, C14113y2.f47374k4, false);
        }
        this.f17661x1.m25393k4(c6245lrM25231kk);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25227k4(AbstractC3150x6 abstractC3150x6) {
        C6242k4 c6242k4 = new C6242k4(this.f17657k4);
        byte[] bArr = new byte[8];
        abstractC3150x6.read(bArr, 0, 8);
        c6242k4.m25290k4(bArr);
        int length = (int) (abstractC3150x6.getLength() - ((long) 8));
        byte[] bArr2 = new byte[length];
        abstractC3150x6.read(bArr2, 0, length);
        c6242k4.m25290k4(C4129ks.m16568k4(bArr2, 1));
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13530x1(C10951c5 c10951c5) {
        this.f17661x1.m25391h4().m25355k4(m25231kk());
    }

    /* JADX INFO: renamed from: k4 */
    private void m25228k4(C6245lr c6245lr) {
        this.f17658kk.push(c6245lr);
    }

    /* JADX INFO: renamed from: x1 */
    private void m25234x1(C10970u4 c10970u4) {
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52899x1(new C12007ix(0.0f, 0.0f, c10970u4.m53083x1().m56699x1(), c10970u4.m53083x1().m56697kk()));
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        c10971um.m53101k4(m25230kk(c10970u4));
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17349x1(c10970u4.m53072k4().m56897x1(), c10970u4.m53072k4().m56895kk(), 0);
        C6245lr c6245lrM25232to = m25232to();
        if (c10970u4.m53081m9() != null) {
            c6245lrM25232to = m25226k4(c10970u4.m53081m9(), c6245lrM25232to);
        }
        c6245lrM25232to.m25344k4(this.f17661x1.m25391h4().m25353k4(c10971um), c4317dy, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16972k4(C10948ar c10948ar) {
        short sM25404x1 = this.f17661x1.m25404x1();
        this.f17661x1.m25396k4(sM25404x1, c10948ar.m52873k4().Clone());
        C6245lr c6245lr = new C6245lr(this.f17661x1, sM25404x1);
        m25228k4(c6245lr);
        C6258x1 c6258x1 = this.f17661x1;
        C6245lr c6245lr2 = new C6245lr(c6258x1, c6258x1.m25404x1());
        m25228k4(c6245lr2);
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52899x1(new C12007ix(0.0f, 0.0f, c10948ar.m52876x1(), c10948ar.m52874kk()));
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        c6245lr.m25345k4(this.f17661x1.m25391h4().m25353k4(c10971um.m53096fa()), this.f17660to, C14113y2.f47374k4, false);
        m25229k4(c10971um, this.f17660to, c6245lr);
        c6245lr.m25344k4(c6245lr2.m25346x1(), this.f17660to, null);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13516x1(C10971um c10971um) {
        C6245lr c6245lrM25232to = m25232to();
        if (c10971um.mo52902du() != null) {
            m25229k4(c10971um.mo52902du(), c10971um.mo52909to(), c6245lrM25232to);
        }
        c6245lrM25232to.m25344k4(this.f17661x1.m25391h4().m25353k4(c10971um), c10971um.mo52909to(), C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13522k4(C10951c5 c10951c5) {
        C6245lr c6245lrM25232to = m25232to();
        C6258x1 c6258x1 = this.f17661x1;
        C6245lr c6245lr = new C6245lr(c6258x1, c6258x1.m25404x1());
        if (c10951c5.mo52902du() != null) {
            m25229k4(c10951c5.mo52902du(), c10951c5.mo52909to(), c6245lrM25232to);
        }
        String strM67402k4 = C14113y2.f47374k4;
        if (c10951c5.m52903h4() != null) {
            strM67402k4 = C14113y2.m67402k4("hyperlink{0}", Short.valueOf(c6245lr.m25346x1()));
            this.f17661x1.m25391h4().m25356k4(c6245lr.m25346x1(), c10951c5.m52903h4());
        }
        c6245lrM25232to.m25344k4(c6245lr.m25346x1(), c10951c5.mo52909to(), strM67402k4);
        m25228k4(c6245lr);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25236x1(AbstractC10973uz abstractC10973uz, AbstractC3174jd abstractC3174jd) {
        m53112x1(abstractC10973uz);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16975k4(C10958h4 c10958h4) {
        this.f17661x1.m25394k4(c10958h4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13524k4(C10963ks c10963ks) {
        C6245lr c6245lrM25232to = m25232to();
        short sM25352k4 = this.f17661x1.m25391h4().m25352k4(c10963ks);
        if (c10963ks.m53000rv() != null) {
            c6245lrM25232to = m25226k4(c10963ks.m53000rv(), c6245lrM25232to);
        }
        C4317dy c4317dyM17345kk = c10963ks.mo52909to() != null ? c10963ks.mo52909to().m17345kk() : new C4317dy();
        c4317dyM17345kk.m17336k4(0.05f, 0.05f, 0);
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52899x1(new C12007ix(c10963ks.m52982jd().m56897x1(), c10963ks.m52982jd().m56895kk() - c10963ks.m53005x1().m23114dy(), c10963ks.m52998ne().m56550c5(), c10963ks.m52998ne().m56575x1()));
        c10950bv.m52895k4(true);
        c10971um.m52930k4(c10950bv);
        c6245lrM25232to.m25345k4(this.f17661x1.m25391h4().m25353k4(c10971um), new C4317dy(), C14113y2.f47374k4, false);
        if (c10963ks.mo52902du() != null) {
            m25229k4(c10963ks.mo52902du(), c10963ks.mo52909to(), c6245lrM25232to);
        }
        c6245lrM25232to.m25344k4(sM25352k4, c4317dyM17345kk, C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo16977k4(C10967qq c10967qq) {
        this.f17661x1.m25395k4(c10967qq);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13525k4(C10970u4 c10970u4) {
        C10970u4 c10970u4M53071k4 = c10970u4.m53071k4((AbstractC10972up) this, this.f17655du, false, false);
        if (c10970u4M53071k4 != null) {
            m25234x1(c10970u4M53071k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25229k4(C10971um c10971um, C4317dy c4317dy, C6245lr c6245lr) {
        short sM25353k4 = this.f17661x1.m25391h4().m25353k4(c10971um);
        C4317dy c4317dyM17345kk = c10971um.mo52909to() != null ? c10971um.mo52909to().m17345kk() : new C4317dy();
        if (c4317dy != null) {
            c4317dyM17345kk.m17341k4(c4317dy, 0);
        }
        c6245lr.m25345k4(sM25353k4, c4317dyM17345kk, C14113y2.f47374k4, true);
    }
}
