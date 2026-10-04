package o0OoO0OO;

import android.content.Context;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import kotlin.coroutines.Continuation;
import o0O0oo0O.ViewOnClickListenerC26210OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOOo0.C27174OooO0O0;
import o0Oo00oO.C28035OooO00o;
import o0Oo0ooo.C28473OooOO0;
import o0Oo0ooo.C28477OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHWImageViewCreated$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {135, 135}, m80625m = "invokeSuspend")
public final class C28613OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginByThirdPartyChildFragment f101411OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101412OooOo0o;

    /* JADX INFO: renamed from: o0OoO0OO.OooOO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ LoginByThirdPartyChildFragment f101413OooOo0o;

        /* JADX INFO: renamed from: o0OoO0OO.OooOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHWImageViewCreated$1$1$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19918OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AuthorizeInfo f101414OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LoginByThirdPartyChildFragment f101415OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19918OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, AuthorizeInfo authorizeInfo, Continuation<? super C19918OooO00o> continuation) {
                super(2, continuation);
                this.f101415OooOo0o = loginByThirdPartyChildFragment;
                this.f101414OooOo = authorizeInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19918OooO00o(this.f101415OooOo0o, this.f101414OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19918OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101415OooOo0o;
                loginByThirdPartyChildFragment.f72590Oooo0O0.OooO00o(this.f101414OooOo.getIntent());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0OO.OooOO0o$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHWImageViewCreated$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {139}, m80625m = "emit")
        public static final class OooO0O0 extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f101416OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f101417OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f101418OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(OooO00o<? super T> oooO00o, Continuation<? super OooO0O0> continuation) {
                super(continuation);
                this.f101416OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f101417OooOo0o = obj;
                this.f101418OooOoO0 |= Integer.MIN_VALUE;
                return this.f101416OooOo.emit(null, this);
            }
        }

        public OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
            this.f101413OooOo0o = loginByThirdPartyChildFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(C27174OooO0O0<AuthorizeInfo> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            OooO0O0 oooO0O0;
            if (continuation instanceof OooO0O0) {
                oooO0O0 = (OooO0O0) continuation;
                int i = oooO0O0.f101418OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0O0.f101418OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO0O0 = new OooO0O0(this, continuation);
                }
            }
            Object obj = oooO0O0.f101417OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0O0.f101418OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AuthorizeInfo authorizeInfoOooO0O0 = c27174OooO0O0.OooO0O0();
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101413OooOo0o;
                if (authorizeInfoOooO0O0 != null) {
                    if (authorizeInfoOooO0O0.getIntent() != null) {
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                        C19918OooO00o c19918OooO00o = new C19918OooO00o(loginByThirdPartyChildFragment, authorizeInfoOooO0O0, null);
                        oooO0O0.f101418OooOoO0 = 1;
                        if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, c19918OooO00o, oooO0O0) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else if (authorizeInfoOooO0O0.getAuthCode() != null) {
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28602OooO(loginByThirdPartyChildFragment, authorizeInfoOooO0O0.getAuthCode(), null), 3);
                    } else {
                        LoginByThirdPartyChildFragment.OooOoO(loginByThirdPartyChildFragment);
                    }
                } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), LoginErrorCode.ERROR_CODE_NO_HMS_SDK_INSTALLED)) {
                    Context context = loginByThirdPartyChildFragment.getContext();
                    if (context != null) {
                        if (C28035OooO00o.OooO0O0(context, "com.huawei.hwid")) {
                            LoginByThirdPartyChildFragment.OooOoO0(loginByThirdPartyChildFragment);
                        } else {
                            String string = context.getString(R.string.hms_install_title);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            String string2 = context.getString(R.string.hms_install_content);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new ViewOnClickListenerC26210OooO00o(loginByThirdPartyChildFragment, 2)).show(loginByThirdPartyChildFragment.getChildFragmentManager(), "TipsDialogFragment");
                        }
                    }
                } else {
                    LoginByThirdPartyChildFragment.OooOoO(loginByThirdPartyChildFragment);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28613OooOO0o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C28613OooOO0o> continuation) {
        super(2, continuation);
        this.f101411OooOo = loginByThirdPartyChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28613OooOO0o(this.f101411OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28613OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (((oO0o0Oo.InterfaceC33721OooO0o) r8).collect(r1, r7) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101412OooOo0o;
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101411OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
            this.f101412OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28473OooOO0(c28477OooOOO0OooOoOO, 0, null, null), this);
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
        this.f101412OooOo0o = 2;
    }
}
