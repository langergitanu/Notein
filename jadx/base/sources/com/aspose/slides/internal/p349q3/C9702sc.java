package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.sc */
/* JADX INFO: loaded from: classes4.dex */
public class C9702sc extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35084k4;

    public C9702sc(C9723vw c9723vw) {
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
        return m47628k4((C9702sc) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35084k4;
        return iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47626k4() {
        return this.f35084k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47627k4(C12350uz c12350uz) {
        this.f35084k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47628k4(C9702sc c9702sc) {
        return m47765k4((C9723vw) c9702sc) && C14067j2.m66728k4(this.f35084k4, c9702sc.f35084k4);
    }
}
