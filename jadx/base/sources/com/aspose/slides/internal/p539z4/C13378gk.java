package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.gk */
/* JADX INFO: loaded from: classes5.dex */
public final class C13378gk extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13430yo f44752k4;

    /* JADX INFO: renamed from: x1 */
    private C13398qm f44753x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13378gk.class) && m62112k4((C13378gk) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13430yo c13430yo = this.f44752k4;
        int iMo62023h4 = c13430yo != null ? c13430yo.mo62023h4() : 0;
        C13398qm c13398qm = this.f44753x1;
        return c13398qm != null ? c13398qm.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        C13430yo c13430yo = this.f44752k4;
        int iHashCode = (c13430yo != null ? c13430yo.hashCode() : 0) * 397;
        C13398qm c13398qm = this.f44753x1;
        return iHashCode ^ (c13398qm != null ? c13398qm.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13430yo m62113k4() {
        return this.f44752k4;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, ImageObject: [{1}]", this.f44752k4, this.f44753x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13398qm m62116x1() {
        return this.f44753x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62114k4(C13398qm c13398qm) {
        this.f44753x1 = c13398qm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62115k4(C13430yo c13430yo) {
        this.f44752k4 = c13430yo;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62112k4(C13378gk c13378gk) {
        return C14067j2.m66728k4(this.f44752k4, c13378gk.f44752k4) && C14067j2.m66728k4(this.f44753x1, c13378gk.f44753x1);
    }
}
