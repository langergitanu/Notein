package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class Format extends PVIObject implements IFormat {

    /* JADX INFO: renamed from: du */
    private C0808b8 f2360du;

    /* JADX INFO: renamed from: k4 */
    private FillFormat f2361k4;

    /* JADX INFO: renamed from: kk */
    private EffectFormat f2362kk;

    /* JADX INFO: renamed from: to */
    private ThreeDFormat f2363to;

    /* JADX INFO: renamed from: x1 */
    private LineFormat f2364x1;

    public Format(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C0734a6(this.f2361k4, this.f2364x1, this.f2362kk, this.f2363to, this.f2360du);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2361k4 = new FillFormat(this);
        this.f2364x1 = new LineFormat(this);
        this.f2362kk = new EffectFormat(this);
        this.f2363to = new ThreeDFormat(this);
        this.f2360du = new C0808b8(this);
    }

    @Override // com.aspose.slides.IFormat
    public final IEffectFormat getEffect() {
        m2146wl();
        return this.f2362kk;
    }

    @Override // com.aspose.slides.IFormat
    public final IThreeDFormat getEffect3D() {
        m2146wl();
        return this.f2363to;
    }

    @Override // com.aspose.slides.IFormat
    public final IFillFormat getFill() {
        m2146wl();
        return this.f2361k4;
    }

    @Override // com.aspose.slides.IFormat
    public final ILineFormat getLine() {
        m2146wl();
        return this.f2364x1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1557x1().m3302k4();
        }
        return 1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m1555k4(IFormat iFormat) {
        if (m2138ix() || ((PVIObject) iFormat).m2138ix()) {
            m2145uz();
            m1557x1().m3303k4((Format) iFormat);
        }
    }

    /* JADX INFO: renamed from: to */
    public final C0808b8 m1556to() {
        m2146wl();
        return this.f2360du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C0734a6 m1557x1() {
        return (C0734a6) m2144u4();
    }
}
