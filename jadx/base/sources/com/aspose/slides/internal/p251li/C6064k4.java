package com.aspose.slides.internal.p251li;

import com.aspose.slides.internal.p171hq.C4616ca;
import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6064k4 extends AbstractC6048ca {

    /* JADX INFO: renamed from: k4 */
    private C4616ca f17184k4;

    /* JADX INFO: renamed from: kk */
    private long f17185kk;

    /* JADX INFO: renamed from: x1 */
    private C4616ca f17186x1;

    public C6064k4() {
        m24449x1((short) 16423);
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
        return m24551k4((C6064k4) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return m24552kk().mo19017h4() + m24554x1().mo19017h4() + 4;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return ((((m24554x1() != null ? m24554x1().hashCode() : 0) * 397) ^ (m24552kk() != null ? m24552kk().hashCode() : 0)) * 397) ^ ((int) m24553to());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m24548k4() {
        return m24434ix() & 255;
    }

    /* JADX INFO: renamed from: kk */
    public final C4616ca m24552kk() {
        return this.f17186x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m24553to() {
        return this.f17185kk;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PageUnit: {1}, DestRect: {2}, SrcRect: {3}, StackIndex: {4}", super.toString(), C14042ak.m66410k4(C10197ss.class, m24548k4()), m24554x1(), m24552kk(), Long.valueOf(m24553to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final C4616ca m24554x1() {
        return this.f17184k4;
    }

    public C6064k4(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24549k4(long j) {
        this.f17185kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24555x1(C4616ca c4616ca) {
        this.f17186x1 = c4616ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24550k4(C4616ca c4616ca) {
        this.f17184k4 = c4616ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24551k4(C6064k4 c6064k4) {
        return C14067j2.m66728k4(m24554x1(), c6064k4.m24554x1()) && C14067j2.m66728k4(m24552kk(), c6064k4.m24552kk()) && m24553to() == c6064k4.m24553to();
    }
}
