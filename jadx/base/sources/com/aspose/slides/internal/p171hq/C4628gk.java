package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.gk */
/* JADX INFO: loaded from: classes.dex */
public final class C4628gk extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4680yo f12899k4;

    /* JADX INFO: renamed from: x1 */
    private C4648qm f12900x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4628gk.class) && m19112k4((C4628gk) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4680yo c4680yo = this.f12899k4;
        int iMo19017h4 = c4680yo != null ? c4680yo.mo19017h4() : 0;
        C4648qm c4648qm = this.f12900x1;
        return c4648qm != null ? c4648qm.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        C4680yo c4680yo = this.f12899k4;
        int iHashCode = (c4680yo != null ? c4680yo.hashCode() : 0) * 397;
        C4648qm c4648qm = this.f12900x1;
        return iHashCode ^ (c4648qm != null ? c4648qm.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4680yo m19113k4() {
        return this.f12899k4;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, ImageObject: [{1}]", this.f12899k4, this.f12900x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4648qm m19116x1() {
        return this.f12900x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19114k4(C4648qm c4648qm) {
        this.f12900x1 = c4648qm;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19115k4(C4680yo c4680yo) {
        this.f12899k4 = c4680yo;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19112k4(C4628gk c4628gk) {
        return C14067j2.m66728k4(this.f12899k4, c4628gk.f12899k4) && C14067j2.m66728k4(this.f12900x1, c4628gk.f12900x1);
    }
}
