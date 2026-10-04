package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4966c6 extends C5061vw {

    /* JADX INFO: renamed from: k4 */
    private int f13555k4;

    public AbstractC4966c6(C5061vw c5061vw) {
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
        return m20854k4((AbstractC4966c6) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ (this.f13555k4 & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m20853k4(int i) {
        this.f13555k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m20854k4(AbstractC4966c6 abstractC4966c6) {
        return m21559k4((C5061vw) abstractC4966c6) && this.f13555k4 == abstractC4966c6.f13555k4;
    }
}
