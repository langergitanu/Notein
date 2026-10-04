package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO0o0OO.o00000OO;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OoO.InterfaceC33807OooOOoo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Oo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33768Ooooo00<T> implements InterfaceC33771OooooOO<T>, InterfaceC33721OooO0o, InterfaceC33807OooOOoo<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33766OoooOoO f121746OooOo0o;

    public C33768Ooooo00(InterfaceC33766OoooOoO interfaceC33766OoooOoO, o00000OO o00000oo2) {
        this.f121746OooOo0o = interfaceC33766OoooOoO;
    }

    @Override // oO0o0OoO.InterfaceC33807OooOOoo
    public final InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO) {
        return C33773Oooooo.OooO0Oo(this, interfaceC34415OooO0oo, i, enumC33692OooO0OO);
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super T> interfaceC33723OooO0oO, Continuation<?> continuation) {
        return this.f121746OooOo0o.collect(interfaceC33723OooO0oO, continuation);
    }
}
