package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C9619b3 extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private long f34784k4;

    public C9619b3(C9723vw c9723vw) {
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
        return m46978k4((C9619b3) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34784k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m46976k4() {
        return this.f34784k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, ObjectHandle: {1}", super.toString(), Long.valueOf(m46976k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46977k4(long j) {
        this.f34784k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46978k4(C9619b3 c9619b3) {
        return m47765k4((C9723vw) c9619b3) && this.f34784k4 == c9619b3.f34784k4;
    }
}
