package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C9647fa extends C9658ix {

    /* JADX INFO: renamed from: k4 */
    private byte[] f34887k4;

    public C9647fa(C9658ix c9658ix) {
        super(c9658ix);
        m47292to(c9658ix.m47290dy());
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47199k4((C9647fa) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        byte[] bArr = this.f34887k4;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47198k4(byte[] bArr) {
        this.f34887k4 = bArr;
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, PrivateData: {1}", super.toString(), this.f34887k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47199k4(C9647fa c9647fa) {
        return m47291k4((C9658ix) c9647fa) && C12530dy.m58330k4(this.f34887k4, c9647fa.f34887k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m47200k4() {
        return this.f34887k4;
    }
}
