package com.aspose.slides.internal.p052c0;

import com.aspose.slides.OooO;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.c0.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1935k4 {

    /* JADX INFO: renamed from: du */
    private int f6864du;

    /* JADX INFO: renamed from: h4 */
    private int f6865h4;

    /* JADX INFO: renamed from: kk */
    private int f6867kk;

    /* JADX INFO: renamed from: m9 */
    private long f6868m9;

    /* JADX INFO: renamed from: to */
    private int f6869to;

    /* JADX INFO: renamed from: k4 */
    private C12014ne f6866k4 = C12014ne.f40546k4.Clone();

    /* JADX INFO: renamed from: x1 */
    private C12014ne f6870x1 = C12014ne.f40546k4.Clone();

    /* JADX INFO: renamed from: k4 */
    private int m9971k4(float f, int i, int i2) {
        return OooO.OooO00o((f * i) / (i2 * 100.0f), 14);
    }

    /* JADX INFO: renamed from: kk */
    public final float m9974kk() {
        return (float) (((double) this.f6869to) / (((double) this.f6865h4) / 25.4d));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m9975x1() {
        return (float) (((double) this.f6867kk) / (((double) this.f6864du) / 25.4d));
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m9972k4() {
        return new C12007ix(m9971k4(this.f6870x1.m56669jd(), this.f6867kk, this.f6864du), m9971k4(this.f6870x1.m56664ck(), this.f6869to, this.f6865h4), m9971k4(this.f6870x1.m56663c5(), this.f6867kk, this.f6864du), m9971k4(this.f6870x1.m56683x1(), this.f6869to, this.f6865h4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9973k4(C3134k4 c3134k4) {
        c3134k4.m13384uz();
        long jM13384uz = c3134k4.m13384uz();
        C12014ne.m56654k4(c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6()).CloneTo(this.f6866k4);
        C12014ne.m56654k4(c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6(), c3134k4.m13386x6()).CloneTo(this.f6870x1);
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        this.f6868m9 = c3134k4.m13384uz();
        c3134k4.m13382u4();
        c3134k4.m13382u4();
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        this.f6867kk = c3134k4.m13386x6();
        this.f6869to = c3134k4.m13386x6();
        this.f6864du = c3134k4.m13386x6();
        this.f6865h4 = c3134k4.m13386x6();
        c3134k4.m13371ck().setPosition(jM13384uz & 4294967295L);
    }
}
