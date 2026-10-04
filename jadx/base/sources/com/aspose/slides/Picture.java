package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class Picture implements ISlidesPicture, InterfaceC14376r6 {

    /* JADX INFO: renamed from: c5 */
    private jyr f3010c5;

    /* JADX INFO: renamed from: du */
    private final InterfaceC14397rj f3011du;

    /* JADX INFO: renamed from: dy */
    private ImageTransformOperationCollection f3012dy;

    /* JADX INFO: renamed from: h4 */
    private IPresentationComponent f3013h4;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<a1l> f3014k4 = new AbstractC7018k4<a1l>() { // from class: com.aspose.slides.Picture.1
        {
            Picture.this.f3018x1 = new a1l() { // from class: com.aspose.slides.Picture.1.1
                @Override // com.aspose.slides.a1l
                /* JADX INFO: renamed from: k4 */
                public void mo2243k4() {
                    for (a1l a1lVar : ((AbstractC7018k4) C05681.this).f19081x1) {
                        if (a1lVar != null) {
                            a1lVar.mo2243k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private tta f3015kk;

    /* JADX INFO: renamed from: m9 */
    private ISlideComponent f3016m9;

    /* JADX INFO: renamed from: to */
    private boolean f3017to;

    /* JADX INFO: renamed from: x1 */
    private a1l f3018x1;

    public Picture(InterfaceC14397rj interfaceC14397rj) {
        this.f3011du = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: du */
    private ImageTransformOperationCollection m2229du() {
        if (this.f3012dy == null) {
            this.f3012dy = new ImageTransformOperationCollection(this);
            this.f3010c5 = new jyr(this);
            this.f3012dy.f2494k4.mo27432x1(new kpw() { // from class: com.aspose.slides.Picture.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Picture.OnPictureChanged()";
                }

                @Override // com.aspose.slides.kpw
                /* JADX INFO: renamed from: k4 */
                public void mo1763k4() {
                    Picture.this.m2233to();
                }
            });
        }
        return this.f3012dy;
    }

    /* JADX INFO: renamed from: h4 */
    private tta m2230h4() {
        if (this.f3015kk == null) {
            this.f3015kk = new tta(m2229du(), this.f3010c5);
        }
        return this.f3015kk;
    }

    /* JADX INFO: renamed from: m9 */
    private void m2232m9() {
        m2230h4();
        if (this.f3017to) {
            return;
        }
        if (C7019kk.m27469x1(this.f3011du, PVIObject.class)) {
            ((PVIObject) this.f3011du).m2145uz();
        }
        this.f3017to = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m2233to() {
        a1l a1lVar = this.f3018x1;
        if (a1lVar == null || this.f3014k4.m27430k4()) {
            return;
        }
        a1lVar.mo2243k4();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(obj, this)) {
            return true;
        }
        Picture picture = (Picture) C7019kk.m27452k4(obj, Picture.class);
        if (picture == null) {
            return false;
        }
        return tta.m71311k4(this.f3015kk, picture.f3015kk);
    }

    @Override // com.aspose.slides.ISlidesPicture
    public final IPPImage getImage() {
        tta ttaVar = this.f3015kk;
        if (ttaVar != null) {
            return ttaVar.m71313k4();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlidesPicture
    public final IImageTransformOperationCollection getImageTransform() {
        return m2229du();
    }

    @Override // com.aspose.slides.ISlidesPicture
    public final String getLinkPathLong() {
        tta ttaVar = this.f3015kk;
        if (ttaVar != null) {
            return ttaVar.m71321x1();
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f3013h4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3011du, iPresentationComponentArr);
            IPresentationComponent iPresentationComponent2 = iPresentationComponentArr[0];
            this.f3013h4 = iPresentationComponent2;
            if (C7019kk.m27469x1(iPresentationComponent2, PVIObject.class) && !C7019kk.m27469x1(this.f3013h4, IChartComponent.class) && !C7019kk.m27469x1(this.f3013h4, Background.class)) {
                this.f3013h4 = ((PVIObject) C7019kk.m27452k4((Object) this.f3013h4, PVIObject.class)).getParent_IPresentationComponent();
            }
        }
        return this.f3013h4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3011du;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getParent_IPresentationComponent() != null) {
            return getParent_IPresentationComponent().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        ISlideComponent iSlideComponent = this.f3016m9;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f3011du, iSlideComponentArr);
            ISlideComponent iSlideComponent2 = iSlideComponentArr[0];
            this.f3016m9 = iSlideComponent2;
            if (C7019kk.m27469x1(iSlideComponent2, PVIObject.class) && !C7019kk.m27469x1(this.f3013h4, IChartComponent.class) && !C7019kk.m27469x1(this.f3013h4, Background.class)) {
                this.f3016m9 = ((PVIObject) C7019kk.m27452k4((Object) this.f3016m9, PVIObject.class)).getParent_ISlideComponent();
            }
        }
        ISlideComponent iSlideComponent3 = this.f3016m9;
        if (iSlideComponent3 != null) {
            return (BaseSlide) iSlideComponent3.getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        tta ttaVar = this.f3015kk;
        if (ttaVar == null) {
            return 1L;
        }
        return ttaVar.m71312du();
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: kk */
    public final void m2240kk() {
        if (this.f3015kk == null) {
            return;
        }
        m2232m9();
        this.f3015kk.m71320to();
        m2233to();
    }

    @Override // com.aspose.slides.ISlidesPicture
    public final void setImage(IPPImage iPPImage) {
        if (C14067j2.m66729x1(iPPImage, getImage())) {
            return;
        }
        PPImage pPImage = (PPImage) iPPImage;
        if (pPImage != null && pPImage.m2124ck() != null && getPresentation() != null && pPImage.m2124ck() != getPresentation()) {
            throw new PptxEditException("Can't assign an image from the other presentation.");
        }
        m2232m9();
        this.f3015kk.m71316k4(pPImage);
        m2233to();
    }

    @Override // com.aspose.slides.ISlidesPicture
    public final void setLinkPathLong(String str) {
        if (C14113y2.m67363du(str, getLinkPathLong())) {
            return;
        }
        m2232m9();
        this.f3015kk.m71318k4(str);
        m2233to();
    }

    /* JADX INFO: renamed from: x1 */
    public final jyr m2241x1() {
        m2229du();
        return this.f3010c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7131h4 m2235k4(ajz ajzVar, C12015qq c12015qq, kg7 kg7Var, IBaseSlide iBaseSlide, boolean z, PictureFillFormat pictureFillFormat) {
        m2232m9();
        return this.f3015kk.m71314k4(ajzVar, c12015qq.Clone(), kg7Var, iBaseSlide, z, pictureFillFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m2236k4() {
        tta ttaVar = this.f3015kk;
        if (ttaVar != null) {
            return ttaVar.m71319kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2237k4(IPictureEffectiveData iPictureEffectiveData) {
        m2232m9();
        this.f3015kk.m71315k4(iPictureEffectiveData);
        m2233to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2238k4(Picture picture) {
        if (this.f3015kk == null && picture.f3015kk == null) {
            return;
        }
        m2232m9();
        this.f3015kk.m71317k4(picture);
        m2233to();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2239k4(String str) {
        if (C14113y2.m67363du(str, m2236k4())) {
            return;
        }
        m2232m9();
        this.f3015kk.m71322x1(str);
        m2233to();
    }
}
