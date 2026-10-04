package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.he */
/* JADX INFO: loaded from: classes.dex */
public class C4992he extends AbstractC4965c5 {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13670k4;

    public C4992he(C5061vw c5061vw) {
        super(c5061vw);
        this.f13670k4 = new C12514ne();
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
        return m21087k4((C4992he) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13670k4;
        return iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21085k4() {
        return this.f13670k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21086k4(C12514ne c12514ne) {
        this.f13670k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21087k4(C4992he c4992he) {
        return m21559k4((C5061vw) c4992he) && C14067j2.m66728k4(this.f13670k4, c4992he.f13670k4);
    }
}
