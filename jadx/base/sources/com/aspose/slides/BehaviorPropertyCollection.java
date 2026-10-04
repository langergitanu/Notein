package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public class BehaviorPropertyCollection implements IBehaviorPropertyCollection {

    /* JADX INFO: renamed from: k4 */
    private final List<IBehaviorProperty> f1223k4 = new List<>();

    public final void add(IBehaviorProperty iBehaviorProperty) {
        this.f1223k4.addItem(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(IBehaviorProperty iBehaviorProperty) {
        this.f1223k4.addItem(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f1223k4.clear();
    }

    public final boolean contains(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.containsItem(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.containsItem(iBehaviorProperty);
    }

    public final void copyTo(IBehaviorProperty[] iBehaviorPropertyArr, int i) {
        this.f1223k4.copyToTArray(iBehaviorPropertyArr, i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(IBehaviorProperty[] iBehaviorPropertyArr, int i) {
        this.f1223k4.copyToTArray(iBehaviorPropertyArr, i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final IBehaviorProperty get_Item(int i) {
        return this.f1223k4.get_Item(i);
    }

    public final int indexOf(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.indexOf(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public int indexOfItem(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.indexOfItem(iBehaviorProperty);
    }

    public final void insert(int i, IBehaviorProperty iBehaviorProperty) {
        this.f1223k4.insertItem(i, iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void insertItem(int i, IBehaviorProperty iBehaviorProperty) {
        this.f1223k4.insertItem(i, iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return this.f1223k4.isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IBehaviorProperty> iterator() {
        return this.f1223k4.iterator();
    }

    public final IGenericEnumerator<IBehaviorProperty> iteratorJava() {
        return this.f1223k4.iteratorJava();
    }

    public final boolean remove(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.removeItem(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        this.f1223k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(IBehaviorProperty iBehaviorProperty) {
        return this.f1223k4.removeItem(iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void set_Item(int i, IBehaviorProperty iBehaviorProperty) {
        this.f1223k4.set_Item(i, iBehaviorProperty);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f1223k4.size();
    }

    @Override // com.aspose.slides.IBehaviorPropertyCollection
    public final void add(String str) {
        add(BehaviorProperty.getOrCreateByValue(str));
    }

    @Override // com.aspose.slides.IBehaviorPropertyCollection
    public final boolean contains(String str) {
        return contains(BehaviorProperty.getOrCreateByValue(str));
    }

    @Override // com.aspose.slides.IBehaviorPropertyCollection
    public final int indexOf(String str) {
        return indexOf(BehaviorProperty.getOrCreateByValue(str));
    }

    @Override // com.aspose.slides.IBehaviorPropertyCollection
    public final void insert(int i, String str) {
        insert(i, BehaviorProperty.getOrCreateByValue(str));
    }

    @Override // com.aspose.slides.IBehaviorPropertyCollection
    public final boolean remove(String str) {
        return remove(BehaviorProperty.getOrCreateByValue(str));
    }
}
