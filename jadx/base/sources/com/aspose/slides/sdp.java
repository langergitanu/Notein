package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class sdp {

    /* JADX INFO: renamed from: h4 */
    private C11791os f48836h4;

    /* JADX INFO: renamed from: k4 */
    private C11791os f48837k4;

    /* JADX INFO: renamed from: kk */
    private u8s f48838kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0919dx f48841x1;

    /* JADX INFO: renamed from: to */
    private long f48840to = 1;

    /* JADX INFO: renamed from: dy */
    private List<String> f48835dy = new List<>();

    /* JADX INFO: renamed from: du */
    private final Dictionary<IShape, Long> f48834du = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private Dictionary<ISlideComponent, Integer> f48839m9 = new Dictionary<>();

    public sdp(IBaseSlide iBaseSlide, u8s u8sVar, C11791os c11791os) {
        this.f48838kk = u8sVar;
        this.f48837k4 = c11791os;
        this.f48841x1 = ((BaseSlide) iBaseSlide).mo400kk();
    }

    /* JADX INFO: renamed from: du */
    public final Dictionary<IShape, Long> m70576du() {
        return this.f48834du;
    }

    /* JADX INFO: renamed from: dy */
    public final List<String> m70577dy() {
        return this.f48835dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final Dictionary<ISlideComponent, Integer> m70578h4() {
        return this.f48839m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m70579k4(ISlideComponent iSlideComponent) {
        int iM71570x6 = m70580k4().m71570x6();
        this.f48839m9.addItem(iSlideComponent, Integer.valueOf(iM71570x6));
        return iM71570x6;
    }

    /* JADX INFO: renamed from: kk */
    public final C11723d3 m70583kk() {
        return this.f48837k4.m55377up();
    }

    /* JADX INFO: renamed from: m9 */
    public final C11791os m70584m9() {
        return this.f48836h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m70585to() {
        long j = this.f48840to;
        this.f48840to = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m70586x1() {
        return this.f48837k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final u8s m70580k4() {
        return this.f48838kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70581k4(IShape iShape, long j) {
        this.f48834du.addItem(iShape, Long.valueOf(j));
        long j2 = j & 4294967295L;
        if ((this.f48840to & 4294967295L) <= j2) {
            this.f48840to = (j2 + 1) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70582k4(C11791os c11791os) {
        this.f48836h4 = c11791os;
    }
}
