package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterTheme extends Theme implements IMasterTheme {

    /* JADX INFO: renamed from: du */
    private long f2706du;

    /* JADX INFO: renamed from: h4 */
    private long f2707h4;

    /* JADX INFO: renamed from: k4 */
    private String f2708k4;

    /* JADX INFO: renamed from: kk */
    private ExtraColorSchemeCollection f2709kk;

    /* JADX INFO: renamed from: to */
    private duw f2710to;

    /* JADX INFO: renamed from: x1 */
    private C0826bp f2711x1;

    public MasterTheme(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2710to = new duw();
        this.f2706du = 1L;
        this.f2707h4 = 0L;
        this.f2711x1 = new C0826bp(this);
        this.f2709kk = new ExtraColorSchemeCollection(this);
        this.f2711x1.f4228k4.mo27432x1(new AbstractC0759aq() { // from class: com.aspose.slides.MasterTheme.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.MasterTheme.OnMasterThemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0759aq
            /* JADX INFO: renamed from: k4 */
            public void mo1960k4() {
                MasterTheme.this.m1956du();
            }
        });
        this.f2709kk.f2229k4.mo27432x1(new AbstractC0787b0() { // from class: com.aspose.slides.MasterTheme.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.MasterTheme.OnMasterThemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0787b0
            /* JADX INFO: renamed from: k4 */
            public void mo1440k4() {
                MasterTheme.this.m1956du();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public void m1956du() {
        this.f2707h4 = 0L;
    }

    /* JADX INFO: renamed from: to */
    private void m1958to() {
        this.f2706du++;
        m1956du();
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IColorScheme getColorScheme() {
        return this.f2711x1.f4232x1;
    }

    @Override // com.aspose.slides.IMasterTheme
    public final IExtraColorSchemeCollection getExtraColorSchemes() {
        return this.f2709kk;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IFontScheme getFontScheme() {
        return this.f2711x1.f4229kk;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.ITheme
    public IFormatScheme getFormatScheme() {
        return this.f2711x1.f4231to;
    }

    @Override // com.aspose.slides.IMasterTheme
    public final String getName() {
        return this.f2708k4;
    }

    @Override // com.aspose.slides.Theme, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if ((this.f2707h4 & 4294967295L) == 0) {
            this.f2707h4 = ((((this.f2706du & 4294967295L) + (this.f2711x1.m4286k4() & 4294967295L)) & 4294967295L) + (this.f2709kk.m1438x1() & 4294967295L)) & 4294967295L;
        }
        return this.f2707h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final duw m1959k4() {
        return this.f2710to;
    }

    @Override // com.aspose.slides.IMasterTheme
    public final void setName(String str) {
        this.f2708k4 = str;
        m1958to();
    }
}
