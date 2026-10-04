package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.yd */
/* JADX INFO: loaded from: classes.dex */
public class C4678yd extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4608ak f13071k4;

    /* JADX INFO: renamed from: x1 */
    private C4654ss f13072x1;

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
        return m19513k4((C4678yd) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        C4608ak c4608ak = this.f13071k4;
        int iMo19017h4 = c4608ak != null ? c4608ak.mo19017h4() : 0;
        C4654ss c4654ss = this.f13072x1;
        return c4654ss != null ? c4654ss.mo19017h4() + iMo19017h4 : iMo19017h4;
    }

    public int hashCode() {
        C4608ak c4608ak = this.f13071k4;
        int iHashCode = (c4608ak != null ? c4608ak.hashCode() : 0) * 397;
        C4654ss c4654ss = this.f13072x1;
        return iHashCode ^ (c4654ss != null ? c4654ss.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C4608ak m19510k4() {
        return this.f13071k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4654ss m19514x1() {
        return this.f13072x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19511k4(C4608ak c4608ak) {
        this.f13071k4 = c4608ak;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19512k4(C4654ss c4654ss) {
        this.f13072x1 = c4654ss;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19513k4(C4678yd c4678yd) {
        return C14067j2.m66728k4(this.f13071k4, c4678yd.f13071k4) && C14067j2.m66728k4(this.f13072x1, c4678yd.f13072x1);
    }
}
