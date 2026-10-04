package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1495ss;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.tq */
/* JADX INFO: loaded from: classes4.dex */
public class C11025tq extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private float f38355k4;

    public C11025tq() {
        m53208x1((short) 16432);
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
        return m53384k4((C11025tq) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (super.hashCode() * 397) ^ C14064he.m66708k4(m53386to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53383k4(float f) {
        this.f38355k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final int m53385kk() {
        return m53209x6() & 255;
    }

    /* JADX INFO: renamed from: to */
    public final float m53386to() {
        return this.f38355k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PageUnit: {1}, PageScale: {2}", super.toString(), C14042ak.m66410k4(C1495ss.class, m53385kk()), Float.valueOf(m53386to()));
    }

    public C11025tq(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53384k4(C11025tq c11025tq) {
        return m53202k4((C10988bz) c11025tq) && C14064he.m66718x1(m53386to(), c11025tq.m53386to());
    }
}
