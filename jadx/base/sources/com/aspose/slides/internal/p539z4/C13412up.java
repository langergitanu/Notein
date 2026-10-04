package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.up */
/* JADX INFO: loaded from: classes5.dex */
public final class C13412up extends C13374fa {

    /* JADX INFO: renamed from: k4 */
    private C13425xw f44867k4;

    /* JADX INFO: renamed from: x1 */
    private int f44868x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13412up.class) && m62366k4((C13412up) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13374fa, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44867k4.mo62023h4() + 4;
    }

    public int hashCode() {
        C13425xw c13425xw = this.f44867k4;
        return ((c13425xw != null ? c13425xw.hashCode() : 0) * 397) ^ this.f44868x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13425xw m62367k4() {
        return this.f44867k4;
    }

    public String toString() {
        return C14113y2.m67402k4("BoundaryPathData: {0}, BoundaryPathSize: {1}", this.f44867k4, Integer.valueOf(this.f44868x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62370x1() {
        return this.f44868x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62368k4(int i) {
        this.f44868x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62369k4(C13425xw c13425xw) {
        this.f44867k4 = c13425xw;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62366k4(C13412up c13412up) {
        return C14067j2.m66728k4(this.f44867k4, c13412up.f44867k4) && this.f44868x1 == c13412up.f44868x1;
    }
}
