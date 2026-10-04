package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public class PointCollection implements IPointCollection {

    /* JADX INFO: renamed from: k4 */
    private List<IPoint> f3045k4 = new List<>();

    @Override // com.aspose.slides.IPointCollection
    public final int getCount() {
        return this.f3045k4.size();
    }

    @Override // com.aspose.slides.IPointCollection
    public final IPoint get_Item(int i) {
        return this.f3045k4.get_Item(i);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IPoint> iterator() {
        return this.f3045k4.iterator();
    }

    public final IGenericEnumerator<IPoint> iteratorJava() {
        return this.f3045k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2275k4(IPoint iPoint) {
        this.f3045k4.addItem(iPoint);
    }
}
