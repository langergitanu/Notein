package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9862ck;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.zj */
/* JADX INFO: loaded from: classes.dex */
public class C5087zj extends AbstractC4993hq {

    /* JADX INFO: renamed from: k4 */
    private long f13983k4;

    public C5087zj(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4993hq, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21734k4((C5087zj) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4993hq, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13983k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21732k4() {
        return this.f13983k4;
    }

    @Override // com.aspose.slides.internal.p183ij.AbstractC4993hq, com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, ModifyWorldTransformMode: {1}", super.toString(), C14042ak.m66410k4(C9862ck.class, this.f13983k4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21733k4(long j) {
        this.f13983k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21734k4(C5087zj c5087zj) {
        return m21089k4((AbstractC4993hq) c5087zj) && this.f13983k4 == c5087zj.f13983k4;
    }
}
