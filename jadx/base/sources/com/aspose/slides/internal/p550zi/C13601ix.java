package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C13601ix extends AbstractC7020m9<C13601ix> {

    /* JADX INFO: renamed from: kk */
    static final /* synthetic */ boolean f45160kk = true;

    /* JADX INFO: renamed from: k4 */
    public boolean f45161k4;

    /* JADX INFO: renamed from: x1 */
    public String f45162x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m62733x1(C13601ix c13601ix) {
        return c13601ix.f45161k4 == this.f45161k4 && C14067j2.m66728k4(c13601ix.f45162x1, this.f45162x1);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f45160kk && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C13601ix) {
            return m62733x1((C13601ix) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f45161k4 ? 1 : 0) * 31;
        String str = this.f45162x1;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13601ix Clone() {
        C13601ix c13601ix = new C13601ix();
        CloneTo(c13601ix);
        return c13601ix;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13601ix c13601ix) {
        c13601ix.f45161k4 = this.f45161k4;
        c13601ix.f45162x1 = this.f45162x1;
    }
}
