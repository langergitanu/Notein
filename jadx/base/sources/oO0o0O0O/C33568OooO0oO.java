package oO0o0O0O;

import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33568OooO0oO<T> implements InterfaceC33569OooO0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O000o.OooO00o<T> f121208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<T, T> f121209OooO0O0;

    /* JADX INFO: renamed from: oO0o0O0O.OooO0oO$OooO00o */
    public static final class OooO00o implements Iterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f121210OooOo = -2;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public T f121211OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C33568OooO0oO<T> f121212OooOoO0;

        public OooO00o(C33568OooO0oO<T> c33568OooO0oO) {
            this.f121212OooOoO0 = c33568OooO0oO;
        }

        public final void OooO00o() {
            T tInvoke;
            int i = this.f121210OooOo;
            C33568OooO0oO<T> c33568OooO0oO = this.f121212OooOoO0;
            if (i == -2) {
                tInvoke = c33568OooO0oO.f121208OooO00o.invoke();
            } else {
                InterfaceC32507OooOO0o<T, T> interfaceC32507OooOO0o = c33568OooO0oO.f121209OooO0O0;
                T t = this.f121211OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
                tInvoke = interfaceC32507OooOO0o.invoke(t);
            }
            this.f121211OooOo0o = tInvoke;
            this.f121210OooOo = tInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f121210OooOo < 0) {
                OooO00o();
            }
            return this.f121210OooOo == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f121210OooOo < 0) {
                OooO00o();
            }
            if (this.f121210OooOo == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f121211OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f121210OooOo = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33568OooO0oO(oO0O000o.OooO00o<? extends T> getInitialValue, InterfaceC32507OooOO0o<? super T, ? extends T> getNextValue) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getNextValue, "getNextValue");
        this.f121208OooO00o = getInitialValue;
        this.f121209OooO0O0 = getNextValue;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }
}
