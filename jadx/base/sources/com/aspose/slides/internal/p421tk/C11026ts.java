package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C11026ts extends AbstractC11024to {

    /* JADX INFO: renamed from: k4 */
    private float f38356k4;

    /* JADX INFO: renamed from: x1 */
    private float f38357x1;

    public C11026ts() {
        m53208x1((short) 16437);
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
        return m53388k4((C11026ts) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (C14064he.m66708k4(this.f38356k4) * 397) ^ C14064he.m66708k4(this.f38357x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53387k4(float f) {
        this.f38356k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final float m53389kk() {
        return this.f38356k4;
    }

    /* JADX INFO: renamed from: to */
    public final float m53390to() {
        return this.f38357x1;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, Dx: {1}, Dy: {2}", super.toString(), Float.valueOf(this.f38356k4), Float.valueOf(this.f38357x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53391x1(float f) {
        this.f38357x1 = f;
    }

    public C11026ts(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53388k4(C11026ts c11026ts) {
        return C14064he.m66718x1(this.f38356k4, c11026ts.f38356k4) && C14064he.m66718x1(this.f38357x1, c11026ts.f38357x1);
    }
}
