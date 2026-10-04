package oO0o0Ooo;

import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33665o00000o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33843OooOoO<T> implements InterfaceC33665o00000o0<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ThreadLocal<T> f121954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T f121955OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33845OooOoOO f121956OooOoO0;

    public C33843OooOoO(T t, ThreadLocal<T> threadLocal) {
        this.f121955OooOo0o = t;
        this.f121954OooOo = threadLocal;
        this.f121956OooOoO0 = new C33845OooOoOO(threadLocal);
    }

    @Override // oO0o0OO.InterfaceC33665o00000o0
    public final void Oooo0OO(Object obj) {
        this.f121954OooOo.set(obj);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <R> R fold(R r, InterfaceC32508OooOOOo<? super R, ? super InterfaceC34415OooO0oo.OooO0O0, ? extends R> interfaceC32508OooOOOo) {
        return interfaceC32508OooOOOo.invoke(r, this);
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final <E extends InterfaceC34415OooO0oo.OooO0O0> E get(InterfaceC34415OooO0oo.OooO0OO<E> oooO0OO) {
        if (this.f121956OooOoO0.equals(oooO0OO)) {
            return this;
        }
        return null;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo.OooO0O0
    public final InterfaceC34415OooO0oo.OooO0OO<?> getKey() {
        return this.f121956OooOoO0;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo minusKey(InterfaceC34415OooO0oo.OooO0OO<?> oooO0OO) {
        return this.f121956OooOoO0.equals(oooO0OO) ? oOo0000O.OooO.f123416OooOo0o : this;
    }

    @Override // oO0o0OO.InterfaceC33665o00000o0
    public final T o00Oo0(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        ThreadLocal<T> threadLocal = this.f121954OooOo;
        T t = threadLocal.get();
        threadLocal.set(this.f121955OooOo0o);
        return t;
    }

    @Override // oOo0000O.InterfaceC34415OooO0oo
    public final InterfaceC34415OooO0oo plus(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(this, interfaceC34415OooO0oo);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f121955OooOo0o + ", threadLocal = " + this.f121954OooOo + ')';
    }
}
