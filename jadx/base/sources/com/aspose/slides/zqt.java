package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class zqt extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private final C13847mr f50706k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14557tg f50707kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14557tg f50709x1;

    /* JADX INFO: renamed from: to */
    private g2y f50708to = new g2y();

    /* JADX INFO: renamed from: du */
    private g2y f50705du = new g2y();

    public zqt(AbstractC14557tg abstractC14557tg, AbstractC14557tg abstractC14557tg2) {
        this.f50706k4 = abstractC14557tg.m6926yj().m5012up();
        this.f50709x1 = abstractC14557tg;
        this.f50707kk = abstractC14557tg2;
        m73215k4(this.f50708to);
        m73215k4(this.f50705du);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        this.f50708to.m73210fa(c14713vw);
        this.f50705du.m73210fa(c14713vw);
    }

    /* JADX INFO: renamed from: to */
    public final void m74769to() {
        C12025x6 c12025x6Clone = this.f50709x1.mo7138to().Clone();
        C12025x6 c12025x6Clone2 = this.f50707kk.mo7137kk().Clone();
        this.f50708to.m73208du(c12025x6Clone.m56897x1());
        this.f50708to.m73212h4(c12025x6Clone.m56895kk());
        this.f50705du.m73208du(c12025x6Clone2.m56897x1());
        this.f50705du.m73212h4(c12025x6Clone2.m56895kk());
        this.f50708to.m73220ss();
        this.f50705du.m73220ss();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        this.f50706k4.m64968x1(this.f50708to.m73223ts().Clone(), this.f50705du.m73223ts().Clone());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
