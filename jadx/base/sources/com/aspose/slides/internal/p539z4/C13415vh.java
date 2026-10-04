package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.vh */
/* JADX INFO: loaded from: classes5.dex */
public class C13415vh extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13430yo f44881k4;

    /* JADX INFO: renamed from: kk */
    private C13368dq f44882kk;

    /* JADX INFO: renamed from: x1 */
    private C13370dy f44883x1;

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
        return m62397k4((C13415vh) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13430yo c13430yo = this.f44881k4;
        int iMo62023h4 = c13430yo != null ? c13430yo.mo62023h4() : 0;
        C13368dq c13368dq = this.f44882kk;
        if (c13368dq != null) {
            iMo62023h4 += c13368dq.mo62023h4();
        }
        return m62399x1() != null ? this.f44883x1.mo62023h4() + iMo62023h4 : iMo62023h4;
    }

    public int hashCode() {
        C13430yo c13430yo = this.f44881k4;
        int iHashCode = (c13430yo != null ? c13430yo.hashCode() : 0) * 397;
        C13370dy c13370dy = this.f44883x1;
        int iHashCode2 = (iHashCode ^ (c13370dy != null ? c13370dy.hashCode() : 0)) * 397;
        C13368dq c13368dq = this.f44882kk;
        return iHashCode2 ^ (c13368dq != null ? c13368dq.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13430yo m62393k4() {
        return this.f44881k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13368dq m62398kk() {
        return this.f44882kk;
    }

    public String toString() {
        return C14113y2.m67402k4("TransformMatrix: {0}, BlendPattern: {1}, FocusScaleData: {2}", this.f44881k4, this.f44883x1, this.f44882kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13370dy m62399x1() {
        return this.f44883x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62394k4(C13368dq c13368dq) {
        this.f44882kk = c13368dq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62395k4(C13370dy c13370dy) {
        this.f44883x1 = c13370dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62396k4(C13430yo c13430yo) {
        this.f44881k4 = c13430yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62397k4(C13415vh c13415vh) {
        return C14067j2.m66728k4(this.f44881k4, c13415vh.f44881k4) && C14067j2.m66728k4(this.f44883x1, c13415vh.f44883x1) && C14067j2.m66728k4(this.f44882kk, c13415vh.f44882kk);
    }
}
