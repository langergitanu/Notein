package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10995dy extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private int f38313k4;

    /* JADX INFO: renamed from: x1 */
    private C13407to[] f38314x1;

    public C10995dy() {
        m53208x1((short) 16409);
    }

    /* JADX INFO: renamed from: c5 */
    public final C13407to[] m53246c5() {
        return this.f38314x1;
    }

    /* JADX INFO: renamed from: dy */
    public final int m53247dy() {
        return this.f38313k4;
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
        return m53249k4((C10995dy) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = this.f38313k4 * 397;
        C13407to[] c13407toArr = this.f38314x1;
        return i ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53248k4(C13407to[] c13407toArr) {
        this.f38314x1 = c13407toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53250kk(int i) {
        this.f38313k4 = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m53252m9() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53253to() {
        return m53198h4(11);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : this.f38314x1) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Integer.valueOf(this.f38313k4), c6765kpOooO00o);
    }

    public C10995dy(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53249k4(C10995dy c10995dy) {
        return this.f38313k4 == c10995dy.f38313k4 && C3022m9.m12723k4(this.f38314x1, c10995dy.f38314x1);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53251kk() {
        return m53198h4(14);
    }
}
