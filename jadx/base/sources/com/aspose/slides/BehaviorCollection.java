package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
public class BehaviorCollection implements IBehaviorCollection {

    /* JADX INFO: renamed from: k4 */
    Effect f1096k4;

    /* JADX INFO: renamed from: x1 */
    private final List<IBehavior> f1097x1 = new List<>();

    @Override // com.aspose.slides.IBehaviorCollection
    public final void add(IBehavior iBehavior) {
        ((Behavior) iBehavior).mo424k4().m72016k4(this.f1096k4);
        this.f1097x1.addItem(iBehavior);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final void clear() {
        this.f1097x1.clear();
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final boolean contains(IBehavior iBehavior) {
        return this.f1097x1.containsItem(iBehavior);
    }

    public final void copyTo(IBehavior[] iBehaviorArr, int i) {
        this.f1097x1.copyToTArray(iBehaviorArr, i);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final int getCount() {
        return this.f1097x1.size();
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final IBehavior get_Item(int i) {
        return this.f1097x1.get_Item(i);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final int indexOf(IBehavior iBehavior) {
        return this.f1097x1.indexOf(iBehavior);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final void insert(int i, IBehavior iBehavior) {
        ((Behavior) iBehavior).mo424k4().m72016k4(this.f1096k4);
        this.f1097x1.insertItem(i, iBehavior);
    }

    public final boolean isReadOnly() {
        return this.f1097x1.isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IBehavior> iterator() {
        return this.f1097x1.iterator();
    }

    public final IGenericEnumerator<IBehavior> iteratorJava() {
        return this.f1097x1.iteratorJava();
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final boolean remove(IBehavior iBehavior) {
        return this.f1097x1.removeItem(iBehavior);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final void removeAt(int i) {
        this.f1097x1.removeAt(i);
    }

    @Override // com.aspose.slides.IBehaviorCollection
    public final void set_Item(int i, IBehavior iBehavior) {
        this.f1097x1.set_Item(i, iBehavior);
    }
}
