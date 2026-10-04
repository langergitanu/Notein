package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p040bg.OooO00o;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10972up;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10964lr;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C6254uz extends AbstractC10972up {

    /* JADX INFO: renamed from: du */
    private List<C12025x6> f17729du;

    /* JADX INFO: renamed from: h4 */
    private double f17730h4;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f17731k4;

    /* JADX INFO: renamed from: kk */
    private boolean f17732kk;

    /* JADX INFO: renamed from: m9 */
    private float[] f17733m9;

    /* JADX INFO: renamed from: to */
    private boolean f17734to;

    /* JADX INFO: renamed from: x1 */
    private final C6233bv f17735x1;

    public C6254uz(C6233bv c6233bv) {
        this.f17731k4 = C12025x6.f40591k4.Clone();
        this.f17729du = new List<>();
        this.f17735x1 = c6233bv;
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m25371k4(C12025x6[] c12025x6Arr, float f) {
        float f2 = 1.0f - f;
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = f3 * 3.0f * f;
        float f6 = f2 * f * 3.0f * f;
        float f7 = f * f * f;
        return new C12025x6((c12025x6Arr[3].m56897x1() * f7) + (c12025x6Arr[2].m56897x1() * f6) + (c12025x6Arr[1].m56897x1() * f5) + (c12025x6Arr[0].m56897x1() * f4), OooO00o.OooO00o(c12025x6Arr[3], f7, OooO00o.OooO00o(c12025x6Arr[2], f6, OooO00o.OooO00o(c12025x6Arr[1], f5, c12025x6Arr[0].m56895kk() * f4))));
    }

    /* JADX INFO: renamed from: kk */
    public final void m25377kk(C10971um c10971um) {
        m53112x1((AbstractC10973uz) c10971um);
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: x1 */
    public void mo13529x1(C10950bv c10950bv) {
        if (c10950bv.m52896k4()) {
            m25372k4();
        }
        if (this.f17729du.size() > 0) {
            int length = this.f17733m9.length;
            float[] fArr = new float[length];
            int i = 0;
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.f17733m9;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr[i2] = fArr2[i2] * ((float) this.f17730h4);
                i2++;
            }
            int i3 = 0;
            while (i3 < this.f17729du.size() - 1) {
                double d = fArr[i3 % length];
                int i4 = i3 + 1;
                while (i4 < this.f17729du.size()) {
                    if (C14116yg.m67469du(this.f17729du.get_Item(i4).m56895kk() - this.f17729du.get_Item(i3).m56895kk(), 2.0d) + C14116yg.m67469du(this.f17729du.get_Item(i4).m56897x1() - this.f17729du.get_Item(i3).m56897x1(), 2.0d) < d * d) {
                        this.f17729du.removeAt(i4);
                    }
                }
                i3 = i4;
            }
            while (i < this.f17729du.size() - 1) {
                if (i % 2 == 0) {
                    int i5 = i + 1;
                    m25373k4(this.f17729du.get_Item(i).Clone());
                    m25376x1(this.f17729du.get_Item(i5).Clone());
                    i = i5;
                }
                i++;
            }
        }
    }

    public C6254uz(C6258x1 c6258x1) {
        this(new C6233bv(c6258x1));
    }

    /* JADX INFO: renamed from: x1 */
    private void m25376x1(C12025x6 c12025x6) {
        int iM58608k4 = C12565ks.m58608k4(c12025x6.m56897x1()) - this.f17735x1.m25243to();
        int iM58608k42 = C12565ks.m58608k4(c12025x6.m56895kk()) - this.f17735x1.m25238du();
        if (iM58608k4 == 0 && iM58608k42 == 0) {
            return;
        }
        this.f17735x1.m25245x1(iM58608k4, iM58608k42);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25372k4() {
        this.f17735x1.m25245x1(C12565ks.m58608k4(this.f17731k4.m56897x1()) - this.f17735x1.m25243to(), C12565ks.m58608k4(this.f17731k4.m56895kk()) - this.f17735x1.m25238du());
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13521k4(C10950bv c10950bv) {
        this.f17732kk = true;
        this.f17734to = c10950bv.m52896k4();
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13523k4(C10955du c10955du) {
        if ((((C10971um) c10955du.m53116um().m53116um()).m53098k4() == null ? 0 : ((C10971um) c10955du.m53116um().m53116um()).m53098k4().m17364jd()) != 0) {
            this.f17730h4 = ((C10971um) c10955du.m53116um().m53116um()).m53098k4().m17375x1();
            this.f17733m9 = ((C10971um) c10955du.m53116um().m53116um()).m53098k4().m17357ck();
            m25375k4(new C12025x6[]{c10955du.m52919k4().m53050k4(), c10955du.m52919k4().m53057x1(), c10955du.m52919k4().m53053kk(), c10955du.m52919k4().m53055to()});
            return;
        }
        if (this.f17732kk) {
            c10955du.m52919k4().m53050k4().CloneTo(this.f17731k4);
            m25373k4(this.f17731k4.Clone());
            this.f17732kk = false;
        } else {
            m25376x1(c10955du.m52919k4().m53050k4().Clone());
        }
        for (C10964lr c10964lr : c10955du.m52919k4().m53048du()) {
            m25374k4(c10964lr.m53010k4().Clone(), c10964lr.m53015x1().Clone());
        }
    }

    @Override // com.aspose.slides.internal.p420th.AbstractC10972up
    /* JADX INFO: renamed from: k4 */
    public void mo13528k4(C10974v4 c10974v4) {
        if (c10974v4.m53117k4().size() <= 0) {
            return;
        }
        int i = 0;
        if ((((C10971um) c10974v4.m53116um().m53116um()).m53098k4() == null ? 0 : ((C10971um) c10974v4.m53116um().m53116um()).m53098k4().m17364jd()) != 0 && !this.f17734to) {
            this.f17730h4 = ((C10971um) c10974v4.m53116um().m53116um()).m53098k4().m17375x1();
            this.f17733m9 = ((C10971um) c10974v4.m53116um().m53116um()).m53098k4().m17357ck();
            while (i < c10974v4.m53117k4().size() - 1) {
                int i2 = i + 1;
                m25375k4(new C12025x6[]{c10974v4.m53117k4().get_Item(i), c10974v4.m53117k4().get_Item(i), c10974v4.m53117k4().get_Item(i2), c10974v4.m53117k4().get_Item(i2)});
                i += 2;
            }
            return;
        }
        if (this.f17732kk) {
            c10974v4.m53117k4().get_Item(0).CloneTo(this.f17731k4);
            m25373k4(this.f17731k4.Clone());
            this.f17732kk = false;
        }
        while (i < c10974v4.m53117k4().size()) {
            m25376x1(c10974v4.m53117k4().get_Item(i).Clone().Clone());
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25373k4(C12025x6 c12025x6) {
        this.f17735x1.m25240k4(C12565ks.m58608k4(c12025x6.m56897x1()), C12565ks.m58608k4(c12025x6.m56895kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m25374k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        this.f17735x1.m25241k4(C12565ks.m58608k4(c12025x6.m56897x1()) - this.f17735x1.m25243to(), C12565ks.m58608k4(c12025x6.m56895kk()) - this.f17735x1.m25238du(), C12565ks.m58608k4(c12025x62.m56897x1()) - C12565ks.m58608k4(c12025x6.m56897x1()), C12565ks.m58608k4(c12025x62.m56895kk()) - C12565ks.m58608k4(c12025x6.m56895kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m25375k4(C12025x6[] c12025x6Arr) {
        List list = new List();
        float f = 1.0f / 40;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i <= 40; i++) {
            list.addItem(m25371k4(c12025x6Arr, f3).Clone());
            f3 += f;
        }
        double dM67496rv = 0.0d;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            dM67496rv += C14116yg.m67496rv(C14116yg.m67469du(((C12025x6) list.get_Item(r7)).m56895kk() - ((C12025x6) list.get_Item(i2)).m56895kk(), 2.0d) + C14116yg.m67469du(((C12025x6) list.get_Item(r7)).m56897x1() - ((C12025x6) list.get_Item(i2)).m56897x1(), 2.0d));
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(dM67496rv + 1.0d), 14) * 3;
        float f4 = 1.0f / iM27462to;
        list.clear();
        for (int i3 = 0; i3 <= iM27462to; i3++) {
            list.addItem(m25371k4(c12025x6Arr, f2).Clone());
            f2 += f4;
        }
        this.f17729du.addRange(AbstractC14092to.m67204k4(list.toArray(new C12025x6[0])));
    }
}
