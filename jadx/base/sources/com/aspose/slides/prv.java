package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
final class prv extends er8 {

    /* JADX INFO: renamed from: k4 */
    private boolean f48120k4;

    public prv(SmartArt smartArt) {
        super(smartArt);
    }

    /* JADX INFO: renamed from: k4 */
    public final SmartArt m69202k4() {
        return (SmartArt) m5629du();
    }

    /* JADX INFO: renamed from: kk */
    public final void m69205kk(boolean z) {
        this.f48120k4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m69206to() {
        if (this.f48120k4) {
            return;
        }
        ShapeFrame shapeFrameM5631fa = m5631fa();
        if (C14064he.m66715kk(shapeFrameM5631fa.getX()) || C14064he.m66715kk(shapeFrameM5631fa.getY()) || C14064he.m66715kk(shapeFrameM5631fa.getWidth()) || C14064he.m66715kk(shapeFrameM5631fa.getHeight())) {
            return;
        }
        m69203k4(shapeFrameM5631fa);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m69207x1() {
        return this.f48120k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69203k4(ShapeFrame shapeFrame) {
        this.f48120k4 = true;
        GroupShape groupShapeM3354kk = m69202k4().m2785up().m3354kk();
        groupShapeM3354kk.setFrame(shapeFrame);
        groupShapeM3354kk.m1647k4(tbp.f49088kk.Clone());
        groupShapeM3354kk.m1654x1(new tbp(shapeFrame.getWidth(), shapeFrame.getHeight()));
        if (!m69202k4().m2787yj()) {
            m69202k4().mo272to().m63512m9().getShapes().clear();
            m69202k4().m2785up().m3355m9();
            m69202k4().m2785up().m3346du();
        }
        m69202k4().m2783rv();
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        if (m5629du().getHidden()) {
            return;
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68801x1(m5629du().getHyperlinkClick());
        }
        ShapeFrame shapeFrameM5631fa = m5631fa();
        if (!C14064he.m66715kk(shapeFrameM5631fa.getX()) && !C14064he.m66715kk(shapeFrameM5631fa.getY()) && !C14064he.m66715kk(shapeFrameM5631fa.getWidth()) && !C14064he.m66715kk(shapeFrameM5631fa.getHeight())) {
            C4317dy c4317dy = new C4317dy(shapeFrameM5631fa.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrameM5631fa.getFlipH() == 1 ? shapeFrameM5631fa.getCenterX() * 2.0f : 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? shapeFrameM5631fa.getCenterY() * 2.0f : 0.0f);
            if (!C14064he.m66715kk(shapeFrameM5631fa.getRotation())) {
                c4317dy.m17339k4((shapeFrameM5631fa.getFlipH() == 1) ^ (shapeFrameM5631fa.getFlipV() == 1) ? -shapeFrameM5631fa.getRotation() : shapeFrameM5631fa.getRotation(), new C12025x6(shapeFrameM5631fa.getCenterX(), shapeFrameM5631fa.getCenterY()), 0);
            }
            abstractC14897zn.m74622kk(c4317dy);
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55578x1(shapeFrameM5631fa.m2660k4().Clone());
            ajz ajzVar = new ajz(shapeFrameM5631fa.cloneT(), abstractC14897zn.m74623ks(), c11896dy, m5642m9(), kg7Var);
            C0962es c0962esM5659k4 = C0962es.m5659k4(ajzVar, m5629du().f3303dy);
            azo azoVar = new azo(ajzVar, m5629du().m2571lr());
            m69204k4(abstractC14897zn, kg7Var, c11896dy, c0962esM5659k4, azoVar, shapeFrameM5631fa, m5629du().getEffectFormat().getEffective());
            abstractC14897zn.mo64338k4(c11896dy, (azo) null, c0962esM5659k4);
            if (m69207x1()) {
                GroupShape groupShapeM3354kk = m69202k4().m2785up().m3354kk();
                groupShapeM3354kk.setFrame(shapeFrameM5631fa);
                groupShapeM3354kk.m1647k4(tbp.f49088kk.Clone());
                groupShapeM3354kk.m1654x1(new tbp(shapeFrameM5631fa.getWidth(), shapeFrameM5631fa.getHeight()));
            } else {
                m69203k4(shapeFrameM5631fa);
            }
            m69202k4().m2785up().m3354kk().m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            abstractC14897zn.mo64338k4(c11896dy, azoVar, (C0962es) null);
            abstractC14897zn.m74626rv();
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68800x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69204k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C11896dy c11896dy, C0962es c0962es, azo azoVar, ShapeFrame shapeFrame, IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        AbstractC14897zn abstractC14897zn2;
        ShapeFrame shapeFrame2;
        azo azoVar2;
        C0962es c0962es2;
        C11896dy c11896dy2;
        if (iEffectFormatEffectiveData == null || c11896dy.m55525du() == 0) {
            return;
        }
        if (iEffectFormatEffectiveData.getReflectionEffect() != null) {
            abstractC14897zn2 = abstractC14897zn;
            shapeFrame2 = shapeFrame;
            new lzv(iEffectFormatEffectiveData.getReflectionEffect()).mo64370k4(abstractC14897zn2, c11896dy, c0962es, azoVar, shapeFrame2);
            c11896dy2 = c11896dy;
            c0962es2 = c0962es;
            azoVar2 = azoVar;
        } else {
            abstractC14897zn2 = abstractC14897zn;
            shapeFrame2 = shapeFrame;
            azoVar2 = azoVar;
            c0962es2 = c0962es;
            c11896dy2 = c11896dy;
        }
        if (iEffectFormatEffectiveData.getOuterShadowEffect() != null) {
            new nv2(iEffectFormatEffectiveData.getOuterShadowEffect()).m68226k4(abstractC14897zn2, c11896dy2, c0962es2, azoVar2);
        }
        if (iEffectFormatEffectiveData.getGlowEffect() != null) {
            new C14871z3(iEffectFormatEffectiveData.getGlowEffect()).m74297k4(abstractC14897zn2, c11896dy2, c0962es2, azoVar2);
        }
        if (iEffectFormatEffectiveData.getInnerShadowEffect() != null) {
            AbstractC14897zn abstractC14897zn3 = abstractC14897zn2;
            new lho(iEffectFormatEffectiveData.getInnerShadowEffect()).m64396k4(abstractC14897zn3, c11896dy2, c0962es2, azoVar2, shapeFrame2);
            abstractC14897zn2 = abstractC14897zn3;
        }
        if (iEffectFormatEffectiveData.getSoftEdgeEffect() == null || iEffectFormatEffectiveData.getSoftEdgeEffect().getRadius() == 0.0d) {
            return;
        }
        new pij(iEffectFormatEffectiveData.getSoftEdgeEffect()).m69106k4(abstractC14897zn2, kg7Var, c11896dy2, c0962es2, azoVar2);
    }
}
