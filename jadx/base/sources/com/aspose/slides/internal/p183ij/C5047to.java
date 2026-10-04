package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.to */
/* JADX INFO: loaded from: classes.dex */
public class C5047to extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13857k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne f13858kk;

    /* JADX INFO: renamed from: x1 */
    private C12514ne f13859x1;

    public C5047to(C5061vw c5061vw) {
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
        return m21473k4((C5047to) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13857k4;
        int iHashCode2 = (iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397;
        C12514ne c12514ne = this.f13859x1;
        int iHashCode3 = (iHashCode2 ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12514ne c12514ne2 = this.f13858kk;
        return iHashCode3 ^ (c12514ne2 != null ? c12514ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21470k4() {
        return this.f13857k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12514ne m21474kk() {
        return this.f13858kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne m21475x1() {
        return this.f13859x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21471k4(C12514ne c12514ne) {
        this.f13859x1 = c12514ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21476x1(C12514ne c12514ne) {
        this.f13858kk = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21472k4(C12521uz c12521uz) {
        this.f13857k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21473k4(C5047to c5047to) {
        return m21559k4((C5061vw) c5047to) && C14067j2.m66728k4(this.f13857k4, c5047to.f13857k4) && C14067j2.m66728k4(this.f13859x1, c5047to.f13859x1) && C14067j2.m66728k4(this.f13858kk, c5047to.f13858kk);
    }
}
