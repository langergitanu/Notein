package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.fv */
/* JADX INFO: loaded from: classes3.dex */
class C1122fv extends AbstractC7020m9<C1122fv> {

    /* JADX INFO: renamed from: k4 */
    public oju f5136k4 = new oju();

    /* JADX INFO: renamed from: kk */
    public boolean f5137kk;

    /* JADX INFO: renamed from: to */
    public boolean f5138to;

    /* JADX INFO: renamed from: x1 */
    public float f5139x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m6332x1(C1122fv c1122fv) {
        return C14067j2.m66728k4(c1122fv.f5136k4, this.f5136k4) && c1122fv.f5139x1 == this.f5139x1 && c1122fv.f5137kk == this.f5137kk && c1122fv.f5138to == this.f5138to;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C1122fv) {
            return m6332x1((C1122fv) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f5136k4, Float.valueOf(this.f5139x1), Boolean.valueOf(this.f5137kk), Boolean.valueOf(this.f5138to));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C1122fv Clone() {
        C1122fv c1122fv = new C1122fv();
        CloneTo(c1122fv);
        return c1122fv;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C1122fv c1122fv) {
        this.f5136k4.CloneTo(c1122fv.f5136k4);
        c1122fv.f5139x1 = this.f5139x1;
        c1122fv.f5137kk = this.f5137kk;
        c1122fv.f5138to = this.f5138to;
    }
}
