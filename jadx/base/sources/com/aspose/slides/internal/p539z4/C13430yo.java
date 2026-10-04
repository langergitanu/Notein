package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.yo */
/* JADX INFO: loaded from: classes5.dex */
public final class C13430yo extends AbstractC13376gf {

    /* JADX INFO: renamed from: du */
    private float f44928du;

    /* JADX INFO: renamed from: h4 */
    private float f44929h4;

    /* JADX INFO: renamed from: k4 */
    private float f44930k4;

    /* JADX INFO: renamed from: kk */
    private float f44931kk;

    /* JADX INFO: renamed from: to */
    private float f44932to;

    /* JADX INFO: renamed from: x1 */
    private float f44933x1;

    /* JADX INFO: renamed from: du */
    public final void m62503du(float f) {
        this.f44928du = f;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13430yo.class) && m62502k4((C13430yo) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 24;
    }

    public int hashCode() {
        return (((((((((C14064he.m66708k4(this.f44930k4) * 397) ^ C14064he.m66708k4(this.f44933x1)) * 397) ^ C14064he.m66708k4(this.f44931kk)) * 397) ^ C14064he.m66708k4(this.f44932to)) * 397) ^ C14064he.m66708k4(this.f44928du)) * 397) ^ C14064he.m66708k4(this.f44929h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m62505k4() {
        return new C11913yj(this.f44930k4, this.f44933x1, this.f44931kk, this.f44932to, this.f44928du, this.f44929h4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m62507kk(float f) {
        this.f44931kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m62508to(float f) {
        this.f44932to = f;
    }

    public String toString() {
        return C14113y2.m67402k4(C14113y2.m67408k4("\r\n[{0}, {1}, {4}]", "\r\n[{2}, {3}, {5}]"), Float.valueOf(this.f44930k4), Float.valueOf(this.f44933x1), Float.valueOf(this.f44931kk), Float.valueOf(this.f44932to), Float.valueOf(this.f44928du), Float.valueOf(this.f44929h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62509x1(float f) {
        this.f44933x1 = f;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m62504h4(float f) {
        this.f44929h4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62506k4(float f) {
        this.f44930k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62502k4(C13430yo c13430yo) {
        return C14064he.m66718x1(this.f44930k4, c13430yo.f44930k4) && C14064he.m66718x1(this.f44933x1, c13430yo.f44933x1) && C14064he.m66718x1(this.f44931kk, c13430yo.f44931kk) && C14064he.m66718x1(this.f44932to, c13430yo.f44932to) && C14064he.m66718x1(this.f44928du, c13430yo.f44928du) && C14064he.m66718x1(this.f44929h4, c13430yo.f44929h4);
    }
}
