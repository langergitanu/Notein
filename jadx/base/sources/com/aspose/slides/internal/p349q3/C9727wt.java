package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12348um;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.wt */
/* JADX INFO: loaded from: classes4.dex */
public class C9727wt extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C12348um f35157k4;

    public C9727wt(C9723vw c9723vw) {
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
        return m47796k4((C9727wt) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12348um c12348um = this.f35157k4;
        return iHashCode ^ (c12348um != null ? c12348um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12348um m47794k4() {
        return this.f35157k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Extent: {1}", super.toString(), m47794k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47795k4(C12348um c12348um) {
        this.f35157k4 = c12348um;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47796k4(C9727wt c9727wt) {
        return m47765k4((C9723vw) c9727wt) && C14067j2.m66728k4(this.f35157k4, c9727wt.f35157k4);
    }
}
