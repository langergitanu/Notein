package o0OOOO0o;

import android.content.Intent;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.account.service.AccountAuthService;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import kotlin.coroutines.Continuation;
import o000OO00.C24480Oooo0OO;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOOO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.user.HWAuthorizeService$authorize$2", m80623f = "HWAuthorizeService.kt", m80624l = {80}, m80625m = "invokeSuspend")
public final class C27096OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f94422OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f94423OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27099OooO0oo f94424OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27096OooO0Oo(C27099OooO0oo c27099OooO0oo, Continuation<? super C27096OooO0Oo> continuation) {
        super(2, continuation);
        this.f94424OooOoO0 = c27099OooO0oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27096OooO0Oo c27096OooO0Oo = new C27096OooO0Oo(this.f94424OooOoO0, continuation);
        c27096OooO0Oo.f94422OooOo = obj;
        return c27096OooO0Oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super C27174OooO0O0<AuthorizeInfo>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C27096OooO0Oo) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f94423OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            final InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f94422OooOo;
            final C27099OooO0oo c27099OooO0oo = this.f94424OooOoO0;
            Object value = c27099OooO0oo.f94439OooO0OO.getValue();
            kotlin.jvm.internal.OooOOO0.OooO0o(value, "getValue(...)");
            o0O00OOO.OooO0o<AuthAccount> oooO0oSilentSignIn = ((AccountAuthService) value).silentSignIn();
            oooO0oSilentSignIn.OooO0o0(new InterfaceC25833OooO0o0() { // from class: o0OOOO0o.OooO0O0
                @Override // o0O00OOO.InterfaceC25833OooO0o0
                public final void onSuccess(Object obj2) {
                    interfaceC33712OooOo0O.OooO0o0(new C27174OooO0O0(true, new AuthorizeInfo(null, ((AuthAccount) obj2).getAuthorizationCode(), null, 5, null), null, null, 12));
                }
            });
            oooO0oSilentSignIn.OooO0OO(new InterfaceC25832OooO0Oo() { // from class: o0OOOO0o.OooO0OO
                @Override // o0O00OOO.InterfaceC25832OooO0Oo
                public final void onFailure(Exception exc) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("HWAuthorizeService");
                    kotlin.jvm.internal.OooOOO0.OooO0o0(exc, "null cannot be cast to non-null type com.huawei.hms.common.ApiException");
                    ApiException apiException = (ApiException) exc;
                    c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO00o(apiException.getStatusCode(), "authorize exception, status code: ", ", message: ", apiException.getMessage()), new Object[0]);
                    Object value2 = c27099OooO0oo.f94439OooO0OO.getValue();
                    kotlin.jvm.internal.OooOOO0.OooO0o(value2, "getValue(...)");
                    Intent signInIntent = ((AccountAuthService) value2).getSignInIntent();
                    signInIntent.putExtra("intent.extra.isfullscreen", true);
                    String strValueOf = String.valueOf(apiException.getStatusCode());
                    interfaceC33712OooOo0O.OooO0o0(kotlin.jvm.internal.OooOOO0.OooO0O0(strValueOf, LoginErrorCode.ERROR_CODE_HW_NEED_USER_AUTHORIZE) ? new C27174OooO0O0(true, new AuthorizeInfo(signInIntent, null, null, 6, null), LoginErrorCode.ERROR_CODE_HW_NEED_USER_AUTHORIZE, null, 8) : new C27174OooO0O0(false, null, strValueOf, null, 10));
                }
            });
            C24480Oooo0OO c24480Oooo0OO = new C24480Oooo0OO(1);
            this.f94423OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, c24480Oooo0OO, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
