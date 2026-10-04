package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class FormatScheme implements IFormatScheme, InterfaceC14397rj {

    /* JADX INFO: renamed from: kk */
    private InterfaceC14397rj f2373kk;

    /* JADX INFO: renamed from: m9 */
    private String f2374m9;

    /* JADX INFO: renamed from: to */
    private IPresentationComponent f2375to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC0850cd f2376x1;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0850cd> f2372k4 = new AbstractC7018k4<AbstractC0850cd>() { // from class: com.aspose.slides.FormatScheme.1
        {
            FormatScheme.this.f2376x1 = new AbstractC0850cd() { // from class: com.aspose.slides.FormatScheme.1.1
                @Override // com.aspose.slides.AbstractC0850cd
                /* JADX INFO: renamed from: k4 */
                public void mo1570k4() {
                    for (AbstractC0850cd abstractC0850cd : ((AbstractC7018k4) C04271.this).f19081x1) {
                        if (abstractC0850cd != null) {
                            abstractC0850cd.mo1570k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: du */
    private long f2368du = 1;

    /* JADX INFO: renamed from: h4 */
    private long f2370h4 = 0;

    /* JADX INFO: renamed from: dy */
    private FillFormatCollection f2369dy = new FillFormatCollection(this);

    /* JADX INFO: renamed from: c5 */
    private LineFormatCollection f2366c5 = new LineFormatCollection(this);

    /* JADX INFO: renamed from: jd */
    private EffectStyleCollection f2371jd = new EffectStyleCollection(this);

    /* JADX INFO: renamed from: ck */
    private FillFormatCollection f2367ck = new FillFormatCollection(this);

    public FormatScheme(InterfaceC14397rj interfaceC14397rj) {
        this.f2373kk = interfaceC14397rj;
        this.f2369dy.f2273k4.mo27432x1(new AbstractC14259ox() { // from class: com.aspose.slides.FormatScheme.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FormatScheme.OnFormatSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC14259ox
            /* JADX INFO: renamed from: k4 */
            public void mo1476k4() {
                FormatScheme.this.m1559h4();
            }
        });
        this.f2366c5.f2637k4.mo27432x1(new shv() { // from class: com.aspose.slides.FormatScheme.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FormatScheme.OnFormatSchemeChanged()";
            }

            @Override // com.aspose.slides.shv
            /* JADX INFO: renamed from: k4 */
            public void mo1571k4() {
                FormatScheme.this.m1559h4();
            }
        });
        this.f2371jd.f2187k4.mo27432x1(new AbstractC0701a2() { // from class: com.aspose.slides.FormatScheme.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FormatScheme.OnFormatSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0701a2
            /* JADX INFO: renamed from: k4 */
            public void mo1415k4() {
                FormatScheme.this.m1559h4();
            }
        });
        this.f2367ck.f2273k4.mo27432x1(new AbstractC14259ox() { // from class: com.aspose.slides.FormatScheme.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.FormatScheme.OnFormatSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC14259ox
            /* JADX INFO: renamed from: k4 */
            public void mo1476k4() {
                FormatScheme.this.m1559h4();
            }
        });
    }

    /* JADX INFO: renamed from: du */
    private void m1558du() {
        this.f2368du++;
        m1559h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m1559h4() {
        this.f2370h4 = 0L;
        AbstractC0850cd abstractC0850cd = this.f2376x1;
        if (abstractC0850cd == null || this.f2372k4.m27430k4()) {
            return;
        }
        abstractC0850cd.mo1570k4();
    }

    @Override // com.aspose.slides.IFormatScheme
    public final IFillFormatCollection getBackgroundFillStyles() {
        return this.f2367ck;
    }

    @Override // com.aspose.slides.IFormatScheme
    public final IEffectStyleCollection getEffectStyles() {
        return this.f2371jd;
    }

    @Override // com.aspose.slides.IFormatScheme
    public final IFillFormatCollection getFillStyles() {
        return this.f2369dy;
    }

    @Override // com.aspose.slides.IFormatScheme
    public final ILineFormatCollection getLineStyles() {
        return this.f2366c5;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2373kk;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return m1562k4().getPresentation();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPresentationComponent m1562k4() {
        IPresentationComponent iPresentationComponent = this.f2375to;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2373kk, iPresentationComponentArr);
            this.f2375to = iPresentationComponentArr[0];
        }
        return this.f2375to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1566kk() {
        C14785xg.m73349k4(this);
        m1558du();
    }

    /* JADX INFO: renamed from: to */
    public final long m1567to() {
        if ((this.f2370h4 & 4294967295L) == 0) {
            this.f2370h4 = ((((((((this.f2368du & 4294967295L) + (this.f2369dy.m1473kk() & 4294967295L)) & 4294967295L) + (this.f2366c5.m1916kk() & 4294967295L)) & 4294967295L) + (this.f2371jd.m1412kk() & 4294967295L)) & 4294967295L) + (this.f2367ck.m1473kk() & 4294967295L)) & 4294967295L;
        }
        return this.f2370h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m1568x1() {
        return this.f2374m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1563k4(FormatScheme formatScheme) {
        this.f2369dy.m1471k4(formatScheme.f2369dy);
        this.f2366c5.m1915k4(formatScheme.f2366c5);
        this.f2371jd.m1410k4(formatScheme.f2371jd);
        this.f2367ck.m1471k4(formatScheme.f2367ck);
        this.f2374m9 = formatScheme.f2374m9;
        m1558du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1564k4(IFormatSchemeEffectiveData iFormatSchemeEffectiveData) {
        if (!C7019kk.m27469x1(iFormatSchemeEffectiveData, C0874cy.class)) {
            throw new NotImplementedException();
        }
        C0874cy c0874cy = (C0874cy) iFormatSchemeEffectiveData;
        this.f2374m9 = c0874cy.m4882k4();
        this.f2369dy.m1472k4(c0874cy.f4513x1);
        this.f2366c5.m1914k4(c0874cy.f4511kk);
        this.f2371jd.m1411k4(c0874cy.f4512to);
        this.f2367ck.m1472k4(c0874cy.f4509du);
        m1558du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1565k4(String str) {
        this.f2374m9 = str;
        m1558du();
    }
}
