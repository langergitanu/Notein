package o0oOoO0;

import android.content.Context;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.domain.models.login.LoginErrorCode;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.oo0o0Oo;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OOOo0.C27174OooO0O0;
import o0Oo00oO.C28035OooO00o;
import o0OoO0.C28513OooO0oO;
import oO00ooO.C32444OooOOO0;
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
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;

/* JADX INFO: renamed from: o0oOoO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleBindHW$1", m80623f = "UserSettingFragment.kt", m80624l = {492, 492}, m80625m = "invokeSuspend")
public final class C30994OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UserSettingFragment f110693OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110694OooOo0o;

    /* JADX INFO: renamed from: o0oOoO0.OooO0O0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ UserSettingFragment f110695OooOo0o;

        /* JADX INFO: renamed from: o0oOoO0.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleBindHW$1$1$1$1", m80623f = "UserSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20145OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AuthorizeInfo f110696OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ UserSettingFragment f110697OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20145OooO00o(UserSettingFragment userSettingFragment, AuthorizeInfo authorizeInfo, Continuation<? super C20145OooO00o> continuation) {
                super(2, continuation);
                this.f110697OooOo0o = userSettingFragment;
                this.f110696OooOo = authorizeInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20145OooO00o(this.f110697OooOo0o, this.f110696OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20145OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                UserSettingFragment userSettingFragment = this.f110697OooOo0o;
                userSettingFragment.f79864OoooOo0.OooO00o(this.f110696OooOo.getIntent());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0oOoO0.OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.home.UserSettingFragment$handleBindHW$1$1", m80623f = "UserSettingFragment.kt", m80624l = {496}, m80625m = "emit")
        public static final class C20146OooO0O0 extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f110698OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110699OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f110700OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20146OooO0O0(OooO00o<? super T> oooO00o, Continuation<? super C20146OooO0O0> continuation) {
                super(continuation);
                this.f110698OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110699OooOo0o = obj;
                this.f110700OooOoO0 |= Integer.MIN_VALUE;
                return this.f110698OooOo.emit(null, this);
            }
        }

        public OooO00o(UserSettingFragment userSettingFragment) {
            this.f110695OooOo0o = userSettingFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(C27174OooO0O0<AuthorizeInfo> c27174OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            C20146OooO0O0 c20146OooO0O0;
            if (continuation instanceof C20146OooO0O0) {
                c20146OooO0O0 = (C20146OooO0O0) continuation;
                int i = c20146OooO0O0.f110700OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20146OooO0O0.f110700OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    c20146OooO0O0 = new C20146OooO0O0(this, continuation);
                }
            }
            Object obj = c20146OooO0O0.f110699OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20146OooO0O0.f110700OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AuthorizeInfo authorizeInfoOooO0O0 = c27174OooO0O0.OooO0O0();
                UserSettingFragment userSettingFragment = this.f110695OooOo0o;
                if (authorizeInfoOooO0O0 != null) {
                    if (authorizeInfoOooO0O0.getIntent() != null) {
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                        C20145OooO00o c20145OooO00o = new C20145OooO00o(userSettingFragment, authorizeInfoOooO0O0, null);
                        c20146OooO0O0.f110700OooOoO0 = 1;
                        if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, c20145OooO00o, c20146OooO0O0) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else if (authorizeInfoOooO0O0.getAuthCode() != null) {
                        String authCode = authorizeInfoOooO0O0.getAuthCode();
                        InterfaceC21987OooOoo viewLifecycleOwner = userSettingFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30996OooO0Oo(userSettingFragment, authCode, null), 3);
                    }
                } else if (OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), LoginErrorCode.ERROR_CODE_NO_HMS_SDK_INSTALLED)) {
                    Context context = userSettingFragment.getContext();
                    if (context != null) {
                        if (C28035OooO00o.OooO0O0(context, "com.huawei.hwid")) {
                            UserSettingFragment.OooOoO(userSettingFragment);
                        } else {
                            String string = context.getString(R.string.hms_install_title);
                            OooOOO0.OooO0o(string, "getString(...)");
                            String string2 = context.getString(R.string.hms_install_content);
                            OooOOO0.OooO0o(string2, "getString(...)");
                            new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new oo0o0Oo(userSettingFragment, 5)).show(userSettingFragment.getChildFragmentManager(), "TipsDialogFragment");
                        }
                    }
                } else {
                    Context context2 = userSettingFragment.getContext();
                    if (context2 != null) {
                        C28513OooO0oO.OooO00o(context2, R.string.network_error, "getString(...)", context2);
                    }
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
    public C30994OooO0O0(UserSettingFragment userSettingFragment, Continuation<? super C30994OooO0O0> continuation) {
        super(2, continuation);
        this.f110693OooOo = userSettingFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30994OooO0O0(this.f110693OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30994OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110694OooOo0o;
        UserSettingFragment userSettingFragment = this.f110693OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            userSettingFragment.OooOoOO();
            this.f110694OooOo0o = 1;
            throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            OooO00o oooO00o = new OooO00o(userSettingFragment);
            this.f110694OooOo0o = 2;
            if (((InterfaceC33721OooO0o) obj).collect(oooO00o, this) == enumC32485OooO00o) {
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
