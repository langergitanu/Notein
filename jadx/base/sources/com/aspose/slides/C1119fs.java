package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.fs */
/* JADX INFO: loaded from: classes3.dex */
class C1119fs extends AbstractC7020m9<C1119fs> {

    /* JADX INFO: renamed from: du */
    public float f5119du;

    /* JADX INFO: renamed from: k4 */
    public float f5120k4;

    /* JADX INFO: renamed from: kk */
    public float f5121kk;

    /* JADX INFO: renamed from: to */
    public float f5122to;

    /* JADX INFO: renamed from: x1 */
    public float f5123x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m6295x1(C1119fs c1119fs) {
        return c1119fs.f5120k4 == this.f5120k4 && c1119fs.f5123x1 == this.f5123x1 && c1119fs.f5121kk == this.f5121kk && c1119fs.f5122to == this.f5122to && c1119fs.f5119du == this.f5119du;
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
        if (obj instanceof C1119fs) {
            return m6295x1((C1119fs) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f5120k4), Float.valueOf(this.f5123x1), Float.valueOf(this.f5121kk), Float.valueOf(this.f5122to), Float.valueOf(this.f5119du));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C1119fs Clone() {
        C1119fs c1119fs = new C1119fs();
        CloneTo(c1119fs);
        return c1119fs;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C1119fs c1119fs) {
        c1119fs.f5120k4 = this.f5120k4;
        c1119fs.f5123x1 = this.f5123x1;
        c1119fs.f5121kk = this.f5121kk;
        c1119fs.f5122to = this.f5122to;
        c1119fs.f5119du = this.f5119du;
    }
}
