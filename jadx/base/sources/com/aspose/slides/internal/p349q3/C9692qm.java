package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.qm */
/* JADX INFO: loaded from: classes4.dex */
public class C9692qm extends AbstractC9628c6 {

    /* JADX INFO: renamed from: k4 */
    private long f35061k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35062x1;

    public C9692qm(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9628c6, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47580k4((C9692qm) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9628c6, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35061k4)) * 397;
        byte[] bArr = this.f35062x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47577k4() {
        return this.f35061k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m47581x1() {
        return this.f35062x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47578k4(long j) {
        this.f35061k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47579k4(byte[] bArr) {
        this.f35062x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47580k4(C9692qm c9692qm) {
        return m47019k4((AbstractC9628c6) c9692qm) && this.f35061k4 == c9692qm.f35061k4 && C12530dy.m58330k4(this.f35062x1, c9692qm.f35062x1);
    }
}
