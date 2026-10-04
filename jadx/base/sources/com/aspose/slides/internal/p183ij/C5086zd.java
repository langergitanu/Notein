package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.zd */
/* JADX INFO: loaded from: classes.dex */
public class C5086zd extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12505dy f13982k4;

    public C5086zd(C5061vw c5061vw) {
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
        return m21731k4((C5086zd) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12505dy c12505dy = this.f13982k4;
        return iHashCode ^ (c12505dy != null ? c12505dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12505dy m21729k4() {
        return this.f13982k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Color: {1}", super.toString(), m21729k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21730k4(C12505dy c12505dy) {
        this.f13982k4 = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21731k4(C5086zd c5086zd) {
        return m21559k4((C5061vw) c5086zd) && C14067j2.m66728k4(this.f13982k4, c5086zd.f13982k4);
    }
}
