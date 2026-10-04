package OoooO0O;

import java.util.Iterator;
import oOo000Oo.AbstractC34422OooO0o;

/* JADX INFO: renamed from: OoooO0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21162OooOO0o<K, V> extends AbstractC34422OooO0o<V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21158OooO0o<K, V> f61398OooOo0o;

    public C21162OooOO0o(C21158OooO0o<K, V> c21158OooO0o) {
        this.f61398OooOo0o = c21158OooO0o;
    }

    @Override // oOo000Oo.AbstractC34422OooO0o
    public final int OooO0O0() {
        C21158OooO0o<K, V> c21158OooO0o = this.f61398OooOo0o;
        c21158OooO0o.getClass();
        return c21158OooO0o.f61388OooOoo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f61398OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f61398OooOo0o.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21170OooOoO();
        }
        return new OooOOO0(this.f61398OooOo0o, abstractC21167OooOo0Arr);
    }
}
