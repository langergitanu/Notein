package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6284u4;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.y2 */
/* JADX INFO: loaded from: classes4.dex */
public class C9737y2 extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35184k4;

    /* JADX INFO: renamed from: kk */
    private C6284u4 f35185kk;

    /* JADX INFO: renamed from: x1 */
    private long f35186x1;

    public C9737y2(C9723vw c9723vw) {
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
        return m47857k4((C9737y2) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35184k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35186x1)) * 397;
        C6284u4 c6284u4 = this.f35185kk;
        return iHashCode2 ^ (c6284u4 != null ? c6284u4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47853k4() {
        return this.f35184k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C6284u4 m47858kk() {
        return this.f35185kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47859x1() {
        return this.f35186x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47854k4(long j) {
        this.f35186x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47855k4(C6284u4 c6284u4) {
        this.f35185kk = c6284u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47856k4(C12350uz c12350uz) {
        this.f35184k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47857k4(C9737y2 c9737y2) {
        return m47765k4((C9723vw) c9737y2) && C14067j2.m66728k4(this.f35184k4, c9737y2.f35184k4) && this.f35186x1 == c9737y2.f35186x1 && this.f35185kk.equals(c9737y2.f35185kk);
    }
}
