package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12505dy;
import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.g8 */
/* JADX INFO: loaded from: classes.dex */
public class C4986g8 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12514ne f13641k4;

    /* JADX INFO: renamed from: kk */
    private long f13642kk;

    /* JADX INFO: renamed from: x1 */
    private C12505dy f13643x1;

    public C4986g8(C5061vw c5061vw) {
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
        return m21028k4((C4986g8) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12514ne c12514ne = this.f13641k4;
        int iHashCode2 = (iHashCode ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12505dy c12505dy = this.f13643x1;
        return ((iHashCode2 ^ (c12505dy != null ? c12505dy.hashCode() : 0)) * 397) ^ ((int) this.f13642kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12514ne m21024k4() {
        return this.f13641k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21029kk() {
        return this.f13642kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12505dy m21030x1() {
        return this.f13643x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21025k4(long j) {
        this.f13642kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21026k4(C12505dy c12505dy) {
        this.f13643x1 = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21027k4(C12514ne c12514ne) {
        this.f13641k4 = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21028k4(C4986g8 c4986g8) {
        return m21559k4((C5061vw) c4986g8) && C14067j2.m66728k4(this.f13641k4, c4986g8.f13641k4) && C14067j2.m66728k4(this.f13643x1, c4986g8.f13643x1) && this.f13642kk == c4986g8.f13642kk;
    }
}
