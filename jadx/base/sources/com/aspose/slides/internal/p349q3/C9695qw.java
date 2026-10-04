package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.qw */
/* JADX INFO: loaded from: classes4.dex */
public class C9695qw extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f35067k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35068kk;

    /* JADX INFO: renamed from: x1 */
    private long f35069x1;

    public C9695qw(C9723vw c9723vw) {
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
        return m47596k4((C9695qw) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f35067k4;
        int iHashCode2 = (((iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397) ^ ((int) this.f35069x1)) * 397;
        byte[] bArr = this.f35068kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m47592k4() {
        return this.f35067k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m47597kk() {
        return this.f35068kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47598x1() {
        return this.f35069x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47593k4(long j) {
        this.f35069x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47594k4(C12350uz c12350uz) {
        this.f35067k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47595k4(byte[] bArr) {
        this.f35068kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47596k4(C9695qw c9695qw) {
        return m47765k4((C9723vw) c9695qw) && C14067j2.m66728k4(this.f35067k4, c9695qw.f35067k4) && this.f35069x1 == c9695qw.f35069x1 && C12530dy.m58330k4(this.f35068kk, c9695qw.f35068kk);
    }
}
