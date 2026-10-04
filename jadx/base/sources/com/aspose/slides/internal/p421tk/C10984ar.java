package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C10984ar extends AbstractC11011lr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13369du f38290k4;

    public C10984ar() {
        m53208x1((short) 16398);
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
        return m53184k4((C10984ar) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iM53332fa = m53332fa() * 397;
        AbstractC13369du abstractC13369du = this.f38290k4;
        return iM53332fa ^ (abstractC13369du != null ? abstractC13369du.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53183k4(AbstractC13369du abstractC13369du) {
        this.f38290k4 = abstractC13369du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53185kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC13369du m53186to() {
        return this.f38290k4;
    }

    @Override // com.aspose.slides.internal.p421tk.AbstractC11011lr, com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectData: {1}", super.toString(), this.f38290k4);
    }

    public C10984ar(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53184k4(C10984ar c10984ar) {
        return m53332fa() == c10984ar.m53332fa() && C14067j2.m66728k4(this.f38290k4, c10984ar.f38290k4);
    }
}
