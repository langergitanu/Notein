package com.aspose.slides.internal.p404sp;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p087dm.C3188m9;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sp.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10315x1 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f36743kk = new C7017h4("grad", "rad", "deg", "");

    /* JADX INFO: renamed from: k4 */
    private int f36744k4;

    /* JADX INFO: renamed from: x1 */
    private float f36745x1;

    /* JADX INFO: renamed from: k4 */
    public final int m50297k4() {
        return this.f36744k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m50300kk() {
        double dM50301x1;
        int iM50297k4 = m50297k4();
        if (iM50297k4 == 0 || iM50297k4 == 1 || iM50297k4 == 2) {
            return m50301x1();
        }
        if (iM50297k4 == 3) {
            dM50301x1 = ((double) (m50301x1() * 180.0f)) / 3.141592653589793d;
        } else {
            if (iM50297k4 != 4) {
                throw new ArgumentOutOfRangeException();
            }
            dM50301x1 = ((double) m50301x1()) * 0.9d;
        }
        return (float) dM50301x1;
    }

    public String toString() {
        String str;
        String strM66712k4 = C14064he.m66712k4(m50301x1(), "F", C11697x1.m55250kk());
        int iM50297k4 = m50297k4();
        if (iM50297k4 == 1) {
            str = "deg";
        } else if (iM50297k4 == 3) {
            str = "rad";
        } else {
            if (iM50297k4 != 4) {
                return strM66712k4;
            }
            str = "grad";
        }
        return C14113y2.m67400k4(strM66712k4, str);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m50301x1() {
        return this.f36745x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10315x1 m50295k4(String str) {
        C10315x1 c10315x1 = new C10315x1();
        c10315x1.m50298k4(0.0f);
        c10315x1.m50299k4(0);
        int iM67439x1 = C14113y2.m67439x1(str, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        if (iM67439x1 == -1) {
            return c10315x1;
        }
        c10315x1.m50298k4(C14057f9.m66585k4(C14113y2.m67443x1(str, 0, r2), C11697x1.m55250kk()));
        int iM27428k4 = f36743kk.m27428k4(C14113y2.m67422kk(str, iM67439x1 + 1));
        if (iM27428k4 == 0) {
            c10315x1.m50299k4(4);
            return c10315x1;
        }
        if (iM27428k4 == 1) {
            c10315x1.m50299k4(3);
            return c10315x1;
        }
        if (iM27428k4 == 2) {
            c10315x1.m50299k4(2);
            return c10315x1;
        }
        if (iM27428k4 != 3) {
            throw new C3188m9(1, "Invalid SvgAngle", str);
        }
        c10315x1.m50299k4(1);
        return c10315x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10315x1 m50296k4(String str, C10315x1 c10315x1) {
        try {
            return m50295k4(str);
        } catch (RuntimeException e) {
            if (C14113y2.m67411k4(str) || C4113k4.f11284k4) {
                return c10315x1;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50298k4(float f) {
        this.f36745x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50299k4(int i) {
        this.f36744k4 = i;
    }
}
