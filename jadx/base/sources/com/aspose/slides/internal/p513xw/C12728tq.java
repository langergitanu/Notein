package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1584du;
import com.aspose.slides.internal.p406ss.C10326c5;
import com.aspose.slides.internal.p406ss.C10339qq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.tq */
/* JADX INFO: loaded from: classes5.dex */
public class C12728tq {

    /* JADX INFO: renamed from: ck */
    private C10326c5 f42383ck;

    /* JADX INFO: renamed from: jd */
    private C1584du f42387jd;

    /* JADX INFO: renamed from: k4 */
    private int f42388k4;

    /* JADX INFO: renamed from: kk */
    private int f42389kk;

    /* JADX INFO: renamed from: to */
    private boolean f42391to;

    /* JADX INFO: renamed from: x1 */
    private int f42392x1;

    /* JADX INFO: renamed from: du */
    private final List<C12736vj> f42384du = new List<>();

    /* JADX INFO: renamed from: h4 */
    private int f42386h4 = -1;

    /* JADX INFO: renamed from: m9 */
    private int f42390m9 = -1;

    /* JADX INFO: renamed from: dy */
    private int f42385dy = -1;

    /* JADX INFO: renamed from: c5 */
    private int f42382c5 = -1;

    public C12728tq(C1584du c1584du, C10326c5 c10326c5) {
        this.f42387jd = c1584du;
        this.f42383ck = c10326c5;
        this.f42388k4 = c10326c5.m50360e0();
    }

    /* JADX INFO: renamed from: h4 */
    private int[] m59240h4(int i) {
        int i2 = this.f42389kk + i;
        int i3 = -1;
        int iM8478u4 = 0;
        do {
            i2 -= iM8478u4;
            i3++;
            iM8478u4 = m59245k4(false, i3, 1).m59332x1().m59334ck().m8478u4();
        } while (i2 >= iM8478u4);
        return new int[]{i2, iM8478u4};
    }

    /* JADX INFO: renamed from: k4 */
    private C12736vj m59241k4(int i, boolean z, boolean z2, boolean z3) {
        String strM50359du = this.f42383ck.m50359du(i);
        C10339qq c10339qqM50328k4 = this.f42383ck.m50328k4(i, this.f42388k4 == i, z2, z);
        C12736vj c12736vj = new C12736vj(c10339qqM50328k4, i, strM50359du, z, z3);
        c12736vj.m59332x1().m59347k4(this.f42387jd.m8558m9());
        c12736vj.m59332x1().m8605x1(c10339qqM50328k4.m14318c6());
        c12736vj.m59332x1().m59345k4(this.f42383ck);
        this.f42384du.addItem(c12736vj);
        return c12736vj;
    }

    /* JADX INFO: renamed from: m9 */
    private void m59242m9(int i) {
        while (i < this.f42384du.size()) {
            this.f42384du.removeAt(r0.size() - 1);
            this.f42383ck.m50331ss();
        }
    }

    /* JADX INFO: renamed from: du */
    public final int m59243du(int i) {
        int i2 = this.f42389kk;
        C12736vj c12736vjM59245k4 = m59245k4(false, 0, 1);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            if (i2 >= c12736vjM59245k4.m59332x1().m59334ck().m8478u4()) {
                i4++;
                c12736vjM59245k4 = m59245k4(false, i4, 1);
                i2 = 0;
                i3 = i5;
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: kk */
    public final int m59248kk(int i) {
        C12736vj c12736vjM59245k4;
        int iM8478u4;
        int i2 = this.f42389kk + i;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            i2 -= i4;
            int i5 = i3 + 1;
            c12736vjM59245k4 = m59245k4(false, i5, 1);
            iM8478u4 = c12736vjM59245k4.m59332x1().m59334ck().m8478u4();
            if (i2 < iM8478u4) {
                break;
            }
            i3 = i5;
            i4 = iM8478u4;
        }
        if (i2 + 1 < iM8478u4) {
            return 0;
        }
        return c12736vjM59245k4.m59332x1().m59339jd().m8678x1() - m59245k4(false, i3 + 2, 1).m59332x1().m59339jd().m8678x1();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m59249to(int i) {
        int[] iArrM59240h4 = m59240h4(i);
        return iArrM59240h4[0] == iArrM59240h4[1] - 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59250x1(int i) {
        if (this.f42385dy == i) {
            return this.f42382c5;
        }
        int i2 = this.f42389kk;
        C12736vj c12736vjM59245k4 = m59245k4(false, 0, 1);
        int i3 = 0;
        for (int i4 = i; i4 > 0; i4--) {
            i2++;
            if (i2 >= c12736vjM59245k4.m59332x1().m59334ck().m8478u4()) {
                i3++;
                c12736vjM59245k4 = m59245k4(false, i3, 1);
                i2 = 0;
            }
        }
        this.f42385dy = i;
        int iM8570v4 = c12736vjM59245k4.m59332x1().m59339jd().m8570v4();
        this.f42382c5 = iM8570v4;
        return iM8570v4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12736vj m59244k4(boolean z, int i) {
        int i2 = this.f42386h4;
        boolean z2 = true;
        boolean z3 = i2 >= 0 && i == i2;
        int i3 = i - this.f42388k4;
        while (i3 >= this.f42384du.size()) {
            m59241k4(i, z, z3, this.f42391to);
        }
        C12736vj c12736vj = this.f42384du.get_Item(i3);
        boolean z4 = c12736vj.m59332x1().m59333c5() != z;
        if ((!z3 || this.f42390m9 == i3) && (z3 || this.f42390m9 < 0)) {
            z2 = z4;
        } else {
            this.f42390m9 = z3 ? i3 : -1;
        }
        if (!z2) {
            return c12736vj;
        }
        m59242m9(i3);
        return m59241k4(i, z, z3, this.f42391to);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12736vj m59245k4(boolean z, int i, int i2) {
        if (i2 == 0) {
            return m59244k4(z, i);
        }
        if (i2 != 1) {
            throw new InvalidOperationException(C14113y2.m67408k4("Illegal value for relativeTo: ", C14057f9.m66591x1(i2)));
        }
        return m59244k4(z, (this.f42388k4 - 1) + this.f42392x1 + i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59246k4(int i) {
        this.f42386h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59247k4(int i, int i2, boolean z) {
        this.f42392x1 = (i - this.f42388k4) + 1;
        this.f42389kk = i2;
        this.f42391to = z;
        this.f42385dy = -1;
        this.f42382c5 = -1;
    }
}
