package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o00o00.C25206OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.C28560OoooOOO;
import o0OoO000.ViewOnClickListenerC28585o0000o;
import o0OoO000.ViewOnClickListenerC28588o0000o0o;
import o0OoO000.ViewOnClickListenerC28591o0000oOO;
import oO00ooO.C32447OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseUserResetPasswordFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserResetPasswordFragment extends Hilt_FirebaseUserResetPasswordFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f72409Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72410Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f72411Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72412Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public CircularProgressIndicator f72413Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewGroup f72414Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public EditText f72415Oooo0o0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseUserResetPasswordFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72417OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72417OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f72417OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72418OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72418OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f72418OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserResetPasswordFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23178OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72419OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23178OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72419OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseUserResetPasswordFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f72419OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public FirebaseUserResetPasswordFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0(c32447OooOOoOooO0OO);
        this.f72410Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28560OoooOOO.class), oooO0O0, new C23178OooO0Oo(c32447OooOOoOooO0OO), new OooO0OO(c32447OooOOoOooO0OO));
    }

    public static void Oooo00o(FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment, String str) {
        Context context = firebaseUserResetPasswordFragment.getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, str);
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_user_reset_password;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72411Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28588o0000o0o(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_back);
        this.f72412Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28585o0000o(this, 0));
        this.f72414Oooo0OO = (ViewGroup) view.findViewById(R.id.cl_email_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_email);
        this.f72415Oooo0o0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o0000oO0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101331OooO00o.f72414Oooo0OO;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("emailWrapper");
                    throw null;
                }
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        this.f72409Oooo0 = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28591o0000oOO(this, 0));
        this.f72413Oooo0O0 = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
    }
}
