package com.aspose.slides.internal.p260ly;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C6271dy extends C6268c5 {

    /* JADX INFO: renamed from: k4 */
    private long f17792k4;

    /* JADX INFO: renamed from: x1 */
    private long f17793x1;

    @Override // com.aspose.slides.internal.p260ly.C6268c5
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
        return m25495k4((C6271dy) obj);
    }

    @Override // com.aspose.slides.internal.p260ly.C6268c5
    public int hashCode() {
        return (((int) this.f17792k4) * 397) ^ ((int) this.f17793x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m25493k4() {
        return this.f17792k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25496x1() {
        return this.f17793x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25494k4(long j) {
        this.f17792k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25497x1(long j) {
        this.f17793x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25495k4(C6271dy c6271dy) {
        return this.f17792k4 == c6271dy.f17792k4 && this.f17793x1 == c6271dy.f17793x1;
    }
}
