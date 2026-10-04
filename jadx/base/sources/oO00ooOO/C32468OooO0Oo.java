package oO00ooOO;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import oO00ooOO.C32466OooO0OO;

/* JADX INFO: renamed from: oO00ooOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32468OooO0Oo<K, V> extends AbstractC32464OooO00o<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C32466OooO0OO<K, V> f116710OooOo0o;

    public C32468OooO0Oo(C32466OooO0OO<K, V> c32466OooO0OO) {
        this.f116710OooOo0o = c32466OooO0OO;
    }

    @Override // oOo000Oo.OooO
    public final int OooO0O0() {
        return this.f116710OooOo0o.f116698OooOooo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        OooOOO0.OooO0oO(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f116710OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        return this.f116710OooOo0o.OooO0o(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f116710OooOo0o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        C32466OooO0OO<K, V> c32466OooO0OO = this.f116710OooOo0o;
        c32466OooO0OO.getClass();
        return new C32466OooO0OO.OooO0O0(c32466OooO0OO);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116710OooOo0o.OooO0Oo();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        this.f116710OooOo0o.OooO0Oo();
        return super.retainAll(elements);
    }
}
