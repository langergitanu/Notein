package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public final class SectionSlideCollection extends DomObject<Section> implements ISectionSlideCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<ISlide> f3286k4;

    public SectionSlideCollection(Section section) {
        super(section);
        this.f3286k4 = new List<>();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3286k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISectionSlideCollection
    public final ISlide get_Item(int i) {
        return this.f3286k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISlide> iterator() {
        return this.f3286k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISlide> iteratorJava() {
        return this.f3286k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2523k4(ISlide iSlide) {
        return this.f3286k4.containsItem(iSlide);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3286k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2524x1(ISlide iSlide) {
        this.f3286k4.addItem(iSlide);
    }
}
