package com.aspose.slides.internal.p370qv;

import OooOO0.OooO0OO;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.qv.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9944k4 extends AbstractC9947x1 {

    /* JADX INFO: renamed from: k4 */
    public C9945kk f35827k4;

    /* JADX INFO: renamed from: kk */
    private C12025x6 f35828kk;

    /* JADX INFO: renamed from: to */
    private C12025x6 f35829to;

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f35830x1;

    public C9944k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12003du c12003du, C12003du c12003du2, C12025x6 c12025x64) {
        C12025x6 c12025x6M48882k4 = m48882k4(c12025x6, c12025x62, c12025x64);
        C12025x6 c12025x6M48882k42 = m48882k4(c12025x6, c12025x63, c12025x64);
        this.f35830x1 = c12025x6.Clone();
        this.f35828kk = c12025x6M48882k4.Clone();
        this.f35829to = c12025x6M48882k42.Clone();
        this.f35827k4 = new C9945kk(c12025x6M48882k4, c12025x6M48882k42, c12025x62, c12025x63, c12003du, c12003du2);
    }

    /* JADX INFO: renamed from: k4 */
    private float m48881k4(float f, float f2, float f3) {
        float fMax = Math.max(0.0f, Math.min(f3, 1.0f));
        return f > f2 ? f - ((f - f2) * fMax) : OooO0OO.OooO0O0(f2, f, fMax, f);
    }

    /* JADX INFO: renamed from: kk */
    public boolean m48884kk(double d, double d2) {
        return AbstractC9947x1.m48891k4(this.f35830x1, this.f35828kk, this.f35829to, d, d2);
    }

    @Override // com.aspose.slides.internal.p370qv.AbstractC9947x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo48885x1(double d, double d2) {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m48882k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        C12025x6 c12025x64 = new C12025x6();
        c12025x64.m56891k4(m48881k4(c12025x6.m56897x1(), c12025x62.m56897x1(), c12025x63.m56897x1()));
        c12025x64.m56898x1(m48881k4(c12025x6.m56895kk(), c12025x62.m56895kk(), c12025x63.m56895kk()));
        return c12025x64;
    }

    @Override // com.aspose.slides.internal.p370qv.AbstractC9947x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo48883k4(double d, double d2) {
        return m48884kk(d, d2) || this.f35827k4.m48888k4(d, d2);
    }
}
