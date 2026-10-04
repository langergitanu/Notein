package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.n3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9679n3 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f35019k4;

    public C9679n3(C9723vw c9723vw) {
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
        return m47487k4((C9679n3) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35019k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47485k4() {
        return this.f35019k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, TextAlignmentMode: {1}", super.toString(), Long.valueOf(m47485k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47486k4(long j) {
        this.f35019k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47487k4(C9679n3 c9679n3) {
        return m47765k4((C9723vw) c9679n3) && this.f35019k4 == c9679n3.f35019k4;
    }
}
