package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class GradientStopCollectionEffectiveData implements IGradientStopCollectionEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    private List<IGradientStopEffectiveData> f2424k4 = new List<>();

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f2424k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IGradientStopCollectionEffectiveData
    public final IGradientStopEffectiveData get_Item(int i) {
        return this.f2424k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IGradientStopEffectiveData> iterator() {
        return this.f2424k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IGradientStopEffectiveData> iteratorJava() {
        return this.f2424k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1631k4() {
        this.f2424k4.clear();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f2424k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1632k4(float f, ColorFormat colorFormat) {
        this.f2424k4.addItem(new GradientStopEffectiveData(f, colorFormat));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1633k4(GradientStopEffectiveData gradientStopEffectiveData) {
        this.f2424k4.addItem(new GradientStopEffectiveData(gradientStopEffectiveData));
    }
}
