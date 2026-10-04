package com.aspose.slides.internal.p261m0;

import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p148gb.C4251h4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p248lf.AbstractC6030h4;
import com.aspose.slides.internal.p248lf.AbstractC6032kk;
import com.aspose.slides.internal.p248lf.AbstractC6033m9;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6293du extends AbstractC6030h4 {

    /* JADX INFO: renamed from: c5 */
    private C6297k4 f17914c5;

    /* JADX INFO: renamed from: ck */
    private C10951c5 f17915ck;

    /* JADX INFO: renamed from: dy */
    private float f17916dy;

    /* JADX INFO: renamed from: jd */
    private C6300to f17917jd;

    public C6293du(C6300to c6300to, C6297k4 c6297k4, C3783ck c3783ck, C3786fa c3786fa, C3787h4 c3787h4, InterfaceC3793to interfaceC3793to) {
        super(c3783ck, c3786fa, c3787h4, interfaceC3793to);
        this.f17916dy = 0.0f;
        this.f17917jd = c6300to;
        this.f17914c5 = c6297k4;
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6032kk mo24344k4(C6029du c6029du, C6035x1 c6035x1) {
        return new C6294dy(this.f17915ck, this.f17917jd, this.f17105du, c6035x1, c6029du);
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6033m9 mo24345k4(C6029du c6029du, C5659x1 c5659x1) {
        if (c6029du.f17088jd) {
            c6029du.f17083du /= 1.3f;
            c6029du.f17084dy = C14113y2.m67358c5(c6029du.f17084dy);
            c5659x1 = new C5659x1(c6029du.f17083du, c5659x1.m23125x1(), c5659x1.m23120k4());
        }
        return new C6296jd(this.f17915ck, c5659x1, c6029du, this.f17914c5.m25775k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25750k4(float f) {
        this.f17916dy = f;
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public void mo24350k4(C4251h4 c4251h4, C12015qq c12015qq) {
        this.f17917jd.m25795k4(c4251h4, this.f17915ck, c12015qq.Clone(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25751k4(C10951c5 c10951c5) {
        this.f17915ck = c10951c5;
    }
}
