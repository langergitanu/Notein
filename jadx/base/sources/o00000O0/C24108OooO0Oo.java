package o00000O0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.C24017OooO0oO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00000O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24108OooO0Oo implements Collection<OooO0OO>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f81243OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final List<OooO0OO> f81244OooOo0o;

    public C24108OooO0Oo(List<OooO0OO> list) {
        this.f81244OooOo0o = list;
        this.f81243OooOo = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(OooO0OO oooO0OO) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends OooO0OO> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO element = (OooO0OO) obj;
        OooOOO0.OooO0oO(element, "element");
        return this.f81244OooOo0o.contains(element);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        return this.f81244OooOo0o.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24108OooO0Oo) {
            return OooOOO0.OooO0O0(this.f81244OooOo0o, ((C24108OooO0Oo) obj).f81244OooOo0o);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f81244OooOo0o.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f81244OooOo0o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<OooO0OO> iterator() {
        return this.f81244OooOo0o.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super OooO0OO> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f81243OooOo;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.f81244OooOo0o + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
