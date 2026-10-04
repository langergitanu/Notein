package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.bs */
/* JADX INFO: loaded from: classes.dex */
public class C4611bs extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int f12867k4;

    /* JADX INFO: renamed from: x1 */
    private C12350uz[] f12868x1;

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
        return m19035k4((C4611bs) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (m19032k4() * 16) + 4;
    }

    public int hashCode() {
        return (m19032k4() * 397) ^ (m19036x1() != null ? AbstractC14092to.m67208k4((Object) m19036x1()).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19032k4() {
        return this.f12867k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12350uz[] m19036x1() {
        return this.f12868x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19033k4(int i) {
        this.f12867k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19034k4(C12350uz[] c12350uzArr) {
        this.f12868x1 = c12350uzArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19035k4(C4611bs c4611bs) {
        return m19032k4() == c4611bs.m19032k4() && C12530dy.m58334k4(m19036x1(), c4611bs.m19036x1());
    }
}
