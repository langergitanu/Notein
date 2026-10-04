package o0OoO0OO;

import android.content.Context;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.thirdparty.LoginBindPhoneNumberFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0OoO0OO.InterfaceC28620OooOOoo;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.InterfaceC33672o00ooo;

/* JADX INFO: renamed from: o0OoO0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$observeAdditionalState$2", m80623f = "LoginBindPhoneNumberFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28604OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginBindPhoneNumberFragment f101382OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f101383OooOo0o;

    /* JADX INFO: renamed from: o0OoO0OO.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$observeAdditionalState$2$1", m80623f = "LoginBindPhoneNumberFragment.kt", m80624l = {44}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LoginBindPhoneNumberFragment f101384OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101385OooOo0o;

        /* JADX INFO: renamed from: o0OoO0OO.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$observeAdditionalState$2$1$1", m80623f = "LoginBindPhoneNumberFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19916OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C28623OooOo00, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LoginBindPhoneNumberFragment f101386OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f101387OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19916OooO00o(LoginBindPhoneNumberFragment loginBindPhoneNumberFragment, Continuation<? super C19916OooO00o> continuation) {
                super(2, continuation);
                this.f101386OooOo = loginBindPhoneNumberFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19916OooO00o c19916OooO00o = new C19916OooO00o(this.f101386OooOo, continuation);
                c19916OooO00o.f101387OooOo0o = obj;
                return c19916OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C28623OooOo00 c28623OooOo00, Continuation<? super C32460OooOooO> continuation) {
                return ((C19916OooO00o) create(c28623OooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                boolean z = !((C28623OooOo00) this.f101387OooOo0o).f101452OooO00o;
                TextView textView = this.f101386OooOo.f72567Oooo0;
                if (textView != null) {
                    textView.setEnabled(z);
                    return C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooOOOO("skipButton");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LoginBindPhoneNumberFragment loginBindPhoneNumberFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101384OooOo = loginBindPhoneNumberFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f101384OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101385OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = this.f101384OooOo;
                C28625OooOo0o c28625OooOo0o = (C28625OooOo0o) loginBindPhoneNumberFragment.f72569Oooo00o.getValue();
                C19916OooO00o c19916OooO00o = new C19916OooO00o(loginBindPhoneNumberFragment, null);
                this.f101385OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c28625OooOo0o.f101469OooO0oo, c19916OooO00o, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0OoO0OO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$observeAdditionalState$2$2", m80623f = "LoginBindPhoneNumberFragment.kt", m80624l = {50}, m80625m = "invokeSuspend")
    public static final class C19917OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LoginBindPhoneNumberFragment f101388OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101389OooOo0o;

        /* JADX INFO: renamed from: o0OoO0OO.OooO0O0$OooO0O0$OooO00o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$observeAdditionalState$2$2$1", m80623f = "LoginBindPhoneNumberFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC28620OooOOoo, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LoginBindPhoneNumberFragment f101390OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f101391OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(LoginBindPhoneNumberFragment loginBindPhoneNumberFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f101390OooOo = loginBindPhoneNumberFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f101390OooOo, continuation);
                oooO00o.f101391OooOo0o = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC28620OooOOoo interfaceC28620OooOOoo, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC28620OooOOoo, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC28620OooOOoo interfaceC28620OooOOoo = (InterfaceC28620OooOOoo) this.f101391OooOo0o;
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC28620OooOOoo, InterfaceC28620OooOOoo.OooO0O0.f101447OooO00o)) {
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC28620OooOOoo, InterfaceC28620OooOOoo.OooO00o.f101446OooO00o)) {
                        throw new C32442OooOO0o();
                    }
                    LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = this.f101390OooOo;
                    Context contextRequireContext = loginBindPhoneNumberFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = loginBindPhoneNumberFragment.getString(R.string.network_error);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19917OooO0O0(LoginBindPhoneNumberFragment loginBindPhoneNumberFragment, Continuation<? super C19917OooO0O0> continuation) {
            super(2, continuation);
            this.f101388OooOo = loginBindPhoneNumberFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C19917OooO0O0(this.f101388OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19917OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101389OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = this.f101388OooOo;
                C28625OooOo0o c28625OooOo0o = (C28625OooOo0o) loginBindPhoneNumberFragment.f72569Oooo00o.getValue();
                OooO00o oooO00o = new OooO00o(loginBindPhoneNumberFragment, null);
                this.f101389OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(c28625OooOo0o.f101470OooOO0, oooO00o, this) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28604OooO0O0(LoginBindPhoneNumberFragment loginBindPhoneNumberFragment, Continuation<? super C28604OooO0O0> continuation) {
        super(2, continuation);
        this.f101382OooOo = loginBindPhoneNumberFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28604OooO0O0 c28604OooO0O0 = new C28604OooO0O0(this.f101382OooOo, continuation);
        c28604OooO0O0.f101383OooOo0o = obj;
        return c28604OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super InterfaceC33672o00ooo> continuation) {
        return ((C28604OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f101383OooOo0o;
        LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = this.f101382OooOo;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(loginBindPhoneNumberFragment, null), 3);
        return C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19917OooO0O0(loginBindPhoneNumberFragment, null), 3);
    }
}
