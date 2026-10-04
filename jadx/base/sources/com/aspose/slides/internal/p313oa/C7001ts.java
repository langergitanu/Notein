package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.ts */
/* JADX INFO: loaded from: classes4.dex */
class C7001ts extends AbstractC7020m9<C7001ts> {

    /* JADX INFO: renamed from: k4 */
    public int f19045k4;

    /* JADX INFO: renamed from: kk */
    public long f19046kk;

    /* JADX INFO: renamed from: x1 */
    public long f19047x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m27397x1(C7001ts c7001ts) {
        return c7001ts.f19045k4 == this.f19045k4 && c7001ts.f19047x1 == this.f19047x1 && c7001ts.f19046kk == this.f19046kk;
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
        if (obj instanceof C7001ts) {
            return m27397x1((C7001ts) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C7001ts Clone() {
        C7001ts c7001ts = new C7001ts();
        CloneTo(c7001ts);
        return c7001ts;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[TagSignature={0};", C7019kk.m27466x1(this.f19045k4));
        c6765kp.m26796k4(" Offset={0};", C7019kk.m27449k4(this.f19047x1));
        c6765kp.m26796k4(" Size={0}]", C7019kk.m27449k4(this.f19046kk));
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C7001ts c7001ts) {
        c7001ts.f19045k4 = this.f19045k4;
        c7001ts.f19047x1 = this.f19047x1;
        c7001ts.f19046kk = this.f19046kk;
    }
}
