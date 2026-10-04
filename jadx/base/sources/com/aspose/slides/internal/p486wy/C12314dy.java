package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.internal.p023ak.C1383du;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12314dy extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    public int f41170c5;

    /* JADX INFO: renamed from: ck */
    private int f41171ck;

    /* JADX INFO: renamed from: dy */
    protected int f41172dy;

    /* JADX INFO: renamed from: jd */
    protected k4 f41173jd;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wy.dy$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: kk */
        public int f41174kk;

        /* JADX INFO: renamed from: to */
        public int f41175to;

        /* JADX INFO: renamed from: x1 */
        public int f41176x1;

        public k4(int i, int i2, int i3) {
            this.f41176x1 = i;
            this.f41174kk = i2;
            this.f41175to = i3;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m57584k4(double d) {
            int i = this.f41175to;
            int iOooO00o = OooO00o.OooO00o(i, d, 14);
            this.f41175to = iOooO00o;
            return iOooO00o - i;
        }
    }

    public C12314dy() {
        this.f41170c5 = 0;
        this.f41171ck = 0;
        this.f41173jd = null;
        this.f41172dy = 0;
        m8676to(-1);
    }

    /* JADX INFO: renamed from: ar */
    public int mo57569ar() {
        return mo8658e_();
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m57570bv() {
        return m8673m9(10);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57571k4(int i, int i2, int i3) {
        this.f41173jd = new k4(i, i2, i3);
    }

    /* JADX INFO: renamed from: ks */
    public final void m57573ks(int i) {
        this.f41172dy = i;
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m57574lr() {
        return m8673m9(12);
    }

    /* JADX INFO: renamed from: qq */
    public int mo57575qq() {
        return m57577um();
    }

    /* JADX INFO: renamed from: rv */
    public final void m57576rv(int i) {
        m57583yj(i);
        m57582x6(i);
    }

    /* JADX INFO: renamed from: um */
    public final int m57577um() {
        return this.f41172dy;
    }

    /* JADX INFO: renamed from: up */
    public final void m57578up(int i) {
        k4 k4Var = this.f41173jd;
        if (k4Var != null) {
            k4Var.f41175to = i;
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m57579v4() {
        return m8673m9(11);
    }

    /* JADX INFO: renamed from: x1 */
    public List<C1383du> mo57580x1(List<C1383du> list) {
        list.addItem(new C1383du(this, new int[]{m8672m9()}));
        return list;
    }

    /* JADX INFO: renamed from: x6 */
    public final void m57582x6(int i) {
        if (C7019kk.m27469x1(m8681x6(), C12314dy.class)) {
            ((C12314dy) m8681x6()).m57576rv(i);
        } else if (C7019kk.m27469x1(m8681x6(), C1602uz.class)) {
            ((C1602uz) m8681x6()).m8634jd(i);
        } else if (m8681x6() == null) {
            this.f41171ck += i;
        }
    }

    /* JADX INFO: renamed from: yj */
    public final void m57583yj(int i) {
        this.f6214k4 += i;
    }

    public C12314dy(int i, int i2) {
        this.f41170c5 = 0;
        this.f41171ck = 0;
        this.f41173jd = null;
        this.f41172dy = i;
        m8676to(i2);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        super.mo8582k4(c1606x1);
        if (C7019kk.m27469x1(c1606x1, C12314dy.class)) {
            ((C12314dy) c1606x1).mo8680x1((C1606x1) this);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m57581x1(C12314dy c12314dy) {
        C1606x1 c1606x1M8681x6 = m8681x6();
        while (c1606x1M8681x6 != null) {
            if (c1606x1M8681x6 == c12314dy) {
                return true;
            }
            c1606x1M8681x6 = C7019kk.m27469x1(c1606x1M8681x6, C12314dy.class) ? ((C12314dy) c1606x1M8681x6).m8681x6() : null;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo57567k4(double d, int i, int i2) {
        if (this.f41173jd == null) {
            return false;
        }
        m8679x1(this.f41173jd.m57584k4(d) + m8678x1());
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57572k4(C12314dy c12314dy) {
        return c12314dy == this || m57581x1(c12314dy);
    }
}
