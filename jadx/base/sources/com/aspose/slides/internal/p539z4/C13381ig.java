package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1487kp;
import com.aspose.slides.internal.p026an.C1507x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ig */
/* JADX INFO: loaded from: classes5.dex */
public final class C13381ig extends AbstractC13388kk {

    /* JADX INFO: renamed from: k4 */
    private long f44763k4;

    /* JADX INFO: renamed from: kk */
    private C13378gk f44764kk;

    /* JADX INFO: renamed from: x1 */
    private long f44765x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13381ig.class) && m62139k4((C13381ig) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44764kk.mo62023h4() + 8;
    }

    public int hashCode() {
        int i = ((((int) this.f44763k4) * 397) ^ ((int) this.f44765x1)) * 397;
        C13378gk c13378gk = this.f44764kk;
        return i ^ (c13378gk != null ? c13378gk.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62140k4() {
        return this.f44763k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13378gk m62143kk() {
        return this.f44764kk;
    }

    public String toString() {
        return C14113y2.m67402k4("BrushDataFlags: {0}, WrapMode: {1}, OptionalData: [{2}]", C14042ak.m66410k4(C1507x1.class, this.f44763k4), C14042ak.m66410k4(C1487kp.class, this.f44765x1), this.f44764kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62144x1() {
        return this.f44765x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62141k4(long j) {
        this.f44763k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62145x1(long j) {
        this.f44765x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62142k4(C13378gk c13378gk) {
        this.f44764kk = c13378gk;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62139k4(C13381ig c13381ig) {
        return this.f44763k4 == c13381ig.f44763k4 && this.f44765x1 == c13381ig.f44765x1 && C14067j2.m66728k4(this.f44764kk, c13381ig.f44764kk);
    }
}
