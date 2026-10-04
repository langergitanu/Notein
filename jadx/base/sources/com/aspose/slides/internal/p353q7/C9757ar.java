package com.aspose.slides.internal.p353q7;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C9757ar extends AbstractC7020m9<C9757ar> {

    /* JADX INFO: renamed from: k4 */
    public int f35245k4;

    /* JADX INFO: renamed from: x1 */
    public short f35246x1;

    public C9757ar() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m47978x1(C9757ar c9757ar) {
        return c9757ar.f35245k4 == this.f35245k4 && c9757ar.f35246x1 == this.f35246x1;
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
        if (obj instanceof C9757ar) {
            return m47978x1((C9757ar) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C9757ar Clone() {
        C9757ar c9757ar = new C9757ar();
        CloneTo(c9757ar);
        return c9757ar;
    }

    public C9757ar(int i, short s) {
        this.f35245k4 = i;
        this.f35246x1 = s;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C9757ar c9757ar) {
        c9757ar.f35245k4 = this.f35245k4;
        c9757ar.f35246x1 = this.f35246x1;
    }

    public C9757ar(C12564kk c12564kk) {
        this.f35245k4 = c12564kk.m58600du();
        this.f35246x1 = c12564kk.m58605to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47981k4(C12570to c12570to) {
        c12570to.m58671x1(this.f35245k4 & 65535);
        c12570to.m58671x1(this.f35246x1);
    }
}
