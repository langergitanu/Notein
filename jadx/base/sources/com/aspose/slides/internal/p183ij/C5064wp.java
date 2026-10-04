package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.wp */
/* JADX INFO: loaded from: classes.dex */
public class C5064wp extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C1357wl f13905du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13906k4;

    /* JADX INFO: renamed from: kk */
    private float f13907kk;

    /* JADX INFO: renamed from: to */
    private float f13908to;

    /* JADX INFO: renamed from: x1 */
    private long f13909x1;

    public C5064wp(C5061vw c5061vw) {
        super(c5061vw);
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
        return m21582k4((C5064wp) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C1357wl m21576h4() {
        return this.f13905du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13906k4;
        int iHashCode2 = (((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13909x1)) * 397) ^ C14064he.m66708k4(this.f13907kk)) * 397) ^ C14064he.m66708k4(this.f13908to)) * 397;
        C1357wl c1357wl = this.f13905du;
        return iHashCode2 ^ (c1357wl != null ? c1357wl.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21577k4() {
        return this.f13906k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m21583kk() {
        return this.f13907kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m21584to() {
        return this.f13908to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21585x1() {
        return this.f13909x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21578k4(float f) {
        this.f13907kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21586x1(float f) {
        this.f13908to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21579k4(long j) {
        this.f13909x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21580k4(C1357wl c1357wl) {
        this.f13905du = c1357wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21581k4(C12521uz c12521uz) {
        this.f13906k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21582k4(C5064wp c5064wp) {
        return m21559k4((C5061vw) c5064wp) && C14067j2.m66728k4(this.f13906k4, c5064wp.f13906k4) && this.f13909x1 == c5064wp.f13909x1 && C14064he.m66718x1(this.f13907kk, c5064wp.f13907kk) && C14064he.m66718x1(this.f13908to, c5064wp.f13908to) && C14067j2.m66728k4(this.f13905du, c5064wp.f13905du);
    }
}
