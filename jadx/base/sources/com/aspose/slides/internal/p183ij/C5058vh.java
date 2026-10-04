package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.vh */
/* JADX INFO: loaded from: classes.dex */
public class C5058vh extends AbstractC4965c5 {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13888k4;

    public C5058vh(C5061vw c5061vw) {
        super(c5061vw);
        this.f13888k4 = new C12521uz();
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
        return m21540k4((C5058vh) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13888k4;
        return iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21538k4() {
        return this.f13888k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Clip: {1}", super.toString(), m21538k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21539k4(C12521uz c12521uz) {
        this.f13888k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21540k4(C5058vh c5058vh) {
        return m21559k4((C5061vw) c5058vh) && C14067j2.m66728k4(this.f13888k4, c5058vh.f13888k4);
    }
}
