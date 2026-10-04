package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public class EffectStyle extends DomObject<EffectStyleCollection> implements IEffectStyle {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC1249ie> f2178k4;

    /* JADX INFO: renamed from: kk */
    private final EffectFormat f2179kk;

    /* JADX INFO: renamed from: to */
    private final ThreeDFormat f2180to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1249ie f2181x1;

    public EffectStyle(EffectStyleCollection effectStyleCollection) {
        super(effectStyleCollection);
        this.f2178k4 = new AbstractC7018k4<AbstractC1249ie>() { // from class: com.aspose.slides.EffectStyle.1
            {
                EffectStyle.this.f2181x1 = new AbstractC1249ie() { // from class: com.aspose.slides.EffectStyle.1.1
                    @Override // com.aspose.slides.AbstractC1249ie
                    /* JADX INFO: renamed from: k4 */
                    public void mo1403k4() {
                        for (AbstractC1249ie abstractC1249ie : ((AbstractC7018k4) C03741.this).f19081x1) {
                            if (abstractC1249ie != null) {
                                abstractC1249ie.mo1403k4();
                            }
                        }
                    }
                };
            }
        };
        EffectFormat effectFormat = new EffectFormat(this);
        this.f2179kk = effectFormat;
        ThreeDFormat threeDFormat = new ThreeDFormat(this);
        this.f2180to = threeDFormat;
        effectFormat.f2149k4.mo27432x1(new AbstractC14380ra() { // from class: com.aspose.slides.EffectStyle.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.EffectStyle.OnEffectStyleChanged()";
            }

            @Override // com.aspose.slides.AbstractC14380ra
            /* JADX INFO: renamed from: k4 */
            public void mo1393k4() {
                EffectStyle.this.m1397x1();
            }
        });
        threeDFormat.f3566k4.mo27432x1(new tat() { // from class: com.aspose.slides.EffectStyle.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Theme.EffectStyle.OnEffectStyleChanged()";
            }

            @Override // com.aspose.slides.tat
            /* JADX INFO: renamed from: k4 */
            public void mo1404k4() {
                EffectStyle.this.m1397x1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m1397x1() {
        AbstractC1249ie abstractC1249ie = this.f2181x1;
        if (abstractC1249ie == null || this.f2178k4.m27430k4()) {
            return;
        }
        abstractC1249ie.mo1403k4();
    }

    @Override // com.aspose.slides.IEffectStyle
    public final IEffectFormat getEffectFormat() {
        return this.f2179kk;
    }

    @Override // com.aspose.slides.IEffectStyle
    public final IThreeDFormat getThreeDFormat() {
        return this.f2180to;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m1399k4() {
        return ((this.f2179kk.getVersion() & 4294967295L) + (this.f2180to.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1400k4(EffectStyle effectStyle) {
        this.f2179kk.m1387k4((IEffectFormat) effectStyle.f2179kk);
        this.f2180to.m3007k4((IThreeDFormat) effectStyle.f2180to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1401k4(IEffectStyleEffectiveData iEffectStyleEffectiveData) {
        this.f2179kk.m1388k4(iEffectStyleEffectiveData.getEffectFormat());
        this.f2180to.m3008k4(iEffectStyleEffectiveData.getThreeDFormat());
    }
}
