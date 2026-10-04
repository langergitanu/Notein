package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.n3 */
/* JADX INFO: loaded from: classes.dex */
public class C5017n3 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13772k4;

    public C5017n3(C5061vw c5061vw) {
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
        return m21299k4((C5017n3) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13772k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21297k4() {
        return this.f13772k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, TextAlignmentMode: {1}", super.toString(), Long.valueOf(m21297k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21298k4(long j) {
        this.f13772k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21299k4(C5017n3 c5017n3) {
        return m21559k4((C5061vw) c5017n3) && this.f13772k4 == c5017n3.f13772k4;
    }
}
