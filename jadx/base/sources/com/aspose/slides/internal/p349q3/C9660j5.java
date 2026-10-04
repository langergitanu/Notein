package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6274ix;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.j5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9660j5 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C6274ix f34953k4;

    public C9660j5(C9723vw c9723vw) {
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
        return m47343k4((C9660j5) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6274ix c6274ix = this.f34953k4;
        return iHashCode ^ (c6274ix != null ? c6274ix.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6274ix m47341k4() {
        return this.f34953k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47342k4(C6274ix c6274ix) {
        this.f34953k4 = c6274ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47343k4(C9660j5 c9660j5) {
        return m47765k4((C9723vw) c9660j5) && C14067j2.m66728k4(this.f34953k4, c9660j5.f34953k4);
    }
}
