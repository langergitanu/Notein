package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class pnx implements InterfaceC13826ma {

    /* JADX INFO: renamed from: k4 */
    private final List<InterfaceC14740wj> f48115k4 = new List<>();

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f48115k4.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<InterfaceC14740wj> iterator() {
        return this.f48115k4.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final InterfaceC14740wj get_Item(int i) {
        return this.f48115k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(InterfaceC14740wj interfaceC14740wj) {
        return this.f48115k4.removeItem(interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        this.f48115k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f48115k4.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public final int indexOfItem(InterfaceC14740wj interfaceC14740wj) {
        return this.f48115k4.indexOf(interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final void insertItem(int i, InterfaceC14740wj interfaceC14740wj) {
        this.f48115k4.insertItem(i, interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void set_Item(int i, InterfaceC14740wj interfaceC14740wj) {
        this.f48115k4.set_Item(i, interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(InterfaceC14740wj interfaceC14740wj) {
        return this.f48115k4.containsItem(interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(InterfaceC14740wj interfaceC14740wj) {
        this.f48115k4.addItem(interfaceC14740wj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(InterfaceC14740wj[] interfaceC14740wjArr, int i) {
        this.f48115k4.copyToTArray(interfaceC14740wjArr, i);
    }
}
