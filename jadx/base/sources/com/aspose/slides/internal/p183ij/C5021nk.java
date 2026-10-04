package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p360qg.C9876x6;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.nk */
/* JADX INFO: loaded from: classes.dex */
public class C5021nk extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13779k4;

    public C5021nk(C5061vw c5061vw) {
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
        return m21316k4((C5021nk) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.f13779k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21314k4() {
        return this.f13779k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, StretchMode: {1}", super.toString(), C14042ak.m66410k4(C9876x6.class, m21314k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21315k4(int i) {
        this.f13779k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21316k4(C5021nk c5021nk) {
        return m21559k4((C5061vw) c5021nk) && this.f13779k4 == c5021nk.f13779k4;
    }
}
