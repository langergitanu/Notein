package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.b3 */
/* JADX INFO: loaded from: classes.dex */
public class C4957b3 extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private long f13537k4;

    public C4957b3(C5061vw c5061vw) {
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
        return m20813k4((C4957b3) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13537k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20811k4() {
        return this.f13537k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, ObjectHandle: {1}", super.toString(), Long.valueOf(m20811k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20812k4(long j) {
        this.f13537k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20813k4(C4957b3 c4957b3) {
        return m21559k4((C5061vw) c4957b3) && this.f13537k4 == c4957b3.f13537k4;
    }
}
