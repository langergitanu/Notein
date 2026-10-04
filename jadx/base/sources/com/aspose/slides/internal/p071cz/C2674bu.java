package com.aspose.slides.internal.p071cz;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2674bu {

    /* JADX INFO: renamed from: du */
    private boolean f8514du;

    /* JADX INFO: renamed from: h4 */
    private boolean f8516h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f8520m9;

    /* JADX INFO: renamed from: to */
    private double f8521to;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f8518k4 = new C12025x6();

    /* JADX INFO: renamed from: x1 */
    private C2968xo f8522x1 = new C2968xo();

    /* JADX INFO: renamed from: kk */
    private C2968xo f8519kk = new C2968xo();

    /* JADX INFO: renamed from: dy */
    private List<C12025x6> f8515dy = null;

    /* JADX INFO: renamed from: c5 */
    private List<Integer> f8513c5 = null;

    /* JADX INFO: renamed from: jd */
    private boolean f8517jd = true;

    public C2674bu() {
        m12156kk();
        m12159x1();
    }

    /* JADX INFO: renamed from: ck */
    private void m12138ck() {
        List<Integer> list;
        int i = 1;
        if (this.f8520m9) {
            list = this.f8513c5;
        } else {
            this.f8520m9 = true;
            list = this.f8513c5;
            i = 0;
        }
        list.addItem(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c5 */
    public final int[] m12143c5() {
        return C3085sv.m13103kk(this.f8513c5);
    }

    /* JADX INFO: renamed from: du */
    public final void m12144du() {
        C12025x6 c12025x6 = new C12025x6((float) (this.f8519kk.m12606k4() * ((double) this.f8518k4.m56897x1())), (float) (this.f8519kk.m12611x1() * ((double) this.f8518k4.m56895kk())));
        byte b = (byte) (this.f8514du ? -1 : 1);
        byte b2 = (byte) (this.f8516h4 ? -1 : 1);
        double dM67470dy = C14116yg.m67470dy((this.f8521to * 3.141592653589793d) / 180.0d);
        double dM67495m9 = C14116yg.m67495m9((this.f8521to * 3.141592653589793d) / 180.0d);
        C12025x6 c12025x62 = new C12025x6();
        for (int i = 0; i < this.f8515dy.size(); i++) {
            this.f8515dy.get_Item(i).CloneTo(c12025x62);
            c12025x62.m56891k4((float) ((this.f8519kk.m12606k4() * ((double) (c12025x62.m56897x1() - this.f8518k4.m56897x1())) * ((double) b)) + ((double) this.f8518k4.m56897x1())));
            c12025x62.m56898x1((float) ((this.f8519kk.m12611x1() * ((double) (c12025x62.m56895kk() - this.f8518k4.m56895kk())) * ((double) b2)) + ((double) this.f8518k4.m56895kk())));
            if (C14116yg.m67475k4(this.f8521to) > 1.0E-6d) {
                double dM56897x1 = c12025x62.m56897x1() - this.f8518k4.m56897x1();
                double dM56895kk = c12025x62.m56895kk() - this.f8518k4.m56895kk();
                c12025x62.m56891k4((float) (((dM56897x1 * dM67470dy) + ((double) this.f8518k4.m56897x1())) - (dM56895kk * dM67495m9)));
                c12025x62.m56898x1((float) ((dM56895kk * dM67470dy) + (dM56897x1 * dM67495m9) + ((double) this.f8518k4.m56895kk())));
            }
            c12025x62.m56891k4(c12025x62.m56897x1() + ((float) (this.f8522x1.m12606k4() + ((double) (c12025x6.m56897x1() - this.f8518k4.m56897x1())))));
            c12025x62.m56898x1(c12025x62.m56895kk() + ((float) (this.f8522x1.m12611x1() + ((double) (c12025x6.m56895kk() - this.f8518k4.m56895kk())))));
            this.f8515dy.set_Item(i, c12025x62.Clone());
        }
    }

    /* JADX INFO: renamed from: dy */
    public final C12025x6[] m12145dy() {
        return this.f8515dy.toArray(new C12025x6[0]);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m12146h4() {
    }

    /* JADX INFO: renamed from: jd */
    public final int m12147jd() {
        return this.f8515dy.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m12148k4(double d, double d2, double d3, double d4, double d5, double d6) {
        return m12139k4(d, d2, d3, d4, d5, d6, (byte) 2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m12156kk() {
        this.f8522x1 = new C2968xo(0.0d, 0.0d);
        this.f8519kk = new C2968xo(1.0d, 1.0d);
        this.f8521to = 0.0d;
        m12155k4(false, false);
        this.f8518k4 = new C12025x6(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m12157m9() {
        int size = this.f8515dy.size();
        if (size < 1) {
            return;
        }
        List<C12025x6> list = new List<>();
        List<Integer> list2 = new List<>();
        C12025x6 c12025x6 = new C12025x6(0.0f, 0.0f);
        int i = 0;
        boolean z = false;
        while (i < size) {
            if ((this.f8513c5.get_Item(i).intValue() & 3) < 3) {
                list.addItem(this.f8515dy.get_Item(i).Clone());
                list2.addItem(this.f8513c5.get_Item(i));
                this.f8515dy.get_Item(i).CloneTo(c12025x6);
                i++;
            } else {
                int i2 = i + 2;
                if (i2 < size) {
                    C2914ts c2914ts = new C2914ts();
                    c2914ts.m12541k4(this.f8517jd);
                    List<C12025x6>[] listArr = {list};
                    c2914ts.m12540k4(c12025x6.Clone(), this.f8515dy.get_Item(i).Clone(), this.f8515dy.get_Item(i + 1).Clone(), this.f8515dy.get_Item(i2).Clone(), listArr);
                    list = listArr[0];
                    this.f8515dy.get_Item(i2).CloneTo(c12025x6);
                    while (list2.size() < list.size()) {
                        list2.addItem(1);
                    }
                    if ((this.f8513c5.get_Item(i2).intValue() & 128) == 128) {
                        list2.set_Item(list2.size() - 1, 129);
                    }
                }
                i += 3;
                z = true;
            }
        }
        if (z) {
            this.f8515dy.clear();
            this.f8513c5.clear();
            this.f8515dy = list;
            this.f8513c5 = list2;
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m12158to() {
        this.f8520m9 = false;
        if (this.f8513c5.size() > 0) {
            List<Integer> list = this.f8513c5;
            list.set_Item(list.size() - 1, Integer.valueOf(((Integer) OooO0O0.OooO00o(this.f8513c5, 1)).intValue() | 128));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12159x1() {
        this.f8515dy = new List<>();
        this.f8513c5 = new List<>();
        this.f8520m9 = false;
    }

    public C2674bu(int i) {
        m12156kk();
        m12159x1();
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m12139k4(double d, double d2, double d3, double d4, double d5, double d6, byte b) {
        List<Integer> list;
        int i;
        C12025x6 c12025x6 = new C12025x6((float) d, (float) d2);
        C12025x6[] c12025x6ArrM12141kk = m12141kk(C14116yg.m67475k4(d3), C14116yg.m67475k4(d4), d5, d6);
        if (c12025x6ArrM12141kk.length < 4) {
            return c12025x6;
        }
        C12025x6 c12025x62 = new C12025x6(c12025x6ArrM12141kk[0].m56897x1(), c12025x6ArrM12141kk[0].m56895kk());
        int i2 = 1;
        C12025x6 c12025x63 = new C12025x6(c12025x6ArrM12141kk[c12025x6ArrM12141kk.length - 1].m56897x1(), c12025x6ArrM12141kk[c12025x6ArrM12141kk.length - 1].m56895kk());
        double dM56897x1 = d + d3;
        double dM56895kk = d2 + d4;
        if (b == 1) {
            dM56897x1 = d - ((double) c12025x63.m56897x1());
            dM56895kk = d2 - ((double) c12025x63.m56895kk());
            c12025x6 = new C12025x6((float) (((double) c12025x62.m56897x1()) + dM56897x1), (float) (((double) c12025x62.m56895kk()) + dM56895kk));
        } else if (b == 2) {
            dM56897x1 = d - ((double) c12025x62.m56897x1());
            dM56895kk = d2 - ((double) c12025x62.m56895kk());
            c12025x6 = new C12025x6((float) (((double) c12025x63.m56897x1()) + dM56897x1), (float) (((double) c12025x63.m56895kk()) + dM56895kk));
        }
        this.f8515dy.addItem(new C12025x6((float) (((double) c12025x62.m56897x1()) + dM56897x1), (float) (((double) c12025x62.m56895kk()) + dM56895kk)));
        m12138ck();
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c12025x6ArrM12141kk.length) {
                break;
            }
            this.f8515dy.addItem(new C12025x6((float) (((double) c12025x6ArrM12141kk[i2].m56897x1()) + dM56897x1), (float) (((double) c12025x6ArrM12141kk[i2].m56895kk()) + dM56895kk)));
            this.f8513c5.addItem(3);
            i2 = i3;
        }
        this.f8515dy.addItem(new C12025x6((float) (((double) c12025x63.m56897x1()) + dM56897x1), (float) (((double) c12025x63.m56895kk()) + dM56895kk)));
        if (C14116yg.m67475k4(d6) >= 360.0d) {
            list = this.f8513c5;
            i = 131;
        } else {
            list = this.f8513c5;
            i = 3;
        }
        list.addItem(i);
        return c12025x6;
    }

    /* JADX INFO: renamed from: kk */
    private C12025x6[] m12141kk(double d, double d2, double d3, double d4) {
        double d5 = d3;
        while (d5 > 360.0d) {
            d5 -= 360.0d;
        }
        while (d5 < -360.0d) {
            d5 += 360.0d;
        }
        List list = new List();
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67475k4(d4)), 14) / 90;
        if (iM27462to * 90 < C14116yg.m67475k4(d4)) {
            iM27462to++;
        }
        double d6 = d4 / ((double) iM27462to);
        boolean z = true;
        for (int i = 0; i < iM27462to; i++) {
            C12025x6[] c12025x6ArrM12142x1 = m12142x1(d, d2, (((double) i) * d6) + d5, d6);
            if (z) {
                list.addItem(c12025x6ArrM12142x1[0].Clone());
                z = false;
            }
            byte b = 1;
            while (true) {
                int i2 = b & 255;
                if (i2 < 4) {
                    list.addItem(c12025x6ArrM12142x1[i2].Clone());
                    b = (byte) (b + 1);
                }
            }
        }
        return (C12025x6[]) list.toArray(new C12025x6[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12160x1(double d, double d2, boolean z) {
        this.f8519kk = z ? new C2968xo(this.f8519kk.m12606k4() * d, this.f8519kk.m12611x1() * d2) : new C2968xo(d, d2);
    }

    public C2674bu(C11896dy c11896dy, float f) {
        m12156kk();
        m12159x1();
        if (c11896dy.m55525du() > 0) {
            C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
            byte[] bArrM55571to = c11896dy.m55571to();
            for (int i = 0; i < c12025x6ArrM55565kk.length; i++) {
                C12025x6 c12025x6Clone = c12025x6ArrM55565kk[i].Clone();
                this.f8513c5.addItem(Integer.valueOf(bArrM55571to[i] & 255));
                this.f8515dy.addItem(new C12025x6(c12025x6Clone.m56897x1() * f, c12025x6Clone.m56895kk() * f));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m12140k4(C12025x6 c12025x6, double d, double d2, C12025x6 c12025x62, double d3, double d4) {
        if (C14116yg.m67475k4(d2) <= C14116yg.m67475k4(d) && C14116yg.m67475k4(d2) < C14116yg.m67475k4(d4)) {
            double d5 = d * d4;
            double d6 = d3 * d2;
            double dM56897x1 = (((d2 * d4) * ((double) (c12025x62.m56897x1() - c12025x6.m56897x1()))) + ((((double) c12025x6.m56895kk()) * d5) - (((double) c12025x62.m56895kk()) * d6))) / (d5 - d6);
            return new C12025x6((float) ((((dM56897x1 - ((double) c12025x62.m56895kk())) * d3) / d4) + ((double) c12025x62.m56897x1())), (float) dM56897x1);
        }
        if (C14116yg.m67475k4(d4) <= C14116yg.m67475k4(d3) && C14116yg.m67475k4(d4) < C14116yg.m67475k4(d2)) {
            double d7 = d * d4;
            double d8 = d3 * d2;
            double dM56897x12 = (((d2 * d4) * ((double) (c12025x62.m56897x1() - c12025x6.m56897x1()))) + ((((double) c12025x6.m56895kk()) * d7) - (((double) c12025x62.m56895kk()) * d8))) / (d7 - d8);
            return new C12025x6((float) ((((dM56897x12 - ((double) c12025x6.m56895kk())) * d) / d2) + ((double) c12025x6.m56897x1())), (float) dM56897x12);
        }
        if (C14116yg.m67475k4(d) <= C14116yg.m67475k4(d2) && C14116yg.m67475k4(d) < C14116yg.m67475k4(d3)) {
            double d9 = d * d4;
            double d10 = d2 * d3;
            double dM56895kk = (((d * d3) * ((double) (c12025x6.m56895kk() - c12025x62.m56895kk()))) + ((((double) c12025x62.m56897x1()) * d9) - (((double) c12025x6.m56897x1()) * d10))) / (d9 - d10);
            return new C12025x6((float) dM56895kk, (float) ((((dM56895kk - ((double) c12025x62.m56897x1())) * d4) / d3) + ((double) c12025x62.m56895kk())));
        }
        if (C14116yg.m67475k4(d3) > C14116yg.m67475k4(d4) || C14116yg.m67475k4(d3) >= C14116yg.m67475k4(d)) {
            return new C12025x6((c12025x62.m56897x1() + c12025x6.m56897x1()) / 2.0f, (c12025x62.m56895kk() + c12025x6.m56895kk()) / 2.0f);
        }
        double d11 = d * d4;
        double d12 = d3 * d2;
        double dM56895kk2 = (((d3 * d) * ((double) (c12025x6.m56895kk() - c12025x62.m56895kk()))) + ((((double) c12025x62.m56897x1()) * d11) - (((double) c12025x6.m56897x1()) * d12))) / (d11 - d12);
        return new C12025x6((float) dM56895kk2, (float) ((((dM56895kk2 - ((double) c12025x6.m56897x1())) * d2) / d) + ((double) c12025x6.m56895kk())));
    }

    /* JADX INFO: renamed from: x1 */
    private C12025x6[] m12142x1(double d, double d2, double d3, double d4) {
        char c;
        C12025x6 c12025x6;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        double d5 = (d3 * 3.141592653589793d) / 180.0d;
        double d6 = ((d3 + d4) * 3.141592653589793d) / 180.0d;
        double d7 = d2 * d2;
        double d8 = 1.0d - (d7 / (d * d));
        double dM67470dy = C14116yg.m67470dy(d5);
        double dM67496rv = C14116yg.m67496rv(d7 / (1.0d - ((d8 * dM67470dy) * dM67470dy)));
        c12025x6Arr[0] = new C12025x6((float) (dM67470dy * dM67496rv), (float) (C14116yg.m67495m9(d5) * dM67496rv));
        double dM67470dy2 = C14116yg.m67470dy(d6);
        double dM67496rv2 = C14116yg.m67496rv(d7 / (1.0d - ((d8 * dM67470dy2) * dM67470dy2)));
        c12025x6Arr[3] = new C12025x6((float) (dM67470dy2 * dM67496rv2), (float) (C14116yg.m67495m9(d6) * dM67496rv2));
        C12025x6 c12025x62 = new C12025x6((c12025x6Arr[3].m56897x1() + c12025x6Arr[0].m56897x1()) / 2.0f, (c12025x6Arr[3].m56895kk() + c12025x6Arr[0].m56895kk()) / 2.0f);
        double dM67496rv3 = C14116yg.m67496rv(C14116yg.m67469du((((double) c12025x62.m56897x1()) * d2) / d, 2.0d) + ((double) (c12025x62.m56895kk() * c12025x62.m56895kk())));
        new C12025x6();
        if (C14116yg.m67475k4(dM67496rv3) < 1.0E-10d) {
            c12025x6 = new C12025x6(0.0f, 0.0f);
            c = 3;
        } else {
            c = 3;
            c12025x6 = new C12025x6((float) ((((((((double) c12025x62.m56897x1()) * d2) / dM67496rv3) - ((double) c12025x62.m56897x1())) * 4.0d) / 3.0d) + ((double) c12025x62.m56897x1())), (float) ((((((((double) c12025x62.m56895kk()) * d2) / dM67496rv3) - ((double) c12025x62.m56895kk())) * 4.0d) / 3.0d) + ((double) c12025x62.m56895kk())));
        }
        C12025x6 c12025x63 = new C12025x6((float) (((double) c12025x6Arr[0].m56897x1()) - ((((double) c12025x6Arr[0].m56895kk()) * d) / d2)), (float) (((((double) c12025x6Arr[0].m56897x1()) * d2) / d) + ((double) c12025x6Arr[0].m56895kk())));
        C12025x6 c12025x64 = new C12025x6((float) (((((double) c12025x6Arr[c].m56895kk()) * d) / d2) + ((double) c12025x6Arr[c].m56897x1())), (float) (((double) c12025x6Arr[c].m56895kk()) - ((((double) c12025x6Arr[c].m56897x1()) * d2) / d)));
        m12140k4(c12025x6Arr[0].Clone(), c12025x63.m56897x1() - c12025x6Arr[0].m56897x1(), c12025x63.m56895kk() - c12025x6Arr[0].m56895kk(), c12025x6.Clone(), c12025x6Arr[c].m56897x1() - c12025x6Arr[0].m56897x1(), c12025x6Arr[c].m56895kk() - c12025x6Arr[0].m56895kk()).CloneTo(c12025x6Arr[1]);
        m12140k4(c12025x6Arr[c].Clone(), c12025x64.m56897x1() - c12025x6Arr[c].m56897x1(), c12025x64.m56895kk() - c12025x6Arr[c].m56895kk(), c12025x6.Clone(), c12025x6Arr[c].m56897x1() - c12025x6Arr[0].m56897x1(), c12025x6Arr[c].m56895kk() - c12025x6Arr[0].m56895kk()).CloneTo(c12025x6Arr[2]);
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12149k4() {
        m12159x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12150k4(double d, double d2, double d3, double d4) {
        this.f8515dy.addItem(new C12025x6((float) d, (float) d2));
        this.f8515dy.addItem(new C12025x6((float) d3, (float) d4));
        m12138ck();
        this.f8513c5.addItem(1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12151k4(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f8515dy.addItem(new C12025x6((float) d, (float) d2));
        this.f8515dy.addItem(new C12025x6((float) d3, (float) d4));
        this.f8515dy.addItem(new C12025x6((float) d5, (float) d6));
        this.f8515dy.addItem(new C12025x6((float) d7, (float) d8));
        m12138ck();
        this.f8513c5.addItem(3);
        this.f8513c5.addItem(3);
        this.f8513c5.addItem(3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12152k4(double d, double d2, boolean z) {
        if (z) {
            C2968xo.m12600k4(this.f8522x1, new C2968xo(d, d2)).CloneTo(this.f8522x1);
        } else {
            this.f8522x1 = new C2968xo(d, d2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12153k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        m12150k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12154k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        m12151k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk(), c12025x64.m56897x1(), c12025x64.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12155k4(boolean z, boolean z2) {
        this.f8514du = z;
        this.f8516h4 = z2;
    }
}
