package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p019ac.C1353u4;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.y2 */
/* JADX INFO: loaded from: classes.dex */
public class C5075y2 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13937k4;

    /* JADX INFO: renamed from: kk */
    private C1353u4 f13938kk;

    /* JADX INFO: renamed from: x1 */
    private long f13939x1;

    public C5075y2(C5061vw c5061vw) {
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
        return m21640k4((C5075y2) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13937k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13939x1)) * 397;
        C1353u4 c1353u4 = this.f13938kk;
        return iHashCode2 ^ (c1353u4 != null ? c1353u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21636k4() {
        return this.f13937k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C1353u4 m21641x1() {
        return this.f13938kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21637k4(long j) {
        this.f13939x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21638k4(C1353u4 c1353u4) {
        this.f13938kk = c1353u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21639k4(C12521uz c12521uz) {
        this.f13937k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21640k4(C5075y2 c5075y2) {
        return m21559k4((C5061vw) c5075y2) && C14067j2.m66728k4(this.f13937k4, c5075y2.f13937k4) && this.f13939x1 == c5075y2.f13939x1 && this.f13938kk.equals(c5075y2.f13938kk);
    }
}
