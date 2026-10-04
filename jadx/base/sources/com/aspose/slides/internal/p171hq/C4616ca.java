package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C4616ca extends AbstractC4619du {

    /* JADX INFO: renamed from: k4 */
    private float f12876k4;

    /* JADX INFO: renamed from: kk */
    private float f12877kk;

    /* JADX INFO: renamed from: to */
    private float f12878to;

    /* JADX INFO: renamed from: x1 */
    private float f12879x1;

    public C4616ca() {
    }

    /* JADX INFO: renamed from: du */
    public final float m19057du() {
        return this.f12878to;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4616ca.class) && m19056k4((C4616ca) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 16;
    }

    public int hashCode() {
        return (((((C14064he.m66708k4(this.f12876k4) * 397) ^ C14064he.m66708k4(this.f12879x1)) * 397) ^ C14064he.m66708k4(this.f12877kk)) * 397) ^ C14064he.m66708k4(this.f12878to);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4619du
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo19058k4() {
        return new C12007ix(this.f12876k4, this.f12879x1, this.f12877kk, this.f12878to);
    }

    /* JADX INFO: renamed from: kk */
    public final float m19060kk() {
        return this.f12879x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m19062to() {
        return this.f12877kk;
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", Float.valueOf(this.f12876k4), Float.valueOf(this.f12879x1), Float.valueOf(this.f12877kk), Float.valueOf(this.f12878to));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m19064x1() {
        return this.f12876k4;
    }

    public C4616ca(C12007ix c12007ix) {
        this.f12876k4 = c12007ix.m56557jd();
        this.f12879x1 = c12007ix.m56551ck();
        this.f12877kk = c12007ix.m56550c5();
        this.f12878to = c12007ix.m56575x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19059k4(float f) {
        this.f12876k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m19061kk(float f) {
        this.f12877kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m19063to(float f) {
        this.f12878to = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19065x1(float f) {
        this.f12879x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19056k4(C4616ca c4616ca) {
        return C14064he.m66718x1(this.f12876k4, c4616ca.f12876k4) && C14064he.m66718x1(this.f12879x1, c4616ca.f12879x1) && C14064he.m66718x1(this.f12877kk, c4616ca.f12877kk) && C14064he.m66718x1(this.f12878to, c4616ca.f12878to);
    }
}
