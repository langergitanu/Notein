package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.bw */
/* JADX INFO: loaded from: classes3.dex */
class C0833bw extends er8 {

    /* JADX INFO: renamed from: k4 */
    private static final Object f4253k4 = new Object();

    public C0833bw(GeometryShape geometryShape) {
        super(geometryShape);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m4329kk(IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        if (iEffectFormatEffectiveData == null) {
            return true;
        }
        if (iEffectFormatEffectiveData.getBlurEffect() == null || iEffectFormatEffectiveData.getBlurEffect().getRadius() == 0.0d) {
            return iEffectFormatEffectiveData.getSoftEdgeEffect() == null || iEffectFormatEffectiveData.getSoftEdgeEffect().getRadius() == 0.0d;
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m4330x1() {
        return (m5629du().isGrouped() && m5629du().getParentGroup().getEffectFormat().getGlowEffect() != null && m5629du().getEffectFormat().getGlowEffect() == null && m5629du().getThreeDFormat().getCamera().getCameraType() == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.aspose.slides.ILineFormatEffectiveData, com.aspose.slides.skr] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.aspose.slides.IBaseSlide] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.aspose.slides.IBaseSlide, com.aspose.slides.Slide] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.aspose.slides.BaseSlide] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: k4 */
    public final azo m4332k4(ShapeFrame shapeFrame, C4317dy c4317dy, C11896dy c11896dy, kg7 kg7Var) {
        C11896dy c11896dy2;
        ?? M1894dy = m5629du().m2571lr().m1894dy();
        ?? M5642m9 = (kg7Var == null || kg7Var.m63845kk() == m5642m9()) ? 0 : (Slide) C7019kk.m27452k4((Object) kg7Var.m63845kk(), Slide.class);
        boolean z = M5642m9 != 0 && M5642m9.getThemeManager().isOverrideThemeEnabled();
        if (z) {
            M1894dy.mo4833k4(M5642m9, dm6.f4613k4);
        }
        if (M1894dy.getWidth() != 0.0d) {
            C11896dy c11896dy3 = (C11896dy) c11896dy.deepClone();
            c11896dy3.m55549k4(new C12026yj(C12003du.m56460uz().Clone(), (float) M1894dy.getWidth()));
            c11896dy2 = c11896dy3;
        } else {
            c11896dy2 = c11896dy;
        }
        if (M5642m9 == 0) {
            M5642m9 = m5642m9();
        }
        azo azoVar = new azo(new ajz(shapeFrame.cloneT(), c4317dy, c11896dy2, M5642m9, kg7Var), M1894dy, 0);
        if (z) {
            M1894dy.mo4833k4(m5642m9(), dm6.f4613k4);
        }
        return azoVar;
    }

    /* JADX INFO: renamed from: to */
    public final GeometryShape m4338to() {
        return (GeometryShape) m5629du();
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m4331x1(IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        if (iEffectFormatEffectiveData == null) {
            return true;
        }
        if (iEffectFormatEffectiveData.getFillOverlayEffect() != null) {
            return false;
        }
        if (iEffectFormatEffectiveData.getBlurEffect() == null || iEffectFormatEffectiveData.getBlurEffect().getRadius() == 0.0d) {
            return iEffectFormatEffectiveData.getSoftEdgeEffect() == null || iEffectFormatEffectiveData.getSoftEdgeEffect().getRadius() <= 0.0d;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public C0962es mo4333k4(AbstractC14897zn abstractC14897zn, ShapeFrame shapeFrame, C11896dy c11896dy, C0962es[] c0962esArr, byte b, IFillParamSource iFillParamSource, kg7 kg7Var) {
        FillFormat fillFormat;
        int i = b & 255;
        C0962es c0962esM5660k4 = c0962esArr[i];
        if (c0962esM5660k4 != null) {
            return c0962esM5660k4;
        }
        if (b == 0) {
            return null;
        }
        if (C7019kk.m27469x1(iFillParamSource, FillFormat.class)) {
            if (m5629du().getFillFormat().getFillType() == 2 && m5629du().getFillFormat().getGradientFormat() != null && m5629du().getFillFormat().getGradientFormat().getGradientStops().size() == 0) {
                fillFormat = new FillFormat(m5629du());
                fillFormat.setFillType((byte) 2);
                fillFormat.getGradientFormat().setGradientShape((byte) 0);
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.0f, C12003du.m56460uz().Clone());
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(1.0f, C12003du.m56385i5().Clone());
                fillFormat.getGradientFormat().setLinearGradientAngle(m5629du().getFillFormat().getGradientFormat().getLinearGradientAngle());
            } else {
                fillFormat = m5629du().f3303dy;
            }
            C14176nc c14176ncM1454dy = fillFormat.m1454dy();
            Slide slide = (kg7Var == null || kg7Var.m63845kk() == m5642m9()) ? null : (Slide) C7019kk.m27452k4((Object) kg7Var.m63845kk(), Slide.class);
            boolean z = slide != null && slide.getThemeManager().isOverrideThemeEnabled();
            if (z) {
                c14176ncM1454dy.mo4833k4(slide, dm6.f4613k4);
            }
            C0962es c0962esM5660k42 = C0962es.m5660k4(new ajz(((c14176ncM1454dy.m67928dy() && m5629du().isGrouped()) ? m5629du().m2573s7().getFrame() : shapeFrame).cloneT(), abstractC14897zn, (c14176ncM1454dy.m67928dy() && m5629du().isGrouped()) ? null : c11896dy, m5642m9(), m4338to().getShapeType(), kg7Var), c14176ncM1454dy, b, (EffectFormat) m5629du().getEffectFormat());
            if (z) {
                c14176ncM1454dy.mo4833k4(m5642m9(), dm6.f4613k4);
            }
            if (c14176ncM1454dy.getFillType() == 2 && m5629du().isGrouped() && C7019kk.m27469x1(m5629du().getParentGroup().getFillFormat(), FillFormat.class)) {
                IFillFormatEffectiveData effective = ((FillFormat) m5629du().getParentGroup().getFillFormat()).getEffective();
                if (C7019kk.m27469x1(c0962esM5660k42, C14478sy.class) && effective.getFillType() == 2) {
                    IShapeFrame frame = m5629du().getFrame();
                    C4317dy c4317dy = new C4317dy(frame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, frame.getFlipV() == 1 ? -1.0f : 1.0f, frame.getFlipH() == 1 ? frame.getCenterX() * 2.0f : 0.0f, frame.getFlipV() == 1 ? frame.getCenterY() * 2.0f : 0.0f);
                    if (!C14064he.m66715kk(frame.getRotation())) {
                        c4317dy.m17339k4((frame.getFlipH() == 1) ^ (frame.getFlipV() == 1) ? -frame.getRotation() : frame.getRotation(), new C12025x6(frame.getCenterX(), frame.getCenterY()), 0);
                    }
                    C11913yj c11913yjM13229x1 = C3108y2.m13229x1(c4317dy);
                    if (c11913yjM13229x1.m55778kk()) {
                        IShapeFrame frame2 = m5629du().getParentGroup().getFrame();
                        C4317dy c4317dy2 = new C4317dy(frame2.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, frame2.getFlipV() == 1 ? -1.0f : 1.0f, frame2.getFlipH() == 1 ? frame2.getCenterX() * 2.0f : 0.0f, frame2.getFlipV() == 1 ? frame2.getCenterY() * 2.0f : 0.0f);
                        if (!C14064he.m66715kk(frame2.getRotation())) {
                            c4317dy2.m17339k4((frame2.getFlipH() == 1) ^ (frame2.getFlipV() == 1) ? -frame2.getRotation() : frame2.getRotation(), new C12025x6(frame2.getCenterX(), frame2.getCenterY()), 0);
                        }
                        C11913yj c11913yjM13229x12 = C3108y2.m13229x1(c4317dy2);
                        c11913yjM13229x1.m55780m9();
                        c11913yjM13229x1.m55769k4(c11913yjM13229x12, 0);
                        ((C14478sy) C7019kk.m27452k4((Object) c0962esM5660k42, C14478sy.class)).m70891k4(c11913yjM13229x1);
                    }
                }
            }
            c0962esM5660k4 = c0962esM5660k42;
        } else if (C7019kk.m27469x1(iFillParamSource, PictureFillFormat.class)) {
            c0962esM5660k4 = new cxj(new ajz(shapeFrame.cloneT(), abstractC14897zn, c11896dy, m5642m9(), m4338to().getShapeType(), kg7Var), (EffectFormat) m5629du().getEffectFormat(), (PictureFillFormat) iFillParamSource, !r1.m2247du());
        } else if (C7019kk.m27469x1(iFillParamSource, Background.class)) {
            C14176nc c14176nc = (C14176nc) ((Background) iFillParamSource).getEffective().getFillFormat();
            c0962esM5660k4 = C0962es.m5660k4(new ajz(((c14176nc.m67928dy() && m5629du().isGrouped()) ? m5629du().m2573s7().getFrame() : shapeFrame).cloneT(), abstractC14897zn.m74623ks(), (c14176nc.m67928dy() && m5629du().isGrouped()) ? null : c11896dy, m5642m9(), kg7Var), c14176nc, b, (EffectFormat) m5629du().getEffectFormat());
        }
        c0962esArr[i] = c0962esM5660k4;
        return c0962esM5660k4;
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        if (m5629du().getHidden()) {
            return;
        }
        m4326k4(abstractC14897zn, kg7Var, m5631fa());
    }

    /* JADX INFO: renamed from: k4 */
    private void m4326k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeFrame shapeFrame) {
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68801x1(m5629du().getHyperlinkClick());
        }
        if (shapeFrame.getWidth() == 0.0f && shapeFrame.getHeight() == 0.0f) {
            return;
        }
        float x = shapeFrame.getX();
        float y = shapeFrame.getY();
        float width = shapeFrame.getWidth();
        float height = shapeFrame.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        C4317dy c4317dy = new C4317dy(shapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrame.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrame.getFlipH() == 1 ? shapeFrame.getCenterX() * 2.0f : 0.0f, shapeFrame.getFlipV() == 1 ? shapeFrame.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(shapeFrame.getRotation())) {
            c4317dy.m17339k4((shapeFrame.getFlipH() == 1) ^ (shapeFrame.getFlipV() == 1) ? -shapeFrame.getRotation() : shapeFrame.getRotation(), new C12025x6(shapeFrame.getCenterX(), shapeFrame.getCenterY()), 0);
        }
        Shape[] shapeArrM2547c6 = m5629du().m2547c6();
        C0735a7 c0735a7M1591yj = m4338to().m1591yj();
        if (c0735a7M1591yj.m3308ck() == -1) {
            for (Shape shape : shapeArrM2547c6) {
                GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shape, GeometryShape.class);
                if (geometryShape != null && geometryShape.m1591yj().m3308ck() != -1) {
                    if (m5629du().getLineFormat() != null && m5629du().getLineFormat().getSketchFormat().getSketchType() == 0) {
                        if (geometryShape.getLineFormat() == null || ((SketchFormat) geometryShape.getLineFormat().getSketchFormat()).m2670du().m3308ck() != -1) {
                            c0735a7M1591yj = ((SketchFormat) geometryShape.getLineFormat().getSketchFormat()).m2670du();
                            break;
                        }
                    } else {
                        c0735a7M1591yj = geometryShape.m1591yj();
                        break;
                    }
                }
            }
        }
        C0735a7 c0735a7 = c0735a7M1591yj;
        if (C14116yg.m67480k4(x) < 0.26f) {
            x = 0.0f;
        }
        ShapeElement[] shapeElementArrM3327k4 = c0735a7.m3327k4(m5629du(), x, C14116yg.m67480k4(y) < 0.26f ? 0.0f : y, width, height);
        IEffectFormatEffectiveData effective = shapeElementArrM3327k4.length > 0 ? m5629du().m2595yd().getEffective() : null;
        boolean zM5722k4 = m4331x1(effective) ? C0964eu.m5722k4(abstractC14897zn, kg7Var, m4338to(), shapeElementArrM3327k4, shapeFrame, m5629du().getFillFormat()) : false;
        if (!zM5722k4) {
            abstractC14897zn.m74622kk(c4317dy);
            mo4335k4(abstractC14897zn, kg7Var, shapeElementArrM3327k4, shapeFrame, effective, (byte) 7);
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68800x1();
        }
        if (zM5722k4) {
            return;
        }
        abstractC14897zn.m74626rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4334k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame) {
        if (shapeElementArr.length == 0) {
            return;
        }
        azo azoVarM4332k4 = m4332k4(shapeFrame, abstractC14897zn.m74623ks(), shapeElementArr[0].f3355x1, kg7Var);
        for (int i = 0; i < shapeElementArr.length; i++) {
            if (shapeElementArr[i].getStrokeSource() != 0 && shapeElementArr[i].f3355x1.m55525du() != 0) {
                abstractC14897zn.mo64338k4(shapeElementArr[i].f3355x1, azoVarM4332k4, (C0962es) null);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4335k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IEffectFormatEffectiveData iEffectFormatEffectiveData, byte b) {
        FillFormat fillFormat;
        if ((b & 2) != 0 && m4328k4(iEffectFormatEffectiveData)) {
            m4336k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, (IFillParamSource) m5629du().getFillFormat(), iEffectFormatEffectiveData, true);
        }
        int i = b & 1;
        if (i != 0 && m4331x1(iEffectFormatEffectiveData)) {
            IPictureFillFormat pictureFillFormat = (IPictureFillFormat) C7019kk.m27452k4((Object) m5629du().getFillFormat(), IPictureFillFormat.class);
            if (pictureFillFormat == null && (fillFormat = (FillFormat) C7019kk.m27452k4((Object) m5629du().getFillFormat(), FillFormat.class)) != null) {
                pictureFillFormat = fillFormat.getPictureFillFormat();
            }
            m4337k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, m5629du().getFillFormat(), pictureFillFormat);
        }
        if ((b & 4) != 0 && m4328k4(iEffectFormatEffectiveData)) {
            m4336k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, (IFillParamSource) m5629du().getFillFormat(), iEffectFormatEffectiveData, false);
        }
        if (i == 0 || !m4329kk(iEffectFormatEffectiveData)) {
            return;
        }
        m4334k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4336k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource, IEffectFormatEffectiveData iEffectFormatEffectiveData, boolean z) {
        C0962es[] c0962esArr;
        C0962es c0962esMo4333k4;
        ShapeFrame shapeFrame2;
        cxj cxjVar;
        AbstractC12002ck abstractC12002ckM4846bv;
        if (iEffectFormatEffectiveData == null || shapeElementArr.length == 0) {
            return;
        }
        boolean z2 = (iEffectFormatEffectiveData.getReflectionEffect() == null && iEffectFormatEffectiveData.getOuterShadowEffect() == null && iEffectFormatEffectiveData.getGlowEffect() == null && iEffectFormatEffectiveData.getBlurEffect() == null && iEffectFormatEffectiveData.getSoftEdgeEffect() == null && iEffectFormatEffectiveData.getFillOverlayEffect() == null) ? false : true;
        boolean z3 = iEffectFormatEffectiveData.getInnerShadowEffect() != null;
        if ((!(z && z2) && (z || !z3)) || C7019kk.m27469x1(abstractC14897zn, lbk.class)) {
            return;
        }
        C0962es[] c0962esArr2 = new C0962es[6];
        int i = 0;
        while (i < shapeElementArr.length) {
            if (shapeElementArr[i].getStrokeSource() == 0 && shapeElementArr[i].f3348du == 0) {
                c0962esArr = c0962esArr2;
            } else {
                ShapeElement shapeElement = shapeElementArr[i];
                azo azoVarCloneT = null;
                if (shapeElement.f3348du == 0 || shapeElement.f3355x1.m55525du() == 0) {
                    c0962esArr = c0962esArr2;
                    c0962esMo4333k4 = null;
                } else {
                    ShapeElement shapeElement2 = shapeElementArr[i];
                    c0962esMo4333k4 = mo4333k4(abstractC14897zn, shapeFrame, shapeElement2.f3355x1, c0962esArr2, shapeElement2.f3348du, iFillParamSource, kg7Var);
                    c0962esArr = c0962esArr2;
                }
                if (shapeElementArr[i].getStrokeSource() == 0 || shapeElementArr[i].f3355x1.m55525du() == 0) {
                    shapeFrame2 = shapeFrame;
                } else {
                    shapeFrame2 = shapeFrame;
                    azoVarCloneT = m4332k4(shapeFrame, abstractC14897zn.m74623ks(), shapeElementArr[i].f3355x1, kg7Var).cloneT();
                }
                azo azoVar = azoVarCloneT;
                C11896dy c11896dy = shapeElementArr[i].f3355x1;
                if (iEffectFormatEffectiveData.getReflectionEffect() != null && z) {
                    new lzv(iEffectFormatEffectiveData.getReflectionEffect()).mo64370k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar, shapeFrame2);
                }
                if (iEffectFormatEffectiveData.getInnerShadowEffect() != null && !z) {
                    new lho(iEffectFormatEffectiveData.getInnerShadowEffect()).m64396k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar, shapeFrame);
                }
                if (iEffectFormatEffectiveData.getOuterShadowEffect() != null && z && m4327k4()) {
                    new nv2(iEffectFormatEffectiveData.getOuterShadowEffect()).m68226k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar);
                }
                if (iEffectFormatEffectiveData.getGlowEffect() != null && z && m4330x1()) {
                    new C14871z3(iEffectFormatEffectiveData.getGlowEffect()).m74297k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar);
                }
                if (iEffectFormatEffectiveData.getBlurEffect() != null && z) {
                    new C14874z6(iEffectFormatEffectiveData.getBlurEffect()).m74335k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar, shapeFrame);
                }
                if (iEffectFormatEffectiveData.getSoftEdgeEffect() != null && z) {
                    C0962es c0962es = c0962esMo4333k4;
                    new pij(iEffectFormatEffectiveData.getSoftEdgeEffect()).m69106k4(abstractC14897zn, kg7Var, c11896dy, c0962es, azoVar);
                    c11896dy = c11896dy;
                    c0962esMo4333k4 = c0962es;
                    azoVar = azoVar;
                }
                if (iEffectFormatEffectiveData.getFillOverlayEffect() != null && z) {
                    new C14146mw(iEffectFormatEffectiveData.getFillOverlayEffect()).m67754k4(abstractC14897zn, c11896dy, c0962esMo4333k4, azoVar, shapeFrame);
                }
                if (C7019kk.m27469x1(c0962esMo4333k4, cxj.class) && (abstractC12002ckM4846bv = (cxjVar = (cxj) c0962esMo4333k4).m4846bv()) != null && kg7Var.m63839k4(abstractC12002ckM4846bv) == null) {
                    cxjVar.dispose();
                }
            }
            i++;
            c0962esArr2 = c0962esArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4337k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource, IPictureFillFormat iPictureFillFormat) {
        ShapeFrame shapeFrame2;
        cxj cxjVar;
        AbstractC12002ck abstractC12002ckM4846bv;
        C0962es[] c0962esArr = new C0962es[6];
        C12007ix c12007ixClone = shapeFrame.m2660k4().Clone();
        C12007ix c12007ixClone2 = C12007ix.f40519k4.Clone();
        for (int i = 0; i < shapeElementArr.length; i++) {
            if (shapeElementArr[i].m2657x1() == 0 && shapeElementArr[i].getFillSource() != 0) {
                C11896dy c11896dy = (C11896dy) shapeElementArr[i].m2656k4().deepClone();
                c11896dy.m55526dy();
                (c12007ixClone2.m56568kk() ? c11896dy.m55523c5() : C12007ix.m56549x1(c12007ixClone2.Clone(), c11896dy.m55523c5().Clone())).CloneTo(c12007ixClone2);
                c11896dy.dispose();
            }
        }
        if (!c12007ixClone.m56581x1(c12007ixClone2.Clone())) {
            c12007ixClone2 = C12007ix.m56549x1(c12007ixClone.Clone(), c12007ixClone2.Clone());
        }
        c12007ixClone2.CloneTo(c12007ixClone);
        if (c12007ixClone.m56550c5() == 0.0f || c12007ixClone.m56575x1() == 0.0f) {
            return;
        }
        C14250os c14250os = (C14250os) C7019kk.m27452k4((Object) abstractC14897zn, C14250os.class);
        ShapeFrame shapeFrame3 = new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), shapeFrame.getFlipH(), shapeFrame.getFlipV(), shapeFrame.getRotation());
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) m5629du(), AutoShape.class);
        if (autoShape == null || autoShape.m288x1() == null || autoShape.m1591yj().m3307c5() != -1 || !autoShape.m287up() || autoShape.m279h4() == null || autoShape.m279h4().getFillType() != 4) {
            shapeFrame2 = shapeFrame3;
        } else {
            TextFrame textFrameM288x1 = autoShape.m288x1();
            float width = autoShape.m279h4().getPictureFillFormat().getPicture().getImage().getWidth();
            float height = autoShape.m279h4().getPictureFillFormat().getPicture().getImage().getHeight();
            float fMo15752dy = ((PPImage) autoShape.m279h4().getPictureFillFormat().getPicture().getImage()).m2131k4().mo15752dy();
            float fMo15758up = ((PPImage) autoShape.m279h4().getPictureFillFormat().getPicture().getImage()).m2131k4().mo15758up();
            float f = width / height;
            if (f != c12007ixClone.m56550c5() / c12007ixClone.m56575x1() && textFrameM288x1.getParagraphs().getCount() > 0) {
                float fM56550c5 = c12007ixClone.m56550c5();
                float fM56575x1 = c12007ixClone.m56575x1();
                float fM56557jd = c12007ixClone.m56557jd();
                float fM56551ck = c12007ixClone.m56551ck();
                if (textFrameM288x1.getParagraphs().get_Item(0).getParagraphFormat().getAlignment() == 1) {
                    fM56550c5 = ((c12007ixClone.m56575x1() * f) * fMo15752dy) / 96.0f;
                    fM56557jd = ((c12007ixClone.m56550c5() - fM56550c5) / 2.0f) + c12007ixClone.m56557jd();
                    fM56575x1 *= fMo15758up / 96.0f;
                }
                shapeFrame2 = new ShapeFrame(fM56557jd, fM56551ck, fM56550c5, fM56575x1, shapeFrame3.getFlipH(), shapeFrame3.getFlipV(), shapeFrame3.getRotation());
            }
        }
        synchronized (f4253k4) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= shapeElementArr.length) {
                        break;
                    }
                    ShapeElement shapeElement = shapeElementArr[i2];
                    if (shapeElement.f3348du != 0 && shapeElement.f3355x1.m55525du() != 0) {
                        ShapeElement shapeElement2 = shapeElementArr[i2];
                        C0962es c0962esMo4333k4 = mo4333k4(abstractC14897zn, shapeFrame2, shapeElement2.f3355x1, c0962esArr, shapeElement2.f3348du, iFillParamSource, kg7Var);
                        boolean z = iPictureFillFormat != null && tta.m71309k4(iPictureFillFormat.getPicture().getImageTransform());
                        if (c14250os != null && !c14250os.m68789ck() && z && iPictureFillFormat.getPicture().getImage() != null) {
                            C6921dy c6921dyM5672du = c0962esMo4333k4.m5672du();
                            if (C7019kk.m27469x1(c0962esMo4333k4, cxj.class) && ((cxj) C7019kk.m27452k4((Object) c0962esMo4333k4, cxj.class)).m4860v4()) {
                                c14250os.mo68793k4(iPictureFillFormat.getPicture().getImage(), ((cxj) C7019kk.m27452k4((Object) c0962esMo4333k4, cxj.class)).m71131xk().Clone(), new qta(C12003du.f40505to.Clone(), c6921dyM5672du));
                                break;
                            }
                            if (iPictureFillFormat.getPicture().getImage().getSvgImage() != null) {
                                C12007ix c12007ix = new C12007ix();
                                if (C7019kk.m27469x1(c0962esMo4333k4, tf7.class)) {
                                    ((tf7) C7019kk.m27452k4((Object) c0962esMo4333k4, tf7.class)).m71131xk().CloneTo(c12007ix);
                                } else {
                                    c12007ix = new C12007ix(0.0f, 0.0f, 0.0f, 0.0f);
                                }
                                IPPImage iPPImageAddImage = m5632h4().getImages().addImage(iPictureFillFormat.getPicture().getImage().getSvgImage());
                                c14250os.mo68793k4(iPPImageAddImage, c12007ix.Clone(), new qta(C12003du.f40505to.Clone(), c6921dyM5672du));
                                ((ImageCollection) m5632h4().getImages()).m1732k4(iPPImageAddImage);
                            }
                        }
                        int iMo17603x6 = abstractC14897zn.m74608ar().mo17603x6();
                        if (shapeElementArr[i2].f3355x1.m55565kk().length == 4 && (!C7019kk.m27469x1(c0962esMo4333k4, cxj.class) || !((cxj) C7019kk.m27452k4((Object) c0962esMo4333k4, cxj.class)).m4860v4() || !z || !c0962esMo4333k4.m5672du().m27130k4())) {
                            abstractC14897zn.m74608ar().mo17481h4(3);
                        }
                        abstractC14897zn.mo64338k4(shapeElementArr[i2].f3355x1, (azo) null, c0962esMo4333k4);
                        abstractC14897zn.m74608ar().mo17481h4(iMo17603x6);
                        if (C7019kk.m27469x1(c0962esMo4333k4, cxj.class) && (abstractC12002ckM4846bv = (cxjVar = (cxj) c0962esMo4333k4).m4846bv()) != null) {
                            if (kg7Var.m63839k4(abstractC12002ckM4846bv) == null) {
                                cxjVar.dispose();
                            }
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4327k4() {
        return (m5629du().isGrouped() && m5629du().getParentGroup().getEffectFormat().getOuterShadowEffect() != null && m5629du().getEffectFormat().getOuterShadowEffect() == null && m5629du().getParentGroup().getThreeDFormat().getCamera().getCameraType() == -1 && m5629du().getThreeDFormat().getCamera().getCameraType() == -1) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m4328k4(IEffectFormatEffectiveData iEffectFormatEffectiveData) {
        return (iEffectFormatEffectiveData == null || iEffectFormatEffectiveData.isNoEffects()) ? false : true;
    }
}
