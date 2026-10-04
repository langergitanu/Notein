package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.internal.p505xn.C12575x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
class gp2 implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    protected double[] f5298c5;

    /* JADX INFO: renamed from: ck */
    protected C12003du[] f5299ck;

    /* JADX INFO: renamed from: du */
    protected float f5300du;

    /* JADX INFO: renamed from: dy */
    protected List<Integer> f5301dy;

    /* JADX INFO: renamed from: fa */
    protected String[] f5302fa;

    /* JADX INFO: renamed from: h4 */
    protected float f5303h4;

    /* JADX INFO: renamed from: ix */
    protected boolean f5304ix;

    /* JADX INFO: renamed from: jd */
    protected List<C0886d8> f5305jd;

    /* JADX INFO: renamed from: k4 */
    protected float f5306k4;

    /* JADX INFO: renamed from: kk */
    protected float f5307kk;

    /* JADX INFO: renamed from: ks */
    protected float[] f5308ks;

    /* JADX INFO: renamed from: m9 */
    protected k6w[] f5309m9;

    /* JADX INFO: renamed from: ne */
    protected int f5310ne;

    /* JADX INFO: renamed from: rv */
    protected int f5311rv;

    /* JADX INFO: renamed from: to */
    protected float f5312to;

    /* JADX INFO: renamed from: u4 */
    protected int f5313u4;

    /* JADX INFO: renamed from: up */
    protected C12013m9 f5314up;

    /* JADX INFO: renamed from: uz */
    private boolean f5315uz;

    /* JADX INFO: renamed from: x1 */
    protected float f5316x1;

    /* JADX INFO: renamed from: x6 */
    protected float f5317x6;

    /* JADX INFO: renamed from: yj */
    protected C12003du f5318yj;

    public gp2() {
        this.f5300du = 0.0f;
        this.f5303h4 = 0.0f;
        this.f5301dy = new List<>();
        this.f5298c5 = new double[0];
        this.f5305jd = null;
        this.f5318yj = C12575x1.m58706yd().Clone();
        this.f5308ks = new float[]{0.0f};
        this.f5311rv = 1;
        this.f5317x6 = 1.0f;
        this.f5310ne = 0;
        this.f5304ix = true;
        this.f5313u4 = -1;
        this.f5315uz = false;
    }

    /* JADX INFO: renamed from: ck */
    private C11896dy m6848ck() {
        C11896dy c11896dy = new C11896dy();
        for (k6w k6wVar : this.f5309m9) {
            c11896dy.m55575x1(k6wVar.m63689m9().m56557jd(), k6wVar.m63689m9().m56551ck(), k6wVar.m63689m9().m56550c5(), k6wVar.m63689m9().m56575x1(), k6wVar.m63695x1(), k6wVar.m63686kk());
            c11896dy.m55575x1(k6wVar.m63689m9().m56557jd(), k6wVar.m63689m9().m56551ck() + k6wVar.m63672dy(), k6wVar.m63689m9().m56550c5(), k6wVar.m63689m9().m56575x1(), k6wVar.m63695x1(), k6wVar.m63686kk());
        }
        return c11896dy;
    }

    /* JADX INFO: renamed from: k4 */
    private int m6849k4(C12025x6 c12025x6, C12007ix c12007ix) {
        if (c12007ix.m56556h4() < c12025x6.m56897x1()) {
            if (c12007ix.m56558k4() < c12025x6.m56895kk()) {
                return 2;
            }
            return c12007ix.m56554dy() > c12025x6.m56895kk() ? 8 : 1;
        }
        if (c12007ix.m56571to() > c12025x6.m56897x1()) {
            if (c12007ix.m56558k4() < c12025x6.m56895kk()) {
                return 4;
            }
            return c12007ix.m56554dy() > c12025x6.m56895kk() ? 6 : 5;
        }
        if (c12007ix.m56558k4() < c12025x6.m56895kk()) {
            return 3;
        }
        return c12007ix.m56554dy() > c12025x6.m56895kk() ? 7 : 0;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m6856c5() {
        for (k6w k6wVar : this.f5309m9) {
            k6wVar.m63699yj();
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m6871k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: du */
    public final C12015qq m6857du() {
        float fM6873kk = m6873kk();
        return new C12015qq(m6875to().m56699x1() * fM6873kk, m6875to().m56697kk() * fM6873kk);
    }

    /* JADX INFO: renamed from: dy */
    public final void m6858dy() {
        List list = new List();
        list.addRange(AbstractC14092to.m67204k4((Object[]) this.f5309m9));
        int i = 1;
        if (this.f5309m9[0].m63695x1() > 90.0f && this.f5309m9[0].m63695x1() <= 270.0f && this.f5309m9[0].m63695x1() + this.f5309m9[0].m63686kk() > 450.0f) {
            k6w[] k6wVarArrM63697x1 = ((k6w) list.get_Item(0)).m63697x1(0.0f);
            list.set_Item(0, k6wVarArrM63697x1[0]);
            if (k6wVarArrM63697x1[1].m63686kk() > 0.0f) {
                list.insertItem(1, k6wVarArrM63697x1[1]);
            }
        } else if ((this.f5309m9[0].m63695x1() > 270.0f && this.f5309m9[0].m63695x1() + this.f5309m9[0].m63686kk() > 450.0f) || (this.f5309m9[0].m63695x1() < 90.0f && this.f5309m9[0].m63695x1() + this.f5309m9[0].m63686kk() > 270.0f)) {
            k6w[] k6wVarArrM63697x12 = ((k6w) list.get_Item(0)).m63697x1(180.0f);
            list.set_Item(0, k6wVarArrM63697x12[1]);
            if (k6wVarArrM63697x12[1].m63686kk() > 0.0f) {
                list.addItem(k6wVarArrM63697x12[0]);
            }
        }
        ((k6w) list.get_Item(0)).m63669c5();
        int size = list.size() - 1;
        while (i < size) {
            k6w k6wVar = (k6w) list.get_Item(size);
            float fM63695x1 = k6wVar.m63695x1() - 90.0f;
            if (fM63695x1 > 180.0f || fM63695x1 < 0.0f) {
                fM63695x1 = 0.0f;
            }
            k6w k6wVar2 = (k6w) list.get_Item(i);
            float fM63671du = (450.0f - k6wVar2.m63671du()) % 360.0f;
            if (fM63671du > 180.0f || fM63671du < 0.0f) {
                fM63671du = 0.0f;
            }
            if (fM63671du >= fM63695x1) {
                k6wVar2.m63669c5();
                i++;
            } else if (fM63671du < fM63695x1) {
                k6wVar.m63669c5();
                size--;
            }
        }
        ((k6w) list.get_Item(size)).m63669c5();
    }

    /* JADX INFO: renamed from: h4 */
    public final float m6859h4() {
        return (this.f5312to / (m6873kk() + 1.0f)) * this.f5300du;
    }

    /* JADX INFO: renamed from: jd */
    public final void m6860jd() {
        for (k6w k6wVar : this.f5309m9) {
            k6wVar.m63688ks();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final float m6873kk() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            float[] fArr = this.f5308ks;
            if (i >= fArr.length || i >= this.f5298c5.length) {
                break;
            }
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
            i++;
        }
        return f;
    }

    /* JADX INFO: renamed from: m9 */
    public void m6874m9() {
        float fM56697kk;
        List list;
        int i;
        double d;
        int i2;
        int i3;
        double d2;
        int i4;
        k6w k6wVarM6863k4;
        List list2;
        double d3 = 0.0d;
        for (double d4 : this.f5298c5) {
            d3 += d4;
        }
        C12015qq c12015qqClone = m6875to().Clone();
        C12015qq c12015qqClone2 = m6857du().Clone();
        int length = this.f5308ks.length - 1;
        List list3 = new List();
        this.f5301dy.clear();
        byte b = -1;
        double d5 = this.f5303h4;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            double[] dArr = this.f5298c5;
            if (i6 >= dArr.length) {
                this.f5309m9 = (k6w[]) list3.toArray(new k6w[0]);
                return;
            }
            double d6 = (dArr[i6] / d3) * 360.0d;
            float f = this.f5308ks[i7];
            if (f > 0.0f) {
                C12015qq c12015qqClone3 = m6861k4((float) ((d6 / 2.0d) + d5), f).Clone();
                float fM56699x1 = c12015qqClone3.m56699x1();
                fM56697kk = c12015qqClone3.m56697kk();
                f = fM56699x1;
            } else {
                fM56697kk = f;
            }
            if (i6 == this.f5313u4) {
                d = d3;
                list = list3;
                i = i7;
                i3 = i5;
                i2 = i6;
                k6wVarM6863k4 = m6862k4((c12015qqClone2.m56699x1() / 2.0f) + this.f5306k4 + f, (c12015qqClone2.m56697kk() / 2.0f) + this.f5316x1 + fM56697kk, c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), m6859h4(), (float) (d5 % 360.0d), (float) d6, this.f5299ck[i8].Clone(), this.f5310ne, this.f5311rv, this.f5317x6);
                d2 = d6;
                i4 = length;
            } else {
                list = list3;
                i = i7;
                int i9 = length;
                d = d3;
                i2 = i6;
                i3 = i5;
                List<C0886d8> list4 = this.f5305jd;
                d2 = d6;
                i4 = i9;
                k6wVarM6863k4 = m6863k4((c12015qqClone2.m56699x1() / 2.0f) + this.f5306k4 + f, (c12015qqClone2.m56697kk() / 2.0f) + this.f5316x1 + fM56697kk, c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), m6859h4(), (float) (d5 % 360.0d), (float) d6, this.f5299ck[i8].Clone(), this.f5310ne, this.f5311rv, this.f5317x6, (list4 == null || i2 >= list4.size()) ? null : this.f5305jd.get_Item(i2));
            }
            k6wVarM6863k4.m63684k4(this.f5302fa[i2]);
            if (i3 > -1 || ((d5 <= 270.0d && d5 + d2 > 270.0d) || (d5 >= 270.0d && d5 + d2 > 630.0d))) {
                list2 = list;
                i5 = i3 + 1;
                list2.insertItem(i5, k6wVarM6863k4);
                this.f5301dy.insertItem(i5, Integer.valueOf(i2));
            } else {
                list2 = list;
                list2.addItem(k6wVarM6863k4);
                this.f5301dy.addItem(Integer.valueOf(i2));
                i5 = i3;
            }
            int i10 = i;
            i7 = i10 < i4 ? i10 + 1 : i10;
            int i11 = i8 + 1;
            i8 = i11 >= this.f5299ck.length ? 0 : i11;
            d5 += d2;
            if (d5 > 360.0d) {
                d5 -= 360.0d;
            }
            List list5 = list2;
            i6 = i2 + 1;
            list3 = list5;
            b = -1;
            length = i4;
            d3 = d;
        }
    }

    /* JADX INFO: renamed from: to */
    public final C12015qq m6875to() {
        float fM6873kk = m6873kk() + 1.0f;
        return new C12015qq(this.f5307kk / fM6873kk, (1.0f - this.f5300du) * (this.f5312to / fM6873kk));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m6876x1() {
        C12007ix c12007ixClone = this.f5309m9[0].m63691rv().Clone();
        for (int i = 1; i < this.f5309m9.length; i++) {
            C12007ix.m56549x1(c12007ixClone.Clone(), this.f5309m9[i].m63691rv().Clone()).CloneTo(c12007ixClone);
        }
        return c12007ixClone;
    }

    public gp2(float f, float f2, float f3, float f4, double[] dArr, C12003du[] c12003duArr, float f5, String[] strArr, List<C0886d8> list) {
        this.f5300du = 0.0f;
        this.f5303h4 = 0.0f;
        this.f5301dy = new List<>();
        this.f5298c5 = new double[0];
        this.f5305jd = null;
        this.f5318yj = C12575x1.m58706yd().Clone();
        this.f5308ks = new float[]{0.0f};
        this.f5311rv = 1;
        this.f5317x6 = 1.0f;
        this.f5310ne = 0;
        this.f5304ix = true;
        this.f5313u4 = -1;
        this.f5315uz = false;
        m6851k4(f, f2, f3, f4, dArr, c12003duArr, f5, strArr, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6855x1(k6w k6wVar, C12025x6[] c12025x6Arr, float f, C12015qq c12015qq) {
        C12025x6 c12025x6;
        float fM56897x1;
        double dM56897x1;
        double d;
        double d2 = f;
        if (d2 > 67.5d && d2 < 112.5d) {
            c12025x6 = c12025x6Arr[0];
            dM56897x1 = c12025x6.m56897x1();
            d = 112.5d - d2;
        } else {
            if (d2 <= 247.5d || d2 >= 292.5d) {
                if (d2 <= 67.5d || d2 >= 292.5d) {
                    c12025x6 = c12025x6Arr[0];
                    fM56897x1 = c12025x6.m56897x1() - c12015qq.m56699x1();
                    c12025x6.m56891k4(fM56897x1);
                }
                if (d2 >= 22.5d) {
                    C12025x6 c12025x62 = c12025x6Arr[0];
                    c12025x62.m56898x1((c12025x62.m56895kk() - (c12015qq.m56697kk() / 2.0f)) - ((c12015qq.m56697kk() * f) / 45.0f));
                    return;
                }
                if (d2 > 337.5d) {
                    C12025x6 c12025x63 = c12025x6Arr[0];
                    c12025x63.m56898x1(((c12015qq.m56697kk() * (360.0f - f)) / 45.0f) + (c12025x63.m56895kk() - (c12015qq.m56697kk() / 2.0f)));
                    return;
                }
                if (d2 > 157.5d && d2 < 202.5d) {
                    C12025x6 c12025x64 = c12025x6Arr[0];
                    c12025x64.m56898x1((float) (((double) c12025x64.m56895kk()) - (((202.5d - d2) * ((double) c12015qq.m56697kk())) / 45.0d)));
                    return;
                } else {
                    if (d2 > 157.5d || d2 < 22.5d) {
                        return;
                    }
                    C12025x6 c12025x65 = c12025x6Arr[0];
                    c12025x65.m56898x1(c12025x65.m56895kk() - c12015qq.m56697kk());
                    return;
                }
            }
            c12025x6 = c12025x6Arr[0];
            dM56897x1 = c12025x6.m56897x1();
            d = d2 - 247.5d;
        }
        fM56897x1 = (float) (dM56897x1 - ((d * ((double) c12015qq.m56699x1())) / 45.0d));
        c12025x6.m56891k4(fM56897x1);
        if (d2 >= 22.5d) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m6861k4(float f, float f2) {
        if (f2 == 0.0f) {
            return C12015qq.f40552k4;
        }
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        return new C12015qq((float) (C14116yg.m67470dy(d) * ((double) ((m6875to().m56699x1() * f2) / 2.0f))), (float) (C14116yg.m67495m9(d) * ((double) ((m6875to().m56697kk() * f2) / 2.0f))));
    }

    /* JADX INFO: renamed from: k4 */
    private static C12015qq m6850k4(C0852cf c0852cf, C14365qy c14365qy) {
        if (c0852cf == null) {
            throw new ArgumentNullException("labelContext");
        }
        if (c14365qy == null) {
            throw new ArgumentNullException("chartContext");
        }
        float width = c0852cf.m4570x1().getWidth();
        float height = c0852cf.m4570x1().getHeight();
        if (C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return new C12015qq(c14365qy.m69867v4() * ((c0852cf.m4570x1().getDataLabelFormat().getFormat().getLine().getFillFormat().getFillType() == 0 && c0852cf.m4570x1().getDataLabelFormat().getFormat().getLine().getFillFormat().getFillType() == -1) ? 0.2f : 0.175f), c14365qy.m69852lr());
        }
        return new C12015qq(width * c14365qy.m69867v4(), height * c14365qy.m69852lr());
    }

    /* JADX INFO: renamed from: k4 */
    public k6w m6862k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, C12003du c12003du, int i, int i2, float f8) {
        return new k6w(f, f2, f3, f4, f5, f6 % 360.0f, f7, C0924e2.m5332k4(c12003du.Clone(), 0.3f).Clone().Clone(), i, i2, f8);
    }

    /* JADX INFO: renamed from: k4 */
    public k6w m6863k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, C12003du c12003du, int i, int i2, float f8, C0886d8 c0886d8) {
        return new k6w(f, f2, f3, f4, f5, f6 % 360.0f, f7, c12003du.Clone(), i, i2, f8, c0886d8);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6864k4() {
        m6856c5();
        if (this.f5300du > 0.0f) {
            m6858dy();
        }
        m6860jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6865k4(float f) {
        float f2 = f % 360.0f;
        this.f5303h4 = f2;
        if (f2 < 0.0f) {
            this.f5303h4 = f2 + 360.0f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6851k4(float f, float f2, float f3, float f4, double[] dArr, C12003du[] c12003duArr, float f5, String[] strArr, List<C0886d8> list) {
        this.f5306k4 = f;
        this.f5316x1 = f2;
        this.f5307kk = f3;
        this.f5312to = f4;
        this.f5298c5 = dArr;
        this.f5299ck = c12003duArr;
        this.f5300du = f5;
        this.f5302fa = strArr;
        this.f5305jd = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6866k4(C12003du c12003du) {
        c12003du.CloneTo(this.f5318yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6867k4(C12007ix c12007ix) {
        float fM56550c5 = this.f5307kk / c12007ix.m56550c5();
        float fM56575x1 = this.f5312to / c12007ix.m56575x1();
        float fM56557jd = c12007ix.m56557jd() - this.f5306k4;
        float fM56551ck = c12007ix.m56551ck() - this.f5316x1;
        for (k6w k6wVar : this.f5309m9) {
            k6wVar.m63681k4(k6wVar.m63689m9().m56557jd() - fM56557jd, k6wVar.m63689m9().m56551ck() - fM56551ck, k6wVar.m63689m9().m56550c5() * fM56550c5, k6wVar.m63689m9().m56575x1() * fM56575x1, k6wVar.m63672dy() * fM56575x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6868k4(C12013m9 c12013m9) {
        this.f5314up = c12013m9;
    }

    /* JADX INFO: renamed from: k4 */
    private void m6852k4(k6w k6wVar, C13847mr c13847mr, C12007ix c12007ix, C12025x6 c12025x6) {
        C12025x6 c12025x62;
        C11896dy c11896dy;
        C12003du c12003duOooO00o;
        C12003du c12003duClone;
        C14365qy c14365qyM64941c5;
        FillFormat fillFormat;
        IEffectFormat iEffectFormat;
        C11896dy c11896dy2;
        C12025x6 c12025x63;
        C11896dy c11896dy3;
        C12025x6 c12025x6Clone;
        C12025x6 c12025x64;
        C12025x6 c12025x6Clone2;
        C12025x6 c12025x65;
        C12025x6 c12025x6OooO00o;
        C11896dy c11896dyM6848ck = m6848ck();
        float fM56550c5 = (k6wVar.m63689m9().m56550c5() / 2.0f) * 0.05f;
        C12007ix c12007ixClone = vnj.m72372k4(c11896dyM6848ck).Clone();
        C12025x6 c12025x66 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
        C12025x6 c12025x6Clone3 = c12025x6.Clone();
        c12025x6Clone3.m56891k4(c12025x6.m56897x1() < c12025x66.m56897x1() ? c12025x6Clone3.m56897x1() - 1.0f : c12025x6Clone3.m56897x1() + 1.0f);
        c12025x6Clone3.m56898x1(c12025x6.m56895kk() < c12025x66.m56895kk() ? c12025x6Clone3.m56895kk() - 1.0f : c12025x6Clone3.m56895kk() + 1.0f);
        C12025x6 c12025x67 = new C12025x6(c12007ix.m56571to(), C22203OooOO0o.OooO0O0(c12007ix, 3.0f, c12007ix.m56554dy()));
        C12025x6 c12025x68 = new C12025x6(C22205OooOOo.OooO00o(c12007ix, 3.0f, c12007ix.m56571to()), c12007ix.m56554dy());
        C12025x6 c12025x69 = new C12025x6(c12007ix.m56556h4(), C22203OooOO0o.OooO0O0(c12007ix, 3.0f, c12007ix.m56554dy()));
        C12025x6 c12025x610 = new C12025x6(C22205OooOOo.OooO00o(c12007ix, 3.0f, c12007ix.m56571to()), c12007ix.m56558k4());
        int iM6849k4 = m6849k4(c12025x6.Clone(), c12007ix.Clone());
        C11896dy c11896dy4 = new C11896dy();
        C12025x6 c12025x6Clone4 = C12025x6.f40591k4.Clone();
        LineFormat lineFormat = (LineFormat) ((DataLabelCollection) C7019kk.m27452k4((Object) c13847mr.m64945h4().getLabels(), DataLabelCollection.class)).getLeaderLinesFormat().getLine();
        C12003du c12003duClone2 = c13847mr.m64941c5().m69834fa().m506k4(c13847mr.m64941c5().m69834fa().getStyle() + 1 > 40 ? (byte) 1 : (byte) 0).Clone();
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        switch (iM6849k4) {
            case 1:
                c12025x62 = new C12025x6(c12025x69.m56897x1() + fM56550c5, c12025x69.m56895kk());
                C12556ck.m58562k4(c11896dy4, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy4, C22204OooOOOo.OooO00o(c12025x62, c11896dy4, c12025x69.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u4 = new C12018u4(c11896dy4);
                c12018u4.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u4, abstractC12008jdM56582k4) && c12025x62.m56897x1() <= c12025x6.m56897x1()) {
                    c11896dy = new C11896dy();
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy, C22204OooOOOo.OooO00o(c12025x62, c11896dy, c12025x69.Clone()), c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                }
                break;
            case 2:
                c12025x62 = new C12025x6(c12025x69.m56897x1() + fM56550c5, c12025x69.m56895kk());
                C12556ck.m58562k4(c11896dy4, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy4, C22204OooOOOo.OooO00o(c12025x62, c11896dy4, c12025x69.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u42 = new C12018u4(c11896dy4);
                c12018u42.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u42, abstractC12008jdM56582k4) && c12025x62.m56897x1() <= c12025x6.m56897x1()) {
                    c11896dy = new C11896dy();
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy, C22204OooOOOo.OooO00o(c12025x62, c11896dy, c12025x69.Clone()), c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                } else {
                    C11896dy c11896dy5 = new C11896dy();
                    c12025x63 = new C12025x6(c12025x610.m56897x1(), c12025x610.m56895kk() + fM56550c5);
                    C12556ck.m58562k4(c11896dy5, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy5, C22204OooOOOo.OooO00o(c12025x63, c11896dy5, c12025x610.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                    C12018u4 c12018u43 = new C12018u4(c11896dy5);
                    c12018u43.m56770x1(c11896dyM6848ck);
                    if (C12556ck.m58572x1(c12018u43, abstractC12008jdM56582k4) && c12025x63.m56895kk() <= c12025x6.m56895kk()) {
                        c11896dy3 = new C11896dy();
                        c12025x6Clone2 = c12025x610.Clone();
                        c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x63, c11896dy3, c12025x6Clone2);
                        c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                        c12003duClone = C12003du.f40505to.Clone();
                        c14365qyM64941c5 = c13847mr.m64941c5();
                        fillFormat = null;
                        iEffectFormat = null;
                        c11896dy2 = c11896dy3;
                        im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                        break;
                    }
                }
                break;
            case 3:
                C11896dy c11896dy6 = new C11896dy();
                c11896dy6.m55547k4(c12025x6Clone3.Clone(), new C12025x6(c12025x6Clone3.m56897x1(), c12025x610.m56895kk()));
                C12556ck.m58562k4(c11896dy6, im9.m7691k4(c12003duClone2.Clone(), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u44 = new C12018u4(c11896dy6);
                c12018u44.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u44, abstractC12008jdM56582k4) && c12025x6Clone4.m56895kk() <= c12025x6.m56895kk()) {
                    c11896dy3 = new C11896dy();
                    c12025x6Clone = c12025x6Clone3.Clone();
                    c12025x64 = new C12025x6(c12025x6Clone3.m56897x1(), c12025x610.m56895kk());
                    c11896dy3.m55547k4(c12025x6Clone, c12025x64);
                    c12003duOooO00o = c12003duClone2.Clone();
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                }
                break;
            case 4:
                C11896dy c11896dy7 = new C11896dy();
                c12025x65 = new C12025x6(c12025x67.m56897x1() - fM56550c5, c12025x67.m56895kk());
                C12556ck.m58562k4(c11896dy7, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy7, C22204OooOOOo.OooO00o(c12025x65, c11896dy7, c12025x67.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u45 = new C12018u4(c11896dy7);
                c12018u45.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u45, abstractC12008jdM56582k4) && c12025x65.m56897x1() >= c12025x6.m56897x1()) {
                    c11896dy3 = new C11896dy();
                    c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x65, c11896dy3, c12025x67.Clone());
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                } else {
                    C11896dy c11896dy8 = new C11896dy();
                    c12025x63 = new C12025x6(c12025x610.m56897x1(), c12025x610.m56895kk() + fM56550c5);
                    C12556ck.m58562k4(c11896dy8, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy8, C22204OooOOOo.OooO00o(c12025x63, c11896dy8, c12025x610.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                    C12018u4 c12018u46 = new C12018u4(c11896dy8);
                    c12018u46.m56770x1(c11896dyM6848ck);
                    if (C12556ck.m58572x1(c12018u46, abstractC12008jdM56582k4) && c12025x63.m56895kk() <= c12025x6.m56895kk()) {
                        c11896dy3 = new C11896dy();
                        c12025x6Clone2 = c12025x610.Clone();
                        c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x63, c11896dy3, c12025x6Clone2);
                        c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                        c12003duClone = C12003du.f40505to.Clone();
                        c14365qyM64941c5 = c13847mr.m64941c5();
                        fillFormat = null;
                        iEffectFormat = null;
                        c11896dy2 = c11896dy3;
                        im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                        break;
                    }
                }
                break;
            case 5:
                C11896dy c11896dy9 = new C11896dy();
                c12025x65 = new C12025x6(c12025x67.m56897x1() - fM56550c5, c12025x67.m56895kk());
                C12556ck.m58562k4(c11896dy9, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy9, C22204OooOOOo.OooO00o(c12025x65, c11896dy9, c12025x67.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u47 = new C12018u4(c11896dy9);
                c12018u47.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u47, abstractC12008jdM56582k4) && c12025x65.m56897x1() >= c12025x6.m56897x1()) {
                    c11896dy3 = new C11896dy();
                    c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x65, c11896dy3, c12025x67.Clone());
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                }
                break;
            case 6:
                C11896dy c11896dy10 = new C11896dy();
                C12025x6 c12025x611 = new C12025x6(c12025x67.m56897x1() - fM56550c5, c12025x67.m56895kk());
                C12556ck.m58562k4(c11896dy10, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy10, C22204OooOOOo.OooO00o(c12025x611, c11896dy10, c12025x67.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u48 = new C12018u4(c11896dy10);
                c12018u48.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u48, abstractC12008jdM56582k4) && c12025x611.m56897x1() >= c12025x6.m56897x1()) {
                    c11896dy3 = new C11896dy();
                    c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x611, c11896dy3, c12025x67.Clone());
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                } else {
                    C11896dy c11896dy11 = new C11896dy();
                    c12025x63 = new C12025x6(c12025x68.m56897x1(), c12025x68.m56895kk() - fM56550c5);
                    C12556ck.m58562k4(c11896dy11, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy11, C22204OooOOOo.OooO00o(c12025x63, c11896dy11, c12025x68.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                    C12018u4 c12018u49 = new C12018u4(c11896dy11);
                    c12018u49.m56770x1(c11896dyM6848ck);
                    if (C12556ck.m58572x1(c12018u49, abstractC12008jdM56582k4) && c12025x63.m56895kk() >= c12025x6.m56895kk()) {
                        c11896dy3 = new C11896dy();
                        c12025x6Clone2 = c12025x68.Clone();
                        c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x63, c11896dy3, c12025x6Clone2);
                        c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                        c12003duClone = C12003du.f40505to.Clone();
                        c14365qyM64941c5 = c13847mr.m64941c5();
                        fillFormat = null;
                        iEffectFormat = null;
                        c11896dy2 = c11896dy3;
                        im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                        break;
                    }
                }
                break;
            case 7:
                C11896dy c11896dy12 = new C11896dy();
                C12025x6 c12025x612 = new C12025x6(c12025x68.m56897x1(), c12025x68.m56895kk() - fM56550c5);
                c11896dy12.m55547k4(c12025x6Clone3.Clone(), new C12025x6(c12025x6Clone3.m56897x1(), c12025x68.m56895kk()));
                C12556ck.m58562k4(c11896dy12, im9.m7691k4(c12003duClone2.Clone(), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u410 = new C12018u4(c11896dy12);
                c12018u410.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u410, abstractC12008jdM56582k4) && c12025x612.m56895kk() >= c12025x6.m56895kk()) {
                    c11896dy3 = new C11896dy();
                    c12025x6Clone = c12025x6Clone3.Clone();
                    c12025x64 = new C12025x6(c12025x6Clone3.m56897x1(), c12025x68.m56895kk());
                    c11896dy3.m55547k4(c12025x6Clone, c12025x64);
                    c12003duOooO00o = c12003duClone2.Clone();
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                }
                break;
            case 8:
                C11896dy c11896dy13 = new C11896dy();
                c12025x63 = new C12025x6(c12025x69.m56897x1() + fM56550c5, c12025x69.m56895kk());
                C12556ck.m58562k4(c11896dy13, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy13, C22204OooOOOo.OooO00o(c12025x63, c11896dy13, c12025x69.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                C12018u4 c12018u411 = new C12018u4(c11896dy13);
                c12018u411.m56770x1(c11896dyM6848ck);
                if (C12556ck.m58572x1(c12018u411, abstractC12008jdM56582k4) && c12025x63.m56897x1() <= c12025x6.m56897x1()) {
                    c11896dy3 = new C11896dy();
                    c12025x6Clone2 = c12025x69.Clone();
                    c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x63, c11896dy3, c12025x6Clone2);
                    c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                    c12003duClone = C12003du.f40505to.Clone();
                    c14365qyM64941c5 = c13847mr.m64941c5();
                    fillFormat = null;
                    iEffectFormat = null;
                    c11896dy2 = c11896dy3;
                    im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                    break;
                } else {
                    C11896dy c11896dy14 = new C11896dy();
                    c12025x63 = new C12025x6(c12025x68.m56897x1(), c12025x68.m56895kk() - fM56550c5);
                    C12556ck.m58562k4(c11896dy14, im9.m7691k4(C22222Oooo0OO.OooO00o(c12025x6Clone3, c11896dy14, C22204OooOOOo.OooO00o(c12025x63, c11896dy14, c12025x68.Clone()), c12003duClone2), lineFormat, c13847mr.m64941c5(), 1.0f));
                    C12018u4 c12018u412 = new C12018u4(c11896dy14);
                    c12018u412.m56770x1(c11896dyM6848ck);
                    if (C12556ck.m58572x1(c12018u412, abstractC12008jdM56582k4) && c12025x63.m56895kk() >= c12025x6.m56895kk()) {
                        c11896dy3 = new C11896dy();
                        c12025x6Clone2 = c12025x68.Clone();
                        c12025x6OooO00o = C22204OooOOOo.OooO00o(c12025x63, c11896dy3, c12025x6Clone2);
                        c12003duOooO00o = C22222Oooo0OO.OooO00o(c12025x6, c11896dy3, c12025x6OooO00o, c12003duClone2);
                        c12003duClone = C12003du.f40505to.Clone();
                        c14365qyM64941c5 = c13847mr.m64941c5();
                        fillFormat = null;
                        iEffectFormat = null;
                        c11896dy2 = c11896dy3;
                        im9.m7694k4(c12003duOooO00o, c12003duClone, c14365qyM64941c5, c11896dy2, lineFormat, fillFormat, iEffectFormat);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6853k4(k6w k6wVar, C12025x6[] c12025x6Arr, float f, C12015qq c12015qq) {
        C12025x6 c12025x6;
        float fM56699x1;
        double d = f;
        if (d > 67.5d && d < 112.5d) {
            C12025x6 c12025x62 = c12025x6Arr[0];
            c12025x62.m56891k4((float) (((double) c12025x62.m56897x1()) - (((d - 67.5d) * ((double) c12015qq.m56699x1())) / 45.0d)));
        } else if (d < 112.5d || d > 247.5d) {
            if (d > 247.5d && f < 270.0f) {
                double dM63686kk = k6wVar.m63686kk();
                c12025x6 = c12025x6Arr[0];
                fM56699x1 = (float) ((((double) c12015qq.m56699x1()) / dM63686kk) + ((double) (c12025x6.m56897x1() - c12015qq.m56699x1())));
            } else if (f >= 270.0f && d < 292.5d) {
                c12025x6 = c12025x6Arr[0];
                fM56699x1 = (float) ((((d - 247.5d) * ((double) c12015qq.m56699x1())) / 45.0d) + ((double) (c12025x6.m56897x1() - c12015qq.m56699x1())));
            }
            c12025x6.m56891k4(fM56699x1);
        } else {
            C12025x6 c12025x63 = c12025x6Arr[0];
            c12025x63.m56891k4(c12025x63.m56897x1() - c12015qq.m56699x1());
        }
        if (f >= 0.0f && f <= 90.0f) {
            C12025x6 c12025x64 = c12025x6Arr[0];
            c12025x64.m56898x1(((f / 90.0f) * k6wVar.m63672dy()) + c12025x64.m56895kk());
            return;
        }
        if (f > 90.0f && f < 180.0f) {
            C12025x6 c12025x65 = c12025x6Arr[0];
            c12025x65.m56898x1(((((f - 180.0f) * (-1.0f)) / 90.0f) * k6wVar.m63672dy()) + c12025x65.m56895kk());
            return;
        }
        if (f < 225.0f && f > 180.0f) {
            C12025x6 c12025x66 = c12025x6Arr[0];
            c12025x66.m56898x1(c12025x66.m56895kk() - ((c12015qq.m56697kk() * (f - 135.0f)) / 90.0f));
            return;
        }
        if (f >= 225.0f && f <= 315.0f) {
            C12025x6 c12025x67 = c12025x6Arr[0];
            c12025x67.m56898x1(c12025x67.m56895kk() - c12015qq.m56697kk());
        } else {
            if (f <= 315.0f || f > 360.0f) {
                return;
            }
            C12025x6 c12025x68 = c12025x6Arr[0];
            c12025x68.m56898x1(((c12015qq.m56697kk() * (f - 315.0f)) / 90.0f) + (c12025x68.m56895kk() - c12015qq.m56697kk()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6869k4(C13847mr c13847mr) {
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        m6865k4((c13847mr.m64941c5().m69834fa().getRotation3D().getRotationY() & 65535) - 90.0f);
        float[] fArr = new float[listM64944dy.size()];
        for (int i = 0; i < listM64944dy.size(); i++) {
            fArr[i] = listM64944dy.get_Item(i).m5020x6() / 100.0f;
        }
        m6872k4(fArr);
        C0852cf c0852cfM5003ks = c13847mr.m64944dy().get_Item(0).m5003ks();
        m6868k4(c0852cfM5003ks.m4556c5());
        m6866k4(c0852cfM5003ks.m4562jd().Clone());
        m6874m9();
        if (this.f5304ix) {
            m6867k4(m6876x1().Clone().Clone());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6870k4(C14365qy c14365qy) {
        k6w[] k6wVarArr;
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        C14365qy c14365qy2 = c14365qy;
        C12019um c12019um = new C12019um();
        int i5 = 1;
        c12019um.m56812k4(1);
        c12019um.m56826x1(1);
        double d2 = 0.0d;
        int i6 = 0;
        double d3 = 0.0d;
        for (double d4 : this.f5298c5) {
            d3 += d4;
        }
        k6w[] k6wVarArr2 = this.f5309m9;
        int length = k6wVarArr2.length;
        int i7 = 0;
        while (i7 < length) {
            k6w k6wVar = k6wVarArr2[i7];
            if (k6wVar == null) {
                k6wVarArr = k6wVarArr2;
                i = length;
                i2 = i7;
                i3 = i6;
                i4 = i5;
            } else if (k6wVar.m63674h4().length() < i5) {
                k6wVarArr = k6wVarArr2;
                i = length;
                i2 = i7;
                i4 = i5;
                i3 = i6;
            } else {
                C0886d8 c0886d8M63698x6 = k6wVar.m63698x6();
                C13847mr c13847mrM5012up = c0886d8M63698x6.m5012up();
                C0852cf c0852cfM5003ks = c14365qy2.m69865up().get_Item(i6).m64944dy().get_Item(c13847mrM5012up.m64944dy().indexOf(c0886d8M63698x6)).m5003ks();
                if (c0852cfM5003ks.m4570x1().isVisible() || !"".equals(c0852cfM5003ks.m4564kk().getText())) {
                    double dM67475k4 = d3 == d2 ? 0.01d : C14116yg.m67475k4(c0886d8M63698x6.m4989k4()) / d3;
                    C12015qq c12015qqClone = m6850k4(c0852cfM5003ks, c14365qy2).Clone();
                    C12015qq c12015qqClone2 = c12015qqClone.Clone();
                    k6wVarArr = k6wVarArr2;
                    i = length;
                    i2 = i7;
                    double d5 = dM67475k4;
                    C0852cf c0852cf = c0852cfM5003ks;
                    i3 = i6;
                    C12015qq c12015qqClone3 = hgt.m7142k4(c14365qy2.m69865up(), c13847mrM5012up.m64963x1(), c0886d8M63698x6.m5007rv(), d5, c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), 0.0d, c14365qy).Clone();
                    if (C14064he.m66715kk(c0852cf.m4570x1().getWidth()) || C14064he.m66715kk(c0852cf.m4570x1().getHeight())) {
                        c12015qqClone3.CloneTo(c12015qqClone2);
                    }
                    C12007ix.f40519k4.Clone();
                    C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
                    int iM4559dy = c0852cf.m4559dy();
                    float f = 0.0f;
                    int i8 = i3;
                    while (i8 == 0) {
                        if (iM4559dy == 2) {
                            d = d5;
                            float[] fArr = new float[i5];
                            fArr[i3] = f;
                            k6wVar.m63678k4(0.25f, fArr).CloneTo(c12025x6Clone);
                            f = fArr[i3];
                            c12025x6Clone.m56891k4(c12025x6Clone.m56897x1() - (c12015qqClone2.m56699x1() / 2.0f));
                            c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() - (c12015qqClone2.m56697kk() / 2.0f));
                        } else if (iM4559dy == 4) {
                            d = d5;
                            float[] fArr2 = new float[i5];
                            fArr2[i3] = f;
                            k6wVar.m63678k4(0.485f, fArr2).CloneTo(c12025x6Clone);
                            f = fArr2[i3];
                            C12025x6[] c12025x6Arr = {c12025x6Clone};
                            m6855x1(k6wVar, c12025x6Arr, f, c12015qqClone2.Clone());
                            c12025x6Arr[i3].CloneTo(c12025x6Clone);
                        } else if (iM4559dy != 6) {
                            float[] fArr3 = new float[i5];
                            fArr3[i3] = f;
                            k6wVar.m63678k4(0.47f, fArr3).CloneTo(c12025x6Clone);
                            f = fArr3[i3];
                            C12025x6[] c12025x6Arr2 = new C12025x6[i5];
                            c12025x6Arr2[i3] = c12025x6Clone;
                            m6855x1(k6wVar, c12025x6Arr2, f, c12015qqClone2.Clone());
                            c12025x6Arr2[i3].CloneTo(c12025x6Clone);
                            if (!m6854k4(k6wVar, new C12007ix(c12025x6Clone.Clone(), c12015qqClone2.Clone()))) {
                                fArr3[i3] = f;
                                k6wVar.m63678k4(0.5f, fArr3).CloneTo(c12025x6Clone);
                                f = fArr3[i3];
                                c12025x6Arr2[i3] = c12025x6Clone;
                                m6853k4(k6wVar, c12025x6Arr2, f, c12015qqClone2.Clone());
                                c12025x6Arr2[i3].CloneTo(c12025x6Clone);
                                d = d5;
                                C12007ix c12007ix = new C12007ix(kc0.m63753k4(c12025x6Clone.m56897x1()), kc0.m63753k4(c12025x6Clone.m56895kk()), kc0.m63753k4(c12015qqClone2.m56699x1()), kc0.m63753k4(c12015qqClone2.m56697kk()));
                                C12007ix[] c12007ixArr = {c12007ix};
                                c14365qy.m69846k4(c12007ixArr);
                                c12007ixArr[i3].CloneTo(c12007ix);
                                C0852cf c0852cf2 = c0852cf;
                                kc0.m63763x1(C12014ne.m56661x1(c12007ix.Clone()).Clone()).CloneTo(c0852cf2.f4320kk.f5456k4);
                                c12025x6Clone = new C12025x6(!C14064he.m66715kk(c0852cf2.m4570x1().getX()) ? c12025x6Clone.m56897x1() + (c0852cf2.m4570x1().getX() * c14365qy.m69867v4()) : c12007ix.m56557jd(), !C14064he.m66715kk(c0852cf2.m4570x1().getX()) ? c12025x6Clone.m56895kk() + (c0852cf2.m4570x1().getY() * c14365qy.m69852lr()) : c12007ix.m56551ck());
                                c0852cf = c0852cf2;
                            }
                            i8 = 1;
                            i5 = 1;
                        } else {
                            double d6 = d5;
                            i8 = i5;
                            float[] fArr4 = new float[i8];
                            fArr4[i3] = f;
                            k6wVar.m63678k4(0.5f, fArr4).CloneTo(c12025x6Clone);
                            f = fArr4[i3];
                            C12025x6[] c12025x6Arr3 = {c12025x6Clone};
                            m6853k4(k6wVar, c12025x6Arr3, f, c12015qqClone2.Clone());
                            c12025x6Arr3[i3].CloneTo(c12025x6Clone);
                            d5 = d6;
                        }
                        d5 = d;
                        i8 = 1;
                        i5 = 1;
                    }
                    C0852cf c0852cf3 = c0852cf;
                    C12007ix c12007ix2 = new C12007ix(c12025x6Clone.Clone(), c12015qqClone2.Clone());
                    C12007ix[] c12007ixArr2 = {c12007ix2};
                    c14365qy.m69846k4(c12007ixArr2);
                    c12007ixArr2[i3].CloneTo(c12007ix2);
                    hgt.m7143k4(c13847mrM5012up.m64963x1(), c0886d8M63698x6.m5007rv(), d5, c12007ix2.Clone(), 0.0d, c14365qy);
                    if (c0886d8M63698x6.m5012up().m64962to() && !c0852cf3.m4560fa()) {
                        float[] fArr5 = new float[1];
                        fArr5[i3] = f;
                        C12025x6 c12025x6Clone2 = k6wVar.m63678k4(0.5f, fArr5).Clone();
                        float f2 = fArr5[i3];
                        if (f2 >= 5.0f && f2 <= 175.0f) {
                            c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() + k6wVar.m63672dy());
                        }
                        m6852k4(k6wVar, c0886d8M63698x6.m5012up(), c12007ix2.Clone(), c12025x6Clone2.Clone());
                    }
                    i4 = 1;
                }
            }
            i7 = i2 + 1;
            c14365qy2 = c14365qy;
            k6wVarArr2 = k6wVarArr;
            length = i;
            i6 = i3;
            i5 = i4;
            d2 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m6871k4(boolean z) {
        if (this.f5315uz) {
            return;
        }
        if (z) {
            for (k6w k6wVar : this.f5309m9) {
                k6wVar.dispose();
            }
        }
        this.f5315uz = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6872k4(float[] fArr) {
        this.f5308ks = fArr;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m6854k4(k6w k6wVar, C12007ix c12007ix) {
        C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(new C12007ix(this.f5306k4, this.f5316x1, this.f5307kk, this.f5312to));
        C11896dy c11896dy2 = new C11896dy();
        c11896dy2.m55575x1(k6wVar.m63689m9().m56557jd(), k6wVar.m63689m9().m56551ck(), k6wVar.m63689m9().m56550c5(), k6wVar.m63689m9().m56575x1(), k6wVar.m63695x1(), k6wVar.m63686kk());
        C12018u4 c12018u4 = new C12018u4(c11896dy);
        c12018u4.m56765to(c11896dy2);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        c12018u4.m56772x1(c12007ix2.Clone());
        return c12018u4.m56775x1(abstractC12008jdM56582k4) || c12018u4.m56749k4(abstractC12008jdM56582k4).m56550c5() < 1.0f || c12018u4.m56749k4(abstractC12008jdM56582k4).m56575x1() < 1.0f;
    }
}
