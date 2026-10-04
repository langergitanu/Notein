package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11006jd extends AbstractC11027u4 {

    /* JADX INFO: renamed from: du */
    private C13407to[] f38328du;

    /* JADX INFO: renamed from: k4 */
    private int f38329k4;

    /* JADX INFO: renamed from: kk */
    private float f38330kk;

    /* JADX INFO: renamed from: to */
    private int f38331to;

    /* JADX INFO: renamed from: x1 */
    private int f38332x1;

    public C11006jd() {
        m53208x1((short) 16408);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53292c5() {
        return this.f38332x1;
    }

    /* JADX INFO: renamed from: ck */
    public final C13407to[] m53293ck() {
        return this.f38328du;
    }

    /* JADX INFO: renamed from: du */
    public final void m53294du(int i) {
        this.f38331to = i;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53295dy() {
        return this.f38329k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53299k4((C11006jd) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM66708k4 = ((((((this.f38329k4 * 397) ^ this.f38332x1) * 397) ^ C14064he.m66708k4(this.f38330kk)) * 397) ^ this.f38331to) * 397;
        C13407to[] c13407toArr = this.f38328du;
        return iM66708k4 ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final int m53296jd() {
        return this.f38331to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53297k4(float f) {
        this.f38330kk = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53300kk(int i) {
        this.f38329k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53302m9() {
        return this.f38330kk;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53303to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : this.f38328du) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Offset: {1}, NumSegments: {2}, Tension: {3}, Count: {4}, PointData: {5}", super.toString(), Integer.valueOf(this.f38329k4), Integer.valueOf(this.f38332x1), Float.valueOf(this.f38330kk), Integer.valueOf(this.f38331to), c6765kpOooO00o);
    }

    public C11006jd(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53298k4(C13407to[] c13407toArr) {
        this.f38328du = c13407toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53301kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final void m53304to(int i) {
        this.f38332x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53299k4(C11006jd c11006jd) {
        return this.f38329k4 == c11006jd.f38329k4 && this.f38332x1 == c11006jd.f38332x1 && C14064he.m66718x1(this.f38330kk, c11006jd.f38330kk) && this.f38331to == c11006jd.f38331to && C3022m9.m12723k4(this.f38328du, c11006jd.f38328du);
    }
}
