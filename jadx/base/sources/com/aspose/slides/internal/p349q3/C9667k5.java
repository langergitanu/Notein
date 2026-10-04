package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.k5 */
/* JADX INFO: loaded from: classes4.dex */
public class C9667k5 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private float f34980k4;

    public C9667k5(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47403k4((C9667k5) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ C7019kk.m27462to(Float.valueOf(this.f34980k4), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m47401k4() {
        return this.f34980k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, MiterLimit: {1}", super.toString(), Float.valueOf(m47401k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47402k4(float f) {
        this.f34980k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47403k4(C9667k5 c9667k5) {
        return m47765k4((C9723vw) c9667k5) && this.f34980k4 == c9667k5.f34980k4;
    }
}
