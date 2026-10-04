package o0OoO0OO;

import androidx.lifecycle.C21989OooOooO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.login.AuthorizeInfo;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import kotlin.coroutines.Continuation;
import o0OOOo0.C27174OooO0O0;
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
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0OO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHonorImageViewCreated$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3, StyleIdentifier.GRID_TABLE_3}, m80625m = "invokeSuspend")
public final class C28615OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginByThirdPartyChildFragment f101431OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101432OooOo0o;

    /* JADX INFO: renamed from: o0OoO0OO.OooOOO0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ LoginByThirdPartyChildFragment f101433OooOo0o;

        /* JADX INFO: renamed from: o0OoO0OO.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHonorImageViewCreated$1$1$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19920OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AuthorizeInfo f101434OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LoginByThirdPartyChildFragment f101435OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19920OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, AuthorizeInfo authorizeInfo, Continuation<? super C19920OooO00o> continuation) {
                super(2, continuation);
                this.f101435OooOo0o = loginByThirdPartyChildFragment;
                this.f101434OooOo = authorizeInfo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19920OooO00o(this.f101435OooOo0o, this.f101434OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19920OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101435OooOo0o;
                loginByThirdPartyChildFragment.f72586Oooo0.OooO00o(this.f101434OooOo.getIntent());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0OO.OooOOO0$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.thirdparty.LoginByThirdPartyChildFragment$onHonorImageViewCreated$1$1$1", m80623f = "LoginByThirdPartyChildFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_7_COLORFUL}, m80625m = "emit")
        public static final class OooO0O0 extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ OooO00o<T> f101436OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f101437OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f101438OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO0O0(OooO00o<? super T> oooO00o, Continuation<? super OooO0O0> continuation) {
                super(continuation);
                this.f101436OooOo = oooO00o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f101437OooOo0o = obj;
                this.f101438OooOoO0 |= Integer.MIN_VALUE;
                return this.f101436OooOo.emit(null, this);
            }
        }

        public OooO00o(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment) {
            this.f101433OooOo0o = loginByThirdPartyChildFragment;
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
                int i = oooO0O0.f101438OooOoO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooO0O0.f101438OooOoO0 = i - Integer.MIN_VALUE;
                } else {
                    oooO0O0 = new OooO0O0(this, continuation);
                }
            }
            Object obj = oooO0O0.f101437OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = oooO0O0.f101438OooOoO0;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                AuthorizeInfo authorizeInfoOooO0O0 = c27174OooO0O0.OooO0O0();
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101433OooOo0o;
                if (authorizeInfoOooO0O0 == null) {
                    C34406OooO00o.f123390OooO00o.OooO00o(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("honor authorize error code is: ", c27174OooO0O0.getErrorCode()), new Object[0]);
                    LoginByThirdPartyChildFragment.OooOoO(loginByThirdPartyChildFragment);
                } else if (authorizeInfoOooO0O0.getIntent() != null) {
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                    C19920OooO00o c19920OooO00o = new C19920OooO00o(loginByThirdPartyChildFragment, authorizeInfoOooO0O0, null);
                    oooO0O0.f101438OooOoO0 = 1;
                    if (C33609OooO0oo.OooO0o(abstractC33687OooO0oO, c19920OooO00o, oooO0O0) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else if (authorizeInfoOooO0O0.getAuthCode() != null) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28611OooOO0(loginByThirdPartyChildFragment, authorizeInfoOooO0O0.getAuthCode(), null), 3);
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
    public C28615OooOOO0(LoginByThirdPartyChildFragment loginByThirdPartyChildFragment, Continuation<? super C28615OooOOO0> continuation) {
        super(2, continuation);
        this.f101431OooOo = loginByThirdPartyChildFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28615OooOOO0(this.f101431OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28615OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (((oO0o0Oo.InterfaceC33721OooO0o) r7).collect(r1, r6) == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101432OooOo0o;
        LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = this.f101431OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28477OooOOO0 c28477OooOOO0OooOoOO = loginByThirdPartyChildFragment.OooOoOO();
            this.f101432OooOo0o = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28473OooOO0(c28477OooOOO0OooOoOO, 2, null, null), this);
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
        this.f101432OooOo0o = 2;
    }
}
