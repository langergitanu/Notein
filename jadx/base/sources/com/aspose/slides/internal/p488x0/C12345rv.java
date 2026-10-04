package com.aspose.slides.internal.p488x0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p500xi.C12535to;

/* JADX INFO: renamed from: com.aspose.slides.internal.x0.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12345rv extends C12535to {

    /* JADX INFO: renamed from: k4 */
    private int f41282k4;

    /* JADX INFO: renamed from: kk */
    private C12334dy f41283kk;

    /* JADX INFO: renamed from: x1 */
    private C12337ix f41284x1;

    /* JADX INFO: renamed from: k4 */
    public final int m57795k4() {
        return this.f41282k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12334dy m57799kk() {
        return this.f41283kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12026yj m57800to() {
        if (m57795k4() == 5) {
            return null;
        }
        C12026yj c12026yj = new C12026yj(m57799kk().m57666h4().Clone());
        c12026yj.m56932to(2);
        if (m57795k4() == 8) {
            C6005k4.m24263kk("Implement support for PS_ALTERNATE");
        }
        int iM57795k4 = m57795k4() & 15;
        if (iM57795k4 == 0) {
            c12026yj.m56927kk(0);
        } else if (iM57795k4 == 1) {
            c12026yj.m56927kk(1);
        } else if (iM57795k4 != 2) {
            int i = 3;
            if (iM57795k4 != 3) {
                i = 4;
                if (iM57795k4 != 4) {
                    if (iM57795k4 != 6) {
                        throw new ArgumentOutOfRangeException();
                    }
                    c12026yj.m56927kk(0);
                }
            }
            c12026yj.m56927kk(i);
        } else {
            c12026yj.m56927kk(2);
        }
        int iM57795k42 = m57795k4() & 3840;
        if (iM57795k42 == 0) {
            c12026yj.m56909du(2);
        } else if (iM57795k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM57795k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM57795k43 = m57795k4() & 61440;
        if (iM57795k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM57795k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM57795k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56926kk(m57801x1().m57703k4() == 0 ? 1.0f : m57801x1().m57703k4());
        return c12026yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12337ix m57801x1() {
        return this.f41284x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57796k4(int i) {
        this.f41282k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57797k4(C12334dy c12334dy) {
        this.f41283kk = c12334dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57798k4(C12337ix c12337ix) {
        this.f41284x1 = c12337ix;
    }
}
