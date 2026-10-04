package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.x1 */
/* JADX INFO: loaded from: classes4.dex */
class C7009x1 extends AbstractC7020m9<C7009x1> {

    /* JADX INFO: renamed from: du */
    public int f19059du;

    /* JADX INFO: renamed from: h4 */
    public int f19060h4;

    /* JADX INFO: renamed from: k4 */
    public int f19061k4;

    /* JADX INFO: renamed from: kk */
    public int f19062kk;

    /* JADX INFO: renamed from: to */
    public int f19063to;

    /* JADX INFO: renamed from: x1 */
    public int f19064x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m27415x1(C7009x1 c7009x1) {
        return c7009x1.f19061k4 == this.f19061k4 && c7009x1.f19064x1 == this.f19064x1 && c7009x1.f19062kk == this.f19062kk && c7009x1.f19063to == this.f19063to && c7009x1.f19059du == this.f19059du && c7009x1.f19060h4 == this.f19060h4;
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
        if (obj instanceof C7009x1) {
            return m27415x1((C7009x1) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C7009x1 Clone() {
        C7009x1 c7009x1 = new C7009x1();
        CloneTo(c7009x1);
        return c7009x1;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[Year={0};", C7019kk.m27466x1(this.f19061k4));
        c6765kp.m26796k4(" Month={0};", C7019kk.m27466x1(this.f19064x1));
        c6765kp.m26796k4(" Day={0};", C7019kk.m27466x1(this.f19062kk));
        c6765kp.m26796k4(" Hours={0};", C7019kk.m27466x1(this.f19063to));
        c6765kp.m26796k4(" Minutes={0}", C7019kk.m27466x1(this.f19059du));
        c6765kp.m26796k4(" Seconds={0}]", C7019kk.m27466x1(this.f19060h4));
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C7009x1 c7009x1) {
        c7009x1.f19061k4 = this.f19061k4;
        c7009x1.f19064x1 = this.f19064x1;
        c7009x1.f19062kk = this.f19062kk;
        c7009x1.f19063to = this.f19063to;
        c7009x1.f19059du = this.f19059du;
        c7009x1.f19060h4 = this.f19060h4;
    }
}
