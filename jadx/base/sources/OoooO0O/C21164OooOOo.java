package OoooO0O;

import java.util.Iterator;
import oOo000Oo.AbstractC34419OooO0O0;

/* JADX INFO: renamed from: OoooO0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21164OooOOo<K, V> extends AbstractC34419OooO0O0<V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21157OooO0Oo<K, V> f61401OooOo0o;

    public C21164OooOOo(C21157OooO0Oo<K, V> c21157OooO0Oo) {
        this.f61401OooOo0o = c21157OooO0Oo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61401OooOo0o;
        c21157OooO0Oo.getClass();
        return c21157OooO0Oo.f61381OooOo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f61401OooOo0o.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61401OooOo0o;
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21170OooOoO();
        }
        return new C21166OooOOoo(c21157OooO0Oo.f61382OooOo0o, abstractC21167OooOo0Arr);
    }
}
