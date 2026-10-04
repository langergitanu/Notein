package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class bp9 {
    /* JADX INFO: renamed from: k4 */
    public static a1f m4288k4(GeometryShape geometryShape) {
        a1f a1fVarM4290k4 = m4290k4(geometryShape.m2545bv());
        if (a1fVarM4290k4 != null && C7019kk.m27469x1(geometryShape, SmartArtShape.class) && geometryShape.getThreeDFormat().getLightRig().getLightType() == -1) {
            C8820sx c8820sxM45520kk = ((SmartArtShape) C7019kk.m27452k4((Object) geometryShape, SmartArtShape.class)).m2821up().m4099m9().m72922rv().m3357x1().mo272to().m63499du().m45520kk();
            a1fVarM4290k4.m3160kk(c8820sxM45520kk.m41420kk().m28484x1());
            a1fVarM4290k4.m3165x1(c8820sxM45520kk.m41420kk().m28482kk());
            if (c8820sxM45520kk.m41420kk().m28483to() != null) {
                a1fVarM4290k4.m3157k4(new float[]{c8820sxM45520kk.m41420kk().m28483to().m36587k4(), c8820sxM45520kk.m41420kk().m28483to().m36591x1(), c8820sxM45520kk.m41420kk().m28483to().m36589kk()});
            }
        }
        return a1fVarM4290k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m4292x1(GeometryShape geometryShape) {
        if (C7019kk.m27469x1(geometryShape, SmartArtShape.class)) {
            SmartArtShape smartArtShape = (SmartArtShape) C7019kk.m27452k4((Object) geometryShape, SmartArtShape.class);
            if (smartArtShape.m2821up().m4099m9().m72922rv().m3357x1().getLayout() == 113 && smartArtShape.getShapeType() == 5) {
                return false;
            }
        }
        return !you.m73962x1(geometryShape.getShapeType());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a1f m4289k4(GeometryShape geometryShape, boolean[] zArr) {
        a1f a1fVarM4288k4 = m4288k4(geometryShape);
        zArr[0] = true;
        if (a1fVarM4288k4 != null && m4292x1(geometryShape)) {
            float width = geometryShape.getWidth();
            C4459os c4459os = C14877z9.f50499x1;
            if (width >= c4459os.m18285k4() || geometryShape.getHeight() >= c4459os.m18290x1()) {
                if (a1fVarM4288k4.m3161m9() != null && a1fVarM4288k4.m3161m9().getWidth() < C14877z9.f50497k4.m18285k4() && 0.0d < a1fVarM4288k4.m3161m9().getHeight()) {
                    a1fVarM4288k4.m3155k4((IShapeBevel) null);
                }
                if (a1fVarM4288k4.m3149dy() != null) {
                    double width2 = a1fVarM4288k4.m3149dy().getWidth();
                    C4459os c4459os2 = C14877z9.f50497k4;
                    if (width2 < c4459os2.m18285k4() || a1fVarM4288k4.m3149dy().getHeight() < c4459os2.m18290x1()) {
                    }
                }
                zArr[0] = a1fVarM4288k4.m3161m9() == null;
            } else {
                a1fVarM4288k4.m3155k4((IShapeBevel) null);
            }
            a1fVarM4288k4.m3166x1((IShapeBevel) null);
            zArr[0] = a1fVarM4288k4.m3161m9() == null;
        }
        return a1fVarM4288k4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a1f m4290k4(IThreeDFormat iThreeDFormat) {
        C14093tq<C12003du> c14093tq;
        IShapeBevelEffectiveData bevelBottom = null;
        bevelBottom = null;
        bevelBottom = null;
        IShapeBevel bevelBottom2 = null;
        bevelBottom = null;
        bevelBottom = null;
        if (((ThreeDFormat) iThreeDFormat).m3012x1() == null) {
            IThreeDFormatEffectiveData effective = iThreeDFormat.getEffective();
            if (effective.getCamera().getCameraType() == -1) {
                return null;
            }
            a1f a1fVar = new a1f();
            a1fVar.m3153k4((float) effective.getExtrusionHeight());
            a1fVar.m3164x1((float) effective.getDepth());
            a1fVar.m3154k4(effective.getMaterial());
            fpw fpwVar = (fpw) effective;
            a1fVar.m3156k4(new C14093tq<>(fpwVar.m6253dy().Clone()));
            a1fVar.m3159kk((float) effective.getContourWidth());
            a1fVar.m3167x1(new C14093tq<>(fpwVar.m6259m9().Clone()));
            IShapeBevelEffectiveData bevelTop = (effective.getBevelTop() == null || effective.getBevelTop().getBevelType() == -1 || effective.getBevelTop().getHeight() <= Double.MIN_VALUE) ? null : effective.getBevelTop();
            if (bevelTop != null) {
                ShapeBevel shapeBevel = new ShapeBevel(true);
                shapeBevel.m2601k4(bevelTop);
                a1fVar.m3155k4(shapeBevel);
            }
            if (effective.getBevelBottom() != null && effective.getBevelBottom().getBevelType() != -1 && effective.getBevelBottom().getHeight() > Double.MIN_VALUE) {
                bevelBottom = effective.getBevelBottom();
            }
            if (bevelBottom != null) {
                ShapeBevel shapeBevel2 = new ShapeBevel(false);
                shapeBevel2.m2601k4(bevelBottom);
                a1fVar.m3166x1(shapeBevel2);
            }
            a1fVar.m3165x1(effective.getLightRig().getDirection());
            a1fVar.m3160kk(effective.getLightRig().getLightType());
            a1fVar.m3157k4(effective.getLightRig().getRotation());
            return a1fVar;
        }
        a1f a1fVar2 = new a1f();
        a1fVar2.m3153k4((float) iThreeDFormat.getExtrusionHeight());
        a1fVar2.m3164x1((float) iThreeDFormat.getDepth());
        a1fVar2.m3154k4(iThreeDFormat.getMaterial());
        a1fVar2.m3159kk((float) iThreeDFormat.getContourWidth());
        if (iThreeDFormat.getExtrusionColor().getColorType() != -1) {
            a1fVar2.m3156k4(new C14093tq<>(((ColorFormat) iThreeDFormat.getExtrusionColor()).m1084to().Clone()));
        }
        if (iThreeDFormat.getContourColor().getColorType() == -1) {
            if (a1fVar2.m3162to() > 0.0f) {
                c14093tq = new C14093tq<>(((fpw) iThreeDFormat.getEffective()).m6259m9().Clone());
            }
            a1fVar2.m3155k4((iThreeDFormat.getBevelTop() != null || iThreeDFormat.getBevelTop().getBevelType() == -1 || iThreeDFormat.getBevelTop().getHeight() <= Double.MIN_VALUE) ? null : iThreeDFormat.getBevelTop());
            if (iThreeDFormat.getBevelBottom() != null && iThreeDFormat.getBevelBottom().getBevelType() != -1 && iThreeDFormat.getBevelBottom().getHeight() > Double.MIN_VALUE) {
                bevelBottom2 = iThreeDFormat.getBevelBottom();
            }
            a1fVar2.m3166x1(bevelBottom2);
            a1fVar2.m3165x1(iThreeDFormat.getLightRig().getDirection());
            a1fVar2.m3160kk(iThreeDFormat.getLightRig().getLightType());
            a1fVar2.m3157k4(iThreeDFormat.getLightRig().getRotation());
            return a1fVar2;
        }
        c14093tq = new C14093tq<>(((ColorFormat) iThreeDFormat.getContourColor()).m1084to().Clone());
        a1fVar2.m3167x1(c14093tq);
        a1fVar2.m3155k4((iThreeDFormat.getBevelTop() != null || iThreeDFormat.getBevelTop().getBevelType() == -1 || iThreeDFormat.getBevelTop().getHeight() <= Double.MIN_VALUE) ? null : iThreeDFormat.getBevelTop());
        if (iThreeDFormat.getBevelBottom() != null) {
            bevelBottom2 = iThreeDFormat.getBevelBottom();
        }
        a1fVar2.m3166x1(bevelBottom2);
        a1fVar2.m3165x1(iThreeDFormat.getLightRig().getDirection());
        a1fVar2.m3160kk(iThreeDFormat.getLightRig().getLightType());
        a1fVar2.m3157k4(iThreeDFormat.getLightRig().getRotation());
        return a1fVar2;
    }

    /* JADX INFO: renamed from: k4 */
    public static a1f m4291k4(TextFrame textFrame) {
        return m4290k4(textFrame.m2908jd().getThreeDFormat());
    }
}
