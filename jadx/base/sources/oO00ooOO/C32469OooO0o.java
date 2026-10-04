package oO00ooOO;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooOO.C32466OooO0OO;
import oOo000Oo.AbstractC34422OooO0o;

/* JADX INFO: renamed from: oO00ooOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32469OooO0o<V> extends AbstractC34422OooO0o<V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32466OooO0OO<?, V> f116711OooOo0o;

    public C32469OooO0o(C32466OooO0OO<?, V> c32466OooO0OO) {
        this.f116711OooOo0o = c32466OooO0OO;
    }

    @Override // oOo000Oo.AbstractC34422OooO0o
    public final int OooO0O0() {
        return this.f116711OooOo0o.f116698OooOooo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f116711OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f116711OooOo0o.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f116711OooOo0o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C32466OooO0OO<?, V> c32466OooO0OO = this.f116711OooOo0o;
        c32466OooO0OO.getClass();
        return new C32466OooO0OO.OooO0o(c32466OooO0OO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C32466OooO0OO<?, V> c32466OooO0OO = this.f116711OooOo0o;
        c32466OooO0OO.OooO0Oo();
        int iOooOO0 = c32466OooO0OO.OooOO0(obj);
        if (iOooOO0 < 0) {
            return false;
        }
        c32466OooO0OO.OooOOO(iOooOO0);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116711OooOo0o.OooO0Oo();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116711OooOo0o.OooO0Oo();
        return super.retainAll(elements);
    }
}
