package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6267ar;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9701s7 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C6267ar f35083k4;

    public C9701s7(C9723vw c9723vw) {
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
        return m47625k4((C9701s7) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6267ar c6267ar = this.f35083k4;
        return iHashCode ^ (c6267ar != null ? c6267ar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6267ar m47623k4() {
        return this.f35083k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47624k4(C6267ar c6267ar) {
        this.f35083k4 = c6267ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47625k4(C9701s7 c9701s7) {
        return m47765k4((C9723vw) c9701s7) && C14067j2.m66728k4(this.f35083k4, c9701s7.f35083k4);
    }
}
