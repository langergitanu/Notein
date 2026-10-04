package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p032b1.AbstractC1571to;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p032b1.InterfaceC1566du;
import com.aspose.slides.internal.p046bs.C1848k4;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p182ii.C4889bv;
import com.aspose.slides.internal.p182ii.C4890bz;
import com.aspose.slides.internal.p182ii.C4896du;
import com.aspose.slides.internal.p182ii.C4897dy;
import com.aspose.slides.internal.p182ii.C4904h4;
import com.aspose.slides.internal.p182ii.C4909jw;
import com.aspose.slides.internal.p182ii.C4949yj;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p365qn.C9893c5;
import com.aspose.slides.internal.p365qn.C9894du;
import com.aspose.slides.internal.p365qn.C9897k4;
import com.aspose.slides.internal.p365qn.C9898kk;
import com.aspose.slides.internal.p365qn.C9901x1;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10948ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.cm */
/* JADX INFO: loaded from: classes3.dex */
class C0860cm extends AbstractC1571to {

    /* JADX INFO: renamed from: fa */
    private static final char[] f4368fa = {ControlChar.PARAGRAPH_BREAK_CHAR, '\n'};

    /* JADX INFO: renamed from: c5 */
    private C14062gk f4369c5;

    /* JADX INFO: renamed from: ck */
    private Slide f4370ck;

    /* JADX INFO: renamed from: du */
    private final Presentation f4371du;

    /* JADX INFO: renamed from: dy */
    private C12025x6 f4372dy;

    /* JADX INFO: renamed from: h4 */
    private LayoutSlide f4373h4;

    /* JADX INFO: renamed from: jd */
    private AutoShape f4374jd;

    /* JADX INFO: renamed from: k4 */
    private final List<Slide> f4375k4;

    /* JADX INFO: renamed from: kk */
    private final C13845mp f4376kk;

    /* JADX INFO: renamed from: m9 */
    private final C12015qq f4377m9;

    /* JADX INFO: renamed from: to */
    private final String f4378to;

    /* JADX INFO: renamed from: x1 */
    private final List<InterfaceC12777qq> f4379x1;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0062, code lost:
    
