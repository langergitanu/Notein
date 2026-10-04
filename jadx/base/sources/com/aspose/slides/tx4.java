package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class tx4 implements InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f49212du;

    /* JADX INFO: renamed from: h4 */
    private long f49213h4;

    /* JADX INFO: renamed from: to */
    private long f49216to;

    /* JADX INFO: renamed from: k4 */
    private byte f49214k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private LineFormat f49217x1 = new LineFormat(this);

    /* JADX INFO: renamed from: kk */
    private ColorFormat f49215kk = new ColorFormat(this);

    public tx4(InterfaceC14397rj interfaceC14397rj) {
        this.f49212du = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: du */
    private void m71383du() {
        this.f49213h4++;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f49212du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m71384k4() {
        return this.f49214k4;
    }

    /* JADX INFO: renamed from: kk */
    public final IColorFormat m71388kk() {
        return this.f49215kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m71389to() {
        return this.f49216to;
    }

    /* JADX INFO: renamed from: x1 */
    public final ILineFormat m71390x1() {
        return this.f49217x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final skr m71385k4(IBaseSlide iBaseSlide) {
        byte b = this.f49214k4;
        if (b == 1) {
            return this.f49217x1.m1894dy();
        }
        if (b != 2) {
            return null;
        }
        xxf xxfVarM6309to = ((fuq) iBaseSlide.createThemeEffective()).m6309to(iBaseSlide, (int) this.f49216to, this.f49215kk);
        return xxfVarM6309to != null ? xxfVarM6309to.f50226k4 : skr.f48862x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71386k4(byte b) {
        this.f49214k4 = b;
        m71383du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71387k4(long j) {
        this.f49216to = j;
        m71383du();
    }
}
