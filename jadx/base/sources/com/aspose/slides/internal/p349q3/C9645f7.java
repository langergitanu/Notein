package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3865dy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.f7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9645f7 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f34880k4;

    public C9645f7() {
        m47763ck(98L);
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
        return m47184k4((C9645f7) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34880k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47182k4() {
        return this.f34880k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IcmMode: {1}", super.toString(), C14042ak.m66410k4(C3865dy.class, this.f34880k4));
    }

    public C9645f7(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47183k4(long j) {
        this.f34880k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47184k4(C9645f7 c9645f7) {
        return m47765k4((C9723vw) c9645f7) && this.f34880k4 == c9645f7.f34880k4;
    }
}
