package Oooo0oO;

import Oooo0oO.C21082o00000oO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.Recomposer$join$2", m80623f = "Recomposer.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o0000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C21082o00000oO.EnumC21083OooO0Oo, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f61052OooOo0o;

    public o0000() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o0000 o0000Var = new o0000(2, continuation);
        o0000Var.f61052OooOo0o = obj;
        return o0000Var;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C21082o00000oO.EnumC21083OooO0Oo enumC21083OooO0Oo, Continuation<? super Boolean> continuation) {
        return ((o0000) create(enumC21083OooO0Oo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf(((C21082o00000oO.EnumC21083OooO0Oo) this.f61052OooOo0o) == C21082o00000oO.EnumC21083OooO0Oo.f61098OooOo0o);
    }
}
