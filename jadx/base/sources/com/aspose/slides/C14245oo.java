package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.oo */
/* JADX INFO: loaded from: classes3.dex */
class C14245oo {

    /* JADX INFO: renamed from: du */
    private float f47880du;

    /* JADX INFO: renamed from: h4 */
    private ChartTitle f47881h4;

    /* JADX INFO: renamed from: k4 */
    C1189h8 f47882k4;

    /* JADX INFO: renamed from: kk */
    private C12013m9 f47883kk;

    /* JADX INFO: renamed from: m9 */
    private C14365qy f47884m9;

    /* JADX INFO: renamed from: to */
    private C12013m9 f47885to;

    /* JADX INFO: renamed from: x1 */
    private String f47886x1;

    public C14245oo(ChartTitle chartTitle, C14365qy c14365qy, boolean z) {
        Chart chart = (Chart) chartTitle.getChart();
        this.f47884m9 = c14365qy;
        this.f47881h4 = chartTitle;
        TextFrame textFrame = (TextFrame) chartTitle.getTextFrameForOverriding();
        this.f47882k4 = new C1189h8((Format) chartTitle.getFormat(), c14365qy, chartTitle);
        float rotationAngle = ((TextFrameFormat) chartTitle.getTextFormat().getTextBlockFormat()).getRotationAngle();
        this.f47880du = rotationAngle;
        if (C14064he.m66715kk(rotationAngle) && textFrame != null) {
            float rotationAngle2 = ((TextFrameFormat) textFrame.getTextFrameFormat()).getRotationAngle();
            this.f47880du = rotationAngle2;
            if (C14064he.m66715kk(rotationAngle2) && textFrame.getTextFrameFormat().getTextVerticalType() != -1) {
                this.f47880du = 0.0f;
            }
        }
        this.f47880du = C14064he.m66715kk(this.f47880du) ? this.f47880du : this.f47880du * (-1.0f);
        this.f47886x1 = (z && textFrame == null && (chart.getChartData().getSeries().size() == 1 || chart.getType() == 26) && ((DocumentProperties) c14365qy.m69834fa().getPresentation().getDocumentProperties()).m1344m9()) ? c14365qy.m69865up().get_Item(0).m64957kk() : textFrame != null ? m68742m9().m69834fa().m512kk() ? textFrame.m2901c5() : C14113y2.m67401k4(textFrame.m2901c5(), "\r", C14052dq.m66570kk()) : z ? "Chart Title" : "Axis Title";
        this.f47883kk = chart.m509k4(chartTitle.getTextFormat());
        if (textFrame != null) {
            this.f47885to = chart.m510k4(chartTitle.getTextFormat(), textFrame);
        }
    }

    /* JADX INFO: renamed from: dy */
    private C12013m9 m68733dy() {
        C12013m9 c12013m9M68734du = m68734du();
        return c12013m9M68734du == null ? m68744x1() : c12013m9M68734du;
    }

    /* JADX INFO: renamed from: du */
    public final C12013m9 m68734du() {
        return this.f47885to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m68735h4() {
        Chart chartM69834fa = this.f47884m9.m69834fa();
        C12003du c12003duClone = chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone();
        chartM69834fa.m507k4(this.f47881h4.getTextFormat(), c12003duClone.Clone()).CloneTo(c12003duClone);
        return chartM69834fa.m508k4(c12003duClone.Clone(), this.f47881h4.getTextFrameForOverriding());
    }

    /* JADX INFO: renamed from: k4 */
    public final C12023wl m68736k4(C12015qq c12015qq) {
        return C0840c3.m4438k4(m68737k4(), m68743to(), m68733dy(), 1, this.f47884m9, c12015qq.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du m68741kk() {
        Chart chartM69834fa = this.f47884m9.m69834fa();
        return chartM69834fa.m507k4(this.f47881h4.getTextFormat(), chartM69834fa.m506k4(chartM69834fa.getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone());
    }

    /* JADX INFO: renamed from: m9 */
    public final C14365qy m68742m9() {
        return this.f47884m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m68743to() {
        return this.f47880du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12013m9 m68744x1() {
        return this.f47883kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m68737k4() {
        return this.f47886x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68738k4(float f) {
        this.f47880du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68739k4(C14365qy c14365qy) {
        if (!C14064he.m66715kk(this.f47881h4.getX()) && !C14064he.m66715kk(this.f47881h4.getY())) {
            C12014ne c12014neClone = this.f47882k4.f5456k4.Clone();
            c12014neClone.m56676kk(C7019kk.m27462to(Float.valueOf((this.f47881h4.getX() * c14365qy.m69867v4()) + c14365qy.m69878yd()), 13));
            c12014neClone.m56682to(C7019kk.m27462to(Float.valueOf((this.f47881h4.getY() * c14365qy.m69852lr()) + c14365qy.m69823b3()), 13));
            c12014neClone.m56676kk(c12014neClone.m56669jd() < 0 ? 0 : c12014neClone.m56669jd());
            c12014neClone.m56682to(c12014neClone.m56664ck() < 0 ? 0 : c12014neClone.m56664ck());
            if (c12014neClone.m56668h4() > c14365qy.m69878yd() + c14365qy.m69867v4()) {
                c12014neClone.m56676kk(C7019kk.m27462to(Float.valueOf((c14365qy.m69878yd() + c14365qy.m69867v4()) - c12014neClone.m56663c5()), 13));
            }
            c12014neClone.CloneTo(this.f47882k4.f5456k4);
        }
        this.f47882k4.m7072k4();
        C0840c3.m4444k4(C12007ix.m56544k4(this.f47882k4.f5456k4).Clone(), m68737k4(), C14064he.m66715kk(m68743to()) ? 0 : C7019kk.m27462to(Float.valueOf(m68743to()), 13), m68733dy(), m68735h4().Clone(), 1, 2, c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68740k4(C14365qy c14365qy, float f) {
        if (!C14064he.m66715kk(this.f47881h4.getX()) && !C14064he.m66715kk(this.f47881h4.getY())) {
            C12014ne c12014neClone = this.f47882k4.f5456k4.Clone();
            c12014neClone.m56676kk(C7019kk.m27462to(Float.valueOf((this.f47881h4.getX() * c14365qy.m69867v4()) + c14365qy.m69878yd()), 13));
            c12014neClone.m56682to(C7019kk.m27462to(Float.valueOf((this.f47881h4.getY() * c14365qy.m69852lr()) + c14365qy.m69823b3()), 13));
            c12014neClone.m56676kk(c12014neClone.m56669jd() < 0 ? 0 : c12014neClone.m56669jd());
            c12014neClone.m56682to(c12014neClone.m56664ck() < 0 ? 0 : c12014neClone.m56664ck());
            if (c12014neClone.m56668h4() > c14365qy.m69878yd() + c14365qy.m69867v4()) {
                c12014neClone.m56676kk(C7019kk.m27462to(Float.valueOf((c14365qy.m69878yd() + c14365qy.m69867v4()) - c12014neClone.m56663c5()), 13));
            }
            c12014neClone.CloneTo(this.f47882k4.f5456k4);
        }
        this.f47882k4.m7072k4();
        C1236i2.m7388k4(C12007ix.m56544k4(this.f47882k4.f5456k4).Clone(), m68737k4(), C14064he.m66715kk(m68743to()) ? 0 : C7019kk.m27462to(Float.valueOf(m68743to()), 13), m68733dy(), m68735h4().Clone(), 1, 2, c14365qy, f);
    }
}
