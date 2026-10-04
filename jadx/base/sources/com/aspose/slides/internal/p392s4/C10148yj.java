package com.aspose.slides.internal.p392s4;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C10148yj extends AbstractC7020m9<C10148yj> {

    /* JADX INFO: renamed from: du */
    static final /* synthetic */ boolean f36518du = true;

    /* JADX INFO: renamed from: k4 */
    public byte f36519k4;

    /* JADX INFO: renamed from: kk */
    public int f36520kk;

    /* JADX INFO: renamed from: to */
    public int f36521to;

    /* JADX INFO: renamed from: x1 */
    public byte f36522x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m49919x1(C10148yj c10148yj) {
        return c10148yj.f36519k4 == this.f36519k4 && c10148yj.f36522x1 == this.f36522x1 && c10148yj.f36520kk == this.f36520kk && c10148yj.f36521to == this.f36521to;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f36518du && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C10148yj) {
            return m49919x1((C10148yj) obj);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f36519k4 * 31) + this.f36522x1) * 31) + this.f36520kk) * 31) + this.f36521to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C10148yj Clone() {
        C10148yj c10148yj = new C10148yj();
        CloneTo(c10148yj);
        return c10148yj;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C10148yj c10148yj) {
        c10148yj.f36519k4 = this.f36519k4;
        c10148yj.f36522x1 = this.f36522x1;
        c10148yj.f36520kk = this.f36520kk;
        c10148yj.f36521to = this.f36521to;
    }
}
