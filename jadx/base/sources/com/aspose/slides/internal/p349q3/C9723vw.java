package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p124f7.C3878yj;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.vw */
/* JADX INFO: loaded from: classes4.dex */
public class C9723vw extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private C3180k4 f35142k4;

    /* JADX INFO: renamed from: kk */
    private int f35143kk;

    /* JADX INFO: renamed from: to */
    private long f35144to;

    /* JADX INFO: renamed from: x1 */
    private long f35145x1;

    public C9723vw() {
    }

    /* JADX INFO: renamed from: bv */
    public final C3180k4 m47761bv() {
        return this.f35142k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m47762c5(int i) {
        this.f35143kk = i;
    }

    /* JADX INFO: renamed from: ck */
    public final void m47763ck(long j) {
        this.f35145x1 = j;
    }

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
        return m47765k4((C9723vw) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final void m47764fa(long j) {
        this.f35144to = j;
    }

    public int hashCode() {
        return (((int) this.f35145x1) * 397) ^ this.f35143kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47765k4(C9723vw c9723vw) {
        return this.f35145x1 == c9723vw.f35145x1 && this.f35143kk == c9723vw.f35143kk && this.f35144to == c9723vw.f35144to;
    }

    /* JADX INFO: renamed from: lr */
    public final int m47766lr() {
        return this.f35143kk;
    }

    public String toString() {
        return C14113y2.m67402k4("Type: {0}, Size: {1}, Offset: {2}", C14042ak.m66410k4(C3878yj.class, this.f35145x1), Integer.valueOf(this.f35143kk), Long.valueOf(this.f35144to));
    }

    /* JADX INFO: renamed from: v4 */
    public final long m47767v4() {
        return this.f35145x1;
    }

    /* JADX INFO: renamed from: yd */
    public final long m47768yd() {
        return this.f35144to;
    }

    public C9723vw(C3180k4 c3180k4) {
        this.f35142k4 = c3180k4;
    }

    public C9723vw(C9723vw c9723vw) {
        this.f35142k4 = c9723vw.f35142k4;
        m47762c5(c9723vw.m47766lr());
        m47763ck(c9723vw.m47767v4());
        m47764fa(c9723vw.f35144to);
    }
}
