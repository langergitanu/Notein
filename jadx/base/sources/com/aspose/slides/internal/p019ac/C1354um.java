package com.aspose.slides.internal.p019ac;

import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.um */
/* JADX INFO: loaded from: classes3.dex */
public class C1354um extends AbstractC1349ne {

    /* JADX INFO: renamed from: du */
    private float f5871du;

    /* JADX INFO: renamed from: h4 */
    private float f5872h4;

    /* JADX INFO: renamed from: k4 */
    private float f5873k4;

    /* JADX INFO: renamed from: kk */
    private float f5874kk;

    /* JADX INFO: renamed from: to */
    private float f5875to;

    /* JADX INFO: renamed from: x1 */
    private float f5876x1;

    /* JADX INFO: renamed from: du */
    public final void m7986du(float f) {
        this.f5871du = f;
    }

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
        return m7990k4((C1354um) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m7987h4(float f) {
        this.f5872h4 = f;
    }

    public int hashCode() {
        return (((((((((C14064he.m66708k4(this.f5873k4) * 397) ^ C14064he.m66708k4(this.f5876x1)) * 397) ^ C14064he.m66708k4(this.f5874kk)) * 397) ^ C14064he.m66708k4(this.f5875to)) * 397) ^ C14064he.m66708k4(this.f5871du)) * 397) ^ C14064he.m66708k4(this.f5872h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C11913yj m7988k4() {
        return new C11913yj(this.f5873k4, this.f5876x1, this.f5874kk, this.f5875to, this.f5871du, this.f5872h4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m7991kk(float f) {
        this.f5874kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m7992to(float f) {
        this.f5875to = f;
    }

    public String toString() {
        return C14113y2.m67402k4("[M11: {0}, M12: {1}, M21: {2}, M22: {3}, Dx: {4}, Dy: {5}]", Float.valueOf(this.f5873k4), Float.valueOf(this.f5876x1), Float.valueOf(this.f5874kk), Float.valueOf(this.f5875to), Float.valueOf(this.f5871du), Float.valueOf(this.f5872h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7993x1(float f) {
        this.f5876x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7989k4(float f) {
        this.f5873k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7990k4(C1354um c1354um) {
        return C14064he.m66718x1(this.f5873k4, c1354um.f5873k4) && C14064he.m66718x1(this.f5876x1, c1354um.f5876x1) && C14064he.m66718x1(this.f5874kk, c1354um.f5874kk) && C14064he.m66718x1(this.f5875to, c1354um.f5875to) && C14064he.m66718x1(this.f5871du, c1354um.f5871du) && C14064he.m66718x1(this.f5872h4, c1354um.f5872h4);
    }
}
