package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class nuk extends AbstractC7020m9<nuk> {

    /* JADX INFO: renamed from: k4 */
    public oju f47615k4 = new oju();

    /* JADX INFO: renamed from: x1 */
    public oju f47617x1 = new oju();

    /* JADX INFO: renamed from: kk */
    public C1258im f47616kk = new C1258im();

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
        if (obj instanceof nuk) {
            return m68212x1((nuk) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f47615k4, this.f47617x1, this.f47616kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1122fv m68213k4() {
        C1122fv c1122fv = new C1122fv();
        oju.m68619k4(this.f47615k4, oju.m68618k4(this.f47617x1, 2)).CloneTo(c1122fv.f5136k4);
        C1258im c1258im = this.f47616kk;
        c1122fv.f5139x1 = c1258im.f5734x1;
        c1122fv.f5138to = c1258im.f5733to;
        c1122fv.f5137kk = c1258im.f5732kk;
        return c1122fv;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public nuk Clone() {
        nuk nukVar = new nuk();
        CloneTo(nukVar);
        return nukVar;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m68212x1(nuk nukVar) {
        return C14067j2.m66728k4(nukVar.f47615k4, this.f47615k4) && C14067j2.m66728k4(nukVar.f47617x1, this.f47617x1) && C14067j2.m66728k4(nukVar.f47616kk, this.f47616kk);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(nuk nukVar) {
        this.f47615k4.CloneTo(nukVar.f47615k4);
        this.f47617x1.CloneTo(nukVar.f47617x1);
        this.f47616kk.CloneTo(nukVar.f47616kk);
    }
}
