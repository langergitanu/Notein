package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.m2 */
/* JADX INFO: loaded from: classes4.dex */
public class C9674m2 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34997k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne f34998kk;

    /* JADX INFO: renamed from: x1 */
    private C12343ne f34999x1;

    public C9674m2(C9723vw c9723vw) {
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
        return m47439k4((C9674m2) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34997k4;
        int iHashCode2 = (iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397;
        C12343ne c12343ne = this.f34999x1;
        int iHashCode3 = (iHashCode2 ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12343ne c12343ne2 = this.f34998kk;
        return iHashCode3 ^ (c12343ne2 != null ? c12343ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47436k4() {
        return this.f34997k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne m47440kk() {
        return this.f34998kk;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Box: {1}, Start: {2}, End: {3}", super.toString(), m47436k4(), m47441x1(), m47440kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12343ne m47441x1() {
        return this.f34999x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47437k4(C12343ne c12343ne) {
        this.f34999x1 = c12343ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47442x1(C12343ne c12343ne) {
        this.f34998kk = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47438k4(C12350uz c12350uz) {
        this.f34997k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47439k4(C9674m2 c9674m2) {
        return m47765k4((C9723vw) c9674m2) && C14067j2.m66728k4(this.f34997k4, c9674m2.f34997k4) && C14067j2.m66728k4(this.f34999x1, c9674m2.f34999x1) && C14067j2.m66728k4(this.f34998kk, c9674m2.f34998kk);
    }
}
