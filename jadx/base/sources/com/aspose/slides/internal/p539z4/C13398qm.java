package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1488ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.qm */
/* JADX INFO: loaded from: classes5.dex */
public final class C13398qm extends AbstractC13365c6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13421x1 f44838k4;

    /* JADX INFO: renamed from: x1 */
    private long f44839x1;

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13398qm.class) && m62300k4((C13398qm) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44838k4.mo62023h4() + 8;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        AbstractC13421x1 abstractC13421x1 = this.f44838k4;
        return ((iHashCode ^ (abstractC13421x1 != null ? abstractC13421x1.hashCode() : 0)) * 397) ^ ((int) this.f44839x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13421x1 m62301k4() {
        return this.f44838k4;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13365c6
    public String toString() {
        return C14113y2.m67402k4("{0}, ImageData: {1}, Type: {2}", super.toString(), this.f44838k4, C14042ak.m66410k4(C1488ks.class, this.f44839x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62304x1() {
        return this.f44839x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62302k4(long j) {
        this.f44839x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62303k4(AbstractC13421x1 abstractC13421x1) {
        this.f44838k4 = abstractC13421x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62300k4(C13398qm c13398qm) {
        return m62059k4((AbstractC13365c6) c13398qm) && C14067j2.m66728k4(this.f44838k4, c13398qm.f44838k4) && this.f44839x1 == c13398qm.f44839x1;
    }
}
