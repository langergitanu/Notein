package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.fa */
/* JADX INFO: loaded from: classes4.dex */
public class C10999fa extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13369du f38315k4;

    public C10999fa() {
        m53208x1((short) 16399);
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
        return m53258k4((C10999fa) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        AbstractC13369du abstractC13369du = this.f38315k4;
        if (abstractC13369du != null) {
            return abstractC13369du.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53257k4(AbstractC13369du abstractC13369du) {
        this.f38315k4 = abstractC13369du;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53259kk() {
        return m53199ix();
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC13369du m53260m9() {
        return this.f38315k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m53261to() {
        return m53198h4(14);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, RectData: [{1}]", super.toString(), this.f38315k4);
    }

    public C10999fa(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53258k4(C10999fa c10999fa) {
        return C14067j2.m66728k4(this.f38315k4, c10999fa.f38315k4);
    }
}
