package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.t5 */
/* JADX INFO: loaded from: classes3.dex */
class C14486t5 extends AbstractC7020m9<C14486t5> {
    /* JADX INFO: renamed from: x1 */
    public static void m70943x1(C12007ix[] c12007ixArr, float f) {
        if (f < c12007ixArr[0].m56551ck()) {
            C12007ix c12007ix = c12007ixArr[0];
            c12007ix.m56560k4(c12007ix.m56558k4() - f);
            c12007ixArr[0].m56572to(f);
        } else if (f > c12007ixArr[0].m56558k4()) {
            C12007ix c12007ix2 = c12007ixArr[0];
            c12007ix2.m56560k4(f - c12007ix2.m56551ck());
        }
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
        if (obj instanceof C14486t5) {
            return m70944x1((C14486t5) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14486t5 Clone() {
        C14486t5 c14486t5 = new C14486t5();
        CloneTo(c14486t5);
        return c14486t5;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m70944x1(C14486t5 c14486t5) {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14486t5 c14486t5) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70941k4(C12007ix[] c12007ixArr, float f) {
        if (f < c12007ixArr[0].m56557jd()) {
            C12007ix c12007ix = c12007ixArr[0];
            c12007ix.m56576x1(c12007ix.m56556h4() - f);
            c12007ixArr[0].m56566kk(f);
        } else if (f > c12007ixArr[0].m56556h4()) {
            C12007ix c12007ix2 = c12007ixArr[0];
            c12007ix2.m56576x1(f - c12007ix2.m56557jd());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70942k4(C12007ix[] c12007ixArr, C12025x6 c12025x6) {
        m70941k4(c12007ixArr, c12025x6.m56897x1());
        m70943x1(c12007ixArr, c12025x6.m56895kk());
    }
}
