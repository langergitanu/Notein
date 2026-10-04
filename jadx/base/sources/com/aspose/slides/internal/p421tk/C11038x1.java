package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11038x1 extends AbstractC10991ca {

    /* JADX INFO: renamed from: k4 */
    private long f38368k4;

    public C11038x1() {
        m53208x1((short) 16424);
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
        return m53428k4((C11038x1) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (int) m53426k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m53426k4() {
        return this.f38368k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StackIndex: {1}", super.toString(), Long.valueOf(m53426k4()));
    }

    public C11038x1(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53427k4(long j) {
        this.f38368k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53428k4(C11038x1 c11038x1) {
        return m53426k4() == c11038x1.m53426k4();
    }
}
