package Oooo0o0;

import kotlin.coroutines.Continuation;
import o00Ooo.InterfaceC25088OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: Oooo0o0.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.material3.SurfaceKt$Surface$1$2", m80623f = "Surface.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C21012Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC25088OooOoO, Continuation<? super C32460OooOooO>, Object> {
    public C21012Oooo000() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C21012Oooo000(2, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC25088OooOoO interfaceC25088OooOoO, Continuation<? super C32460OooOooO> continuation) {
        return ((C21012Oooo000) create(interfaceC25088OooOoO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return C32460OooOooO.f116667OooO00o;
    }
}
