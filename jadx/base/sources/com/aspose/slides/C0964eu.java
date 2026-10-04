package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.eu */
/* JADX INFO: loaded from: classes3.dex */
class C0964eu {

    /* JADX INFO: renamed from: k4 */
    private static boolean f4877k4 = true;

    /* JADX INFO: renamed from: k4 */
    private static float m5715k4(kg7 kg7Var, AbstractC14897zn abstractC14897zn) {
        float f;
        float fM63832ck;
        if (kg7Var.m63851up() > 0 && C7019kk.m27469x1(abstractC14897zn, vhx.class)) {
            fM63832ck = kg7Var.m63851up();
        } else {
            if (kg7Var.m63832ck() <= 0.0f) {
                f = 1.0f;
                return f * 1.0f;
            }
            fM63832ck = kg7Var.m63832ck();
        }
        f = fM63832ck / 96.0f;
        return f * 1.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1223ht m5716k4(Shape shape, kg7 kg7Var, AbstractC14897zn abstractC14897zn, boolean[] zArr) {
        zArr[0] = false;
        if (!C7019kk.m27469x1(shape, GroupShape.class) || ((GroupShape) shape).getShapes().size() <= 1 || !you.m73958k4(shape) || !you.m73958k4(shape)) {
            return null;
        }
        zArr[0] = true;
        return new C1223ht(shape, m5715k4(kg7Var, abstractC14897zn));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m5717k4(Shape shape) {
        return (m5719k4() && C7019kk.m27469x1(shape, GeometryShape.class)) ? new you(1.0f).m73963k4((GeometryShape) shape, (ShapeFrame) shape.getFrame()) : new C12007ix(shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5718k4(boolean z) {
        f4877k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5719k4() {
        return f4877k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5720k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, Cell cell, ShapeFrame shapeFrame, C11896dy c11896dy, C0962es c0962es) {
        try {
            return new C13661iu(m5715k4(kg7Var, abstractC14897zn)).m63118k4(abstractC14897zn, cell, shapeFrame, c11896dy, c0962es);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5721k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, TextFrame textFrame) {
        try {
            if (!m5719k4() || czz.m4890kk(textFrame)) {
                return false;
            }
            if (C14221ob.m68433k4(textFrame)) {
                C14221ob c14221ob = new C14221ob(m5715k4(kg7Var, abstractC14897zn));
                c14221ob.m73297k4(geometryShape.isGrouped() && !C14540tc.m71073x1(geometryShape));
                return c14221ob.m68434k4(abstractC14897zn, kg7Var, geometryShape, textFrame);
            }
            czz czzVar = new czz(m5715k4(kg7Var, abstractC14897zn) * (czz.m4891x1(textFrame) ? 2.0f : 1.0f));
            czzVar.m73297k4(geometryShape.isGrouped());
            return czzVar.m4892k4(abstractC14897zn, kg7Var, geometryShape, textFrame);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m5722k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource) {
        return m5723k4(abstractC14897zn, kg7Var, geometryShape, shapeElementArr, shapeFrame, iFillParamSource, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5723k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource, boolean z) {
        GeometryShape geometryShape2;
        boolean z2;
        try {
            if (!m5719k4()) {
                return false;
            }
            if (z || C14540tc.m71073x1(geometryShape)) {
                return new C14540tc(m5715k4(kg7Var, abstractC14897zn)).m71074k4(abstractC14897zn, kg7Var, geometryShape, shapeElementArr, shapeFrame, iFillParamSource);
            }
            if (geometryShape.isGrouped()) {
                IThreeDFormatEffectiveData effective = geometryShape.getParentGroup().getThreeDFormat().getEffective();
                if (C7019kk.m27469x1(geometryShape, SmartArtShape.class) || effective.getCamera().getCameraType() != -1) {
                    shapeFrame = (ShapeFrame) geometryShape.getParentGroup().getFrame();
                    z2 = true;
                    ShapeFrame shapeFrameM5635k4 = geometryShape.m2546bz().m5635k4(true);
                    shapeElementArr = geometryShape.m1591yj().m3327k4(geometryShape, shapeFrameM5635k4.getX(), shapeFrameM5635k4.getY(), shapeFrameM5635k4.getWidth(), shapeFrameM5635k4.getHeight());
                    geometryShape2 = geometryShape;
                } else {
                    geometryShape2 = geometryShape;
                    z2 = false;
                }
            }
            ShapeElement[] shapeElementArr2 = shapeElementArr;
            ShapeFrame shapeFrame2 = shapeFrame;
            you youVarM7290x1 = kg7Var.m63852x6() != null ? kg7Var.m63852x6().m7290x1() : new you(m5715k4(kg7Var, abstractC14897zn));
            youVarM7290x1.m73297k4(z2);
            return youVarM7290x1.m73964k4(abstractC14897zn, kg7Var, geometryShape2, shapeElementArr2, shapeFrame2, iFillParamSource);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return false;
        }
    }
}
