package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
public final class OverrideTheme extends Theme implements IOverrideTheme {

    /* JADX INFO: renamed from: du */
    private long f2917du;

    /* JADX INFO: renamed from: k4 */
    private ColorScheme f2918k4;

    /* JADX INFO: renamed from: kk */
    private FormatScheme f2919kk;

    /* JADX INFO: renamed from: to */
    private long f2920to;

    /* JADX INFO: renamed from: x1 */
    private FontScheme f2921x1;

    public OverrideTheme(BaseOverrideThemeManager baseOverrideThemeManager) {
        super(baseOverrideThemeManager);
        this.f2920to = 1L;
        this.f2917du = 0L;
    }

    /* JADX INFO: renamed from: du */
    private void m2109du() {
        this.f2920to++;
        m2110h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m2110h4() {
        this.f2917du = 0L;
    }

    /* JADX INFO: renamed from: to */
    private BaseOverrideThemeManager m2112to() {
        return (BaseOverrideThemeManager) getParent_Immediate();
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void clear() {
        this.f2920to = getVersion();
        m2109du();
        this.f2918k4 = null;
        this.f2921x1 = null;
        this.f2919kk = null;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IColorScheme getColorScheme() {
        return this.f2918k4;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IFontScheme getFontScheme() {
        return this.f2921x1;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IFormatScheme getFormatScheme() {
        return this.f2919kk;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if ((this.f2917du & 4294967295L) == 0) {
            long j = this.f2920to & 4294967295L;
            ColorScheme colorScheme = this.f2918k4;
            long jM1132to = (j + ((colorScheme != null ? colorScheme.m1132to() : 0L) & 4294967295L)) & 4294967295L;
            FontScheme fontScheme = this.f2921x1;
            long jM1513to = (jM1132to + ((fontScheme != null ? fontScheme.m1513to() : 0L) & 4294967295L)) & 4294967295L;
            FormatScheme formatScheme = this.f2919kk;
            this.f2917du = (jM1513to + ((formatScheme != null ? formatScheme.m1567to() : 0L) & 4294967295L)) & 4294967295L;
        }
        return this.f2917du;
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initColorScheme() {
        this.f2920to = getVersion();
        m2109du();
        if (this.f2918k4 != null) {
            throw new InvalidOperationException();
        }
        ColorScheme colorScheme = new ColorScheme(this);
        this.f2918k4 = colorScheme;
        colorScheme.f1985k4.mo27432x1(new AbstractC0870cu() { // from class: com.aspose.slides.OverrideTheme.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.OverrideTheme.OnOverrideThemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0870cu
            /* JADX INFO: renamed from: k4 */
            public void mo1135k4() {
                OverrideTheme.this.m2110h4();
            }
        });
        ((ColorFormat) this.f2918k4.getDark1()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getLight1()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getDark2()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getLight2()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent1()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent2()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent3()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent4()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent5()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getAccent6()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getHyperlink()).m1080k4(C12003du.m56460uz().Clone());
        ((ColorFormat) this.f2918k4.getFollowedHyperlink()).m1080k4(C12003du.m56460uz().Clone());
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initColorSchemeFrom(IColorScheme iColorScheme) {
        if (iColorScheme == null) {
            throw new ArgumentNullException("colorScheme");
        }
        initColorScheme();
        this.f2918k4.m1128k4((ColorScheme) iColorScheme);
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initColorSchemeFromInherited() {
        initColorScheme();
        if (m2112to().mo347k4() == null) {
            throw new NotImplementedException();
        }
        this.f2918k4.m1129k4(((fuq) m2112to().mo347k4().createThemeEffective()).m6314x1());
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFontScheme() {
        this.f2920to = getVersion();
        m2109du();
        if (this.f2921x1 != null) {
            throw new InvalidOperationException();
        }
        FontScheme fontScheme = new FontScheme(this);
        this.f2921x1 = fontScheme;
        fontScheme.f2314k4.mo27432x1(new AbstractC14263p1() { // from class: com.aspose.slides.OverrideTheme.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.OverrideTheme.OnOverrideThemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC14263p1
            /* JADX INFO: renamed from: k4 */
            public void mo1516k4() {
                OverrideTheme.this.m2110h4();
            }
        });
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFontSchemeFrom(IFontScheme iFontScheme) {
        if (iFontScheme == null) {
            throw new ArgumentNullException("fontScheme");
        }
        initFontScheme();
        this.f2921x1.m1510k4((FontScheme) iFontScheme);
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFontSchemeFromInherited() {
        initFontScheme();
        if (m2112to().mo347k4() == null) {
            throw new NotImplementedException();
        }
        this.f2921x1.m1511k4(m2112to().mo347k4().createThemeEffective().getFontScheme());
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFormatScheme() {
        this.f2920to = getVersion();
        m2109du();
        if (this.f2919kk != null) {
            throw new InvalidOperationException();
        }
        FormatScheme formatScheme = new FormatScheme(this);
        this.f2919kk = formatScheme;
        formatScheme.f2372k4.mo27432x1(new AbstractC0850cd() { // from class: com.aspose.slides.OverrideTheme.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.OverrideTheme.OnOverrideThemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0850cd
            /* JADX INFO: renamed from: k4 */
            public void mo1570k4() {
                OverrideTheme.this.m2110h4();
            }
        });
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFormatSchemeFrom(IFormatScheme iFormatScheme) {
        if (iFormatScheme == null) {
            throw new ArgumentNullException("formatScheme");
        }
        initFormatScheme();
        this.f2919kk.m1563k4((FormatScheme) iFormatScheme);
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final void initFormatSchemeFromInherited() {
        initFormatScheme();
        if (m2112to().mo347k4() == null) {
            throw new NotImplementedException();
        }
        this.f2919kk.m1564k4(m2112to().mo347k4().createThemeEffective().getFormatScheme());
    }

    @Override // com.aspose.slides.IOverrideTheme
    public final boolean isEmpty() {
        return this.f2918k4 == null && this.f2921x1 == null && this.f2919kk == null;
    }

    /* JADX INFO: renamed from: k4 */
    public final ColorScheme m2113k4() {
        if (this.f2918k4 == null) {
            initColorScheme();
        }
        return this.f2918k4;
    }
}
