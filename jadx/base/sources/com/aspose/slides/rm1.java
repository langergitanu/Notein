package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;

/* JADX INFO: loaded from: classes3.dex */
class rm1 extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private AbstractC7414ck f48606k4;

    /* JADX INFO: renamed from: kk */
    private long f48607kk;

    /* JADX INFO: renamed from: x1 */
    private ITextFrameFormat f48608x1;

    public rm1(ITextFrameFormat iTextFrameFormat) {
        this.f48608x1 = iTextFrameFormat;
    }

    /* JADX INFO: renamed from: to */
    private void m70158to() {
        this.f48607kk++;
        if (C7019kk.m27469x1(this.f48608x1, PVIObject.class)) {
            ((PVIObject) this.f48608x1).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7414ck m70159k4() {
        return this.f48606k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m70162kk() {
        return this.f48607kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m70163x1() {
        return this.f48606k4 != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70160k4(AbstractC7414ck abstractC7414ck) {
        this.f48606k4 = abstractC7414ck;
        m70158to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70161k4(rm1 rm1Var) {
        AbstractC7414ck abstractC7414ck = rm1Var.f48606k4;
        if (abstractC7414ck != null) {
            this.f48606k4 = abstractC7414ck.m29645to();
        }
        m70158to();
    }
}
