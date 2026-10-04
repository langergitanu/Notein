package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3867h4;
import com.aspose.slides.internal.p260ly.C6288wl;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ss */
/* JADX INFO: loaded from: classes4.dex */
public class C9704ss extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C6288wl f35089du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35090k4;

    /* JADX INFO: renamed from: kk */
    private float f35091kk;

    /* JADX INFO: renamed from: to */
    private float f35092to;

    /* JADX INFO: renamed from: x1 */
    private long f35093x1;

    public C9704ss(C9723vw c9723vw) {
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
        return m47644k4((C9704ss) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C6288wl m47638h4() {
        return this.f35089du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35090k4;
        int iHashCode2 = (((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35093x1)) * 397) ^ C14064he.m66708k4(this.f35091kk)) * 397) ^ C14064he.m66708k4(this.f35092to)) * 397;
        C6288wl c6288wl = this.f35089du;
        return iHashCode2 ^ (c6288wl != null ? c6288wl.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47639k4() {
        return this.f35090k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m47645kk() {
        return this.f35091kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m47646to() {
        return this.f35092to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Bounds: {1}, IGraphicsMode: {2}, ExScale: {3}, EyScale: {4}, WEmrText: {5}", super.toString(), m47639k4(), C14042ak.m66410k4(C3867h4.class, m47647x1()), Float.valueOf(m47645kk()), Float.valueOf(m47646to()), m47638h4());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47647x1() {
        return this.f35093x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47640k4(float f) {
        this.f35091kk = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47648x1(float f) {
        this.f35092to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47641k4(long j) {
        this.f35093x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47642k4(C6288wl c6288wl) {
        this.f35089du = c6288wl;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47643k4(C12350uz c12350uz) {
        this.f35090k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47644k4(C9704ss c9704ss) {
        return m47765k4((C9723vw) c9704ss) && C14067j2.m66728k4(this.f35090k4, c9704ss.f35090k4) && this.f35093x1 == c9704ss.f35093x1 && C14064he.m66718x1(this.f35091kk, c9704ss.f35091kk) && C14064he.m66718x1(this.f35092to, c9704ss.f35092to) && C14067j2.m66728k4(this.f35089du, c9704ss.f35089du);
    }
}
