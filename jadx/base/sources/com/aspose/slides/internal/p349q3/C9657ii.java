package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ii */
/* JADX INFO: loaded from: classes4.dex */
public class C9657ii extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private long f34922du;

    /* JADX INFO: renamed from: h4 */
    private C6288wl[] f34923h4;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34924k4;

    /* JADX INFO: renamed from: kk */
    private float f34925kk;

    /* JADX INFO: renamed from: to */
    private float f34926to;

    /* JADX INFO: renamed from: x1 */
    private long f34927x1;

    public C9657ii(C9723vw c9723vw) {
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
        return m47283k4((C9657ii) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47277h4() {
        return this.f34922du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34924k4;
        int iHashCode2 = (((((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f34927x1)) * 397) ^ C14064he.m66708k4(this.f34925kk)) * 397) ^ C14064he.m66708k4(this.f34926to)) * 397) ^ ((int) this.f34922du)) * 397;
        C6288wl[] c6288wlArr = this.f34923h4;
        return iHashCode2 ^ (c6288wlArr != null ? AbstractC14092to.m67208k4((Object) c6288wlArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47278k4() {
        return this.f34924k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m47284kk() {
        return this.f34925kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6288wl[] m47285m9() {
        return this.f34923h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m47286to() {
        return this.f34926to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47287x1() {
        return this.f34927x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47279k4(float f) {
        this.f34925kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47288x1(float f) {
        this.f34926to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47280k4(long j) {
        this.f34927x1 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47289x1(long j) {
        this.f34922du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47281k4(C12350uz c12350uz) {
        this.f34924k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47282k4(C6288wl[] c6288wlArr) {
        this.f34923h4 = c6288wlArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47283k4(C9657ii c9657ii) {
        return m47765k4((C9723vw) c9657ii) && C14067j2.m66728k4(this.f34924k4, c9657ii.f34924k4) && this.f34927x1 == c9657ii.f34927x1 && C14064he.m66718x1(this.f34925kk, c9657ii.f34925kk) && C14064he.m66718x1(this.f34926to, c9657ii.f34926to) && this.f34922du == c9657ii.f34922du && C12530dy.m58334k4(this.f34923h4, c9657ii.f34923h4);
    }
}
