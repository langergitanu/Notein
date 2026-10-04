package com.aspose.slides.internal.p019ac;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ac.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1352to extends AbstractC1349ne {

    /* JADX INFO: renamed from: k4 */
    private int f5865k4;

    /* JADX INFO: renamed from: kk */
    private long f5866kk;

    /* JADX INFO: renamed from: to */
    private long f5867to;

    /* JADX INFO: renamed from: x1 */
    private long f5868x1;

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
        return m7977k4((C1352to) obj);
    }

    public int hashCode() {
        return (((((this.f5865k4 * 397) ^ ((int) this.f5868x1)) * 397) ^ ((int) this.f5866kk)) * 397) ^ ((int) this.f5867to);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m7974k4() {
        return this.f5866kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m7978kk(long j) {
        this.f5867to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7979x1(long j) {
        this.f5866kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7975k4(int i) {
        this.f5865k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7976k4(long j) {
        this.f5868x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7977k4(C1352to c1352to) {
        return this.f5865k4 == c1352to.f5865k4 && this.f5868x1 == c1352to.f5868x1 && this.f5866kk == c1352to.f5866kk && this.f5867to == c1352to.f5867to;
    }
}
