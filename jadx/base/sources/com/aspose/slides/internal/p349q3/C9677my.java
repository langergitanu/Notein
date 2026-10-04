package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.my */
/* JADX INFO: loaded from: classes4.dex */
public class C9677my extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C12337ix[] f35004du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35005k4;

    /* JADX INFO: renamed from: kk */
    private long f35006kk;

    /* JADX INFO: renamed from: to */
    private long[] f35007to;

    /* JADX INFO: renamed from: x1 */
    private long f35008x1;

    public C9677my(C9723vw c9723vw) {
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
        return m47459k4((C9677my) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12337ix[] m47453h4() {
        return this.f35004du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35005k4;
        int iHashCode2 = (((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35008x1)) * 397) ^ ((int) this.f35006kk)) * 397;
        long[] jArr = this.f35007to;
        int iHashCode3 = (iHashCode2 ^ (jArr != null ? AbstractC14092to.m67208k4(jArr).hashCode() : 0)) * 397;
        C12337ix[] c12337ixArr = this.f35004du;
        return iHashCode3 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47454k4() {
        return this.f35005k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47460kk() {
        return this.f35006kk;
    }

    /* JADX INFO: renamed from: to */
    public final long[] m47461to() {
        return this.f35007to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47462x1() {
        return this.f35008x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47455k4(long j) {
        this.f35008x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47463x1(long j) {
        this.f35006kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47456k4(C12350uz c12350uz) {
        this.f35005k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47457k4(long[] jArr) {
        this.f35007to = jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47458k4(C12337ix[] c12337ixArr) {
        this.f35004du = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47459k4(C9677my c9677my) {
        return m47765k4((C9723vw) c9677my) && C14067j2.m66728k4(this.f35005k4, c9677my.f35005k4) && this.f35008x1 == c9677my.f35008x1 && this.f35006kk == c9677my.f35006kk && C12530dy.m58333k4(this.f35007to, c9677my.f35007to) && C12530dy.m58334k4(this.f35004du, c9677my.f35004du);
    }
}
