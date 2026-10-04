package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.om */
/* JADX INFO: loaded from: classes3.dex */
final class C14243om {

    /* JADX INFO: renamed from: ks */
    private final Format f47852ks;

    /* JADX INFO: renamed from: ne */
    private long f47854ne;

    /* JADX INFO: renamed from: rv */
    private final ChartTextFormat f47855rv;

    /* JADX INFO: renamed from: x6 */
    private final InterfaceC14397rj f47859x6;

    /* JADX INFO: renamed from: k4 */
    private boolean f47850k4 = false;

    /* JADX INFO: renamed from: x1 */
    private String f47858x1 = "";

    /* JADX INFO: renamed from: kk */
    private boolean f47851kk = true;

    /* JADX INFO: renamed from: to */
    private int f47856to = -1;

    /* JADX INFO: renamed from: du */
    private boolean f47845du = false;

    /* JADX INFO: renamed from: h4 */
    private boolean f47848h4 = false;

    /* JADX INFO: renamed from: m9 */
    private boolean f47853m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f47846dy = false;

    /* JADX INFO: renamed from: c5 */
    private boolean f47843c5 = false;

    /* JADX INFO: renamed from: jd */
    private boolean f47849jd = false;

    /* JADX INFO: renamed from: ck */
    private boolean f47844ck = false;

    /* JADX INFO: renamed from: fa */
    private String f47847fa = "";

    /* JADX INFO: renamed from: up */
    private boolean f47857up = false;

    /* JADX INFO: renamed from: yj */
    private boolean f47860yj = false;

    public C14243om(InterfaceC14397rj interfaceC14397rj, Format format, ChartTextFormat chartTextFormat) {
        this.f47859x6 = interfaceC14397rj;
        this.f47852ks = format;
        this.f47855rv = chartTextFormat;
    }

    /* JADX INFO: renamed from: rv */
    private void m68659rv() {
        this.f47854ne++;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m68660c5(boolean z) {
        this.f47857up = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: ck */
    public final String m68662ck() {
        return this.f47847fa;
    }

    /* JADX INFO: renamed from: du */
    public final void m68664du(boolean z) {
        this.f47846dy = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: dy */
    public final void m68666dy(boolean z) {
        this.f47844ck = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m68668fa() {
        return this.f47857up;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m68669h4(boolean z) {
        this.f47843c5 = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: jd */
    public final void m68671jd(boolean z) {
        this.f47860yj = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68673k4(int i) {
        this.f47856to = i;
        m68659rv();
    }

    /* JADX INFO: renamed from: kk */
    public final int m68678kk() {
        return this.f47856to;
    }

    /* JADX INFO: renamed from: ks */
    public final long m68680ks() {
        return ((((this.f47854ne & 4294967295L) + (this.f47852ks.getVersion() & 4294967295L)) & 4294967295L) + (this.f47855rv.m753k4() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m68681m9(boolean z) {
        this.f47849jd = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: to */
    public final void m68683to(boolean z) {
        this.f47853m9 = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: up */
    public final boolean m68685up() {
        return this.f47860yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m68686x1() {
        return this.f47858x1;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m68689yj() {
        return this.f47850k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m68661c5() {
        return this.f47849jd;
    }

    /* JADX INFO: renamed from: ck */
    public final void m68663ck(boolean z) {
        this.f47850k4 = z;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m68665du() {
        return this.f47848h4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m68667dy() {
        return this.f47843c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m68670h4() {
        return this.f47853m9;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m68672jd() {
        return this.f47844ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68674k4(DataLabelFormat dataLabelFormat) {
        this.f47852ks.m1555k4(dataLabelFormat.getFormat());
        m68676k4(dataLabelFormat.isNumberFormatLinkedToSource());
        this.f47858x1 = dataLabelFormat.getNumberFormat();
        this.f47856to = dataLabelFormat.getPosition();
        this.f47847fa = dataLabelFormat.getSeparator();
        this.f47849jd = dataLabelFormat.getShowBubbleSize();
        this.f47853m9 = dataLabelFormat.getShowCategoryName();
        this.f47845du = dataLabelFormat.getShowLegendKey();
        this.f47843c5 = dataLabelFormat.getShowPercentage();
        this.f47846dy = dataLabelFormat.getShowSeriesName();
        this.f47848h4 = dataLabelFormat.getShowValue();
        TextFrame textFrame = new TextFrame((DataLabel) this.f47859x6);
        dataLabelFormat.getTextFormat().copyTo(textFrame);
        this.f47855rv.copyFrom(textFrame);
    }

    /* JADX INFO: renamed from: kk */
    public final void m68679kk(boolean z) {
        this.f47848h4 = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m68682m9() {
        return this.f47846dy;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m68684to() {
        return this.f47845du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68687x1(String str) {
        this.f47847fa = str;
        m68659rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68675k4(String str) {
        this.f47858x1 = str;
        m68659rv();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68688x1(boolean z) {
        this.f47845du = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68676k4(boolean z) {
        this.f47851kk = z;
        m68659rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68677k4() {
        return this.f47851kk;
    }
}
