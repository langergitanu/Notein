package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p041bm.AbstractC1703k4;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C9670ks extends C9658ix {

    /* JADX INFO: renamed from: k4 */
    private long f34985k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC1703k4[] f34986kk;

    /* JADX INFO: renamed from: x1 */
    private long f34987x1;

    public C9670ks(C9658ix c9658ix) {
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
        return m47416k4((C9670ks) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 397) ^ ((int) this.f34985k4)) * 397) ^ ((int) this.f34987x1)) * 397;
        AbstractC1703k4[] abstractC1703k4Arr = this.f34986kk;
        return iHashCode ^ (abstractC1703k4Arr != null ? AbstractC14092to.m67208k4((Object) abstractC1703k4Arr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47414k4() {
        return this.f34985k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47417x1() {
        return this.f34987x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47415k4(long j) {
        this.f34985k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47418x1(long j) {
        this.f34987x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47416k4(C9670ks c9670ks) {
        return m47291k4((C9658ix) c9670ks) && this.f34985k4 == c9670ks.f34985k4 && this.f34987x1 == c9670ks.f34987x1 && C12530dy.m58334k4(this.f34986kk, c9670ks.f34986kk);
    }
}
