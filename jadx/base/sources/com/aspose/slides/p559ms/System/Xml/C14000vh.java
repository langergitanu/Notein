package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.vh */
/* JADX INFO: loaded from: classes5.dex */
public class C14000vh extends AbstractC7020m9<C14000vh> {

    /* JADX INFO: renamed from: k4 */
    public int f47047k4;

    /* JADX INFO: renamed from: x1 */
    public int f47048x1;

    public C14000vh() {
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m66277x1(C14000vh c14000vh) {
        return c14000vh.f47047k4 == this.f47047k4 && c14000vh.f47048x1 == this.f47048x1;
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
        if (obj instanceof C14000vh) {
            return m66277x1((C14000vh) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14000vh Clone() {
        C14000vh c14000vh = new C14000vh();
        CloneTo(c14000vh);
        return c14000vh;
    }

    public C14000vh(int i, int i2) {
        this.f47047k4 = i;
        this.f47048x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m66279k4(int i, int i2) {
        this.f47047k4 = i;
        this.f47048x1 = i2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14000vh c14000vh) {
        if (c14000vh == null) {
            c14000vh = new C14000vh();
        }
        c14000vh.f47047k4 = this.f47047k4;
        c14000vh.f47048x1 = this.f47048x1;
    }
}
