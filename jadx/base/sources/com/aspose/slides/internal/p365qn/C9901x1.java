package com.aspose.slides.internal.p365qn;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p423to.C11074x1;
import com.aspose.slides.internal.p505xn.C12558dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.qn.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9901x1 {

    /* JADX INFO: renamed from: to */
    private String f35761to;

    /* JADX INFO: renamed from: x1 */
    private boolean f35762x1 = true;

    /* JADX INFO: renamed from: k4 */
    private C9895dy f35759k4 = new C9895dy();

    /* JADX INFO: renamed from: kk */
    private C11074x1 f35760kk = m48757c5();

    /* JADX INFO: renamed from: c5 */
    private static C11074x1 m48757c5() {
        C11074x1 c11074x1 = new C11074x1();
        c11074x1.m53515k4(7);
        c11074x1.m53517k4(C12558dy.m58577k4().Clone());
        c11074x1.m53524x1(c11074x1.m53518kk().Clone());
        c11074x1.m53523x1(c11074x1.m53518kk().m56865x1() >= c11074x1.m53518kk().m56862kk() ? 1 : 0);
        return c11074x1;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m48758du() {
        return this.f35759k4.m48732x1();
    }

    /* JADX INFO: renamed from: dy */
    public final C11074x1 m48759dy() {
        return this.f35760kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m48760h4() {
        return this.f35761to;
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public final C9893c5 m48761k4() {
        if (this.f35759k4.m48722du() != null) {
            return this.f35759k4.m48722du().m48734k4();
        }
        throw new InvalidOperationException("PageSetup.AnyPage is not defined.");
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m48762kk() {
        return this.f35762x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C9895dy m48763m9() {
        return this.f35759k4;
    }

    /* JADX INFO: renamed from: to */
    public final C9894du m48764to() {
        return this.f35759k4.m48725k4();
    }

    @Deprecated
    /* JADX INFO: renamed from: x1 */
    public final C9900to m48765x1() {
        if (this.f35759k4.m48722du() != null) {
            return this.f35759k4.m48722du().m48736x1();
        }
        throw new InvalidOperationException("PageSetup.AnyPage is not defined.");
    }
}
