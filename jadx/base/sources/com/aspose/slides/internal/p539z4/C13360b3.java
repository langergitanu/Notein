package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.b3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13360b3 extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private C13362bv f44718k4;

    /* JADX INFO: renamed from: x1 */
    private long f44719x1;

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
        return m62035k4((C13360b3) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return this.f44718k4.mo62023h4() + 4;
    }

    public int hashCode() {
        C13362bv c13362bv = this.f44718k4;
        return ((c13362bv != null ? c13362bv.hashCode() : 0) * 397) ^ ((int) this.f44719x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13362bv m62032k4() {
        return this.f44718k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62033k4(long j) {
        this.f44719x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62034k4(C13362bv c13362bv) {
        this.f44718k4 = c13362bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62035k4(C13360b3 c13360b3) {
        return C14067j2.m66728k4(this.f44718k4, c13360b3.f44718k4) && this.f44719x1 == c13360b3.f44719x1;
    }
}
