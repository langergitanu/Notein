package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.k5 */
/* JADX INFO: loaded from: classes.dex */
public class C5005k5 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private float f13733k4;

    public C5005k5(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21220k4((C5005k5) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ C7019kk.m27462to(Float.valueOf(this.f13733k4), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m21218k4() {
        return this.f13733k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, MiterLimit: {1}", super.toString(), Float.valueOf(m21218k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21219k4(float f) {
        this.f13733k4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21220k4(C5005k5 c5005k5) {
        return m21559k4((C5061vw) c5005k5) && this.f13733k4 == c5005k5.f13733k4;
    }
}
