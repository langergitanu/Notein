package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.up */
/* JADX INFO: loaded from: classes.dex */
public final class C4662up extends C4624fa {

    /* JADX INFO: renamed from: k4 */
    private C4675xw f13014k4;

    /* JADX INFO: renamed from: x1 */
    private int f13015x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4662up.class) && m19379k4((C4662up) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4624fa, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f13014k4.mo19017h4() + 4;
    }

    public int hashCode() {
        C4675xw c4675xw = this.f13014k4;
        return ((c4675xw != null ? c4675xw.hashCode() : 0) * 397) ^ this.f13015x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4675xw m19380k4() {
        return this.f13014k4;
    }

    public String toString() {
        return C14113y2.m67402k4("BoundaryPathData: {0}, BoundaryPathSize: {1}", this.f13014k4, Integer.valueOf(this.f13015x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19383x1() {
        return this.f13015x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19381k4(int i) {
        this.f13015x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19382k4(C4675xw c4675xw) {
        this.f13014k4 = c4675xw;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19379k4(C4662up c4662up) {
        return C14067j2.m66728k4(this.f13014k4, c4662up.f13014k4) && this.f13015x1 == c4662up.f13015x1;
    }
}
