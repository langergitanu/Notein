package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: renamed from: com.aspose.slides.bp */
/* JADX INFO: loaded from: classes3.dex */
class C0826bp implements IPresentationComponent, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private AbstractC0759aq f4226du;

    /* JADX INFO: renamed from: h4 */
    private MasterTheme f4227h4;

    /* JADX INFO: renamed from: m9 */
    private long f4230m9;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0759aq> f4228k4 = new AbstractC7018k4<AbstractC0759aq>() { // from class: com.aspose.slides.bp.1
        {
            C0826bp.this.f4226du = new AbstractC0759aq() { // from class: com.aspose.slides.bp.1.1
                @Override // com.aspose.slides.AbstractC0759aq
                /* JADX INFO: renamed from: k4 */
                public void mo1960k4() {
                    for (AbstractC0759aq abstractC0759aq : ((AbstractC7018k4) AnonymousClass1.this).f19081x1) {
                        if (abstractC0759aq != null) {
                            abstractC0759aq.mo1960k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: x1 */
    ColorScheme f4232x1 = new ColorScheme(this);

    /* JADX INFO: renamed from: kk */
    FontScheme f4229kk = new FontScheme(this);

    /* JADX INFO: renamed from: to */
    FormatScheme f4231to = new FormatScheme(this);

    public C0826bp(MasterTheme masterTheme) {
        this.f4227h4 = masterTheme;
        this.f4232x1.f1985k4.mo27432x1(new AbstractC0870cu() { // from class: com.aspose.slides.bp.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.BaseStyles.OnBaseStylesChanged()";
            }

            @Override // com.aspose.slides.AbstractC0870cu
            /* JADX INFO: renamed from: k4 */
            public void mo1135k4() {
                C0826bp.this.m4285x1();
            }
        });
        this.f4229kk.f2314k4.mo27432x1(new AbstractC14263p1() { // from class: com.aspose.slides.bp.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.BaseStyles.OnBaseStylesChanged()";
            }

            @Override // com.aspose.slides.AbstractC14263p1
            /* JADX INFO: renamed from: k4 */
            public void mo1516k4() {
                C0826bp.this.m4285x1();
            }
        });
        this.f4231to.f2372k4.mo27432x1(new AbstractC0850cd() { // from class: com.aspose.slides.bp.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.BaseStyles.OnBaseStylesChanged()";
            }

            @Override // com.aspose.slides.AbstractC0850cd
            /* JADX INFO: renamed from: k4 */
            public void mo1570k4() {
                C0826bp.this.m4285x1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m4285x1() {
        this.f4230m9 = 0L;
        AbstractC0759aq abstractC0759aq = this.f4226du;
        if (abstractC0759aq == null || this.f4228k4.m27430k4()) {
            return;
        }
        abstractC0759aq.mo1960k4();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f4227h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return this.f4227h4.getPresentation();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m4286k4() {
        if ((this.f4230m9 & 4294967295L) == 0) {
            this.f4230m9 = ((((this.f4232x1.m1132to() & 4294967295L) + (this.f4229kk.m1513to() & 4294967295L)) & 4294967295L) + (this.f4231to.m1567to() & 4294967295L)) & 4294967295L;
        }
        return this.f4230m9;
    }
}
