package com.aspose.slides.internal.p158gz;

import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gz.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4425k4<TArg, TResult> extends AbstractC7020m9<C4425k4> {

    /* JADX INFO: renamed from: k4 */
    private AbstractC4687to<TArg, TResult> f12142k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14071k4<TResult> f12143x1;

    public C4425k4() {
        this.f12142k4 = null;
        this.f12143x1 = null;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m18030x1(C4425k4 c4425k4) {
        return C14067j2.m66728k4(c4425k4.f12142k4, this.f12142k4) && C14067j2.m66728k4(c4425k4.f12143x1, this.f12143x1);
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
        if (obj instanceof C4425k4) {
            return m18030x1((C4425k4) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4425k4 Clone() {
        C4425k4 c4425k4 = new C4425k4();
        CloneTo(c4425k4);
        return c4425k4;
    }

    public C4425k4(AbstractC14071k4<TResult> abstractC14071k4, AbstractC4687to<TArg, TResult> abstractC4687to) {
        this.f12143x1 = abstractC14071k4;
        this.f12142k4 = abstractC4687to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4425k4 c4425k4) {
        c4425k4.f12142k4 = this.f12142k4;
        c4425k4.f12143x1 = this.f12143x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18033k4(TArg targ) {
        this.f12143x1.invoke(this.f12142k4.invoke(targ));
    }
}
