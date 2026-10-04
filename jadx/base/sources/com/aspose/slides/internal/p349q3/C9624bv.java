package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C9624bv extends AbstractC9629ca {

    /* JADX INFO: renamed from: du */
    private long f34787du;

    /* JADX INFO: renamed from: h4 */
    private long f34788h4;

    /* JADX INFO: renamed from: k4 */
    private long f34789k4;

    /* JADX INFO: renamed from: kk */
    private long f34790kk;

    /* JADX INFO: renamed from: m9 */
    private C12331c5 f34791m9;

    /* JADX INFO: renamed from: to */
    private long f34792to;

    /* JADX INFO: renamed from: x1 */
    private long f34793x1;

    public C9624bv(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m46985du(long j) {
        this.f34787du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12331c5 m46986dy() {
        return this.f34791m9;
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
        return m46992k4((C9624bv) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m46987h4() {
        return this.f34787du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 397) ^ ((int) this.f34789k4)) * 397) ^ ((int) this.f34793x1)) * 397) ^ ((int) this.f34790kk)) * 397) ^ ((int) this.f34792to)) * 397) ^ ((int) this.f34787du)) * 397) ^ ((int) this.f34788h4)) * 397;
        C12331c5 c12331c5 = this.f34791m9;
        return iHashCode ^ (c12331c5 != null ? c12331c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m46989k4() {
        return this.f34789k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m46993kk() {
        return this.f34790kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m46995m9() {
        return this.f34788h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m46996to() {
        return this.f34792to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m46998x1() {
        return this.f34793x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m46988h4(long j) {
        this.f34788h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46990k4(long j) {
        this.f34789k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m46994kk(long j) {
        this.f34790kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m46997to(long j) {
        this.f34792to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46999x1(long j) {
        this.f34793x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46991k4(C12331c5 c12331c5) {
        this.f34791m9 = c12331c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46992k4(C9624bv c9624bv) {
        return m47765k4((C9723vw) c9624bv) && this.f34789k4 == c9624bv.f34789k4 && this.f34793x1 == c9624bv.f34793x1 && this.f34790kk == c9624bv.f34790kk && this.f34792to == c9624bv.f34792to && this.f34787du == c9624bv.f34787du && this.f34788h4 == c9624bv.f34788h4 && C14067j2.m66728k4(this.f34791m9, c9624bv.f34791m9);
    }
}
