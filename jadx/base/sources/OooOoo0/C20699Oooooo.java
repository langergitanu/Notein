package OooOoo0;

import OooOoo.C20594OooO0o;
import o00oO0o.C25570OooO;
import o00oO0o.InterfaceC25574OooO0Oo;
import o00oO0o.InterfaceC25577OooO0oO;
import o00oO0o.InterfaceC25578OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: OooOoo0.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20699Oooooo implements InterfaceC25574OooO0Oo, InterfaceC25577OooO0oO<InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, ? extends C32460OooOooO>>, InterfaceC32507OooOO0o<InterfaceC34635OooOOOO, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> f59415OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C20594OooO0o f59416OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC34635OooOOOO f59417OooOoO0;

    public C20699Oooooo(C20594OooO0o c20594OooO0o) {
        this.f59416OooOo0o = c20594OooO0o;
    }

    @Override // o00oO0o.InterfaceC25574OooO0Oo
    public final void OooooOO(InterfaceC25578OooO0oo scope) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
        InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) scope.OooO00o(C20697OooooOO.f59412OooO00o);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC32507OooOO0o, this.f59415OooOo)) {
            return;
        }
        this.f59415OooOo = interfaceC32507OooOO0o;
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final C25570OooO<InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, ? extends C32460OooOooO>> getKey() {
        return C20697OooooOO.f59412OooO00o;
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, ? extends C32460OooOooO> getValue() {
        return this;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(InterfaceC34635OooOOOO interfaceC34635OooOOOO) {
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2 = interfaceC34635OooOOOO;
        this.f59417OooOoO0 = interfaceC34635OooOOOO2;
        this.f59416OooOo0o.invoke(interfaceC34635OooOOOO2);
        InterfaceC32507OooOO0o<? super InterfaceC34635OooOOOO, C32460OooOooO> interfaceC32507OooOO0o = this.f59415OooOo;
        if (interfaceC32507OooOO0o != null) {
            interfaceC32507OooOO0o.invoke(interfaceC34635OooOOOO2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
