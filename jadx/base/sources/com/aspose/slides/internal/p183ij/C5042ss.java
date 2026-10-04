package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1357wl;
import com.aspose.slides.internal.p360qg.C9866h4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ss */
/* JADX INFO: loaded from: classes.dex */
public class C5042ss extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C1357wl f13842du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13843k4;

    /* JADX INFO: renamed from: kk */
    private float f13844kk;

    /* JADX INFO: renamed from: to */
    private float f13845to;

    /* JADX INFO: renamed from: x1 */
    private long f13846x1;

    public C5042ss(C5061vw c5061vw) {
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
        return m21446k4((C5042ss) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C1357wl m21440h4() {
        return this.f13842du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13843k4;
        int iHashCode2 = (((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13846x1)) * 397) ^ C14064he.m66708k4(this.f13844kk)) * 397) ^ C14064he.m66708k4(this.f13845to)) * 397;
        C1357wl c1357wl = this.f13842du;
        return iHashCode2 ^ (c1357wl != null ? c1357wl.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21441k4() {
        return this.f13843k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m21447kk() {
        return this.f13844kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m21448to() {
        return this.f13845to;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}, IGraphicsMode: {2}, ExScale: {3}, EyScale: {4}, WEmrText: {5}", super.toString(), m21441k4(), C14042ak.m66410k4(C9866h4.class, m21449x1()), Float.valueOf(m21447kk()), Float.valueOf(m21448to()), m21440h4());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21449x1() {
        return this.f13846x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21442k4(float f) {
        this.f13844kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21450x1(float f) {
        this.f13845to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21443k4(long j) {
        this.f13846x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21444k4(C1357wl c1357wl) {
        this.f13842du = c1357wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21445k4(C12521uz c12521uz) {
        this.f13843k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21446k4(C5042ss c5042ss) {
        return m21559k4((C5061vw) c5042ss) && C14067j2.m66728k4(this.f13843k4, c5042ss.f13843k4) && this.f13846x1 == c5042ss.f13846x1 && C14064he.m66718x1(this.f13844kk, c5042ss.f13844kk) && C14064he.m66718x1(this.f13845to, c5042ss.f13845to) && C14067j2.m66728k4(this.f13842du, c5042ss.f13842du);
    }
}
