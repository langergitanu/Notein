package com.aspose.slides;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.b3 */
/* JADX INFO: loaded from: classes3.dex */
class C0791b3 extends DomObject<C14757wy> {

    /* JADX INFO: renamed from: ar */
    private double f4073ar;

    /* JADX INFO: renamed from: c5 */
    private double f4074c5;

    /* JADX INFO: renamed from: ck */
    private double f4075ck;

    /* JADX INFO: renamed from: du */
    private DataLabel f4076du;

    /* JADX INFO: renamed from: dy */
    private DataLabel f4077dy;

    /* JADX INFO: renamed from: fa */
    private double f4078fa;

    /* JADX INFO: renamed from: ix */
    private int f4079ix;

    /* JADX INFO: renamed from: jd */
    private double f4080jd;

    /* JADX INFO: renamed from: k4 */
    private String f4081k4;

    /* JADX INFO: renamed from: kk */
    private DataLabel f4082kk;

    /* JADX INFO: renamed from: ks */
    private long f4083ks;

    /* JADX INFO: renamed from: m9 */
    private DataLabel f4084m9;

    /* JADX INFO: renamed from: ne */
    private int f4085ne;

    /* JADX INFO: renamed from: qq */
    private boolean f4086qq;

    /* JADX INFO: renamed from: rv */
    private List<IChartDataPoint> f4087rv;

    /* JADX INFO: renamed from: to */
    private DataLabel f4088to;

    /* JADX INFO: renamed from: u4 */
    private Format f4089u4;

    /* JADX INFO: renamed from: up */
    private double f4090up;

    /* JADX INFO: renamed from: uz */
    private DataLabel f4091uz;

    /* JADX INFO: renamed from: wl */
    private int f4092wl;

    /* JADX INFO: renamed from: x1 */
    private DataLabel f4093x1;

    /* JADX INFO: renamed from: x6 */
    private List<IChartDataPoint> f4094x6;

    /* JADX INFO: renamed from: yj */
    private double f4095yj;

    public C0791b3(C14757wy c14757wy) {
        super(c14757wy);
        this.f4074c5 = Double.NaN;
        this.f4080jd = Double.NaN;
        this.f4075ck = Double.NaN;
        this.f4078fa = Double.NaN;
        this.f4090up = Double.NaN;
        this.f4095yj = 0.0d;
        this.f4083ks = 0L;
        this.f4087rv = new List<>();
        this.f4094x6 = new List<>();
        this.f4085ne = 0;
        this.f4079ix = 0;
        this.f4092wl = 0;
        this.f4086qq = false;
    }

    /* JADX INFO: renamed from: k4 */
    private double m3944k4(double[] dArr, double d) {
        AbstractC14092to.m67193du(AbstractC14092to.m67208k4(dArr));
        if (dArr.length == 1) {
            return dArr[0];
        }
        if (dArr.length == 2) {
            double d2 = (dArr[0] + dArr[1]) / 2.0d;
            if (d == 0.25d) {
                return m3947ck().getQuartileMethod() == 0 ? dArr[0] : (dArr[0] + d2) / 2.0d;
            }
            if (d == 0.5d) {
                return d2;
            }
            if (d == 0.75d) {
                return m3947ck().getQuartileMethod() == 0 ? dArr[1] : (dArr[1] + d2) / 2.0d;
            }
        }
        int length = dArr.length;
        double d3 = m3947ck().getQuartileMethod() == 0 ? ((double) (length + 1)) * d : (((double) (length - 1)) * d) + 1.0d;
        if (d3 == 1.0d) {
            return dArr[0];
        }
        if (d3 == length) {
            return dArr[length - 1];
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(d3), 14);
        double d4 = d3 - ((double) iM27462to);
        double d5 = dArr[iM27462to - 1];
        return C21532OooOOo.OooO0O0(dArr[iM27462to], d5, d4, d5);
    }

