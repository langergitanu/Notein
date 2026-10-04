package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.bu */
/* JADX INFO: loaded from: classes4.dex */
public class C9623bu extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34786k4;

    public C9623bu(C9723vw c9723vw) {
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
        return m46984k4((C9623bu) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34786k4;
        return iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m46982k4() {
        return this.f34786k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Origin: {1}", super.toString(), m46982k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46983k4(C12343ne c12343ne) {
        this.f34786k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46984k4(C9623bu c9623bu) {
        return m47765k4((C9723vw) c9623bu) && C14067j2.m66728k4(this.f34786k4, c9623bu.f34786k4);
    }
}
