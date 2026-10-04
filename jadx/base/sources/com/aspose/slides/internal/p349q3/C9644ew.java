package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12334dy;
import com.aspose.slides.internal.p488x0.C12343ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ew */
/* JADX INFO: loaded from: classes4.dex */
public class C9644ew extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12343ne f34878k4;

    /* JADX INFO: renamed from: x1 */
    private C12334dy f34879x1;

    public C9644ew(C9723vw c9723vw) {
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
        return m47180k4((C9644ew) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12343ne c12343ne = this.f34878k4;
        int iHashCode2 = (iHashCode ^ (c12343ne != null ? c12343ne.hashCode() : 0)) * 397;
        C12334dy c12334dy = this.f34879x1;
        return iHashCode2 ^ (c12334dy != null ? c12334dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12343ne m47177k4() {
        return this.f34878k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Pixel: {1}, Color: {2}", super.toString(), m47177k4(), m47181x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12334dy m47181x1() {
        return this.f34879x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47178k4(C12334dy c12334dy) {
        this.f34879x1 = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47179k4(C12343ne c12343ne) {
        this.f34878k4 = c12343ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47180k4(C9644ew c9644ew) {
        return m47765k4((C9723vw) c9644ew) && C14067j2.m66728k4(this.f34878k4, c9644ew.f34878k4) && C14067j2.m66728k4(this.f34879x1, c9644ew.f34879x1);
    }
}
