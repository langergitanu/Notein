package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import OooooOO.C21335Oooo0oO;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o00o00.C25206OooO0Oo;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0Oo0oO0.ViewOnClickListenerC28296OooO0oo;
import o0OoO000.C28536OooOo0O;
import o0OoO000.C28539OooOoO0;
import o0OoO000.C28560OoooOOO;
import o0OoO000.OooOo00;
import o0OoO000.ViewOnClickListenerC28534OooOOoo;
import o0OoO000.ViewOnClickListenerC28535OooOo0;
import oO00ooO.C32447OooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseCreateUserVerificationFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseCreateUserVerificationFragment extends Hilt_FirebaseCreateUserVerificationFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72287Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72288Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f72289Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72290Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f72291Oooo0O0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseCreateUserVerificationFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72293OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72293OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f72293OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72294OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72294OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f72294OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserVerificationFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23166OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72295OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23166OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72295OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseCreateUserVerificationFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f72295OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public FirebaseCreateUserVerificationFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0(c32447OooOOoOooO0OO);
        this.f72288Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28560OoooOOO.class), oooO0O0, new C23166OooO0Oo(c32447OooOOoOooO0OO), new OooO0OO(c32447OooOOoOooO0OO));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_create_user_verification;
    }

    public final void Oooo0(long j, String str) {
        if (j > 0) {
            C21989OooOooO.OooO00o(this).OooO0O0(new C28539OooOoO0(j, this, str, null));
            return;
        }
        Context context = getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, str);
        }
    }

    public final void Oooo00o(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebaseVerificationFragment", "handleLoginResult: ", i), new Object[0]);
        if (i == 1000) {
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        Oooo0(1000L, C21335Oooo0oO.OooO0OO(contextRequireContext, i));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        FirebaseUser currentUser = ((C28560OoooOOO) this.f72288Oooo000.getValue()).f101228OooOO0.getCurrentUser();
        if (currentUser == null) {
            Oooo00o(1004);
        } else {
            currentUser.sendEmailVerification().addOnCompleteListener(new C28536OooOo0O(this));
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72289Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28296OooO0oo(this, 1));
        View viewFindViewById2 = view.findViewById(R.id.btn_back);
        this.f72290Oooo00o = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28534OooOOoo(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new OooOo00(this, 0));
        TextView textView2 = (TextView) view.findViewById(R.id.tv_resend);
        if (textView2 == null) {
            OooOOO0.OooOOOO("tvResend");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC28288OooO(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_terms);
        this.f72287Oooo0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28535OooOo0(this, 0));
        View viewFindViewById4 = view.findViewById(R.id.btn_privacy);
        this.f72291Oooo0O0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new o0Oo0oO0.OooOO0(this, 1));
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseVerificationFragment");
                c20358OooO00o.OooO0OO("checkNetworkState: connectivityManager is null", new Object[0]);
                return;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("FirebaseVerificationFragment");
                c20358OooO00o2.OooO0OO("checkNetworkState: currentNetwork is null", new Object[0]);
                Oooo00o(1002);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("FirebaseVerificationFragment");
            c20358OooO00o3.OooO0o0("checkNetworkState: currentNetwork=" + activeNetwork, new Object[0]);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                c20358OooO00o3.OooOOO0("FirebaseVerificationFragment");
                c20358OooO00o3.OooO0OO("checkNetworkState: network is not connected", new Object[0]);
                Oooo00o(1002);
            }
            c20358OooO00o3.OooOOO0("FirebaseVerificationFragment");
            c20358OooO00o3.OooO00o("checkNetworkState: network is connected", new Object[0]);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("FirebaseVerificationFragment");
            c20358OooO00o4.OooO0Oo(e, "checkNetworkState: failed", new Object[0]);
        }
    }
}
