package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.xp */
/* JADX INFO: loaded from: classes3.dex */
class C14811xp {

    /* JADX INFO: renamed from: c5 */
    private ColorFormat f50166c5;

    /* JADX INFO: renamed from: du */
    private ColorFormat f50167du;

    /* JADX INFO: renamed from: dy */
    private int f50168dy;

    /* JADX INFO: renamed from: h4 */
    private ColorFormat f50169h4;

    /* JADX INFO: renamed from: jd */
    private boolean f50170jd;

    /* JADX INFO: renamed from: k4 */
    ColorFormat f50171k4;

    /* JADX INFO: renamed from: m9 */
    private ColorFormat f50173m9;

    /* JADX INFO: renamed from: to */
    private C14811xp f50174to;

    /* JADX INFO: renamed from: x1 */
    private C12003du f50175x1 = new C12003du();

    /* JADX INFO: renamed from: kk */
    private C12003du f50172kk = new C12003du();

    public C14811xp() {
    }

    public boolean equals(Object obj) {
        C14811xp c14811xp = (C14811xp) C7019kk.m27452k4(obj, C14811xp.class);
        if (c14811xp == null) {
            return false;
        }
        return m73531x1(c14811xp);
    }

    public int hashCode() {
        return 23454;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m73522k4() {
        if (this.f50170jd) {
            return this.f50172kk;
        }
        throw new InvalidOperationException("Color is not resolved yet.");
    }

    /* JADX INFO: renamed from: kk */
    public final ColorFormat m73528kk() {
        if (!this.f50170jd && this.f50171k4.getColorType() == -1) {
            throw new InvalidOperationException("Source of color is not defined.");
        }
        ColorFormat colorFormat = this.f50166c5;
        return colorFormat == null ? this.f50171k4 : colorFormat;
    }

    /* JADX INFO: renamed from: to */
    public final void m73529to() {
        this.f50174to = null;
        this.f50167du = null;
        this.f50169h4 = null;
        this.f50171k4 = null;
        this.f50168dy = -1;
        this.f50166c5 = null;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m73530x1() {
        if (this.f50170jd) {
            return this.f50168dy;
        }
        throw new InvalidOperationException("Color is not resolved yet.");
    }

    public C14811xp(ColorFormat colorFormat) {
        m73523k4(colorFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m73519k4(IBaseSlide iBaseSlide) {
        return m73520k4(iBaseSlide, (C14321pz) null);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m73531x1(C14811xp c14811xp) {
        return c14811xp != null && this.f50170jd && c14811xp.f50170jd && this.f50172kk.equals(c14811xp.f50172kk.Clone());
    }

    public C14811xp(C14811xp c14811xp) {
        m73526k4(c14811xp);
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m73520k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        if (this.f50167du.getColorType() == 3) {
            this.f50168dy = this.f50167du.getSchemeColor();
            ColorFormat colorFormat = this.f50167du;
            this.f50166c5 = colorFormat;
            return colorFormat.m1082kk(iBaseSlide, c14321pz);
        }
        C14811xp c14811xp = this.f50174to;
        if (c14811xp.f50170jd) {
            this.f50166c5 = c14811xp.f50166c5;
            return c14811xp.m73522k4();
        }
        ColorFormat colorFormat2 = this.f50167du;
        this.f50166c5 = colorFormat2;
        return colorFormat2.m1082kk(iBaseSlide, c14321pz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73523k4(ColorFormat colorFormat) {
        if (colorFormat.getColorType() != -1) {
            this.f50171k4 = colorFormat;
            this.f50166c5 = colorFormat;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73524k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        C12003du c12003duM73520k4;
        ColorFormat colorFormat;
        C14321pz c14321pzM5156k4 = dm6Var.m5156k4();
        ColorFormat colorFormatM5157x1 = dm6Var.m5157x1();
        this.f50173m9 = colorFormatM5157x1;
        ColorFormat colorFormat2 = this.f50171k4;
        if (colorFormat2 == null) {
            ColorFormat colorFormat3 = this.f50167du;
            if (colorFormat3 == null) {
                if (c14321pzM5156k4 != null) {
                    c14321pzM5156k4.m69339k4().CloneTo(this.f50172kk);
                    this.f50171k4 = colorFormatM5157x1;
                    this.f50166c5 = colorFormatM5157x1;
                    if (colorFormatM5157x1 != null) {
                        schemeColor = colorFormatM5157x1.getSchemeColor();
                    }
                } else {
                    ColorFormat colorFormat4 = this.f50169h4;
                    (colorFormat4 != null ? colorFormat4.m1075k4(iBaseSlide).m69339k4() : this.f50175x1).CloneTo(this.f50172kk);
                    ColorFormat colorFormat5 = this.f50169h4;
                    if (colorFormat5 != null && colorFormat5.getColorType() == 3) {
                        schemeColor = this.f50169h4.getSchemeColor();
                    }
                }
                this.f50168dy = schemeColor;
            } else {
                BaseSlide baseSlide = (BaseSlide) C7019kk.m27452k4((Object) colorFormat3.m1069ck(), BaseSlide.class);
                if (baseSlide != null) {
                    BaseSlide baseSlide2 = colorFormatM5157x1 == null ? null : (BaseSlide) C7019kk.m27452k4((Object) colorFormatM5157x1.m1069ck(), BaseSlide.class);
                    if (baseSlide == iBaseSlide || (baseSlide2 != null && (baseSlide2 == baseSlide || baseSlide2 == baseSlide.m401ks()))) {
                        this.f50174to.m73522k4().CloneTo(this.f50172kk);
                        this.f50168dy = this.f50174to.m73530x1();
                        colorFormat = this.f50174to.f50166c5;
                    } else {
                        if (c14321pzM5156k4 != null && !C7019kk.m27469x1(baseSlide, Slide.class)) {
                            c14321pzM5156k4.m69339k4().CloneTo(this.f50172kk);
                            this.f50171k4 = colorFormatM5157x1;
                            this.f50166c5 = colorFormatM5157x1;
                            if (colorFormatM5157x1 != null) {
                            }
                            this.f50168dy = schemeColor;
                        }
                        c12003duM73520k4 = m73519k4(iBaseSlide);
                        c12003duM73520k4.CloneTo(this.f50172kk);
                    }
                } else {
                    if (C7019kk.m27469x1(this.f50167du.m1069ck(), Theme.class)) {
                        if (this.f50167du.getColorType() != -1) {
                            c12003duM73520k4 = m73520k4(iBaseSlide, c14321pzM5156k4);
                        } else if (c14321pzM5156k4 != null) {
                            c14321pzM5156k4.m69339k4().CloneTo(this.f50172kk);
                            this.f50171k4 = colorFormatM5157x1;
                            this.f50168dy = colorFormatM5157x1 != null ? colorFormatM5157x1.getSchemeColor() : -1;
                            this.f50166c5 = colorFormatM5157x1;
                        } else {
                            c12003duM73520k4 = this.f50175x1;
                        }
                    } else if (C7019kk.m27469x1(this.f50167du.m1069ck(), TextStyle.class)) {
                        TextFrameFormat textFrameFormat = (TextFrameFormat) C7019kk.m27452k4((Object) ((TextStyle) this.f50167du.m1069ck()).getParent_Immediate(), TextFrameFormat.class);
                        if (textFrameFormat == null || !C7019kk.m27469x1(textFrameFormat.getParent_IPresentationComponent(), ISlideComponent.class)) {
                            if (c14321pzM5156k4 != null) {
                                c14321pzM5156k4.m69339k4().CloneTo(this.f50172kk);
                                this.f50171k4 = colorFormatM5157x1;
                                this.f50166c5 = colorFormatM5157x1;
                                if (colorFormatM5157x1 != null) {
                                }
                                this.f50168dy = schemeColor;
                            }
                            c12003duM73520k4 = m73519k4(iBaseSlide);
                        }
                        c12003duM73520k4 = m73520k4(iBaseSlide, c14321pzM5156k4);
                    } else if (this.f50167du.m1069ck() == null) {
                        if (C7019kk.m27469x1(this.f50167du.getParent_IPresentationComponent(), x5o.class)) {
                            if (c14321pzM5156k4 != null) {
                                c14321pzM5156k4.m69339k4().CloneTo(this.f50172kk);
                                this.f50171k4 = colorFormatM5157x1;
                                this.f50166c5 = colorFormatM5157x1;
                                if (colorFormatM5157x1 != null) {
                                }
                                this.f50168dy = schemeColor;
                            }
                            c12003duM73520k4 = m73519k4(iBaseSlide);
                        } else {
                            m73521k4(c14321pzM5156k4, dm6Var, iBaseSlide);
                        }
                    }
                    c12003duM73520k4.CloneTo(this.f50172kk);
                }
            }
            this.f50170jd = true;
        }
        colorFormat2.m1082kk(iBaseSlide, c14321pzM5156k4).CloneTo(this.f50172kk);
        this.f50168dy = this.f50171k4.getColorType() == 3 ? this.f50171k4.getSchemeColor() : -1;
        colorFormat = this.f50171k4;
        this.f50166c5 = colorFormat;
        this.f50170jd = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73525k4(C12003du c12003du) {
        c12003du.CloneTo(this.f50175x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73521k4(C14321pz c14321pz, dm6 dm6Var, IBaseSlide iBaseSlide) {
        if (c14321pz == null) {
            m73519k4(iBaseSlide).CloneTo(this.f50172kk);
            return;
        }
        c14321pz.m69339k4().CloneTo(this.f50172kk);
        this.f50171k4 = dm6Var.m5157x1();
        this.f50168dy = dm6Var.m5157x1() != null ? dm6Var.m5157x1().getSchemeColor() : -1;
        this.f50166c5 = dm6Var.m5157x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73526k4(C14811xp c14811xp) {
        ColorFormat colorFormat = c14811xp.f50171k4;
        if (colorFormat == null) {
            colorFormat = c14811xp.f50167du;
        }
        this.f50167du = colorFormat;
        ColorFormat colorFormat2 = c14811xp.f50173m9;
        if (colorFormat2 == null) {
            colorFormat2 = c14811xp.f50169h4;
        }
        this.f50169h4 = colorFormat2;
        this.f50174to = c14811xp;
        c14811xp.f50175x1.CloneTo(this.f50175x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73527k4(C14811xp c14811xp, ColorFormat colorFormat) {
        m73526k4(c14811xp);
        if (colorFormat != null) {
            m73523k4(colorFormat);
        }
    }
}
