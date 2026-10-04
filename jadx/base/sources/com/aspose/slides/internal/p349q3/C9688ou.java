package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ou */
/* JADX INFO: loaded from: classes4.dex */
public class C9688ou extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C12334dy f35052k4;

    public C9688ou(C9723vw c9723vw) {
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
        return m47561k4((C9688ou) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12334dy c12334dy = this.f35052k4;
        return iHashCode ^ (c12334dy != null ? c12334dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12334dy m47559k4() {
        return this.f35052k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Color: {1}", super.toString(), m47559k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47560k4(C12334dy c12334dy) {
        this.f35052k4 = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47561k4(C9688ou c9688ou) {
        return m47765k4((C9723vw) c9688ou) && C14067j2.m66728k4(this.f35052k4, c9688ou.f35052k4);
    }
}
