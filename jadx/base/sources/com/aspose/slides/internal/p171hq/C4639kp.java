package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10189kp;
import com.aspose.slides.internal.p396sc.C10209x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.kp */
/* JADX INFO: loaded from: classes.dex */
public final class C4639kp extends AbstractC4638kk {

    /* JADX INFO: renamed from: du */
    private int f12927du;

    /* JADX INFO: renamed from: dy */
    private long f12928dy;

    /* JADX INFO: renamed from: h4 */
    private int f12929h4;

    /* JADX INFO: renamed from: k4 */
    private long f12930k4;

    /* JADX INFO: renamed from: kk */
    private C4627gi f12931kk;

    /* JADX INFO: renamed from: m9 */
    private C4637k4 f12932m9;

    /* JADX INFO: renamed from: to */
    private C4616ca f12933to;

    /* JADX INFO: renamed from: x1 */
    private C4637k4 f12934x1;

    /* JADX INFO: renamed from: c5 */
    public final long m19184c5() {
        return this.f12928dy;
    }

    /* JADX INFO: renamed from: du */
    public final int m19185du() {
        return this.f12927du;
    }

    /* JADX INFO: renamed from: dy */
    public final C4637k4 m19186dy() {
        return this.f12932m9;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4639kp.class) && m19183k4((C4639kp) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        int iMo19017h4 = this.f12933to.mo19017h4() + 24;
        C4627gi c4627gi = this.f12931kk;
        return c4627gi != null ? c4627gi.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        int i = ((int) this.f12930k4) * 397;
        C4637k4 c4637k4 = this.f12934x1;
        int iHashCode = (i ^ (c4637k4 != null ? c4637k4.hashCode() : 0)) * 397;
        C4627gi c4627gi = this.f12931kk;
        int iHashCode2 = (iHashCode ^ (c4627gi != null ? c4627gi.hashCode() : 0)) * 397;
        C4616ca c4616ca = this.f12933to;
        int iHashCode3 = (((((iHashCode2 ^ (c4616ca != null ? c4616ca.hashCode() : 0)) * 397) ^ this.f12927du) * 397) ^ this.f12929h4) * 397;
        C4637k4 c4637k42 = this.f12932m9;
        return ((iHashCode3 ^ (c4637k42 != null ? c4637k42.hashCode() : 0)) * 397) ^ ((int) this.f12928dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19187k4() {
        return this.f12930k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4627gi m19193kk() {
        return this.f12931kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m19194m9() {
        return this.f12929h4;
    }

    /* JADX INFO: renamed from: to */
    public final C4616ca m19195to() {
        return this.f12933to;
    }

    public String toString() {
        return C14113y2.m67402k4("BrushDataFlags: {0}, EndColor: {1}, OptionalData: {2}, RectF: {3}, Reserved1: {4}, Reserved2: {5}, StartColor: {6}, WrapMode: {7}", C14042ak.m66410k4(C10209x1.class, this.f12930k4), this.f12934x1, this.f12931kk, this.f12933to, Integer.valueOf(this.f12927du), Integer.valueOf(this.f12929h4), this.f12932m9, C14042ak.m66410k4(C10189kp.class, this.f12928dy));
    }

    /* JADX INFO: renamed from: x1 */
    public final C4637k4 m19196x1() {
        return this.f12934x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19188k4(int i) {
        this.f12927du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19197x1(int i) {
        this.f12929h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19189k4(long j) {
        this.f12930k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19198x1(long j) {
        this.f12928dy = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19190k4(C4616ca c4616ca) {
        this.f12933to = c4616ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19199x1(C4637k4 c4637k4) {
        this.f12932m9 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19191k4(C4627gi c4627gi) {
        this.f12931kk = c4627gi;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19192k4(C4637k4 c4637k4) {
        this.f12934x1 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19183k4(C4639kp c4639kp) {
        return this.f12930k4 == c4639kp.f12930k4 && C14067j2.m66728k4(this.f12934x1, c4639kp.f12934x1) && C14067j2.m66728k4(this.f12931kk, c4639kp.f12931kk) && C14067j2.m66728k4(this.f12933to, c4639kp.f12933to) && this.f12927du == c4639kp.f12927du && this.f12929h4 == c4639kp.f12929h4 && C14067j2.m66728k4(this.f12932m9, c4639kp.f12932m9) && this.f12928dy == c4639kp.f12928dy;
    }
}
