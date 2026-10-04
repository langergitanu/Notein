package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.wz */
/* JADX INFO: loaded from: classes4.dex */
public class C9729wz extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35160k4;

    /* JADX INFO: renamed from: kk */
    private C12337ix[] f35161kk;

    /* JADX INFO: renamed from: x1 */
    private long f35162x1;

    public C9729wz(C9723vw c9723vw) {
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
        return m47806k4((C9729wz) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35160k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35162x1)) * 397;
        C12337ix[] c12337ixArr = this.f35161kk;
        return iHashCode2 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47802k4() {
        return this.f35160k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12337ix[] m47807kk() {
        return this.f35161kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47808x1() {
        return this.f35162x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47803k4(long j) {
        this.f35162x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47804k4(C12350uz c12350uz) {
        this.f35160k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47805k4(C12337ix[] c12337ixArr) {
        this.f35161kk = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47806k4(C9729wz c9729wz) {
        return m47765k4((C9723vw) c9729wz) && C14067j2.m66728k4(this.f35160k4, c9729wz.f35160k4) && this.f35162x1 == c9729wz.f35162x1 && C12530dy.m58334k4(this.f35161kk, c9729wz.f35161kk);
    }
}
