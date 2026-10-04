package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.tq */
/* JADX INFO: loaded from: classes4.dex */
public class C9710tq extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f35107k4;

    public C9710tq(C9723vw c9723vw) {
        super(c9723vw);
        this.f35107k4 = new C12343ne();
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
        return m47681k4((C9710tq) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f35107k4;
        return iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47680k4() {
        return this.f35107k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47681k4(C9710tq c9710tq) {
        return m47765k4((C9723vw) c9710tq) && C14067j2.m66728k4(this.f35107k4, c9710tq.f35107k4);
    }
}
