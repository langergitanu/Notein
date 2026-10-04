package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.wy */
/* JADX INFO: loaded from: classes5.dex */
public class C13420wy extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private float[] f44901k4;

    /* JADX INFO: renamed from: x1 */
    private long f44902x1;

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
        return m62439k4((C13420wy) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return (int) ((((this.f44902x1 & 4294967295L) * 4) & 4294967295L) + 4);
    }

    public int hashCode() {
        float[] fArr = this.f44901k4;
        return ((fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0) * 397) ^ ((int) this.f44902x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62437k4(long j) {
        this.f44902x1 = j;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (float f : this.f44901k4) {
            c6765kp.m26785k4(f);
            c6765kp.m26792k4(", ");
        }
        return C14113y2.m67402k4("DashedLineData: [{0}], DashedLineDataSize: {1}", c6765kp, Long.valueOf(this.f44902x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62441x1() {
        return this.f44902x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62438k4(float[] fArr) {
        this.f44901k4 = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62439k4(C13420wy c13420wy) {
        return C3022m9.m12720k4(this.f44901k4, c13420wy.f44901k4) && this.f44902x1 == c13420wy.f44902x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m62440k4() {
        return this.f44901k4;
    }
}
