package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12506fa;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.qq */
/* JADX INFO: loaded from: classes.dex */
public class C5032qq extends AbstractC4967ca {

    /* JADX INFO: renamed from: k4 */
    private long f13818k4;

    /* JADX INFO: renamed from: x1 */
    private C12506fa f13819x1;

    public C5032qq(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21398k4((C5032qq) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = ((super.hashCode() * 397) ^ ((int) this.f13818k4)) * 397;
        C12506fa c12506fa = this.f13819x1;
        return iHashCode ^ (c12506fa != null ? c12506fa.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21395k4() {
        return this.f13818k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12506fa m21399x1() {
        return this.f13819x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21396k4(long j) {
        this.f13818k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21397k4(C12506fa c12506fa) {
        this.f13819x1 = c12506fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21398k4(C5032qq c5032qq) {
        return m21559k4((C5061vw) c5032qq) && this.f13818k4 == c5032qq.f13818k4 && C14067j2.m66728k4(this.f13819x1, c5032qq.f13819x1);
    }
}
