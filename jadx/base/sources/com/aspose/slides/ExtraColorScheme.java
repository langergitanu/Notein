package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public class ExtraColorScheme implements IExtraColorScheme, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private InterfaceC14397rj f2218du;

    /* JADX INFO: renamed from: h4 */
    private long f2219h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC14828y3> f2220k4;

    /* JADX INFO: renamed from: kk */
    private ColorScheme f2221kk;

    /* JADX INFO: renamed from: to */
    private C13682je f2222to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14828y3 f2223x1;

    public ExtraColorScheme(ExtraColorSchemeCollection extraColorSchemeCollection) {
        this(extraColorSchemeCollection, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public void m1426kk() {
        this.f2219h4 = 0L;
        AbstractC14828y3 abstractC14828y3 = this.f2223x1;
        if (abstractC14828y3 == null || this.f2220k4.m27430k4()) {
            return;
        }
        abstractC14828y3.mo1430k4();
    }

    @Override // com.aspose.slides.IExtraColorScheme
    public final IColorScheme getColorScheme() {
        return this.f2221kk;
    }

    @Override // com.aspose.slides.IExtraColorScheme
    public final String getName() {
        return this.f2221kk.m1127k4();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2218du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13682je m1427k4() {
        return this.f2222to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m1428x1() {
        if ((this.f2219h4 & 4294967295L) == 0) {
            this.f2219h4 = ((this.f2221kk.m1132to() & 4294967295L) + (this.f2222to.m63295kk() & 4294967295L)) & 4294967295L;
        }
        return this.f2219h4;
    }

    public ExtraColorScheme(ExtraColorSchemeCollection extraColorSchemeCollection, boolean z) {
        this.f2220k4 = new AbstractC7018k4<AbstractC14828y3>() { // from class: com.aspose.slides.ExtraColorScheme.1
            {
                ExtraColorScheme.this.f2223x1 = new AbstractC14828y3() { // from class: com.aspose.slides.ExtraColorScheme.1.1
                    @Override // com.aspose.slides.AbstractC14828y3
                    /* JADX INFO: renamed from: k4 */
                    public void mo1430k4() {
                        for (AbstractC14828y3 abstractC14828y3 : ((AbstractC7018k4) C03901.this).f19081x1) {
                            if (abstractC14828y3 != null) {
                                abstractC14828y3.mo1430k4();
                            }
                        }
                    }
                };
            }
        };
        this.f2219h4 = 0L;
        this.f2218du = extraColorSchemeCollection;
        this.f2221kk = new ColorScheme(this);
        this.f2222to = new C13682je(z);
        this.f2221kk.f1985k4.mo27432x1(new AbstractC0870cu() { // from class: com.aspose.slides.ExtraColorScheme.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.ExtraColorScheme.OnExtraColorSchemeChanged()";
            }

            @Override // com.aspose.slides.AbstractC0870cu
            /* JADX INFO: renamed from: k4 */
            public void mo1135k4() {
                ExtraColorScheme.this.m1426kk();
            }
        });
    }
}
