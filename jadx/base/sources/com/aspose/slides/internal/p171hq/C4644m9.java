package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C4644m9 extends AbstractC4671x1 {

    /* JADX INFO: renamed from: k4 */
    private C4656t6 f12952k4;

    /* JADX INFO: renamed from: x1 */
    private byte[][] f12953x1;

    /* JADX INFO: renamed from: du */
    public final byte[][] m19237du() {
        return this.f12953x1;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4644m9.class) && m19236k4((C4644m9) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        int iMo19017h4 = this.f12952k4 != null ? m19240to().mo19017h4() : 0;
        byte[][] bArr = this.f12953x1;
        return bArr != null ? iMo19017h4 + bArr.length : iMo19017h4;
    }

    public int hashCode() {
        C4656t6 c4656t6 = this.f12952k4;
        int iHashCode = (c4656t6 != null ? c4656t6.hashCode() : 0) * 397;
        byte[][] bArr = this.f12953x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67210k4((Object) bArr, 1, true).hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo19122k4() {
        throw new C6490k4("Use EmfPlusBitmap.GetBitmap() instead of this.");
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: kk */
    public byte[] mo19127kk() {
        throw new NotSupportedException();
    }

    /* JADX INFO: renamed from: to */
    public final C4656t6 m19240to() {
        return this.f12952k4;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC6888dy mo19130x1() {
        return new C6895to(mo19122k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19238k4(C4656t6 c4656t6) {
        this.f12952k4 = c4656t6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19239k4(byte[][] bArr) {
        this.f12953x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19236k4(C4644m9 c4644m9) {
        return C14067j2.m66728k4(this.f12952k4, c4644m9.f12952k4) && C12530dy.m58334k4(this.f12953x1, c4644m9.f12953x1);
    }
}
