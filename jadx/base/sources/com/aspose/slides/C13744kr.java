package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.kr */
/* JADX INFO: loaded from: classes3.dex */
final class C13744kr implements IFontSchemeEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    final C13672j4 f45844k4;

    /* JADX INFO: renamed from: kk */
    private final C13839mj f45845kk;

    /* JADX INFO: renamed from: to */
    private String f45846to;

    /* JADX INFO: renamed from: x1 */
    private final C13839mj f45847x1;

    public C13744kr() {
        this(null);
    }

    @Override // com.aspose.slides.IFontSchemeEffectiveData
    public final IFontsEffectiveData getMajor() {
        return this.f45847x1;
    }

    @Override // com.aspose.slides.IFontSchemeEffectiveData
    public final IFontsEffectiveData getMinor() {
        return this.f45845kk;
    }

    @Override // com.aspose.slides.IFontSchemeEffectiveData
    public final String getName() {
        return this.f45846to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64130k4(C13744kr c13744kr, FontScheme fontScheme) {
        C13839mj c13839mj;
        C13839mj c13839mj2;
        Fonts fonts;
        Fonts fonts2 = null;
        if (c13744kr != null) {
            c13839mj = c13744kr.f45847x1;
            c13839mj2 = c13744kr.f45845kk;
            this.f45846to = c13744kr.f45846to;
        } else {
            c13839mj = null;
            c13839mj2 = null;
        }
        if (fontScheme != null) {
            if (!C14113y2.m67411k4(fontScheme.getName())) {
                this.f45846to = fontScheme.getName();
            }
            fonts2 = (Fonts) fontScheme.getMajor();
            fonts = (Fonts) fontScheme.getMinor();
        } else {
            fonts = null;
        }
        this.f45847x1.m64896k4(c13839mj, fonts2);
        this.f45845kk.m64896k4(c13839mj2, fonts);
        if (fontScheme != null) {
            this.f45844k4.m63211k4(fontScheme.m1509k4());
        } else if (c13744kr != null) {
            this.f45844k4.m63211k4(c13744kr.f45844k4);
        }
    }

    public C13744kr(FontScheme fontScheme) {
        Fonts fonts;
        Fonts fonts2 = null;
        this.f45846to = null;
        if (fontScheme != null) {
            if (!C14113y2.m67411k4(fontScheme.getName())) {
                this.f45846to = fontScheme.getName();
            }
            fonts2 = (Fonts) fontScheme.getMajor();
            fonts = (Fonts) fontScheme.getMinor();
            C13672j4 c13672j4 = new C13672j4();
            this.f45844k4 = c13672j4;
            c13672j4.m63211k4(fontScheme.m1509k4());
        } else {
            this.f45844k4 = new C13672j4();
            fonts = null;
        }
        this.f45847x1 = new C13839mj(fonts2);
        this.f45845kk = new C13839mj(fonts);
    }
}
