package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ck */
/* JADX INFO: loaded from: classes.dex */
public class C4617ck extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private float f12880k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f12881x1;

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
        return m19068k4((C4617ck) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(this.f12880k4) * 397) ^ C14051ck.m66552k4(this.f12881x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19066k4(float f) {
        this.f12880k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19067k4(boolean z) {
        this.f12881x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19068k4(C4617ck c4617ck) {
        return C14064he.m66718x1(this.f12880k4, c4617ck.f12880k4) && C14051ck.m66558x1(this.f12881x1, c4617ck.f12881x1);
    }
}
