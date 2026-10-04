package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9861c5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.dw */
/* JADX INFO: loaded from: classes.dex */
public class C4977dw extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13623k4;

    public C4977dw(C5061vw c5061vw) {
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
        return m20984k4((C4977dw) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13623k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m20982k4() {
        return this.f13623k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, LayoutMode: {1}", super.toString(), C14042ak.m66410k4(C9861c5.class, m20982k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20983k4(long j) {
        this.f13623k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20984k4(C4977dw c4977dw) {
        return m21559k4((C5061vw) c4977dw) && this.f13623k4 == c4977dw.f13623k4;
    }
}
