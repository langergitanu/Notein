package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class pnk {

    /* JADX INFO: renamed from: dy */
    private AutoShape f48103dy;

    /* JADX INFO: renamed from: fa */
    private TextStyle f48104fa;

    /* JADX INFO: renamed from: h4 */
    private AutoShape f48105h4;

    /* JADX INFO: renamed from: k4 */
    public AutoShape f48107k4;

    /* JADX INFO: renamed from: m9 */
    private TextFrame f48110m9;

    /* JADX INFO: renamed from: to */
    private byte f48111to;

    /* JADX INFO: renamed from: x1 */
    private IMasterSlide f48113x1;

    /* JADX INFO: renamed from: kk */
    private LayoutSlide f48108kk = null;

    /* JADX INFO: renamed from: du */
    private long f48102du = 0;

    /* JADX INFO: renamed from: c5 */
    private boolean f48100c5 = false;

    /* JADX INFO: renamed from: jd */
    private tbp f48106jd = new tbp();

    /* JADX INFO: renamed from: ck */
    private tbp f48101ck = new tbp();

    /* JADX INFO: renamed from: up */
    private byte f48112up = -1;

    /* JADX INFO: renamed from: yj */
    private float f48114yj = 1.0f;

    /* JADX INFO: renamed from: ks */
    private float f48109ks = 1.0f;

    public pnk(IMasterSlide iMasterSlide, byte b) {
        this.f48113x1 = iMasterSlide;
        this.f48111to = b;
        m69161kk();
    }

    /* JADX INFO: renamed from: kk */
    private AutoShape m69160kk(byte b) {
        IGenericEnumerator<IShape> it = this.f48113x1.getShapes().iterator();
        while (it.hasNext()) {
            try {
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) it.next(), AutoShape.class);
                if (autoShape != null && autoShape.getPlaceholder() != null && autoShape.getPlaceholder().getType() == b) {
                    return autoShape;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m69162k4() {
        return this.f48114yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m69169x1() {
        return this.f48109ks;
    }

    /* JADX INFO: renamed from: kk */
    private void m69161kk() {
        this.f48114yj = ((SlideSize) this.f48113x1.getPresentation().getSlideSize()).m2755k4().m56699x1() / 720.0f;
        this.f48109ks = ((SlideSize) this.f48113x1.getPresentation().getSlideSize()).m2755k4().m56697kk() / 540.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final AutoShape m69163k4(String str, byte b, byte b2, byte b3) {
        AutoShape autoShapeM69160kk = m69160kk(b3);
        this.f48105h4 = autoShapeM69160kk;
        if (autoShapeM69160kk != null) {
            this.f48110m9 = autoShapeM69160kk.m288x1();
            this.f48107k4 = this.f48105h4;
        } else if (b3 == 4 || b3 == 5 || b3 == 6) {
            this.f48103dy = null;
            this.f48110m9 = null;
            this.f48107k4 = null;
            return null;
        }
        this.f48102du++;
        AutoShape autoShapeM2615fa = ((ShapeCollection) this.f48108kk.f1077kk.getShapes()).m2615fa();
        this.f48103dy = autoShapeM2615fa;
        autoShapeM2615fa.m2574ss();
        if (this.f48100c5) {
            this.f48103dy.mo1214P_().m67987k4(this.f48106jd.Clone());
            this.f48103dy.mo1650kk(this.f48101ck.Clone());
            this.f48100c5 = false;
        }
        this.f48103dy.setAlternativeText("");
        this.f48103dy.setName(C14113y2.m67408k4(str, " ", C14114y9.m67465x1(this.f48102du)));
        this.f48103dy.m2554k4(b, b2, b3, ((this.f48102du & 4294967295L) - 1) & 4294967295L, false);
        this.f48103dy.getAutoShapeLock().setGroupingLocked(true);
        this.f48103dy.m276ck();
        if (this.f48104fa != null) {
            ((TextStyle) this.f48103dy.getTextFrame().getTextFrameFormat().getTextStyle()).m2986k4(this.f48104fa);
            this.f48104fa = null;
        }
        if (this.f48112up != -1) {
            this.f48103dy.getTextFrame().getTextFrameFormat().setAnchoringType(this.f48112up);
            this.f48112up = (byte) -1;
        }
        return this.f48103dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69170x1(byte b) {
        this.f48112up = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final LayoutSlide m69164k4(String str) {
        if (this.f48108kk == null) {
            LayoutSlide layoutSlide = new LayoutSlide(this.f48113x1, this.f48111to);
            this.f48108kk = layoutSlide;
            layoutSlide.m1849x6().m5302k4(((Presentation) this.f48113x1.getPresentation()).m2351fa().m68390um());
            this.f48108kk.setName(str);
            this.f48108kk.m1849x6().m71164x1(true);
            GroupShape groupShape = this.f48108kk.f1077kk;
            nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
            tbp tbpVar = tbp.f49088kk;
            nd1VarMo1214P_.m67987k4(tbpVar.Clone());
            groupShape.mo1650kk(tbpVar.Clone());
            groupShape.m1647k4(tbpVar.Clone());
            groupShape.m1654x1(tbpVar.Clone());
            groupShape.setAlternativeText("");
            groupShape.setName("");
        }
        return this.f48108kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69165k4(byte b) {
        this.f48111to = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69166k4(double d, double d2, double d3, double d4) {
        this.f48106jd = new tbp(d, d2);
        this.f48101ck = new tbp(d3, d4);
        this.f48100c5 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69167k4(Portion portion) {
        PortionFormat portionFormat;
        IPortionFormat endParagraphPortionFormat;
        if (this.f48110m9 == null) {
            return;
        }
        ((ParagraphFormat) portion.m2282fa().getParagraphFormat()).m2196k4((ParagraphFormat) this.f48110m9.getParagraphs().get_Item(0).getParagraphFormat());
        if (this.f48110m9.getParagraphs().get_Item(0).getPortions().getCount() > 0) {
            portionFormat = (PortionFormat) portion.getPortionFormat();
            endParagraphPortionFormat = this.f48110m9.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat();
        } else {
            if (((Paragraph) this.f48110m9.getParagraphs().get_Item(0)).getEndParagraphPortionFormat() == null) {
                return;
            }
            portionFormat = (PortionFormat) portion.getPortionFormat();
            endParagraphPortionFormat = ((Paragraph) this.f48110m9.getParagraphs().get_Item(0)).getEndParagraphPortionFormat();
        }
        portionFormat.m361k4((BasePortionFormat) endParagraphPortionFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69168k4(TextStyle textStyle) {
        this.f48104fa = textStyle;
    }
}
