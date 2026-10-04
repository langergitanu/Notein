package com.aspose.slides.internal.p353q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.wy */
/* JADX INFO: loaded from: classes4.dex */
public class C9798wy {

    /* JADX INFO: renamed from: du */
    private C9756ak f35498du = new C9756ak();

    /* JADX INFO: renamed from: k4 */
    private C12564kk f35499k4;

    /* JADX INFO: renamed from: kk */
    private long f35500kk;

    /* JADX INFO: renamed from: to */
    private List<Long> f35501to;

    /* JADX INFO: renamed from: x1 */
    private long f35502x1;

    public C9798wy(C12564kk c12564kk, long j, long j2) {
        this.f35499k4 = c12564kk;
        this.f35500kk = c12564kk.m58602k4().getPosition();
        this.f35502x1 = j;
        List<Long> list = new List<>();
        list.addItem(Long.valueOf(j2));
        this.f35501to = list;
    }

    /* JADX INFO: renamed from: kk */
    private Dictionary<Long, Integer> m48289kk() {
        long j;
        Dictionary<Long, Integer> dictionary;
        long jM58600du = this.f35499k4.m58600du() & 65535;
        long position = this.f35499k4.m58602k4().getPosition();
        int i = 0;
        this.f35499k4.m58602k4().setPosition(this.f35501to.get_Item(0).longValue() + this.f35502x1 + jM58600du);
        long jM58600du2 = this.f35499k4.m58600du() & 65535;
        long jM58600du3 = this.f35499k4.m58600du() & 65535;
        int iM58600du = this.f35499k4.m58600du() & 65535;
        if (iM58600du == 1 || iM58600du == 2 || iM58600du == 3) {
            Dictionary<Long, Integer> dictionary2 = new Dictionary<>();
            int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, iM58600du)), 14);
            int i2 = 16 / iM27462to;
            int iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, iM27462to) - 1.0d), 14);
            long j2 = jM58600du2;
            while (true) {
                long jM58600du4 = this.f35499k4.m58600du() & 65535;
                int i3 = i;
                while (true) {
                    if (i3 >= i2) {
                        j = j2;
                        break;
                    }
                    j = j2;
                    if (dictionary2.size() > (((jM58600du3 & 4294967295L) - (jM58600du2 & 4294967295L)) & 4294967295L)) {
                        break;
                    }
                    dictionary2.addItem(Long.valueOf(j), Integer.valueOf((int) (((jM58600du4 & 4294967295L) >> (i3 * iM27462to)) & 4294967295L & ((long) iM27462to2) & 4294967295L)));
                    i3++;
                    j2 = j + 1;
                }
                if ((j & 4294967295L) > (jM58600du3 & 4294967295L)) {
                    break;
                }
                j2 = j;
                i = 0;
            }
            dictionary = dictionary2;
        } else {
            dictionary = null;
        }
        this.f35499k4.m58602k4().setPosition(position);
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9756ak m48290k4() {
        return this.f35498du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48291x1() {
        C9766dy c9766dy;
        byte b;
        byte b2;
        long j;
        C9766dy c9766dy2;
        int i = 0;
        this.f35499k4.m58602k4().setPosition(this.f35501to.get_Item(0).longValue() + this.f35502x1);
        short sM58605to = this.f35499k4.m58605to();
        int i2 = 65535;
        long jM58600du = this.f35499k4.m58600du() & 65535;
        byte bM58605to = (byte) this.f35499k4.m58605to();
        byte bM58605to2 = (byte) this.f35499k4.m58605to();
        C9761c5 c9761c5 = new C9761c5(this.f35499k4, this.f35501to.get_Item(0).longValue() + this.f35502x1 + jM58600du);
        c9761c5.m48019x1();
        long j2 = 4294967295L;
        if (sM58605to == 1) {
            short sM58605to2 = this.f35499k4.m58605to();
            long j3 = 0;
            while ((j3 & j2) < sM58605to2) {
                long jM58600du2 = this.f35499k4.m58600du() & i2;
                List list = new List();
                int i3 = i2;
                long position = this.f35499k4.m58602k4().getPosition();
                long j4 = j2;
                short s = sM58605to2;
                this.f35499k4.m58602k4().setPosition(this.f35501to.get_Item(i).longValue() + this.f35502x1 + jM58600du2);
                long jM58600du3 = this.f35499k4.m58600du() & i3;
                long j5 = 0;
                while ((j5 & j4) < (jM58600du3 & j4)) {
                    long j6 = j3;
                    C9764dq c9764dq = new C9764dq(this.f35499k4.m58600du() & i3, m48288k4(bM58605to), m48288k4(bM58605to2));
                    list.addItem(c9764dq);
                    this.f35498du.m47976k4(c9761c5.m48018k4().get_Item(Long.valueOf(j6)).longValue(), c9764dq);
                    j5++;
                    j3 = j6;
                }
                this.f35499k4.m58602k4().setPosition(position);
                j3++;
                i2 = i3;
                j2 = j4;
                sM58605to2 = s;
                i = 0;
            }
        } else {
            C9766dy c9766dy3 = new C9766dy(this.f35499k4, this.f35501to.get_Item(0).longValue() + this.f35502x1 + (this.f35499k4.m58600du() & 65535));
            c9766dy3.m48045x1();
            C9766dy c9766dy4 = new C9766dy(this.f35499k4, this.f35501to.get_Item(0).longValue() + this.f35502x1 + (this.f35499k4.m58600du() & 65535));
            c9766dy4.m48045x1();
            long jM58600du4 = this.f35499k4.m58600du() & 65535;
            long jM58600du5 = this.f35499k4.m58600du() & 65535;
            for (long j7 = 0; (j7 & 4294967295L) < (jM58600du4 & 4294967295L); j7++) {
                List list2 = new List();
                long j8 = 0;
                while ((j8 & 4294967295L) < (jM58600du5 & 4294967295L)) {
                    C9802xw c9802xwM48288k4 = m48288k4(bM58605to);
                    C9802xw c9802xwM48288k42 = m48288k4(bM58605to2);
                    if (c9802xwM48288k4.m48314c5() && c9802xwM48288k42.m48314c5()) {
                        c9766dy = c9766dy3;
                        b = bM58605to;
                        b2 = bM58605to2;
                        j = jM58600du4;
                        c9766dy2 = c9766dy4;
                    } else {
                        c9766dy = c9766dy3;
                        C9764dq c9764dq2 = new C9764dq(j8, c9802xwM48288k4, c9802xwM48288k42);
                        b = bM58605to;
                        b2 = bM58605to2;
                        int i4 = 0;
                        while (true) {
                            j = jM58600du4;
                            if (i4 >= c9766dy.m48044k4().get_Item(Long.valueOf(j7)).size()) {
                                break;
                            }
                            int i5 = 0;
                            while (i5 < c9766dy4.m48044k4().get_Item(Long.valueOf(j8)).size()) {
                                this.f35498du.m47976k4(c9766dy.m48044k4().get_Item(Long.valueOf(j7)).get_Item(i4).longValue(), new C9764dq(c9766dy4.m48044k4().get_Item(Long.valueOf(j8)).get_Item(i5).longValue(), c9802xwM48288k4, c9802xwM48288k42));
                                i5++;
                                i4 = i4;
                                c9766dy4 = c9766dy4;
                                c9802xwM48288k42 = c9802xwM48288k42;
                            }
                            i4++;
                            c9766dy4 = c9766dy4;
                            jM58600du4 = j;
                        }
                        c9766dy2 = c9766dy4;
                        list2.addItem(c9764dq2);
                    }
                    j8++;
                    c9766dy3 = c9766dy;
                    bM58605to = b;
                    bM58605to2 = b2;
                    c9766dy4 = c9766dy2;
                    jM58600du4 = j;
                }
            }
        }
        this.f35499k4.m58602k4().setPosition(this.f35500kk);
    }

    /* JADX INFO: renamed from: k4 */
    private C9802xw m48288k4(byte b) {
        C9802xw c9802xw = new C9802xw();
        if ((b & 1) != 0) {
            c9802xw.m48319k4(this.f35499k4.m58605to());
        }
        if ((b & 2) != 0) {
            c9802xw.m48329x1(this.f35499k4.m58605to());
        }
        if ((b & 4) != 0) {
            c9802xw.m48322kk(this.f35499k4.m58605to());
        }
        if ((b & 8) != 0) {
            c9802xw.m48326to(this.f35499k4.m58605to());
        }
        if ((b & 16) != 0) {
            c9802xw.m48320k4(m48289kk());
        }
        if ((b & 32) != 0) {
            c9802xw.m48330x1(m48289kk());
        }
        if ((b & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            c9802xw.m48323kk(m48289kk());
        }
        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            c9802xw.m48327to(m48289kk());
        }
        return c9802xw;
    }
}
