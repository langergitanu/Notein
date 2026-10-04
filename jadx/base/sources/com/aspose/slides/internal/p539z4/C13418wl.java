package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.wl */
/* JADX INFO: loaded from: classes5.dex */
public class C13418wl extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private float[] f44896k4;

    /* JADX INFO: renamed from: x1 */
    private int f44897x1;

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
        return m62427k4((C13418wl) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (this.f44897x1 * 4) + 4;
    }

    public int hashCode() {
        float[] fArr = this.f44896k4;
        return ((fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0) * 397) ^ this.f44897x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62425k4(int i) {
        this.f44897x1 = i;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f44896k4) {
            c6765kp.m26785k4(f);
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("CompoundLineData: [{0}], CompoundLineDataSize: {1}", c6765kp, Integer.valueOf(this.f44897x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62429x1() {
        return this.f44897x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62426k4(float[] fArr) {
        this.f44896k4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62427k4(C13418wl c13418wl) {
        return C3022m9.m12720k4(this.f44896k4, c13418wl.f44896k4) && this.f44897x1 == c13418wl.f44897x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m62428k4() {
        return this.f44896k4;
    }
}
