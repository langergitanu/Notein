package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12519um;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.y6 */
/* JADX INFO: loaded from: classes.dex */
public class C5077y6 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12519um f13940k4;

    public C5077y6(C5061vw c5061vw) {
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
        return m21644k4((C5077y6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12519um c12519um = this.f13940k4;
        return iHashCode ^ (c12519um != null ? c12519um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12519um m21642k4() {
        return this.f13940k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Extent: {1}", super.toString(), m21642k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21643k4(C12519um c12519um) {
        this.f13940k4 = c12519um;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21644k4(C5077y6 c5077y6) {
        return m21559k4((C5061vw) c5077y6) && C14067j2.m66728k4(this.f13940k4, c5077y6.f13940k4);
    }
}
