package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C4607ai extends C4657to {

    /* JADX INFO: renamed from: k4 */
    private int f12861k4;

    /* JADX INFO: renamed from: x1 */
    private int f12862x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4607ai.class) && m19016k4((C4607ai) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f12861k4 * 397) ^ this.f12862x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19018k4(int i) {
        this.f12862x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final int m19019kk() {
        return this.f12861k4;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Integer.valueOf(this.f12861k4), Integer.valueOf(this.f12862x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19020x1() {
        return this.f12862x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19016k4(C4607ai c4607ai) {
        return this.f12861k4 == c4607ai.f12861k4 && this.f12862x1 == c4607ai.f12862x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19021x1(int i) {
        this.f12861k4 = i;
    }
}
