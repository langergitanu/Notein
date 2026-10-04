package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ca */
/* JADX INFO: loaded from: classes5.dex */
public final class C13366ca extends AbstractC13369du {

    /* JADX INFO: renamed from: k4 */
    private float f44729k4;

    /* JADX INFO: renamed from: kk */
    private float f44730kk;

    /* JADX INFO: renamed from: to */
    private float f44731to;

    /* JADX INFO: renamed from: x1 */
    private float f44732x1;

    public C13366ca() {
    }

    /* JADX INFO: renamed from: du */
    public final float m62061du() {
        return this.f44731to;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13366ca.class) && m62060k4((C13366ca) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 16;
    }

    public int hashCode() {
        return (((((C14064he.m66708k4(this.f44729k4) * 397) ^ C14064he.m66708k4(this.f44732x1)) * 397) ^ C14064he.m66708k4(this.f44730kk)) * 397) ^ C14064he.m66708k4(this.f44731to);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13369du
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo62062k4() {
        return new C12007ix(this.f44729k4, this.f44732x1, this.f44730kk, this.f44731to);
    }

    /* JADX INFO: renamed from: kk */
    public final float m62064kk() {
        return this.f44732x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m62066to() {
        return this.f44730kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", Float.valueOf(this.f44729k4), Float.valueOf(this.f44732x1), Float.valueOf(this.f44730kk), Float.valueOf(this.f44731to));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m62068x1() {
        return this.f44729k4;
    }

    public C13366ca(C12007ix c12007ix) {
        this.f44729k4 = c12007ix.m56557jd();
        this.f44732x1 = c12007ix.m56551ck();
        this.f44730kk = c12007ix.m56550c5();
        this.f44731to = c12007ix.m56575x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62063k4(float f) {
        this.f44729k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m62065kk(float f) {
        this.f44730kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m62067to(float f) {
        this.f44731to = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62069x1(float f) {
        this.f44732x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62060k4(C13366ca c13366ca) {
        return C14064he.m66718x1(this.f44729k4, c13366ca.f44729k4) && C14064he.m66718x1(this.f44732x1, c13366ca.f44732x1) && C14064he.m66718x1(this.f44730kk, c13366ca.f44730kk) && C14064he.m66718x1(this.f44731to, c13366ca.f44731to);
    }
}
