package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.eq */
/* JADX INFO: loaded from: classes3.dex */
class C0960eq extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private wnb f4845k4;

    /* JADX INFO: renamed from: kk */
    private C13774lf f4846kk;

    /* JADX INFO: renamed from: to */
    private ljk f4847to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14763x3 f4848x1;

    public C0960eq(C14328q5 c14328q5, AbstractC14763x3 abstractC14763x3) {
        this.f4848x1 = abstractC14763x3;
        this.f4845k4 = new wnb(c14328q5);
        this.f4846kk = new C13774lf(c14328q5, abstractC14763x3);
        ljk ljkVar = new ljk(c14328q5, this.f4845k4);
        this.f4847to = ljkVar;
        m73215k4(ljkVar);
        m73215k4(this.f4845k4);
        m73215k4(this.f4846kk);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC14763x3 m5614c5() {
        return this.f4848x1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m5615dy() {
        return this.f4845k4.m73225wy();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        C13774lf c13774lf;
        C14713vw c14713vw2;
        this.f4845k4.m73210fa(c14713vw);
        if (m5617to()) {
            c13774lf = this.f4846kk;
            c14713vw2 = new C14713vw(this.f4848x1.m73225wy(), c14713vw.m72556x1());
        } else {
            c13774lf = this.f4846kk;
            c14713vw2 = new C14713vw(c14713vw.m72555k4() - this.f4845k4.m73225wy(), c14713vw.m72556x1());
        }
        c13774lf.m73210fa(c14713vw2);
        this.f4847to.m73210fa(new C14713vw(this.f4846kk.m73225wy(), this.f4845k4.m73203ak()));
        m73217kk(this.f4845k4.m73225wy() + this.f4846kk.m73225wy());
        m73222to(this.f4845k4.m73203ak() + this.f4846kk.m73203ak() + m5616m9());
    }

    /* JADX INFO: renamed from: m9 */
    public final float m5616m9() {
        if (m5617to()) {
            return 0.0f;
        }
        return C7019kk.m27469x1(this.f4848x1, C1195hd.class) ? 6.5f : 8.0f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        this.f4846kk.m73212h4(m5616m9());
        this.f4845k4.m73212h4(this.f4846kk.m73203ak() + m5616m9());
        this.f4846kk.m73208du(m5615dy());
        this.f4847to.m73208du(m5615dy());
        this.f4847to.m73212h4(this.f4846kk.m73203ak() + m5616m9());
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m5617to() {
        return C7019kk.m27469x1(this.f4848x1, C13785ll.class);
    }
}
