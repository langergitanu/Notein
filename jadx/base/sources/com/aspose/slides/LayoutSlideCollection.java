package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class LayoutSlideCollection implements ILayoutSlideCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    List<ILayoutSlide> f2583k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private IPresentationComponent f2584kk;

    /* JADX INFO: renamed from: x1 */
    InterfaceC14397rj f2585x1;

    public LayoutSlideCollection(InterfaceC14397rj interfaceC14397rj) {
        this.f2585x1 = interfaceC14397rj;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2583k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.ILayoutSlideCollection
    public final ILayoutSlide getByType(byte b) {
        int size = this.f2583k4.size();
        for (int i = 0; i < size; i++) {
            if (get_Item(i).getLayoutType() == b) {
                return get_Item(i);
            }
        }
        return null;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2585x1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ILayoutSlideCollection
    public final ILayoutSlide get_Item(int i) {
        return this.f2583k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ILayoutSlide> iterator() {
        return this.f2583k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ILayoutSlide> iteratorJava() {
        return this.f2583k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final Presentation m1850k4() {
        return (Presentation) m1852kk().getPresentation();
    }

    /* JADX INFO: renamed from: kk */
    public final IPresentationComponent m1852kk() {
        IPresentationComponent iPresentationComponent = this.f2584kk;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2585x1, iPresentationComponentArr);
            this.f2584kk = iPresentationComponentArr[0];
        }
        return this.f2584kk;
    }

    @Override // com.aspose.slides.ILayoutSlideCollection
    public final void remove(ILayoutSlide iLayoutSlide) {
        if (this.f2583k4.containsItem(iLayoutSlide)) {
            iLayoutSlide.remove();
        }
    }

    @Override // com.aspose.slides.ILayoutSlideCollection
    public final void removeUnused() {
        synchronized (this.f2583k4.getSyncRoot()) {
            int i = 0;
            while (i < this.f2583k4.size()) {
                try {
                    ILayoutSlide iLayoutSlide = this.f2583k4.get_Item(i);
                    if (iLayoutSlide.hasDependingSlides()) {
                        i++;
                    } else {
                        iLayoutSlide.remove();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2583k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public void m1853x1() {
        this.f2583k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo1851k4(ILayoutSlide iLayoutSlide) {
        this.f2583k4.addItem(iLayoutSlide);
    }
}
