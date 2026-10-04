package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3871ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.lm */
/* JADX INFO: loaded from: classes4.dex */
public class C9671lm extends AbstractC9627c5 {

    /* JADX INFO: renamed from: k4 */
    private long f34988k4;

    public C9671lm(C9723vw c9723vw) {
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
        return m47421k4((C9671lm) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34988k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47419k4() {
        return this.f34988k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, RegionMode: {1}", super.toString(), C14042ak.m66410k4(C3871ks.class, m47419k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47420k4(long j) {
        this.f34988k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47421k4(C9671lm c9671lm) {
        return m47765k4((C9723vw) c9671lm) && this.f34988k4 == c9671lm.f34988k4;
    }
}
