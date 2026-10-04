package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.ai */
/* JADX INFO: loaded from: classes.dex */
public class C4952ai extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13525k4;

    public C4952ai(C5061vw c5061vw) {
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
        return m20787k4((C4952ai) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13525k4;
        return iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m20785k4() {
        return this.f13525k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Offset: {1}", super.toString(), m20785k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20786k4(C12514ne c12514ne) {
        this.f13525k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20787k4(C4952ai c4952ai) {
        return m21559k4((C5061vw) c4952ai) && C14067j2.m66728k4(this.f13525k4, c4952ai.f13525k4);
    }
}
