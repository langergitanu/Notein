package oO0o0OoO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: oO0o0OoO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33806OooOOo0 implements InterfaceC33721OooO0o<Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32476OooO f121889OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public C33806OooOOo0(InterfaceC32510OooOOo0 interfaceC32510OooOOo0) {
        this.f121889OooOo0o = (AbstractC32476OooO) interfaceC32510OooOOo0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [oO00ooo.OooO, oO0O000o.OooOOo0] */
    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Object> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        C33805OooOOo c33805OooOOo = new C33805OooOOo(this.f121889OooOo0o, interfaceC33723OooO0oO, null);
        C33804OooOOOo c33804OooOOOo = new C33804OooOOOo(continuation, continuation.getContext());
        Object objOooO0o0 = o00OO00O.OooO0O0.OooO0o0(c33804OooOOOo, c33804OooOOOo, c33805OooOOo);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }
}
