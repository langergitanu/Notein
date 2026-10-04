package com.orion.notein.p607ui.login.entry;

import OooO0Oo.AbstractC20413OooOo0O;
import OooO0oO.C20439OooO0oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.google.firebase.inappmessaging.internal.C22739OooOoO0;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.entry.WelcomeFragment;
import com.orion.notein.ui.login.entry.WelcomeFragment.OooO0O0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0OoOO00.ViewOnClickListenerC28989OooO00o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/entry/WelcomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class WelcomeFragment extends Hilt_WelcomeFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ViewGroup f72215OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f72216OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new C23155OooO0Oo(), new OooO0o(), new C23156OooO0o0());

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewGroup f72217OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f72218OooOooo;

    public static final class OooO00o extends AbstractC20413OooOo0O {
        public OooO00o() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            WelcomeFragment welcomeFragment = WelcomeFragment.this;
            if (System.currentTimeMillis() - welcomeFragment.f72218OooOooo < 2000) {
                welcomeFragment.requireActivity().finish();
                return;
            }
            Context contextRequireContext = welcomeFragment.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = welcomeFragment.getString(R.string.toast_exit_app_double_check);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
            welcomeFragment.f72218OooOooo = System.currentTimeMillis();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.WelcomeFragment$onCreate$2$1", m80623f = "WelcomeFragment.kt", m80624l = {49}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72221OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return WelcomeFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72221OooOo0o;
            WelcomeFragment welcomeFragment = WelcomeFragment.this;
            C22026ooOO c22026ooOO = welcomeFragment.f72216OooOoo0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) c22026ooOO.getValue();
                this.f72221OooOo0o = 1;
                obj = c26320o0000OoO.OooO0oo(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((C26320o0000OoO) c22026ooOO.getValue()).OooOO0();
                C21030OooOO0o.OooO0OO(welcomeFragment).OooOOo(R.id.noteListContainerFragment, false);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.WelcomeFragment$onViewCreated$1", m80623f = "WelcomeFragment.kt", m80624l = {85}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72223OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ WelcomeFragment f72224OooOo0o;

            public OooO00o(WelcomeFragment welcomeFragment) {
                this.f72224OooOo0o = welcomeFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                if (((NoteinFirebaseUser) obj) != null) {
                    WelcomeFragment welcomeFragment = this.f72224OooOo0o;
                    ((C26320o0000OoO) welcomeFragment.f72216OooOoo0.getValue()).OooOO0();
                    C21030OooOO0o.OooO0OO(welcomeFragment).OooOOo(R.id.noteListContainerFragment, false);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return WelcomeFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72223OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                WelcomeFragment welcomeFragment = WelcomeFragment.this;
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) welcomeFragment.f72216OooOoo0.getValue();
                OooO00o oooO00o = new OooO00o(welcomeFragment);
                this.f72223OooOo0o = 1;
                if (c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.WelcomeFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23155OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23155OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return WelcomeFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return WelcomeFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.WelcomeFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23156OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23156OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return WelcomeFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.WelcomeFragment$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.WelcomeFragment$startLoginActivityForResult$1$1", m80623f = "WelcomeFragment.kt", m80624l = {108}, m80625m = "invokeSuspend")
    public static final class C23157OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72229OooOo0o;

        public C23157OooO0oO(Continuation<? super C23157OooO0oO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return WelcomeFragment.this.new C23157OooO0oO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C23157OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72229OooOo0o;
            WelcomeFragment welcomeFragment = WelcomeFragment.this;
            C22026ooOO c22026ooOO = welcomeFragment.f72216OooOoo0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) c22026ooOO.getValue();
                this.f72229OooOo0o = 1;
                obj = c26320o0000OoO.OooO0oo(this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((C26320o0000OoO) c22026ooOO.getValue()).OooOO0();
                C21030OooOO0o.OooO0OO(welcomeFragment).OooOOo(R.id.noteListContainerFragment, false);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public WelcomeFragment() {
        OooOOO0.OooO0o(registerForActivityResult(new C20439OooO0oo(), new C22739OooOoO0(this, 2)), "registerForActivityResult(...)");
    }

    public final void OooOoO() {
        boolean z = getResources().getConfiguration().orientation == 1;
        ViewGroup viewGroup = this.f72217OooOooO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("welcomePageLand");
            throw null;
        }
        viewGroup.setVisibility(!z ? 0 : 8);
        ViewGroup viewGroup2 = this.f72215OooOoo;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(z ? 0 : 8);
        } else {
            OooOOO0.OooOOOO("welcomePage");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        OooOOO0.OooO0oO(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        OooOoO();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, new OooO00o());
        C21904OooOoo0.OooO0oO(this, "key_firebase_login", new InterfaceC32508OooOOOo() { // from class: o0OooOoo.OooOO0O
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                OooOOO0.OooO0oO((String) obj, "<unused var>");
                OooOOO0.OooO0oO((Bundle) obj2, "<unused var>");
                WelcomeFragment welcomeFragment = this.f104921OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = welcomeFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, welcomeFragment.new OooO0O0(null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_login, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC28989OooO00o viewOnClickListenerC28989OooO00o = new ViewOnClickListenerC28989OooO00o(this, 1);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.welcome_page);
        this.f72215OooOoo = viewGroup;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("welcomePage");
            throw null;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.btn_login);
        if (textView != null) {
            textView.setOnClickListener(viewOnClickListenerC28989OooO00o);
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.welcome_page_land);
        this.f72217OooOooO = viewGroup2;
        if (viewGroup2 == null) {
            OooOOO0.OooOOOO("welcomePageLand");
            throw null;
        }
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.btn_login_land);
        if (textView2 != null) {
            textView2.setOnClickListener(viewOnClickListenerC28989OooO00o);
        }
        OooOoO();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0OO(null), 3);
    }
}
