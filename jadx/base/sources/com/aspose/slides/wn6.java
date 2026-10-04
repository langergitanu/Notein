package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class wn6 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private boolean f49823k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49824kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14763x3 f49825x1;

    public wn6(AbstractC14763x3 abstractC14763x3, boolean z) {
        this.f49824kk = C7019kk.m27469x1(abstractC14763x3, d6s.class) || C7019kk.m27469x1(abstractC14763x3, tsh.class) || C7019kk.m27469x1(abstractC14763x3, f2h.class) || C7019kk.m27469x1(abstractC14763x3, iuf.class);
        this.f49825x1 = abstractC14763x3;
        this.f49823k4 = z;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (this.f49823k4) {
            if (this.f49824kk) {
                m73217kk(C0841c4.m4453k4(this.f49825x1.m73026k4().m73400kk().m56639dy()));
                m73222to(1.0f);
                return;
            } else {
                m73217kk(1.0f);
                m73222to(C0841c4.m4453k4(this.f49825x1.m73026k4().m73400kk().m56639dy()));
                return;
            }
        }
        if (this.f49824kk) {
            m73217kk(C0841c4.m4486x1(this.f49825x1.m73026k4().m73400kk().m56639dy()));
            m73222to(1.0f);
        } else {
            m73217kk(1.0f);
            m73222to(C0841c4.m4486x1(this.f49825x1.m73026k4().m73400kk().m56639dy()));
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C14787xi c14787xiM73026k4;
        float fM73227xk;
        float fM73206c6;
        float fM73227xk2;
        float fM73206c62;
        if (this.f49824kk) {
            c14787xiM73026k4 = this.f49825x1.m73026k4();
            fM73227xk = m73227xk();
            fM73206c6 = m73206c6();
            fM73227xk2 = m73227xk() + m73225wy();
            fM73206c62 = m73206c6();
        } else {
            c14787xiM73026k4 = this.f49825x1.m73026k4();
            fM73227xk = m73227xk();
            fM73206c6 = m73206c6();
            fM73227xk2 = m73227xk();
            fM73206c62 = m73206c6() + m73203ak();
        }
        c14787xiM73026k4.m73393k4(fM73227xk, fM73206c6, fM73227xk2, fM73206c62);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m72839to() {
        return this.f49823k4;
    }
}
