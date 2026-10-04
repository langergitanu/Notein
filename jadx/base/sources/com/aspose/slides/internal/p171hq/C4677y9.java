package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.y9 */
/* JADX INFO: loaded from: classes.dex */
public class C4677y9 extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private C4673x6[] f13069k4;

    /* JADX INFO: renamed from: x1 */
    private float[] f13070x1;

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
        return m19507k4((C4677y9) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        float[] fArr = this.f13070x1;
        int length = fArr != null ? fArr.length * 4 : 0;
        if (m19509x1() != null) {
            for (C4673x6 c4673x6 : m19509x1()) {
                length += c4673x6.mo19017h4();
            }
        }
        return length;
    }

    public int hashCode() {
        C4673x6[] c4673x6Arr = this.f13069k4;
        int iHashCode = (c4673x6Arr != null ? AbstractC14092to.m67208k4((Object) c4673x6Arr).hashCode() : 0) * 397;
        float[] fArr = this.f13070x1;
        return iHashCode ^ (fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19505k4(float[] fArr) {
        this.f13070x1 = fArr;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m19508k4() != null) {
            for (float f : m19508k4()) {
                c6765kp.m26792k4(C14113y2.m67408k4(C14064he.m66704h4(f), ","));
            }
        }
        C6765kp c6765kp2 = new C6765kp();
        C4673x6[] c4673x6Arr = this.f13069k4;
        if (c4673x6Arr != null) {
            for (C4673x6 c4673x6 : c4673x6Arr) {
                c6765kp2.m26792k4(C14113y2.m67408k4(c4673x6.toString(), ","));
            }
        }
        return C14113y2.m67402k4("CharRange: [{0}], TabStops: [{1}]", c6765kp2, c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final C4673x6[] m19509x1() {
        return this.f13069k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19506k4(C4673x6[] c4673x6Arr) {
        this.f13069k4 = c4673x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19507k4(C4677y9 c4677y9) {
        return C12530dy.m58334k4(this.f13069k4, c4677y9.f13069k4) && C12530dy.m58331k4(this.f13070x1, c4677y9.f13070x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m19508k4() {
        return this.f13070x1;
    }
}
