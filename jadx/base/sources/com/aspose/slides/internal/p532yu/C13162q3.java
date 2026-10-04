package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.q3 */
/* JADX INFO: loaded from: classes5.dex */
public class C13162q3 extends AbstractC7020m9<C13162q3> {

    /* JADX INFO: renamed from: k4 */
    public C13047jd f44227k4;

    /* JADX INFO: renamed from: x1 */
    public C14046bv[] f44228x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m61411x1(C13162q3 c13162q3) {
        return C14067j2.m66728k4(c13162q3.f44227k4, this.f44227k4) && C14067j2.m66728k4(c13162q3.f44228x1, this.f44228x1);
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
        if (obj instanceof C13162q3) {
            return m61411x1((C13162q3) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13162q3 Clone() {
        C13162q3 c13162q3 = new C13162q3();
        CloneTo(c13162q3);
        return c13162q3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13162q3 c13162q3) {
        if (c13162q3 == null) {
            c13162q3 = new C13162q3();
        }
        c13162q3.f44227k4 = this.f44227k4;
        c13162q3.f44228x1 = this.f44228x1;
    }
}
