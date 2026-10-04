package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.rq */
/* JADX INFO: loaded from: classes4.dex */
class C6175rq extends AbstractC7020m9<C6175rq> {

    /* JADX INFO: renamed from: k4 */
    public AbstractC6211yd f17420k4;

    /* JADX INFO: renamed from: x1 */
    public AbstractC6123ca f17421x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m24986x1(C6175rq c6175rq) {
        return C14067j2.m66728k4(c6175rq.f17420k4, this.f17420k4) && C14067j2.m66728k4(c6175rq.f17421x1, this.f17421x1);
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
        if (obj instanceof C6175rq) {
            return m24986x1((C6175rq) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C6175rq Clone() {
        C6175rq c6175rq = new C6175rq();
        CloneTo(c6175rq);
        return c6175rq;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6175rq c6175rq) {
        c6175rq.f17420k4 = this.f17420k4;
        c6175rq.f17421x1 = this.f17421x1;
    }
}
