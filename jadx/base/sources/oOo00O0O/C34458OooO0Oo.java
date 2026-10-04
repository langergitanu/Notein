package oOo00O0O;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C24017OooO0oO;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oOo00O0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC33908OooO(with = C34459OooO0o0.class)
public final class C34458OooO0Oo extends OooOO0O implements List<OooOO0O>, oO0O00.OooO00o {
    public static final OooO00o Companion = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<OooOO0O> f123494OooOo0o;

    /* JADX INFO: renamed from: oOo00O0O.OooO0Oo$OooO00o */
    public static final class OooO00o {
        public final InterfaceC33911OooO0OO<C34458OooO0Oo> serializer() {
            return C34459OooO0o0.f123506OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34458OooO0Oo(List<? extends OooOO0O> content) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(content, "content");
        this.f123494OooOo0o = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, OooOO0O oooOO0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends OooOO0O> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O element = (OooOO0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        return this.f123494OooOo0o.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        return this.f123494OooOo0o.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123494OooOo0o, obj);
    }

    @Override // java.util.List
    public final OooOO0O get(int i) {
        return this.f123494OooOo0o.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f123494OooOo0o.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return -1;
        }
        OooOO0O element = (OooOO0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        return this.f123494OooOo0o.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f123494OooOo0o.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<OooOO0O> iterator() {
        return this.f123494OooOo0o.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return -1;
        }
        OooOO0O element = (OooOO0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        return this.f123494OooOo0o.lastIndexOf(element);
    }

    @Override // java.util.List
    public final ListIterator<OooOO0O> listIterator() {
        return this.f123494OooOo0o.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ OooOO0O remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<OooOO0O> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ OooOO0O set(int i, OooOO0O oooOO0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f123494OooOo0o.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super OooOO0O> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<OooOO0O> subList(int i, int i2) {
        return this.f123494OooOo0o.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return oOo000Oo.OooOo.o000oOoO(this.f123494OooOo0o, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends OooOO0O> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<OooOO0O> listIterator(int i) {
        return this.f123494OooOo0o.listIterator(i);
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
