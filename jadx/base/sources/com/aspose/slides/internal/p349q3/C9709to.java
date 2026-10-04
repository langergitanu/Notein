package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9709to extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35104k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne f35105kk;

    /* JADX INFO: renamed from: x1 */
    private C12343ne f35106x1;

    public C9709to(C9723vw c9723vw) {
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
        return m47676k4((C9709to) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35104k4;
        int iHashCode2 = (iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397;
        C12343ne c12343ne = this.f35106x1;
        int iHashCode3 = (iHashCode2 ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12343ne c12343ne2 = this.f35105kk;
        return iHashCode3 ^ (c12343ne2 != null ? c12343ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47673k4() {
        return this.f35104k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne m47677kk() {
        return this.f35105kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12343ne m47678x1() {
        return this.f35106x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47674k4(C12343ne c12343ne) {
        this.f35106x1 = c12343ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47679x1(C12343ne c12343ne) {
        this.f35105kk = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47675k4(C12350uz c12350uz) {
        this.f35104k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47676k4(C9709to c9709to) {
        return m47765k4((C9723vw) c9709to) && C14067j2.m66728k4(this.f35104k4, c9709to.f35104k4) && C14067j2.m66728k4(this.f35106x1, c9709to.f35106x1) && C14067j2.m66728k4(this.f35105kk, c9709to.f35105kk);
    }
}
