package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.C13430yo;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ri */
/* JADX INFO: loaded from: classes4.dex */
public class C11018ri extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private C13430yo f38350k4;

    public C11018ri() {
        m53208x1((short) 16426);
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
        return m53364k4((C11018ri) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ (m53365kk() != null ? m53365kk().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53363k4(C13430yo c13430yo) {
        this.f38350k4 = c13430yo;
    }

    /* JADX INFO: renamed from: kk */
    public final C13430yo m53365kk() {
        return this.f38350k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, MatrixData: {1}", super.toString(), m53365kk());
    }

    public C11018ri(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53364k4(C11018ri c11018ri) {
        return m53202k4((C10988bz) c11018ri) && C14067j2.m66728k4(m53365kk(), c11018ri.m53365kk());
    }
}
