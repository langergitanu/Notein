package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.um */
/* JADX INFO: loaded from: classes.dex */
public class C4661um extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4612bv f13012k4;

    /* JADX INFO: renamed from: x1 */
    private int f13013x1;

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
        return m19377k4((C4661um) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4612bv c4612bv = this.f13012k4;
        if (c4612bv != null) {
            return c4612bv.mo19017h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        C4612bv c4612bv = this.f13012k4;
        return ((c4612bv != null ? c4612bv.hashCode() : 0) * 397) ^ this.f13013x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4612bv m19374k4() {
        return this.f13012k4;
    }

    public String toString() {
        return C14113y2.m67402k4("CustomEndCap: {0}, CustomEndCapSize: {1}", this.f13012k4, Integer.valueOf(this.f13013x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19378x1() {
        return this.f13013x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19375k4(int i) {
        this.f13013x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19376k4(C4612bv c4612bv) {
        this.f13012k4 = c4612bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19377k4(C4661um c4661um) {
        return C14067j2.m66728k4(this.f13012k4, c4661um.f13012k4) && this.f13013x1 == c4661um.f13013x1;
    }
}
