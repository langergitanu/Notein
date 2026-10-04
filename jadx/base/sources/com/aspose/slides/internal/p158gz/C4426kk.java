package com.aspose.slides.internal.p158gz;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gz.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4426kk<T> implements IGenericList<T> {

    /* JADX INFO: renamed from: k4 */
    private final T[] f12144k4;

    /* JADX INFO: renamed from: kk */
    private int f12145kk;

    /* JADX INFO: renamed from: x1 */
    private final int f12146x1;

    public C4426kk(T[] tArr, int i, int i2) {
        this.f12144k4 = tArr;
        this.f12146x1 = i;
        m18034k4(i2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(T t) {
        this.f12144k4[m18035k4() + this.f12146x1] = t;
        m18034k4(m18035k4() + 1);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        m18034k4(0);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean containsItem(T t) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void copyToTArray(T[] tArr, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final T get_Item(int i) {
        return this.f12144k4[this.f12146x1 + i];
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final int indexOfItem(T t) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void insertItem(int i, T t) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<T> iterator() {
        return new C4427x1(this.f12144k4, m18035k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final int m18035k4() {
        return this.f12145kk;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void removeAt(int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(T t) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public final void set_Item(int i, T t) {
        this.f12144k4[this.f12146x1 + i] = t;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f12145kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m18034k4(int i) {
        this.f12145kk = i;
    }
}
