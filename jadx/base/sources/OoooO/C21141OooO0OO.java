package OoooO;

import OooOo.C20485OooOoO;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OoooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21141OooO0OO<E> implements Iterator<E>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Map<E, C21139OooO00o> f61339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f61340OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61341OooOoO0;

    public C21141OooO0OO(Object obj, Map<E, C21139OooO00o> map) {
        this.f61340OooOo0o = obj;
        this.f61339OooOo = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61341OooOoO0 < this.f61339OooOo.size();
    }

    @Override // java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E e = (E) this.f61340OooOo0o;
        this.f61341OooOoO0++;
        C21139OooO00o c21139OooO00o = this.f61339OooOo.get(e);
        if (c21139OooO00o == null) {
            throw new ConcurrentModificationException(C20485OooOoO.OooO0O0("Hash code of an element (", e, ") has changed after it was added to the persistent set."));
        }
        this.f61340OooOo0o = c21139OooO00o.f61334OooO0O0;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
