package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.t6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9707t6 extends AbstractC9664jw {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35098k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35099kk;

    /* JADX INFO: renamed from: x1 */
    private long f35100x1;

    public C9707t6(C9723vw c9723vw) {
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
        return m47663k4((C9707t6) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35098k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35100x1)) * 397;
        byte[] bArr = this.f35099kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47659k4() {
        return this.f35098k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m47664kk() {
        return this.f35099kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47665x1() {
        return this.f35100x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47660k4(long j) {
        this.f35100x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47661k4(C12350uz c12350uz) {
        this.f35098k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47662k4(byte[] bArr) {
        this.f35099kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47663k4(C9707t6 c9707t6) {
        return m47765k4((C9723vw) c9707t6) && C14067j2.m66728k4(this.f35098k4, c9707t6.f35098k4) && this.f35100x1 == c9707t6.f35100x1 && C12530dy.m58330k4(this.f35099kk, c9707t6.f35099kk);
    }
}
