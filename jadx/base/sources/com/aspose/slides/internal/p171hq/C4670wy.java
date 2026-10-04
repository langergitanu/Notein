package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.wy */
/* JADX INFO: loaded from: classes.dex */
public class C4670wy extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private float[] f13048k4;

    /* JADX INFO: renamed from: x1 */
    private long f13049x1;

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
        return m19456k4((C4670wy) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (int) ((((this.f13049x1 & 4294967295L) * 4) & 4294967295L) + 4);
    }

    public int hashCode() {
        float[] fArr = this.f13048k4;
        return ((fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0) * 397) ^ ((int) this.f13049x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19454k4(long j) {
        this.f13049x1 = j;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f13048k4) {
            c6765kp.m26785k4(f);
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("DashedLineData: [{0}], DashedLineDataSize: {1}", c6765kp, Long.valueOf(this.f13049x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19458x1() {
        return this.f13049x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19455k4(float[] fArr) {
        this.f13048k4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19456k4(C4670wy c4670wy) {
        return C12530dy.m58331k4(this.f13048k4, c4670wy.f13048k4) && this.f13049x1 == c4670wy.f13049x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m19457k4() {
        return this.f13048k4;
    }
}
