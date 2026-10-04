package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.cy */
/* JADX INFO: loaded from: classes3.dex */
final class C0874cy extends AbstractC1137ga<FormatScheme, C0874cy> implements IFormatSchemeEffectiveData {

    /* JADX INFO: renamed from: du */
    C0927e5 f4509du;

    /* JADX INFO: renamed from: k4 */
    String f4510k4;

    /* JADX INFO: renamed from: kk */
    giy f4511kk;

    /* JADX INFO: renamed from: to */
    C14295pn f4512to;

    /* JADX INFO: renamed from: x1 */
    C0927e5 f4513x1;

    public C0874cy() {
        this(null);
    }

    @Override // com.aspose.slides.IFormatSchemeEffectiveData
    public final IFillFormatCollectionEffectiveData getBackgroundFillStyles(Integer num) {
        return m4886to(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IFormatSchemeEffectiveData
    public final IEffectStyleCollectionEffectiveData getEffectStyles(Integer num) {
        return m4885kk(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IFormatSchemeEffectiveData
    public final IFillFormatCollectionEffectiveData getFillStyles(Integer num) {
        return m4881k4(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IFormatSchemeEffectiveData
    public final ILineFormatCollectionEffectiveData getLineStyles(Integer num) {
        return m4887x1(C12003du.m56401k4(num));
    }

    /* JADX INFO: renamed from: k4 */
    public final IFillFormatCollectionEffectiveData m4880k4(IBaseSlide iBaseSlide, C12003du c12003du) {
        this.f4509du.mo4833k4(iBaseSlide, new dm6(new C14321pz(c12003du.Clone()), null));
        return this.f4509du;
    }

    /* JADX INFO: renamed from: kk */
    public IEffectStyleCollectionEffectiveData m4885kk(C12003du c12003du) {
        this.f4512to.mo4833k4((IBaseSlide) null, new dm6(new C14321pz(c12003du.Clone()), null));
        return this.f4512to;
    }

    /* JADX INFO: renamed from: to */
    public IFillFormatCollectionEffectiveData m4886to(C12003du c12003du) {
        return m4880k4((IBaseSlide) null, c12003du.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public ILineFormatCollectionEffectiveData m4887x1(C12003du c12003du) {
        this.f4511kk.mo4833k4((IBaseSlide) null, new dm6(new C14321pz(c12003du.Clone()), null));
        return this.f4511kk;
    }

    public C0874cy(FormatScheme formatScheme) {
        this.f4510k4 = null;
        if (formatScheme == null) {
            this.f4513x1 = new C0927e5();
            this.f4511kk = new giy();
            this.f4512to = new C14295pn();
            this.f4509du = new C0927e5();
            return;
        }
        if (!C14113y2.m67411k4(formatScheme.m1568x1())) {
            this.f4510k4 = formatScheme.m1568x1();
        }
        this.f4513x1 = new C0927e5((FillFormatCollection) formatScheme.getFillStyles());
        this.f4511kk = new giy((LineFormatCollection) formatScheme.getLineStyles());
        this.f4512to = new C14295pn((EffectStyleCollection) formatScheme.getEffectStyles());
        this.f4509du = new C0927e5((FillFormatCollection) formatScheme.getBackgroundFillStyles());
    }

    /* JADX INFO: renamed from: k4 */
    public IFillFormatCollectionEffectiveData m4881k4(C12003du c12003du) {
        this.f4513x1.mo4833k4((IBaseSlide) null, new dm6(new C14321pz(c12003du.Clone()), null));
        return this.f4513x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m4882k4() {
        return this.f4510k4;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, FormatScheme formatScheme) {
        C0874cy c0874cy = (C0874cy) interfaceC14672vc;
        if (c0874cy != null) {
            this.f4510k4 = c0874cy.f4510k4;
            this.f4513x1.m5343k4((InterfaceC14672vc) c0874cy.f4513x1);
            this.f4511kk.m6738k4((InterfaceC14672vc) c0874cy.f4511kk);
            this.f4512to.m69158k4((InterfaceC14672vc) c0874cy.f4512to);
            this.f4509du.m5343k4((InterfaceC14672vc) c0874cy.f4509du);
        }
        if (formatScheme != null) {
            if (!C14113y2.m67411k4(formatScheme.m1568x1())) {
                this.f4510k4 = formatScheme.m1568x1();
            }
            if (formatScheme.getFillStyles() != null && formatScheme.getFillStyles().size() > 0) {
                this.f4513x1.m5342k4((FillFormatCollection) formatScheme.getFillStyles());
            }
            if (formatScheme.getLineStyles() != null && formatScheme.getLineStyles().size() > 0) {
                this.f4511kk.m6737k4((LineFormatCollection) formatScheme.getLineStyles());
            }
            if (formatScheme.getEffectStyles() != null && formatScheme.getEffectStyles().size() > 0) {
                this.f4512to.m69157k4((EffectStyleCollection) formatScheme.getEffectStyles());
            }
            if (formatScheme.getBackgroundFillStyles() == null || formatScheme.getBackgroundFillStyles().size() <= 0) {
                return;
            }
            this.f4509du.m5342k4((FillFormatCollection) formatScheme.getBackgroundFillStyles());
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C0874cy c0874cy) {
        return c0874cy != null && this.f4513x1.mo4836k4(c0874cy.f4513x1) && this.f4511kk.mo4836k4(c0874cy.f4511kk) && this.f4512to.mo4836k4(c0874cy.f4512to) && this.f4509du.mo4836k4(c0874cy.f4509du);
    }
}
