package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.im */
/* JADX INFO: loaded from: classes3.dex */
class C1258im extends AbstractC7020m9<C1258im> {

    /* JADX INFO: renamed from: k4 */
    public static final C1258im f5731k4;

    /* JADX INFO: renamed from: kk */
    public boolean f5732kk;

    /* JADX INFO: renamed from: to */
    public boolean f5733to;

    /* JADX INFO: renamed from: x1 */
    public float f5734x1;

    static {
        C1258im c1258im = new C1258im();
        f5731k4 = c1258im;
        c1258im.f5734x1 = 0.0f;
        c1258im.f5733to = false;
        c1258im.f5732kk = false;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m7675x1(C1258im c1258im) {
        return c1258im.f5734x1 == this.f5734x1 && c1258im.f5732kk == this.f5732kk && c1258im.f5733to == this.f5733to;
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
        if (obj instanceof C1258im) {
            return m7675x1((C1258im) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Float.valueOf(this.f5734x1), Boolean.valueOf(this.f5732kk), Boolean.valueOf(this.f5733to));
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C1258im Clone() {
        C1258im c1258im = new C1258im();
        CloneTo(c1258im);
        return c1258im;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C1258im c1258im) {
        c1258im.f5734x1 = this.f5734x1;
        c1258im.f5732kk = this.f5732kk;
        c1258im.f5733to = this.f5733to;
    }
}
