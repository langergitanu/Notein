package com.aspose.slides.internal.p155gv;

import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4387x1 extends AbstractC10914up {

    /* JADX INFO: renamed from: k4 */
    private float f11944k4;

    /* JADX INFO: renamed from: kk */
    private float f11945kk;

    public C4387x1(C10898dy c10898dy) {
        super(c10898dy);
        this.f11944k4 = 1.0f;
        this.f11945kk = 1.0f;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: fa */
    public int mo9118fa() {
        return 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m17777k4() {
        return this.f11944k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m17779x1() {
        return this.f11945kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17778k4(float f) {
        this.f11944k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17780x1(float f) {
        this.f11945kk = f;
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/ExtGState");
        if (this.f37962x1.m52454fa()) {
            c10922yj.m52666kk("/CA", "1.0");
            c10922yj.m52666kk("/ca", "1.0");
        } else {
            c10922yj.m52651k4("/CA", this.f11944k4);
            c10922yj.m52651k4("/ca", this.f11945kk);
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }
}
