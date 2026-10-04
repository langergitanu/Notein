package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1471bv;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.t6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13406t6 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private long f44855k4;

    /* JADX INFO: renamed from: kk */
    private C13387k4[] f44856kk;

    /* JADX INFO: renamed from: x1 */
    private long f44857x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13406t6.class) && m62335k4((C13406t6) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (int) ((((m62336k4() & 4294967295L) * 4) & 4294967295L) + 8);
    }

    public int hashCode() {
        int i = ((((int) this.f44855k4) * 397) ^ ((int) this.f44857x1)) * 397;
        C13387k4[] c13387k4Arr = this.f44856kk;
        return i ^ (c13387k4Arr != null ? AbstractC14092to.m67208k4((Object) c13387k4Arr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62336k4() {
        return this.f44857x1;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26804kk();
        for (C13387k4 c13387k4 : m62340x1()) {
            c6765kp.m26810x1(C14113y2.m67408k4(c13387k4.toString(), ", "));
        }
        return C14113y2.m67402k4("[PaletteStyleFlags: {0}, PaletteCount: {1}, PaletteEntries: [{2}]", C14042ak.m66410k4(C1471bv.class, this.f44855k4), Long.valueOf(this.f44857x1), c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62339x1(long j) {
        this.f44857x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62337k4(long j) {
        this.f44855k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13387k4[] m62340x1() {
        return this.f44856kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62338k4(C13387k4[] c13387k4Arr) {
        this.f44856kk = c13387k4Arr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62335k4(C13406t6 c13406t6) {
        return this.f44855k4 == c13406t6.f44855k4 && this.f44857x1 == c13406t6.f44857x1 && C3022m9.m12723k4(this.f44856kk, c13406t6.f44856kk);
    }
}
