package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.m2 */
/* JADX INFO: loaded from: classes5.dex */
public class C13392m2 extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private float f44801k4;

    /* JADX INFO: renamed from: x1 */
    private float f44802x1;

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
        return m62221k4((C13392m2) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(m62219k4()) * 397) ^ C14064he.m66708k4(m62222x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final float m62219k4() {
        return this.f44801k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m62222x1() {
        return this.f44802x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62220k4(float f) {
        this.f44801k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62223x1(float f) {
        this.f44802x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62221k4(C13392m2 c13392m2) {
        return C14064he.m66718x1(m62219k4(), c13392m2.m62219k4()) && C14064he.m66718x1(m62222x1(), c13392m2.m62222x1());
    }
}
