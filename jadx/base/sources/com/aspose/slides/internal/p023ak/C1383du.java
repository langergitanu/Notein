package com.aspose.slides.internal.p023ak;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10018x1;
import com.aspose.slides.internal.p486wy.C12311c5;
import com.aspose.slides.internal.p486wy.C12312ck;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12315fa;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12322rv;
import com.aspose.slides.internal.p486wy.C12324up;
import com.aspose.slides.internal.p486wy.C12325x1;
import com.aspose.slides.internal.p486wy.C12326x6;
import com.aspose.slides.internal.p486wy.C12327yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.ak.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1383du {

    /* JADX INFO: renamed from: du */
    private int f6007du;

    /* JADX INFO: renamed from: k4 */
    private C12314dy f6008k4;

    /* JADX INFO: renamed from: kk */
    private int f6009kk;

    /* JADX INFO: renamed from: to */
    private int f6010to;

    /* JADX INFO: renamed from: x1 */
    private int[] f6011x1;

    public C1383du(C12314dy c12314dy, int i, int i2) {
        this.f6008k4 = c12314dy;
        int[] iArrM8177k4 = m8177k4(i, i2);
        this.f6011x1 = iArrM8177k4;
        m8183k4(iArrM8177k4);
    }

    /* JADX INFO: renamed from: kk */
    private String m8178kk(int[] iArr) {
        C6765kp c6765kp = new C6765kp();
        int i = -1;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        if (i >= 0) {
            if (i < 10) {
                for (int i3 : iArr) {
                    c6765kp.m26780k4((char) (i3 + 48));
                }
            } else {
                boolean z = true;
                for (int i4 : iArr) {
                    if (z) {
                        z = false;
                    } else {
                        c6765kp.m26780k4(',');
                    }
                    c6765kp.m26805kk(i4);
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: du */
    public final List<C1383du> m8179du() {
        List<C1383du> list = new List<>();
        int length = this.f6011x1.length;
        int i = 0;
        while (i < length) {
            int i2 = this.f6011x1[i];
            int i3 = i;
            while (i3 < length && this.f6011x1[i3] == i2) {
                i3++;
            }
            if (i < i3) {
                list.addItem(new C1383du(this.f6008k4, i2, i3 - i));
            }
            i = i3;
        }
        return list;
    }

    public final boolean equals(Object obj) {
        int[] iArr;
        if (C7019kk.m27469x1(obj, C1383du.class)) {
            C1383du c1383du = (C1383du) obj;
            if (c1383du.f6008k4 != this.f6008k4 || c1383du.f6009kk != this.f6009kk || c1383du.f6010to != this.f6010to) {
                return false;
            }
            int[] iArr2 = c1383du.f6011x1;
            if (iArr2 != null && (iArr = this.f6011x1) != null) {
                if (iArr2.length != iArr.length) {
                    return false;
                }
                int length = iArr.length;
                for (int i = 0; i < length; i++) {
                    if (c1383du.f6011x1[i] != this.f6011x1[i]) {
                        return false;
                    }
                }
                return true;
            }
            if (iArr2 == null && this.f6011x1 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m8180h4() {
        int i = this.f6009kk;
        return i == this.f6010to && (i & 1) != 0;
    }

    public int hashCode() {
        C12314dy c12314dy = this.f6008k4;
        int iHashCode = c12314dy != null ? c12314dy.hashCode() : 0;
        int i = (this.f6009kk ^ iHashCode) + (iHashCode << 19);
        return (this.f6010to ^ i) + (i << 11);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12314dy m8181k4() {
        return this.f6008k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m8185m9() {
        this.f6007du++;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m8186to() {
        return this.f6009kk == this.f6010to;
    }

    public String toString() {
        char c;
        String strMo57603b3;
        C6765kp c6765kp = new C6765kp("RR: { type = '");
        if (C7019kk.m27469x1(this.f6008k4, C12326x6.class)) {
            strMo57603b3 = ((C12326x6) this.f6008k4).m57617u4();
            c = 'W';
        } else {
            c = 'S';
            if (C7019kk.m27469x1(this.f6008k4, C12327yj.class)) {
                strMo57603b3 = ((C12327yj) this.f6008k4).m57623u4();
            } else {
                if (C7019kk.m27469x1(this.f6008k4, C12325x1.class)) {
                    c = 'A';
                } else if (C7019kk.m27469x1(this.f6008k4, C12315fa.class)) {
                    c = 'L';
                } else if (!C7019kk.m27469x1(this.f6008k4, C12324up.class)) {
                    if (C7019kk.m27469x1(this.f6008k4, C12322rv.class)) {
                        strMo57603b3 = ((C12322rv) this.f6008k4).mo57603b3();
                        c = '#';
                    } else {
                        c = C7019kk.m27469x1(this.f6008k4, C12311c5.class) ? 'B' : C7019kk.m27469x1(this.f6008k4, C12312ck.class) ? 'V' : C7019kk.m27469x1(this.f6008k4, C12317jd.class) ? 'I' : '?';
                    }
                }
                strMo57603b3 = null;
            }
        }
        c6765kp.m26780k4(c);
        c6765kp.m26792k4("', levels = '");
        c6765kp.m26792k4(m8178kk(this.f6011x1));
        c6765kp.m26792k4("', min = ");
        c6765kp.m26805kk(this.f6009kk);
        c6765kp.m26792k4(", max = ");
        c6765kp.m26805kk(this.f6010to);
        c6765kp.m26792k4(", reversals = ");
        c6765kp.m26805kk(this.f6007du);
        c6765kp.m26792k4(", content = <");
        c6765kp.m26792k4(C10018x1.m49176k4(strMo57603b3));
        c6765kp.m26792k4("> }");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8187x1() {
        return this.f6009kk;
    }

    public C1383du(C12314dy c12314dy, int[] iArr) {
        this.f6008k4 = c12314dy;
        this.f6011x1 = iArr;
        m8183k4(iArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8182k4(boolean z) {
        if (C7019kk.m27469x1(this.f6008k4, C12326x6.class)) {
            C12326x6 c12326x6 = (C12326x6) this.f6008k4;
            if (c12326x6.m57616b3()) {
                return;
            }
            if ((this.f6007du & 1) != 0) {
                c12326x6.m57620x1(z);
            } else if (z && m8180h4()) {
                c12326x6.m57621yd();
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m8184kk() {
        return this.f6011x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8188x1(int[] iArr) {
        int i = this.f6009kk;
        if (i < iArr[0]) {
            iArr[0] = i;
        }
        int i2 = this.f6010to;
        if (i2 > iArr[1]) {
            iArr[1] = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8183k4(int[] iArr) {
        int i;
        int i2;
        if (iArr == null || iArr.length <= 0) {
            i = -1;
            i2 = -1;
        } else {
            i = Integer.MAX_VALUE;
            i2 = Integer.MIN_VALUE;
            for (int i3 : iArr) {
                if (i3 < i) {
                    i = i3;
                }
                if (i3 > i2) {
                    i2 = i3;
                }
            }
        }
        this.f6009kk = i;
        this.f6010to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m8177k4(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i;
        }
        return iArr;
    }
}
