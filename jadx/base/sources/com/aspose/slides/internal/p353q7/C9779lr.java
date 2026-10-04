package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C9779lr {

    /* JADX INFO: renamed from: du */
    private Dictionary<Long, Dictionary<Integer, C12016rv>> f35327du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private Dictionary<Long, Dictionary<Integer, C12016rv>> f35328h4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35329k4;

    /* JADX INFO: renamed from: kk */
    private long f35330kk;

    /* JADX INFO: renamed from: m9 */
    private C9795v4 f35331m9;

    /* JADX INFO: renamed from: to */
    private List<Long> f35332to;

    /* JADX INFO: renamed from: x1 */
    private long f35333x1;

    public C9779lr(C12564kk c12564kk, long j, long j2) {
        this.f35329k4 = c12564kk;
        this.f35330kk = c12564kk.m58602k4().getPosition();
        this.f35333x1 = j;
        List<Long> list = new List<>();
        list.addItem(Long.valueOf(j2));
        this.f35332to = list;
        m48127k4(new C9795v4());
    }

    /* JADX INFO: renamed from: k4 */
    public final C9795v4 m48126k4() {
        return this.f35331m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48128x1() {
        this.f35329k4.m58602k4().setPosition(this.f35332to.get_Item(0).longValue() + this.f35333x1);
        this.f35329k4.m58605to();
        long jM58600du = this.f35329k4.m58600du() & 65535;
        long jM58600du2 = this.f35329k4.m58600du() & 65535;
        int iM58600du = this.f35329k4.m58600du() & 65535;
        long jM58600du3 = this.f35329k4.m58600du() & 65535;
        long jM58600du4 = 65535 & this.f35329k4.m58600du();
        C9761c5 c9761c5 = new C9761c5(this.f35329k4, jM58600du + this.f35332to.get_Item(0).longValue() + this.f35333x1);
        c9761c5.m48019x1();
        C9761c5 c9761c52 = new C9761c5(this.f35329k4, this.f35332to.get_Item(0).longValue() + this.f35333x1 + jM58600du2);
        c9761c52.m48019x1();
        m48124k4(jM58600du3, c9761c5);
        m48125k4(jM58600du4, c9761c52, iM58600du);
        m48126k4().m48265k4(this.f35327du);
        m48126k4().m48268x1(this.f35328h4);
    }

    /* JADX INFO: renamed from: k4 */
    private C12016rv m48123k4(long j) {
        short sM58605to;
        short sM58605to2;
        long position = this.f35329k4.m58602k4().getPosition();
        this.f35329k4.m58602k4().setPosition(this.f35332to.get_Item(0).longValue() + this.f35333x1 + j);
        int iM58600du = this.f35329k4.m58600du() & 65535;
        if (iM58600du == 1) {
            sM58605to = this.f35329k4.m58605to();
            sM58605to2 = this.f35329k4.m58605to();
        } else if (iM58600du == 2) {
            sM58605to = this.f35329k4.m58605to();
            sM58605to2 = this.f35329k4.m58605to();
            this.f35329k4.m58605to();
        } else {
            if (iM58600du != 3) {
                C6005k4.m24264to("Ancor table in Mark-To-Base lookup has wrobg format!!!");
                return new C12016rv(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            sM58605to = this.f35329k4.m58605to();
            sM58605to2 = this.f35329k4.m58605to();
            this.f35329k4.m58600du();
            this.f35329k4.m58600du();
        }
        C12016rv c12016rv = new C12016rv(sM58605to, sM58605to2);
        this.f35329k4.m58602k4().setPosition(position);
        return c12016rv;
    }

    /* JADX INFO: renamed from: k4 */
    private void m48124k4(long j, C9761c5 c9761c5) {
        long position = this.f35329k4.m58602k4().getPosition();
        this.f35329k4.m58602k4().setPosition(this.f35332to.get_Item(0).longValue() + this.f35333x1 + j);
        int iM58600du = this.f35329k4.m58600du() & 65535;
        for (int i = 0; i < iM58600du; i++) {
            int iM58600du2 = this.f35329k4.m58600du() & 65535;
            long jM58600du = this.f35329k4.m58600du() & 65535;
            Dictionary<Integer, C12016rv> dictionary = new Dictionary<>();
            C12016rv c12016rvClone = m48123k4(jM58600du + j).Clone();
            if (c12016rvClone.m56708k4() != Integer.MIN_VALUE) {
                dictionary.addItem(Integer.valueOf(iM58600du2), c12016rvClone.Clone());
                this.f35327du.addItem(c9761c5.m48018k4().get_Item(Long.valueOf(((long) i) & 4294967295L)), dictionary);
            }
        }
        this.f35329k4.m58602k4().setPosition(position);
    }

    /* JADX INFO: renamed from: k4 */
    private void m48125k4(long j, C9761c5 c9761c5, int i) {
        long position = this.f35329k4.m58602k4().getPosition();
        this.f35329k4.m58602k4().setPosition(this.f35332to.get_Item(0).longValue() + this.f35333x1 + j);
        int iM58600du = this.f35329k4.m58600du() & 65535;
        for (int i2 = 0; i2 < iM58600du; i2++) {
            Dictionary<Integer, C12016rv> dictionary = new Dictionary<>();
            for (int i3 = 0; i3 < i; i3++) {
                C12016rv c12016rvClone = m48123k4(((long) (this.f35329k4.m58600du() & 65535)) + j).Clone();
                if (c12016rvClone.m56708k4() != Integer.MIN_VALUE) {
                    dictionary.addItem(Integer.valueOf(i3), c12016rvClone.Clone());
                }
            }
            this.f35328h4.addItem(c9761c5.m48018k4().get_Item(Long.valueOf(((long) i2) & 4294967295L)), dictionary);
        }
        this.f35329k4.m58602k4().setPosition(position);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48127k4(C9795v4 c9795v4) {
        this.f35331m9 = c9795v4;
    }
}
