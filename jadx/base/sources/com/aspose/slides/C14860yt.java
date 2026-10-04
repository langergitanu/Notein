package com.aspose.slides;

import com.aspose.slides.internal.p269m8.C6328k4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.yt */
/* JADX INFO: loaded from: classes3.dex */
class C14860yt extends AbstractC14875z7 implements fsr, IDisposable {

    /* JADX INFO: renamed from: du */
    private C12014ne f50404du;

    /* JADX INFO: renamed from: kk */
    private C12003du f50405kk;

    /* JADX INFO: renamed from: to */
    private C12003du f50406to;

    /* JADX INFO: renamed from: x1 */
    private final C11999ar f50407x1;

    public C14860yt(C12023wl c12023wl) {
        super(c12023wl.Clone());
        this.f50405kk = new C12003du();
        this.f50406to = new C12003du();
        this.f50404du = new C12014ne();
        this.f50404du = new C12014ne(C12016rv.f40556k4.Clone(), this.f50495k4.Clone());
        m74080k4(C12003du.m56460uz().Clone());
        m74083x1(C12003du.m56400k4(0, C12003du.m56460uz().Clone()).Clone());
        this.f50407x1 = new C11999ar(m74082x1().Clone());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f50407x1.dispose();
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
        if (m74340k4() != null) {
            abstractC12008jd.mo17589x1(m74340k4(), 0, 0);
        }
        this.f50407x1.m56306k4(C6328k4.m25897k4(m74082x1().Clone(), m74081kk().Clone(), f).Clone());
        abstractC12008jd.mo17594x1(this.f50407x1, this.f50404du.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du m74081kk() {
        return this.f50406to.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m74082x1() {
        return this.f50405kk.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74080k4(C12003du c12003du) {
        this.f50405kk = c12003du.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74083x1(C12003du c12003du) {
        this.f50406to = c12003du.Clone();
    }
}
