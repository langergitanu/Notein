package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
abstract class ValueAxisBase extends AbstractC14763x3 {

    /* JADX INFO: renamed from: c5 */
    protected double f3630c5;

    /* JADX INFO: renamed from: ck */
    protected double f3631ck;

    /* JADX INFO: renamed from: dy */
    protected double f3632dy;

    /* JADX INFO: renamed from: fa */
    protected boolean f3633fa;

    /* JADX INFO: renamed from: jd */
    protected double f3634jd;

    /* JADX INFO: renamed from: ks */
    protected boolean f3635ks;

    /* JADX INFO: renamed from: m9 */
    protected double f3636m9;

    /* JADX INFO: renamed from: rv */
    private boolean f3637rv;

    /* JADX INFO: renamed from: up */
    protected boolean f3638up;

    /* JADX INFO: renamed from: yj */
    protected int f3639yj;

    public static final class ScalesDirection extends AbstractC14106wy {
        public static final int FromMaxValueToCalculateScale = 0;
        public static final int FromMinValueToCalculateScale = 1;
        public static final int FromZeroToCalculateScale = 2;

        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(ScalesDirection.class, Integer.class) { // from class: com.aspose.slides.ValueAxisBase.ScalesDirection.1
                {
                    addConstant("FromMaxValueToCalculateScale", 0L);
                    addConstant("FromMinValueToCalculateScale", 1L);
                    addConstant("FromZeroToCalculateScale", 2L);
                }
            });
        }

        private ScalesDirection() {
        }
    }

    public ValueAxisBase(C14787xi c14787xi) {
        super(c14787xi);
        this.f3633fa = false;
        this.f3638up = false;
        this.f3639yj = 0;
    }

    /* JADX INFO: renamed from: ar */
    private void m3028ar() {
        if (ChartTypeCharacterizer.isChartTypeBubble(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType()) && !m73026k4().m73384dy().isLogarithmic()) {
            if (m73026k4().m73384dy().isAutomaticMaxValue()) {
                double d = this.f3632dy;
                if (d > 0.0d) {
                    this.f3632dy = (d * 0.10899999737739563d) + d;
                }
            }
            if (m73026k4().m73384dy().isAutomaticMinValue()) {
                double d2 = this.f3636m9;
                if (d2 < 0.0d) {
                    this.f3636m9 = (0.10899999737739563d * d2) + d2;
                    return;
                }
            }
            if (m73026k4().m73384dy().isAutomaticMinValue() && this.f3636m9 == 0.0d) {
                this.f3636m9 = -9.999999747378752E-5d;
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m3029c5(C14713vw c14713vw) {
        if (ChartTypeCharacterizer.isChartTypeBubble(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType()) && !m73026k4().m73384dy().isLogarithmic()) {
            if (m73026k4().m73384dy().isAutomaticMinValue() || !m73026k4().m73384dy().isAutomaticMaxValue()) {
                double[] dArr = {0.0d};
                double[] dArr2 = {0.0d};
                ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5809m9().m6991k4(this, dArr, dArr2);
                double d = dArr[0];
                double d2 = dArr2[0];
                if (m73026k4().m73384dy().isAutomaticMinValue() && d > 0.0d && d / (d2 - d) <= 0.197d) {
                    double d3 = this.f3630c5 - this.f3631ck;
                    this.f3630c5 = d3;
                    m73025k4(Double.valueOf(d3));
                }
                if (!m73026k4().m73384dy().isAutomaticMaxValue() || d2 >= 0.0d || C14116yg.m67475k4(d2) / (C14116yg.m67475k4(d) - C14116yg.m67475k4(d2)) > 0.197d) {
                    return;
                }
                double d4 = this.f3634jd - this.f3631ck;
                this.f3634jd = d4;
                nxm nxmVar = new nxm(Double.valueOf(d4), this);
                ((AbstractC14763x3) this).f49904k4.insertItem(0, nxmVar);
                m73215k4((AbstractC14770x9) nxmVar);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
        m73026k4().m73384dy().m320k4(m3033gi());
        m73026k4().m73384dy().m328x1(m3039s7());
    }

    /* JADX INFO: renamed from: bv */
    public final boolean m3031bv() {
        return this.f3635ks;
    }

    /* JADX INFO: renamed from: dy */
    public void m3032dy(C14713vw c14713vw) {
        m3040um();
        mo3038qq();
        if (this.f3631ck == 0.0d) {
            throw new ArgumentException("Wrong step value, can't be equal 0");
        }
        mo3042wl();
        mo3037m9(c14713vw);
        m3029c5(c14713vw);
        m73033m9();
    }

    /* JADX INFO: renamed from: gi */
    public final double m3033gi() {
        return this.f3634jd;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: h4 */
    public C12015qq mo3034h4(C14713vw c14713vw) {
        float f = 0.0f;
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return new C12015qq(0.0f, 0.0f);
        }
        int iM73376bv = 0;
        float f2 = 0.0f;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            oju ojuVarClone = ((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv).m68252h4(c14713vw).Clone();
            float f3 = ojuVarClone.f47836k4;
            if (f3 > f) {
                f = f3;
            }
            float f4 = ojuVarClone.f47837x1;
            if (f4 > f2) {
                f2 = f4;
            }
            iM73376bv += m73026k4().m73376bv();
        }
        return new C12015qq(f, f2);
    }

    /* JADX INFO: renamed from: kp */
    public final double m3036kp() {
        return (m73026k4().m73384dy().isAutomaticMinValue() || m3031bv()) ? this.f3630c5 : m73026k4().m73384dy().getMinValue();
    }

    /* JADX INFO: renamed from: m9 */
    public abstract void mo3037m9(C14713vw c14713vw);

    /* JADX INFO: renamed from: qq */
    public abstract void mo3038qq();

    /* JADX INFO: renamed from: s7 */
    public final double m3039s7() {
        return this.f3630c5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        if (m73026k4().m73384dy().isAutomaticMinValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ac, code lost:
    
        if (m73026k4().m73384dy().isAutomaticMaxValue() != false) goto L39;
     */
    /* JADX INFO: renamed from: um */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3040um() {
        double d;
        double dOooO00o;
        boolean z = false;
        double[] dArr = {this.f3636m9};
        double[] dArr2 = {this.f3632dy};
        ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5809m9().m6991k4(this, dArr, dArr2);
        this.f3636m9 = dArr[0];
        this.f3632dy = dArr2[0];
        m3028ar();
        if (m73026k4().m73384dy().isLogarithmic()) {
            if (C14044b3.m66437kk(this.f3636m9)) {
                this.f3636m9 = 0.0d;
            }
            if (this.f3636m9 > 1.0d) {
                this.f3636m9 = 0.0d;
            }
        }
        double d2 = this.f3632dy;
        this.f3634jd = d2;
        double d3 = this.f3636m9;
        this.f3630c5 = d3;
        if (d2 == 0.0d && d3 == 0.0d) {
            z = true;
        }
        this.f3637rv = z;
        if (!m73026k4().m73384dy().isAutomaticMaxValue()) {
            this.f3634jd = m73026k4().m73384dy().isLogarithmic() ? m73026k4().m73391k4(m73026k4().m73384dy().getMaxValue()) : m73026k4().m73384dy().getMaxValue();
        }
        if (!m73026k4().m73384dy().isAutomaticMinValue()) {
            this.f3630c5 = m73026k4().m73384dy().isLogarithmic() ? m73026k4().m73391k4(m73026k4().m73384dy().getMinValue()) : m73026k4().m73384dy().getMinValue();
        }
        double d4 = this.f3630c5;
        if (d4 == 0.0d && this.f3634jd == 0.0d) {
            if (!m73026k4().m73384dy().isAutomaticMaxValue()) {
            }
            double d5 = this.f3634jd + 1.0d;
            this.f3634jd = d5;
            d = d5 - ((d5 - this.f3630c5) / 10.0d);
            this.f3632dy = d;
        } else if (this.f3636m9 == this.f3632dy) {
            if (!m73026k4().m73384dy().isAutomaticMaxValue() && m73026k4().m73384dy().isAutomaticMinValue()) {
                double d6 = this.f3632dy;
                dOooO00o = d6 < 0.0d ? d6 - 1.0d : 0.0d;
                this.f3630c5 = dOooO00o;
                this.f3636m9 = dOooO00o;
            } else if (m73026k4().m73384dy().isAutomaticMaxValue() && !m73026k4().m73384dy().isAutomaticMinValue()) {
                double d7 = this.f3636m9;
                d = d7 < 0.0d ? 0.0d : d7 + 1.0d;
                this.f3634jd = d;
                this.f3632dy = d;
            }
        } else if (d4 > this.f3634jd) {
            if (!m73026k4().m73384dy().isAutomaticMinValue()) {
            }
            double d8 = this.f3630c5 - 1.0d;
            this.f3630c5 = d8;
            dOooO00o = OooOO0.OooO00o(this.f3634jd, d8, 10.0d, d8);
            this.f3636m9 = dOooO00o;
        }
        if (this.f3630c5 <= this.f3634jd || !m73026k4().m73384dy().isAutomaticMaxValue() || m73026k4().m73384dy().isAutomaticMinValue()) {
            return;
        }
        if (!this.f3637rv) {
            double d9 = this.f3630c5;
            double d10 = (this.f3632dy + d9) - this.f3636m9;
            this.f3634jd = d10;
            this.f3632dy = d10;
            this.f3636m9 = d9;
            return;
        }
        double d11 = this.f3630c5;
        this.f3632dy = d11;
        this.f3636m9 = d11;
        this.f3634jd = d11 * 2.0d;
        this.f3630c5 = 0.0d;
        this.f3635ks = true;
    }

    /* JADX INFO: renamed from: v4 */
    public final double m3041v4() {
        return (m73026k4().m73384dy().isAutomaticMaxValue() || m3031bv()) ? this.f3634jd : m73026k4().m73384dy().getMaxValue();
    }

    /* JADX INFO: renamed from: wl */
    public abstract void mo3042wl();

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: h4 */
    public String mo3035h4() {
        if (((AbstractC14763x3) this).f49908x1.size() != 0 && m73026k4().m73384dy().isNumberFormatLinkedToSource()) {
            ChartSeries chartSeriesM64945h4 = ((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4();
            if (ChartTypeCharacterizer.m762k4(chartSeriesM64945h4.getType()) == 5) {
                if (C7019kk.m27469x1(this, tsh.class) || C7019kk.m27469x1(this, iuf.class)) {
                    if (!"General".equals(chartSeriesM64945h4.getNumberFormatOfYValues()) && !C14113y2.m67411k4(chartSeriesM64945h4.getNumberFormatOfYValues())) {
                        return chartSeriesM64945h4.getNumberFormatOfYValues();
                    }
                } else if (!"General".equals(chartSeriesM64945h4.getNumberFormatOfXValues()) && !C14113y2.m67411k4(chartSeriesM64945h4.getNumberFormatOfXValues())) {
                    return chartSeriesM64945h4.getNumberFormatOfXValues();
                }
            }
            if (ChartTypeCharacterizer.m761jd(chartSeriesM64945h4.getType())) {
                return "0%";
            }
        }
        return m73026k4().m73384dy().getNumberFormat();
    }
}
