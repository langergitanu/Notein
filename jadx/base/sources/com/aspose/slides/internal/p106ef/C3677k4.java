package com.aspose.slides.internal.p106ef;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ef.k4 */
/* JADX INFO: loaded from: classes3.dex */
class C3677k4 extends AbstractC7020m9<C3677k4> {

    /* JADX INFO: renamed from: kk */
    static final /* synthetic */ boolean f10199kk = true;

    /* JADX INFO: renamed from: k4 */
    public int f10200k4;

    /* JADX INFO: renamed from: x1 */
    public int f10201x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m14893x1(C3677k4 c3677k4) {
        return c3677k4.f10200k4 == this.f10200k4 && c3677k4.f10201x1 == this.f10201x1;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f10199kk && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C3677k4) {
            return m14893x1((C3677k4) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3677k4 Clone() {
        C3677k4 c3677k4 = new C3677k4();
        CloneTo(c3677k4);
        return c3677k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3677k4 c3677k4) {
        c3677k4.f10200k4 = this.f10200k4;
        c3677k4.f10201x1 = this.f10201x1;
    }
}
