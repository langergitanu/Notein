package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0O0o0oO.o000000O;
import o0O0o0oO.o000OOo;
import o0O0o0oO.o0O0O00;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28291OooO0OO;
import o0OoO000.C28533OooOOo0;
import o0OoO000.C28560OoooOOO;
import o0OoO000.OooOOO;
import o0OoO000.ViewOnClickListenerC28529OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseCreateUserSetNameFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseCreateUserSetNameFragment extends Hilt_FirebaseCreateUserSetNameFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72266Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72267Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f72268Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72269Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ViewGroup f72270Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public EditText f72271Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public CircularProgressIndicator f72272Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f72273Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f72274Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f72275Oooo0oo;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$onViewCreated$7", m80623f = "FirebaseCreateUserSetNameFragment.kt", m80624l = {115}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72277OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19221OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FirebaseCreateUserSetNameFragment f72278OooOo0o;

            public C19221OooO00o(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment) {
                this.f72278OooOo0o = firebaseCreateUserSetNameFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                this.f72278OooOo0o.Oooo0(((Number) obj).intValue());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseCreateUserSetNameFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72277OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = FirebaseCreateUserSetNameFragment.this;
            C33772OooooOo c33772OooooOo = ((C28560OoooOOO) firebaseCreateUserSetNameFragment.f72268Oooo00O.getValue()).f101230OooOO0o;
            C19221OooO00o c19221OooO00o = new C19221OooO00o(firebaseCreateUserSetNameFragment);
            this.f72277OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, c19221OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseCreateUserSetNameFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseCreateUserSetNameFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23162OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23162OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseCreateUserSetNameFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72282OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72282OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f72282OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23163OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23163OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseCreateUserSetNameFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23164OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72284OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23164OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72284OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f72284OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23165OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72285OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23165OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72285OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseCreateUserSetNameFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f72285OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public FirebaseCreateUserSetNameFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72267Oooo000 = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23162OooO0Oo(), new OooO0OO());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23163OooO0o0());
        OooO0o oooO0o = new OooO0o(c32447OooOOoOooO0OO);
        this.f72268Oooo00O = new C22026ooOO(oooo0.OooO0O0(C28560OoooOOO.class), oooO0o, new C23165OooO0oo(c32447OooOOoOooO0OO), new C23164OooO0oO(c32447OooOOoOooO0OO));
    }

    public static final void Oooo00o(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment, String str) {
        InterfaceC21987OooOoo viewLifecycleOwner = firebaseCreateUserSetNameFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0OoO000.OooOOOO(firebaseCreateUserSetNameFragment, str, null), 3);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_create_user_name;
    }

    public final void Oooo0(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebaseSetNameFragment", "handleLoginResult: ", i), new Object[0]);
        if (i == 1000) {
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooOOO(this, null), 3);
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String strOooO0OO = C21335Oooo0oO.OooO0OO(contextRequireContext, i);
        TextView textView = this.f72273Oooo0o0;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = this.f72273Oooo0o0;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText(getString(R.string._continue));
        CircularProgressIndicator circularProgressIndicator = this.f72272Oooo0o;
        if (circularProgressIndicator == null) {
            OooOOO0.OooOOOO("cpiBtnContinue");
            throw null;
        }
        circularProgressIndicator.setVisibility(8);
        C21989OooOooO.OooO00o(this).OooO0O0(new C28533OooOOo0(this, strOooO0OO, null));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72269Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o0O0O00(this, 2));
        View viewFindViewById2 = view.findViewById(R.id.btn_back);
        this.f72266Oooo0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new o000OOo(this, 1));
        this.f72270Oooo0O0 = (ViewGroup) view.findViewById(R.id.cl_username_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_username);
        this.f72271Oooo0OO = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etUsername");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.OooOO0O
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101136OooO00o.f72270Oooo0O0;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("usernameWrapper");
                    throw null;
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        this.f72273Oooo0o0 = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new o000000O(this, 2));
        this.f72272Oooo0o = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
        View viewFindViewById3 = view.findViewById(R.id.btn_terms);
        this.f72274Oooo0oO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28291OooO0OO(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.btn_privacy);
        this.f72275Oooo0oo = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC28529OooOO0o(this, 0));
        TextView textView2 = (TextView) view.findViewById(R.id.tv_title_2);
        FirebaseUser currentUser = ((C28560OoooOOO) this.f72268Oooo00O.getValue()).f101228OooOO0.getCurrentUser();
        String email = currentUser != null ? currentUser.getEmail() : null;
        if (email == null || email.length() == 0) {
            Oooo0(1004);
        } else {
            SpannableString spannableString = new SpannableString(getString(R.string.content_created_account, email));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.color_primary_blue));
            int iOooo0O0 = C33599OooOo0O.Oooo0O0(spannableString, email, 0, false, 6);
            spannableString.setSpan(foregroundColorSpan, iOooo0O0, email.length() + iOooo0O0, 33);
            textView2.setText(spannableString, TextView.BufferType.SPANNABLE);
        }
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO00o(null), 3);
    }
}
