package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageTransformOperationCollection extends PVIObject implements IImageTransformOperationCollection {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<kpw> f2494k4;

    /* JADX INFO: renamed from: kk */
    private List<IImageTransformOperation> f2495kk;

    /* JADX INFO: renamed from: x1 */
    private kpw f2496x1;

    public ImageTransformOperationCollection(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f2494k4 = new AbstractC7018k4<kpw>() { // from class: com.aspose.slides.ImageTransformOperationCollection.1
            {
                ImageTransformOperationCollection.this.f2496x1 = new kpw() { // from class: com.aspose.slides.ImageTransformOperationCollection.1.1
                    @Override // com.aspose.slides.kpw
                    /* JADX INFO: renamed from: k4 */
                    public void mo1763k4() {
                        for (kpw kpwVar : ((AbstractC7018k4) C04511.this).f19081x1) {
                            if (kpwVar != null) {
                                kpwVar.mo1763k4();
                            }
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m1754to() {
        kpw kpwVar = this.f2496x1;
        if (kpwVar == null || this.f2494k4.m27430k4()) {
            return;
        }
        kpwVar.mo1763k4();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new qmc(this.f2495kk);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f2495kk = new List<>();
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaBiLevel addAlphaBiLevelEffect(float f) {
        m2145uz();
        AlphaBiLevel alphaBiLevel = new AlphaBiLevel(f, this);
        m1760x1().m69699k4(alphaBiLevel);
        ((ImageTransformOperation) alphaBiLevel).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.12
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaBiLevel;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaCeiling addAlphaCeilingEffect() {
        m2145uz();
        AlphaCeiling alphaCeiling = new AlphaCeiling(this);
        m1760x1().m69699k4(alphaCeiling);
        ((ImageTransformOperation) alphaCeiling).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.15
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaCeiling;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaFloor addAlphaFloorEffect() {
        m2145uz();
        AlphaFloor alphaFloor = new AlphaFloor(this);
        m1760x1().m69699k4(alphaFloor);
        ((ImageTransformOperation) alphaFloor).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.16
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaFloor;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaInverse addAlphaInverseEffect() {
        m2145uz();
        AlphaInverse alphaInverse = new AlphaInverse(this);
        m1760x1().m69699k4(alphaInverse);
        ((ImageTransformOperation) alphaInverse).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.17
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaInverse;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaModulate addAlphaModulateEffect() {
        m2145uz();
        AlphaModulate alphaModulate = new AlphaModulate(this);
        m1760x1().m69699k4(alphaModulate);
        ((ImageTransformOperation) alphaModulate).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.18
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaModulate;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaModulateFixed addAlphaModulateFixedEffect(float f) {
        m2145uz();
        AlphaModulateFixed alphaModulateFixed = new AlphaModulateFixed(f, this);
        m1760x1().m69699k4(alphaModulateFixed);
        ((ImageTransformOperation) alphaModulateFixed).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.19
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaModulateFixed;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IAlphaReplace addAlphaReplaceEffect(float f) {
        m2145uz();
        AlphaReplace alphaReplace = new AlphaReplace(f, this);
        m1760x1().m69699k4(alphaReplace);
        ((ImageTransformOperation) alphaReplace).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.20
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return alphaReplace;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IBiLevel addBiLevelEffect(float f) {
        m2145uz();
        BiLevel biLevel = new BiLevel(f, this);
        m1760x1().m69699k4(biLevel);
        ((ImageTransformOperation) biLevel).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.21
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return biLevel;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IBlur addBlurEffect(double d, boolean z) {
        m2145uz();
        Blur blur = new Blur(d, z, this);
        m1760x1().m69699k4(blur);
        ((ImageTransformOperation) blur).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return blur;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IColorChange addColorChangeEffect() {
        m2145uz();
        ColorChange colorChange = new ColorChange(this);
        m1760x1().m69699k4(colorChange);
        ((ImageTransformOperation) colorChange).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return colorChange;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IColorReplace addColorReplaceEffect() {
        m2145uz();
        ColorReplace colorReplace = new ColorReplace(this);
        m1760x1().m69699k4(colorReplace);
        ((ImageTransformOperation) colorReplace).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return colorReplace;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IDuotone addDuotoneEffect() {
        m2145uz();
        Duotone duotone = new Duotone(this);
        m1760x1().m69699k4(duotone);
        ((ImageTransformOperation) duotone).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return duotone;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IFillOverlay addFillOverlayEffect() {
        m2145uz();
        FillOverlay fillOverlay = new FillOverlay(this);
        m1760x1().m69699k4(fillOverlay);
        ((ImageTransformOperation) fillOverlay).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.6
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return fillOverlay;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IGrayScale addGrayScaleEffect() {
        m2145uz();
        GrayScale grayScale = new GrayScale(this);
        m1760x1().m69699k4(grayScale);
        ((ImageTransformOperation) grayScale).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.7
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return grayScale;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IHSL addHSLEffect(float f, float f2, float f3) {
        m2145uz();
        HSL hsl = new HSL(f, f2, f3, this);
        m1760x1().m69699k4(hsl);
        ((ImageTransformOperation) hsl).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.8
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return hsl;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(IImageTransformOperation iImageTransformOperation) {
        m1757k4(iImageTransformOperation);
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final ILuminance addLuminanceEffect(float f, float f2) {
        m2145uz();
        Luminance luminance = new Luminance(f, f2, this);
        m1760x1().m69699k4(luminance);
        ((ImageTransformOperation) luminance).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.9
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return luminance;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final ITint addTintEffect(float f, float f2) {
        m2145uz();
        Tint tint = new Tint(f, f2, this);
        m1760x1().m69699k4(tint);
        ((ImageTransformOperation) tint).f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.10
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1754to();
        return tint;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        if (m2138ix()) {
            List.Enumerator<IImageTransformOperation> it = this.f2495kk.iterator();
            while (it.hasNext()) {
                try {
                    ((ImageTransformOperation) it.next()).f2489k4.mo27429k4(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.13
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
                        }

                        @Override // com.aspose.slides.smn
                        /* JADX INFO: renamed from: k4 */
                        public void mo1394k4() {
                            ImageTransformOperationCollection.this.m1754to();
                        }
                    });
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            m1760x1().m69697k4();
            m1754to();
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean containsItem(IImageTransformOperation iImageTransformOperation) {
        return m1761x1(iImageTransformOperation);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void copyToTArray(IImageTransformOperation[] iImageTransformOperationArr, int i) {
        m1758k4(iImageTransformOperationArr, i);
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1760x1().m69700x1();
        }
        return 1L;
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final IImageTransformOperation get_Item(int i) {
        m2146wl();
        return this.f2495kk.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        m2146wl();
        return this.f2495kk.isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IImageTransformOperation> iterator() {
        m2146wl();
        return this.f2495kk.iterator();
    }

    public final IGenericEnumerator<IImageTransformOperation> iteratorJava() {
        m2146wl();
        return this.f2495kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m1755k4(IBaseSlide iBaseSlide, C12009k4 c12009k4) {
        if (!m2138ix()) {
            tc4 tc4VarM71076k4 = tc4.m71076k4(c12009k4);
            c12009k4.dispose();
            return tc4VarM71076k4.m71080c5();
        }
        tc4 tc4VarM71076k42 = tc4.m71076k4(c12009k4);
        c12009k4.dispose();
        List.Enumerator<IImageTransformOperation> it = this.f2495kk.iterator();
        while (it.hasNext()) {
            try {
                tc4VarM71076k42 = ((ImageTransformOperation) it.next()).mo234k4(tc4VarM71076k42, iBaseSlide);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return tc4VarM71076k42.m71080c5();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m1759kk(IImageTransformOperation iImageTransformOperation) {
        if (!m2138ix()) {
            return false;
        }
        ((ImageTransformOperation) iImageTransformOperation).f2489k4.mo27429k4(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.14
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        return m1760x1().m69701x1(iImageTransformOperation);
    }

    @Override // com.aspose.slides.IImageTransformOperationCollection
    public final void removeAt(int i) {
        if (!m2138ix()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        m1760x1().m69698k4(i);
        m1754to();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(IImageTransformOperation iImageTransformOperation) {
        return m1759kk(iImageTransformOperation);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        m2146wl();
        return this.f2495kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final qmc m1760x1() {
        return (qmc) m2144u4();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1761x1(IImageTransformOperation iImageTransformOperation) {
        m2146wl();
        return this.f2495kk.containsItem(iImageTransformOperation);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m1756k4(IBaseSlide iBaseSlide, C14321pz c14321pz) {
        if (!m2138ix()) {
            return new C6765kp().toString();
        }
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<IImageTransformOperation> it = this.f2495kk.iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(((ImageTransformOperation) it.next()).mo236k4(iBaseSlide, c14321pz));
                c6765kp.m26780k4(';');
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1757k4(IImageTransformOperation iImageTransformOperation) {
        m2145uz();
        ImageTransformOperation imageTransformOperationMo241kk = (ImageTransformOperation) iImageTransformOperation;
        if (imageTransformOperationMo241kk.getParent_IPresentationComponent() != null) {
            imageTransformOperationMo241kk = imageTransformOperationMo241kk.mo241kk();
        }
        imageTransformOperationMo241kk.mo240k4((InterfaceC14397rj) this);
        imageTransformOperationMo241kk.f2489k4.mo27432x1(new smn() { // from class: com.aspose.slides.ImageTransformOperationCollection.11
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Effects.ImageTransformOperationCollection.OnImageTransformOperationCollectionChanged()";
            }

            @Override // com.aspose.slides.smn
            /* JADX INFO: renamed from: k4 */
            public void mo1394k4() {
                ImageTransformOperationCollection.this.m1754to();
            }
        });
        m1760x1().m69699k4(imageTransformOperationMo241kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1758k4(IImageTransformOperation[] iImageTransformOperationArr, int i) {
        m2146wl();
        this.f2495kk.copyToTArray(iImageTransformOperationArr, i);
    }
}
