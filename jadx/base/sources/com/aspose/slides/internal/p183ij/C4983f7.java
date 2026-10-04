package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9864dy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.f7 */
/* JADX INFO: loaded from: classes.dex */
public class C4983f7 extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private long f13633k4;

    public C4983f7() {
        m21557ck(98L);
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
        return m21009k4((C4983f7) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13633k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21007k4() {
        return this.f13633k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IcmMode: {1}", super.toString(), C14042ak.m66410k4(C9864dy.class, this.f13633k4));
    }

    public C4983f7(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21008k4(long j) {
        this.f13633k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21009k4(C4983f7 c4983f7) {
        return m21559k4((C5061vw) c4983f7) && this.f13633k4 == c4983f7.f13633k4;
    }
}
