package com.aspose.slides.internal.p019ac;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1342h4 extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private long f5814k4;

    /* JADX INFO: renamed from: kk */
    private long f5815kk;

    /* JADX INFO: renamed from: x1 */
    private long f5816x1;

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
        return m7895k4((C1342h4) obj);
    }

    public int hashCode() {
        return (((((int) this.f5814k4) * 397) ^ ((int) this.f5816x1)) * 397) ^ ((int) this.f5815kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m7893k4() {
        return this.f5814k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m7896kk() {
        return this.f5815kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m7898x1() {
        return this.f5816x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7894k4(long j) {
        this.f5814k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m7897kk(long j) {
        this.f5815kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7899x1(long j) {
        this.f5816x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7895k4(C1342h4 c1342h4) {
        return this.f5814k4 == c1342h4.f5814k4 && this.f5816x1 == c1342h4.f5816x1 && this.f5815kk == c1342h4.f5815kk;
    }
}
