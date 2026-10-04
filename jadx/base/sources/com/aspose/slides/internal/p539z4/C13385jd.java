package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.jd */
/* JADX INFO: loaded from: classes5.dex */
public final class C13385jd extends C13370dy {

    /* JADX INFO: renamed from: k4 */
    private float[] f44773k4;

    /* JADX INFO: renamed from: k4 */
    private boolean m62163k4(C13385jd c13385jd) {
        return m62081k4((C13370dy) c13385jd) && C3022m9.m12720k4(this.f44773k4, c13385jd.f44773k4);
    }

    @Override // com.aspose.slides.internal.p539z4.C13370dy
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13385jd.class) && m62163k4((C13385jd) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13370dy, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (int) ((((long) super.mo62023h4()) + (((m62083x1() & 4294967295L) * 4) & 4294967295L)) & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p539z4.C13370dy
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        float[] fArr = this.f44773k4;
        return iHashCode ^ (fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: kk */
    public final float[] m62164kk() {
        return this.f44773k4;
    }

    @Override // com.aspose.slides.internal.p539z4.C13370dy
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f44773k4) {
            c6765kp.m26792k4(C14113y2.m67408k4(C14064he.m66704h4(f), ", "));
        }
        return C14113y2.m67402k4("{0}, BlendFactors: [{1}]", super.toString(), c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62165x1(float[] fArr) {
        this.f44773k4 = fArr;
    }
}
