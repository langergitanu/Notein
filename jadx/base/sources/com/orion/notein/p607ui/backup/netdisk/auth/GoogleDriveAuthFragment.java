package com.orion.notein.p607ui.backup.netdisk.auth;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.backup.netdisk.auth.GoogleDriveAuthFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo0Oo.C28093OooO0oo;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/backup/netdisk/auth/GoogleDriveAuthFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GoogleDriveAuthFragment extends Hilt_GoogleDriveAuthFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public OooO0o.OooO0O0<Intent> f70794OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f70795OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final GoogleSignInOptions f70796OooOooO;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return GoogleDriveAuthFragment.this;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO00o f70798OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO00o oooO00o) {
            super(0);
            this.f70798OooOo0o = oooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70798OooOo0o.invoke();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70799OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70799OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70799OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.netdisk.auth.GoogleDriveAuthFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23012OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70800OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23012OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70800OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70800OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.backup.netdisk.auth.GoogleDriveAuthFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23013OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70801OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23013OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70801OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70801OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? GoogleDriveAuthFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public GoogleDriveAuthFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0O0(new OooO00o()));
        this.f70795OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28093OooO0oo.class), new OooO0OO(interfaceC32440OooOO0OooO0O0), new C23013OooO0o0(interfaceC32440OooOO0OooO0O0), new C23012OooO0Oo(interfaceC32440OooOO0OooO0O0));
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestScopes(new Scope("https://www.googleapis.com/auth/drive.file"), new Scope[0]).build();
        OooOOO0.OooO0o(googleSignInOptionsBuild, "build(...)");
        this.f70796OooOooO = googleSignInOptionsBuild;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70794OooOoo = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0Oo0Oo.OooO0o0
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) throws Throwable {
                GoogleDriveAuthFragment googleDriveAuthFragment = this.f99560OooOo0o;
                ActivityResult result = (ActivityResult) obj;
                OooOOO0.OooO0oO(result, "result");
                Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(result.f62239OooOo);
                OooOOO0.OooO0o(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
                try {
                    signedInAccountFromIntent.getResult(ApiException.class);
                    C28093OooO0oo c28093OooO0oo = (C28093OooO0oo) googleDriveAuthFragment.f70795OooOoo0.getValue();
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C28092OooO0oO(c28093OooO0oo, null), 3);
                } catch (ApiException e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleDriveAuthFragment");
                    c20358OooO00o.OooOO0O(C21532OooOOo.OooO0OO(e.getStatusCode(), "signInResult:failed code="), new Object[0]);
                }
                ActivityC21897OooOo0 activity = googleDriveAuthFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        GoogleSignInClient client = GoogleSignIn.getClient((Activity) requireActivity(), this.f70796OooOooO);
        if (client == null) {
            OooOOO0.OooOOOO("googleSignInClient");
            throw null;
        }
        Intent signInIntent = client.getSignInIntent();
        OooOOO0.OooO0o(signInIntent, "getSignInIntent(...)");
        OooO0o.OooO0O0<Intent> oooO0O0 = this.f70794OooOoo;
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(signInIntent);
        } else {
            OooOOO0.OooOOOO("googleSignLauncher");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return super.onCreateView(inflater, viewGroup, bundle);
    }
}
