package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class GlobalLayoutSlideCollection extends LayoutSlideCollection implements IGlobalLayoutSlideCollection {
    public GlobalLayoutSlideCollection(Presentation presentation) {
        super(presentation);
    }

    @Override // com.aspose.slides.IGlobalLayoutSlideCollection
    public final ILayoutSlide add(IMasterSlide iMasterSlide, byte b, String str) {
        IGenericEnumerator<ILayoutSlide> it;
        if (iMasterSlide == null) {
            throw new ArgumentNullException("master");
        }
        if (iMasterSlide.getPresentation() != m1850k4()) {
            throw new ArgumentException("Master slide must be from the same presentation.");
        }
        LayoutSlide layoutSlideM72529k4 = vtn.m72529k4(iMasterSlide, b);
        if (str != null) {
            IMasterSlide masterSlide = layoutSlideM72529k4.getMasterSlide();
            List list = new List();
            it = masterSlide.getLayoutSlides().iterator();
            while (it.hasNext()) {
                try {
                    ILayoutSlide next = it.next();
                    if (next != layoutSlideM72529k4) {
                        list.addItem(next.getName());
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (list.containsItem(str)) {
                throw new ArgumentException(C14113y2.m67408k4("The layout name \"", str, "\" is already in use. Please modify the name."));
            }
            layoutSlideM72529k4.setName(str);
            return layoutSlideM72529k4;
        }
        IMasterSlide masterSlide2 = layoutSlideM72529k4.getMasterSlide();
        List list2 = new List();
        it = masterSlide2.getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ILayoutSlide next2 = it.next();
                if (next2 != layoutSlideM72529k4) {
                    list2.addItem(next2.getName());
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
        String name = layoutSlideM72529k4.getName();
        int i = 1;
        while (list2.containsItem(layoutSlideM72529k4.getName())) {
            layoutSlideM72529k4.setName(C14113y2.m67408k4(C14057f9.m66591x1(i), C18115b5.CONNECTOR, name));
            i++;
        }
        return layoutSlideM72529k4;
    }

    @Override // com.aspose.slides.IGlobalLayoutSlideCollection
    public final ILayoutSlide addClone(ILayoutSlide iLayoutSlide) {
        ILayoutSlide iLayoutSlideM70604k4;
        LayoutSlide layoutSlide = (LayoutSlide) iLayoutSlide;
        synchronized (m1850k4()) {
            try {
                iLayoutSlideM70604k4 = layoutSlide.getPresentation() == m1850k4() ? sfn.m70604k4(layoutSlide.getMasterSlide(), layoutSlide) : addClone(layoutSlide, ((MasterSlideCollection) m1850k4().getMasters()).m1947k4(layoutSlide.getMasterSlide(), false));
            } catch (Throwable th) {
                throw th;
            }
        }
        return iLayoutSlideM70604k4;
    }

    @Override // com.aspose.slides.IGlobalLayoutSlideCollection
    public final ILayoutSlide addClone(ILayoutSlide iLayoutSlide, IMasterSlide iMasterSlide) {
        LayoutSlide layoutSlide = (LayoutSlide) iLayoutSlide;
        if (iMasterSlide.getPresentation() != m1850k4()) {
            throw new PptxEditException("Master must belong to the target presentation.");
        }
        if (layoutSlide.getPresentation() == m1850k4()) {
            return (LayoutSlide) sfn.m70604k4(iMasterSlide, layoutSlide);
        }
        LayoutSlide layoutSlide2 = (LayoutSlide) sfn.m70604k4(iMasterSlide, layoutSlide);
        layoutSlide2.m396k4(layoutSlide.getPresentation().getDefaultTextStyle());
        layoutSlide2.m392k4(((SlideSize) ((Presentation) this.f2585x1).getSlideSize()).m2755k4().m56699x1() / ((SlideSize) iLayoutSlide.getPresentation().getSlideSize()).m2755k4().m56699x1(), ((SlideSize) ((Presentation) this.f2585x1).getSlideSize()).m2755k4().m56697kk() / ((SlideSize) iLayoutSlide.getPresentation().getSlideSize()).m2755k4().m56697kk());
        return layoutSlide2;
    }
}
