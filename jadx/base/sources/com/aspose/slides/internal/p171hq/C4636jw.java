package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p396sc.C10200ts;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.jw */
/* JADX INFO: loaded from: classes.dex */
public class C4636jw extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4626gf f12921k4;

    /* JADX INFO: renamed from: x1 */
    private long f12922x1;

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
        return m19171k4((C4636jw) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        AbstractC4626gf abstractC4626gf = this.f12921k4;
        if (abstractC4626gf != null) {
            return abstractC4626gf.mo19017h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        AbstractC4626gf abstractC4626gf = this.f12921k4;
        return ((abstractC4626gf != null ? abstractC4626gf.hashCode() : 0) * 397) ^ ((int) this.f12922x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4626gf m19168k4() {
        return this.f12921k4;
    }

    public String toString() {
        return C14113y2.m67402k4("[Type: {1}, RegionNodeData: {0}]", this.f12921k4, C14042ak.m66410k4(C10200ts.class, this.f12922x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19172x1() {
        return this.f12922x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19169k4(long j) {
        this.f12922x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19170k4(AbstractC4626gf abstractC4626gf) {
        this.f12921k4 = abstractC4626gf;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19171k4(C4636jw c4636jw) {
        return C14067j2.m66728k4(this.f12921k4, c4636jw.f12921k4) && this.f12922x1 == c4636jw.f12922x1;
    }
}
