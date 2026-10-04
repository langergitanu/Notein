package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3869k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.xi */
/* JADX INFO: loaded from: classes4.dex */
public class C9734xi extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private long f35175k4;

    public C9734xi(C9723vw c9723vw) {
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
        return m47838k4((C9734xi) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f35175k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47836k4() {
        return this.f35175k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, BackgroundMode: {1}", super.toString(), C14042ak.m66410k4(C3869k4.class, m47836k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47837k4(long j) {
        this.f35175k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47838k4(C9734xi c9734xi) {
        return m47765k4((C9723vw) c9734xi) && this.f35175k4 == c9734xi.f35175k4;
    }
}
