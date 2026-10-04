package com.aspose.slides.internal.p151gj;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.rv */
/* JADX INFO: loaded from: classes.dex */
public class C4325rv extends AbstractC7020m9<C4325rv> {

    /* JADX INFO: renamed from: k4 */
    public byte f11813k4;

    /* JADX INFO: renamed from: kk */
    public byte f11814kk;

    /* JADX INFO: renamed from: x1 */
    public byte f11815x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m17401x1(C4325rv c4325rv) {
        return c4325rv.f11813k4 == this.f11813k4 && c4325rv.f11815x1 == this.f11815x1 && c4325rv.f11814kk == this.f11814kk;
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
        if (obj instanceof C4325rv) {
            return m17401x1((C4325rv) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4325rv Clone() {
        C4325rv c4325rv = new C4325rv();
        CloneTo(c4325rv);
        return c4325rv;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4325rv c4325rv) {
        c4325rv.f11813k4 = this.f11813k4;
        c4325rv.f11815x1 = this.f11815x1;
        c4325rv.f11814kk = this.f11814kk;
    }
}
