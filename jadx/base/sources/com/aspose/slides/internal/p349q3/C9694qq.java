package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12335fa;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C9694qq extends AbstractC9629ca {

    /* JADX INFO: renamed from: k4 */
    private long f35065k4;

    /* JADX INFO: renamed from: x1 */
    private C12335fa f35066x1;

    public C9694qq(C9723vw c9723vw) {
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
        return m47590k4((C9694qq) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35065k4)) * 397;
        C12335fa c12335fa = this.f35066x1;
        return iHashCode ^ (c12335fa != null ? c12335fa.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47587k4() {
        return this.f35065k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12335fa m47591x1() {
        return this.f35066x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47588k4(long j) {
        this.f35065k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47589k4(C12335fa c12335fa) {
        this.f35066x1 = c12335fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47590k4(C9694qq c9694qq) {
        return m47765k4((C9723vw) c9694qq) && this.f35065k4 == c9694qq.f35065k4 && C14067j2.m66728k4(this.f35066x1, c9694qq.f35066x1);
    }
}
