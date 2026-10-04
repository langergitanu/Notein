package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4680yo;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C6075ri extends AbstractC6043bs {

    /* JADX INFO: renamed from: k4 */
    private C4680yo f17201k4;

    public C6075ri() {
        m24449x1((short) 16426);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24608k4((C6075ri) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return 24;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ (m24609kk() != null ? m24609kk().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24607k4(C4680yo c4680yo) {
        this.f17201k4 = c4680yo;
    }

    /* JADX INFO: renamed from: kk */
    public final C4680yo m24609kk() {
        return this.f17201k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, MatrixData: {1}", super.toString(), m24609kk());
    }

    public C6075ri(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24608k4(C6075ri c6075ri) {
        return m24438k4((C6045bz) c6075ri) && C14067j2.m66728k4(m24609kk(), c6075ri.m24609kk());
    }
}
