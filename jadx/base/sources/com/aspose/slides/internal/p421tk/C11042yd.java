package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C11042yd extends AbstractC11011lr {

    /* JADX INFO: renamed from: k4 */
    private long f38375k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13369du[] f38376x1;

    public C11042yd() {
        m53208x1((short) 16394);
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
        return m53451k4((C11042yd) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM53332fa = ((m53332fa() * 397) ^ ((int) this.f38375k4)) * 397;
        AbstractC13369du[] abstractC13369duArr = this.f38376x1;
        return iM53332fa ^ (abstractC13369duArr != null ? AbstractC14092to.m67208k4((Object) abstractC13369duArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53449k4(long j) {
        this.f38375k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53452kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC13369du[] m53453m9() {
        return this.f38376x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m53454to() {
        return this.f38375k4;
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Count: {1}, RectData: {2}", super.toString(), Long.valueOf(this.f38375k4), this.f38376x1);
    }

    public C11042yd(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53450k4(AbstractC13369du[] abstractC13369duArr) {
        this.f38376x1 = abstractC13369duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53451k4(C11042yd c11042yd) {
        return m53332fa() == c11042yd.m53332fa() && this.f38375k4 == c11042yd.f38375k4 && C3022m9.m12723k4(this.f38376x1, c11042yd.f38376x1);
    }
}
