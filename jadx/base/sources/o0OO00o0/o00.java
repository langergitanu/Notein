package o0OO00o0;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.AbstractC34767o0000oOO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.ImageLocalDataSource$clearImages$2", m80623f = "ImageLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC34767o0000oOO, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91196OooOo0o;

    public o00() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00 o00Var = new o00(2, continuation);
        o00Var.f91196OooOo0o = obj;
        return o00Var;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC34767o0000oOO abstractC34767o0000oOO, Continuation<? super C32460OooOooO> continuation) {
        return ((o00) create(abstractC34767o0000oOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((AbstractC34767o0000oOO) this.f91196OooOo0o).OooO00o();
        return C32460OooOooO.f116667OooO00o;
    }
}
