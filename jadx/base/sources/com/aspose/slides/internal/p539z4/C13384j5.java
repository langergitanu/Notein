package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.j5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13384j5 extends AbstractC13388kk {

    /* JADX INFO: renamed from: k4 */
    private C13387k4 f44772k4;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13384j5.class) && m62160k4((C13384j5) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44772k4.mo62023h4();
    }

    public int hashCode() {
        C13387k4 c13387k4 = this.f44772k4;
        if (c13387k4 != null) {
            return c13387k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13387k4 m62161k4() {
        return this.f44772k4;
    }

    public String toString() {
        return C14113y2.m67402k4("SolidColor: {0}", this.f44772k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62162k4(C13387k4 c13387k4) {
        this.f44772k4 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62160k4(C13384j5 c13384j5) {
        return C14067j2.m66728k4(this.f44772k4, c13384j5.f44772k4);
    }
}
