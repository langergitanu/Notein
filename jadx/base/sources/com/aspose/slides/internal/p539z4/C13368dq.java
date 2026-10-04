package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.dq */
/* JADX INFO: loaded from: classes5.dex */
public final class C13368dq extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private float f44735k4;

    /* JADX INFO: renamed from: kk */
    private long f44736kk;

    /* JADX INFO: renamed from: x1 */
    private float f44737x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13368dq.class) && m62073k4((C13368dq) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 12;
    }

    public int hashCode() {
        return (((C14064he.m66708k4(this.f44735k4) * 397) ^ C14064he.m66708k4(this.f44737x1)) * 397) ^ ((int) this.f44736kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m62074k4() {
        return this.f44735k4;
    }

    public String toString() {
        return C14113y2.m67402k4("FocusScaleX: {0}, FocusScaleY: {1}, FocusScaleCount: {2}", Float.valueOf(this.f44735k4), Float.valueOf(this.f44737x1), Long.valueOf(this.f44736kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m62077x1() {
        return this.f44737x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62075k4(float f) {
        this.f44735k4 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62078x1(float f) {
        this.f44737x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62076k4(long j) {
        this.f44736kk = j;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62073k4(C13368dq c13368dq) {
        return C14064he.m66718x1(this.f44735k4, c13368dq.f44735k4) && C14064he.m66718x1(this.f44737x1, c13368dq.f44737x1) && this.f44736kk == c13368dq.f44736kk;
    }
}
