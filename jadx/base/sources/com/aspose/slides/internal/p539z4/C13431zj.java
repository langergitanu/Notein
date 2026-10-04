package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.zj */
/* JADX INFO: loaded from: classes5.dex */
public final class C13431zj extends C13407to {

    /* JADX INFO: renamed from: k4 */
    private float f44934k4;

    /* JADX INFO: renamed from: x1 */
    private float f44935x1;

    public C13431zj() {
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13431zj.class) && m62510k4((C13431zj) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(this.f44934k4) * 397) ^ C14064he.m66708k4(this.f44935x1);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo62092k4() {
        return new C12025x6(this.f44934k4, this.f44935x1);
    }

    /* JADX INFO: renamed from: kk */
    public final float m62512kk() {
        return this.f44934k4;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Float.valueOf(this.f44934k4), Float.valueOf(this.f44935x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m62513x1() {
        return this.f44935x1;
    }

    public C13431zj(C12025x6 c12025x6) {
        this.f44934k4 = c12025x6.m56897x1();
        this.f44935x1 = c12025x6.m56895kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62511k4(float f) {
        this.f44935x1 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62514x1(float f) {
        this.f44934k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62510k4(C13431zj c13431zj) {
        return C14064he.m66718x1(this.f44934k4, c13431zj.f44934k4) && C14064he.m66718x1(this.f44935x1, c13431zj.f44935x1);
    }
}
