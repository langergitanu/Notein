package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.m2 */
/* JADX INFO: loaded from: classes.dex */
public class C4642m2 extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private float f12948k4;

    /* JADX INFO: renamed from: x1 */
    private float f12949x1;

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
        return m19228k4((C4642m2) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (C14064he.m66708k4(m19226k4()) * 397) ^ C14064he.m66708k4(m19229x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final float m19226k4() {
        return this.f12948k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m19229x1() {
        return this.f12949x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19227k4(float f) {
        this.f12948k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19230x1(float f) {
        this.f12949x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19228k4(C4642m2 c4642m2) {
        return C14064he.m66718x1(m19226k4(), c4642m2.m19226k4()) && C14064he.m66718x1(m19229x1(), c4642m2.m19229x1());
    }
}
