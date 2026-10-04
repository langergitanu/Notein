package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.qn */
/* JADX INFO: loaded from: classes4.dex */
public class C9693qn extends AbstractC9622bs {

    /* JADX INFO: renamed from: k4 */
    private long f35063k4;

    /* JADX INFO: renamed from: x1 */
    private long f35064x1;

    public C9693qn(C9723vw c9723vw) {
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
        return m47584k4((C9693qn) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35063k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47582k4() {
        return this.f35063k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47585x1() {
        return this.f35064x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47583k4(long j) {
        this.f35063k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47586x1(long j) {
        this.f35064x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47584k4(C9693qn c9693qn) {
        return m47765k4((C9723vw) c9693qn) && this.f35063k4 == c9693qn.f35063k4;
    }
}
