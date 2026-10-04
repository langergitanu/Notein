package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6291yj;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9719v4 extends AbstractC9629ca {

    /* JADX INFO: renamed from: k4 */
    private long f35133k4;

    /* JADX INFO: renamed from: x1 */
    private C6291yj f35134x1;

    public C9719v4(C9723vw c9723vw) {
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
        return m47742k4((C9719v4) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35133k4)) * 397;
        C6291yj c6291yj = this.f35134x1;
        return iHashCode ^ (c6291yj != null ? c6291yj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47739k4() {
        return this.f35133k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6291yj m47743x1() {
        return this.f35134x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47740k4(long j) {
        this.f35133k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47741k4(C6291yj c6291yj) {
        this.f35134x1 = c6291yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47742k4(C9719v4 c9719v4) {
        return m47765k4((C9723vw) c9719v4) && this.f35133k4 == c9719v4.f35133k4 && C14067j2.m66728k4(this.f35134x1, c9719v4.f35134x1);
    }
}
