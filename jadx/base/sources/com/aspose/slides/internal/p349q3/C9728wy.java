package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C9728wy extends AbstractC9628c6 {

    /* JADX INFO: renamed from: k4 */
    private long f35158k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35159x1;

    public C9728wy(C9723vw c9723vw) {
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
        return m47800k4((C9728wy) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9628c6, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35158k4)) * 397;
        byte[] bArr = this.f35159x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47797k4() {
        return this.f35158k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m47801x1() {
        return this.f35159x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47798k4(long j) {
        this.f35158k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47799k4(byte[] bArr) {
        this.f35159x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47800k4(C9728wy c9728wy) {
        return m47019k4((AbstractC9628c6) c9728wy) && this.f35158k4 == c9728wy.f35158k4 && C12530dy.m58330k4(this.f35159x1, c9728wy.f35159x1);
    }
}
