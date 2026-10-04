package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.o9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9686o9 extends AbstractC9622bs {

    /* JADX INFO: renamed from: k4 */
    private long f35049k4;

    public C9686o9(C9723vw c9723vw) {
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
        return m47553k4((C9686o9) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35049k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47551k4() {
        return this.f35049k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47552k4(long j) {
        this.f35049k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47553k4(C9686o9 c9686o9) {
        return m47765k4((C9723vw) c9686o9) && this.f35049k4 == c9686o9.f35049k4;
    }
}
