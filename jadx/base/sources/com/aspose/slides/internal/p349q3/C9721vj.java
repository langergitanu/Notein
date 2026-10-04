package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.vj */
/* JADX INFO: loaded from: classes4.dex */
public class C9721vj extends AbstractC9615ak {

    /* JADX INFO: renamed from: du */
    private C9699rs f35136du;

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35137k4;

    /* JADX INFO: renamed from: kk */
    private long f35138kk;

    /* JADX INFO: renamed from: to */
    private long f35139to;

    /* JADX INFO: renamed from: x1 */
    private long f35140x1;

    public C9721vj(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47752k4((C9721vj) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C9699rs m47747h4() {
        return this.f35136du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35137k4;
        int iHashCode2 = (((((((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35140x1)) * 397) ^ ((int) this.f35138kk)) * 397) ^ ((int) this.f35139to)) * 397;
        C9699rs c9699rs = this.f35136du;
        return iHashCode2 ^ (c9699rs != null ? c9699rs.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47748k4() {
        return this.f35137k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47753kk() {
        return this.f35138kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m47755to() {
        return this.f35139to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47756x1() {
        return this.f35140x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47749k4(long j) {
        this.f35140x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47754kk(long j) {
        this.f35139to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47757x1(long j) {
        this.f35138kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47750k4(C9699rs c9699rs) {
        this.f35136du = c9699rs;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47751k4(C12350uz c12350uz) {
        this.f35137k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47752k4(C9721vj c9721vj) {
        return m47765k4((C9723vw) c9721vj) && C14067j2.m66728k4(this.f35137k4, c9721vj.f35137k4) && this.f35140x1 == c9721vj.f35140x1 && this.f35138kk == c9721vj.f35138kk && this.f35139to == c9721vj.f35139to && C14067j2.m66728k4(this.f35136du, c9721vj.f35136du);
    }
}
