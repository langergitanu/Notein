package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.b1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9618b1 extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C12343ne[] f34779du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34780k4;

    /* JADX INFO: renamed from: kk */
    private long f34781kk;

    /* JADX INFO: renamed from: to */
    private long[] f34782to;

    /* JADX INFO: renamed from: x1 */
    private long f34783x1;

    public C9618b1(C9723vw c9723vw) {
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
        return m46971k4((C9618b1) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12343ne[] m46965h4() {
        return this.f34779du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34780k4;
        int iHashCode2 = (((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34783x1)) * 397) ^ ((int) this.f34781kk)) * 397;
        long[] jArr = this.f34782to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12343ne[] c12343neArr = this.f34779du;
        return iHashCode3 ^ (c12343neArr != null ? AbstractC14092to.m67208k4((Object) c12343neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m46966k4() {
        return this.f34780k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m46972kk() {
        return this.f34781kk;
    }

    /* JADX INFO: renamed from: to */
    public final long[] m46973to() {
        return this.f34782to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m46974x1() {
        return this.f34783x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46967k4(long j) {
        this.f34783x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46975x1(long j) {
        this.f34781kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46968k4(C12350uz c12350uz) {
        this.f34780k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46969k4(long[] jArr) {
        this.f34782to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46970k4(C12343ne[] c12343neArr) {
        this.f34779du = c12343neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46971k4(C9618b1 c9618b1) {
        return m47765k4((C9723vw) c9618b1) && C14067j2.m66728k4(this.f34780k4, c9618b1.f34780k4) && this.f34783x1 == c9618b1.f34783x1 && this.f34781kk == c9618b1.f34781kk && C12530dy.m58333k4(this.f34782to, c9618b1.f34782to) && C12530dy.m58334k4(this.f34779du, c9618b1.f34779du);
    }
}
