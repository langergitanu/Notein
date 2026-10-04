package oOo000Oo;

import java.util.Iterator;

/* JADX INFO: renamed from: oOo000Oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34440OooOooo<T> implements Iterator<C34437OooOoo<? extends T>>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f123460OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Iterator<T> f123461OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C34440OooOooo(Iterator<? extends T> iterator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterator, "iterator");
        this.f123461OooOo0o = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f123461OooOo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f123460OooOo;
        this.f123460OooOo = i + 1;
        if (i >= 0) {
            return new C34437OooOoo(i, this.f123461OooOo0o.next());
        }
        C34429OooOOo0.OooOOo();
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
