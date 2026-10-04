package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.tq */
/* JADX INFO: loaded from: classes.dex */
public class C5048tq extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13860k4;

    public C5048tq(C5061vw c5061vw) {
        super(c5061vw);
        this.f13860k4 = new C12514ne();
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
        return m21478k4((C5048tq) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13860k4;
        return iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21477k4() {
        return this.f13860k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21478k4(C5048tq c5048tq) {
        return m21559k4((C5061vw) c5048tq) && C14067j2.m66728k4(this.f13860k4, c5048tq.f13860k4);
    }
}
