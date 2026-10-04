package oO0o0O0O;

import java.util.Iterator;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oO0o0O0O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33577OooOOo<T, R> implements InterfaceC33569OooO0oo<R> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33569OooO0oo<T> f121218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<T, R> f121219OooO0O0;

    /* JADX INFO: renamed from: oO0o0O0O.OooOOo$OooO00o */
    public static final class OooO00o implements Iterator<R>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C33577OooOOo<T, R> f121220OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Iterator<T> f121221OooOo0o;

        public OooO00o(C33577OooOOo<T, R> c33577OooOOo) {
            this.f121220OooOo = c33577OooOOo;
            this.f121221OooOo0o = c33577OooOOo.f121218OooO00o.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f121221OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return (R) this.f121220OooOo.f121219OooO0O0.invoke(this.f121221OooOo0o.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33577OooOOo(InterfaceC33569OooO0oo<? extends T> interfaceC33569OooO0oo, InterfaceC32507OooOO0o<? super T, ? extends R> transformer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transformer, "transformer");
        this.f121218OooO00o = interfaceC33569OooO0oo;
        this.f121219OooO0O0 = transformer;
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<R> iterator() {
        return new OooO00o(this);
    }
}
