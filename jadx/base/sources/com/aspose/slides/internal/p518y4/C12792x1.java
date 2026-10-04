package com.aspose.slides.internal.p518y4;

import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.p032b1.C1569kk;
import com.aspose.slides.internal.p237ks.C5909to;
import com.aspose.slides.internal.p435u5.C11287to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.y4.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12792x1 {

    /* JADX INFO: renamed from: k4 */
    private final C5909to f42553k4;

    /* JADX INFO: renamed from: x1 */
    private final C1569kk f42554x1;

    public C12792x1(C1569kk c1569kk) {
        this.f42554x1 = c1569kk;
        this.f42553k4 = c1569kk.m8445t6();
    }

    /* JADX INFO: renamed from: k4 */
    private static float m59481k4(int i) {
        switch (i) {
            case 0:
            case 1:
                return 7.5f;
            case 2:
                return 10.0f;
            case 3:
                return 14.0f;
            case 4:
                return 16.0f;
            case 5:
                return 18.0f;
            case 6:
                return 24.0f;
            case 7:
                return 36.0f;
            default:
                throw new KeyNotFoundException();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final float m59483kk() {
        if (m59482k4().m23810bv().m26927x1().m54582dy()) {
            return m59481k4(m59482k4().m23810bv().m26927x1().m54583m9());
        }
        float[] fArr = {16.0f};
        boolean zM54254k4 = C11287to.m54254k4(m59482k4().m23810bv().m26927x1().toString(), fArr, 16.0f, this.f42554x1);
        float f = fArr[0];
        if (zM54254k4) {
            return f;
        }
        return 14.0f;
    }

    /* JADX INFO: renamed from: to */
    public final String m59484to() {
        if (this.f42553k4.m23810bv().m26923k4().size() == 0) {
            return "Times New Roman";
        }
        String[] strArr = new String[m59482k4().m23810bv().m26923k4().size()];
        m59482k4().m23810bv().m26923k4().copyToTArray(strArr, 0);
        return C14113y2.m67368h4(C14113y2.m67403k4(",", strArr));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59485x1() {
        int i = 2;
        if (m59482k4().m23810bv().m26926to() != 1 && m59482k4().m23810bv().m26926to() != 2) {
            i = 0;
        }
        if (m59482k4().m23829j2().m26920k4() == 1) {
            i |= 4;
        }
        if (m59482k4().m23829j2().m26920k4() == 4) {
            i |= 8;
        }
        return m59482k4().m23810bv().m26922h4().m54601m9() >= 700 ? i | 1 : i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5909to m59482k4() {
        return this.f42553k4;
    }
}
