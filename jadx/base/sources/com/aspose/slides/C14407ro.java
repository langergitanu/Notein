package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.ro */
/* JADX INFO: loaded from: classes3.dex */
class C14407ro extends eh0 {

    /* JADX INFO: renamed from: k4 */
    private float f48620k4;

    public C14407ro(C0886d8 c0886d8, double d, double d2, double d3, double d4) {
        super(c0886d8, d, d2, d3, d4);
    }

    @Override // com.aspose.slides.eh0
    /* JADX INFO: renamed from: dy */
    public C11896dy mo5526dy() {
        if (this.f48620k4 == 0.0f) {
            return super.mo5526dy();
        }
        C11896dy c11896dy = new C11896dy();
        C12025x6 c12025x6Clone = m73223ts().Clone();
        C12025x6 c12025x6Clone2 = C14873z5.m74319k4(m5527fa(), this.f48620k4, c12025x6Clone.Clone()).Clone();
        C12025x6 c12025x6Clone3 = C14873z5.m74319k4(m5527fa(), m5525ck(), c12025x6Clone.Clone()).Clone();
        c11896dy.m55547k4(c12025x6Clone2.Clone(), c12025x6Clone3.Clone());
        c11896dy.m55543k4(m73209e0().Clone(), (float) m5527fa(), (float) m5535up());
        C14873z5.m74319k4(m5527fa() + m5535up(), m5525ck(), c12025x6Clone.Clone()).CloneTo(c12025x6Clone2);
        C14873z5.m74319k4(m5527fa() + m5535up(), this.f48620k4, c12025x6Clone.Clone()).CloneTo(c12025x6Clone3);
        c11896dy.m55547k4(c12025x6Clone2.Clone(), c12025x6Clone3.Clone());
        float fM56897x1 = c12025x6Clone.m56897x1() - this.f48620k4;
        float fM56895kk = c12025x6Clone.m56895kk();
        float f = this.f48620k4;
        c11896dy.m55543k4(new C12007ix(fM56897x1, fM56895kk - f, f * 2.0f, f * 2.0f).Clone(), (float) (m5527fa() + m5535up()), (float) (-m5535up()));
        return c11896dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12025x6 m70189m9() {
        return m5536x1(OooOO0.OooO00o(m5525ck(), m70190to(), 2.0d, m70190to()));
    }

    /* JADX INFO: renamed from: to */
    public final float m70190to() {
        return this.f48620k4;
    }

    public C14407ro(ehe eheVar, double d, double d2, double d3, double d4) {
        super(eheVar, d, d2, d3, d4);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        C1128g1 c1128g1 = (C1128g1) c14713vw;
        this.f48620k4 = c1128g1.m6403kk();
        m73217kk(c1128g1.m72555k4());
        m73222to(c1128g1.m72556x1());
    }
}
