package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class uc0 extends DomObject<x5o> {

    /* JADX INFO: renamed from: c5 */
    private byte f49304c5;

    /* JADX INFO: renamed from: du */
    private byte f49305du;

    /* JADX INFO: renamed from: dy */
    private final ColorFormat f49306dy;

    /* JADX INFO: renamed from: jd */
    private final ColorFormat f49307jd;

    /* JADX INFO: renamed from: k4 */
    private long f49308k4;

    /* JADX INFO: renamed from: kk */
    private byte f49309kk;

    /* JADX INFO: renamed from: m9 */
    private final Fonts f49310m9;

    /* JADX INFO: renamed from: to */
    private byte f49311to;

    /* JADX INFO: renamed from: x1 */
    private final sdd f49312x1;

    /* JADX WARN: Multi-variable type inference failed */
    public uc0(x5o x5oVar) {
        super(x5oVar);
        this.f49312x1 = new sdd();
        this.f49309kk = (byte) -1;
        this.f49311to = (byte) -1;
        this.f49305du = (byte) 0;
        this.f49304c5 = (byte) 0;
        this.f49310m9 = new Fonts(((Presentation) ((x5o) this.f2127h4).getPresentation()).m2389rv().m6639k4());
        this.f49306dy = new ColorFormat(this);
        this.f49307jd = new ColorFormat(this);
    }

    /* JADX INFO: renamed from: jd */
    private void m71652jd() {
        this.f49308k4++;
    }

    /* JADX INFO: renamed from: c5 */
    public final sdd m71653c5() {
        return this.f49312x1;
    }

    /* JADX INFO: renamed from: du */
    public final IColorFormat m71654du() {
        return this.f49306dy;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m71655dy() {
        return (this.f49305du == 0 && this.f49307jd.getColorType() == -1 && this.f49309kk == -1 && this.f49311to == -1 && m71653c5().m70574k4() == null) ? false : true;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m71656h4() {
        return this.f49304c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m71657k4() {
        return this.f49309kk;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m71660kk() {
        return this.f49305du;
    }

    /* JADX INFO: renamed from: m9 */
    public final IColorFormat m71662m9() {
        return this.f49307jd;
    }

    /* JADX INFO: renamed from: to */
    public final IFonts m71663to() {
        return this.f49310m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m71665x1() {
        return this.f49311to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71658k4(byte b) {
        this.f49309kk = b;
        m71652jd();
    }

    /* JADX INFO: renamed from: kk */
    public final void m71661kk(byte b) {
        this.f49305du = b;
        m71652jd();
    }

    /* JADX INFO: renamed from: to */
    public final void m71664to(byte b) {
        this.f49304c5 = b;
        m71652jd();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71666x1(byte b) {
        this.f49311to = b;
        m71652jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71659k4(uc0 uc0Var) {
        if (uc0Var != null) {
            this.f49309kk = uc0Var.m71657k4();
            this.f49311to = uc0Var.m71665x1();
            this.f49306dy.copyFrom(uc0Var.m71654du());
            this.f49307jd.copyFrom(uc0Var.m71662m9());
            this.f49305du = uc0Var.m71660kk();
            this.f49304c5 = uc0Var.m71656h4();
            this.f49310m9.m1524k4((Fonts) uc0Var.m71663to());
            if (uc0Var.m71653c5().m70574k4() != null) {
                this.f49312x1.m70575k4(uc0Var.m71653c5().m70574k4().m29645to());
            }
            m71652jd();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71667x1(uc0 uc0Var) {
        if (uc0Var != null) {
            if (uc0Var.m71657k4() != -1) {
                this.f49309kk = uc0Var.m71657k4();
            }
            if (uc0Var.m71665x1() != -1) {
                this.f49311to = uc0Var.m71665x1();
            }
            if (((ColorFormat) uc0Var.m71654du()).getColorType() != -1) {
                this.f49306dy.copyFrom(uc0Var.m71654du());
            }
            if (((ColorFormat) uc0Var.m71662m9()).getColorType() != -1) {
                this.f49307jd.copyFrom(uc0Var.m71662m9());
            }
            if (uc0Var.m71660kk() != 0) {
                this.f49305du = uc0Var.m71660kk();
            }
            if (uc0Var.m71656h4() != 0) {
                this.f49304c5 = uc0Var.m71656h4();
            }
            if (uc0Var.m71663to().getLatinFont() != null || uc0Var.m71663to().getEastAsianFont() != null || uc0Var.m71663to().getComplexScriptFont() != null) {
                this.f49310m9.m1524k4((Fonts) uc0Var.m71663to());
            }
            if (uc0Var.m71653c5().m70574k4() != null) {
                this.f49312x1.m70575k4(uc0Var.m71653c5().m70574k4().m29645to());
            }
            m71652jd();
        }
    }
}
