package o0OooOoo;

import android.content.Context;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.LoginActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.entry.LoginContainerFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0Oo0ooo.C28477OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33740OooOoO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OooOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginContainerFragment$observeLoginState$1", m80623f = "LoginContainerFragment.kt", m80624l = {86}, m80625m = "invokeSuspend")
public final class C29580OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ LoginContainerFragment f104906OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104907OooOo0o;

    /* JADX INFO: renamed from: o0OooOoo.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginContainerFragment$observeLoginState$1$1", m80623f = "LoginContainerFragment.kt", m80624l = {90}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ LoginContainerFragment f104908OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f104909OooOo0o;

        /* JADX INFO: renamed from: o0OooOoo.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20007OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ LoginContainerFragment f104910OooOo0o;

            public C20007OooO00o(LoginContainerFragment loginContainerFragment) {
                this.f104910OooOo0o = loginContainerFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                LoginContainerFragment loginContainerFragment = this.f104910OooOo0o;
                Context context = loginContainerFragment.getContext();
                if (context != null) {
                    String string = loginContainerFragment.getString(R.string.login_successfully);
                    OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                ActivityC21897OooOo0 activity = loginContainerFragment.getActivity();
                LoginActivity loginActivity = activity instanceof LoginActivity ? (LoginActivity) activity : null;
                if (loginActivity != null) {
                    loginActivity.finish();
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OooOoo.OooO0OO$OooO00o$OooO0O0 */
        public static final class OooO0O0 implements InterfaceC33721OooO0o<String> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ C33769Ooooo0o f104911OooOo0o;

            /* JADX INFO: renamed from: o0OooOoo.OooO0OO$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C20008OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC33723OooO0oO f104912OooOo0o;

                /* JADX INFO: renamed from: o0OooOoo.OooO0OO$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginContainerFragment$observeLoginState$1$1$invokeSuspend$$inlined$filter$1$2", m80623f = "LoginContainerFragment.kt", m80624l = {50}, m80625m = "emit")
                public static final class C20009OooO00o extends AbstractC32479OooO0OO {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public int f104913OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ Object f104914OooOo0o;

                    public C20009OooO00o(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        this.f104914OooOo0o = obj;
                        this.f104913OooOo |= Integer.MIN_VALUE;
                        return C20008OooO00o.this.emit(null, this);
                    }
                }

                public C20008OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                    this.f104912OooOo0o = interfaceC33723OooO0oO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C20009OooO00o c20009OooO00o;
                    if (continuation instanceof C20009OooO00o) {
                        c20009OooO00o = (C20009OooO00o) continuation;
                        int i = c20009OooO00o.f104913OooOo;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c20009OooO00o.f104913OooOo = i - Integer.MIN_VALUE;
                        } else {
                            c20009OooO00o = new C20009OooO00o(continuation);
                        }
                    }
                    Object obj2 = c20009OooO00o.f104914OooOo0o;
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i2 = c20009OooO00o.f104913OooOo;
                    if (i2 == 0) {
                        C32446OooOOOo.OooO0O0(obj2);
                        if (((String) obj).length() > 0) {
                            c20009OooO00o.f104913OooOo = 1;
                            if (this.f104912OooOo0o.emit(obj, c20009OooO00o) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            public OooO0O0(C33769Ooooo0o c33769Ooooo0o) {
                this.f104911OooOo0o = c33769Ooooo0o;
            }

            @Override // oO0o0Oo.InterfaceC33721OooO0o
            public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
                Object objCollect = this.f104911OooOo0o.f121747OooOo0o.collect(new C20008OooO00o(interfaceC33723OooO0oO), continuation);
                return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LoginContainerFragment loginContainerFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104908OooOo = loginContainerFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f104908OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f104909OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LoginContainerFragment loginContainerFragment = this.f104908OooOo;
                C33740OooOoO c33740OooOoO = new C33740OooOoO(new OooO0O0(((C28477OooOOO0) loginContainerFragment.f72180OooOoo0.getValue()).f100899OooO0oO));
                C20007OooO00o c20007OooO00o = new C20007OooO00o(loginContainerFragment);
                this.f104909OooOo0o = 1;
                if (c33740OooOoO.collect(c20007OooO00o, this) == enumC32485OooO00o) {
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
    public C29580OooO0OO(LoginContainerFragment loginContainerFragment, Continuation<? super C29580OooO0OO> continuation) {
        super(2, continuation);
        this.f104906OooOo = loginContainerFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29580OooO0OO(this.f104906OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29580OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104907OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            LoginContainerFragment loginContainerFragment = this.f104906OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = loginContainerFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(loginContainerFragment, null);
            this.f104907OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
