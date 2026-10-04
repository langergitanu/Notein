package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11034w6 extends AbstractC10996e0 {

    /* JADX INFO: renamed from: k4 */
    private long f38365k4;

    /* JADX INFO: renamed from: x1 */
    private long f38366x1;

    public C11034w6() {
        m53208x1((short) 16413);
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
        return m53418k4((C11034w6) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ ((int) m53419kk())) * 397) ^ ((int) m53420to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53417k4(long j) {
        this.f38365k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m53419kk() {
        return this.f38365k4;
    }

    /* JADX INFO: renamed from: to */
    public final long m53420to() {
        return this.f38366x1;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, X: {1}, Y: {2}", super.toString(), Long.valueOf(m53419kk()), Long.valueOf(m53420to()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53421x1(long j) {
        this.f38366x1 = j;
    }

    public C11034w6(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53418k4(C11034w6 c11034w6) {
        return m53202k4((C10988bz) c11034w6) && m53419kk() == c11034w6.m53419kk() && m53420to() == c11034w6.m53420to();
    }
}
