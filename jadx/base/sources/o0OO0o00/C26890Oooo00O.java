package o0OO0o00;

import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO0o00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.huawei.HuaweiDriveSessionManager$cancelAuthorization$2", m80623f = "HuaweiDriveSessionManager.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26890Oooo00O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f93283OooOo0o;

    public C26890Oooo00O() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26890Oooo00O c26890Oooo00O = new C26890Oooo00O(2, continuation);
        c26890Oooo00O.f93283OooOo0o = obj;
        return c26890Oooo00O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26890Oooo00O) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f93283OooOo0o;
        c24334OooO0O0.OooO0o(App.f69600o0ooOOo);
        c24334OooO0O0.OooO0o(App.f69601o0ooOoO);
        return C32460OooOooO.f116667OooO00o;
    }
}
