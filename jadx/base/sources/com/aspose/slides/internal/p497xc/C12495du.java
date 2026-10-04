package com.aspose.slides.internal.p497xc;

import com.aspose.slides.internal.p151gj.C4325rv;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xc.du */
/* JADX INFO: loaded from: classes5.dex */
public class C12495du extends AbstractC7020m9<C12495du> {

    /* JADX INFO: renamed from: k4 */
    public int f41807k4;

    /* JADX INFO: renamed from: kk */
    public int f41808kk;

    /* JADX INFO: renamed from: to */
    public int f41809to;

    /* JADX INFO: renamed from: x1 */
    public int f41810x1;

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
        if (obj instanceof C12495du) {
            return m58045x1((C12495du) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4325rv m58046k4() {
        C4325rv c4325rv = new C4325rv();
        c4325rv.f11814kk = (byte) this.f41807k4;
        c4325rv.f11815x1 = (byte) this.f41810x1;
        c4325rv.f11813k4 = (byte) this.f41808kk;
        return c4325rv;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C12495du Clone() {
        C12495du c12495du = new C12495du();
        CloneTo(c12495du);
        return c12495du;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m58045x1(C12495du c12495du) {
        return c12495du.f41807k4 == this.f41807k4 && c12495du.f41810x1 == this.f41810x1 && c12495du.f41808kk == this.f41808kk && c12495du.f41809to == this.f41809to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12495du c12495du) {
        c12495du.f41807k4 = this.f41807k4;
        c12495du.f41810x1 = this.f41810x1;
        c12495du.f41808kk = this.f41808kk;
        c12495du.f41809to = this.f41809to;
    }
}
