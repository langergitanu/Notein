package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12514ne;
import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.m2 */
/* JADX INFO: loaded from: classes.dex */
public class C5012m2 extends AbstractC4953ak {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13750k4;

    /* JADX INFO: renamed from: kk */
    private C12514ne f13751kk;

    /* JADX INFO: renamed from: x1 */
    private C12514ne f13752x1;

    public C5012m2(C5061vw c5061vw) {
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
        return m21252k4((C5012m2) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13750k4;
        int iHashCode2 = (iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397;
        C12514ne c12514ne = this.f13752x1;
        int iHashCode3 = (iHashCode2 ^ (c12514ne != null ? c12514ne.hashCode() : 0)) * 397;
        C12514ne c12514ne2 = this.f13751kk;
        return iHashCode3 ^ (c12514ne2 != null ? c12514ne2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21249k4() {
        return this.f13750k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12514ne m21253kk() {
        return this.f13751kk;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Box: {1}, Start: {2}, End: {3}", super.toString(), m21249k4(), m21254x1(), m21253kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12514ne m21254x1() {
        return this.f13752x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21250k4(C12514ne c12514ne) {
        this.f13752x1 = c12514ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21255x1(C12514ne c12514ne) {
        this.f13751kk = c12514ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21251k4(C12521uz c12521uz) {
        this.f13750k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21252k4(C5012m2 c5012m2) {
        return m21559k4((C5061vw) c5012m2) && C14067j2.m66728k4(this.f13750k4, c5012m2.f13750k4) && C14067j2.m66728k4(this.f13752x1, c5012m2.f13752x1) && C14067j2.m66728k4(this.f13751kk, c5012m2.f13751kk);
    }
}
