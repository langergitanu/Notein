package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class Background extends PVIObject implements IBackground, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private C0816bg f1039du;

    /* JADX INFO: renamed from: h4 */
    private C14326q3 f1040h4;

    /* JADX INFO: renamed from: k4 */
    private BaseSlide f1041k4;

    /* JADX INFO: renamed from: kk */
    private EffectFormat f1042kk;

    /* JADX INFO: renamed from: m9 */
    private C14329q6 f1043m9;

    /* JADX INFO: renamed from: to */
    private ColorFormat f1044to;

    /* JADX INFO: renamed from: x1 */
    private FillFormat f1045x1;

    public Background(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f1039du = new C0816bg();
        this.f1040h4 = new C14326q3();
        this.f1041k4 = (BaseSlide) interfaceC14397rj;
        m335du().m69393k4(new CustomData(this));
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C0918dw(getParent_Immediate(), this.f1045x1, this.f1042kk, this.f1044to, this.f1040h4, this.f1039du);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f1045x1 = new FillFormat(this);
        this.f1042kk = new EffectFormat(this);
        this.f1044to = new ColorFormat(this);
    }

    /* JADX INFO: renamed from: du */
    public final C14326q3 m335du() {
        m2146wl();
        return this.f1040h4;
    }

    @Override // com.aspose.slides.IBackground
    public final IEffectFormat getEffectFormat() {
        m2146wl();
        return this.f1042kk;
    }

    @Override // com.aspose.slides.IBackground
    public final IBackgroundEffectiveData getEffective() {
        return m337m9();
    }

    @Override // com.aspose.slides.IBackground
    public final IFillFormat getFillFormat() {
        m2146wl();
        return this.f1045x1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1041k4;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.ISlideComponent
    public final BaseSlide getSlide() {
        return m336h4();
    }

    @Override // com.aspose.slides.IBackground
    public final IColorFormat getStyleColor() {
        m2146wl();
        return this.f1044to;
    }

    @Override // com.aspose.slides.IBackground
    public final int getStyleIndex() {
        if (m2138ix()) {
            return m339x1().m5289du();
        }
        return 0;
    }

    @Override // com.aspose.slides.IBackground
    public final byte getType() {
        if (m2138ix()) {
            return m339x1().m5292k4();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m339x1().m5290dy();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final BaseSlide m336h4() {
        return this.f1041k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C14329q6 m337m9() {
        if (this.f1043m9 == null) {
            this.f1043m9 = new C14329q6(this);
        }
        this.f1043m9.m4604k4(C14329q6.class);
        return this.f1043m9;
    }

    @Override // com.aspose.slides.IBackground
    public final void setStyleIndex(int i) {
        m2141k4((Integer) 0, Integer.valueOf(i));
        if (m2138ix()) {
            m339x1().m5294k4(i);
        }
    }

    @Override // com.aspose.slides.IBackground
    public final void setType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m339x1().m5293k4(b);
        }
    }

    /* JADX INFO: renamed from: to */
    public final C0816bg m338to() {
        m2146wl();
        return this.f1039du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C0918dw m339x1() {
        return (C0918dw) m2144u4();
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.IPresentationComponent
    public final Presentation getPresentation() {
        BaseSlide baseSlide = this.f1041k4;
        if (baseSlide != null) {
            return (Presentation) baseSlide.getPresentation();
        }
        return null;
    }
}
