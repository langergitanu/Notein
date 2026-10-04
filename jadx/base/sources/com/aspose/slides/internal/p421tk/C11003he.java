package com.aspose.slides.internal.p421tk;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.he */
/* JADX INFO: loaded from: classes4.dex */
public class C11003he extends AbstractC10986bs {

    /* JADX INFO: renamed from: k4 */
    private float f38320k4;

    /* JADX INFO: renamed from: x1 */
    private float f38321x1;

    public C11003he() {
        m53208x1((short) 16429);
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
        return m53272k4((C11003he) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        return (((super.hashCode() * 397) ^ C14064he.m66708k4(m53275to())) * 397) ^ C14064he.m66708k4(m53274m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53271k4(float f) {
        this.f38320k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53273kk() {
        return m53198h4(13);
    }

    /* JADX INFO: renamed from: m9 */
    public final float m53274m9() {
        return this.f38321x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m53275to() {
        return this.f38320k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, PostMultipledMatrix: {1}, Dx: {2}, Dy: {3}", super.toString(), Boolean.valueOf(m53273kk()), Float.valueOf(m53275to()), Float.valueOf(m53274m9()));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53276x1(float f) {
        this.f38321x1 = f;
    }

    public C11003he(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53272k4(C11003he c11003he) {
        return m53202k4((C10988bz) c11003he) && C14064he.m66718x1(m53275to(), c11003he.m53275to()) && C14064he.m66718x1(m53274m9(), c11003he.m53274m9());
    }
}
