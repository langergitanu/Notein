package oO0o0o0;

import oO0o0Oo.InterfaceC33721OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33850OooO0O0<T> implements oOO00OOO.OooO00o<T> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f121968OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33721OooO0o<T> f121969OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C33850OooO0O0(InterfaceC33721OooO0o<? extends T> interfaceC33721OooO0o, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f121969OooOo0o = interfaceC33721OooO0o;
        this.f121968OooOo = interfaceC34415OooO0oo;
    }

    @Override // oOO00OOO.OooO00o
    public final void subscribe(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        oooO0O0.getClass();
        oooO0O0.OooO0Oo(new C33855OooO0oO(this.f121969OooOo0o, oooO0O0, this.f121968OooOo));
    }
}
