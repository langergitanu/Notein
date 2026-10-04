package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.jf */
/* JADX INFO: loaded from: classes4.dex */
public class C9662jf extends AbstractC9622bs {

    /* JADX INFO: renamed from: k4 */
    private long f34958k4;

    public C9662jf(C9723vw c9723vw) {
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
        return m47355k4((C9662jf) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34958k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47353k4() {
        return this.f34958k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47354k4(long j) {
        this.f34958k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47355k4(C9662jf c9662jf) {
        return m47765k4((C9723vw) c9662jf) && this.f34958k4 == c9662jf.f34958k4;
    }
}
