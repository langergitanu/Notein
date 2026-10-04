package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.n0 */
/* JADX INFO: loaded from: classes5.dex */
public class C13114n0 extends AbstractC7020m9<C13114n0> {

    /* JADX INFO: renamed from: k4 */
    public int f44119k4;

    /* JADX INFO: renamed from: kk */
    public int f44120kk;

    /* JADX INFO: renamed from: to */
    public int f44121to;

    /* JADX INFO: renamed from: x1 */
    public int f44122x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m61192x1(C13114n0 c13114n0) {
        return c13114n0.f44119k4 == this.f44119k4 && c13114n0.f44122x1 == this.f44122x1 && c13114n0.f44120kk == this.f44120kk && c13114n0.f44121to == this.f44121to;
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
        if (obj instanceof C13114n0) {
            return m61192x1((C13114n0) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13114n0 Clone() {
        C13114n0 c13114n0 = new C13114n0();
        CloneTo(c13114n0);
        return c13114n0;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13114n0 c13114n0) {
        if (c13114n0 == null) {
            c13114n0 = new C13114n0();
        }
        c13114n0.f44119k4 = this.f44119k4;
        c13114n0.f44122x1 = this.f44122x1;
        c13114n0.f44120kk = this.f44120kk;
        c13114n0.f44121to = this.f44121to;
    }
}
