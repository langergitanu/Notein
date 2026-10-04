package com.aspose.slides.internal.p349q3;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p377r9.C9986ks;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9714u4 extends C9681ne {

    /* JADX INFO: renamed from: du */
    private long f35113du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC12536x1 f35114h4;

    /* JADX INFO: renamed from: k4 */
    private int f35115k4;

    /* JADX INFO: renamed from: kk */
    private long f35116kk;

    /* JADX INFO: renamed from: to */
    private int f35117to;

    /* JADX INFO: renamed from: x1 */
    private short f35118x1;

    public C9714u4(C9681ne c9681ne) {
        super(c9681ne);
        m47499x1(c9681ne.m47495h4());
        m47497kk(c9681ne.m47498m9());
    }

    /* JADX INFO: renamed from: c5 */
    public final long m47695c5() {
        return this.f35113du;
    }

    /* JADX INFO: renamed from: du */
    public final void m47696du(long j) {
        this.f35113du = j;
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47703k4((C9714u4) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((((super.hashCode() * 397) ^ (this.f35115k4 & 65535)) * 397) ^ C14088s7.m67172k4(this.f35118x1)) * 397) ^ ((int) this.f35116kk)) * 397) ^ this.f35117to) * 397) ^ ((int) this.f35113du)) * 397;
        AbstractC12536x1 abstractC12536x1 = this.f35114h4;
        return iHashCode ^ (abstractC12536x1 != null ? abstractC12536x1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC12536x1 m47697jd() {
        return this.f35114h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47698k4() {
        return this.f35115k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47704kk() {
        return this.f35116kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m47705to() {
        return this.f35117to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9681ne, com.aspose.slides.internal.p349q3.C9658ix, com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Version: {1}, Reserved: {2}, Checksum: {3}, Flags: {4}, WinMetafileSize: {5}, WinMetafile: {6}", super.toString(), C14042ak.m66410k4(C9986ks.class, m47698k4()), Short.valueOf(m47706x1()), Long.valueOf(m47704kk()), Integer.valueOf(m47705to()), Long.valueOf(m47695c5()), m47697jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final short m47706x1() {
        return this.f35118x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47699k4(int i) {
        this.f35115k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47707x1(int i) {
        if (i != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f35117to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47700k4(long j) {
        this.f35116kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47701k4(AbstractC12536x1 abstractC12536x1) {
        this.f35114h4 = abstractC12536x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47702k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f35118x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47703k4(C9714u4 c9714u4) {
        return m47496k4((C9681ne) c9714u4) && this.f35115k4 == c9714u4.f35115k4 && this.f35118x1 == c9714u4.f35118x1 && this.f35116kk == c9714u4.f35116kk && this.f35117to == c9714u4.f35117to && this.f35113du == c9714u4.f35113du && C14067j2.m66728k4(this.f35114h4, c9714u4.f35114h4);
    }
}
