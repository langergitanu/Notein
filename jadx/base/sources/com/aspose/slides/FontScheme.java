package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class FontScheme implements IFontScheme, InterfaceC14397rj {

    /* JADX INFO: renamed from: m9 */
    private static final FontData f2307m9 = new FontData("Arial");

    /* JADX INFO: renamed from: c5 */
    private IPresentationComponent f2308c5;

    /* JADX INFO: renamed from: du */
    private String f2310du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC14397rj f2311dy;

    /* JADX INFO: renamed from: kk */
    private Fonts f2315kk;

    /* JADX INFO: renamed from: to */
    private Fonts f2316to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14263p1 f2317x1;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC14263p1> f2314k4 = new AbstractC7018k4<AbstractC14263p1>() { // from class: com.aspose.slides.FontScheme.1
        {
            FontScheme.this.f2317x1 = new AbstractC14263p1() { // from class: com.aspose.slides.FontScheme.1.1
                @Override // com.aspose.slides.AbstractC14263p1
                /* JADX INFO: renamed from: k4 */
                public void mo1516k4() {
                    for (AbstractC14263p1 abstractC14263p1 : ((AbstractC7018k4) C04161.this).f19081x1) {
                        if (abstractC14263p1 != null) {
                            abstractC14263p1.mo1516k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: h4 */
    private C13672j4 f2312h4 = new C13672j4();

    /* JADX INFO: renamed from: jd */
    private long f2313jd = 1;

    /* JADX INFO: renamed from: ck */
    private long f2309ck = 0;

    public FontScheme(InterfaceC14397rj interfaceC14397rj) {
        this.f2311dy = interfaceC14397rj;
        C13827mb c13827mbM6639k4 = m1512kk().getPresentation() != null ? ((Presentation) m1512kk().getPresentation()).m2389rv().m6639k4() : C1143gg.m6637kk();
        this.f2315kk = new Fonts(c13827mbM6639k4);
        this.f2316to = new Fonts(c13827mbM6639k4);
        this.f2315kk.f2335k4.mo27432x1(new AbstractC0869ct() { // from class: com.aspose.slides.FontScheme.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FontScheme.OnFontSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0869ct
            /* JADX INFO: renamed from: k4 */
            public void mo1517k4() {
                FontScheme.this.m1506h4();
            }
        });
        this.f2316to.f2335k4.mo27432x1(new AbstractC0869ct() { // from class: com.aspose.slides.FontScheme.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FontScheme.OnFontSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0869ct
            /* JADX INFO: renamed from: k4 */
            public void mo1517k4() {
                FontScheme.this.m1506h4();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    private void m1505du() {
        this.f2313jd++;
        m1506h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m1506h4() {
        this.f2309ck = 0L;
        AbstractC14263p1 abstractC14263p1 = this.f2317x1;
        if (abstractC14263p1 == null || this.f2314k4.m27430k4()) {
            return;
        }
        abstractC14263p1.mo1516k4();
    }

    @Override // com.aspose.slides.IFontScheme
    public final IFonts getMajor() {
        return this.f2315kk;
    }

    @Override // com.aspose.slides.IFontScheme
    public final IFonts getMinor() {
        return this.f2316to;
    }

    @Override // com.aspose.slides.IFontScheme
    public final String getName() {
        return this.f2310du;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2311dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13672j4 m1509k4() {
        return this.f2312h4;
    }

    /* JADX INFO: renamed from: kk */
    public final IPresentationComponent m1512kk() {
        IPresentationComponent iPresentationComponent = this.f2308c5;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2311dy, iPresentationComponentArr);
            this.f2308c5 = iPresentationComponentArr[0];
        }
        return this.f2308c5;
    }

    @Override // com.aspose.slides.IFontScheme
    public final void setName(String str) {
        this.f2310du = str;
        m1505du();
    }

    /* JADX INFO: renamed from: to */
    public final long m1513to() {
        if ((this.f2309ck & 4294967295L) == 0) {
            this.f2309ck = ((((this.f2313jd & 4294967295L) + (this.f2316to.m1526kk() & 4294967295L)) & 4294967295L) + (this.f2315kk.m1526kk() & 4294967295L)) & 4294967295L;
        }
        return this.f2309ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1514x1() {
        Fonts fonts = this.f2315kk;
        FontData fontData = f2307m9;
        fonts.setLatinFont(fontData);
        this.f2315kk.setEastAsianFont(fontData);
        this.f2315kk.setComplexScriptFont(fontData);
        this.f2316to.setLatinFont(fontData);
        this.f2316to.setEastAsianFont(fontData);
        this.f2316to.setComplexScriptFont(fontData);
        this.f2310du = "Arial";
        m1505du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1510k4(FontScheme fontScheme) {
        this.f2315kk.m1524k4(fontScheme.f2315kk);
        this.f2316to.m1524k4(fontScheme.f2316to);
        this.f2310du = fontScheme.f2310du;
        if (fontScheme.f2312h4.m63209k4() != null) {
            this.f2312h4.m63210k4(fontScheme.f2312h4.m63209k4().m29645to());
        }
        m1505du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1511k4(IFontSchemeEffectiveData iFontSchemeEffectiveData) {
        this.f2315kk.m1525k4(iFontSchemeEffectiveData.getMajor());
        this.f2316to.m1525k4(iFontSchemeEffectiveData.getMinor());
        this.f2310du = iFontSchemeEffectiveData.getName();
        if (!C7019kk.m27469x1(iFontSchemeEffectiveData, C13744kr.class)) {
            throw new NotImplementedException();
        }
        this.f2312h4.m63211k4(((C13744kr) iFontSchemeEffectiveData).f45844k4);
        m1505du();
    }
}
