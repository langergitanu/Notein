package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.y9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13427y9 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13423x6[] f44922k4;

    /* JADX INFO: renamed from: x1 */
    private float[] f44923x1;

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
        return m62489k4((C13427y9) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        float[] fArr = this.f44923x1;
        int length = fArr != null ? fArr.length * 4 : 0;
        if (m62491x1() != null) {
            for (C13423x6 c13423x6 : m62491x1()) {
                length += c13423x6.mo62023h4();
            }
        }
        return length;
    }

    public int hashCode() {
        C13423x6[] c13423x6Arr = this.f44922k4;
        int iHashCode = (c13423x6Arr != null ? AbstractC14092to.m67208k4((Object) c13423x6Arr).hashCode() : 0) * 397;
        float[] fArr = this.f44923x1;
        return iHashCode ^ (fArr != null ? AbstractC14092to.m67208k4(fArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62487k4(float[] fArr) {
        this.f44923x1 = fArr;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        if (m62490k4() != null) {
            for (float f : m62490k4()) {
                c6765kp.m26792k4(C14113y2.m67408k4(C14064he.m66704h4(f), ","));
            }
        }
        C6765kp c6765kp2 = new C6765kp();
        C13423x6[] c13423x6Arr = this.f44922k4;
        if (c13423x6Arr != null) {
            for (C13423x6 c13423x6 : c13423x6Arr) {
                c6765kp2.m26792k4(C14113y2.m67408k4(c13423x6.toString(), ","));
            }
        }
        return C14113y2.m67402k4("CharRange: [{0}], TabStops: [{1}]", c6765kp2, c6765kp);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13423x6[] m62491x1() {
        return this.f44922k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62488k4(C13423x6[] c13423x6Arr) {
        this.f44922k4 = c13423x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62489k4(C13427y9 c13427y9) {
        return C3022m9.m12723k4(this.f44922k4, c13427y9.f44922k4) && C3022m9.m12720k4(this.f44923x1, c13427y9.f44923x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m62490k4() {
        return this.f44923x1;
    }
}
