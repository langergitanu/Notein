package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33815OooOoOO<T> implements InterfaceC33723OooO0oO<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33712OooOo0O f121903OooOo0o;

    public C33815OooOoOO(InterfaceC33712OooOo0O interfaceC33712OooOo0O) {
        this.f121903OooOo0o = interfaceC33712OooOo0O;
    }

    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    public final Object emit(T t, Continuation<? super C32460OooOooO> continuation) {
        Object objOooOOO = this.f121903OooOo0o.OooOOO(t, continuation);
        return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
    }
}
