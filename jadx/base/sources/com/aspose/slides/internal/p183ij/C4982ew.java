package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ew */
/* JADX INFO: loaded from: classes.dex */
public class C4982ew extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13631k4;

    /* JADX INFO: renamed from: x1 */
    private C12505dy f13632x1;

    public C4982ew(C5061vw c5061vw) {
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
        return m21005k4((C4982ew) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13631k4;
        int iHashCode2 = (iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12505dy c12505dy = this.f13632x1;
        return iHashCode2 ^ (c12505dy != null ? c12505dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21002k4() {
        return this.f13631k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Pixel: {1}, Color: {2}", super.toString(), m21002k4(), m21006x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12505dy m21006x1() {
        return this.f13632x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21003k4(C12505dy c12505dy) {
        this.f13632x1 = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21004k4(C12514ne c12514ne) {
        this.f13631k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21005k4(C4982ew c4982ew) {
        return m21559k4((C5061vw) c4982ew) && C14067j2.m66728k4(this.f13631k4, c4982ew.f13631k4) && C14067j2.m66728k4(this.f13632x1, c4982ew.f13632x1);
    }
}
