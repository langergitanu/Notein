package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
public class ZoomObject extends GraphicalObject implements IZoomObject {

    /* JADX INFO: renamed from: du */
    private long f3729du;

    /* JADX INFO: renamed from: h4 */
    private long f3730h4;

    /* JADX INFO: renamed from: k4 */
    private ISlide f3731k4;

    /* JADX INFO: renamed from: kk */
    private int f3732kk;

    /* JADX INFO: renamed from: ks */
    private PictureFillFormat f3733ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f3734m9;

    /* JADX INFO: renamed from: to */
    private C14047bz f3735to;

    /* JADX INFO: renamed from: x1 */
    private boolean f3736x1;

    /* JADX INFO: renamed from: yj */
    private float f3737yj;

    public ZoomObject(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3735to = new C14047bz();
        m3132x1(C14047bz.m66536x1().Clone());
        this.f3736x1 = true;
        this.f3732kk = 1;
        setReturnToParent(false);
        setTransitionDuration(1.0f);
        m3119k4(new PictureFillFormat(this));
        m3125qq().setPictureFillMode(1);
        this.f3300c5 = new LineFormat(this);
        m2560k4(new iak(this));
    }

    /* JADX INFO: renamed from: ar */
    public final ISlide m3120ar() {
        return this.f3731k4;
    }

    @Override // com.aspose.slides.IZoomObject
    public final int getImageType() {
        return this.f3732kk;
    }

    @Override // com.aspose.slides.IZoomObject
    public final boolean getReturnToParent() {
        return this.f3734m9;
    }

    @Override // com.aspose.slides.IZoomObject
    public final boolean getShowBackground() {
        return this.f3736x1;
    }

    public ISlide getTargetSlide() {
        return this.f3731k4;
    }

    @Override // com.aspose.slides.IZoomObject
    public final float getTransitionDuration() {
        return this.f3737yj;
    }

    @Override // com.aspose.slides.IZoomObject
    public final IPPImage getZoomImage() {
        return m3125qq().getPicture().getImage();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3121k4(int i) {
        this.f3732kk = i;
    }

    /* JADX INFO: renamed from: qq */
    public final PictureFillFormat m3125qq() {
        return this.f3733ks;
    }

    /* JADX INFO: renamed from: qw */
    public final int m3126qw() {
        return this.f3732kk;
    }

    /* JADX INFO: renamed from: rv */
    public final long m3127rv() {
        return this.f3729du;
    }

    @Override // com.aspose.slides.IZoomObject
    public final void setImageType(int i) {
        if (this.f3732kk != i) {
            m3123k4(this.f3731k4);
        }
        this.f3732kk = i;
    }

    @Override // com.aspose.slides.IZoomObject
    public final void setReturnToParent(boolean z) {
        this.f3734m9 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // com.aspose.slides.IZoomObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setShowBackground(boolean z) {
        boolean z2;
        if (this.f3736x1 != z) {
            z2 = getImageType() == 1;
        }
        this.f3736x1 = z;
        if (z2) {
            m3123k4(this.f3731k4);
        }
    }

    public void setTargetSlide(ISlide iSlide) {
        boolean z = this.f3731k4 != iSlide;
        this.f3731k4 = iSlide;
        m3130x1(iSlide.getSlideId());
        m3122k4(((Slide) this.f3731k4).m389k4());
        if (z) {
            m3123k4(this.f3731k4);
        }
    }

    @Override // com.aspose.slides.IZoomObject
    public final void setTransitionDuration(float f) {
        this.f3737yj = f;
    }

    @Override // com.aspose.slides.IZoomObject
    public final void setZoomImage(IPPImage iPPImage) {
        if (m3125qq().getPicture().getImage() != null) {
            m3125qq().getPicture().getImage().replaceImage(iPPImage);
        } else {
            m3125qq().getPicture().setImage(iPPImage);
        }
        m3121k4(2);
    }

    /* JADX INFO: renamed from: vh */
    public final boolean m3128vh() {
        return this.f3736x1;
    }

    /* JADX INFO: renamed from: wl */
    public final long m3129wl() {
        return this.f3730h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3130x1(long j) {
        this.f3730h4 = j;
    }

    /* JADX INFO: renamed from: yj */
    public final C14047bz m3133yj() {
        return this.f3735to.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3122k4(long j) {
        this.f3729du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3131x1(ISlide iSlide) {
        this.f3731k4 = iSlide;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3123k4(ISlide iSlide) {
        if (getImageType() == 2) {
            return;
        }
        IPPImage iPPImageM69369k4 = ((Slide) iSlide).m2721x6().m69369k4(this.f3736x1);
        if (m3125qq().getPicture().getImage() == null || m3125qq().getPicture().getImage() == iPPImageM69369k4) {
            m3125qq().getPicture().setImage(iPPImageM69369k4);
        } else {
            m3125qq().getPicture().getImage().replaceImage(iPPImageM69369k4);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3132x1(C14047bz c14047bz) {
        this.f3735to = c14047bz.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m3119k4(PictureFillFormat pictureFillFormat) {
        this.f3733ks = pictureFillFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3124k4(boolean z) {
        this.f3736x1 = z;
    }
}
