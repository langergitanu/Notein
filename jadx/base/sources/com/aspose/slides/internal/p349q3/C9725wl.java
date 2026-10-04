package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6275jd;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C9725wl extends AbstractC9629ca {

    /* JADX INFO: renamed from: k4 */
    private long f35150k4;

    /* JADX INFO: renamed from: x1 */
    private C6275jd f35151x1;

    public C9725wl(C9723vw c9723vw) {
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
        return m47781k4((C9725wl) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35150k4)) * 397;
        C6275jd c6275jd = this.f35151x1;
        return iHashCode ^ (c6275jd != null ? c6275jd.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47778k4() {
        return this.f35150k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhBrush: {1}, LogBrush: {2}", super.toString(), Long.valueOf(this.f35150k4), this.f35151x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C6275jd m47782x1() {
        return this.f35151x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47779k4(long j) {
        this.f35150k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47780k4(C6275jd c6275jd) {
        this.f35151x1 = c6275jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47781k4(C9725wl c9725wl) {
        return m47765k4((C9723vw) c9725wl) && this.f35150k4 == c9725wl.f35150k4 && C14067j2.m66728k4(this.f35151x1, c9725wl.f35151x1);
    }
}
