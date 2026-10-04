package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class TabCollection implements ITabCollection, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    SortedList<Double, ITab> f3488k4 = new SortedList<>();

    /* JADX INFO: renamed from: kk */
    private InterfaceC14397rj f3489kk;

    /* JADX INFO: renamed from: x1 */
    long f3490x1;

    public TabCollection(InterfaceC14397rj interfaceC14397rj) {
        this.f3489kk = interfaceC14397rj;
    }

    @Override // com.aspose.slides.ITabCollection
    public final int add(ITab iTab) {
        if (((InterfaceC14397rj) iTab).getParent_Immediate() != null) {
            throw new PptxEditException("Can't add already used tab");
        }
        ((Tab) iTab).m2860k4(this);
        if (!this.f3488k4.containsKey(Double.valueOf(iTab.getPosition())) || ((Tab) this.f3488k4.get_Item(Double.valueOf(iTab.getPosition()))).getAlignment() == 0) {
            this.f3488k4.set_Item(Double.valueOf(iTab.getPosition()), iTab);
        }
        m2862k4();
        return this.f3488k4.indexOfKey(Double.valueOf(iTab.getPosition()));
    }

    @Override // com.aspose.slides.ITabCollection
    public final void clear() {
        IGenericEnumerator<ITab> it = this.f3488k4.getValues().iterator();
        while (it.hasNext()) {
            try {
                ((Tab) it.next()).m2860k4((TabCollection) null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f3488k4.clear();
        m2862k4();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        ((ICollection) this.f3488k4.getValues()).copyTo(abstractC14092to, i);
    }

    public boolean equals(Object obj) {
        TabCollection tabCollection = (TabCollection) C7019kk.m27452k4(obj, TabCollection.class);
        if (tabCollection == null) {
            return super.equals(obj);
        }
        int size = size();
        if (size != tabCollection.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            ITab iTab = this.f3488k4.getValues().get_Item(i);
            ITab iTab2 = tabCollection.f3488k4.getValues().get_Item(i);
            if (iTab.getPosition() != iTab2.getPosition() || iTab.getAlignment() != iTab2.getAlignment()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3489kk;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ITabCollection
    public final ITab get_Item(int i) {
        return this.f3488k4.getValues().get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<ITab> iterator() {
        return this.f3488k4.getValues().iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<ITab> iteratorJava() {
        return this.f3488k4.iteratorJavaValues();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2862k4() {
        this.f3490x1++;
        if (C7019kk.m27469x1(this.f3489kk, PVIObject.class)) {
            ((PVIObject) this.f3489kk).m2145uz();
        }
    }

    @Override // com.aspose.slides.ITabCollection
    public final void removeAt(int i) {
        ((Tab) this.f3488k4.getValues().get_Item(i)).m2860k4((TabCollection) null);
        this.f3488k4.removeAt(i);
        m2862k4();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f3488k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m2865x1() {
        return this.f3490x1;
    }

    @Override // com.aspose.slides.ITabCollection
    public final ITab add(double d, int i) {
        Tab tab = new Tab(d, i);
        add(tab);
        return tab;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2863k4(double d) {
        int iIndexOfKey = this.f3488k4.indexOfKey(Double.valueOf(d));
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2864k4(TabCollection tabCollection) {
        clear();
        int size = tabCollection.size();
        for (int i = 0; i < size; i++) {
            ITab iTab = tabCollection.f3488k4.getValues().get_Item(i);
            add(new Tab(iTab.getPosition(), iTab.getAlignment()));
        }
    }
}
