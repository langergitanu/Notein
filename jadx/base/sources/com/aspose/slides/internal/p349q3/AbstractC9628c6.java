package com.aspose.slides.internal.p349q3;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9628c6 extends C9723vw {

    /* JADX INFO: renamed from: k4 */
    private int f34802k4;

    public AbstractC9628c6(C9723vw c9723vw) {
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
        return m47019k4((AbstractC9628c6) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ (this.f34802k4 & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47018k4(int i) {
        this.f34802k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final int m47020kk() {
        return this.f34802k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47019k4(AbstractC9628c6 abstractC9628c6) {
        return m47765k4((C9723vw) abstractC9628c6) && this.f34802k4 == abstractC9628c6.f34802k4;
    }
}
