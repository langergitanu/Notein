package com.aspose.slides.internal.p172hu;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hu.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4686m9<T> extends AbstractC7020m9<C4686m9> {

    /* JADX INFO: renamed from: k4 */
    public T f13086k4;

    public C4686m9() {
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
        if (obj instanceof C4686m9) {
            return m19539x1((C4686m9) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final T m19540k4() {
        return this.f13086k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C4686m9 Clone() {
        C4686m9 c4686m9 = new C4686m9();
        CloneTo(c4686m9);
        return c4686m9;
    }

    public C4686m9(T t) {
        this.f13086k4 = t;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m19539x1(C4686m9 c4686m9) {
        return C14067j2.m66728k4(c4686m9.f13086k4, this.f13086k4);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4686m9 c4686m9) {
        c4686m9.f13086k4 = this.f13086k4;
    }
}
