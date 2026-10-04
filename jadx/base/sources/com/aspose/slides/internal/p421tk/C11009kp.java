package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C11009kp extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private float f38337k4;

    /* JADX INFO: renamed from: x1 */
    private float f38338x1;

    public C11009kp() {
        m53208x1((short) 16430);
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
        return m53317k4((C11009kp) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ C14064he.m66708k4(m53320to())) * 397) ^ C14064he.m66708k4(m53319m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53316k4(float f) {
        this.f38337k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53318kk() {
        return m53198h4(13);
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53319m9() {
        return this.f38338x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m53320to() {
        return this.f38337k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Sx: {2}, Sy: {3}", super.toString(), Boolean.valueOf(m53318kk()), Float.valueOf(m53320to()), Float.valueOf(m53319m9()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53321x1(float f) {
        this.f38338x1 = f;
    }

    public C11009kp(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53317k4(C11009kp c11009kp) {
        return m53202k4((C10988bz) c11009kp) && C14064he.m66718x1(m53320to(), c11009kp.m53320to()) && C14064he.m66718x1(m53319m9(), c11009kp.m53319m9());
    }
}
