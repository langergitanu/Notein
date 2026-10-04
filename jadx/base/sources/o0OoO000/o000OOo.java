package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.OAuthProvider;
import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import com.orion.notein.p607ui.backup.BackupFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import o0OoOoo0.C29229OooO0Oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o000OOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101340OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101341OooOo0o;

    public /* synthetic */ o000OOo(Object obj, int i) {
        this.f101341OooOo0o = i;
        this.f101340OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101341OooOo0o) {
            case 0:
                final FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f101340OooOo;
                firebaseUserLoginFragment.Oooo(true);
                FirebaseAuth firebaseAuth = firebaseUserLoginFragment.f72359Oooo00o;
                Task<AuthResult> pendingAuthResult = firebaseAuth.getPendingAuthResult();
                if (pendingAuthResult == null) {
                    OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder("microsoft.com");
                    kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
                    builderNewBuilder.addCustomParameter(AuthenticationConstants.AAD.QUERY_PROMPT, "select_account");
                    Task<AuthResult> taskStartActivityForSignInWithProvider = firebaseAuth.startActivityForSignInWithProvider(firebaseUserLoginFragment.requireActivity(), builderNewBuilder.build());
                    final o00oO0O o00oo0o = new o00oO0O(firebaseUserLoginFragment, 0);
                    taskStartActivityForSignInWithProvider.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.o0ooOO0
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) throws Exception {
                            o00oo0o.invoke(obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.o0ooOOo
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception it) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                            c20358OooO00o.OooO0Oo(it, "signInWithMicrosoft: failed", new Object[0]);
                            FirebaseUserLoginFragment firebaseUserLoginFragment2 = firebaseUserLoginFragment;
                            C21989OooOooO.OooO00o(firebaseUserLoginFragment2).OooO0O0(new C28579o00000oo(firebaseUserLoginFragment2, null));
                        }
                    });
                } else {
                    final C28600o0ooOoO c28600o0ooOoO = new C28600o0ooOoO(firebaseUserLoginFragment);
                    pendingAuthResult.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.o0OOO0o
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            c28600o0ooOoO.invoke(obj);
                        }
                    }).addOnFailureListener(new com.google.firebase.appcheck.internal.OooO0o(firebaseUserLoginFragment, 1));
                }
                break;
            case 1:
                ((C29229OooO0Oo) this.f101340OooOo).f103647OooO00o.onClick(view);
                break;
            default:
                C21030OooOO0o.OooO0OO((BackupFragment) this.f101340OooOo).OooOOo0();
                break;
        }
    }
}
