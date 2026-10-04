package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.he */
/* JADX INFO: loaded from: classes4.dex */
public class C9654he extends AbstractC9627c5 {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34917k4;

    public C9654he(C9723vw c9723vw) {
        super(c9723vw);
        this.f34917k4 = new C12343ne();
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
        return m47266k4((C9654he) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34917k4;
        return iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47264k4() {
        return this.f34917k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47265k4(C12343ne c12343ne) {
        this.f34917k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47266k4(C9654he c9654he) {
        return m47765k4((C9723vw) c9654he) && C14067j2.m66728k4(this.f34917k4, c9654he.f34917k4);
    }
}
