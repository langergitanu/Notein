package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.vj */
/* JADX INFO: loaded from: classes.dex */
public class C5059vj extends AbstractC4953ak {

    /* JADX INFO: renamed from: du */
    private C5037rs f13889du;

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13890k4;

    /* JADX INFO: renamed from: kk */
    private long f13891kk;

    /* JADX INFO: renamed from: to */
    private long f13892to;

    /* JADX INFO: renamed from: x1 */
    private long f13893x1;

    public C5059vj(C5061vw c5061vw) {
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
        return m21546k4((C5059vj) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C5037rs m21541h4() {
        return this.f13889du;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13890k4;
        int iHashCode2 = (((((((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13893x1)) * 397) ^ ((int) this.f13891kk)) * 397) ^ ((int) this.f13892to)) * 397;
        C5037rs c5037rs = this.f13889du;
        return iHashCode2 ^ (c5037rs != null ? c5037rs.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12521uz m21542k4() {
        return this.f13890k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m21547kk() {
        return this.f13891kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m21549to() {
        return this.f13892to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21550x1() {
        return this.f13893x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21543k4(long j) {
        this.f13893x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21548kk(long j) {
        this.f13892to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21551x1(long j) {
        this.f13891kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21544k4(C5037rs c5037rs) {
        this.f13889du = c5037rs;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21545k4(C12521uz c12521uz) {
        this.f13890k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21546k4(C5059vj c5059vj) {
        return m21559k4((C5061vw) c5059vj) && C14067j2.m66728k4(this.f13890k4, c5059vj.f13890k4) && this.f13893x1 == c5059vj.f13893x1 && this.f13891kk == c5059vj.f13891kk && this.f13892to == c5059vj.f13892to && C14067j2.m66728k4(this.f13889du, c5059vj.f13889du);
    }
}
