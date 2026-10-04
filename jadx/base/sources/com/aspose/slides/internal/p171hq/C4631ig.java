package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10189kp;
import com.aspose.slides.internal.p396sc.C10209x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ig */
/* JADX INFO: loaded from: classes.dex */
public final class C4631ig extends AbstractC4638kk {

    /* JADX INFO: renamed from: k4 */
    private long f12910k4;

    /* JADX INFO: renamed from: kk */
    private C4628gk f12911kk;

    /* JADX INFO: renamed from: x1 */
    private long f12912x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4631ig.class) && m19140k4((C4631ig) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12911kk.mo19017h4() + 8;
    }

    public int hashCode() {
        int i = ((((int) this.f12910k4) * 397) ^ ((int) this.f12912x1)) * 397;
        C4628gk c4628gk = this.f12911kk;
        return i ^ (c4628gk != null ? c4628gk.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19141k4() {
        return this.f12910k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4628gk m19144kk() {
        return this.f12911kk;
    }

    public String toString() {
        return C14113y2.m67402k4("BrushDataFlags: {0}, WrapMode: {1}, OptionalData: [{2}]", C14042ak.m66410k4(C10209x1.class, this.f12910k4), C14042ak.m66410k4(C10189kp.class, this.f12912x1), this.f12911kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19145x1() {
        return this.f12912x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19142k4(long j) {
        this.f12910k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19146x1(long j) {
        this.f12912x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19143k4(C4628gk c4628gk) {
        this.f12911kk = c4628gk;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19140k4(C4631ig c4631ig) {
        return this.f12910k4 == c4631ig.f12910k4 && this.f12912x1 == c4631ig.f12912x1 && C14067j2.m66728k4(this.f12911kk, c4631ig.f12911kk);
    }
}
