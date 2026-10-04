package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.jm */
/* JADX INFO: loaded from: classes4.dex */
public class C9663jm extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34959k4;

    public C9663jm(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m47358k4((C9663jm) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34959k4;
        return iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47356k4() {
        return this.f34959k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Origin: {1}", super.toString(), m47356k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47357k4(C12343ne c12343ne) {
        this.f34959k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47358k4(C9663jm c9663jm) {
        return m47765k4((C9723vw) c9663jm) && C14067j2.m66728k4(this.f34959k4, c9663jm.f34959k4);
    }
}
