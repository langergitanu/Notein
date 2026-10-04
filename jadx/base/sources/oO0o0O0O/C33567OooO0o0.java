package oO0o0O0O;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33567OooO0o0<T> implements InterfaceC33569OooO0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33569OooO0oo<T> f121201OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f121202OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<T, Boolean> f121203OooO0OO;

    /* JADX INFO: renamed from: oO0o0O0O.OooO0o0$OooO00o */
    public static final class OooO00o implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121204OooOo = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<T> f121205OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33567OooO0o0<T> f121206OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public T f121207OooOoO0;

        public OooO00o(C33567OooO0o0<T> c33567OooO0o0) {
            this.f121206OooOoO = c33567OooO0o0;
            this.f121205OooOo0o = c33567OooO0o0.f121201OooO00o.iterator();
        }

        public final void OooO00o() {
            T next;
            C33567OooO0o0<T> c33567OooO0o0;
            do {
                Iterator<T> it = this.f121205OooOo0o;
                if (!it.hasNext()) {
                    this.f121204OooOo = 0;
                    return;
                } else {
                    next = it.next();
                    c33567OooO0o0 = this.f121206OooOoO;
                }
            } while (c33567OooO0o0.f121203OooO0OO.invoke(next).booleanValue() != c33567OooO0o0.f121202OooO0O0);
            this.f121207OooOoO0 = next;
            this.f121204OooOo = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f121204OooOo == -1) {
                OooO00o();
            }
            return this.f121204OooOo == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f121204OooOo == -1) {
                OooO00o();
            }
            if (this.f121204OooOo == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f121207OooOoO0;
            this.f121207OooOoO0 = null;
            this.f121204OooOo = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33567OooO0o0(InterfaceC33569OooO0oo<? extends T> sequence, boolean z, InterfaceC32507OooOO0o<? super T, Boolean> predicate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sequence, "sequence");
        kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
        this.f121201OooO00o = sequence;
        this.f121202OooO0O0 = z;
        this.f121203OooO0OO = predicate;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
