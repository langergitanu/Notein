package o0OoO000;

import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineEditDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.pay.google.CancelSubscriptionAlertDialog;
import com.orion.penkit.tools.DrawToolFactory;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101160OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101161OooOo0o;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f101161OooOo0o = i;
        this.f101160OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101161OooOo0o) {
            case 0:
                final FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment = (FirebaseCreateUserVerificationFragment) this.f101160OooOo;
                final FirebaseUser currentUser = ((C28560OoooOOO) firebaseCreateUserVerificationFragment.f72288Oooo000.getValue()).f101228OooOO0.getCurrentUser();
                if (currentUser == null) {
                    firebaseCreateUserVerificationFragment.Oooo00o(1004);
                    return;
                } else {
                    currentUser.reload().addOnCompleteListener(new OnCompleteListener() { // from class: o0OoO000.OooOo0o
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task it) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                            boolean zIsSuccessful = it.isSuccessful();
                            FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment2 = firebaseCreateUserVerificationFragment;
                            if (!zIsSuccessful) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("FirebaseVerificationFragment");
                                c20358OooO00o.OooO0Oo(it.getException(), "checkEmailVerificationState: reload failed", new Object[0]);
                                String string = firebaseCreateUserVerificationFragment2.getString(R.string.can_not_reload_user);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                firebaseCreateUserVerificationFragment2.Oooo0(0L, string);
                                return;
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("FirebaseVerificationFragment");
                            c20358OooO00o2.OooO0o0("checkEmailVerificationState: reload success", new Object[0]);
                            if (currentUser.isEmailVerified()) {
                                c20358OooO00o2.OooOOO0("FirebaseVerificationFragment");
                                c20358OooO00o2.OooO0o0("checkEmailVerificationState: email is verified", new Object[0]);
                                C21989OooOooO.OooO00o(firebaseCreateUserVerificationFragment2).OooO0O0(new OooOo(firebaseCreateUserVerificationFragment2, null));
                            } else {
                                c20358OooO00o2.OooOOO0("FirebaseVerificationFragment");
                                c20358OooO00o2.OooO0o0("checkEmailVerificationState: email is not verified", new Object[0]);
                                String string2 = firebaseCreateUserVerificationFragment2.getString(R.string.email_not_verified);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                                firebaseCreateUserVerificationFragment2.Oooo0(0L, string2);
                            }
                        }
                    });
                    return;
                }
            case 1:
                EditText editText = ((OutlineEditDialogFragment) this.f101160OooOo).f75894OooOooo;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 2:
                PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0 = ((PenBox) this.f101160OooOo).lassoFilterListener;
                if (interfaceC23606OooO0o0 != null) {
                    interfaceC23606OooO0o0.OooO00o(BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_CAPTURE)));
                    return;
                }
                return;
            default:
                ((CancelSubscriptionAlertDialog) this.f101160OooOo).Oooo00O();
                return;
        }
    }
}
