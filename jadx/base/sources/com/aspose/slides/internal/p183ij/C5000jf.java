package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.jf */
/* JADX INFO: loaded from: classes.dex */
public class C5000jf extends AbstractC4960bs {

    /* JADX INFO: renamed from: k4 */
    private long f13711k4;

    public C5000jf(C5061vw c5061vw) {
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
        return m21172k4((C5000jf) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13711k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21170k4() {
        return this.f13711k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21171k4(long j) {
        this.f13711k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21172k4(C5000jf c5000jf) {
        return m21559k4((C5061vw) c5000jf) && this.f13711k4 == c5000jf.f13711k4;
    }
}
