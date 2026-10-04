package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class bwt extends C0833bw {
    public bwt(PictureFrame pictureFrame) {
        super(pictureFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public final PictureFrame m4342k4() {
        return (PictureFrame) m5629du();
    }

    @Override // com.aspose.slides.C0833bw, com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        AbstractC14897zn abstractC14897zn2 = abstractC14897zn;
        if (m4342k4().getPictureFormat().getPicture().getImage() != null && m4342k4().getPictureFormat().getPicture().getImage().getSvgImage() != null && "image/png".equals(m4342k4().getPictureFormat().getPicture().getImage().getContentType())) {
            m4342k4().m2262k4(m4342k4().getPictureFormat().getPicture().getImage());
        }
        if (m5629du().getHidden()) {
            return;
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn2.mo68801x1(m5629du().getHyperlinkClick());
        }
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        C4317dy c4317dy = new C4317dy(shapeFrameM5631fa.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrameM5631fa.getFlipH() == 1 ? shapeFrameM5631fa.getCenterX() * 2.0f : 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? shapeFrameM5631fa.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(shapeFrameM5631fa.getRotation())) {
            c4317dy.m17339k4((shapeFrameM5631fa.getFlipH() == 1) ^ (shapeFrameM5631fa.getFlipV() == 1) ? -shapeFrameM5631fa.getRotation() : shapeFrameM5631fa.getRotation(), new C12025x6(shapeFrameM5631fa.getCenterX(), shapeFrameM5631fa.getCenterY()), 0);
        }
        Shape[] shapeArrM2547c6 = m5629du().m2547c6();
        C0735a7 c0735a7M1591yj = m4342k4().m1591yj();
        if (c0735a7M1591yj.m3308ck() == -1) {
            int i = 0;
            while (true) {
                if (i < shapeArrM2547c6.length) {
                    GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shapeArrM2547c6[i], GeometryShape.class);
                    if (geometryShape != null && geometryShape.m1591yj().m3308ck() != -1) {
                        c0735a7M1591yj = geometryShape.m1591yj();
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        C0735a7 c0735a7 = c0735a7M1591yj;
        if (c0735a7.m3308ck() == -1) {
            return;
        }
        ShapeElement[] shapeElementArrM3327k4 = c0735a7.m3327k4(m5629du(), x, y, width, height);
        IEffectFormatEffectiveData effective = shapeElementArrM3327k4.length > 0 ? m5629du().m2595yd().getEffective() : null;
        if (C0833bw.m4331x1(effective)) {
            zM5723k4 = C14540tc.m71073x1(m4342k4()) ? C0964eu.m5723k4(abstractC14897zn2, kg7Var, m4342k4(), shapeElementArrM3327k4, shapeFrameM5631fa, m5629du().getFillFormat(), true) : false;
            if (zM5723k4) {
                abstractC14897zn2 = abstractC14897zn;
            } else {
                abstractC14897zn2 = abstractC14897zn;
                zM5723k4 = C0964eu.m5722k4(abstractC14897zn2, kg7Var, m4342k4(), shapeElementArrM3327k4, shapeFrameM5631fa, m4342k4().getPictureFormat());
            }
        }
        boolean z = zM5723k4;
        if (!z) {
            abstractC14897zn2.m74622kk(c4317dy);
            mo4335k4(abstractC14897zn2, kg7Var, shapeElementArrM3327k4, shapeFrameM5631fa, effective, (byte) 7);
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68800x1();
        }
        if (z) {
            return;
        }
        abstractC14897zn.m74626rv();
    }

    @Override // com.aspose.slides.C0833bw
    /* JADX INFO: renamed from: k4 */
    public void mo4335k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IEffectFormatEffectiveData iEffectFormatEffectiveData, byte b) {
        FillFormat fillFormat;
        if ((b & 2) != 0 && C0833bw.m4328k4(iEffectFormatEffectiveData)) {
            m4336k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, (IFillParamSource) m5629du().getFillFormat(), iEffectFormatEffectiveData, true);
            m4336k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, (IFillParamSource) m4342k4().getPictureFormat(), iEffectFormatEffectiveData, true);
        }
        int i = b & 1;
        if (i != 0 && C0833bw.m4331x1(iEffectFormatEffectiveData)) {
            boolean zM74629wl = abstractC14897zn.m74629wl();
            if (m4342k4().getPictureFormat().getPicture().getImage() != null) {
                String contentType = m4342k4().getPictureFormat().getPicture().getImage().getContentType();
                if (!"image/x-emf".equals(contentType) && !"image/x-wmf".equals(contentType)) {
                    abstractC14897zn.m74617k4(false);
                }
            }
            IPictureFillFormat pictureFillFormat = (IPictureFillFormat) C7019kk.m27452k4((Object) m5629du().getFillFormat(), IPictureFillFormat.class);
            if (pictureFillFormat == null && (fillFormat = (FillFormat) C7019kk.m27452k4((Object) m5629du().getFillFormat(), FillFormat.class)) != null) {
                pictureFillFormat = fillFormat.getPictureFillFormat();
            }
            m4337k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, m5629du().getFillFormat(), pictureFillFormat);
            m4337k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, m4342k4().getPictureFormat(), m4342k4().getPictureFormat());
            abstractC14897zn.m74617k4(zM74629wl);
        }
        if ((b & 4) != 0 && C0833bw.m4328k4(iEffectFormatEffectiveData)) {
            m4336k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame, (IFillParamSource) m4342k4().getPictureFormat(), iEffectFormatEffectiveData, false);
        }
        if (i == 0 || !C0833bw.m4329kk(iEffectFormatEffectiveData)) {
            return;
        }
        m4334k4(abstractC14897zn, kg7Var, shapeElementArr, shapeFrame);
    }
}
