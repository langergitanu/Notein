package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.gi */
/* JADX INFO: loaded from: classes5.dex */
public final class C13377gi extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13430yo f44750k4;

    /* JADX INFO: renamed from: x1 */
    private C13370dy[] f44751x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13377gi.class) && m62107k4((C13377gi) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        C13430yo c13430yo = this.f44750k4;
        int iMo62023h4 = c13430yo != null ? c13430yo.mo62023h4() : 0;
        if (this.f44751x1 != null) {
            for (C13370dy c13370dy : m62111x1()) {
                if (c13370dy != null) {
                    iMo62023h4 = c13370dy.mo62023h4() + iMo62023h4;
                }
            }
        }
        return iMo62023h4;
    }

    public int hashCode() {
        C13430yo c13430yo = this.f44750k4;
        int iHashCode = (c13430yo != null ? c13430yo.hashCode() : 0) * 397;
        C13370dy[] c13370dyArr = this.f44751x1;
        return iHashCode ^ (c13370dyArr != null ? AbstractC14092to.m67208k4((Object) c13370dyArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13430yo m62108k4() {
        return this.f44750k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C13370dy c13370dy : m62111x1()) {
            c6765kp.m26792k4(C14113y2.m67408k4(c13370dy.toString(), ", "));
        }
        return C14113y2.m67402k4("TransformMatrix: {0}, BlendPattern: {1}", this.f44750k4, c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13370dy[] m62111x1() {
        return this.f44751x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62109k4(C13430yo c13430yo) {
        this.f44750k4 = c13430yo;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62110k4(C13370dy[] c13370dyArr) {
        this.f44751x1 = c13370dyArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62107k4(C13377gi c13377gi) {
        return C14067j2.m66728k4(this.f44750k4, c13377gi.f44750k4) && C3022m9.m12723k4(this.f44751x1, c13377gi.f44751x1);
    }
}
