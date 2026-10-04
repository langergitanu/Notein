package oO0o0O0O;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33566OooO0o<T, R, E> implements InterfaceC33569OooO0oo<E> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33569OooO0oo<T> f121194OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<T, R> f121195OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<R, Iterator<E>> f121196OooO0OO;

    /* JADX INFO: renamed from: oO0o0O0O.OooO0o$OooO00o */
    public static final class OooO00o implements Iterator<E>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public Iterator<? extends E> f121197OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<T> f121198OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33566OooO0o<T, R, E> f121199OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f121200OooOoO0;

        public OooO00o(C33566OooO0o<T, R, E> c33566OooO0o) {
            this.f121199OooOoO = c33566OooO0o;
            this.f121198OooOo0o = c33566OooO0o.f121194OooO00o.iterator();
        }

        public final boolean OooO00o() {
            Iterator<? extends E> it;
            Iterator<? extends E> it2 = this.f121197OooOo;
            if (it2 != null && it2.hasNext()) {
                this.f121200OooOoO0 = 1;
                return true;
            }
            do {
                Iterator<T> it3 = this.f121198OooOo0o;
                if (!it3.hasNext()) {
                    this.f121200OooOoO0 = 2;
                    this.f121197OooOo = null;
                    return false;
                }
                T next = it3.next();
                C33566OooO0o<T, R, E> c33566OooO0o = this.f121199OooOoO;
                it = (Iterator) c33566OooO0o.f121196OooO0OO.invoke(c33566OooO0o.f121195OooO0O0.invoke(next));
            } while (!it.hasNext());
            this.f121197OooOo = it;
            this.f121200OooOoO0 = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f121200OooOoO0;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return OooO00o();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.f121200OooOoO0;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !OooO00o()) {
                throw new NoSuchElementException();
            }
            this.f121200OooOoO0 = 0;
            Iterator<? extends E> it = this.f121197OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33566OooO0o(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo, InterfaceC32507OooOO0o<? super T, ? extends R> transformer, InterfaceC32507OooOO0o<? super R, ? extends Iterator<? extends E>> iterator) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transformer, "transformer");
        kotlin.jvm.internal.OooOOO0.OooO0oO(iterator, "iterator");
        this.f121194OooO00o = interfaceC33569OooO0oo;
        this.f121195OooO0O0 = transformer;
        this.f121196OooO0OO = iterator;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<E> iterator() {
        return new OooO00o(this);
    }
}
