package com.aspose.slides.internal.p361qh;

import com.aspose.slides.internal.p390s1.C10129kk;
import com.aspose.slides.internal.p390s1.C10130to;
import com.aspose.slides.internal.p390s1.InterfaceC10127du;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.qh.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9879k4 implements InterfaceC10127du {

    /* JADX INFO: renamed from: k4 */
    protected C10129kk f35721k4;

    /* JADX INFO: renamed from: kk */
    private C10130to f35722kk;

    /* JADX INFO: renamed from: x1 */
    protected float f35723x1;

    public AbstractC9879k4(C10130to c10130to, C10129kk c10129kk) {
        this.f35723x1 = -1.0f;
        this.f35722kk = c10130to;
        this.f35721k4 = c10129kk;
        this.f35723x1 = m48692du(c10129kk);
    }

    /* JADX INFO: renamed from: du */
    private float m48692du(C10129kk c10129kk) {
        if (m48705x1()) {
            return 2.1474836E9f;
        }
        return Math.max(this.f35722kk.m49767to(c10129kk.f36296to), m48693h4(c10129kk));
    }

    /* JADX INFO: renamed from: h4 */
    private float m48693h4(C10129kk c10129kk) {
        float fMax = 0.0f;
        int i = 0;
        while (i < c10129kk.f36293k4.length()) {
            int i2 = i + 1;
            fMax = Math.max(fMax, this.f35722kk.m49760k4(i, i2));
            i = i2;
        }
        return fMax;
    }

    /* JADX INFO: renamed from: k4 */
    public float m48698k4(C10129kk c10129kk, int i) {
        float f = c10129kk.f36295m9;
        int i2 = 0;
        while (i2 <= i) {
            float[] fArr = c10129kk.f36289dy;
            f += i2 >= fArr.length ? fArr[fArr.length - 1] : fArr[i2];
            i2++;
        }
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public int m48701kk(C10129kk c10129kk) {
        return this.f35722kk.m49761k4(c10129kk.f36292jd, this.f35723x1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return m48694k4(r3, r4, r2);
     */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m48703to(C10129kk c10129kk) {
        int i;
        int iIndexOf = c10129kk.f36293k4.indexOf(c10129kk.f36286c5, c10129kk.f36292jd);
        if (iIndexOf == -1) {
            iIndexOf = c10129kk.f36293k4.length();
        }
        float f = this.f35723x1;
        int i2 = c10129kk.f36292jd;
        float fMax = 0.0f;
        int i3 = 0;
        while (true) {
            int iIndexOf2 = c10129kk.f36293k4.indexOf("\t", i2);
            if (iIndexOf2 == -1 || iIndexOf2 >= iIndexOf) {
                break;
            }
            if (iIndexOf2 == i2) {
                i = i3 + 1;
                fMax = Math.max(fMax, m48698k4(c10129kk, i3));
            } else {
                float fM49760k4 = this.f35722kk.m49760k4(i2, iIndexOf2) + fMax;
                if (fM49760k4 > f) {
                    return m48694k4(i2, fMax, f);
                }
                i = i3 + 1;
                fMax = Math.max(fM49760k4, m48698k4(c10129kk, i3));
            }
            i3 = i;
            if (fMax > f) {
                return iIndexOf2 + 1;
            }
            i2 = iIndexOf2 + 1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo48691x1(C10129kk c10129kk);

    /* JADX INFO: renamed from: x1 */
    public boolean m48705x1() {
        float f = this.f35721k4.f36296to;
        return f == 0.0f || Float.isNaN(f) || Float.isInfinite(this.f35721k4.f36296to) || this.f35721k4.f36296to == 2.1474836E9f;
    }

    /* JADX INFO: renamed from: k4 */
    private int m48694k4(int i, float f, float f2) {
        return this.f35722kk.m49761k4(i, f2 - f);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m48697x1(String str, int i) {
        if (i <= 0) {
            return false;
        }
        char cCharAt = str.charAt(i);
        return '(' == cCharAt || '[' == cCharAt || '{' == cCharAt;
    }

    /* JADX INFO: renamed from: kk */
    public boolean m48702kk() {
        C12019um c12019um = this.f35721k4.f36294kk;
        return c12019um != null && c12019um.m56828yj();
    }

    /* JADX INFO: renamed from: to */
    public boolean m48704to() {
        C12019um c12019um = this.f35721k4.f36294kk;
        return c12019um != null && c12019um.m56809jd();
    }

    /* JADX INFO: renamed from: k4 */
    public int m48699k4(C10129kk c10129kk) {
        int i;
        int iMo48691x1 = mo48691x1(c10129kk);
        if (iMo48691x1 >= c10129kk.f36293k4.length() || !this.f35722kk.m49762k4(true)) {
            return iMo48691x1;
        }
        if (m48704to() || C14117yj.m67534ks(c10129kk.f36293k4.charAt(iMo48691x1))) {
            i = iMo48691x1;
        } else {
            i = iMo48691x1;
            while (i > c10129kk.f36292jd && m48696k4(c10129kk.f36293k4, i - 1)) {
                i--;
            }
            if (m48697x1(c10129kk.f36293k4, i - 1)) {
                i--;
            }
        }
        if (i > c10129kk.f36292jd) {
            iMo48691x1 = i;
        }
        return C14117yj.m67534ks(c10129kk.f36293k4.charAt(iMo48691x1)) ? iMo48691x1 + 1 : iMo48691x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m48700k4(int i) {
        float fMax;
        C10129kk c10129kk = this.f35721k4;
        int i2 = c10129kk.f36292jd;
        int iIndexOf = c10129kk.f36293k4.indexOf("\t", i2);
        float f = 0.0f;
        int i3 = 0;
        while (iIndexOf != -1 && iIndexOf < i) {
            if (i2 < iIndexOf) {
                this.f35721k4.m49733k4(i2, iIndexOf, f);
                fMax = Math.max(m48698k4(this.f35721k4, i3), this.f35722kk.m49760k4(i2, iIndexOf) + f);
            } else {
                fMax = Math.max(m48698k4(this.f35721k4, i3), f);
            }
            f = fMax;
            i2 = iIndexOf + 1;
            iIndexOf = this.f35721k4.f36293k4.indexOf("\t", i2);
            i3++;
        }
        if (i2 < i) {
            this.f35721k4.m49733k4(i2, i, f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m48695k4(char c) {
        return '-' == c || '!' == c || '%' == c || '(' == c || ')' == c || '?' == c || '[' == c || ']' == c || '{' == c || '}' == c;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m48696k4(String str, int i) {
        char cCharAt = str.charAt(i);
        return (C14117yj.m67534ks(cCharAt) || m48695k4(cCharAt)) ? false : true;
    }
}
