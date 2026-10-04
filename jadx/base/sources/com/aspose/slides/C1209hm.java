package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.hm */
/* JADX INFO: loaded from: classes3.dex */
class C1209hm {

    /* JADX INFO: renamed from: k4 */
    private vkw f5532k4;

    /* JADX INFO: renamed from: kk */
    private LoadOptions f5533kk;

    /* JADX INFO: renamed from: x1 */
    private List<vkw> f5534x1 = new List<>();

    public C1209hm() {
        m7224k4(new LoadOptions());
        this.f5532k4 = new vkw(this);
    }

    /* JADX INFO: renamed from: kk */
    private List<vkw> m7221kk() {
        return this.f5534x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final IMasterSlide m7222k4(IMasterSlide iMasterSlide) {
        if (this.f5532k4.m72346k4().size() == 0) {
            return null;
        }
        IMasterSlide iMasterSlideAddClone = iMasterSlide.getPresentation().getMasters().addClone(this.f5532k4.m72346k4().get_Item(0));
        for (ISlide iSlide : iMasterSlide.getDependingSlides()) {
            ILayoutSlide byType = iMasterSlideAddClone.getLayoutSlides().getByType(iSlide.getLayoutSlide().getLayoutType());
            if (byType != null) {
                iSlide.setLayoutSlide(byType);
            } else {
                iSlide.getLayoutSlide().setMasterSlide(iMasterSlideAddClone);
            }
        }
        IGenericEnumerator<IShape> it = iMasterSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (shape.getPlaceholder() == null && shape.mo272to().m69036ar()) {
                    iMasterSlideAddClone.getShapes().addClone(shape);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ILayoutSlide> it2 = iMasterSlideAddClone.getLayoutSlides().iterator();
        while (it2.hasNext()) {
            try {
                ILayoutSlide next = it2.next();
                ILayoutSlide byType2 = iMasterSlide.getLayoutSlides().getByType(next.getLayoutType());
                if (byType2 != null) {
                    it = byType2.getShapes().iterator();
                    while (it.hasNext()) {
                        try {
                            Shape shape2 = (Shape) it.next();
                            if (shape2.getPlaceholder() == null && shape2.mo272to().m69036ar()) {
                                next.getShapes().addClone(shape2);
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        return iMasterSlideAddClone;
    }

    /* JADX INFO: renamed from: x1 */
    public final vkw m7225x1() {
        vkw vkwVar = new vkw(this);
        m7221kk().addItem(vkwVar);
        return vkwVar;
    }

    public C1209hm(String str, LoadOptions loadOptions) {
        m7224k4(loadOptions);
        this.f5532k4 = new vkw(str, loadOptions, this);
    }

    /* JADX INFO: renamed from: k4 */
    public final LoadOptions m7223k4() {
        return this.f5533kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7224k4(LoadOptions loadOptions) {
        this.f5533kk = loadOptions;
    }
}
