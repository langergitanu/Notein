package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ne */
/* JADX INFO: loaded from: classes.dex */
public class C4645ne extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int f12954k4;

    /* JADX INFO: renamed from: kk */
    private int f12955kk;

    /* JADX INFO: renamed from: x1 */
    private int f12956x1;

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
        return m19242k4((C4645ne) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 12;
    }

    public int hashCode() {
        return (((this.f12954k4 * 397) ^ this.f12956x1) * 397) ^ this.f12955kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19241k4(int i) {
        this.f12954k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19243kk(int i) {
        this.f12955kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19244x1(int i) {
        this.f12956x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19242k4(C4645ne c4645ne) {
        return this.f12954k4 == c4645ne.f12954k4 && this.f12956x1 == c4645ne.f12956x1 && this.f12955kk == c4645ne.f12955kk;
    }
}
