package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C9726wp extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C6288wl f35152du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35153k4;

    /* JADX INFO: renamed from: kk */
    private float f35154kk;

    /* JADX INFO: renamed from: to */
    private float f35155to;

    /* JADX INFO: renamed from: x1 */
    private long f35156x1;

    public C9726wp(C9723vw c9723vw) {
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
        return m47789k4((C9726wp) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C6288wl m47783h4() {
        return this.f35152du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35153k4;
        int iHashCode2 = (((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35156x1)) * 397) ^ C14064he.m66708k4(this.f35154kk)) * 397) ^ C14064he.m66708k4(this.f35155to)) * 397;
        C6288wl c6288wl = this.f35152du;
        return iHashCode2 ^ (c6288wl != null ? c6288wl.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47784k4() {
        return this.f35153k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m47790kk() {
        return this.f35154kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m47791to() {
        return this.f35155to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47792x1() {
        return this.f35156x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47785k4(float f) {
        this.f35154kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47793x1(float f) {
        this.f35155to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47786k4(long j) {
        this.f35156x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47787k4(C6288wl c6288wl) {
        this.f35152du = c6288wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47788k4(C12350uz c12350uz) {
        this.f35153k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47789k4(C9726wp c9726wp) {
        return m47765k4((C9723vw) c9726wp) && C14067j2.m66728k4(this.f35153k4, c9726wp.f35153k4) && this.f35156x1 == c9726wp.f35156x1 && C14064he.m66718x1(this.f35154kk, c9726wp.f35154kk) && C14064he.m66718x1(this.f35155to, c9726wp.f35155to) && C14067j2.m66728k4(this.f35152du, c9726wp.f35152du);
    }
}
