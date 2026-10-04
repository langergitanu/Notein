package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12337ix;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.yo */
/* JADX INFO: loaded from: classes4.dex */
public class C9745yo extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35202k4;

    /* JADX INFO: renamed from: kk */
    private C12337ix[] f35203kk;

    /* JADX INFO: renamed from: to */
    private byte[] f35204to;

    /* JADX INFO: renamed from: x1 */
    private long f35205x1;

    public C9745yo(C9723vw c9723vw) {
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
        return m47902k4((C9745yo) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35202k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35205x1)) * 397;
        C12337ix[] c12337ixArr = this.f35203kk;
        int iHashCode3 = (iHashCode2 ^ (c12337ixArr != null ? AbstractC14092to.m67208k4((Object) c12337ixArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f35204to;
        return iHashCode3 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47897k4() {
        return this.f35202k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12337ix[] m47903kk() {
        return this.f35203kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m47904to() {
        return this.f35204to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47905x1() {
        return this.f35205x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47898k4(long j) {
        this.f35205x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47899k4(C12350uz c12350uz) {
        this.f35202k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47900k4(byte[] bArr) {
        this.f35204to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47901k4(C12337ix[] c12337ixArr) {
        this.f35203kk = c12337ixArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47902k4(C9745yo c9745yo) {
        return m47765k4((C9723vw) c9745yo) && C14067j2.m66728k4(this.f35202k4, c9745yo.f35202k4) && this.f35205x1 == c9745yo.f35205x1 && C12530dy.m58334k4(this.f35203kk, c9745yo.f35203kk) && C12530dy.m58330k4(this.f35204to, c9745yo.f35204to);
    }
}
