package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterLayoutSlideCollection extends LayoutSlideCollection implements IMasterLayoutSlideCollection {
    public MasterLayoutSlideCollection(MasterSlide masterSlide) {
        super(masterSlide);
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final ILayoutSlide add(byte b, String str) {
        return m1850k4().getLayoutSlides().add((IMasterSlide) this.f2585x1, b, str);
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final ILayoutSlide addClone(ILayoutSlide iLayoutSlide) {
        return m1850k4().getLayoutSlides().addClone(iLayoutSlide, (IMasterSlide) this.f2585x1);
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final ILayoutSlide insert(int i, byte b, String str) {
        ILayoutSlide iLayoutSlideAdd = add(b, str);
        reorder(i, iLayoutSlideAdd);
        return iLayoutSlideAdd;
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final ILayoutSlide insertClone(int i, ILayoutSlide iLayoutSlide) {
        ILayoutSlide iLayoutSlideAddClone = addClone(iLayoutSlide);
        reorder(i, iLayoutSlideAddClone);
        return iLayoutSlideAddClone;
    }

    @Override // com.aspose.slides.LayoutSlideCollection
    /* JADX INFO: renamed from: k4 */
    public void mo1851k4(ILayoutSlide iLayoutSlide) {
        super.mo1851k4(iLayoutSlide);
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final void removeAt(int i) {
        this.f2583k4.get_Item(i).remove();
    }

    @Override // com.aspose.slides.IMasterLayoutSlideCollection
    public final void reorder(int i, ILayoutSlide iLayoutSlide) {
        if (i < 0 || i >= size()) {
            throw new PptxEditException("Index must lay within [0..Count-1] range.");
        }
        if (iLayoutSlide.getPresentation() != m1850k4()) {
            throw new PptxEditException("Trying to move layout from other presentation.");
        }
        if (iLayoutSlide.getMasterSlide() != ((IMasterSlide) this.f2585x1)) {
            throw new PptxEditException("Trying to move layout from other collection.");
        }
        int iIndexOf = this.f2583k4.indexOf(iLayoutSlide);
        if (i == iIndexOf) {
            return;
        }
        synchronized (this.f2583k4.getSyncRoot()) {
            try {
                if (i < iIndexOf) {
                    while (iIndexOf > i) {
                        List<ILayoutSlide> list = this.f2583k4;
                        list.set_Item(iIndexOf, list.get_Item(iIndexOf - 1));
                        iIndexOf--;
                    }
                } else {
                    while (iIndexOf < i) {
                        List<ILayoutSlide> list2 = this.f2583k4;
                        int i2 = iIndexOf + 1;
                        list2.set_Item(iIndexOf, list2.get_Item(i2));
                        iIndexOf = i2;
                    }
                }
                this.f2583k4.set_Item(i, iLayoutSlide);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
