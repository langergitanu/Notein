package com.aspose.slides.internal.p513xw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p150gi.AbstractC4282kp;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.dq */
/* JADX INFO: loaded from: classes5.dex */
public class C12691dq {

    /* JADX INFO: renamed from: k4 */
    public static final C12691dq f42215k4 = new C12691dq(Integer.MIN_VALUE, 9);

    /* JADX INFO: renamed from: x1 */
    public static final C12691dq f42216x1 = new C12691dq(Integer.MAX_VALUE, 75);

    /* JADX INFO: renamed from: kk */
    private int f42217kk;

    /* JADX INFO: renamed from: to */
    private int f42218to;

    private C12691dq(int i, int i2) {
        this.f42217kk = i;
        this.f42218to = i2;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m58905k4(int i) {
        if (i == 9) {
            return 3;
        }
        if (i == 28) {
            return 1;
        }
        if (i == 75) {
            return 0;
        }
        if (i == 104) {
            return 2;
        }
        throw new ArgumentException();
    }

    /* JADX INFO: renamed from: kk */
    public final int m58911kk() {
        int i = this.f42217kk;
        if (i == Integer.MIN_VALUE) {
            return 0;
        }
        return i == Integer.MAX_VALUE ? 1000 : 999;
    }

    public String toString() {
        int i = this.f42217kk;
        return i == Integer.MIN_VALUE ? "auto" : i == Integer.MAX_VALUE ? "always" : C14057f9.m66591x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m58912x1() {
        return this.f42218to;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m58906k4(AbstractC4282kp abstractC4282kp) {
        if (abstractC4282kp.m17256x6()) {
            return Integer.MIN_VALUE;
        }
        if (abstractC4282kp.mo17251du() == 7) {
            return Integer.MAX_VALUE;
        }
        return ((Integer) C7019kk.m27464to(abstractC4282kp.mo9924m9(), Integer.TYPE)).intValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static C12691dq m58907k4(C4266c6 c4266c6) {
        C12691dq c12691dq = new C12691dq(Integer.MIN_VALUE, 9);
        c12691dq.m58908k4(c4266c6.m17186fa(), 104);
        c12691dq.m58908k4(c4266c6.m17187jd(), 28);
        c12691dq.m58908k4(c4266c6.m17185c5(), 75);
        return c12691dq;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12691dq m58909k4(C12691dq c12691dq) {
        int i;
        int iM58905k4;
        int iM58905k42;
        int i2 = this.f42217kk;
        return ((i2 != Integer.MAX_VALUE || i2 <= c12691dq.f42217kk) && (((i = c12691dq.f42217kk) == Integer.MAX_VALUE && i > i2) || ((iM58905k4 = m58905k4(this.f42218to)) != (iM58905k42 = m58905k4(c12691dq.f42218to)) ? iM58905k4 >= iM58905k42 : this.f42217kk < c12691dq.f42217kk))) ? c12691dq : this;
    }

    /* JADX INFO: renamed from: k4 */
    private void m58908k4(AbstractC4282kp abstractC4282kp, int i) {
        if (abstractC4282kp.m17256x6()) {
            return;
        }
        this.f42217kk = m58906k4(abstractC4282kp);
        this.f42218to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58910k4() {
        return this.f42217kk == Integer.MIN_VALUE;
    }
}
