package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.av */
/* JADX INFO: loaded from: classes4.dex */
public class C9617av extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f34778k4;

    public C9617av(C9723vw c9723vw) {
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
        return m46964k4((C9617av) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34778k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m46962k4() {
        return this.f34778k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46963k4(long j) {
        this.f34778k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46964k4(C9617av c9617av) {
        return m47765k4((C9723vw) c9617av) && this.f34778k4 == c9617av.f34778k4;
    }
}
