package ooOOoOoo;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0Ooo.AbstractC33338OoooOO0;

/* JADX INFO: renamed from: ooOOoOoo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35172OooOOo<T> extends AbstractC35159OooO0OO<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f126249OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33338OoooOO0 f126250OooOo0o;

    /* JADX INFO: renamed from: ooOOoOoo.OooOOo$OooO00o */
    public static final class OooO00o implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C35172OooOOo<T> f126251OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f126252OooOo0o = true;

        public OooO00o(C35172OooOOo<T> c35172OooOOo) {
            this.f126251OooOo = c35172OooOOo;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f126252OooOo0o;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f126252OooOo0o) {
                throw new NoSuchElementException();
            }
            this.f126252OooOo0o = false;
            return (T) this.f126251OooOo.f126250OooOo0o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C35172OooOOo(int i, AbstractC33338OoooOO0 abstractC33338OoooOO0) {
        this.f126250OooOo0o = abstractC33338OoooOO0;
        this.f126249OooOo = i;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final int OooO0O0() {
        return 1;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final void OooO0Oo(int i, AbstractC33338OoooOO0 abstractC33338OoooOO0) {
        throw new IllegalStateException();
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final T get(int i) {
        if (i == this.f126249OooOo) {
            return (T) this.f126250OooOo0o;
        }
        return null;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
