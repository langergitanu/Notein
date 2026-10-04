package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p129fe.C3988to;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10170ak;
import com.aspose.slides.internal.p396sc.C10187k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4629h4 extends AbstractC4671x1 {

    /* JADX INFO: renamed from: du */
    private long f12901du;

    /* JADX INFO: renamed from: h4 */
    private int f12902h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4671x1 f12903k4;

    /* JADX INFO: renamed from: kk */
    private long f12904kk;

    /* JADX INFO: renamed from: to */
    private int f12905to;

    /* JADX INFO: renamed from: x1 */
    private int f12906x1;

    /* JADX INFO: renamed from: c5 */
    public final long m19118c5() {
        return this.f12901du;
    }

    /* JADX INFO: renamed from: du */
    public final int m19119du() {
        return this.f12906x1;
    }

    /* JADX INFO: renamed from: dy */
    public final int m19120dy() {
        return this.f12905to;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4629h4.class) && m19117k4((C4629h4) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12903k4.mo19017h4() + 20;
    }

    public int hashCode() {
        AbstractC4671x1 abstractC4671x1 = this.f12903k4;
        return ((((((((((abstractC4671x1 != null ? abstractC4671x1.hashCode() : 0) * 397) ^ this.f12906x1) * 397) ^ ((int) this.f12904kk)) * 397) ^ this.f12905to) * 397) ^ ((int) this.f12901du)) * 397) ^ this.f12902h4;
    }

    /* JADX INFO: renamed from: jd */
    public final int m19121jd() {
        return this.f12902h4;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: k4 */
    public C12009k4 mo19122k4() {
        if (m19118c5() == 1) {
            return m19129to().mo19122k4();
        }
        C4644m9 c4644m9 = (C4644m9) C7019kk.m27452k4((Object) m19129to(), C4644m9.class);
        int iM19128m9 = (int) m19128m9();
        C12009k4 c12009k4 = new C12009k4(m19121jd(), m19119du(), iM19128m9);
        if ((iM19128m9 & 65536) == 65536) {
            C3988to c3988toMo15749c5 = c12009k4.mo15749c5();
            for (int i = 0; i < (c4644m9.m19240to().m19352x1() & 4294967295L); i++) {
                c4644m9.m19240to().m19351kk()[i].m19174du().CloneTo(c3988toMo15749c5.m15746k4()[i]);
            }
            c12009k4.m56337k4(c3988toMo15749c5);
        }
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, m19121jd(), m19119du()), 2, iM19128m9);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int i2 = 0;
        while (i2 < c4644m9.m19237du().length) {
            C3914k4.m15621k4(c4644m9.m19237du()[i2], 0, c14112xwM15721to, c4644m9.m19237du()[i2].length);
            C14112xw c14112xw = new C14112xw(c14112xwM15721to.m67357x1() + ((long) c4644m9.m19237du()[i2].length));
            i2++;
            c14112xwM15721to = c14112xw;
        }
        c12009k4.m56605k4(c3983k4M56597k4);
        return c12009k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19126kk(int i) {
        this.f12902h4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m19128m9() {
        return this.f12904kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC4671x1 m19129to() {
        return this.f12903k4;
    }

    public String toString() {
        return C14113y2.m67402k4("[BitmapData: {0}, Height: {1}, PixelFormat: {2}, Stride: {3}, Type: {4}, Width: {5}]", this.f12903k4, Integer.valueOf(this.f12906x1), C14042ak.m66410k4(C10170ak.class, this.f12904kk), Integer.valueOf(this.f12905to), C14042ak.m66410k4(C10187k4.class, this.f12901du), Integer.valueOf(this.f12902h4));
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: x1 */
    public AbstractC6888dy mo19130x1() {
        return new C6895to(mo19122k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19123k4(int i) {
        this.f12906x1 = i;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4671x1
    /* JADX INFO: renamed from: kk */
    public byte[] mo19127kk() {
        return m19129to().mo19127kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19131x1(int i) {
        this.f12905to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19124k4(long j) {
        this.f12904kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19132x1(long j) {
        this.f12901du = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19125k4(AbstractC4671x1 abstractC4671x1) {
        this.f12903k4 = abstractC4671x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19117k4(C4629h4 c4629h4) {
        return C14067j2.m66728k4(this.f12903k4, c4629h4.f12903k4) && this.f12906x1 == c4629h4.f12906x1 && this.f12904kk == c4629h4.f12904kk && this.f12905to == c4629h4.f12905to && this.f12901du == c4629h4.f12901du && this.f12902h4 == c4629h4.f12902h4;
    }
}
