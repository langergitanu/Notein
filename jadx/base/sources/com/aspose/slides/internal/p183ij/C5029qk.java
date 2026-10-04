package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.qk */
/* JADX INFO: loaded from: classes.dex */
public class C5029qk extends AbstractC5023o3 {

    /* JADX INFO: renamed from: k4 */
    private int f13813k4;

    public C5029qk() {
        m21557ck(34L);
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
        return m21385k4((C5029qk) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.f13813k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m21383k4() {
        return this.f13813k4;
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public String toString() {
        return C14113y2.m67402k4("{0}, SavedDc: {1}", super.toString(), Integer.valueOf(this.f13813k4));
    }

    public C5029qk(C5061vw c5061vw) {
        super(c5061vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21384k4(int i) {
        this.f13813k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21385k4(C5029qk c5029qk) {
        return m21559k4((C5061vw) c5029qk) && this.f13813k4 == c5029qk.f13813k4;
    }
}
