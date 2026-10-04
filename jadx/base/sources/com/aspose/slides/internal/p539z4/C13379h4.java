package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1468ak;
import com.aspose.slides.internal.p026an.C1485k4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p436u8.AbstractC11290x1;
import com.aspose.slides.internal.p436u8.C11289k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.h4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13379h4 extends AbstractC13421x1 {

    /* JADX INFO: renamed from: du */
    private long f44754du;

    /* JADX INFO: renamed from: h4 */
    private int f44755h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13421x1 f44756k4;

    /* JADX INFO: renamed from: kk */
    private long f44757kk;

    /* JADX INFO: renamed from: to */
    private int f44758to;

    /* JADX INFO: renamed from: x1 */
    private int f44759x1;

    /* JADX INFO: renamed from: c5 */
    public final int m62118c5() {
        return this.f44755h4;
    }

    /* JADX INFO: renamed from: du */
    public final long m62119du() {
        return this.f44757kk;
    }

    /* JADX INFO: renamed from: dy */
    public final long m62120dy() {
        return this.f44754du;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13379h4.class) && m62117k4((C13379h4) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44756k4.mo62023h4() + 20;
    }

    public int hashCode() {
        AbstractC13421x1 abstractC13421x1 = this.f44756k4;
        return ((((((((((abstractC13421x1 != null ? abstractC13421x1.hashCode() : 0) * 397) ^ this.f44759x1) * 397) ^ ((int) this.f44757kk)) * 397) ^ this.f44758to) * 397) ^ ((int) this.f44754du)) * 397) ^ this.f44755h4;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo62121k4() {
        if (m62120dy() == 1) {
            return m62125kk().mo62121k4();
        }
        C13394m9 c13394m9 = (C13394m9) C7019kk.m27452k4((Object) m62125kk(), C13394m9.class);
        int iM62119du = (int) m62119du();
        C12009k4 c12009k4 = new C12009k4(m62118c5(), m62128to(), iM62119du);
        if ((iM62119du & 65536) == 65536) {
            C3988to c3988toMo15749c5 = c12009k4.mo15749c5();
            for (int i = 0; i < (c13394m9.m62232kk().m62336k4() & 4294967295L); i++) {
                c13394m9.m62232kk().m62340x1()[i].m62172du().CloneTo(c3988toMo15749c5.m15746k4()[i]);
            }
            c12009k4.m56337k4(c3988toMo15749c5);
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, m62118c5(), m62128to()), 2, iM62119du);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int i2 = 0;
        while (i2 < c13394m9.m62233to().length) {
            C3914k4.m15621k4(c13394m9.m62233to()[i2], 0, c14112xwM15721to, c13394m9.m62233to()[i2].length);
            C14112xw c14112xw = new C14112xw(c14112xwM15721to.m67357x1() + ((long) c13394m9.m62233to()[i2].length));
            i2++;
            c14112xwM15721to = c14112xw;
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return c12009k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13421x1 m62125kk() {
        return this.f44756k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m62127m9() {
        return this.f44758to;
    }

    /* JADX INFO: renamed from: to */
    public final int m62128to() {
        return this.f44759x1;
    }

    public String toString() {
        return C14113y2.m67402k4("[BitmapData: {0}, Height: {1}, PixelFormat: {2}, Stride: {3}, Type: {4}, Width: {5}]", this.f44756k4, Integer.valueOf(this.f44759x1), C14042ak.m66410k4(C1468ak.class, this.f44757kk), Integer.valueOf(this.f44758to), C14042ak.m66410k4(C1485k4.class, this.f44754du), Integer.valueOf(this.f44755h4));
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13421x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC11290x1 mo62129x1() {
        return new C11289k4(mo62121k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62122k4(int i) {
        this.f44759x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62126kk(int i) {
        this.f44755h4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62130x1(int i) {
        this.f44758to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62123k4(long j) {
        this.f44757kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62131x1(long j) {
        this.f44754du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62124k4(AbstractC13421x1 abstractC13421x1) {
        this.f44756k4 = abstractC13421x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62117k4(C13379h4 c13379h4) {
        return C14067j2.m66728k4(this.f44756k4, c13379h4.f44756k4) && this.f44759x1 == c13379h4.f44759x1 && this.f44757kk == c13379h4.f44757kk && this.f44758to == c13379h4.f44758to && this.f44754du == c13379h4.f44754du && this.f44755h4 == c13379h4.f44755h4;
    }
}
