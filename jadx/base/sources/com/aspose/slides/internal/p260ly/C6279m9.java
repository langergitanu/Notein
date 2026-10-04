package com.aspose.slides.internal.p260ly;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6279m9 extends C6268c5 {

    /* JADX INFO: renamed from: k4 */
    private long f17837k4;

    /* JADX INFO: renamed from: kk */
    private long f17838kk;

    /* JADX INFO: renamed from: x1 */
    private long f17839x1;

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
        return m25594k4((C6279m9) obj);
    }

    @Override // com.aspose.slides.internal.p260ly.C6268c5
    public int hashCode() {
        return (((((int) this.f17837k4) * 397) ^ ((int) this.f17839x1)) * 397) ^ ((int) this.f17838kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m25592k4() {
        return this.f17837k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m25595kk() {
        return this.f17838kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m25597x1() {
        return this.f17839x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25593k4(long j) {
        this.f17837k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25596kk(long j) {
        this.f17838kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25598x1(long j) {
        this.f17839x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25594k4(C6279m9 c6279m9) {
        return this.f17837k4 == c6279m9.f17837k4 && this.f17839x1 == c6279m9.f17839x1 && this.f17838kk == c6279m9.f17838kk;
    }
}
