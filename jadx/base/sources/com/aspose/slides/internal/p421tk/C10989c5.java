package com.aspose.slides.internal.p421tk;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.C13407to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10989c5 extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private float f38300k4;

    /* JADX INFO: renamed from: kk */
    private C13407to[] f38301kk;

    /* JADX INFO: renamed from: x1 */
    private int f38302x1;

    public C10989c5() {
        m53208x1((short) 16407);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m53210c5() {
        return this.f38302x1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m53211dy() {
        return this.f38300k4;
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
        return m53215k4((C10989c5) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM66708k4 = ((C14064he.m66708k4(this.f38300k4) * 397) ^ this.f38302x1) * 397;
        C13407to[] c13407toArr = this.f38301kk;
        return iM66708k4 ^ (c13407toArr != null ? AbstractC14092to.m67208k4((Object) c13407toArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final C13407to[] m53212jd() {
        return this.f38301kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53213k4(float f) {
        this.f38300k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53216kk() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53218m9() {
        return m53198h4(11);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53219to() {
        return m53198h4(14);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
        for (C13407to c13407to : this.f38301kk) {
            c6765kpOooO00o.m26791k4(c13407to);
            c6765kpOooO00o.m26792k4(", ");
        }
        c6765kpOooO00o.m26792k4("]");
        return C14113y2.m67402k4("{0}, Tension: {1}, Count: {2}, PointData: {3}", super.toString(), Float.valueOf(this.f38300k4), Integer.valueOf(this.f38302x1), c6765kpOooO00o);
    }

    public C10989c5(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53214k4(C13407to[] c13407toArr) {
        this.f38301kk = c13407toArr;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53217kk(int i) {
        this.f38302x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53215k4(C10989c5 c10989c5) {
        return C14064he.m66718x1(this.f38300k4, c10989c5.f38300k4) && this.f38302x1 == c10989c5.f38302x1 && C3022m9.m12723k4(this.f38301kk, c10989c5.f38301kk);
    }
}
