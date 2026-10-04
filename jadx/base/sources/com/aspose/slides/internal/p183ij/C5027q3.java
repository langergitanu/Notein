package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9867jd;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.q3 */
/* JADX INFO: loaded from: classes.dex */
public class C5027q3 extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private long f13806k4;

    public C5027q3(C5061vw c5061vw) {
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
        return m21375k4((C5027q3) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13806k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21373k4() {
        return this.f13806k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, MapMode: {1}", super.toString(), C14042ak.m66410k4(C9867jd.class, m21373k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21374k4(long j) {
        this.f13806k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21375k4(C5027q3 c5027q3) {
        return m21559k4((C5061vw) c5027q3) && this.f13806k4 == c5027q3.f13806k4;
    }
}
