package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1344jd;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.wl */
/* JADX INFO: loaded from: classes.dex */
public class C5063wl extends AbstractC4967ca {

    /* JADX INFO: renamed from: k4 */
    private long f13903k4;

    /* JADX INFO: renamed from: x1 */
    private C1344jd f13904x1;

    public C5063wl(C5061vw c5061vw) {
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
        return m21574k4((C5063wl) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13903k4)) * 397;
        C1344jd c1344jd = this.f13904x1;
        return iHashCode ^ (c1344jd != null ? c1344jd.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21571k4() {
        return this.f13903k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhBrush: {1}, LogBrush: {2}", super.toString(), Long.valueOf(this.f13903k4), this.f13904x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C1344jd m21575x1() {
        return this.f13904x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21572k4(long j) {
        this.f13903k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21573k4(C1344jd c1344jd) {
        this.f13904x1 = c1344jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21574k4(C5063wl c5063wl) {
        return m21559k4((C5061vw) c5063wl) && this.f13903k4 == c5063wl.f13903k4 && C14067j2.m66728k4(this.f13904x1, c5063wl.f13904x1);
    }
}
