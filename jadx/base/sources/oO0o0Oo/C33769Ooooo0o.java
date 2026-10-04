package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO0o0OO.o00000OO;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.InterfaceC33807OooOOoo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33769Ooooo0o<T> implements InterfaceC33780o00Ooo<T>, InterfaceC33721OooO0o, InterfaceC33807OooOOoo<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33767OoooOoo f121747OooOo0o;

    public C33769Ooooo0o(InterfaceC33767OoooOoo interfaceC33767OoooOoo, o00000OO o00000oo2) {
        this.f121747OooOo0o = interfaceC33767OoooOoo;
    }

    @Override // oO0o0OoO.InterfaceC33807OooOOoo
    public final InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return (((i < 0 || i >= 2) && i != -2) || enumC33692OooO0OO != EnumC33692OooO0OO.f121451OooOo) ? C33773Oooooo.OooO0Oo(this, interfaceC34415OooO0oo, i, enumC33692OooO0OO) : this;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<?> continuation) {
        return this.f121747OooOo0o.collect(interfaceC33723OooO0oO, continuation);
    }

    @Override // oO0o0Oo.InterfaceC33780o00Ooo
    public final T getValue() {
        return this.f121747OooOo0o.getValue();
    }
}
