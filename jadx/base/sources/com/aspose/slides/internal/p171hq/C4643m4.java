package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.m4 */
/* JADX INFO: loaded from: classes.dex */
public class C4643m4 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4675xw f12950k4;

    /* JADX INFO: renamed from: x1 */
    private int f12951x1;

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
        return m19234k4((C4643m4) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12950k4.mo19017h4() + 4;
    }

    public int hashCode() {
        C4675xw c4675xw = this.f12950k4;
        return ((c4675xw != null ? c4675xw.hashCode() : 0) * 397) ^ this.f12951x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4675xw m19231k4() {
        return this.f12950k4;
    }

    public String toString() {
        return C14113y2.m67402k4("RegionNodePathLength: {0}, RegionNodePath: [{1}]", Integer.valueOf(this.f12951x1), this.f12950k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19235x1() {
        return this.f12951x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19232k4(int i) {
        this.f12951x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19233k4(C4675xw c4675xw) {
        this.f12950k4 = c4675xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19234k4(C4643m4 c4643m4) {
        return C14067j2.m66728k4(this.f12950k4, c4643m4.f12950k4) && this.f12951x1 == c4643m4.f12951x1;
    }
}
