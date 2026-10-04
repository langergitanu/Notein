package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10190ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.qm */
/* JADX INFO: loaded from: classes.dex */
public final class C4648qm extends AbstractC4615c6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4671x1 f12985k4;

    /* JADX INFO: renamed from: x1 */
    private long f12986x1;

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4648qm.class) && m19307k4((C4648qm) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12985k4.mo19017h4() + 8;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        AbstractC4671x1 abstractC4671x1 = this.f12985k4;
        return ((iHashCode ^ (abstractC4671x1 != null ? abstractC4671x1.hashCode() : 0)) * 397) ^ ((int) this.f12986x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4671x1 m19308k4() {
        return this.f12985k4;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4615c6
    public String toString() {
        return C14113y2.m67402k4("{0}, ImageData: {1}, Type: {2}", super.toString(), this.f12985k4, C14042ak.m66410k4(C10190ks.class, this.f12986x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19311x1() {
        return this.f12986x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19309k4(long j) {
        this.f12986x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19310k4(AbstractC4671x1 abstractC4671x1) {
        this.f12985k4 = abstractC4671x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19307k4(C4648qm c4648qm) {
        return m19055k4((AbstractC4615c6) c4648qm) && C14067j2.m66728k4(this.f12985k4, c4648qm.f12985k4) && this.f12986x1 == c4648qm.f12986x1;
    }
}
