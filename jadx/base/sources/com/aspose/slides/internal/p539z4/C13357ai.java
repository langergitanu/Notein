package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ai */
/* JADX INFO: loaded from: classes5.dex */
public final class C13357ai extends C13407to {

    /* JADX INFO: renamed from: k4 */
    private int f44714k4;

    /* JADX INFO: renamed from: x1 */
    private int f44715x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13357ai.class) && m62022k4((C13357ai) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 8;
    }

    public int hashCode() {
        return (this.f44714k4 * 397) ^ this.f44715x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62024k4(int i) {
        this.f44715x1 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62025kk() {
        return this.f44714k4;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Integer.valueOf(this.f44714k4), Integer.valueOf(this.f44715x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62026x1() {
        return this.f44715x1;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62022k4(C13357ai c13357ai) {
        return this.f44714k4 == c13357ai.f44714k4 && this.f44715x1 == c13357ai.f44715x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62027x1(int i) {
        this.f44714k4 = i;
    }
}
