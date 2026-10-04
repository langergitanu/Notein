package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class vkw {

    /* JADX INFO: renamed from: k4 */
    private Presentation f49593k4;

    /* JADX INFO: renamed from: x1 */
    private C1209hm f49594x1;

    public vkw(C1209hm c1209hm) {
        this.f49594x1 = c1209hm;
        this.f49593k4 = new Presentation(this.f49594x1.m7223k4(), this.f49594x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final IMasterSlideCollection m72346k4() {
        return this.f49593k4.getMasters();
    }

    /* JADX INFO: renamed from: x1 */
    public final Presentation m72347x1() {
        return this.f49593k4;
    }

    public vkw(String str, LoadOptions loadOptions, C1209hm c1209hm) {
        this.f49594x1 = c1209hm;
        this.f49593k4 = new Presentation(str, loadOptions, this.f49594x1);
    }
}
