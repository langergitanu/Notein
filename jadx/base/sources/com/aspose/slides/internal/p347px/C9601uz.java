package com.aspose.slides.internal.p347px;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p437u9.C11296k4;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C9601uz extends AbstractC7020m9<C9601uz> {

    /* JADX INFO: renamed from: k4 */
    public int f34734k4;

    /* JADX INFO: renamed from: x1 */
    public short f34735x1;

    public C9601uz() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m46896x1(C9601uz c9601uz) {
        return c9601uz.f34734k4 == this.f34734k4 && c9601uz.f34735x1 == this.f34735x1;
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
        if (obj instanceof C9601uz) {
            return m46896x1((C9601uz) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C9601uz Clone() {
        C9601uz c9601uz = new C9601uz();
        CloneTo(c9601uz);
        return c9601uz;
    }

    public C9601uz(int i, short s) {
        this.f34734k4 = i;
        this.f34735x1 = s;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C9601uz c9601uz) {
        c9601uz.f34734k4 = this.f34734k4;
        c9601uz.f34735x1 = this.f34735x1;
    }

    public C9601uz(C11296k4 c11296k4) {
        this.f34734k4 = c11296k4.m54274du();
        this.f34735x1 = c11296k4.m54279to();
    }
}
