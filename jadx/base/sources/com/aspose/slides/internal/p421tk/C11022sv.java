package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C11022sv extends AbstractC10991ca {

    /* JADX INFO: renamed from: k4 */
    private long f38353k4;

    public C11022sv() {
        m53208x1((short) 16422);
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
        return m53376k4((C11022sv) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) m53377kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53375k4(long j) {
        this.f38353k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m53377kk() {
        return this.f38353k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StackIndex: {1}", super.toString(), Long.valueOf(m53377kk()));
    }

    public C11022sv(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53376k4(C11022sv c11022sv) {
        return m53202k4((C10988bz) c11022sv) && m53377kk() == c11022sv.m53377kk();
    }
}
