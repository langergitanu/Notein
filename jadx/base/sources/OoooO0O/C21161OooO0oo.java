package OoooO0O;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: OoooO0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21161OooO0oo<K, V> extends AbstractC21154OooO00o<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21158OooO0o<K, V> f61396OooOo0o;

    public C21161OooO0oo(C21158OooO0o<K, V> c21158OooO0o) {
        this.f61396OooOo0o = c21158OooO0o;
    }

    @Override // oOo000Oo.OooO
    public final int OooO0O0() {
        C21158OooO0o<K, V> c21158OooO0o = this.f61396OooOo0o;
        c21158OooO0o.getClass();
        return c21158OooO0o.f61388OooOoo0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f61396OooOo0o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new OooO(this.f61396OooOo0o);
    }
}
