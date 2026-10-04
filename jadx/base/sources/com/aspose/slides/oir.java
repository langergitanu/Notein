package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class oir extends xhm {

    /* JADX INFO: renamed from: kk */
    private String f47813kk;

    /* JADX INFO: renamed from: x1 */
    protected zsm f47814x1;

    public oir(zsm zsmVar, String str) {
        this.f47814x1 = zsmVar;
        this.f47813kk = str;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: du */
    public C12003du mo4317du() {
        return this.f47814x1.m74792m9().m74309x1();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return this.f47814x1.m74792m9().m74303h4();
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: k4 */
    public void mo4319k4(AutoShape autoShape) {
        if (this.f47814x1.m74792m9().m74307kk().getTextFrameForOverriding() == null || C14113y2.m67411k4(this.f47814x1.m74792m9().m74307kk().getTextFrameForOverriding().getText())) {
            return;
        }
        autoShape.m288x1().m2930x1(this.f47814x1.m74792m9().m74307kk().getTextFrameForOverriding());
    }

    /* JADX INFO: renamed from: m9 */
    public final String m68580m9() {
        return this.f47813kk;
    }

    @Override // com.aspose.slides.xhm
    /* JADX INFO: renamed from: to */
    public C12013m9 mo4321to() {
        return this.f47814x1.m74792m9().m74302du();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73214k4(m73363k4(m68580m9(), c14713vw.m72555k4(), c14713vw.m72556x1()).Clone());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }
}
