package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p513xw.AbstractC12741x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.kk */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12708kk extends AbstractC12741x1 {

    /* JADX INFO: renamed from: du */
    private AbstractC12727to f42284du;

    /* JADX INFO: renamed from: dy */
    private AbstractC12741x1.k4 f42285dy;

    /* JADX INFO: renamed from: h4 */
    private C1375h4 f42286h4;

    /* JADX INFO: renamed from: m9 */
    private AbstractC12741x1.k4 f42287m9;

    /* JADX INFO: renamed from: to */
    protected C12720qw f42288to;

    public AbstractC12708kk(AbstractC12727to abstractC12727to, C1375h4 c1375h4) {
        this.f42284du = abstractC12727to;
        this.f42286h4 = c1375h4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: ck */
    public C12724ss mo54956ck() {
        C12724ss c12724ssMo54956ck = super.mo54956ck();
        c12724ssMo54956ck.m59186x1(this.f42286h4.m8163x1());
        return c12724ssMo54956ck;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: du */
    public boolean mo58884du() {
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public final void m59015fa() {
        if (m59364c5()) {
            return;
        }
        this.f42288to.m59116rv();
        C12720qw c12720qw = this.f42288to;
        m59367x1(c12720qw, c12720qw.m59113ks().size(), this.f42287m9, this.f42285dy);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: h4 */
    public boolean mo58886h4() {
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54958k4(C12724ss c12724ss, int i) {
        return null;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC12711lr mo58889kk() {
        return this.f42284du;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: to */
    public InterfaceC12711lr mo58890to() {
        return this.f42284du.f42380m9;
    }

    /* JADX INFO: renamed from: up */
    public int m59016up() {
        return this.f42288to.f42499up;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo58892x1() {
        return !this.f42284du.mo54980wl();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo58887k4(C12720qw c12720qw, int i, AbstractC12741x1.k4 k4Var, AbstractC12741x1.k4 k4Var2) {
        this.f42288to = c12720qw;
        this.f42287m9 = k4Var;
        this.f42285dy = k4Var2;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo58888k4(C12720qw c12720qw, AbstractC12741x1.x1 x1Var) {
    }
}
