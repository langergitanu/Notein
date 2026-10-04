package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11195jd {

    /* JADX INFO: renamed from: c5 */
    private String f38579c5;

    /* JADX INFO: renamed from: ck */
    private int f38580ck;

    /* JADX INFO: renamed from: du */
    public C11171b3 f38581du;

    /* JADX INFO: renamed from: dy */
    private String f38582dy;

    /* JADX INFO: renamed from: fa */
    private boolean f38583fa;

    /* JADX INFO: renamed from: h4 */
    private String f38584h4;

    /* JADX INFO: renamed from: jd */
    private int f38585jd;

    /* JADX INFO: renamed from: kk */
    public boolean f38587kk;

    /* JADX INFO: renamed from: m9 */
    private String f38588m9;

    /* JADX INFO: renamed from: to */
    public C11230wy f38589to;

    /* JADX INFO: renamed from: k4 */
    public String[] f38586k4 = new String[4];

    /* JADX INFO: renamed from: x1 */
    public int f38590x1 = 0;

    public C11195jd() {
        String str = C14113y2.f47374k4;
        m53826k4(str, str, str);
    }

    /* JADX INFO: renamed from: du */
    public final int m53820du() {
        return this.f38585jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m53821h4() {
        return this.f38580ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m53822k4() {
        return this.f38588m9;
    }

    /* JADX INFO: renamed from: kk */
    public final String m53829kk() {
        return this.f38579c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m53831m9() {
        return this.f38583fa;
    }

    /* JADX INFO: renamed from: to */
    public final String m53832to() {
        int i = this.f38590x1;
        if (i == 0) {
            return C14113y2.f47374k4;
        }
        if (i == 1) {
            return this.f38586k4[0];
        }
        int length = 0;
        for (int i2 = 0; i2 < this.f38590x1; i2++) {
            String str = this.f38586k4[i2];
            if (str != null) {
                length += str.length();
            }
        }
        C6765kp c6765kp = new C6765kp(length);
        for (int i3 = 0; i3 < this.f38590x1; i3++) {
            String str2 = this.f38586k4[i3];
            if (str2 != null) {
                c6765kp.m26792k4(str2);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final String m53834x1() {
        return this.f38582dy;
    }

    /* JADX INFO: renamed from: kk */
    private void m53819kk(int i) {
        String[] strArr = this.f38586k4;
        if (strArr.length < i) {
            String[] strArr2 = new String[i * 2];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) strArr), AbstractC14092to.m67208k4((Object) strArr2), this.f38590x1);
            this.f38586k4 = strArr2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53823k4(int i) {
        this.f38585jd = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m53833to(String str) {
        this.f38590x1 = 0;
        m53827k4(str, false);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53835x1(int i) {
        this.f38580ck = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53824k4(C11195jd c11195jd) {
        this.f38579c5 = c11195jd.m53829kk();
        this.f38588m9 = c11195jd.m53822k4();
        this.f38582dy = c11195jd.m53834x1();
        this.f38584h4 = null;
        this.f38580ck = c11195jd.m53821h4();
        this.f38585jd = c11195jd.m53820du();
        this.f38589to = c11195jd.f38589to;
        this.f38581du = c11195jd.f38581du;
        this.f38590x1 = 0;
        m53819kk(c11195jd.f38590x1);
        AbstractC14092to.m67208k4((Object) c11195jd.f38586k4).copyTo(AbstractC14092to.m67208k4((Object) this.f38586k4), 0);
        this.f38590x1 = c11195jd.f38590x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m53830kk(String str) {
        this.f38579c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53836x1(String str) {
        this.f38582dy = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53825k4(String str) {
        this.f38588m9 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53826k4(String str, String str2, String str3) {
        this.f38579c5 = str;
        this.f38588m9 = str2;
        this.f38582dy = str3;
        this.f38584h4 = null;
        this.f38589to = null;
        this.f38581du = null;
        this.f38590x1 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53827k4(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return;
        }
        m53819kk(this.f38590x1 + (z ? 2 : 1));
        if (z) {
            String[] strArr = this.f38586k4;
            int i = this.f38590x1;
            this.f38590x1 = i + 1;
            strArr[i] = null;
        }
        String[] strArr2 = this.f38586k4;
        int i2 = this.f38590x1;
        this.f38590x1 = i2 + 1;
        strArr2[i2] = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53828k4(boolean z) {
        this.f38583fa = z;
    }
}
