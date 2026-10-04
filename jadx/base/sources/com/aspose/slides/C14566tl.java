package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10685vw;
import com.aspose.slides.internal.p407st.C10736yo;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.tl */
/* JADX INFO: loaded from: classes3.dex */
class C14566tl {
    /* JADX INFO: renamed from: k4 */
    private static IPPImage m71241k4(C14176nc c14176nc, Background background, y2n y2nVar) {
        AbstractC12024x1 abstractC12024x1M73548kk;
        C3152yj c3152yj;
        C12015qq c12015qqClone = ((SlideSize) y2nVar.m71946k4().getSlideSize()).m2755k4().Clone();
        C0962es c0962esM5664k4 = C0962es.m5664k4(new ajz(new ShapeFrame(0.0f, 0.0f, c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), (byte) 0, (byte) 0, 0.0f), null, null, background.getSlide(), null), c14176nc);
        if (c14176nc.getFillType() == 4) {
            abstractC12024x1M73548kk = C14814xq.m73548kk(c0962esM5664k4);
            try {
                c3152yj = new C3152yj();
                try {
                    ((C12012lr) abstractC12024x1M73548kk).m56619h4().m56333k4(c3152yj, C3977ck.m15681jd());
                    PPImage pPImage = new PPImage(y2nVar.m71946k4(), c3152yj.toArray());
                    c3152yj.dispose();
                    if (abstractC12024x1M73548kk != null) {
                        abstractC12024x1M73548kk.dispose();
                    }
                    return pPImage;
                } finally {
                }
            } finally {
            }
        } else {
            C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13));
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    abstractC12008jdM56582k4.mo17560kk(7);
                    abstractC12008jdM56582k4.mo17586x1(2);
                    abstractC12008jdM56582k4.mo17476du(2);
                    abstractC12024x1M73548kk = C14814xq.m73548kk(c0962esM5664k4);
                    try {
                        abstractC12008jdM56582k4.mo17526k4(abstractC12024x1M73548kk, 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                        if (abstractC12024x1M73548kk != null) {
                            abstractC12024x1M73548kk.dispose();
                        }
                        abstractC12008jdM56582k4.dispose();
                        c3152yj = new C3152yj();
                        try {
                            c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                            PPImage pPImage2 = new PPImage(y2nVar.m71946k4(), c3152yj.toArray());
                            c3152yj.dispose();
                            c12009k4.dispose();
                            return pPImage2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                c12009k4.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71242k4(cct cctVar) {
        C10462h9 c10462h9M70140fa = cctVar.m70140fa();
        if (c10462h9M70140fa == null) {
            return;
        }
        Background backgroundM4551k4 = cctVar.m4551k4();
        backgroundM4551k4.setType((byte) 1);
        C14680vi.m72289k4((FillFormat) backgroundM4551k4.getFillFormat(), cctVar);
        C14200nt.m68199k4(backgroundM4551k4.getEffectFormat(), cctVar);
        if (backgroundM4551k4.getFillFormat().getFillType() == 2 && backgroundM4551k4.getFillFormat().getGradientFormat().getGradientShape() == 3) {
            C0816bg c0816bgM338to = backgroundM4551k4.m338to();
            c0816bgM338to.m4208k4(true);
            if (cctVar.m70149up().m64735up().getShapes().size() > 0) {
                c0816bgM338to.m4206k4(cctVar.m70149up().m64735up().getShapes().get_Item(0));
            }
        }
        if (c10462h9M70140fa.mo50862jd() != null) {
            C13658is.m63092k4(backgroundM4551k4.m335du().m69392k4(), c10462h9M70140fa.mo50862jd().m50425ck());
        }
        if (backgroundM4551k4.getFillFormat().getFillType() == 1 && backgroundM4551k4.getFillFormat().getSolidFillColor().getColorType() == 3) {
            backgroundM4551k4.getFillFormat().getSolidFillColor().getSchemeColor();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m71243k4(rpo rpoVar) {
        Background background;
        FillFormat fillFormat;
        Background background2 = null;
        if (rpoVar.m70220kk() != 2) {
            background = null;
        } else {
            IBaseSlide iBaseSlide = (IBaseSlide) C7019kk.m27452k4((Object) rpoVar.m70230um(), LayoutSlide.class);
            if (iBaseSlide != null) {
                Background background3 = (Background) C7019kk.m27452k4((Object) iBaseSlide.getBackground(), Background.class);
                if (!m71244k4(background3)) {
                    background2 = background3;
                    background = null;
                }
            } else {
                background = (Background) C7019kk.m27452k4((Object) rpoVar.m70235x1().m409yj().getBackground(), Background.class);
                if (m71244k4(background)) {
                }
            }
        }
        if (background2 == null) {
            background2 = (Background) C7019kk.m27452k4((Object) rpoVar.m70235x1().getBackground(), Background.class);
            if (m71244k4(background2)) {
                if (background == null) {
                    rpoVar.m70213k4(true);
                    return;
                }
                background2 = background;
            }
        }
        hqi hqiVar = new hqi(background2, rpoVar.m70210h4());
        C10462h9 c10462h9M72000ix = hqiVar.m72000ix();
        c10462h9M72000ix.mo50864to().m52037k4(rpoVar.m70213k4(true));
        C10534m3 c10534m3Mo50859du = c10462h9M72000ix.mo50859du();
        IFillFormatEffectiveData fillFormat2 = background2.getEffective().getFillFormat();
        if (fillFormat2 == null || !(background2.getType() != 1 || background2.getFillFormat().getFillType() == -1 || background2.getFillFormat().getFillType() == 2)) {
            fillFormat = (FillFormat) background2.getFillFormat();
        } else {
            fillFormat = new FillFormat(background2);
            fillFormat.m1457k4(fillFormat2);
        }
        if (fillFormat2 == null || fillFormat2.getFillType() != 1) {
            if (fillFormat2 != null && fillFormat2.getFillType() == 4) {
                PictureFillFormat pictureFillFormat = (PictureFillFormat) fillFormat.getPictureFillFormat();
                if (background2.getType() == 1) {
                    ((Picture) pictureFillFormat.getPicture()).m2241x1().m63575k4(((Picture) background2.getFillFormat().getPictureFillFormat().getPicture()).m2241x1().m63570du());
                } else if (background2.getType() == 0 && oju.m68621to(pictureFillFormat.m2255m9().m74651to(), oju.f47835to)) {
                    pictureFillFormat.getPicture().setImage(m71241k4((C14176nc) fillFormat2, background2, rpoVar.m70215k4()));
                    pictureFillFormat.getPicture().getImageTransform().clear();
                }
            } else if (fillFormat2 != null && fillFormat2.getFillType() == 2 && fillFormat2.getGradientFormat().getGradientShape() == 2) {
                IPPImage iPPImageM71241k4 = m71241k4((C14176nc) fillFormat2, background2, rpoVar.m70215k4());
                fillFormat.setFillType((byte) 4);
                fillFormat.getPictureFillFormat().setPictureFillMode(1);
                fillFormat.getPictureFillFormat().getPicture().setImage(iPPImageM71241k4);
            }
        } else if (background2.getType() == 0 && background2.getStyleColor().getSchemeColor() != -1) {
            fillFormat.getSolidFillColor().setSchemeColor(background2.getStyleColor().getSchemeColor());
        }
        C14680vi.m72290k4(fillFormat, hqiVar);
        if (!background2.getEffectFormat().isNoEffects() && background2.getType() == 1) {
            C14200nt.m68201x1(hqiVar);
        }
        C10736yo c10736yo = new C10736yo();
        c10534m3Mo50859du.m51263x1().m50926k4(c10736yo);
        c10736yo.m52083ck(false);
        C10685vw c10685vw = new C10685vw();
        c10534m3Mo50859du.m51263x1().m50926k4(c10685vw);
        c10685vw.m51884k4(true);
        c10685vw.m51885x1(true);
        c10534m3Mo50859du.m51263x1().m50926k4(new C10609qn(772, false, 9L));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m71244k4(Background background) {
        return background == null || background.getType() == -1;
    }
}
