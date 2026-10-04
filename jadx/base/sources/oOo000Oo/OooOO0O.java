package oOo000Oo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C24017OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O<T> implements Collection<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f123442OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T[] f123443OooOo0o;

    public OooOO0O(T[] values, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(values, "values");
        this.f123443OooOo0o = values;
        this.f123442OooOo = z;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return OooOOO.OooOoO0(this.f123443OooOo0o, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!OooOOO.OooOoO0(this.f123443OooOo0o, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f123443OooOo0o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return kotlin.jvm.internal.OooO0OO.OooO0O0(this.f123443OooOo0o);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f123443OooOo0o.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f123443OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(tArr, "<this>");
        if (this.f123442OooOo && tArr.getClass().equals(Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
