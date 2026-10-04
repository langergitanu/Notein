package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6282rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C9672lr extends AbstractC9629ca {

    /* JADX INFO: renamed from: k4 */
    private long f34989k4;

    /* JADX INFO: renamed from: x1 */
    private C6282rv f34990x1;

    public C9672lr(C9723vw c9723vw) {
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
        return m47425k4((C9672lr) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f34989k4)) * 397;
        C6282rv c6282rv = this.f34990x1;
        return iHashCode ^ (c6282rv != null ? c6282rv.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47422k4() {
        return this.f34989k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhPen: {1}, LogPen: {2}", super.toString(), Long.valueOf(m47422k4()), m47426x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C6282rv m47426x1() {
        return this.f34990x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47423k4(long j) {
        this.f34989k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47424k4(C6282rv c6282rv) {
        this.f34990x1 = c6282rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47425k4(C9672lr c9672lr) {
        return m47765k4((C9723vw) c9672lr) && this.f34989k4 == c9672lr.f34989k4 && C14067j2.m66728k4(this.f34990x1, c9672lr.f34990x1);
    }
}
