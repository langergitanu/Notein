package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.AbstractC4619du;
import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6086up extends AbstractC6084u4 {

    /* JADX INFO: renamed from: k4 */
    private long f17209k4;

    /* JADX INFO: renamed from: kk */
    private C4616ca f17210kk;

    /* JADX INFO: renamed from: to */
    private int f17211to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4619du f17212x1;

    public C6086up(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4619du m24644c5() {
        return this.f17212x1;
    }

    /* JADX INFO: renamed from: ck */
    public final int m24645ck() {
        return this.f17211to;
    }

    /* JADX INFO: renamed from: dy */
    public final long m24646dy() {
        return this.f17209k4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24651k4((C6086up) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        int i = ((int) this.f17209k4) * 397;
        AbstractC4619du abstractC4619du = this.f17212x1;
        int iHashCode = (i ^ (abstractC4619du != null ? abstractC4619du.hashCode() : 0)) * 397;
        C4616ca c4616ca = this.f17210kk;
        return ((iHashCode ^ (c4616ca != null ? c4616ca.hashCode() : 0)) * 397) ^ this.f17211to;
    }

    /* JADX INFO: renamed from: jd */
    public final C4616ca m24647jd() {
        return this.f17210kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24648k4(long j) {
        this.f17209k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m24652kk(int i) {
        this.f17211to = i;
    }

    /* JADX INFO: renamed from: to */
    public final byte m24654to() {
        return m24447wl();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Compressed: {1}, ObjectId: {2}, ImageAttributesId: {3}, RectData: {4}, SrcRect: {5}, SrcUnit: {6}", super.toString(), Boolean.valueOf(m24653kk()), Byte.valueOf(m24654to()), Long.valueOf(m24646dy()), m24644c5(), m24647jd(), C14042ak.m66410k4(C10197ss.class, m24645ck()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24649k4(C4616ca c4616ca) {
        this.f17210kk = c4616ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m24653kk() {
        return m24433h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24650k4(AbstractC4619du abstractC4619du) {
        this.f17212x1 = abstractC4619du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24651k4(C6086up c6086up) {
        return this.f17209k4 == c6086up.f17209k4 && C14067j2.m66728k4(this.f17212x1, c6086up.f17212x1) && C14067j2.m66728k4(this.f17210kk, c6086up.f17210kk) && this.f17211to == c6086up.f17211to;
    }
}
