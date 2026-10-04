package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.wp */
/* JADX INFO: loaded from: classes4.dex */
public class C11036wp extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private float f38367k4;

    public C11036wp() {
        m53208x1((short) 16431);
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
        return m53423k4((C11036wp) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ C14064he.m66708k4(m53425to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53422k4(float f) {
        this.f38367k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53424kk() {
        return m53198h4(13);
    }

    /* JADX INFO: renamed from: to */
    public final float m53425to() {
        return this.f38367k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Angle: {2}", super.toString(), Boolean.valueOf(m53424kk()), Float.valueOf(m53425to()));
    }

    public C11036wp(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53423k4(C11036wp c11036wp) {
        return m53202k4((C10988bz) c11036wp) && C14064he.m66718x1(m53425to(), c11036wp.m53425to());
    }
}
