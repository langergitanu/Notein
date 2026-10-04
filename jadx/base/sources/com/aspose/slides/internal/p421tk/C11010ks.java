package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11010ks extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private long f38339k4;

    /* JADX INFO: renamed from: x1 */
    private C13407to[] f38340x1;

    public C11010ks() {
        m53208x1((short) 16397);
    }

    /* JADX INFO: renamed from: c5 */
    public final long m53322c5() {
        return this.f38339k4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m53323dy() {
        return m53198h4(13);
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
        return m53327k4((C11010ks) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = ((int) this.f38339k4) * 397;
        C13407to[] c13407toArr = this.f38340x1;
        return i ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13407to[] m53324jd() {
        return this.f38340x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53325k4(long j) {
        this.f38339k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53328kk() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53329m9() {
        return m53198h4(11);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53330to() {
        return m53198h4(14);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : m53324jd()) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Count: {1}, PointData: {2}", super.toString(), Long.valueOf(this.f38339k4), c6765kpOooO00o);
    }

    public C11010ks(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53326k4(C13407to[] c13407toArr) {
        this.f38340x1 = c13407toArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53327k4(C11010ks c11010ks) {
        return this.f38339k4 == c11010ks.f38339k4 && C3022m9.m12723k4(this.f38340x1, c11010ks.f38340x1);
    }
}
