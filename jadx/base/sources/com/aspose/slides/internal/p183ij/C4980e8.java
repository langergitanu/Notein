package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.e8 */
/* JADX INFO: loaded from: classes.dex */
public class C4980e8 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13629k4;

    public C4980e8(C5061vw c5061vw) {
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
        return m20999k4((C4980e8) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13629k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20997k4() {
        return this.f13629k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20998k4(long j) {
        this.f13629k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20999k4(C4980e8 c4980e8) {
        return m21559k4((C5061vw) c4980e8) && this.f13629k4 == c4980e8.f13629k4;
    }
}
