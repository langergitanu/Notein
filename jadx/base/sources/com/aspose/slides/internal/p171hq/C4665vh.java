package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.vh */
/* JADX INFO: loaded from: classes.dex */
public class C4665vh extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4680yo f13028k4;

    /* JADX INFO: renamed from: kk */
    private C4618dq f13029kk;

    /* JADX INFO: renamed from: x1 */
    private C4620dy f13030x1;

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
        return m19413k4((C4665vh) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4680yo c4680yo = this.f13028k4;
        int iMo19017h4 = c4680yo != null ? c4680yo.mo19017h4() : 0;
        C4618dq c4618dq = this.f13029kk;
        if (c4618dq != null) {
            iMo19017h4 += c4618dq.mo19017h4();
        }
        return m19415x1() != null ? this.f13030x1.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        C4680yo c4680yo = this.f13028k4;
        int iHashCode = (c4680yo != null ? c4680yo.hashCode() : 0) * 397;
        C4620dy c4620dy = this.f13030x1;
        int iHashCode2 = (iHashCode ^ (c4620dy != null ? c4620dy.hashCode() : 0)) * 397;
        C4618dq c4618dq = this.f13029kk;
        return iHashCode2 ^ (c4618dq != null ? c4618dq.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4680yo m19409k4() {
        return this.f13028k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4618dq m19414kk() {
        return this.f13029kk;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, BlendPattern: {1}, FocusScaleData: {2}", this.f13028k4, this.f13030x1, this.f13029kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4620dy m19415x1() {
        return this.f13030x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19410k4(C4618dq c4618dq) {
        this.f13029kk = c4618dq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19411k4(C4620dy c4620dy) {
        this.f13030x1 = c4620dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19412k4(C4680yo c4680yo) {
        this.f13028k4 = c4680yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19413k4(C4665vh c4665vh) {
        return C14067j2.m66728k4(this.f13028k4, c4665vh.f13028k4) && C14067j2.m66728k4(this.f13030x1, c4665vh.f13030x1) && C14067j2.m66728k4(this.f13029kk, c4665vh.f13029kk);
    }
}
