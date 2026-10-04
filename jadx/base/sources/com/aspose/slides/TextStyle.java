package com.aspose.slides;

import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
public final class TextStyle extends PVIObject implements ITextStyle, InterfaceC0973f1 {

    /* JADX INFO: renamed from: x1 */
    static final AbstractC4682du<TextStyle, fz8, fz8> f3544x1 = new AbstractC4682du<TextStyle, fz8, fz8>() { // from class: com.aspose.slides.TextStyle.2
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.TextStyleEffectiveData.CreateEmpty(Aspose.Slides.TextStyle,Aspose.Slides.TextStyleEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public fz8 mo445k4(TextStyle textStyle, fz8 fz8Var) {
            return fz8.m6362k4(textStyle, fz8Var);
        }
    };

    /* JADX INFO: renamed from: du */
    private ParagraphFormat[] f3545du;

    /* JADX INFO: renamed from: h4 */
    private fz8 f3546h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<ParagraphFormat.AbstractC0555k4> f3547k4;

    /* JADX INFO: renamed from: kk */
    private ParagraphFormat.AbstractC0555k4 f3548kk;

    /* JADX INFO: renamed from: to */
    private ParagraphFormat f3549to;

    public TextStyle(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3547k4 = new AbstractC7018k4<ParagraphFormat.AbstractC0555k4>() { // from class: com.aspose.slides.TextStyle.1
            {
                TextStyle.this.f3548kk = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.TextStyle.1.1
                };
            }
        };
    }

    /* JADX INFO: renamed from: to */
    private boolean m2977to(TextStyle textStyle) {
        for (int i = 1; i < textStyle.m2990to().length; i++) {
            if (textStyle.m2990to()[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new bz0(this.f3549to, this);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        ParagraphFormat paragraphFormat = new ParagraphFormat(this);
        this.f3549to = paragraphFormat;
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[10];
        this.f3545du = paragraphFormatArr;
        paragraphFormatArr[0] = paragraphFormat;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m2978c5() {
        this.f3546h4 = null;
    }

    /* JADX INFO: renamed from: du */
    public final C14093tq<Integer> m2979du() {
        return m2138ix() ? m2993x1().m4361kk() : new C14093tq<>();
    }

    /* JADX INFO: renamed from: dy */
    public final fz8 m2980dy() {
        fz8[] fz8VarArr = {this.f3546h4};
        fz8 fz8Var = (fz8) AbstractC0858ck.m4598k4(fz8.class, fz8VarArr, this, f3544x1);
        fz8 fz8Var2 = fz8VarArr[0];
        this.f3546h4 = fz8Var2;
        if (fz8Var2 != null) {
            fz8Var2.m4604k4(fz8.class);
        }
        return fz8Var;
    }

    @Override // com.aspose.slides.ITextStyle
    public final IParagraphFormat getDefaultParagraphFormat() {
        if (m2138ix()) {
            return m2993x1().m4354k4();
        }
        m2146wl();
        return this.f3549to;
    }

    @Override // com.aspose.slides.ITextStyle
    public final ITextStyleEffectiveData getEffective() {
        return m2980dy();
    }

    @Override // com.aspose.slides.ITextStyle
    public final IParagraphFormat getLevel(int i) {
        if (i < 0 || i > 8) {
            throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
        }
        if (m2138ix()) {
            return m2993x1().m4355k4(i);
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2993x1().m4353du();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m2981h4() {
        boolean zM2201m9 = ((ParagraphFormat) getDefaultParagraphFormat()).m2201m9();
        for (int i = 0; i <= 8; i++) {
            ParagraphFormat paragraphFormat = (ParagraphFormat) getLevel(i);
            if (paragraphFormat != null) {
                zM2201m9 |= paragraphFormat.m2201m9();
            }
        }
        return zM2201m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2988kk(TextStyle textStyle) {
        if (m2138ix() || textStyle.m2138ix()) {
            if (m2138ix() || !m2977to(textStyle)) {
                m2145uz();
                m2993x1().m4362kk(textStyle);
            } else {
                m2146wl();
                ParagraphFormat paragraphFormat = new ParagraphFormat(textStyle.m2990to()[0], this);
                this.f3549to = paragraphFormat;
                this.f3545du[0] = paragraphFormat;
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m2989m9() {
        if (m2138ix()) {
            m2993x1().m4364to();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final IParagraphFormat m2991x1(int i) {
        if (i < 0 || i > 8) {
            throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
        }
        m2145uz();
        return m2993x1().m4360kk(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final ParagraphFormat m2982k4(ParagraphFormat paragraphFormat) {
        m2145uz();
        return m2993x1().m4356k4(paragraphFormat);
    }

    /* JADX INFO: renamed from: to */
    public final ParagraphFormat[] m2990to() {
        if (m2138ix()) {
            return m2993x1().m4368x1();
        }
        m2146wl();
        return this.f3545du;
    }

    /* JADX INFO: renamed from: x1 */
    public final ParagraphFormat m2992x1(int i, ParagraphFormat paragraphFormat) {
        if (i < 0 || i > 8) {
            throw new IndexOutOfRangeException("Level index must lay in 0..8 interval.");
        }
        if (paragraphFormat != null && m2990to()[i + 1] == null) {
            return paragraphFormat;
        }
        m2145uz();
        return m2993x1().m4365x1(i, paragraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2983k4(float f) {
        ((ParagraphFormat) getDefaultParagraphFormat()).m2194k4(f);
        for (int i = 0; i <= 8; i++) {
            ParagraphFormat paragraphFormat = (ParagraphFormat) getLevel(i);
            if (paragraphFormat != null) {
                paragraphFormat.m2194k4(f);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final bz0 m2993x1() {
        return (bz0) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2984k4(int i) {
        m2145uz();
        m2993x1().m4366x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2994x1(TextStyle textStyle) {
        if (m2138ix() || textStyle.m2138ix()) {
            if (m2138ix() || !m2977to(textStyle)) {
                m2145uz();
                m2993x1().m4367x1(textStyle);
            } else {
                m2146wl();
                this.f3549to.m2195k4((IParagraphFormat) textStyle.m2990to()[0]);
                this.f3545du[0] = this.f3549to;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2985k4(int i, ParagraphFormat paragraphFormat) {
        m2145uz();
        m2993x1().m4357k4(i, paragraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2986k4(TextStyle textStyle) {
        if (m2138ix() || textStyle.m2138ix()) {
            if (m2138ix() || !m2977to(textStyle)) {
                m2145uz();
                m2993x1().m4358k4(textStyle);
            } else {
                m2146wl();
                this.f3549to.m2196k4(textStyle.m2990to()[0]);
                this.f3545du[0] = this.f3549to;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2987k4(C14093tq<Integer> c14093tq) {
        m2145uz();
        m2993x1().m4359k4(c14093tq.Clone());
    }
}
