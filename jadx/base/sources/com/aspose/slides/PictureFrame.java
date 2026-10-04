package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class PictureFrame extends GeometryShape implements IPictureFrame {

    /* JADX INFO: renamed from: m9 */
    static final Dictionary<Integer, Integer> f3031m9 = GeometryShape.m1582k4(true, 1, 96, 97, 98, 99, 100, 101, 102, 103, 104);

    /* JADX INFO: renamed from: h4 */
    final PictureFillFormat f3032h4;

    /* JADX INFO: renamed from: k4 */
    private ISvgImage f3033k4;

    public PictureFrame(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new itd(), new PictureFrameLock());
        this.f3032h4 = new PictureFillFormat(this);
        m2560k4(new bwt(this));
    }

    /* JADX INFO: renamed from: ck */
    public final ISvgImage m2260ck() {
        return this.f3033k4;
    }

    @Override // com.aspose.slides.IPictureFrame
    public final IPictureFillFormat getPictureFormat() {
        return this.f3032h4;
    }

    @Override // com.aspose.slides.IPictureFrame
    public final IPictureFrameLock getPictureFrameLock() {
        return (IPictureFrameLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.IPictureFrame
    public final float getRelativeScaleHeight() {
        return (float) C14116yg.m67477k4(getHeight() / ((72.0f / ((PPImage) getPictureFormat().getPicture().getImage()).m2123c5().m56895kk()) * getPictureFormat().getPicture().getImage().getHeight()), 2);
    }

    @Override // com.aspose.slides.IPictureFrame
    public final float getRelativeScaleWidth() {
        return (float) C14116yg.m67477k4(getWidth() / ((72.0f / ((PPImage) getPictureFormat().getPicture().getImage()).m2123c5().m56897x1()) * getPictureFormat().getPicture().getImage().getWidth()), 2);
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public int getShapeType() {
        return super.getShapeType();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        ShapeFrame shapeFrameM2593xk = m2593xk();
        super.mo280jd();
        ShapeFrame shapeFrameM2593xk2 = ((Slide) m2583vj()).m2687bv().m406x1(getPlaceholder().getIndex()).m2593xk();
        setWidth(shapeFrameM2593xk.getWidth());
        setHeight(shapeFrameM2593xk.getHeight());
        setX(shapeFrameM2593xk2.getCenterX() - (getWidth() / 2.0f));
        setY(shapeFrameM2593xk2.getCenterY() - (getHeight() / 2.0f));
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo2261k4(float f) {
        if (m2543ak() || getWidth() <= 0.0f || !getPictureFrameLock().getAspectRatioLocked()) {
            super.mo2261k4(f);
        } else {
            m2591x1(new oju(f, (getHeight() / getWidth()) * f).Clone());
        }
    }

    @Override // com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public itd mo272to() {
        return (itd) super.mo272to();
    }

    @Override // com.aspose.slides.IPictureFrame
    public final void setRelativeScaleHeight(float f) {
        setHeight((72.0f / ((PPImage) getPictureFormat().getPicture().getImage()).m2123c5().m56895kk()) * getPictureFormat().getPicture().getImage().getHeight() * f);
    }

    @Override // com.aspose.slides.IPictureFrame
    public final void setRelativeScaleWidth(float f) {
        setWidth((72.0f / ((PPImage) getPictureFormat().getPicture().getImage()).m2123c5().m56897x1()) * getPictureFormat().getPicture().getImage().getWidth() * f);
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public void setShapeType(int i) {
        if (!f3031m9.containsKey(Integer.valueOf(i))) {
            throw new PptxEditException(C14113y2.m67408k4("Incorrect ShapeType value for PictureFrame specified: ", C14042ak.m66410k4(ShapeType.class, i)));
        }
        super.setShapeType(i);
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: x1 */
    public void mo2264x1(float f) {
        if (m2543ak() || getHeight() <= 0.0f || !getPictureFrameLock().getAspectRatioLocked()) {
            super.mo2264x1(f);
        } else {
            m2591x1(new oju((getWidth() / getHeight()) * f, f).Clone());
        }
    }

    public PictureFrame(InterfaceC14397rj interfaceC14397rj, itd itdVar) {
        super(interfaceC14397rj, itdVar, new PictureFrameLock());
        this.f3032h4 = new PictureFillFormat(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2262k4(IPPImage iPPImage) {
        m2263k4((ISvgImage) null);
        if (iPPImage == null || iPPImage.getSvgImage() == null) {
            ((Presentation) getPresentation()).m2386m9().removeItem(this);
            m2263k4((ISvgImage) null);
        } else {
            if (!((Presentation) getPresentation()).m2386m9().containsItem(this)) {
                if (getPictureFormat().getPicture().getImage() == null) {
                    getPictureFormat().getPicture().setImage(iPPImage);
                }
                ((Presentation) getPresentation()).m2386m9().addItem(this);
            }
            SvgImage svgImage = (SvgImage) iPPImage.getSvgImage();
            m2263k4(((SvgImage) iPPImage.getSvgImage()).m2854k4(this));
            IGenericEnumerator<IPPImage> it = ((ImageCollection) getPresentation().getImages()).iterator();
            boolean z = false;
            while (it.hasNext()) {
                try {
                    IPPImage next = it.next();
                    if (next.getSvgImage() != null && C12563k4.m58597k4(next.getSvgImage().getSvgData(), svgImage.getSvgData()) && !svgImage.m2855k4() && "image/x-emf".equals(next.getContentType())) {
                        z = true;
                        iPPImage = next;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (z) {
                getPictureFormat().getPicture().getImage().replaceImage(iPPImage);
            } else {
                IPPImage iPPImageAddImage = ((ImageCollection) getPresentation().getImages()).addImage(m2260ck());
                iPPImageAddImage.setSvgImage(svgImage);
                List.Enumerator<PictureFrame> it2 = ((Presentation) getPresentation()).m2386m9().iterator();
                while (it2.hasNext()) {
                    try {
                        PictureFrame next2 = it2.next();
                        if (C12563k4.m58597k4(next2.getPictureFormat().getPicture().getImage().getSvgImage().getSvgData(), svgImage.getSvgData())) {
                            next2.getPictureFormat().getPicture().setImage(iPPImageAddImage);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                ((ImageCollection) getPresentation().getImages()).m1732k4(iPPImage);
                iPPImage = iPPImageAddImage;
            }
        }
        if (getPictureFormat().getPicture().getImage() == null) {
            getPictureFormat().getPicture().setImage(iPPImage);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2263k4(ISvgImage iSvgImage) {
        this.f3033k4 = iSvgImage;
    }
}