        r3.f4373h4 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0860cm(Presentation presentation, C13845mp c13845mp, String str) {
        C12015qq c12015qq = new C12015qq();
        this.f4377m9 = c12015qq;
        this.f4372dy = new C12025x6();
        this.f4375k4 = new List<>();
        this.f4379x1 = new List<>();
        this.f4371du = presentation;
        this.f4376kk = c13845mp;
        this.f4378to = str;
        ((SlideSize) presentation.getSlideSize()).m2755k4().CloneTo(c12015qq);
        this.f4372dy = new C12025x6(12.0f, 12.0f);
        IGenericEnumerator<ILayoutSlide> it = presentation.getMasters().get_Item(0).getLayoutSlides().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                LayoutSlide layoutSlide = (LayoutSlide) it.next();
                if (layoutSlide.getLayoutType() == 11) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f4373h4 == null) {
            this.f4373h4 = (LayoutSlide) this.f4371du.getMasters().get_Item(0).getLayoutSlides().get_Item(0);
        }
    }

    /* JADX INFO: renamed from: du */
    private void m4639du() {
        AutoShape autoShape = (AutoShape) m4648k4().getShapes().addAutoShape(5, this.f4372dy.m56897x1(), this.f4372dy.m56895kk(), (this.f4377m9.m56699x1() - 12.0f) - 12.0f, 0.0f);
        this.f4374jd = autoShape;
        autoShape.getShapeStyle().setFillStyleIndex((short) 0);
        this.f4374jd.getShapeStyle().setLineStyleIndex(0);
        this.f4374jd.getShapeStyle().setFontCollectionIndex((byte) 0);
        this.f4374jd.getShapeStyle().getFontColor().setSchemeColor(1);
        TextFrame textFrame = (TextFrame) this.f4374jd.addTextFrame("");
        textFrame.getTextFrameFormat().setAutofitType((byte) 2);
        textFrame.getTextFrameFormat().setAnchoringType((byte) 0);
        ((TextFrameFormat) textFrame.getTextFrameFormat()).m2953k4(xmh.f50156k4.Clone());
        textFrame.getParagraphs().clear();
    }

    /* JADX INFO: renamed from: k4 */
    private IPPImage m4640k4(String str) {
        AbstractC3150x6 abstractC3150x6M64934k4;
        String strM64935k4 = this.f4376kk.m64935k4(this.f4378to, str);
        if (strM64935k4 == null || (abstractC3150x6M64934k4 = this.f4376kk.m64934k4(strM64935k4)) == null) {
            return null;
        }
        return ((ImageCollection) this.f4371du.getImages()).m1721k4(abstractC3150x6M64934k4);
    }

    /* JADX INFO: renamed from: to */
    private void m4643to() {
        IBackground background = m4648k4().getBackground();
        m4649k4((Slide) this.f4371du.getSlides().insertEmptySlide(m4648k4().m2709qq() + 1, m4657kk()));
        if (background.getType() == 1) {
            ((FillFormat) m4648k4().getBackground().getFillFormat()).m1456k4(background.getFillFormat());
            m4648k4().getBackground().setType((byte) 1);
        }
        m4660x1().addItem(m4648k4());
        this.f4372dy = new C12025x6(12.0f, 12.0f);
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: c5 */
    public InterfaceC1566du mo4645c5(C1569kk c1569kk) {
        this.f4374jd = null;
        m4641k4((InterfaceC12777qq) c1569kk, true);
        C1848k4 c1848k4 = new C1848k4();
        c1848k4.m9641k4(this.f4378to);
        C9901x1 c9901x1 = new C9901x1();
        c9901x1.m48763m9().m48722du().m48735k4(new C9893c5(new C9894du(this.f4377m9.m56699x1(), 4), new C9894du(this.f4377m9.m56697kk(), 4)));
        C9894du c9894du = new C9894du(12.0f, 4);
        c9901x1.m48763m9().m48722du().m48736x1().m48754to(c9894du);
        c9901x1.m48763m9().m48722du().m48736x1().m48750k4(c9894du);
        c9901x1.m48763m9().m48722du().m48736x1().m48756x1(c9894du);
        C9898kk c9898kkM48743k4 = new C9897k4(c1848k4, new rsv(this.f4376kk)).m48743k4(C14113y2.m67408k4("<img src=\"\" width=\"100\" height=\"", C14057f9.m66591x1(C7019kk.m27462to(Float.valueOf((this.f4372dy.m56895kk() - 12.0f) / 0.75f), 13)), "\"/>", c1569kk.m22718rv()), c9901x1);
        C14915zu c14915zu = new C14915zu(this.f4371du, null, this.f4378to, c9898kkM48743k4.m48745x1());
        for (C10948ar c10948ar : c9898kkM48743k4.m48744k4()) {
            if (c14915zu.m74829dy() > 0) {
                m4643to();
            }
            c14915zu.m74835k4(m4648k4());
            c14915zu.m53112x1((AbstractC10973uz) c10948ar);
            Dictionary.ValueCollection.Enumerator<C12804k4, bnx> it = c14915zu.m74832jd().getValues().iterator();
            while (it.hasNext()) {
                try {
                    Table tableM4279k4 = it.next().m4279k4((ShapeCollection) m4648k4().getShapes());
                    tableM4279k4.m2565k4(new oju(this.f4372dy.m56897x1(), this.f4372dy.m56895kk()));
                    C12025x6 c12025x6 = this.f4372dy;
                    c12025x6.m56898x1(tableM4279k4.getHeight() + 12.0f + c12025x6.m56895kk());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            c14915zu.m74833k4().clear();
            c14915zu.m74832jd().clear();
            c14915zu.m74827ck().clear();
            c14915zu.m74834k4(c14915zu.m74829dy() + 1);
        }
        return this;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: dy */
    public void mo4647dy(C1569kk c1569kk) {
        if (C7019kk.m27469x1(c1569kk, C4949yj.class)) {
            this.f4374jd = null;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final LayoutSlide m4657kk() {
        return this.f4373h4;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: m9 */
    public void mo4659m9(C1569kk c1569kk) {
        if ("main".equals(c1569kk.mo22604c5()) || "header".equals(c1569kk.mo22604c5())) {
            return;
        }
        if ("span".equals(C14113y2.m67368h4(c1569kk.mo22604c5())) && OooOo00.OooO0O0(c1569kk) == 6) {
            mo4645c5(c1569kk);
        } else if (C7019kk.m27469x1(c1569kk, C4949yj.class)) {
            this.f4374jd = null;
        } else {
            m4642k4(c1569kk, C14722w3.m72632to(c1569kk), false);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final List<Slide> m4660x1() {
        return this.f4375k4;
    }

    /* JADX INFO: renamed from: x1 */
    private String m4644x1(String str) {
        C14062gk c14062gk = this.f4369c5;
        if (c14062gk == null || !".".equals(c14062gk.m66694u4())) {
            C14062gk[] c14062gkArr = {null};
            boolean zM66650k4 = C14062gk.m66650k4(str, 0, c14062gkArr);
            C14062gk c14062gk2 = c14062gkArr[0];
            if (zM66650k4) {
                if (!c14062gk2.m66683ix()) {
                    C14062gk c14062gk3 = this.f4369c5;
                    if (c14062gk3 != null) {
                        if (c14062gk3.m66681h4() != 2 && this.f4369c5.m66681h4() != 3 && this.f4369c5.m66681h4() != 4) {
                            C14062gk c14062gk4 = new C14062gk(C3141rv.m13412x1(this.f4369c5.m66677ck(), str), 0);
                            return (c14062gk4.m66683ix() && c14062gk4.m66679dy()) ? c14062gk4.m66677ck() : c14062gk4.toString();
                        }
                        c14062gkArr[0] = c14062gk2;
                        boolean zM66648k4 = C14062gk.m66648k4(this.f4369c5, c14062gk2, c14062gkArr);
                        C14062gk c14062gk5 = c14062gkArr[0];
                        if (zM66648k4) {
                            return c14062gk5.toString();
                        }
                    }
                }
            }
            if (!C14113y2.m67411k4(this.f4378to)) {
                str = C3141rv.m13412x1(this.f4378to, str);
            }
            return C14113y2.m67401k4(str, "\\", "/");
        }
        return str;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to
    /* JADX INFO: renamed from: du */
    public void mo4646du(C1569kk c1569kk) {
        m4642k4(c1569kk, true, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final Slide m4648k4() {
        return this.f4370ck;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: kk */
    public void mo4658kk(C1569kk c1569kk) {
        m4642k4(c1569kk, false, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4649k4(Slide slide) {
        this.f4370ck = slide;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: x1 */
    public void mo4661x1(C4897dy c4897dy) {
        this.f4374jd = null;
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4650k4(C4889bv c4889bv) {
        IPPImage iPPImageM4640k4 = null;
        this.f4374jd = null;
        String strM4644x1 = m4644x1(c4889bv.m20272ri());
        if (C14113y2.m67411k4(strM4644x1)) {
            return;
        }
        if (this.f4372dy.m56895kk() >= this.f4377m9.m56697kk() - 12.0f) {
            m4643to();
        }
        try {
            iPPImageM4640k4 = m4640k4(strM4644x1);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
        IPPImage iPPImage = iPPImageM4640k4;
        float fM20263he = c4889bv.m20263he() * 0.75f;
        float fM20269os = c4889bv.m20269os() * 0.75f;
        float f = 0.0f;
        if (fM20263he == 0.0f) {
            fM20263he = iPPImage != null ? iPPImage.getWidth() * 0.75f : 1.0f;
        }
        if (fM20269os == 0.0f) {
            fM20269os = iPPImage != null ? iPPImage.getHeight() * 0.75f : 1.0f;
        }
        C12015qq c12015qq = new C12015qq(this.f4377m9.m56699x1() - 24.0f, this.f4377m9.m56697kk() - 24.0f);
        if (fM20263he > c12015qq.m56699x1()) {
            float fM56699x1 = c12015qq.m56699x1() / fM20263he;
            fM20263he *= fM56699x1;
            fM20269os *= fM56699x1;
        }
        float f2 = fM20263he;
        float fM56697kk = (this.f4377m9.m56697kk() - this.f4372dy.m56895kk()) - 12.0f;
        if (fM20269os <= c12015qq.m56697kk()) {
            fM56697kk = fM20269os;
        } else if (fM56697kk < 0.4f * fM20269os) {
            m4643to();
            fM56697kk = c12015qq.m56697kk();
        }
        float fM67504x1 = fM56697kk;
        float f3 = 0.0f;
        do {
            if ((this.f4377m9.m56697kk() - this.f4372dy.m56895kk()) - 12.0f < fM67504x1) {
                m4643to();
            }
            IPictureFrame iPictureFrameAddPictureFrame = m4648k4().getShapes().addPictureFrame(5, this.f4372dy.m56897x1(), this.f4372dy.m56895kk(), f2, fM67504x1, iPPImage);
            f += fM67504x1;
            float f4 = (1.0f - (f / fM20269os)) * 100.0f;
            iPictureFrameAddPictureFrame.getPictureFormat().setCropTop(f3);
            iPictureFrameAddPictureFrame.getPictureFormat().setCropBottom(f4);
            f3 = 100.0f - f4;
            C12025x6 c12025x6 = this.f4372dy;
            c12025x6.m56898x1(fM67504x1 + 12.0f + c12025x6.m56895kk());
            fM67504x1 = C14116yg.m67504x1(fM20269os - f, c12015qq.m56697kk());
        } while (f < fM20269os);
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4651k4(C4890bz c4890bz) {
        m4642k4(c4890bz, false, true);
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4652k4(C4896du c4896du) {
        m4642k4(c4896du, false, false);
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4653k4(C4897dy c4897dy) {
        C12003du c12003duClone = c4897dy.m8445t6().m23818dy().m26913k4().Clone();
        if (C12003du.m56476x1(c12003duClone, C12003du.m56398k4(0, 255, 255, 255))) {
            IBackground background = m4648k4().getBackground();
            ((ColorFormat) background.getFillFormat().getSolidFillColor()).m1080k4(c12003duClone.Clone());
            background.getFillFormat().setFillType((byte) 1);
            background.setType((byte) 1);
        }
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4654k4(C4904h4 c4904h4) {
        if (C14113y2.m67411k4(c4904h4.m20364qw())) {
            return;
        }
        C14062gk[] c14062gkArr = {null};
        boolean zM66650k4 = C14062gk.m66650k4(c4904h4.m20364qw(), 0, c14062gkArr);
        C14062gk c14062gk = c14062gkArr[0];
        if (zM66650k4) {
            this.f4369c5 = c14062gk;
        }
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4655k4(C4909jw c4909jw) {
        m4642k4(c4909jw, false, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m4641k4(InterfaceC12777qq interfaceC12777qq, boolean z) {
        C1569kk c1569kk;
        this.f4379x1.addItem(interfaceC12777qq);
        if (z && (c1569kk = (C1569kk) C7019kk.m27452k4((Object) interfaceC12777qq, C1569kk.class)) != null) {
            c1569kk.m59503u4(c1569kk.m8445t6().m23824gf());
        }
        IGenericEnumerator<InterfaceC12777qq> it = interfaceC12777qq.mo22671yd().iterator();
        while (it.hasNext()) {
            try {
                m4641k4(it.next(), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4642k4(InterfaceC12777qq interfaceC12777qq, boolean z, boolean z2) {
        InterfaceC12784v4 interfaceC12784v4;
        if (this.f4379x1.containsItem(interfaceC12777qq)) {
            return;
        }
        m4641k4(interfaceC12777qq, true);
        float fM56895kk = this.f4372dy.m56895kk();
        AutoShape autoShape = this.f4374jd;
        if (autoShape == null) {
            m4639du();
        } else {
            fM56895kk = autoShape.getY();
        }
        ParagraphCollection paragraphCollection = (ParagraphCollection) this.f4374jd.getTextFrame().getParagraphs();
        C14782xd c14782xd = new C14782xd(paragraphCollection, this.f4376kk, this.f4378to, true);
        if (z) {
            C1569kk c1569kk = (C1569kk) C7019kk.m27452k4((Object) interfaceC12777qq.mo22654sv(), C1569kk.class);
            if (c1569kk == null && (interfaceC12784v4 = (InterfaceC12784v4) C7019kk.m27452k4((Object) interfaceC12777qq.mo22654sv(), InterfaceC12784v4.class)) != null && C14113y2.m67440x1(interfaceC12784v4.mo22687k4()).length() == 0) {
                c1569kk = (C1569kk) C7019kk.m27452k4((Object) interfaceC12784v4.mo22654sv(), C1569kk.class);
            }
            if (c1569kk != null && C14722w3.m72625c5(c1569kk)) {
                c14782xd.m73320k4(paragraphCollection.get_Item(paragraphCollection.getCount() - 1).getParagraphFormat());
            }
        }
        c14782xd.m63242k4((AbstractC5535bv) interfaceC12777qq);
        this.f4372dy.m56898x1(this.f4374jd.getHeight() + fM56895kk);
        if (this.f4372dy.m56895kk() >= this.f4377m9.m56697kk() - 12.0f) {
            IParagraph iParagraph = paragraphCollection.get_Item(paragraphCollection.getCount() - 1);
            paragraphCollection.remove(iParagraph);
            m4643to();
            m4639du();
            this.f4374jd.getTextFrame().getParagraphs().add(iParagraph);
        }
        C12025x6 c12025x6 = this.f4372dy;
        c12025x6.m56898x1(c12025x6.m56895kk() + 12.0f);
    }

    @Override // com.aspose.slides.internal.p032b1.AbstractC1571to, com.aspose.slides.internal.p032b1.InterfaceC1566du
    /* JADX INFO: renamed from: k4 */
    public void mo4656k4(InterfaceC12784v4 interfaceC12784v4) {
        String strMo22687k4 = interfaceC12784v4.mo22687k4();
        if (C14113y2.m67384k4(strMo22687k4, f4368fa) < 0 || C14113y2.m67440x1(strMo22687k4).length() != 0) {
            m4642k4(interfaceC12784v4, true, false);
        }
    }
}
