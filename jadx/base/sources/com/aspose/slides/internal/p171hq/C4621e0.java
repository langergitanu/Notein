package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10203up;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4621e0 extends AbstractC4638kk {

    /* JADX INFO: renamed from: k4 */
    private C4637k4 f12887k4;

    /* JADX INFO: renamed from: kk */
    private long f12888kk;

    /* JADX INFO: renamed from: x1 */
    private C4637k4 f12889x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4621e0.class) && m19081k4((C4621e0) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 12;
    }

    public int hashCode() {
        C4637k4 c4637k4 = this.f12887k4;
        int iHashCode = (c4637k4 != null ? c4637k4.hashCode() : 0) * 397;
        C4637k4 c4637k42 = this.f12889x1;
        return ((iHashCode ^ (c4637k42 != null ? c4637k42.hashCode() : 0)) * 397) ^ ((int) this.f12888kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4637k4 m19082k4() {
        return this.f12887k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m19085kk() {
        return this.f12888kk;
    }

    public String toString() {
        return C14113y2.m67402k4("BackColor: {0}, ForeColor: {1}, HatchStyle: {2}", this.f12887k4, this.f12889x1, C14042ak.m66410k4(C10203up.class, this.f12888kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C4637k4 m19086x1() {
        return this.f12889x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19083k4(long j) {
        this.f12888kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19087x1(C4637k4 c4637k4) {
        this.f12889x1 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19084k4(C4637k4 c4637k4) {
        this.f12887k4 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19081k4(C4621e0 c4621e0) {
        return C14067j2.m66728k4(this.f12887k4, c4621e0.f12887k4) && C14067j2.m66728k4(this.f12889x1, c4621e0.f12889x1) && this.f12888kk == c4621e0.f12888kk;
    }
}
