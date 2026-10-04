package com.aspose.slides.internal.p233kn;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.kn.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5888k4<T> extends AbstractC7020m9<C5888k4> {

    /* JADX INFO: renamed from: k4 */
    public T f16593k4;

    /* JADX INFO: renamed from: x1 */
    public T f16594x1;

    public C5888k4() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m23720x1(C5888k4 c5888k4) {
        return C14067j2.m66728k4(c5888k4.f16593k4, this.f16593k4) && C14067j2.m66728k4(c5888k4.f16594x1, this.f16594x1);
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
        if (obj instanceof C5888k4) {
            return m23720x1((C5888k4) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C5888k4 Clone() {
        C5888k4 c5888k4 = new C5888k4();
        CloneTo(c5888k4);
        return c5888k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0} ; {1}", this.f16593k4, this.f16594x1);
    }

    public C5888k4(T t, T t2) {
        this.f16593k4 = t;
        this.f16594x1 = t2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C5888k4 c5888k4) {
        c5888k4.f16593k4 = this.f16593k4;
        c5888k4.f16594x1 = this.f16594x1;
    }
}
