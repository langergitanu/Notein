package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.em */
/* JADX INFO: loaded from: classes.dex */
public final class C4622em extends C4657to {

    /* JADX INFO: renamed from: k4 */
    private short f12890k4;

    /* JADX INFO: renamed from: x1 */
    private short f12891x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4622em.class) && m19088k4((C4622em) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 4;
    }

    public int hashCode() {
        return (C14088s7.m67172k4(this.f12890k4) * 397) ^ C14088s7.m67172k4(this.f12891x1);
    }

    @Override // com.aspose.slides.internal.p171hq.C4657to
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo19089k4() {
        return new C12025x6(this.f12890k4, this.f12891x1);
    }

    /* JADX INFO: renamed from: kk */
    public final short m19091kk() {
        return this.f12891x1;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Short.valueOf(this.f12890k4), Short.valueOf(this.f12891x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m19092x1() {
        return this.f12890k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19090k4(short s) {
        this.f12890k4 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19093x1(short s) {
        this.f12891x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19088k4(C4622em c4622em) {
        return this.f12890k4 == c4622em.f12890k4 && this.f12891x1 == c4622em.f12891x1;
    }
}
