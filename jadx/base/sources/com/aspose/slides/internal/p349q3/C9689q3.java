package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3868jd;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.q3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9689q3 extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private long f35053k4;

    public C9689q3(C9723vw c9723vw) {
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
        return m47564k4((C9689q3) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35053k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47562k4() {
        return this.f35053k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, MapMode: {1}", super.toString(), C14042ak.m66410k4(C3868jd.class, m47562k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47563k4(long j) {
        this.f35053k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47564k4(C9689q3 c9689q3) {
        return m47765k4((C9723vw) c9689q3) && this.f35053k4 == c9689q3.f35053k4;
    }
}
