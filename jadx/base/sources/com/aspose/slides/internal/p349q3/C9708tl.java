package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6267ar;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.tl */
/* JADX INFO: loaded from: classes4.dex */
public class C9708tl extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f35101k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f35102kk;

    /* JADX INFO: renamed from: x1 */
    private C6267ar[] f35103x1;

    public C9708tl(C9723vw c9723vw) {
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
        return m47670k4((C9708tl) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f35101k4)) * 397;
        C6267ar[] c6267arArr = this.f35103x1;
        int iHashCode2 = (iHashCode ^ (c6267arArr != null ? AbstractC14092to.m67208k4((Object) c6267arArr).hashCode() : 0)) * 397;
        byte[] bArr = this.f35102kk;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47666k4() {
        return this.f35101k4;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m47671kk() {
        return this.f35102kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6267ar[] m47672x1() {
        return this.f35103x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47667k4(long j) {
        this.f35101k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47668k4(byte[] bArr) {
        this.f35102kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47669k4(C6267ar[] c6267arArr) {
        this.f35103x1 = c6267arArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47670k4(C9708tl c9708tl) {
        return m47765k4((C9723vw) c9708tl) && this.f35101k4 == c9708tl.f35101k4 && C12530dy.m58334k4(this.f35103x1, c9708tl.f35103x1) && C12530dy.m58330k4(this.f35102kk, c9708tl.f35102kk);
    }
}
