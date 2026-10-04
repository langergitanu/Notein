package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ColorOperationCollection implements IColorOperationCollection {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<AbstractC13772ld> f1970k4 = new AbstractC7018k4<AbstractC13772ld>() { // from class: com.aspose.slides.ColorOperationCollection.1
        {
            ColorOperationCollection.this.f1973x1 = new AbstractC13772ld() { // from class: com.aspose.slides.ColorOperationCollection.1.1
                @Override // com.aspose.slides.AbstractC13772ld
                /* JADX INFO: renamed from: k4 */
                public void mo1099k4() {
                    for (AbstractC13772ld abstractC13772ld : ((AbstractC7018k4) C03141.this).f19081x1) {
                        if (abstractC13772ld != null) {
                            abstractC13772ld.mo1099k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: kk */
    private final List<IColorOperation> f1971kk = new List<>();

    /* JADX INFO: renamed from: to */
    private long f1972to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13772ld f1973x1;

    /* JADX INFO: renamed from: x1 */
    private void m1116x1() {
        this.f1972to++;
        AbstractC13772ld abstractC13772ld = this.f1973x1;
        if (abstractC13772ld == null || this.f1970k4.m27430k4()) {
            return;
        }
        abstractC13772ld.mo1099k4();
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final IColorOperation add(int i) {
        return add(i, 0.0f);
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final void clear() {
        if (this.f1971kk.size() == 0) {
            return;
        }
        this.f1971kk.clear();
        m1116x1();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.aspose.slides.IGenericCloneable
    public final IColorOperationCollection cloneT() {
        ColorOperationCollection colorOperationCollection = new ColorOperationCollection();
        colorOperationCollection.m1118k4(this, true);
        return colorOperationCollection;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1971kk.copyTo(abstractC14092to, i);
    }

    public final Object deepClone() {
        return cloneT();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final IColorOperation get_Item(int i) {
        return this.f1971kk.get_Item(i);
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final IColorOperation insert(int i, int i2) {
        return insert(i, i2, 0.0f);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IColorOperation> iterator() {
        return this.f1971kk.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IColorOperation> iteratorJava() {
        return this.f1971kk.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m1117k4() {
        return this.f1972to;
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final void removeAt(int i) {
        this.f1971kk.removeAt(i);
        m1116x1();
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final void set_Item(int i, IColorOperation iColorOperation) {
        this.f1971kk.set_Item(i, iColorOperation);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1971kk.size();
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final IColorOperation add(int i, float f) {
        ColorOperation colorOperation = new ColorOperation(i, f);
        this.f1971kk.addItem(colorOperation);
        m1116x1();
        return colorOperation;
    }

    @Override // com.aspose.slides.IColorOperationCollection
    public final IColorOperation insert(int i, int i2, float f) {
        ColorOperation colorOperation = new ColorOperation(i2, f);
        this.f1971kk.insertItem(i, colorOperation);
        m1116x1();
        return colorOperation;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1118k4(ColorOperationCollection colorOperationCollection, boolean z) {
        if (this.f1971kk.size() == 0 && colorOperationCollection.f1971kk.size() == 0) {
            return;
        }
        this.f1971kk.clear();
        if (z) {
            List.Enumerator<IColorOperation> it = colorOperationCollection.f1971kk.iterator();
            while (it.hasNext()) {
                try {
                    ColorOperation colorOperation = (ColorOperation) it.next();
                    this.f1971kk.addItem(new ColorOperation(colorOperation.getOperationType(), colorOperation.getParameter()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            this.f1971kk.addRange(colorOperationCollection.f1971kk);
        }
        m1116x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1119k4(C14321pz c14321pz) {
        for (int i = 0; i < this.f1971kk.size(); i++) {
            ((ColorOperation) this.f1971kk.get_Item(i)).m1113k4(c14321pz);
        }
    }
}
