package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.j2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3061j2<T> implements IGenericList<T> {

    /* JADX INFO: renamed from: k4 */
    private Class<T> f9092k4;

    /* JADX INFO: renamed from: x1 */
    private final IGenericList<T> f9093x1;

    public C3061j2(Class<T> cls, IGenericList<T> iGenericList) {
        this.f9092k4 = cls;
        if (iGenericList == null) {
            throw new ArgumentNullException();
        }
        this.f9093x1 = iGenericList;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean containsItem(T t) {
        return this.f9093x1.containsItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void copyToTArray(T[] tArr, int i) {
        this.f9093x1.copyToTArray(tArr, i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final T get_Item(int i) {
        return this.f9093x1.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final int indexOfItem(T t) {
        return this.f9093x1.indexOfItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void insertItem(int i, T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return true;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<T> m80682iterator() {
        return this.f9093x1.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void set_Item(int i, T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f9093x1.size();
    }
}
