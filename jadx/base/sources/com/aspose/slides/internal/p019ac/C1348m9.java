package com.aspose.slides.internal.p019ac;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1348m9 extends C1337c5 {

    /* JADX INFO: renamed from: k4 */
    private long f5853k4;

    /* JADX INFO: renamed from: kk */
    private long f5854kk;

    /* JADX INFO: renamed from: x1 */
    private long f5855x1;

    @Override // com.aspose.slides.internal.p019ac.C1337c5
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
        return m7949k4((C1348m9) obj);
    }

    @Override // com.aspose.slides.internal.p019ac.C1337c5
    public int hashCode() {
        return (((((int) this.f5853k4) * 397) ^ ((int) this.f5855x1)) * 397) ^ ((int) this.f5854kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7948k4(long j) {
        this.f5853k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m7950kk(long j) {
        this.f5854kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7951x1(long j) {
        this.f5855x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7949k4(C1348m9 c1348m9) {
        return this.f5853k4 == c1348m9.f5853k4 && this.f5855x1 == c1348m9.f5855x1 && this.f5854kk == c1348m9.f5854kk;
    }
}
