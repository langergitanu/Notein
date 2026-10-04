package com.orion.notein.p607ui.login.entry;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.login.entry.LoginDialogFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24586OooOoOO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooo.C28477OooOOO0;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OooOoo.C29583OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33740OooOoO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/entry/LoginDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginDialogFragment extends Hilt_LoginDialogFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72187Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28477OooOOO0.class), new OooO0O0(), new C23152OooO0Oo(), new OooO0OO());

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C24586OooOoOO f72188Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C29583OooO0o0 f72189Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginDialogFragment$onViewCreated$4", m80623f = "LoginDialogFragment.kt", m80624l = {61}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72191OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginDialogFragment$onViewCreated$4$1", m80623f = "LoginDialogFragment.kt", m80624l = {65}, m80625m = "invokeSuspend")
        public static final class C19217OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ LoginDialogFragment f72192OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f72193OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19218OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ LoginDialogFragment f72194OooOo0o;

                public C19218OooO00o(LoginDialogFragment loginDialogFragment) {
                    this.f72194OooOo0o = loginDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    LoginDialogFragment loginDialogFragment = this.f72194OooOo0o;
                    loginDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("login_success", Boolean.TRUE)), "login_dialog_result");
                    loginDialogFragment.dismiss();
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO00o$OooO00o$OooO0O0 */
            public static final class OooO0O0 implements InterfaceC33721OooO0o<String> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ C33769Ooooo0o f72195OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                public static final class C19219OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ InterfaceC33723OooO0oO f72196OooOo0o;

                    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO00o$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginDialogFragment$onViewCreated$4$1$invokeSuspend$$inlined$filter$1$2", m80623f = "LoginDialogFragment.kt", m80624l = {50}, m80625m = "emit")
                    public static final class C19220OooO00o extends AbstractC32479OooO0OO {

                        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                        public int f72197OooOo;

                        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                        public /* synthetic */ Object f72198OooOo0o;

                        public C19220OooO00o(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // oO00ooo.AbstractC32477OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.f72198OooOo0o = obj;
                            this.f72197OooOo |= Integer.MIN_VALUE;
                            return C19219OooO00o.this.emit(null, this);
                        }
                    }

                    public C19219OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                        this.f72196OooOo0o = interfaceC33723OooO0oO;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        C19220OooO00o c19220OooO00o;
                        if (continuation instanceof C19220OooO00o) {
                            c19220OooO00o = (C19220OooO00o) continuation;
                            int i = c19220OooO00o.f72197OooOo;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                c19220OooO00o.f72197OooOo = i - Integer.MIN_VALUE;
                            } else {
                                c19220OooO00o = new C19220OooO00o(continuation);
                            }
                        }
                        Object obj2 = c19220OooO00o.f72198OooOo0o;
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        int i2 = c19220OooO00o.f72197OooOo;
                        if (i2 == 0) {
                            C32446OooOOOo.OooO0O0(obj2);
                            if (((String) obj).length() > 0) {
                                c19220OooO00o.f72197OooOo = 1;
                                if (this.f72196OooOo0o.emit(obj, c19220OooO00o) == enumC32485OooO00o) {
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
                    this.f72195OooOo0o = c33769Ooooo0o;
                }

                @Override // oO0o0Oo.InterfaceC33721OooO0o
                public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
                    Object objCollect = this.f72195OooOo0o.f121747OooOo0o.collect(new C19219OooO00o(interfaceC33723OooO0oO), continuation);
                    return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19217OooO00o(LoginDialogFragment loginDialogFragment, Continuation<? super C19217OooO00o> continuation) {
                super(2, continuation);
                this.f72192OooOo = loginDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19217OooO00o(this.f72192OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19217OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f72193OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    LoginDialogFragment loginDialogFragment = this.f72192OooOo;
                    C33740OooOoO c33740OooOoO = new C33740OooOoO(new OooO0O0(((C28477OooOOO0) loginDialogFragment.f72187Oooo000.getValue()).f100899OooO0oO));
                    C19218OooO00o c19218OooO00o = new C19218OooO00o(loginDialogFragment);
                    this.f72193OooOo0o = 1;
                    if (c33740OooOoO.collect(c19218OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LoginDialogFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72191OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                LoginDialogFragment loginDialogFragment = LoginDialogFragment.this;
                InterfaceC21987OooOoo viewLifecycleOwner = loginDialogFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                C19217OooO00o c19217OooO00o = new C19217OooO00o(loginDialogFragment, null);
                this.f72191OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19217OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return LoginDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LoginDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23152OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23152OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LoginDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.container);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void OooOoO0() {
        C24586OooOoOO c24586OooOoOO = this.f72188Oooo00O;
        if (c24586OooOoOO == null || !c24586OooOoOO.OooOOo0()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_login_container;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C29583OooO0o0 c29583OooO0o0;
        C24586OooOoOO c24586OooOoOO = this.f72188Oooo00O;
        if (c24586OooOoOO != null && (c29583OooO0o0 = this.f72189Oooo00o) != null) {
            c24586OooOoOO.OooOo0o(c29583OooO0o0);
        }
        this.f72189Oooo00o = null;
        this.f72188Oooo00O = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [o000o0O0.OooOO0o$OooO0O0, o0OooOoo.OooO0o0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Fragment fragmentOooOooO = getChildFragmentManager().OooOooO(R.id.nav_host_fragment);
        NavHostFragment navHostFragment = fragmentOooOooO instanceof NavHostFragment ? (NavHostFragment) fragmentOooOooO : null;
        this.f72188Oooo00O = navHostFragment != null ? navHostFragment.OooOoO0() : null;
        view.findViewById(R.id.btn_close).setOnClickListener(new ViewOnClickListenerC28583o0000OoO(this, 1));
        final View viewFindViewById = view.findViewById(R.id.btn_back);
        OooOOO0.OooO0Oo(viewFindViewById);
        C28050OooO0OO.OooO00o(viewFindViewById, 1500L, new ViewOnClickListenerC28586o0000o0(this, 2));
        C24586OooOoOO c24586OooOoOO = this.f72188Oooo00O;
        viewFindViewById.setVisibility((c24586OooOoOO != null ? c24586OooOoOO.OooOO0O() : null) != null ? 0 : 8);
        final TextView textView = (TextView) view.findViewById(R.id.tv_title);
        ?? r0 = new C24572OooOO0o.OooO0O0() { // from class: o0OooOoo.OooO0o0
            @Override // o000o0O0.C24572OooOO0o.OooO0O0
            public final void OooO00o(C24572OooOO0o c24572OooOO0o, C24583OooOo0o destination, Bundle bundle2) {
                OooOOO0.OooO0oO(c24572OooOO0o, "<unused var>");
                OooOOO0.OooO0oO(destination, "destination");
                CharSequence string = destination.f83297OooOoO;
                LoginDialogFragment loginDialogFragment = this;
                if (string == null) {
                    Context context = loginDialogFragment.getContext();
                    string = context != null ? context.getString(R.string.login_or_register) : null;
                    if (string == null) {
                        string = "";
                    }
                }
                textView.setText(string);
                View view2 = viewFindViewById;
                C24586OooOoOO c24586OooOoOO2 = loginDialogFragment.f72188Oooo00O;
                view2.setVisibility((c24586OooOoOO2 != null ? c24586OooOoOO2.OooOO0O() : null) != null ? 0 : 8);
            }
        };
        C24586OooOoOO c24586OooOoOO2 = this.f72188Oooo00O;
        if (c24586OooOoOO2 != 0) {
            c24586OooOoOO2.OooO0O0(r0);
        }
        this.f72189Oooo00o = r0;
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("show_forbidden_tip") : false) {
            String string = getString(R.string.tips);
            OooOOO0.OooO0o(string, "getString(...)");
            String string2 = getString(R.string.login_devices_reach_limit);
            OooOOO0.OooO0o(string2, "getString(...)");
            new TipsDialogFragment(string, string2, null, null, null, null, 0, null, 384).show(getParentFragmentManager(), "TipsDialogFragment");
        }
    }
}
