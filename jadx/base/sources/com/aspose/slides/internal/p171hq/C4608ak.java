package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ak */
/* JADX INFO: loaded from: classes.dex */
public class C4608ak extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private int f12863k4;

    /* JADX INFO: renamed from: x1 */
    private C4675xw f12864x1;

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
        return m19025k4((C4608ak) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        if (m19022k4() != null) {
            return m19022k4().mo19017h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        int i = this.f12863k4 * 397;
        C4675xw c4675xw = this.f12864x1;
        return i ^ (c4675xw != null ? c4675xw.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4675xw m19022k4() {
        return this.f12864x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19026x1() {
        return this.f12863k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19023k4(int i) {
        this.f12863k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19024k4(C4675xw c4675xw) {
        this.f12864x1 = c4675xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19025k4(C4608ak c4608ak) {
        return this.f12863k4 == c4608ak.f12863k4 && C14067j2.m66728k4(this.f12864x1, c4608ak.f12864x1);
    }
}
