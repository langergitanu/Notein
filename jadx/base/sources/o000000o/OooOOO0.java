package o000000o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C24017OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends AbstractC24088OooO0oO implements List<OooO0o>, oO0O00.OooO00o {
    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, OooO0o oooO0o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends OooO0o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o element = (OooO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        ((OooOOO0) obj).getClass();
        return true;
    }

    @Override // java.util.List
    public final OooO0o get(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return -1;
        }
        OooO0o element = (OooO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<OooO0o> iterator() {
        throw null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return -1;
        }
        OooO0o element = (OooO0o) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        throw null;
    }

    @Override // java.util.List
    public final ListIterator<OooO0o> listIterator() {
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ OooO0o remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<OooO0o> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ OooO0o set(int i, OooO0o oooO0o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super OooO0o> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<OooO0o> subList(int i, int i2) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return "FontListFontFamily(fonts=null)";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends OooO0o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<OooO0o> listIterator(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
