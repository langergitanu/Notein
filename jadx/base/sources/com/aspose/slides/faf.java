package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class faf implements InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f5004du;

    /* JADX INFO: renamed from: h4 */
    private long f5005h4;

    /* JADX INFO: renamed from: k4 */
    private byte f5006k4;

    /* JADX INFO: renamed from: to */
    private long f5008to;

    /* JADX INFO: renamed from: x1 */
    private FillFormat f5009x1 = new FillFormat(this);

    /* JADX INFO: renamed from: kk */
    private ColorFormat f5007kk = new ColorFormat(this);

    public faf(InterfaceC14397rj interfaceC14397rj) {
        this.f5006k4 = (byte) 0;
        this.f5004du = interfaceC14397rj;
        this.f5006k4 = (byte) 0;
    }

    /* JADX INFO: renamed from: du */
    private void m6062du() {
        this.f5005h4++;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f5004du;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m6063k4() {
        return this.f5008to;
    }

    /* JADX INFO: renamed from: kk */
    public final IColorFormat m6068kk() {
        return this.f5007kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m6069to() {
        return this.f5006k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final IFillFormat m6070x1() {
        return this.f5009x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final IFillParamSource m6064k4(IBaseSlide iBaseSlide, IThemeEffectiveData iThemeEffectiveData) {
        byte b = this.f5006k4;
        if (b == 1) {
            return this.f5009x1;
        }
        if (b != 2) {
            return null;
        }
        return ((fuq) iThemeEffectiveData).m6308kk(iBaseSlide, (int) this.f5008to, this.f5007kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14176nc m6065k4(IBaseSlide iBaseSlide) {
        byte b = this.f5006k4;
        if (b == 1) {
            return this.f5009x1.m1454dy();
        }
        if (b != 2) {
            return null;
        }
        C0888da c0888daM6308kk = ((fuq) iBaseSlide.createThemeEffective()).m6308kk(iBaseSlide, (int) this.f5008to, this.f5007kk);
        return c0888daM6308kk != null ? c0888daM6308kk.f4563k4 : C14176nc.f47496h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6066k4(byte b) {
        this.f5006k4 = b;
        m6062du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6067k4(long j) {
        this.f5008to = j;
        m6062du();
    }
}
