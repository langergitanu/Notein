package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.bu */
/* JADX INFO: loaded from: classes.dex */
public class C4961bu extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13539k4;

    public C4961bu(C5061vw c5061vw) {
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
        return m20819k4((C4961bu) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13539k4;
        return iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m20817k4() {
        return this.f13539k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Origin: {1}", super.toString(), m20817k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20818k4(C12514ne c12514ne) {
        this.f13539k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20819k4(C4961bu c4961bu) {
        return m21559k4((C5061vw) c4961bu) && C14067j2.m66728k4(this.f13539k4, c4961bu.f13539k4);
    }
}
