package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p396sc.C10189kp;
import com.aspose.slides.internal.p396sc.C10209x1;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.vj */
/* JADX INFO: loaded from: classes.dex */
public class C4666vj extends AbstractC4638kk {

    /* JADX INFO: renamed from: du */
    private long f13031du;

    /* JADX INFO: renamed from: dy */
    private C4665vh f13032dy;

    /* JADX INFO: renamed from: h4 */
    private C4637k4[] f13033h4;

    /* JADX INFO: renamed from: k4 */
    private long f13034k4;

    /* JADX INFO: renamed from: kk */
    private C4637k4 f13035kk;

    /* JADX INFO: renamed from: m9 */
    private C4624fa f13036m9;

    /* JADX INFO: renamed from: to */
    private C4681zj f13037to;

    /* JADX INFO: renamed from: x1 */
    private long f13038x1;

    /* JADX INFO: renamed from: c5 */
    public final C4665vh m19416c5() {
        return this.f13032dy;
    }

    /* JADX INFO: renamed from: du */
    public final long m19417du() {
        return this.f13031du;
    }

    /* JADX INFO: renamed from: dy */
    public final C4624fa m19418dy() {
        return this.f13036m9;
    }

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
        return m19426k4((C4666vj) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        int iMo19017h4 = (int) ((((this.f13031du & 4294967295L) * 4) & 4294967295L) + 24);
        C4624fa c4624fa = this.f13036m9;
        if (c4624fa != null) {
            iMo19017h4 += c4624fa.mo19017h4();
        }
        C4665vh c4665vh = this.f13032dy;
        return c4665vh != null ? c4665vh.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        int i = ((((int) this.f13034k4) * 397) ^ ((int) this.f13038x1)) * 397;
        C4637k4 c4637k4 = this.f13035kk;
        int iHashCode = (i ^ (c4637k4 != null ? c4637k4.hashCode() : 0)) * 397;
        C4681zj c4681zj = this.f13037to;
        int iHashCode2 = (((iHashCode ^ (c4681zj != null ? c4681zj.hashCode() : 0)) * 397) ^ ((int) this.f13031du)) * 397;
        C4637k4[] c4637k4Arr = this.f13033h4;
        int iHashCode3 = (iHashCode2 ^ (c4637k4Arr != null ? AbstractC14092to.m67208k4((Object) c4637k4Arr).hashCode() : 0)) * 397;
        C4624fa c4624fa = this.f13036m9;
        int iHashCode4 = (iHashCode3 ^ (c4624fa != null ? c4624fa.hashCode() : 0)) * 397;
        C4665vh c4665vh = this.f13032dy;
        return iHashCode4 ^ (c4665vh != null ? c4665vh.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19419k4() {
        return this.f13034k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4637k4 m19427kk() {
        return this.f13035kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C4637k4[] m19429m9() {
        return this.f13031du == 0 ? new C4637k4[0] : this.f13033h4;
    }

    /* JADX INFO: renamed from: to */
    public final C4681zj m19430to() {
        return this.f13037to;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C4637k4 c4637k4 : m19429m9()) {
            c6765kp.m26792k4(C14113y2.m67408k4(c4637k4.toString(), ", "));
        }
        return C14113y2.m67402k4("BrushDataFlags: {0}, WrapMode: {1}, CenterColor: {2}, CenterPointF: {3}, SurroundingColorCount: {4}, SurroundingColor: [{5}], BoundaryData: {6}, OptionalData: {7}", C14042ak.m66410k4(C10209x1.class, this.f13034k4), C14042ak.m66410k4(C10189kp.class, this.f13038x1), this.f13035kk, this.f13037to, Long.valueOf(this.f13031du), c6765kp, this.f13036m9, this.f13032dy);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19431x1() {
        return this.f13038x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19420k4(long j) {
        this.f13034k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19428kk(long j) {
        this.f13031du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19432x1(long j) {
        this.f13038x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19421k4(C4624fa c4624fa) {
        this.f13036m9 = c4624fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19422k4(C4637k4 c4637k4) {
        this.f13035kk = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19423k4(C4665vh c4665vh) {
        this.f13032dy = c4665vh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19424k4(C4681zj c4681zj) {
        this.f13037to = c4681zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19425k4(C4637k4[] c4637k4Arr) {
        this.f13033h4 = c4637k4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19426k4(C4666vj c4666vj) {
        return this.f13034k4 == c4666vj.f13034k4 && this.f13038x1 == c4666vj.f13038x1 && C14067j2.m66728k4(this.f13035kk, c4666vj.f13035kk) && C14067j2.m66728k4(this.f13037to, c4666vj.f13037to) && this.f13031du == c4666vj.f13031du && C12530dy.m58334k4(this.f13033h4, c4666vj.f13033h4) && C14067j2.m66728k4(this.f13036m9, c4666vj.f13036m9) && C14067j2.m66728k4(this.f13032dy, c4666vj.f13032dy);
    }
}
