package o0Oo0oOo;

import Oooo0oO.C21022OooO0OO;
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
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oOo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28324OooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100447OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100448OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28324OooOo(Object obj, int i) {
        this.f100448OooOo0o = i;
        this.f100447OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100448OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CreativeLibraryListFragment) this.f100447OooOo).OooOOOo();
                break;
            case 1:
                final FirebaseUserAuthFragment firebaseUserAuthFragment = (FirebaseUserAuthFragment) this.f100447OooOo;
                firebaseUserAuthFragment.Oooo0o(true);
                FirebaseAuth firebaseAuth = firebaseUserAuthFragment.f72328Oooo00O;
                Task<AuthResult> pendingAuthResult = firebaseAuth.getPendingAuthResult();
                if (pendingAuthResult == null) {
                    OAuthProvider.Builder builderNewBuilder = OAuthProvider.newBuilder("microsoft.com");
                    kotlin.jvm.internal.OooOOO0.OooO0o(builderNewBuilder, "newBuilder(...)");
                    builderNewBuilder.addCustomParameter(AuthenticationConstants.AAD.QUERY_PROMPT, "select_account");
                    Task<AuthResult> taskStartActivityForSignInWithProvider = firebaseAuth.startActivityForSignInWithProvider(firebaseUserAuthFragment.requireActivity(), builderNewBuilder.build());
                    final C28333OooOoo0 c28333OooOoo0 = new C28333OooOoo0(firebaseUserAuthFragment, 1);
                    taskStartActivityForSignInWithProvider.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.OooooOo
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) throws Exception {
                            c28333OooOoo0.invoke(obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.OoooOo0
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception it) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                            c20358OooO00o.OooO0Oo(it, "signInWithMicrosoft: failed", new Object[0]);
                            FirebaseUserAuthFragment firebaseUserAuthFragment2 = firebaseUserAuthFragment;
                            C21989OooOooO.OooO00o(firebaseUserAuthFragment2).OooO0O0(new C28573Ooooooo(it, firebaseUserAuthFragment2, null));
                        }
                    });
                } else {
                    final C28319OooOOOO c28319OooOOOO = new C28319OooOOOO(firebaseUserAuthFragment, 1);
                    pendingAuthResult.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.OoooOoO
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) throws Exception {
                            c28319OooOOOO.invoke(obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.OoooOoo
                        @Override // com.google.android.gms.tasks.OnFailureListener
                        public final void onFailure(Exception it) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                            c20358OooO00o.OooO0Oo(it, "checkPendingResultTask: failed", new Object[0]);
                            firebaseUserAuthFragment.Oooo0OO(1003);
                        }
                    });
                }
                break;
            default:
                View view2 = (View) this.f100447OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                C21022OooO0OO.OooO0O0(view2).OooOOo0();
                break;
        }
    }
}
