package com.aspose.slides.internal.p019ac;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.dy */
/* JADX INFO: loaded from: classes3.dex */
public class C1340dy extends C1337c5 {

    /* JADX INFO: renamed from: k4 */
    private long f5808k4;

    /* JADX INFO: renamed from: x1 */
    private long f5809x1;

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
        return m7882k4((C1340dy) obj);
    }

    @Override // com.aspose.slides.internal.p019ac.C1337c5
    public int hashCode() {
        return (((int) this.f5808k4) * 397) ^ ((int) this.f5809x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7881k4(long j) {
        this.f5808k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7883x1(long j) {
        this.f5809x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7882k4(C1340dy c1340dy) {
        return this.f5808k4 == c1340dy.f5808k4 && this.f5809x1 == c1340dy.f5809x1;
    }
}
