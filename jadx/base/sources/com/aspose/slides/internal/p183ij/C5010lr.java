package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1351rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.lr */
/* JADX INFO: loaded from: classes.dex */
public class C5010lr extends AbstractC4967ca {

    /* JADX INFO: renamed from: k4 */
    private long f13742k4;

    /* JADX INFO: renamed from: x1 */
    private C1351rv f13743x1;

    public C5010lr(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21240k4((C5010lr) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13742k4)) * 397;
        C1351rv c1351rv = this.f13743x1;
        return iHashCode ^ (c1351rv != null ? c1351rv.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21237k4() {
        return this.f13742k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhPen: {1}, LogPen: {2}", super.toString(), Long.valueOf(m21237k4()), m21241x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C1351rv m21241x1() {
        return this.f13743x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21238k4(long j) {
        this.f13742k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21239k4(C1351rv c1351rv) {
        this.f13743x1 = c1351rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21240k4(C5010lr c5010lr) {
        return m21559k4((C5061vw) c5010lr) && this.f13742k4 == c5010lr.f13742k4 && C14067j2.m66728k4(this.f13743x1, c5010lr.f13743x1);
    }
}
