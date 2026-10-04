package com.aspose.slides.internal.p151gj;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4324m9 extends AbstractC4326to {

    /* JADX INFO: renamed from: du */
    private C12007ix f11805du;

    /* JADX INFO: renamed from: dy */
    private C12025x6 f11806dy;

    /* JADX INFO: renamed from: h4 */
    private C5656k4 f11807h4;

    /* JADX INFO: renamed from: k4 */
    private double f11808k4;

    /* JADX INFO: renamed from: kk */
    private boolean f11809kk;

    /* JADX INFO: renamed from: m9 */
    private C12025x6 f11810m9;

    /* JADX INFO: renamed from: to */
    private boolean f11811to;

    /* JADX INFO: renamed from: x1 */
    private C5656k4 f11812x1;

    /* JADX WARN: Illegal instructions before constructor call */
    public C4324m9(C12007ix c12007ix, double d, boolean z) {
        C12007ix c12007ixClone = c12007ix.Clone();
        C5656k4 c5656k4 = C5656k4.f15629ze;
        this(c12007ixClone, c5656k4, c5656k4);
        this.f11808k4 = d;
        this.f11809kk = z;
    }

    /* JADX INFO: renamed from: c5 */
    public final double m17389c5() {
        return this.f11808k4;
    }

    /* JADX INFO: renamed from: ck */
    public final C12025x6 m17390ck() {
        return this.f11806dy;
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix m17391du() {
        return this.f11805du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m17392dy() {
        return this.f11809kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C5656k4 m17393h4() {
        return this.f11807h4;
    }

    /* JADX INFO: renamed from: jd */
    public final C12025x6 m17394jd() {
        return this.f11810m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17395k4(double d) {
        this.f11808k4 = d;
    }

    /* JADX INFO: renamed from: m9 */
    public final C5656k4 m17399m9() {
        return this.f11812x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17400x1(C5656k4 c5656k4) {
        if (c5656k4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f11812x1 = c5656k4;
    }

    public C4324m9(C12007ix c12007ix, C5656k4 c5656k4, C5656k4 c5656k42) {
        super(3);
        this.f11805du = C12007ix.f40519k4.Clone();
        this.f11810m9 = C12025x6.f40591k4.Clone();
        this.f11806dy = C12025x6.f40591k4.Clone();
        m17397k4(c12007ix.Clone());
        m17396k4(c5656k4);
        m17400x1(c5656k42);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17396k4(C5656k4 c5656k4) {
        if (c5656k4 == null) {
            throw new ArgumentNullException("value");
        }
        this.f11807h4 = c5656k4;
    }

    public C4324m9(C12025x6 c12025x6, C12025x6 c12025x62, C5656k4 c5656k4, C5656k4 c5656k42) {
        super(3);
        this.f11805du = C12007ix.f40519k4.Clone();
        this.f11810m9 = C12025x6.f40591k4.Clone();
        this.f11806dy = C12025x6.f40591k4.Clone();
        m17396k4(c5656k4);
        m17400x1(c5656k42);
        c12025x6.CloneTo(this.f11810m9);
        c12025x62.CloneTo(this.f11806dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17397k4(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f11805du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17398k4(boolean z) {
        this.f11811to = z;
    }
}
