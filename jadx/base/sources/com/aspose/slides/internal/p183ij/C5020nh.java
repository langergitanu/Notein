package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1358x1;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.nh */
/* JADX INFO: loaded from: classes.dex */
public class C5020nh extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C1358x1 f13778k4;

    public C5020nh(C5061vw c5061vw) {
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
        return m21313k4((C5020nh) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1358x1 c1358x1 = this.f13778k4;
        return iHashCode ^ (c1358x1 != null ? c1358x1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1358x1 m21311k4() {
        return this.f13778k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21312k4(C1358x1 c1358x1) {
        this.f13778k4 = c1358x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21313k4(C5020nh c5020nh) {
        return m21559k4((C5061vw) c5020nh) && C14067j2.m66728k4(this.f13778k4, c5020nh.f13778k4);
    }
}
