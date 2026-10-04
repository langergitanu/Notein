package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3863ck;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.zj */
/* JADX INFO: loaded from: classes4.dex */
public class C9749zj extends AbstractC9655hq {

    /* JADX INFO: renamed from: k4 */
    private long f35230k4;

    public C9749zj(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9655hq, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47959k4((C9749zj) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9655hq, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35230k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47957k4() {
        return this.f35230k4;
    }

    @Override // com.aspose.slides.internal.p349q3.AbstractC9655hq, com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, ModifyWorldTransformMode: {1}", super.toString(), C14042ak.m66410k4(C3863ck.class, this.f35230k4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47958k4(long j) {
        this.f35230k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47959k4(C9749zj c9749zj) {
        return m47268k4((AbstractC9655hq) c9749zj) && this.f35230k4 == c9749zj.f35230k4;
    }
}
