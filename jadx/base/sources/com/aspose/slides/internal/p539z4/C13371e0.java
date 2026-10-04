package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1501up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13371e0 extends AbstractC13388kk {

    /* JADX INFO: renamed from: k4 */
    private C13387k4 f44740k4;

    /* JADX INFO: renamed from: kk */
    private long f44741kk;

    /* JADX INFO: renamed from: x1 */
    private C13387k4 f44742x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13371e0.class) && m62084k4((C13371e0) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 12;
    }

    public int hashCode() {
        C13387k4 c13387k4 = this.f44740k4;
        int iHashCode = (c13387k4 != null ? c13387k4.hashCode() : 0) * 397;
        C13387k4 c13387k42 = this.f44742x1;
        return ((iHashCode ^ (c13387k42 != null ? c13387k42.hashCode() : 0)) * 397) ^ ((int) this.f44741kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13387k4 m62085k4() {
        return this.f44740k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m62088kk() {
        return this.f44741kk;
    }

    public String toString() {
        return C14113y2.m67402k4("BackColor: {0}, ForeColor: {1}, HatchStyle: {2}", this.f44740k4, this.f44742x1, C14042ak.m66410k4(C1501up.class, this.f44741kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C13387k4 m62089x1() {
        return this.f44742x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62086k4(long j) {
        this.f44741kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62090x1(C13387k4 c13387k4) {
        this.f44742x1 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62087k4(C13387k4 c13387k4) {
        this.f44740k4 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62084k4(C13371e0 c13371e0) {
        return C14067j2.m66728k4(this.f44740k4, c13371e0.f44740k4) && C14067j2.m66728k4(this.f44742x1, c13371e0.f44742x1) && this.f44741kk == c13371e0.f44741kk;
    }
}
