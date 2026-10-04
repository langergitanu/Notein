package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.vp */
/* JADX INFO: loaded from: classes3.dex */
class C14697vp {

    /* JADX INFO: renamed from: k4 */
    private C1189h8 f49679k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49680kk;

    /* JADX INFO: renamed from: to */
    private final C14787xi f49681to;

    /* JADX INFO: renamed from: x1 */
    private int f49682x1;

    public C14697vp(C14787xi c14787xi) {
        this.f49681to = c14787xi;
        this.f49679k4 = new C1189h8(null, c14787xi.m73423wy(), this);
        this.f49680kk = c14787xi.m73384dy().m327x1().getTextFrameForOverriding() == null || C14064he.m66715kk(c14787xi.m73384dy().m327x1().getTextFrameForOverriding().getTextFrameFormat().getRotationAngle());
    }

    /* JADX INFO: renamed from: h4 */
    private int m72473h4() {
        return this.f49681to.m73384dy().getDisplayUnit();
    }

    /* JADX INFO: renamed from: m9 */
    private String m72474m9() {
        int iM72473h4 = m72473h4();
        return iM72473h4 != 1 ? iM72473h4 != 2 ? iM72473h4 != 5 ? iM72473h4 != 8 ? iM72473h4 != 9 ? "None" : "Trillions" : "Billions" : "Millions" : "Thousands" : "Hundreds";
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m72475du() {
        Chart chartM69834fa = this.f49681to.m73423wy().m69834fa();
        C12003du c12003du = new C12003du();
        (chartM69834fa.getStyle() + 1 > 40 ? chartM69834fa.m506k4((byte) 1) : chartM69834fa.m506k4((byte) 0)).CloneTo(c12003du);
        chartM69834fa.m507k4(this.f49681to.m73384dy().m327x1().getTextFormat(), c12003du.Clone()).CloneTo(c12003du);
        return c12003du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72476k4(int i) {
        this.f49682x1 = i;
        this.f49680kk = false;
    }

    /* JADX INFO: renamed from: kk */
    public final String m72478kk() {
        if (this.f49681to.m73384dy().m327x1().getTextFrameForOverriding() != null && !C14113y2.m67411k4(this.f49681to.m73384dy().m327x1().getTextFrameForOverriding().getText())) {
            return this.f49681to.m73384dy().m327x1().getTextFrameForOverriding().getText();
        }
        return m72474m9();
    }

    /* JADX INFO: renamed from: to */
    public final C12013m9 m72479to() {
        return this.f49681to.m73423wy().m69834fa().m509k4(this.f49681to.m73384dy().m327x1().getTextFormat());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m72480x1() {
        return this.f49682x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m72477k4() {
        return this.f49680kk;
    }
}
