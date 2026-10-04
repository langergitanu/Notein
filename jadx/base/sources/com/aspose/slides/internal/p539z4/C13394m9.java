package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p436u8.C11289k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.m9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13394m9 extends AbstractC13421x1 {

    /* JADX INFO: renamed from: k4 */
    private C13406t6 f44805k4;

    /* JADX INFO: renamed from: x1 */
    private byte[][] f44806x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13394m9.class) && m62229k4((C13394m9) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        int iMo62023h4 = this.f44805k4 != null ? m62232kk().mo62023h4() : 0;
        byte[][] bArr = this.f44806x1;
        return bArr != null ? iMo62023h4 + bArr.length : iMo62023h4;
    }

    public int hashCode() {
        C13406t6 c13406t6 = this.f44805k4;
        int iHashCode = (c13406t6 != null ? c13406t6.hashCode() : 0) * 397;
        byte[][] bArr = this.f44806x1;
        return iHashCode ^ (bArr != null ? AbstractC14092to.m67210k4((Object) bArr, 1, true).hashCode() : 0);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo62121k4() {
        throw new C12537k4("Use EmfPlusBitmap.GetBitmap() instead of this.");
    }

    /* JADX INFO: renamed from: kk */
    public final C13406t6 m62232kk() {
        return this.f44805k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte[][] m62233to() {
        return this.f44806x1;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC11290x1 mo62129x1() {
        return new C11289k4(mo62121k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62230k4(C13406t6 c13406t6) {
        this.f44805k4 = c13406t6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62231k4(byte[][] bArr) {
        this.f44806x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62229k4(C13394m9 c13394m9) {
        return C14067j2.m66728k4(this.f44805k4, c13394m9.f44805k4) && C3022m9.m12723k4(this.f44806x1, c13394m9.f44806x1);
    }
}
