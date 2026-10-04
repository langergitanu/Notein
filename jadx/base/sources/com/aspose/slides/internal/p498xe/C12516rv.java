package com.aspose.slides.internal.p498xe;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12516rv extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private int f41906k4;

    /* JADX INFO: renamed from: kk */
    private C12505dy f41907kk;

    /* JADX INFO: renamed from: x1 */
    private C12508ix f41908x1;

    /* JADX INFO: renamed from: k4 */
    public final int m58211k4() {
        return this.f41906k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12505dy m58215kk() {
        return this.f41907kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12026yj m58216to() {
        if (m58211k4() == 5) {
            return null;
        }
        C12026yj c12026yj = new C12026yj(m58215kk().m58099k4().Clone());
        c12026yj.m56932to(2);
        if (m58211k4() == 8) {
            C6005k4.m24263kk("Implement support for PS_ALTERNATE");
        }
        int iM58211k4 = m58211k4() & 15;
        if (iM58211k4 == 0) {
            c12026yj.m56927kk(0);
        } else if (iM58211k4 == 1) {
            c12026yj.m56927kk(1);
        } else if (iM58211k4 != 2) {
            int i = 3;
            if (iM58211k4 != 3) {
                i = 4;
                if (iM58211k4 != 4) {
                    if (iM58211k4 != 6) {
                        throw new ArgumentOutOfRangeException();
                    }
                    c12026yj.m56927kk(0);
                }
            }
            c12026yj.m56927kk(i);
        } else {
            c12026yj.m56927kk(2);
        }
        int iM58211k42 = m58211k4() & 3840;
        if (iM58211k42 == 0) {
            c12026yj.m56909du(2);
        } else if (iM58211k42 == 256) {
            c12026yj.m56909du(1);
        } else if (iM58211k42 == 512) {
            c12026yj.m56909du(0);
        }
        int iM58211k43 = m58211k4() & 61440;
        if (iM58211k43 == 0) {
            c12026yj.m56914h4(2);
        } else if (iM58211k43 == 4096) {
            c12026yj.m56914h4(1);
        } else if (iM58211k43 == 8192) {
            c12026yj.m56914h4(0);
        }
        c12026yj.m56926kk(m58217x1().m58120k4() == 0 ? 1.0f : m58217x1().m58120k4());
        return c12026yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12508ix m58217x1() {
        return this.f41908x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58212k4(int i) {
        this.f41906k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58213k4(C12505dy c12505dy) {
        this.f41907kk = c12505dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58214k4(C12508ix c12508ix) {
        this.f41908x1 = c12508ix;
    }
}
