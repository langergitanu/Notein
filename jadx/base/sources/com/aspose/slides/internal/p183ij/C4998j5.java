package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1343ix;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.j5 */
/* JADX INFO: loaded from: classes.dex */
public class C4998j5 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C1343ix f13706k4;

    public C4998j5(C5061vw c5061vw) {
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
        return m21163k4((C4998j5) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C1343ix c1343ix = this.f13706k4;
        return iHashCode ^ (c1343ix != null ? c1343ix.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1343ix m21161k4() {
        return this.f13706k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21162k4(C1343ix c1343ix) {
        this.f13706k4 = c1343ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21163k4(C4998j5 c4998j5) {
        return m21559k4((C5061vw) c4998j5) && C14067j2.m66728k4(this.f13706k4, c4998j5.f13706k4);
    }
}
