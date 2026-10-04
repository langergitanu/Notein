package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3057he;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CellCollection implements ICellCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    static C3057he.k4 f1267k4 = new C3057he.k4() { // from class: com.aspose.slides.CellCollection.1
        @Override // com.aspose.slides.internal.p077d8.C3057he.k4
        /* JADX INFO: renamed from: k4 */
        public boolean mo490k4(Object obj, Object obj2) {
            return CellCollection.m482k4(obj, obj2);
        }
    };

    /* JADX INFO: renamed from: kk */
    private final InterfaceC14397rj f1268kk;

    /* JADX INFO: renamed from: x1 */
    private C14290pk f1269x1 = new C14290pk();

    public CellCollection(InterfaceC14397rj interfaceC14397rj) {
        this.f1268kk = interfaceC14397rj;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m482k4(Object obj, Object obj2) {
        return !((Cell) obj).m463dy();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        mo486k4(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final C14290pk m483du() {
        return this.f1269x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1268kk;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return mo485k4().getPresentation();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return mo485k4().getSlide();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ICellCollection
    public final ICell get_Item(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfRangeException(C14113y2.m67402k4("value of index = {0} is out of range 0..{1}", Integer.valueOf(i), Integer.valueOf(size())));
        }
        return mo484k4(i).m462du();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ICell> iterator() {
        return mo487kk();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ICell> iteratorJava() {
        return mo488to();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract Cell mo484k4(int i);

    /* JADX INFO: renamed from: k4 */
    public abstract Table mo485k4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo486k4(AbstractC14092to abstractC14092to, int i);

    /* JADX INFO: renamed from: kk */
    public abstract IGenericEnumerator<ICell> mo487kk();

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return mo489x1();
    }

    /* JADX INFO: renamed from: to */
    public abstract IGenericEnumerator<ICell> mo488to();

    /* JADX INFO: renamed from: x1 */
    public abstract int mo489x1();
}
