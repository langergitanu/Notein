package OoooO0O;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0<K, V> extends oOo000Oo.OooO<K> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21158OooO0o<K, V> f61397OooOo0o;

    public OooOO0(C21158OooO0o<K, V> c21158OooO0o) {
        this.f61397OooOo0o = c21158OooO0o;
    }

    @Override // oOo000Oo.OooO
    public final int OooO0O0() {
        C21158OooO0o<K, V> c21158OooO0o = this.f61397OooOo0o;
        c21158OooO0o.getClass();
        return c21158OooO0o.f61388OooOoo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f61397OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f61397OooOo0o.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21169OooOo0o();
        }
        return new OooOO0O(this.f61397OooOo0o, abstractC21167OooOo0Arr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C21158OooO0o<K, V> c21158OooO0o = this.f61397OooOo0o;
        if (!c21158OooO0o.containsKey(obj)) {
            return false;
        }
        c21158OooO0o.remove(obj);
        return true;
    }
}
