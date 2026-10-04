package ooOOoOoo;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0Ooo.AbstractC33338OoooOO0;

/* JADX INFO: renamed from: ooOOoOoo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35167OooOO0o extends AbstractC35159OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C35167OooOO0o f126242OooOo0o = new C35167OooOO0o();

    /* JADX INFO: renamed from: ooOOoOoo.OooOO0o$OooO00o */
    public static final class OooO00o implements Iterator, oO0O00.OooO00o {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final int OooO0O0() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final void OooO0Oo(int i, AbstractC33338OoooOO0 abstractC33338OoooOO0) {
        throw new IllegalStateException();
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return null;
    }

    @Override // ooOOoOoo.AbstractC35159OooO0OO, java.lang.Iterable
    public final Iterator iterator() {
        return new OooO00o();
    }
}
