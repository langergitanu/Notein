package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.wl */
/* JADX INFO: loaded from: classes.dex */
public class C4668wl extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private float[] f13043k4;

    /* JADX INFO: renamed from: x1 */
    private int f13044x1;

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
        return m19444k4((C4668wl) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (this.f13044x1 * 4) + 4;
    }

    public int hashCode() {
        float[] fArr = this.f13043k4;
        return ((fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0) * 397) ^ this.f13044x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19442k4(int i) {
        this.f13044x1 = i;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f13043k4) {
            c6765kp.m26785k4(f);
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("CompoundLineData: [{0}], CompoundLineDataSize: {1}", c6765kp, Integer.valueOf(this.f13044x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19446x1() {
        return this.f13044x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19443k4(float[] fArr) {
        this.f13043k4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19444k4(C4668wl c4668wl) {
        return C12530dy.m58331k4(this.f13043k4, c4668wl.f13043k4) && this.f13044x1 == c4668wl.f13044x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m19445k4() {
        return this.f13043k4;
    }
}
