package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.lr */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11011lr extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private int f38341k4;

    public AbstractC11011lr() {
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m53331ck() {
        return m53198h4(15);
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
        return m53333k4((AbstractC11011lr) obj);
    }

    /* JADX INFO: renamed from: fa */
    public final int m53332fa() {
        return this.f38341k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.f38341k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53333k4(AbstractC11011lr abstractC11011lr) {
        return m53202k4((C10988bz) abstractC11011lr) && this.f38341k4 == abstractC11011lr.f38341k4;
    }

    /* JADX INFO: renamed from: to */
    public final void m53334to(int i) {
        this.f38341k4 = i;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, BrushId: {1}", super.toString(), Integer.valueOf(this.f38341k4));
    }

    public AbstractC11011lr(C10988bz c10988bz) {
        super(c10988bz);
    }
}
