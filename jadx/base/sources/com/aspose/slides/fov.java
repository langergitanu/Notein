package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class fov extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private ehe f5074k4;

    public fov(C13847mr c13847mr) {
        ehe eheVar = new ehe(c13847mr);
        this.f5074k4 = eheVar;
        m73215k4(eheVar);
        this.f5074k4.m5542k4(0.0d, 360.0d);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        this.f5074k4.m73210fa(((mxy) c14713vw).m67812h4());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float fM72555k4 = c14713vw.m72555k4() - this.f5074k4.m73225wy();
        float fM72556x1 = c14713vw.m72556x1() - this.f5074k4.m73203ak();
        this.f5074k4.m73208du(fM72555k4 / 2.0f);
        this.f5074k4.m73212h4(fM72556x1 / 2.0f);
        this.f5074k4.m73220ss();
    }
}
