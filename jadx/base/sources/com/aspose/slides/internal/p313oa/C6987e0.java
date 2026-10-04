package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.e0 */
/* JADX INFO: loaded from: classes4.dex */
class C6987e0 extends AbstractC7020m9<C6987e0> {

    /* JADX INFO: renamed from: k4 */
    public float f19006k4;

    /* JADX INFO: renamed from: kk */
    public float f19007kk;

    /* JADX INFO: renamed from: x1 */
    public float f19008x1;

    /* JADX INFO: renamed from: x1 */
    public static boolean m27341x1(C6987e0 c6987e0, C6987e0 c6987e02) {
        return !m27340k4(c6987e0, c6987e02);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, C6987e0.class)) {
            return m27340k4((C6987e0) C7019kk.m27464to(obj, C6987e0.class), this);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C6987e0 Clone() {
        C6987e0 c6987e0 = new C6987e0();
        CloneTo(c6987e0);
        return c6987e0;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[X={0:F4};", C7019kk.m27448k4(this.f19006k4));
        c6765kp.m26796k4(" Y={0:F4};", C7019kk.m27448k4(this.f19008x1));
        c6765kp.m26796k4(" Z={0:F4}]", C7019kk.m27448k4(this.f19007kk));
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6987e0 c6987e0) {
        c6987e0.f19006k4 = this.f19006k4;
        c6987e0.f19008x1 = this.f19008x1;
        c6987e0.f19007kk = this.f19007kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m27340k4(C6987e0 c6987e0, C6987e0 c6987e02) {
        return c6987e0.f19006k4 == c6987e02.f19006k4 && c6987e0.f19008x1 == c6987e02.f19008x1 && c6987e0.f19007kk == c6987e02.f19007kk;
    }
}
