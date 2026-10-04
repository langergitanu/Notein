package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.gf */
/* JADX INFO: loaded from: classes4.dex */
public class C9650gf extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34907k4;

    /* JADX INFO: renamed from: kk */
    private C12337ix[] f34908kk;

    /* JADX INFO: renamed from: x1 */
    private long f34909x1;

    public C9650gf(C9723vw c9723vw) {
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
        return m47245k4((C9650gf) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34907k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34909x1)) * 397;
        C12337ix[] c12337ixArr = this.f34908kk;
        return iHashCode2 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47241k4() {
        return this.f34907k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12337ix[] m47246kk() {
        return this.f34908kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47247x1() {
        return this.f34909x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47242k4(long j) {
        this.f34909x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47243k4(C12350uz c12350uz) {
        this.f34907k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47244k4(C12337ix[] c12337ixArr) {
        this.f34908kk = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47245k4(C9650gf c9650gf) {
        return m47765k4((C9723vw) c9650gf) && C14067j2.m66728k4(this.f34907k4, c9650gf.f34907k4) && this.f34909x1 == c9650gf.f34909x1 && C12530dy.m58334k4(this.f34908kk, c9650gf.f34908kk);
    }
}
