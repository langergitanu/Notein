package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10173bv;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.t6 */
/* JADX INFO: loaded from: classes.dex */
public final class C4656t6 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private long f13002k4;

    /* JADX INFO: renamed from: kk */
    private C4637k4[] f13003kk;

    /* JADX INFO: renamed from: x1 */
    private long f13004x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4656t6.class) && m19347k4((C4656t6) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (int) ((((m19352x1() & 4294967295L) * 4) & 4294967295L) + 8);
    }

    public int hashCode() {
        int i = ((((int) this.f13002k4) * 397) ^ ((int) this.f13004x1)) * 397;
        C4637k4[] c4637k4Arr = this.f13003kk;
        return i ^ (c4637k4Arr != null ? AbstractC14092to.m67208k4((Object) c4637k4Arr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19348k4() {
        return this.f13002k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4637k4[] m19351kk() {
        return this.f13003kk;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26804kk();
        for (C4637k4 c4637k4 : m19351kk()) {
            c6765kp.m26810x1(C14113y2.m67408k4(c4637k4.toString(), ", "));
        }
        return C14113y2.m67402k4("[PaletteStyleFlags: {0}, PaletteCount: {1}, PaletteEntries: [{2}]", C14042ak.m66410k4(C10173bv.class, this.f13002k4), Long.valueOf(this.f13004x1), c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19352x1() {
        return this.f13004x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19349k4(long j) {
        this.f13002k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19353x1(long j) {
        this.f13004x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19350k4(C4637k4[] c4637k4Arr) {
        this.f13003kk = c4637k4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19347k4(C4656t6 c4656t6) {
        return this.f13002k4 == c4656t6.f13002k4 && this.f13004x1 == c4656t6.f13004x1 && C12530dy.m58334k4(this.f13003kk, c4656t6.f13003kk);
    }
}
