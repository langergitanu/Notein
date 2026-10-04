package com.aspose.slides;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class gnp extends otz {

    /* JADX INFO: renamed from: k4 */
    private C13847mr f5293k4;

    public gnp(C13847mr c13847mr) {
        C6005k4.m24261k4(c13847mr != null);
        this.f5293k4 = c13847mr;
        m68829k4(c13847mr.m64945h4().getMarker(), this.f5293k4);
    }

    /* JADX INFO: renamed from: fa */
    private C14093tq<Float> m6840fa() {
        if (!ChartTypeCharacterizer.isChartTypeLine(this.f5293k4.m64945h4().getType()) && !ChartTypeCharacterizer.isChartTypeRadar(this.f5293k4.m64945h4().getType())) {
            return new C14093tq<>();
        }
        return new C14093tq<>(Float.valueOf(im9.m7680k4(this.f5293k4.m64945h4().getChart())));
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: dy */
    public boolean mo6841dy() {
        return ChartTypeCharacterizer.m757du(this.f5293k4.m64945h4().getType());
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: k4 */
    public void mo6842k4(C11896dy c11896dy) {
        C13847mr c13847mr;
        C11896dy c11896dy2;
        if (mo6841dy()) {
            this.f5293k4.m64954k4(false);
            m68830k4((LineFormat) this.f5293k4.m64945h4().getFormat().getLine(), this.f5293k4.m64941c5(), this.f5293k4.m64960m9().Clone(), m68828jd(), m6840fa().Clone());
            c13847mr = this.f5293k4;
        } else {
            C6005k4.m24261k4(c11896dy != null);
            if (ChartTypeCharacterizer.isChartTypeBubble(this.f5293k4.m64945h4().getType())) {
                c11896dy.m55542k4(m68826c5().Clone());
            } else {
                c11896dy.m55578x1(m68826c5().Clone());
            }
            this.f5293k4.m64954k4(false);
            if (this.f5293k4.m64945h4().getType() == 79) {
                Chart chart = (Chart) this.f5293k4.m64945h4().getChart();
                c11896dy2 = c11896dy;
                im9.m7703k4(igr.m7632k4(chart, chart.getStyle() + 1, 3)[AbstractC14092to.m67201k4(((ygk) m73213k4(ygk.class)).m73204b3(), m73228yd())].Clone(), this.f5293k4.m64941c5(), c11896dy2, (FillFormat) this.f5293k4.m64945h4().getFormat().getFill(), 1.0f, (IEffectFormat) null);
            } else {
                c11896dy2 = c11896dy;
                if (ChartTypeCharacterizer.isChartTypeColumn(this.f5293k4.m64945h4().getType())) {
                    this.f5293k4.m64964x1(c11896dy2);
                    im9.m7693k4(this.f5293k4.m64942ck().m5006qq().Clone(), C12003du.f40505to.Clone(), this.f5293k4.m64941c5(), c11896dy2, (Format) this.f5293k4.m64945h4().getFormat());
                    c13847mr = this.f5293k4;
                } else {
                    this.f5293k4.m64964x1(c11896dy2);
                }
            }
            this.f5293k4.m64948k4(c11896dy2);
            c13847mr = this.f5293k4;
        }
        c13847mr.m64954k4(true);
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: m9 */
    public LineFormat mo6843m9() {
        return (LineFormat) this.f5293k4.m64945h4().getFormat().getLine();
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: to */
    public int mo6844to() {
        if (otz.m68825k4(this.f5293k4)) {
            return 0;
        }
        return m68827ck() ? 2 : 1;
    }
}
