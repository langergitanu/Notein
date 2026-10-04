package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.zj */
/* JADX INFO: loaded from: classes.dex */
public final class C4681zj extends C4657to {

    /* JADX INFO: renamed from: k4 */
    private float f13081k4;

    /* JADX INFO: renamed from: x1 */
    private float f13082x1;

    public C4681zj() {
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4681zj.class) && m19534k4((C4681zj) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(this.f13081k4) * 397) ^ C14064he.m66708k4(this.f13082x1);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo19089k4() {
        return new C12025x6(this.f13081k4, this.f13082x1);
    }

    /* JADX INFO: renamed from: kk */
    public final float m19536kk() {
        return this.f13081k4;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Float.valueOf(this.f13081k4), Float.valueOf(this.f13082x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m19537x1() {
        return this.f13082x1;
    }

    public C4681zj(C12025x6 c12025x6) {
        this.f13081k4 = c12025x6.m56897x1();
        this.f13082x1 = c12025x6.m56895kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19535k4(float f) {
        this.f13082x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19538x1(float f) {
        this.f13081k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19534k4(C4681zj c4681zj) {
        return C14064he.m66718x1(this.f13081k4, c4681zj.f13081k4) && C14064he.m66718x1(this.f13082x1, c4681zj.f13082x1);
    }
}
