package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C4610b3 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4612bv f12865k4;

    /* JADX INFO: renamed from: x1 */
    private long f12866x1;

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
        return m19030k4((C4610b3) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12865k4.mo19017h4() + 4;
    }

    public int hashCode() {
        C4612bv c4612bv = this.f12865k4;
        return ((c4612bv != null ? c4612bv.hashCode() : 0) * 397) ^ ((int) this.f12866x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4612bv m19027k4() {
        return this.f12865k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19031x1() {
        return this.f12866x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19028k4(long j) {
        this.f12866x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19029k4(C4612bv c4612bv) {
        this.f12865k4 = c4612bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19030k4(C4610b3 c4610b3) {
        return C14067j2.m66728k4(this.f12865k4, c4610b3.f12865k4) && this.f12866x1 == c4610b3.f12866x1;
    }
}
