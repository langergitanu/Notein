package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C9669kp extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34984k4;

    public C9669kp(C9723vw c9723vw) {
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
        return m47413k4((C9669kp) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34984k4;
        return iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47411k4() {
        return this.f34984k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}", super.toString(), m47411k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47412k4(C12350uz c12350uz) {
        this.f34984k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47413k4(C9669kp c9669kp) {
        return m47765k4((C9723vw) c9669kp) && C14067j2.m66728k4(this.f34984k4, c9669kp.f34984k4);
    }
}
