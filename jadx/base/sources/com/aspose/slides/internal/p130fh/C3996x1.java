package com.aspose.slides.internal.p130fh;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p233kn.C5890x1;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.fh.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C3996x1 extends AbstractC7020m9<C3996x1> {

    /* JADX INFO: renamed from: k4 */
    public int f10914k4;

    /* JADX INFO: renamed from: kk */
    public int f10915kk;

    /* JADX INFO: renamed from: x1 */
    public int f10916x1;

    /* JADX INFO: renamed from: k4 */
    public static int m15784k4(int i) {
        return (i / 10) & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m15785x1(int i) {
        return (i & 65535) * 10;
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
        if (obj instanceof C3996x1) {
            return m15786x1((C3996x1) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m15786x1(C3996x1 c3996x1) {
        return c3996x1.f10914k4 == this.f10914k4 && c3996x1.f10916x1 == this.f10916x1 && c3996x1.f10915kk == this.f10915kk;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3996x1 Clone() {
        C3996x1 c3996x1 = new C3996x1();
        CloneTo(c3996x1);
        return c3996x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15788k4(AbstractC3150x6 abstractC3150x6) {
        byte b;
        int i;
        abstractC3150x6.writeByte((byte) 4);
        int i2 = this.f10916x1;
        if (i2 >= 0) {
            b = (byte) i2;
            i = 1;
        } else {
            b = 0;
            i = 0;
        }
        abstractC3150x6.writeByte((byte) ((i & 255) | (this.f10915kk << 2)));
        C5890x1.m23724k4(abstractC3150x6, m15784k4(this.f10914k4));
        abstractC3150x6.writeByte(b);
        abstractC3150x6.writeByte((byte) 0);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3996x1 c3996x1) {
        c3996x1.f10914k4 = this.f10914k4;
        c3996x1.f10916x1 = this.f10916x1;
        c3996x1.f10915kk = this.f10915kk;
    }
}
