package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C11030uz extends AbstractC10991ca {

    /* JADX INFO: renamed from: k4 */
    private long f38362k4;

    public C11030uz() {
        m53208x1((short) 16425);
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
        return m53406k4((C11030uz) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (int) m53407kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53405k4(long j) {
        this.f38362k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final long m53407kk() {
        return this.f38362k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, StackIndex: {1}", super.toString(), Long.valueOf(m53407kk()));
    }

    public C11030uz(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53406k4(C11030uz c11030uz) {
        return m53407kk() == c11030uz.m53407kk();
    }
}
