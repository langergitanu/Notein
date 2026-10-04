package o0OO0o0;

import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend$updateCursorInternal$2$1", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f92994OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92995OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(String str, Continuation<? super o000000> continuation) {
        super(2, continuation);
        this.f92994OooOo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o000000 o000000Var = new o000000(this.f92994OooOo, continuation);
        o000000Var.f92995OooOo0o = obj;
        return o000000Var;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((o000000) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f92995OooOo0o).OooO0oO(o00oO0O.f93061OooOO0, this.f92994OooOo);
        return C32460OooOooO.f116667OooO00o;
    }
}
