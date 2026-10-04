package com.orion.notein.p607ui.login.entry;

import OooO0oO.C20439OooO0oo;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.entry.LoginTipsDialogFragment;
import com.orion.notein.ui.login.entry.LoginTipsDialogFragment.OooO00o;
import com.orion.notein.ui.login.entry.LoginTipsDialogFragment.OooO0o;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0O0oooO.C26320o0000OoO;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import o0OoO0oo.ViewOnClickListenerC28958o00oOo0o;
import o0OooOoo.C29577OooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/entry/LoginTipsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginTipsDialogFragment extends Hilt_LoginTipsDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72203Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f72204Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f72205Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72206Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginTipsDialogFragment$onCreate$1$1", m80623f = "LoginTipsDialogFragment.kt", m80624l = {45}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72208OooOo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LoginTipsDialogFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72208OooOo0o;
            LoginTipsDialogFragment loginTipsDialogFragment = LoginTipsDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) loginTipsDialogFragment.f72205Oooo00O.getValue();
                this.f72208OooOo0o = 1;
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
                LoginTipsDialogFragment.Oooo00o(loginTipsDialogFragment);
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
            return LoginTipsDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return LoginTipsDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginTipsDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23153OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23153OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return LoginTipsDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.entry.LoginTipsDialogFragment$startLoginActivityForResult$1$1", m80623f = "LoginTipsDialogFragment.kt", m80624l = {74}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72213OooOo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return LoginTipsDialogFragment.this.new OooO0o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72213OooOo0o;
            LoginTipsDialogFragment loginTipsDialogFragment = LoginTipsDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) loginTipsDialogFragment.f72205Oooo00O.getValue();
                this.f72213OooOo0o = 1;
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
                LoginTipsDialogFragment.Oooo00o(loginTipsDialogFragment);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.entry.LoginTipsDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23154OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23154OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            LoginTipsDialogFragment loginTipsDialogFragment = LoginTipsDialogFragment.this;
            Bundle arguments = loginTipsDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + loginTipsDialogFragment + " has null arguments");
        }
    }

    public LoginTipsDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72204Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C29577OooO.class), new C23154OooO0o0());
        this.f72205Oooo00O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23153OooO0Oo(), new OooO0OO());
        OooOOO0.OooO0o(registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0OooOoo.OooO0oO
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                OooOOO0.OooO0oO(result, "result");
                LoginTipsDialogFragment loginTipsDialogFragment = this.f104919OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = loginTipsDialogFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, loginTipsDialogFragment.new OooO0o(null), 3);
            }
        }), "registerForActivityResult(...)");
    }

    public static final void Oooo00o(LoginTipsDialogFragment loginTipsDialogFragment) {
        C29577OooO c29577OooO = (C29577OooO) loginTipsDialogFragment.f72204Oooo000.getValue();
        Bundle bundle = new Bundle();
        bundle.putString("message", c29577OooO.f104901OooO00o);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Uri.class);
        Parcelable parcelable = c29577OooO.f104902OooO0O0;
        if (zIsAssignableFrom) {
            bundle.putParcelable("imported_uri", parcelable);
        } else if (Serializable.class.isAssignableFrom(Uri.class)) {
            bundle.putSerializable("imported_uri", (Serializable) parcelable);
        }
        bundle.putBoolean("login_successfully", true);
        loginTipsDialogFragment.getParentFragmentManager().OooooOo(bundle, "LoginTipsDialogFragment");
        loginTipsDialogFragment.dismiss();
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_login_tips_dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21904OooOoo0.OooO0oO(this, "key_firebase_login", new InterfaceC32508OooOOOo() { // from class: o0OooOoo.OooO0oo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                OooOOO0.OooO0oO((String) obj, "<unused var>");
                OooOOO0.OooO0oO((Bundle) obj2, "<unused var>");
                LoginTipsDialogFragment loginTipsDialogFragment = this.f104920OooOo0o;
                InterfaceC21987OooOoo viewLifecycleOwner = loginTipsDialogFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, loginTipsDialogFragment.new OooO00o(null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        View viewFindViewById = view.findViewById(R.id.btn_login);
        this.f72206Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnLogin");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28958o00oOo0o(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f72203Oooo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28591o0000oOO(this, 2));
        TextView textView = (TextView) view.findViewById(R.id.message);
        if (textView != null) {
            textView.setText(((C29577OooO) this.f72204Oooo000.getValue()).f104901OooO00o);
        } else {
            OooOOO0.OooOOOO("txtMessage");
            throw null;
        }
    }
}
