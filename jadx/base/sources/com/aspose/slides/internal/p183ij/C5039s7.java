package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1336ar;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.s7 */
/* JADX INFO: loaded from: classes.dex */
public class C5039s7 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C1336ar f13836k4;

    public C5039s7(C5061vw c5061vw) {
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
        return m21427k4((C5039s7) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1336ar c1336ar = this.f13836k4;
        return iHashCode ^ (c1336ar != null ? c1336ar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1336ar m21425k4() {
        return this.f13836k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21426k4(C1336ar c1336ar) {
        this.f13836k4 = c1336ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21427k4(C5039s7 c5039s7) {
        return m21559k4((C5061vw) c5039s7) && C14067j2.m66728k4(this.f13836k4, c5039s7.f13836k4);
    }
}
