package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1360yj;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C5057v4 extends AbstractC4967ca {

    /* JADX INFO: renamed from: k4 */
    private long f13886k4;

    /* JADX INFO: renamed from: x1 */
    private C1360yj f13887x1;

    public C5057v4(C5061vw c5061vw) {
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
        return m21536k4((C5057v4) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13886k4)) * 397;
        C1360yj c1360yj = this.f13887x1;
        return iHashCode ^ (c1360yj != null ? c1360yj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21533k4() {
        return this.f13886k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1360yj m21537x1() {
        return this.f13887x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21534k4(long j) {
        this.f13886k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21535k4(C1360yj c1360yj) {
        this.f13887x1 = c1360yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21536k4(C5057v4 c5057v4) {
        return m21559k4((C5061vw) c5057v4) && this.f13886k4 == c5057v4.f13886k4 && C14067j2.m66728k4(this.f13887x1, c5057v4.f13887x1);
    }
}
