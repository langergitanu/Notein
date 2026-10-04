package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.C13430yo;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.dq */
/* JADX INFO: loaded from: classes4.dex */
public class C10993dq extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private C13430yo f38311k4;

    public C10993dq() {
        m53208x1((short) 16428);
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
        return m53240k4((C10993dq) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        if (m53242to() != null) {
            return m53242to().hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53239k4(C13430yo c13430yo) {
        this.f38311k4 = c13430yo;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53241kk() {
        return m53198h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final C13430yo m53242to() {
        return this.f38311k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, MatrixData: {2}", super.toString(), Boolean.valueOf(m53241kk()), m53242to());
    }

    public C10993dq(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53240k4(C10993dq c10993dq) {
        return C14067j2.m66728k4(m53242to(), c10993dq.m53242to());
    }
}
