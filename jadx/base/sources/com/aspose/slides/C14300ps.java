package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p505xn.C12575x1;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.ps */
/* JADX INFO: loaded from: classes3.dex */
class C14300ps extends AbstractC7020m9<C14300ps> {
    /* JADX INFO: renamed from: k4 */
    private static int m69208k4(C12003du c12003du, int i) {
        return c12003du.m56512m9() > 0.4f ? i == 7 ? 3 : 4 : i == 7 ? 5 : 6;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m69211x1(C14300ps c14300ps) {
        return true;
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
        if (obj instanceof C14300ps) {
            return m69211x1((C14300ps) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m69209k4(int i, C12003du c12003du) {
        float f;
        if (i == 7 || i == 8) {
            i = m69208k4(c12003du.Clone(), i);
        }
        if (i == 9) {
            return m69210k4(c12003du.Clone());
        }
        switch (i) {
            case 0:
                return C12003du.m56458up().Clone();
            case 1:
                return C12575x1.m58706yd();
            case 2:
                return c12003du;
            case 3:
                f = -0.3f;
                break;
            case 4:
                f = -0.5f;
                break;
            case 5:
                f = 0.3f;
                break;
            case 6:
                f = 0.5f;
                break;
            default:
                f = 0.0f;
                break;
        }
        return C0924e2.m5332k4(c12003du.Clone(), f);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m69210k4(C12003du c12003du) {
        return (c12003du.m56512m9() > 0.4f ? C12003du.m56460uz() : C12003du.m56385i5()).Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14300ps Clone() {
        C14300ps c14300ps = new C14300ps();
        CloneTo(c14300ps);
        return c14300ps;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14300ps c14300ps) {
    }
}
