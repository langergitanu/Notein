package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.internal.p026an.C1506wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.w6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13417w6 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private long f44892k4;

    /* JADX INFO: renamed from: kk */
    private float f44893kk;

    /* JADX INFO: renamed from: to */
    private C13397os f44894to;

    /* JADX INFO: renamed from: x1 */
    private int f44895x1;

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
        return m62422k4((C13417w6) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return m62423kk().m62288kk(m62417k4()) + 12;
    }

    public int hashCode() {
        int i = ((((int) this.f44892k4) * 397) ^ this.f44895x1) * 397;
        C13397os c13397os = this.f44894to;
        return ((i ^ (c13397os != null ? c13397os.hashCode() : 0)) * 397) ^ C14064he.m66708k4(this.f44893kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62417k4() {
        return this.f44892k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13397os m62423kk() {
        return this.f44894to;
    }

    public String toString() {
        return C14113y2.m67402k4("PenDataFlags: {0}, PenUnit: {1}, PenWidth: {2}, OptionalData: {3}", C14042ak.m66410k4(C1506wy.class, this.f44892k4), C14042ak.m66410k4(C1495ss.class, this.f44895x1), Float.valueOf(this.f44893kk), this.f44894to);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m62424x1() {
        return this.f44893kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62418k4(float f) {
        this.f44893kk = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62419k4(int i) {
        this.f44895x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62420k4(long j) {
        this.f44892k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62421k4(C13397os c13397os) {
        this.f44894to = c13397os;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62422k4(C13417w6 c13417w6) {
        return this.f44892k4 == c13417w6.f44892k4 && this.f44895x1 == c13417w6.f44895x1 && C14067j2.m66728k4(this.f44894to, c13417w6.f44894to) && C14064he.m66718x1(this.f44893kk, c13417w6.f44893kk);
    }
}
