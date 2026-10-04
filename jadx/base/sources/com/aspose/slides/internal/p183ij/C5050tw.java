package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.tw */
/* JADX INFO: loaded from: classes.dex */
public class C5050tw extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13862k4;

    public C5050tw(C5061vw c5061vw) {
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
        return m21484k4((C5050tw) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13862k4;
        return iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21482k4() {
        return this.f13862k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Origin: {1}", super.toString(), m21482k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21483k4(C12514ne c12514ne) {
        this.f13862k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21484k4(C5050tw c5050tw) {
        return m21559k4((C5061vw) c5050tw) && C14067j2.m66728k4(this.f13862k4, c5050tw.f13862k4);
    }
}
