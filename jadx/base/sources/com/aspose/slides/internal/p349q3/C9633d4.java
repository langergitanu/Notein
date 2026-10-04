package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.d4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9633d4 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34832k4;

    /* JADX INFO: renamed from: kk */
    private C12337ix[] f34833kk;

    /* JADX INFO: renamed from: x1 */
    private long f34834x1;

    public C9633d4(C9723vw c9723vw) {
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
        return m47082k4((C9633d4) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34832k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34834x1)) * 397;
        C12337ix[] c12337ixArr = this.f34833kk;
        return iHashCode2 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47078k4() {
        return this.f34832k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12337ix[] m47083kk() {
        return this.f34833kk;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C12337ix c12337ix : m47083kk()) {
            c6765kp.m26792k4(c12337ix.toString());
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("{0}, Bounds: {1}, Count: {2}, APoints: {3}", super.toString(), this.f34832k4, Long.valueOf(this.f34834x1), c6765kp.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47084x1() {
        return this.f34834x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47079k4(long j) {
        this.f34834x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47080k4(C12350uz c12350uz) {
        this.f34832k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47081k4(C12337ix[] c12337ixArr) {
        this.f34833kk = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47082k4(C9633d4 c9633d4) {
        return m47765k4((C9723vw) c9633d4) && C14067j2.m66728k4(this.f34832k4, c9633d4.f34832k4) && this.f34834x1 == c9633d4.f34834x1 && C12530dy.m58334k4(this.f34833kk, c9633d4.f34833kk);
    }
}
