package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.uz */
/* JADX INFO: loaded from: classes.dex */
public class C4663uz extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int[][] f13016k4;

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
        return m19385k4((C4663uz) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 100;
    }

    public int hashCode() {
        int[][] iArr = this.f13016k4;
        if (iArr != null) {
            return AbstractC14092to.m67210k4((Object) iArr, 1, true).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19384k4(int[][] iArr) {
        this.f13016k4 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19385k4(C4663uz c4663uz) {
        return C12530dy.m58334k4(this.f13016k4, c4663uz.f13016k4);
    }
}
