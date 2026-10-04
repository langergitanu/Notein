package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C13413uz extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private int[][] f44869k4;

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
        return m62372k4((C13413uz) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 100;
    }

    public int hashCode() {
        int[][] iArr = this.f44869k4;
        if (iArr != null) {
            return AbstractC14092to.m67210k4((Object) iArr, 1, true).hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62371k4(int[][] iArr) {
        this.f44869k4 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62372k4(C13413uz c13413uz) {
        return C3022m9.m12723k4(this.f44869k4, c13413uz.f44869k4);
    }
}
