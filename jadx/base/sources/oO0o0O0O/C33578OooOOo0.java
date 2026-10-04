package oO0o0O0O;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33578OooOOo0<T> implements InterfaceC33569OooO0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33569OooO0oo<T> f121222OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f121223OooO0O0;

    /* JADX INFO: renamed from: oO0o0O0O.OooOOo0$OooO00o */
    public static final class OooO00o implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121224OooOo = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<T> f121225OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C33578OooOOo0<T> f121226OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public T f121227OooOoO0;

        public OooO00o(C33578OooOOo0<T> c33578OooOOo0) {
            this.f121226OooOoO = c33578OooOOo0;
            this.f121225OooOo0o = c33578OooOOo0.f121222OooO00o.iterator();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        public final void OooO00o() {
            Iterator<T> it = this.f121225OooOo0o;
            if (it.hasNext()) {
                T next = it.next();
                if (((Boolean) this.f121226OooOoO.f121223OooO0O0.invoke(next)).booleanValue()) {
                    this.f121224OooOo = 1;
                    this.f121227OooOoO0 = next;
                    return;
                }
            }
            this.f121224OooOo = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f121224OooOo == -1) {
                OooO00o();
            }
            return this.f121224OooOo == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f121224OooOo == -1) {
                OooO00o();
            }
            if (this.f121224OooOo == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f121227OooOoO0;
            this.f121227OooOoO0 = null;
            this.f121224OooOo = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33578OooOOo0(InterfaceC33569OooO0oo<? extends T> sequence, InterfaceC32507OooOO0o<? super T, Boolean> predicate) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sequence, "sequence");
        kotlin.jvm.internal.OooOOO0.OooO0oO(predicate, "predicate");
        this.f121222OooO00o = sequence;
        this.f121223OooO0O0 = (kotlin.jvm.internal.OooOOOO) predicate;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
