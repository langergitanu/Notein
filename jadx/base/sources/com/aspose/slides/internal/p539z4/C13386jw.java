package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1498ts;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.jw */
/* JADX INFO: loaded from: classes5.dex */
public class C13386jw extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13376gf f44774k4;

    /* JADX INFO: renamed from: x1 */
    private long f44775x1;

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
        return m62169k4((C13386jw) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        AbstractC13376gf abstractC13376gf = this.f44774k4;
        if (abstractC13376gf != null) {
            return abstractC13376gf.mo62023h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        AbstractC13376gf abstractC13376gf = this.f44774k4;
        return ((abstractC13376gf != null ? abstractC13376gf.hashCode() : 0) * 397) ^ ((int) this.f44775x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13376gf m62166k4() {
        return this.f44774k4;
    }

    public String toString() {
        return C14113y2.m67402k4("[Type: {1}, RegionNodeData: {0}]", this.f44774k4, C14042ak.m66410k4(C1498ts.class, this.f44775x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62170x1() {
        return this.f44775x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62167k4(long j) {
        this.f44775x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62168k4(AbstractC13376gf abstractC13376gf) {
        this.f44774k4 = abstractC13376gf;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62169k4(C13386jw c13386jw) {
        return C14067j2.m66728k4(this.f44774k4, c13386jw.f44774k4) && this.f44775x1 == c13386jw.f44775x1;
    }
}
