package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.m4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13393m4 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13425xw f44803k4;

    /* JADX INFO: renamed from: x1 */
    private int f44804x1;

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
        return m62227k4((C13393m4) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44803k4.mo62023h4() + 4;
    }

    public int hashCode() {
        C13425xw c13425xw = this.f44803k4;
        return ((c13425xw != null ? c13425xw.hashCode() : 0) * 397) ^ this.f44804x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13425xw m62224k4() {
        return this.f44803k4;
    }

    public String toString() {
        return C14113y2.m67402k4("RegionNodePathLength: {0}, RegionNodePath: [{1}]", Integer.valueOf(this.f44804x1), this.f44803k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62228x1() {
        return this.f44804x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62225k4(int i) {
        this.f44804x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62226k4(C13425xw c13425xw) {
        this.f44803k4 = c13425xw;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62227k4(C13393m4 c13393m4) {
        return C14067j2.m66728k4(this.f44803k4, c13393m4.f44803k4) && this.f44804x1 == c13393m4.f44804x1;
    }
}
