package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class z3t {

    /* JADX INFO: renamed from: du */
    private String f50479du;

    /* JADX INFO: renamed from: h4 */
    private float f50481h4;

    /* JADX INFO: renamed from: kk */
    private String f50483kk;

    /* JADX INFO: renamed from: m9 */
    private C13847mr f50484m9;

    /* JADX INFO: renamed from: to */
    private C12013m9 f50485to;

    /* JADX INFO: renamed from: x1 */
    private Trendline f50486x1;

    /* JADX INFO: renamed from: dy */
    private C12003du f50480dy = new C12003du();

    /* JADX INFO: renamed from: c5 */
    private boolean f50478c5 = true;

    /* JADX INFO: renamed from: k4 */
    C12025x6 f50482k4 = C12025x6.f40591k4.Clone();

    public z3t(Trendline trendline, C13847mr c13847mr) {
        this.f50486x1 = trendline;
        C14365qy c14365qyM64941c5 = c13847mr.m64941c5();
        Chart chartM69834fa = c14365qyM64941c5.m69834fa();
        this.f50484m9 = c13847mr;
        TextFrame textFrame = (TextFrame) trendline.getTextFrameForOverriding();
        m74305k4(chartM69834fa.m506k4(c14365qyM64941c5.m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone());
        m74305k4(chartM69834fa.m507k4(trendline.getTextFormat(), m74309x1().Clone()).Clone());
        this.f50483kk = c13847mr.m64957kk();
        this.f50485to = chartM69834fa.m509k4(trendline.getTextFormat());
        if (C14064he.m66715kk(this.f50481h4) && textFrame != null) {
            this.f50481h4 = ((TextFrameFormat) textFrame.getTextFrameFormat()).getRotationAngle();
        }
        this.f50481h4 = C14064he.m66715kk(this.f50481h4) ? 0.0f : this.f50481h4 * (-1.0f);
        String strM67401k4 = "";
        if (textFrame != null && !"".equals(textFrame.getText())) {
            strM67401k4 = C14113y2.m67401k4(textFrame.m2901c5(), "\r", C14052dq.m66570kk());
        }
        this.f50479du = strM67401k4;
    }

    /* JADX INFO: renamed from: du */
    public final C12013m9 m74302du() {
        return this.f50485to;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m74303h4() {
        return this.f50481h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13847mr m74304k4() {
        return this.f50484m9;
    }

    /* JADX INFO: renamed from: kk */
    public final Trendline m74307kk() {
        return this.f50486x1;
    }

    /* JADX INFO: renamed from: to */
    public final String m74308to() {
        if (!C14113y2.m67411k4(this.f50486x1.getTrendlineName())) {
            return this.f50486x1.getTrendlineName();
        }
        int trendlineType = this.f50486x1.getTrendlineType();
        return trendlineType != 0 ? trendlineType != 1 ? trendlineType != 2 ? trendlineType != 3 ? trendlineType != 4 ? trendlineType != 5 ? "" : C14113y2.m67408k4("Power(", this.f50483kk, ")") : C14113y2.m67408k4("Poly.(", this.f50483kk, ")") : C14113y2.m67408k4(C14098up.m67323x1(this.f50486x1.getPeriod()), " per. Mov. Avg.(", this.f50483kk, ")") : C14113y2.m67408k4("Log.(", this.f50483kk, ")") : C14113y2.m67408k4("Linear(", this.f50483kk, ")") : C14113y2.m67408k4("Expon.(", this.f50483kk, ")");
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m74309x1() {
        return this.f50480dy.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74305k4(C12003du c12003du) {
        this.f50480dy = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74306k4(boolean z) {
        if (this.f50478c5 != z) {
            this.f50478c5 = z;
            if (m74304k4() == null || m74304k4().m64955k4() == z) {
                return;
            }
            m74304k4().m64954k4(z);
        }
    }
}
