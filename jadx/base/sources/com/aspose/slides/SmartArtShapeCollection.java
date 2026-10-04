package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class SmartArtShapeCollection implements ISmartArtShapeCollection {

    /* JADX INFO: renamed from: k4 */
    private List<ISmartArtShape> f3446k4 = new List<>();

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3446k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ISmartArtShapeCollection
    public final ISmartArtShape get_Item(int i) {
        return this.f3446k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ISmartArtShape> iterator() {
        return this.f3446k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ISmartArtShape> iteratorJava() {
        return this.f3446k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2823k4(ISmartArtShape iSmartArtShape) {
        this.f3446k4.addItem(iSmartArtShape);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3446k4.size();
    }
}
