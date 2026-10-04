package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p396sc.C10197ss;
import com.aspose.slides.internal.p396sc.C10208wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.w6 */
/* JADX INFO: loaded from: classes.dex */
public class C4667w6 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private long f13039k4;

    /* JADX INFO: renamed from: kk */
    private float f13040kk;

    /* JADX INFO: renamed from: to */
    private C4647os f13041to;

    /* JADX INFO: renamed from: x1 */
    private int f13042x1;

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
        return m19438k4((C4667w6) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return m19440to().m19295kk(m19433k4()) + 12;
    }

    public int hashCode() {
        int i = ((((int) this.f13039k4) * 397) ^ this.f13042x1) * 397;
        C4647os c4647os = this.f13041to;
        return ((i ^ (c4647os != null ? c4647os.hashCode() : 0)) * 397) ^ C14064he.m66708k4(this.f13040kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19433k4() {
        return this.f13039k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m19439kk() {
        return this.f13040kk;
    }

    /* JADX INFO: renamed from: to */
    public final C4647os m19440to() {
        return this.f13041to;
    }

    public String toString() {
        return C14113y2.m67402k4("PenDataFlags: {0}, PenUnit: {1}, PenWidth: {2}, OptionalData: {3}", C14042ak.m66410k4(C10208wy.class, this.f13039k4), C14042ak.m66410k4(C10197ss.class, this.f13042x1), Float.valueOf(this.f13040kk), this.f13041to);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19441x1() {
        return this.f13042x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19434k4(float f) {
        this.f13040kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19435k4(int i) {
        this.f13042x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19436k4(long j) {
        this.f13039k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19437k4(C4647os c4647os) {
        this.f13041to = c4647os;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19438k4(C4667w6 c4667w6) {
        return this.f13039k4 == c4667w6.f13039k4 && this.f13042x1 == c4667w6.f13042x1 && C14067j2.m66728k4(this.f13041to, c4667w6.f13041to) && C14064he.m66718x1(this.f13040kk, c4667w6.f13040kk);
    }
}
