package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9640dy extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34871k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne f34872kk;

    /* JADX INFO: renamed from: x1 */
    private C12343ne f34873x1;

    public C9640dy(C9723vw c9723vw) {
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
        return m47163k4((C9640dy) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34871k4;
        int iHashCode2 = (iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397;
        C12343ne c12343ne = this.f34873x1;
        int iHashCode3 = (iHashCode2 ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12343ne c12343ne2 = this.f34872kk;
        return iHashCode3 ^ (c12343ne2 != null ? c12343ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47160k4() {
        return this.f34871k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne m47164kk() {
        return this.f34872kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12343ne m47165x1() {
        return this.f34873x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47161k4(C12343ne c12343ne) {
        this.f34873x1 = c12343ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47166x1(C12343ne c12343ne) {
        this.f34872kk = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47162k4(C12350uz c12350uz) {
        this.f34871k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47163k4(C9640dy c9640dy) {
        return m47765k4((C9723vw) c9640dy) && C14067j2.m66728k4(this.f34871k4, c9640dy.f34871k4) && C14067j2.m66728k4(this.f34873x1, c9640dy.f34873x1) && C14067j2.m66728k4(this.f34872kk, c9640dy.f34872kk);
    }
}
