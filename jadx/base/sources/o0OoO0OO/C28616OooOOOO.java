package o0OoO0OO;

import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
import o0Oo0ooo.C28473OooOO0;
import o0Oo0ooo.C28477OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0OO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onXiaoMiImageViewCreated$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {180, 180}, m80625m = "invokeSuspend")
public final class C28616OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginByThirdPartyChildFragment f101439OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101440OooOo0o;

    /* JADX INFO: renamed from: o0OoO0OO.OooOOOO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ LoginByThirdPartyChildFragment f101441OooOo0o;

        public OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
            this.f101441OooOo0o = loginByThirdPartyChildFragment;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            AuthorizeInfo authorizeInfo = (AuthorizeInfo) ((C27174OooO0O0) obj).OooO0O0();
            if (authorizeInfo != null) {
                String authCode = authorizeInfo.getAuthCode();
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101441OooOo0o;
                if (authCode != null) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28612OooOO0O(loginByThirdPartyChildFragment, authorizeInfo.getAuthCode(), null), 3);
                } else {
                    LoginByThirdPartyChildFragment.OooOoO(loginByThirdPartyChildFragment);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28616OooOOOO(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C28616OooOOOO> continuation) {
        super(2, continuation);
        this.f101439OooOo = loginByThirdPartyChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28616OooOOOO(this.f101439OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28616OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (((oO0o0Oo.InterfaceC33721OooO0o) r9).collect(r1, r8) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101440OooOo0o;
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101439OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = loginByThirdPartyChildFragment.requireActivity();
            this.f101440OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28473OooOO0(c28477OooOOO0OooOoOO, 3, activityC21897OooOo0RequireActivity, null), this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        OooO00o oooO00o = new OooO00o(loginByThirdPartyChildFragment);
        this.f101440OooOo0o = 2;
    }
}
