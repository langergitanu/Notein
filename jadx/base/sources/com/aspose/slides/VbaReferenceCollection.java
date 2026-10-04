package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class VbaReferenceCollection implements IVbaReferenceCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IVbaReference> f3650k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private final VbaProject f3651x1;

    public VbaReferenceCollection(VbaProject vbaProject) {
        this.f3651x1 = vbaProject;
    }

    @Override // com.aspose.slides.IVbaReferenceCollection
    public final void add(IVbaReference iVbaReference) {
        this.f3651x1.m3052k4(iVbaReference);
        this.f3650k4.addItem(iVbaReference);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f3650k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IVbaReferenceCollection
    public final IVbaReference get_Item(int i) {
        return this.f3650k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IVbaReference> iterator() {
        return this.f3650k4.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IVbaReference> iteratorJava() {
        return this.f3650k4.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<IVbaReference> m3056k4() {
        return this.f3650k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3650k4.size();
    }
}