    /* JADX INFO: renamed from: ar */
    public final int m3945ar() {
        return this.f4085ne;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m3946c5() {
        return this.f4081k4;
    }

    /* JADX INFO: renamed from: ck */
    public final ChartSeries m3947ck() {
        return (ChartSeries) C7019kk.m27452k4((Object) ((InterfaceC14397rj) C7019kk.m27452k4((Object) this.f2127h4, InterfaceC14397rj.class)).getParent_Immediate(), ChartSeries.class);
    }

    /* JADX INFO: renamed from: du */
    public final IDataLabel m3948du() {
        if (this.f4084m9 == null) {
            this.f4084m9 = new DataLabel(this);
        }
        return this.f4084m9;
    }

    /* JADX INFO: renamed from: dy */
    public final IFormat m3949dy() {
        if (this.f4089u4 == null) {
            this.f4089u4 = new Format(this);
        }
        return this.f4089u4;
    }

    /* JADX INFO: renamed from: fa */
    public final double m3950fa() {
        return this.f4073ar;
    }

    /* JADX INFO: renamed from: h4 */
    public final IDataLabel m3951h4() {
        if (this.f4077dy == null) {
            this.f4077dy = new DataLabel(this);
        }
        return this.f4077dy;
    }

    /* JADX INFO: renamed from: ix */
    public final double m3952ix() {
        return this.f4090up;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: jd */
    public final C14757wy m3953jd() {
        return (C14757wy) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    public final IDataLabel m3959kk() {
        if (this.f4088to == null) {
            this.f4088to = new DataLabel(this);
        }
        return this.f4088to;
    }

    /* JADX INFO: renamed from: ks */
    public final double m3960ks() {
        return this.f4095yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final IDataLabel m3961m9() {
        if (this.f4091uz == null) {
            this.f4091uz = new DataLabel(this);
        }
        return this.f4091uz;
    }

    /* JADX INFO: renamed from: ne */
    public final double m3962ne() {
        return this.f4075ck;
    }

    /* JADX INFO: renamed from: qq */
    public final long m3963qq() {
        return this.f4083ks;
    }

    /* JADX INFO: renamed from: rv */
    public final double m3964rv() {
        return this.f4074c5;
    }

    /* JADX INFO: renamed from: to */
    public final IDataLabel m3965to() {
        if (this.f4076du == null) {
            this.f4076du = new DataLabel(this);
        }
        return this.f4076du;
    }

    /* JADX INFO: renamed from: u4 */
    public final double m3966u4() {
        return this.f4078fa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: up */
    public final double m3967up() {
        return (m3968uz().size() <= 0 || ((C14757wy) this.f2127h4).m72972k4(this.f4087rv.get_Item(0)) >= m3952ix()) ? m3952ix() : ((C14757wy) this.f2127h4).m72972k4(this.f4087rv.get_Item(0));
    }

    /* JADX INFO: renamed from: uz */
    public final List<IChartDataPoint> m3968uz() {
        return this.f4087rv;
    }

    /* JADX INFO: renamed from: wl */
    public final List<IChartDataPoint> m3969wl() {
        return this.f4094x6;
    }

    /* JADX INFO: renamed from: x1 */
    public final IDataLabel m3970x1() {
        if (this.f4082kk == null) {
            this.f4082kk = new DataLabel(this);
        }
        return this.f4082kk;
    }

    /* JADX INFO: renamed from: x6 */
    public final double m3971x6() {
        return this.f4080jd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: yj */
    public final double m3972yj() {
        return (m3968uz().size() <= 0 || ((C14757wy) this.f2127h4).m72972k4((IChartDataPoint) OooO0O0.OooO00o(this.f4087rv, 1)) <= m3966u4()) ? m3966u4() : ((C14757wy) this.f2127h4).m72972k4((IChartDataPoint) OooO0O0.OooO00o(this.f4087rv, 1));
    }

    public C0791b3(C14757wy c14757wy, List<IChartDataPoint> list) {
        super(c14757wy);
        this.f4074c5 = Double.NaN;
        this.f4080jd = Double.NaN;
        this.f4075ck = Double.NaN;
        this.f4078fa = Double.NaN;
        this.f4090up = Double.NaN;
        this.f4095yj = 0.0d;
        this.f4083ks = 0L;
        this.f4087rv = new List<>();
        this.f4094x6 = new List<>();
        this.f4085ne = 0;
        this.f4079ix = 0;
        this.f4092wl = 0;
        this.f4086qq = false;
        ChartSeries chartSeries = (ChartSeries) C7019kk.m27452k4((Object) ((InterfaceC14397rj) C7019kk.m27452k4((Object) c14757wy, InterfaceC14397rj.class)).getParent_Immediate(), ChartSeries.class);
        double[] dArr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dArr[i] = c14757wy.m72972k4(list.get_Item(i));
        }
        this.f4080jd = m3944k4(dArr, 0.25d);
        this.f4074c5 = m3944k4(dArr, 0.5d);
        this.f4075ck = m3944k4(dArr, 0.75d);
        this.f4083ks = ((long) list.size()) & 4294967295L;
        double d = this.f4075ck;
        double d2 = this.f4080jd;
        double d3 = (d - d2) * 1.5d;
        double d4 = d2 - d3;
        double d5 = d + d3;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            double dM72972k4 = c14757wy.m72972k4(list.get_Item(i2));
            if (dM72972k4 >= d4) {
                this.f4090up = dM72972k4;
                break;
            }
            i2++;
        }
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            double dM72972k42 = c14757wy.m72972k4(list.get_Item(size));
            if (dM72972k42 <= d5) {
                this.f4078fa = dM72972k42;
                break;
            }
            size--;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f4095yj += c14757wy.m72972k4(list.get_Item(i3));
        }
        this.f4095yj /= (double) list.size();
        if (chartSeries.getShowOutlierPoints() || chartSeries.getShowInnerPoints()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                double dM72972k43 = c14757wy.m72972k4(list.get_Item(i4));
                if (chartSeries.getShowOutlierPoints() && (dM72972k43 < this.f4090up || dM72972k43 > this.f4078fa)) {
                    m3968uz().addItem(list.get_Item(i4));
                }
                if (chartSeries.getShowInnerPoints() && dM72972k43 > this.f4090up && dM72972k43 < this.f4078fa) {
                    m3969wl().addItem(list.get_Item(i4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IDataLabel m3954k4() {
        if (this.f4093x1 == null) {
            this.f4093x1 = new DataLabel(this);
        }
        return this.f4093x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3955k4(double d) {
        this.f4073ar = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3956k4(int i) {
        this.f4085ne = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3957k4(C0791b3 c0791b3) {
        ((FillFormat) m3949dy().getFill()).m1456k4(c0791b3.m3949dy().getFill());
        ((LineFormat) m3949dy().getLine()).m1896k4(c0791b3.m3949dy().getLine());
        ((EffectFormat) m3949dy().getEffect()).m1387k4(c0791b3.m3949dy().getEffect());
        ((DataLabel) m3961m9()).m1298k4(c0791b3.m3961m9());
        ((DataLabel) m3948du()).m1298k4(c0791b3.m3948du());
        ((DataLabel) m3954k4()).m1298k4(c0791b3.m3954k4());
        ((DataLabel) m3959kk()).m1298k4(c0791b3.m3959kk());
        ((DataLabel) m3954k4()).m1298k4(c0791b3.m3954k4());
        ((DataLabel) m3970x1()).m1298k4(c0791b3.m3970x1());
        ((DataLabel) m3965to()).m1298k4(c0791b3.m3965to());
        ((DataLabel) m3951h4()).m1298k4(c0791b3.m3951h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3958k4(String str) {
        this.f4081k4 = str;
    }
}
