package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1487kp;
import com.aspose.slides.internal.p026an.C1507x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.kp */
/* JADX INFO: loaded from: classes5.dex */
public final class C13389kp extends AbstractC13388kk {

    /* JADX INFO: renamed from: du */
    private int f44780du;

    /* JADX INFO: renamed from: dy */
    private long f44781dy;

    /* JADX INFO: renamed from: h4 */
    private int f44782h4;

    /* JADX INFO: renamed from: k4 */
    private long f44783k4;

    /* JADX INFO: renamed from: kk */
    private C13377gi f44784kk;

    /* JADX INFO: renamed from: m9 */
    private C13387k4 f44785m9;

    /* JADX INFO: renamed from: to */
    private C13366ca f44786to;

    /* JADX INFO: renamed from: x1 */
    private C13387k4 f44787x1;

    /* JADX INFO: renamed from: du */
    public final C13387k4 m62182du() {
        return this.f44785m9;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13389kp.class) && m62181k4((C13389kp) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        int iMo62023h4 = this.f44786to.mo62023h4() + 24;
        C13377gi c13377gi = this.f44784kk;
        return c13377gi != null ? c13377gi.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        int i = ((int) this.f44783k4) * 397;
        C13387k4 c13387k4 = this.f44787x1;
        int iHashCode = (i ^ (c13387k4 != null ? c13387k4.hashCode() : 0)) * 397;
        C13377gi c13377gi = this.f44784kk;
        int iHashCode2 = (iHashCode ^ (c13377gi != null ? c13377gi.hashCode() : 0)) * 397;
        C13366ca c13366ca = this.f44786to;
        int iHashCode3 = (((((iHashCode2 ^ (c13366ca != null ? c13366ca.hashCode() : 0)) * 397) ^ this.f44780du) * 397) ^ this.f44782h4) * 397;
        C13387k4 c13387k42 = this.f44785m9;
        return ((iHashCode3 ^ (c13387k42 != null ? c13387k42.hashCode() : 0)) * 397) ^ ((int) this.f44781dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62183k4() {
        return this.f44783k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13377gi m62189kk() {
        return this.f44784kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m62190m9() {
        return this.f44781dy;
    }

    /* JADX INFO: renamed from: to */
    public final C13366ca m62191to() {
        return this.f44786to;
    }

    public String toString() {
        return C14113y2.m67402k4("BrushDataFlags: {0}, EndColor: {1}, OptionalData: {2}, RectF: {3}, Reserved1: {4}, Reserved2: {5}, StartColor: {6}, WrapMode: {7}", C14042ak.m66410k4(C1507x1.class, this.f44783k4), this.f44787x1, this.f44784kk, this.f44786to, Integer.valueOf(this.f44780du), Integer.valueOf(this.f44782h4), this.f44785m9, C14042ak.m66410k4(C1487kp.class, this.f44781dy));
    }

    /* JADX INFO: renamed from: x1 */
    public final C13387k4 m62192x1() {
        return this.f44787x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62184k4(int i) {
        this.f44780du = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62193x1(int i) {
        this.f44782h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62185k4(long j) {
        this.f44783k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62194x1(long j) {
        this.f44781dy = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62186k4(C13366ca c13366ca) {
        this.f44786to = c13366ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62195x1(C13387k4 c13387k4) {
        this.f44785m9 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62187k4(C13377gi c13377gi) {
        this.f44784kk = c13377gi;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62188k4(C13387k4 c13387k4) {
        this.f44787x1 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62181k4(C13389kp c13389kp) {
        return this.f44783k4 == c13389kp.f44783k4 && C14067j2.m66728k4(this.f44787x1, c13389kp.f44787x1) && C14067j2.m66728k4(this.f44784kk, c13389kp.f44784kk) && C14067j2.m66728k4(this.f44786to, c13389kp.f44786to) && this.f44780du == c13389kp.f44780du && this.f44782h4 == c13389kp.f44782h4 && C14067j2.m66728k4(this.f44785m9, c13389kp.f44785m9) && this.f44781dy == c13389kp.f44781dy;
    }
}
