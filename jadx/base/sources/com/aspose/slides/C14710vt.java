package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.vt */
/* JADX INFO: loaded from: classes3.dex */
class C14710vt {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f49703k4;

    public C14710vt(C14365qy c14365qy) {
        this.f49703k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72520k4() throws Throwable {
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f49703k4.m69834fa().getType());
        C14787xi c14787xiM69863u4 = this.f49703k4.m69863u4();
        if (c14787xiM69863u4.m73384dy() != null && c14787xiM69863u4.m73384dy().isVisible()) {
            if (zIsChartTypeBar) {
                new C0967ew(this.f49703k4).m5742x1(c14787xiM69863u4);
            } else {
                new C14162n0(this.f49703k4).m67847k4(c14787xiM69863u4);
            }
        }
        C14787xi c14787xiM69854ne = this.f49703k4.m69854ne();
        if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().isVisible() && !this.f49703k4.m69834fa().hasDataTable()) {
            if (zIsChartTypeBar) {
                new C0967ew(this.f49703k4).m5741k4(c14787xiM69854ne);
            } else {
                new C14162n0(this.f49703k4).m67849x1(c14787xiM69854ne);
            }
        }
        C14787xi c14787xiM69868wl = this.f49703k4.m69868wl();
        if (c14787xiM69868wl.m73384dy() == null || !c14787xiM69868wl.m73384dy().isVisible()) {
            return;
        }
        new C14162n0(this.f49703k4).m67848kk(c14787xiM69868wl);
    }
}
