package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p377r9.C9984k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.r7 */
/* JADX INFO: loaded from: classes4.dex */
public class C9696r7 extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private int f35070k4;

    public C9696r7(C9723vw c9723vw) {
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
        return m47601k4((C9696r7) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ (this.f35070k4 & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47599k4() {
        return this.f35070k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, Rop2Mode: {1}", super.toString(), C14042ak.m66410k4(C9984k4.class, m47599k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47600k4(int i) {
        this.f35070k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47601k4(C9696r7 c9696r7) {
        return m47765k4((C9723vw) c9696r7) && this.f35070k4 == c9696r7.f35070k4;
    }
}
