package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: loaded from: classes3.dex */
class s8k {

    /* JADX INFO: renamed from: du */
    private int f48779du;

    /* JADX INFO: renamed from: h4 */
    private z3t f48781h4;

    /* JADX INFO: renamed from: k4 */
    private C12013m9 f48782k4;

    /* JADX INFO: renamed from: kk */
    private LegendEntryProperties f48783kk;

    /* JADX INFO: renamed from: m9 */
    private C13847mr f48784m9;

    /* JADX INFO: renamed from: to */
    private String f48785to;

    /* JADX INFO: renamed from: x1 */
    private C12003du f48786x1 = new C12003du();

    /* JADX INFO: renamed from: dy */
    private C12003du f48780dy = new C12003du();

    public s8k(Chart chart) {
        LegendEntryProperties legendEntryProperties = new LegendEntryProperties(chart);
        this.f48783kk = legendEntryProperties;
        this.f48782k4 = chart.m509k4(legendEntryProperties.getTextFormat());
        chart.m507k4(this.f48783kk.getTextFormat(), this.f48786x1.Clone()).CloneTo(this.f48786x1);
    }

    /* JADX INFO: renamed from: du */
    public final LegendEntryProperties m70479du() {
        return this.f48783kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m70480h4() {
        return this.f48780dy.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m70481k4() {
        return this.f48785to;
    }

    /* JADX INFO: renamed from: kk */
    public final z3t m70487kk() {
        return this.f48781h4;
    }

    /* JADX INFO: renamed from: to */
    public final C13847mr m70488to() {
        return this.f48784m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m70489x1() {
        return this.f48779du;
    }

    public s8k(LegendEntryProperties legendEntryProperties) {
        Chart chart = (Chart) legendEntryProperties.getChart();
        this.f48783kk = legendEntryProperties;
        this.f48782k4 = chart.m509k4(legendEntryProperties.getTextFormat());
        chart.m507k4(this.f48783kk.getTextFormat(), this.f48786x1.Clone()).CloneTo(this.f48786x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70482k4(int i) {
        this.f48779du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70483k4(C12003du c12003du) {
        this.f48780dy = c12003du.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70484k4(C13847mr c13847mr) {
        this.f48784m9 = c13847mr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70485k4(z3t z3tVar) {
        this.f48781h4 = z3tVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70486k4(String str) {
        this.f48785to = str;
    }
}
