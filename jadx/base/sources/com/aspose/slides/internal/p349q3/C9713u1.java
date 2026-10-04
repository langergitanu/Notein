package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.u1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9713u1 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35110k4;

    /* JADX INFO: renamed from: kk */
    private C12343ne[] f35111kk;

    /* JADX INFO: renamed from: x1 */
    private long f35112x1;

    public C9713u1(C9723vw c9723vw) {
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
        return m47692k4((C9713u1) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35110k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35112x1)) * 397;
        C12343ne[] c12343neArr = this.f35111kk;
        return iHashCode2 ^ (c12343neArr != null ? AbstractC14092to.m67208k4((Object) c12343neArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47688k4() {
        return this.f35110k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12343ne[] m47693kk() {
        return this.f35111kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47694x1() {
        return this.f35112x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47689k4(long j) {
        this.f35112x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47690k4(C12350uz c12350uz) {
        this.f35110k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47691k4(C12343ne[] c12343neArr) {
        this.f35111kk = c12343neArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47692k4(C9713u1 c9713u1) {
        return m47765k4((C9723vw) c9713u1) && C14067j2.m66728k4(this.f35110k4, c9713u1.f35110k4) && this.f35112x1 == c9713u1.f35112x1 && C12530dy.m58334k4(this.f35111kk, c9713u1.f35111kk);
    }
}
