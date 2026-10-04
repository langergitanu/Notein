package com.aspose.slides.internal.p130fh;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p233kn.C5890x1;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fh.to */
/* JADX INFO: loaded from: classes.dex */
public class C3995to extends AbstractC7020m9<C3995to> {

    /* JADX INFO: renamed from: k4 */
    public int f10910k4;

    /* JADX INFO: renamed from: kk */
    public byte f10911kk;

    /* JADX INFO: renamed from: to */
    public int f10912to;

    /* JADX INFO: renamed from: x1 */
    public int f10913x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m15780x1(C3995to c3995to) {
        return c3995to.f10910k4 == this.f10910k4 && c3995to.f10913x1 == this.f10913x1 && c3995to.f10911kk == this.f10911kk && c3995to.f10912to == this.f10912to;
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
        if (obj instanceof C3995to) {
            return m15780x1((C3995to) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3995to Clone() {
        C3995to c3995to = new C3995to();
        CloneTo(c3995to);
        return c3995to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15782k4(AbstractC3150x6 abstractC3150x6) {
        C5890x1.m23724k4(abstractC3150x6, this.f10910k4 & 65535);
        C5890x1.m23724k4(abstractC3150x6, this.f10913x1 & 65535);
        abstractC3150x6.writeByte(C3994kk.m15775k4(this.f10912to));
        abstractC3150x6.writeByte(this.f10911kk);
        abstractC3150x6.writeByte((byte) 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3995to c3995to) {
        c3995to.f10910k4 = this.f10910k4;
        c3995to.f10913x1 = this.f10913x1;
        c3995to.f10911kk = this.f10911kk;
        c3995to.f10912to = this.f10912to;
    }
}
