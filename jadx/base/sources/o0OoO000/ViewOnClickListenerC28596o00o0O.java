package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import o000o0O0.C24564OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import oO0o0O0o.C33599OooOo0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28596o00o0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DialogFragment f101350OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101351OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28596o00o0O(DialogFragment dialogFragment, int i) {
        this.f101351OooOo0o = i;
        this.f101350OooOo = dialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101351OooOo0o) {
            case 0:
                final FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f101350OooOo;
                ((C26320o0000OoO) firebaseUserLoginFragment.f72357Oooo000.getValue()).OooO();
                EditText editText = firebaseUserLoginFragment.f72367OoooO0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                    throw null;
                }
                String string = C33599OooOo0O.Oooooo0(editText.getText().toString()).toString();
                if (string == null || !Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                    EditText editText2 = firebaseUserLoginFragment.f72367OoooO0;
                    if (editText2 != null) {
                        editText2.setError(firebaseUserLoginFragment.getString(R.string.error_wrong_email_format));
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etEmail");
                        throw null;
                    }
                }
                EditText editText3 = firebaseUserLoginFragment.f72366OoooO;
                if (editText3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                String string2 = C33599OooOo0O.Oooooo0(editText3.getText().toString()).toString();
                if (string2.length() == 0) {
                    EditText editText4 = firebaseUserLoginFragment.f72366OoooO;
                    if (editText4 != null) {
                        editText4.setError(firebaseUserLoginFragment.getString(R.string.enter_password));
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                TextView textView = firebaseUserLoginFragment.f72361Oooo0OO;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = firebaseUserLoginFragment.f72361Oooo0OO;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView2.setText("");
                CircularProgressIndicator circularProgressIndicator = firebaseUserLoginFragment.f72363Oooo0o0;
                if (circularProgressIndicator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
                    throw null;
                }
                circularProgressIndicator.setVisibility(0);
                firebaseUserLoginFragment.f72359Oooo00o.signInWithEmailAndPassword(string, string2).addOnCompleteListener(new OnCompleteListener() { // from class: o0OoO000.o00ooo
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task it) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                        boolean zIsSuccessful = it.isSuccessful();
                        FirebaseUserLoginFragment firebaseUserLoginFragment2 = firebaseUserLoginFragment;
                        if (!zIsSuccessful) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                            c20358OooO00o.OooO0Oo(it.getException(), "signInWithEmail: failed", new Object[0]);
                            if (it.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                firebaseUserLoginFragment2.Oooo0o(1009);
                                return;
                            } else {
                                firebaseUserLoginFragment2.Oooo0o(1003);
                                return;
                            }
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("FirebaseLoginFragment");
                        c20358OooO00o2.OooO0o0(androidx.datastore.preferences.protobuf.o000oOoO.OooO00o(it.getResult(), "signInWithEmail: success. "), new Object[0]);
                        FirebaseUser user = ((AuthResult) it.getResult()).getUser();
                        if (user == null) {
                            firebaseUserLoginFragment2.Oooo0o(1003);
                            return;
                        }
                        if (!user.isEmailVerified()) {
                            firebaseUserLoginFragment2.Oooo0O0();
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserLoginFragment2), new C24564OooO00o(R.id.f57940x32741cfc));
                            return;
                        }
                        String displayName = user.getDisplayName();
                        if (displayName == null || displayName.length() == 0) {
                            firebaseUserLoginFragment2.Oooo0O0();
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserLoginFragment2), new C24564OooO00o(R.id.f57939x7fb4256c));
                        } else {
                            C28560OoooOOO c28560OoooOOO = (C28560OoooOOO) firebaseUserLoginFragment2.f72358Oooo00O.getValue();
                            String email = user.getEmail();
                            if (email == null) {
                                email = "";
                            }
                            c28560OoooOOO.OooO0oO(user, email);
                        }
                    }
                });
                return;
            default:
                ((TranslateDialogFragment) this.f101350OooOo).dismiss();
                return;
        }
    }
}
