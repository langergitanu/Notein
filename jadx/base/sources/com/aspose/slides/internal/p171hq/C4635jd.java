package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C4635jd extends C4620dy {

    /* JADX INFO: renamed from: k4 */
    private float[] f12920k4;

    /* JADX INFO: renamed from: k4 */
    private boolean m19165k4(C4635jd c4635jd) {
        return m19078k4((C4620dy) c4635jd) && C12530dy.m58331k4(this.f12920k4, c4635jd.f12920k4);
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4635jd.class) && m19165k4((C4635jd) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (int) ((((long) super.mo19017h4()) + (((m19080x1() & 4294967295L) * 4) & 4294967295L)) & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        float[] fArr = this.f12920k4;
        return iHashCode ^ (fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: kk */
    public final float[] m19166kk() {
        return this.f12920k4;
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f12920k4) {
            c6765kp.m26792k4(C14113y2.m67408k4(C14064he.m66704h4(f), ", "));
        }
        return C14113y2.m67402k4("{0}, BlendFactors: [{1}]", super.toString(), c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19167x1(float[] fArr) {
        this.f12920k4 = fArr;
    }
}
