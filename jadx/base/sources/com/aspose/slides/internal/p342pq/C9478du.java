package com.aspose.slides.internal.p342pq;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.pq.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9478du extends AbstractC7020m9<C9478du> {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f34531k4 = true;

    /* JADX INFO: renamed from: kk */
    private Object f34532kk;

    /* JADX INFO: renamed from: x1 */
    private int f34533x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m46658x1(C9478du c9478du) {
        return c9478du.f34533x1 == this.f34533x1 && C14067j2.m66728k4(c9478du.f34532kk, this.f34532kk);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f34531k4 && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C9478du) {
            return m46658x1((C9478du) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.f34533x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C9478du Clone() {
        C9478du c9478du = new C9478du();
        CloneTo(c9478du);
        return c9478du;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C9478du c9478du) {
        c9478du.f34533x1 = this.f34533x1;
        c9478du.f34532kk = this.f34532kk;
    }
}
