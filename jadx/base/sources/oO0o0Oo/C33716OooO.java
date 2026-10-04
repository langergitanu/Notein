package oO0o0Oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: oO0o0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33716OooO implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f121500OooOo0o;

    public C33716OooO(Object obj) {
        this.f121500OooOo0o = obj;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        Object objEmit = interfaceC33723OooO0oO.emit(this.f121500OooOo0o, continuation);
        return objEmit == EnumC32485OooO00o.f116726OooOo0o ? objEmit : C32460OooOooO.f116667OooO00o;
    }
}
