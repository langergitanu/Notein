package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C11016qq extends AbstractC11011lr {

    /* JADX INFO: renamed from: k4 */
    private float f38347k4;

    /* JADX INFO: renamed from: kk */
    private C13407to[] f38348kk;

    /* JADX INFO: renamed from: x1 */
    private int f38349x1;

    public C11016qq() {
        m53208x1((short) 16406);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53352c5() {
        return this.f38349x1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m53353dy() {
        return this.f38347k4;
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
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
        return m53357k4((C11016qq) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM53332fa = ((((m53332fa() * 397) ^ C14064he.m66708k4(this.f38347k4)) * 397) ^ this.f38349x1) * 397;
        C13407to[] c13407toArr = this.f38348kk;
        return iM53332fa ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13407to[] m53354jd() {
        return this.f38348kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53355k4(float f) {
        this.f38347k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53358kk(int i) {
        this.f38349x1 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53360m9() {
        return m53198h4(11);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53361to() {
        return m53198h4(13);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : m53354jd()) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Tension: {1}, Count: {2}, PointData: {3}", super.toString(), Float.valueOf(this.f38347k4), Integer.valueOf(this.f38349x1), c6765kpOooO00o);
    }

    public C11016qq(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53356k4(C13407to[] c13407toArr) {
        this.f38348kk = c13407toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53359kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53357k4(C11016qq c11016qq) {
        return m53333k4((AbstractC11011lr) c11016qq) && C14064he.m66718x1(this.f38347k4, c11016qq.f38347k4) && this.f38349x1 == c11016qq.f38349x1 && C3022m9.m12723k4(this.f38348kk, c11016qq.f38348kk);
    }
}
