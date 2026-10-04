package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9870ks;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.lm */
/* JADX INFO: loaded from: classes.dex */
public class C5009lm extends AbstractC4965c5 {

    /* JADX INFO: renamed from: k4 */
    private long f13741k4;

    public C5009lm(C5061vw c5061vw) {
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
        return m21236k4((C5009lm) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13741k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21234k4() {
        return this.f13741k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, RegionMode: {1}", super.toString(), C14042ak.m66410k4(C9870ks.class, m21234k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21235k4(long j) {
        this.f13741k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21236k4(C5009lm c5009lm) {
        return m21559k4((C5061vw) c5009lm) && this.f13741k4 == c5009lm.f13741k4;
    }
}
