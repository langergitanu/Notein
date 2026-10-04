package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.yd */
/* JADX INFO: loaded from: classes4.dex */
public class C9741yd extends AbstractC9622bs {

    /* JADX INFO: renamed from: k4 */
    private long f35191k4;

    public C9741yd(C9723vw c9723vw) {
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
        return m47872k4((C9741yd) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35191k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47870k4() {
        return this.f35191k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47871k4(long j) {
        this.f35191k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47872k4(C9741yd c9741yd) {
        return m47765k4((C9723vw) c9741yd) && this.f35191k4 == c9741yd.f35191k4;
    }
}
