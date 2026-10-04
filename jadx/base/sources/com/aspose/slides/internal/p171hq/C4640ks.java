package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4640ks extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int f12935k4;

    /* JADX INFO: renamed from: x1 */
    private int f12936x1;

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
        return m19201k4((C4640ks) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f12935k4 * 397) ^ this.f12936x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19200k4(int i) {
        this.f12935k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19202x1(int i) {
        this.f12936x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19201k4(C4640ks c4640ks) {
        return this.f12935k4 == c4640ks.f12935k4 && this.f12936x1 == c4640ks.f12936x1;
    }
}
