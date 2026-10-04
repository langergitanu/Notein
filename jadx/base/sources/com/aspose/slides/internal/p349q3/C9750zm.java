package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.zm */
/* JADX INFO: loaded from: classes4.dex */
public class C9750zm extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private long f35231du;

    /* JADX INFO: renamed from: h4 */
    private C6288wl[] f35232h4;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35233k4;

    /* JADX INFO: renamed from: kk */
    private float f35234kk;

    /* JADX INFO: renamed from: to */
    private float f35235to;

    /* JADX INFO: renamed from: x1 */
    private long f35236x1;

    public C9750zm(C9723vw c9723vw) {
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
        return m47966k4((C9750zm) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47960h4() {
        return this.f35231du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35233k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35236x1)) * 397) ^ C14064he.m66708k4(this.f35234kk)) * 397) ^ C14064he.m66708k4(this.f35235to)) * 397) ^ ((int) this.f35231du)) * 397;
        C6288wl[] c6288wlArr = this.f35232h4;
        return iHashCode2 ^ (c6288wlArr != null ? AbstractC14092to.m67208k4((Object) c6288wlArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47961k4() {
        return this.f35233k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m47967kk() {
        return this.f35234kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6288wl[] m47968m9() {
        return this.f35232h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m47969to() {
        return this.f35235to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47970x1() {
        return this.f35236x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47962k4(float f) {
        this.f35234kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47971x1(float f) {
        this.f35235to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47963k4(long j) {
        this.f35236x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47972x1(long j) {
        this.f35231du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47964k4(C12350uz c12350uz) {
        this.f35233k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47965k4(C6288wl[] c6288wlArr) {
        this.f35232h4 = c6288wlArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47966k4(C9750zm c9750zm) {
        return m47765k4((C9723vw) c9750zm) && C14067j2.m66728k4(this.f35233k4, c9750zm.f35233k4) && this.f35236x1 == c9750zm.f35236x1 && C14064he.m66718x1(this.f35234kk, c9750zm.f35234kk) && C14064he.m66718x1(this.f35235to, c9750zm.f35235to) && this.f35231du == c9750zm.f35231du && C12530dy.m58334k4(this.f35232h4, c9750zm.f35232h4);
    }
}
