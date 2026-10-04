package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public class ColorScheme implements IColorScheme, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private IPresentationComponent f1982du;

    /* JADX INFO: renamed from: kk */
    private AbstractC0870cu f1986kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f1988to;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC0870cu> f1985k4 = new AbstractC7018k4<AbstractC0870cu>() { // from class: com.aspose.slides.ColorScheme.1
        {
            ColorScheme.this.f1986kk = new AbstractC0870cu() { // from class: com.aspose.slides.ColorScheme.1.1
                @Override // com.aspose.slides.AbstractC0870cu
                /* JADX INFO: renamed from: k4 */
                public void mo1135k4() {
                    for (AbstractC0870cu abstractC0870cu : ((AbstractC7018k4) C03171.this).f19081x1) {
                        if (abstractC0870cu != null) {
                            abstractC0870cu.mo1135k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: h4 */
    private long f1984h4 = 1;

    /* JADX INFO: renamed from: m9 */
    private long f1987m9 = 0;

    /* JADX INFO: renamed from: x1 */
    ColorFormat[] f1989x1 = new ColorFormat[12];

    /* JADX INFO: renamed from: dy */
    private String f1983dy = "";

    /* JADX INFO: renamed from: c5 */
    private C13714k6 f1981c5 = new C13714k6();

    public ColorScheme(InterfaceC14397rj interfaceC14397rj) {
        this.f1988to = interfaceC14397rj;
        int i = 0;
        while (true) {
            ColorFormat[] colorFormatArr = this.f1989x1;
            if (i >= colorFormatArr.length) {
                return;
            }
            colorFormatArr[i] = new ColorFormat(this);
            this.f1989x1[i].f1951k4.mo27432x1(new AbstractC14741wk() { // from class: com.aspose.slides.ColorScheme.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Theme.ColorScheme.OnColorSchemeChanged()";
                }

                @Override // com.aspose.slides.AbstractC14741wk
                /* JADX INFO: renamed from: k4 */
                public void mo243k4() {
                    ColorScheme.this.m1124h4();
                }
            });
            i++;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m1123du() {
        this.f1984h4++;
        m1124h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m1124h4() {
        this.f1987m9 = 0L;
        AbstractC0870cu abstractC0870cu = this.f1986kk;
        if (abstractC0870cu == null || this.f1985k4.m27430k4()) {
            return;
        }
        abstractC0870cu.mo1135k4();
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent1() {
        return getByColorSchemeIndex((byte) 4);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent2() {
        return getByColorSchemeIndex((byte) 5);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent3() {
        return getByColorSchemeIndex((byte) 6);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent4() {
        return getByColorSchemeIndex((byte) 7);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent5() {
        return getByColorSchemeIndex((byte) 8);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getAccent6() {
        return getByColorSchemeIndex((byte) 9);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getByColorSchemeIndex(byte b) {
        int i = b & 255;
        if (i < 0) {
            return null;
        }
        ColorFormat[] colorFormatArr = this.f1989x1;
        if (i >= colorFormatArr.length) {
            return null;
        }
        return colorFormatArr[i];
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getDark1() {
        return getByColorSchemeIndex((byte) 0);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getDark2() {
        return getByColorSchemeIndex((byte) 2);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getFollowedHyperlink() {
        return getByColorSchemeIndex((byte) 11);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getHyperlink() {
        return getByColorSchemeIndex((byte) 10);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getLight1() {
        return getByColorSchemeIndex((byte) 1);
    }

    @Override // com.aspose.slides.IColorScheme
    public final IColorFormat getLight2() {
        return getByColorSchemeIndex((byte) 3);
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1988to;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return m1131kk().getPresentation();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final IPresentationComponent m1131kk() {
        IPresentationComponent iPresentationComponent = this.f1982du;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f1988to, iPresentationComponentArr);
            this.f1982du = iPresentationComponentArr[0];
        }
        return this.f1982du;
    }

    /* JADX INFO: renamed from: to */
    public final long m1132to() {
        if ((this.f1987m9 & 4294967295L) == 0) {
            this.f1987m9 = this.f1984h4;
            for (ColorFormat colorFormat : this.f1989x1) {
                this.f1987m9 = ((this.f1987m9 & 4294967295L) + (colorFormat.getVersion() & 4294967295L)) & 4294967295L;
            }
        }
        return this.f1987m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13714k6 m1133x1() {
        return this.f1981c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m1127k4() {
        return this.f1983dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1128k4(ColorScheme colorScheme) {
        int i = 0;
        while (true) {
            ColorFormat[] colorFormatArr = colorScheme.f1989x1;
            if (i >= colorFormatArr.length) {
                this.f1983dy = colorScheme.f1983dy;
                m1133x1().m63655k4(colorScheme.m1133x1());
                m1123du();
                return;
            }
            this.f1989x1[i].m1079k4(colorFormatArr[i]);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1129k4(IColorSchemeEffectiveData iColorSchemeEffectiveData) {
        int i = 0;
        while (true) {
            ColorFormat[] colorFormatArr = this.f1989x1;
            if (i >= colorFormatArr.length) {
                break;
            }
            colorFormatArr[i].m1089x1(((C14870z2) iColorSchemeEffectiveData).m74204k4((byte) i).Clone());
            i++;
        }
        if (!C7019kk.m27469x1(iColorSchemeEffectiveData, C14870z2.class)) {
            throw new NotImplementedException();
        }
        C14870z2 c14870z2 = (C14870z2) iColorSchemeEffectiveData;
        this.f1983dy = c14870z2.m74210up();
        m1133x1().m63655k4(c14870z2.f50439kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1130k4(String str) {
        this.f1983dy = str;
        m1123du();
    }
}
