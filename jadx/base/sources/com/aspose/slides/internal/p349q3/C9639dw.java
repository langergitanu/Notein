package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3862c5;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.dw */
/* JADX INFO: loaded from: classes4.dex */
public class C9639dw extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f34870k4;

    public C9639dw(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47159k4((C9639dw) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f34870k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47157k4() {
        return this.f34870k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, LayoutMode: {1}", super.toString(), C14042ak.m66410k4(C3862c5.class, m47157k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47158k4(long j) {
        this.f34870k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47159k4(C9639dw c9639dw) {
        return m47765k4((C9723vw) c9639dw) && this.f34870k4 == c9639dw.f34870k4;
    }
}
