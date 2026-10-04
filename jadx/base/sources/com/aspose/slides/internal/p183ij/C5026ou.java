package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ou */
/* JADX INFO: loaded from: classes.dex */
public class C5026ou extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12505dy f13805k4;

    public C5026ou(C5061vw c5061vw) {
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
        return m21372k4((C5026ou) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12505dy c12505dy = this.f13805k4;
        return iHashCode ^ (c12505dy != null ? c12505dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12505dy m21370k4() {
        return this.f13805k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Color: {1}", super.toString(), m21370k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21371k4(C12505dy c12505dy) {
        this.f13805k4 = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21372k4(C5026ou c5026ou) {
        return m21559k4((C5061vw) c5026ou) && C14067j2.m66728k4(this.f13805k4, c5026ou.f13805k4);
    }
}
