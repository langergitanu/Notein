package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12502c5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.bv */
/* JADX INFO: loaded from: classes.dex */
public class C4962bv extends AbstractC4967ca {

    /* JADX INFO: renamed from: du */
    private long f13540du;

    /* JADX INFO: renamed from: h4 */
    private long f13541h4;

    /* JADX INFO: renamed from: k4 */
    private long f13542k4;

    /* JADX INFO: renamed from: kk */
    private long f13543kk;

    /* JADX INFO: renamed from: m9 */
    private C12502c5 f13544m9;

    /* JADX INFO: renamed from: to */
    private long f13545to;

    /* JADX INFO: renamed from: x1 */
    private long f13546x1;

    public C4962bv(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m20820du(long j) {
        this.f13540du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12502c5 m20821dy() {
        return this.f13544m9;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m20827k4((C4962bv) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m20822h4() {
        return this.f13540du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 397) ^ ((int) this.f13542k4)) * 397) ^ ((int) this.f13546x1)) * 397) ^ ((int) this.f13543kk)) * 397) ^ ((int) this.f13545to)) * 397) ^ ((int) this.f13540du)) * 397) ^ ((int) this.f13541h4)) * 397;
        C12502c5 c12502c5 = this.f13544m9;
        return iHashCode ^ (c12502c5 != null ? c12502c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20824k4() {
        return this.f13542k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m20828kk() {
        return this.f13543kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m20830m9() {
        return this.f13541h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m20831to() {
        return this.f13545to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m20833x1() {
        return this.f13546x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m20823h4(long j) {
        this.f13541h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20825k4(long j) {
        this.f13542k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m20829kk(long j) {
        this.f13543kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m20832to(long j) {
        this.f13545to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m20834x1(long j) {
        this.f13546x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20826k4(C12502c5 c12502c5) {
        this.f13544m9 = c12502c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20827k4(C4962bv c4962bv) {
        return m21559k4((C5061vw) c4962bv) && this.f13542k4 == c4962bv.f13542k4 && this.f13546x1 == c4962bv.f13546x1 && this.f13543kk == c4962bv.f13543kk && this.f13545to == c4962bv.f13545to && this.f13540du == c4962bv.f13540du && this.f13541h4 == c4962bv.f13541h4 && C14067j2.m66728k4(this.f13544m9, c4962bv.f13544m9);
    }
}
