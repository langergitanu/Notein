package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5006kk extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13734k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne f13735kk;

    /* JADX INFO: renamed from: x1 */
    private C12514ne f13736x1;

    public C5006kk(C5061vw c5061vw) {
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
        return m21224k4((C5006kk) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13734k4;
        int iHashCode2 = (iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397;
        C12514ne c12514ne = this.f13736x1;
        int iHashCode3 = (iHashCode2 ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12514ne c12514ne2 = this.f13735kk;
        return iHashCode3 ^ (c12514ne2 != null ? c12514ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21221k4() {
        return this.f13734k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12514ne m21225kk() {
        return this.f13735kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne m21226x1() {
        return this.f13736x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21222k4(C12514ne c12514ne) {
        this.f13736x1 = c12514ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21227x1(C12514ne c12514ne) {
        this.f13735kk = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21223k4(C12521uz c12521uz) {
        this.f13734k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21224k4(C5006kk c5006kk) {
        return m21559k4((C5061vw) c5006kk) && C14067j2.m66728k4(this.f13734k4, c5006kk.f13734k4) && C14067j2.m66728k4(this.f13736x1, c5006kk.f13736x1) && C14067j2.m66728k4(this.f13735kk, c5006kk.f13735kk);
    }
}
