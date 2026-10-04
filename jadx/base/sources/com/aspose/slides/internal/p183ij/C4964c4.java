package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.c4 */
/* JADX INFO: loaded from: classes.dex */
public class C4964c4 extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private long f13554k4;

    public C4964c4(C5061vw c5061vw) {
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
        return m20852k4((C4964c4) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13554k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20850k4() {
        return this.f13554k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhObject: {1:X4}", super.toString(), Long.valueOf(this.f13554k4));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20851k4(long j) {
        this.f13554k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20852k4(C4964c4 c4964c4) {
        return m21559k4((C5061vw) c4964c4) && this.f13554k4 == c4964c4.f13554k4;
    }
}
