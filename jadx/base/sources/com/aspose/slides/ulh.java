package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class ulh implements IMathElementCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IMathElement> f49350k4;

    public ulh() {
        this.f49350k4 = new List<>();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void add(IMathElement iMathElement) {
        this.f49350k4.addItem(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void clear() {
        this.f49350k4.clear();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final boolean contains(IMathElement iMathElement) {
        return this.f49350k4.containsItem(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void copyTo(IMathElement[] iMathElementArr, int i) {
        this.f49350k4.copyToTArray(iMathElementArr, i);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final int getCount() {
        return this.f49350k4.size();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final IMathElement get_Item(int i) {
        return this.f49350k4.get_Item(i);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final int indexOf(IMathElement iMathElement) {
        return this.f49350k4.indexOf(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void insert(int i, IMathElement iMathElement) {
        this.f49350k4.insertItem(i, iMathElement);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IMathElement> iterator() {
        return this.f49350k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerator<IMathElement> m71730k4() {
        return this.f49350k4.iteratorJava();
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final boolean remove(IMathElement iMathElement) {
        return this.f49350k4.removeItem(iMathElement);
    }

    @Override // com.aspose.slides.IMathElementCollection
    public final void removeAt(int i) {
        this.f49350k4.removeAt(i);
    }

    public ulh(int i) {
        this.f49350k4 = new List<>(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71731k4(int i, IMathElement iMathElement) {
        this.f49350k4.set_Item(i, iMathElement);
    }

    public ulh(IGenericEnumerable<IMathElement> iGenericEnumerable) {
        this.f49350k4 = new List<>(iGenericEnumerable);
    }
}
