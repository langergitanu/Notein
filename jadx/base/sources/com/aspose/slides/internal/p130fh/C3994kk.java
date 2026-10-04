package com.aspose.slides.internal.p130fh;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p233kn.C5889kk;
import com.aspose.slides.internal.p233kn.C5890x1;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fh.kk */
/* JADX INFO: loaded from: classes.dex */
public class C3994kk extends AbstractC7020m9<C3994kk> {

    /* JADX INFO: renamed from: du */
    public boolean f10903du;

    /* JADX INFO: renamed from: h4 */
    public boolean f10904h4;

    /* JADX INFO: renamed from: k4 */
    public int f10905k4;

    /* JADX INFO: renamed from: kk */
    public int f10906kk;

    /* JADX INFO: renamed from: m9 */
    public int f10907m9;

    /* JADX INFO: renamed from: to */
    public int f10908to;

    /* JADX INFO: renamed from: x1 */
    public int f10909x1;

    /* JADX INFO: renamed from: k4 */
    public static byte m15775k4(int i) {
        if (i < 0 || i > 256) {
            throw new ArgumentOutOfRangeException("size");
        }
        if (i > 0) {
            return (byte) ((((byte) ((C5889kk.m23723k4(i) - 1) & 7)) & 255) | 128);
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m15776x1(C3994kk c3994kk) {
        return c3994kk.f10905k4 == this.f10905k4 && c3994kk.f10909x1 == this.f10909x1 && c3994kk.f10906kk == this.f10906kk && c3994kk.f10908to == this.f10908to && c3994kk.f10903du == this.f10903du && c3994kk.f10904h4 == this.f10904h4 && c3994kk.f10907m9 == this.f10907m9;
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
        if (obj instanceof C3994kk) {
            return m15776x1((C3994kk) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3994kk Clone() {
        C3994kk c3994kk = new C3994kk();
        CloneTo(c3994kk);
        return c3994kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15778k4(AbstractC3150x6 abstractC3150x6) {
        C5890x1.m23724k4(abstractC3150x6, this.f10905k4 & 65535);
        C5890x1.m23724k4(abstractC3150x6, this.f10909x1 & 65535);
        C5890x1.m23724k4(abstractC3150x6, this.f10906kk & 65535);
        C5890x1.m23724k4(abstractC3150x6, this.f10908to & 65535);
        byte bM15775k4 = m15775k4(this.f10907m9);
        if (this.f10903du) {
            bM15775k4 = (byte) ((bM15775k4 & 255) | 64);
        }
        if (this.f10904h4) {
            bM15775k4 = (byte) ((bM15775k4 & 255) | 32);
        }
        abstractC3150x6.writeByte(bM15775k4);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3994kk c3994kk) {
        c3994kk.f10905k4 = this.f10905k4;
        c3994kk.f10909x1 = this.f10909x1;
        c3994kk.f10906kk = this.f10906kk;
        c3994kk.f10908to = this.f10908to;
        c3994kk.f10903du = this.f10903du;
        c3994kk.f10904h4 = this.f10904h4;
        c3994kk.f10907m9 = this.f10907m9;
    }
}
