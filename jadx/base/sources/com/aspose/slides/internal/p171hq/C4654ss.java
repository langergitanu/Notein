package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ss */
/* JADX INFO: loaded from: classes.dex */
public class C4654ss extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private int f13000k4;

    /* JADX INFO: renamed from: x1 */
    private C4675xw f13001x1;

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
        return m19345k4((C4654ss) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        if (m19346x1() != null) {
            return m19346x1().mo19017h4() + 4;
        }
        return 4;
    }

    public int hashCode() {
        return (m19342k4() * 397) ^ (m19346x1() != null ? m19346x1().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19342k4() {
        return this.f13000k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4675xw m19346x1() {
        return this.f13001x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19343k4(int i) {
        this.f13000k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19344k4(C4675xw c4675xw) {
        this.f13001x1 = c4675xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19345k4(C4654ss c4654ss) {
        return m19342k4() == c4654ss.m19342k4() && C14067j2.m66728k4(m19346x1(), c4654ss.m19346x1());
    }
}
