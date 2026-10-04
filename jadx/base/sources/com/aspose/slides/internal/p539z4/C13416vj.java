package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1487kp;
import com.aspose.slides.internal.p026an.C1507x1;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.vj */
/* JADX INFO: loaded from: classes5.dex */
public class C13416vj extends AbstractC13388kk {

    /* JADX INFO: renamed from: du */
    private long f44884du;

    /* JADX INFO: renamed from: dy */
    private C13415vh f44885dy;

    /* JADX INFO: renamed from: h4 */
    private C13387k4[] f44886h4;

    /* JADX INFO: renamed from: k4 */
    private long f44887k4;

    /* JADX INFO: renamed from: kk */
    private C13387k4 f44888kk;

    /* JADX INFO: renamed from: m9 */
    private C13374fa f44889m9;

    /* JADX INFO: renamed from: to */
    private C13431zj f44890to;

    /* JADX INFO: renamed from: x1 */
    private long f44891x1;

    /* JADX INFO: renamed from: c5 */
    public final C13415vh m62400c5() {
        return this.f44885dy;
    }

    /* JADX INFO: renamed from: du */
    public final long m62401du() {
        return this.f44884du;
    }

    /* JADX INFO: renamed from: dy */
    public final C13374fa m62402dy() {
        return this.f44889m9;
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
        return m62410k4((C13416vj) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        int iMo62023h4 = (int) ((((this.f44884du & 4294967295L) * 4) & 4294967295L) + 24);
        C13374fa c13374fa = this.f44889m9;
        if (c13374fa != null) {
            iMo62023h4 += c13374fa.mo62023h4();
        }
        C13415vh c13415vh = this.f44885dy;
        return c13415vh != null ? c13415vh.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        int i = ((((int) this.f44887k4) * 397) ^ ((int) this.f44891x1)) * 397;
        C13387k4 c13387k4 = this.f44888kk;
        int iHashCode = (i ^ (c13387k4 != null ? c13387k4.hashCode() : 0)) * 397;
        C13431zj c13431zj = this.f44890to;
        int iHashCode2 = (((iHashCode ^ (c13431zj != null ? c13431zj.hashCode() : 0)) * 397) ^ ((int) this.f44884du)) * 397;
        C13387k4[] c13387k4Arr = this.f44886h4;
        int iHashCode3 = (iHashCode2 ^ (c13387k4Arr != null ? AbstractC14092to.m67208k4((Object) c13387k4Arr).hashCode() : 0)) * 397;
        C13374fa c13374fa = this.f44889m9;
        int iHashCode4 = (iHashCode3 ^ (c13374fa != null ? c13374fa.hashCode() : 0)) * 397;
        C13415vh c13415vh = this.f44885dy;
        return iHashCode4 ^ (c13415vh != null ? c13415vh.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62403k4() {
        return this.f44887k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13387k4 m62411kk() {
        return this.f44888kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C13387k4[] m62413m9() {
        return this.f44884du == 0 ? new C13387k4[0] : this.f44886h4;
    }

    /* JADX INFO: renamed from: to */
    public final C13431zj m62414to() {
        return this.f44890to;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C13387k4 c13387k4 : m62413m9()) {
            c6765kp.m26792k4(C14113y2.m67408k4(c13387k4.toString(), ", "));
        }
        return C14113y2.m67402k4("BrushDataFlags: {0}, WrapMode: {1}, CenterColor: {2}, CenterPointF: {3}, SurroundingColorCount: {4}, SurroundingColor: [{5}], BoundaryData: {6}, OptionalData: {7}", C14042ak.m66410k4(C1507x1.class, this.f44887k4), C14042ak.m66410k4(C1487kp.class, this.f44891x1), this.f44888kk, this.f44890to, Long.valueOf(this.f44884du), c6765kp, this.f44889m9, this.f44885dy);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62415x1() {
        return this.f44891x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62404k4(long j) {
        this.f44887k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62412kk(long j) {
        this.f44884du = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62416x1(long j) {
        this.f44891x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62405k4(C13374fa c13374fa) {
        this.f44889m9 = c13374fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62406k4(C13387k4 c13387k4) {
        this.f44888kk = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62407k4(C13415vh c13415vh) {
        this.f44885dy = c13415vh;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62408k4(C13431zj c13431zj) {
        this.f44890to = c13431zj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62409k4(C13387k4[] c13387k4Arr) {
        this.f44886h4 = c13387k4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62410k4(C13416vj c13416vj) {
        return this.f44887k4 == c13416vj.f44887k4 && this.f44891x1 == c13416vj.f44891x1 && C14067j2.m66728k4(this.f44888kk, c13416vj.f44888kk) && C14067j2.m66728k4(this.f44890to, c13416vj.f44890to) && this.f44884du == c13416vj.f44884du && C3022m9.m12723k4(this.f44886h4, c13416vj.f44886h4) && C14067j2.m66728k4(this.f44889m9, c13416vj.f44889m9) && C14067j2.m66728k4(this.f44885dy, c13416vj.f44885dy);
    }
}
