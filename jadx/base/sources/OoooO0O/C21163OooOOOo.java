package OoooO0O;

import OoooO00.InterfaceC21150OooO0O0;
import java.util.Iterator;

/* JADX INFO: renamed from: OoooO0O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21163OooOOOo<K, V> extends oOo000Oo.OooOO0<K> implements InterfaceC21150OooO0O0<K> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21157OooO0Oo<K, V> f61400OooOo0o;

    public C21163OooOOOo(C21157OooO0Oo<K, V> c21157OooO0Oo) {
        this.f61400OooOo0o = c21157OooO0Oo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61400OooOo0o;
        c21157OooO0Oo.getClass();
        return c21157OooO0Oo.f61381OooOo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f61400OooOo0o.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61400OooOo0o;
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21169OooOo0o();
        }
        return new C21165OooOOo0(c21157OooO0Oo.f61382OooOo0o, abstractC21167OooOo0Arr);
    }
}
