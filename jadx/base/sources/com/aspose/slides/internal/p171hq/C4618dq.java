package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.dq */
/* JADX INFO: loaded from: classes.dex */
public final class C4618dq extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private float f12882k4;

    /* JADX INFO: renamed from: kk */
    private long f12883kk;

    /* JADX INFO: renamed from: x1 */
    private float f12884x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4618dq.class) && m19069k4((C4618dq) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 12;
    }

    public int hashCode() {
        return (((C14064he.m66708k4(this.f12882k4) * 397) ^ C14064he.m66708k4(this.f12884x1)) * 397) ^ ((int) this.f12883kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m19070k4() {
        return this.f12882k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m19073kk() {
        return this.f12883kk;
    }

    public String toString() {
        return C14113y2.m67402k4("FocusScaleX: {0}, FocusScaleY: {1}, FocusScaleCount: {2}", Float.valueOf(this.f12882k4), Float.valueOf(this.f12884x1), Long.valueOf(this.f12883kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m19074x1() {
        return this.f12884x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19071k4(float f) {
        this.f12882k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19075x1(float f) {
        this.f12884x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19072k4(long j) {
        this.f12883kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19069k4(C4618dq c4618dq) {
        return C14064he.m66718x1(this.f12882k4, c4618dq.f12882k4) && C14064he.m66718x1(this.f12884x1, c4618dq.f12884x1) && this.f12883kk == c4618dq.f12883kk;
    }
}
