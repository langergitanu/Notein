package o0OoO0OO;

import com.orion.notein.domain.models.login.LoginInfo;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0Oo0ooo.C28477OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0OO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$handleHonorAuthorizeSuccess$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {69}, m80625m = "invokeSuspend")
public final class C28611OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginByThirdPartyChildFragment f101405OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101406OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101407OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28611OooOO0(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, String str, Continuation<? super C28611OooOO0> continuation) {
        super(2, continuation);
        this.f101405OooOo = loginByThirdPartyChildFragment;
        this.f101407OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28611OooOO0(this.f101405OooOo, this.f101407OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28611OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        LoginInfo loginInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101406OooOo0o;
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101405OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
            this.f101406OooOo0o = 1;
            obj = c28477OooOOO0OooOoOO.OooO0oO(2, this.f101407OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "10002") && (loginInfo = (LoginInfo) c27174OooO0O0.OooO0O0()) != null) {
            loginByThirdPartyChildFragment.f72577OooOo.OooOOoo(2, loginInfo.getAccessToken(), "");
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
