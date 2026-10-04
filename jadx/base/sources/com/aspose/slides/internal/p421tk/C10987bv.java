package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C10987bv extends AbstractC11011lr {

    /* JADX INFO: renamed from: k4 */
    private float f38291k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13369du f38292kk;

    /* JADX INFO: renamed from: x1 */
    private float f38293x1;

    public C10987bv() {
        m53208x1((short) 16400);
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC13369du m53189dy() {
        return this.f38292kk;
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
        return m53192k4((C10987bv) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM53332fa = ((((m53332fa() * 397) ^ C14064he.m66708k4(this.f38291k4)) * 397) ^ C14064he.m66708k4(this.f38293x1)) * 397;
        AbstractC13369du abstractC13369du = this.f38292kk;
        return iM53332fa ^ (abstractC13369du != null ? abstractC13369du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53190k4(float f) {
        if (f < 0.0f) {
            f += 360.0f;
        }
        this.f38291k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53193kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53194m9() {
        return this.f38293x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m53195to() {
        return this.f38291k4;
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StartAngle: {1}, SweepAngle: {2}, RectData: {3}", super.toString(), Float.valueOf(this.f38291k4), Float.valueOf(this.f38293x1), this.f38292kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53196x1(float f) {
        this.f38293x1 = f;
    }

    public C10987bv(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53191k4(AbstractC13369du abstractC13369du) {
        this.f38292kk = abstractC13369du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53192k4(C10987bv c10987bv) {
        return m53332fa() == c10987bv.m53332fa() && C14064he.m66718x1(this.f38291k4, c10987bv.f38291k4) && C14064he.m66718x1(this.f38293x1, c10987bv.f38293x1) && C14067j2.m66728k4(this.f38292kk, c10987bv.f38292kk);
    }
}
