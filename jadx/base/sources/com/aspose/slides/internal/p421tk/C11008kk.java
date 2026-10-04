package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p539z4.C13387k4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11008kk extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private C13387k4 f38336k4;

    public C11008kk() {
        m53208x1((short) 16393);
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
        return m53315k4((C11008kk) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        C13387k4 c13387k4 = this.f38336k4;
        if (c13387k4 != null) {
            return c13387k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13387k4 m53313k4() {
        return this.f38336k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("[{0}, Color: {1}]", super.toString(), this.f38336k4);
    }

    public C11008kk(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53314k4(C13387k4 c13387k4) {
        this.f38336k4 = c13387k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53315k4(C11008kk c11008kk) {
        return C14067j2.m66728k4(this.f38336k4, c11008kk.f38336k4);
    }
}
