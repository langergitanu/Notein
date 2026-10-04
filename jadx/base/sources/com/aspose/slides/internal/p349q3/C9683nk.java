package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p124f7.C3877x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.nk */
/* JADX INFO: loaded from: classes4.dex */
public class C9683nk extends AbstractC9685o3 {

    /* JADX INFO: renamed from: k4 */
    private int f35026k4;

    public C9683nk(C9723vw c9723vw) {
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
        return m47505k4((C9683nk) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.f35026k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m47503k4() {
        return this.f35026k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, StretchMode: {1}", super.toString(), C14042ak.m66410k4(C3877x6.class, m47503k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47504k4(int i) {
        this.f35026k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47505k4(C9683nk c9683nk) {
        return m47765k4((C9723vw) c9683nk) && this.f35026k4 == c9683nk.f35026k4;
    }
}
