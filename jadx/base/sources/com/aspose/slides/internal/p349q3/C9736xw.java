package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.xw */
/* JADX INFO: loaded from: classes4.dex */
public class C9736xw extends AbstractC9664jw {

    /* JADX INFO: renamed from: k4 */
    private long f35182k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35183x1;

    public C9736xw(C9723vw c9723vw) {
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
        return m47851k4((C9736xw) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35182k4)) * 397;
        byte[] bArr = this.f35183x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47848k4() {
        return this.f35182k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m47852x1() {
        return this.f35183x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47849k4(long j) {
        this.f35182k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47850k4(byte[] bArr) {
        this.f35183x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47851k4(C9736xw c9736xw) {
        return m47765k4((C9723vw) c9736xw) && this.f35182k4 == c9736xw.f35182k4 && C12530dy.m58330k4(this.f35183x1, c9736xw.f35183x1);
    }
}
