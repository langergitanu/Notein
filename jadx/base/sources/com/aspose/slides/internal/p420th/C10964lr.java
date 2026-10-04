package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C10964lr extends AbstractC7020m9<C10964lr> {

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f38215k4 = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    private C12025x6 f38217x1 = new C12025x6();

    /* JADX INFO: renamed from: kk */
    private C12025x6 f38216kk = new C12025x6();

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
        if (obj instanceof C10964lr) {
            return m53009x1((C10964lr) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m53010k4() {
        return this.f38217x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C10964lr Clone() {
        C10964lr c10964lr = new C10964lr();
        CloneTo(c10964lr);
        return c10964lr;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m53015x1() {
        return this.f38216kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C10964lr c10964lr) {
        this.f38215k4.CloneTo(c10964lr.f38215k4);
        this.f38217x1.CloneTo(c10964lr.f38217x1);
        this.f38216kk.CloneTo(c10964lr.f38216kk);
    }

    /* JADX INFO: renamed from: kk */
    public final void m53014kk(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38216kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53016x1(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38217x1);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m53009x1(C10964lr c10964lr) {
        return C14067j2.m66728k4(c10964lr.f38215k4, this.f38215k4) && C14067j2.m66728k4(c10964lr.f38217x1, this.f38217x1) && C14067j2.m66728k4(c10964lr.f38216kk, this.f38216kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53012k4(C12025x6 c12025x6) {
        c12025x6.CloneTo(this.f38215k4);
    }
}
