package o0oOoO0;

import android.content.Context;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.domain.models.login.LoginInfo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0oOoO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleHonorAuthorizeSuccess$1", m80623f = "UserSettingFragment.kt", m80624l = {615, 616}, m80625m = "invokeSuspend")
public final class C30998OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserSettingFragment f110710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110711OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f110712OooOoO0;

    /* JADX INFO: renamed from: o0oOoO0.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleHonorAuthorizeSuccess$1$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ UserSettingFragment f110713OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27174OooO0O0<LoginInfo> f110714OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C27174OooO0O0<LoginInfo> c27174OooO0O0, UserSettingFragment userSettingFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f110714OooOo0o = c27174OooO0O0;
            this.f110713OooOo = userSettingFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f110714OooOo0o, this.f110713OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            UserSettingFragment userSettingFragment;
            Context context;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (OooOOO0.OooO0O0(this.f110714OooOo0o.getErrorCode(), LoginErrorCode.ERROR_CODE_USER_HAS_BIND_ANOTHER_ACCOUNT) && (context = (userSettingFragment = this.f110713OooOo).getContext()) != null) {
                String string = userSettingFragment.getString(R.string.has_already_bind_another_account);
                OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30998OooO0o0(UserSettingFragment userSettingFragment, String str, Continuation<? super C30998OooO0o0> continuation) {
        super(2, continuation);
        this.f110710OooOo = userSettingFragment;
        this.f110712OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30998OooO0o0(this.f110710OooOo, this.f110712OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30998OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110711OooOo0o;
        UserSettingFragment userSettingFragment = this.f110710OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            userSettingFragment.OooOoOO();
            this.f110711OooOo0o = 1;
            throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o((C27174OooO0O0) obj, userSettingFragment, null);
            this.f110711OooOo0o = 2;
            if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
