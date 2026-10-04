package com.google.android.material.datepicker;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.FirebaseNetworkException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import com.orion.notein.p607ui.noteeditor.editortab.LatestOpenedNoteTabFragment;
import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import com.orion.notein.p607ui.pageeditor.PageOperationProgressDialogFragment;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24586OooOoOO;
import o0Oo0oOo.o000000O;
import o0OoO000.o0000O0O;
import o0OoOoo0.C29229OooO0Oo;
import o0o00oO0.C29997OooOo0;
import o0o0O.C30174OooO00o;
import o0o0OO.C30367OooO0o0;
import oO0OOooo.C33163OooO0oO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.o00000OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.android.material.datepicker.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ViewOnClickListenerC22469OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67701OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67702OooOo0o;

    public /* synthetic */ ViewOnClickListenerC22469OooO0o0(Object obj, int i) {
        this.f67702OooOo0o = i;
        this.f67701OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C29229OooO0Oo c29229OooO0Oo;
        switch (this.f67702OooOo0o) {
            case 0:
                ((MaterialDatePicker) this.f67701OooOo).lambda$initHeaderToggle$0(view);
                return;
            case 1:
                final FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment = (FirebaseUserModifyPasswordFragment) this.f67701OooOo;
                EditText editText = firebaseUserModifyPasswordFragment.f72393Oooo0OO;
                if (editText == null) {
                    OooOOO0.OooOOOO("etNewPassword");
                    throw null;
                }
                String string = C33599OooOo0O.Oooooo0(editText.getText().toString()).toString();
                if (!firebaseUserModifyPasswordFragment.Oooo00o(string)) {
                    ViewGroup viewGroup = firebaseUserModifyPasswordFragment.f72397Oooo0oo;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        return;
                    } else {
                        OooOOO0.OooOOOO("passwordRequirements");
                        throw null;
                    }
                }
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
                FirebaseUser currentUser = firebaseAuth.getCurrentUser();
                if (currentUser == null) {
                    firebaseUserModifyPasswordFragment.Oooo0O0(1004);
                    return;
                }
                EditText editText2 = firebaseUserModifyPasswordFragment.f72391Oooo00o;
                if (editText2 == null) {
                    OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                String string2 = C33599OooOo0O.Oooooo0(editText2.getText().toString()).toString();
                if (string2.length() == 0) {
                    EditText editText3 = firebaseUserModifyPasswordFragment.f72391Oooo00o;
                    if (editText3 != null) {
                        editText3.setError(firebaseUserModifyPasswordFragment.getString(R.string.hint_enter_current_password));
                        return;
                    } else {
                        OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                String email = currentUser.getEmail();
                if (email == null) {
                    email = "";
                }
                if (email.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("FirebasePasswordFragment");
                    c20358OooO00o.OooO0OO("User email is empty", new Object[0]);
                }
                TextView textView = firebaseUserModifyPasswordFragment.f72394Oooo0o;
                if (textView == null) {
                    OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = firebaseUserModifyPasswordFragment.f72394Oooo0o;
                if (textView2 == null) {
                    OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView2.setText("");
                CircularProgressIndicator circularProgressIndicator = firebaseUserModifyPasswordFragment.f72396Oooo0oO;
                if (circularProgressIndicator == null) {
                    OooOOO0.OooOOOO("cpiBtnContinue");
                    throw null;
                }
                circularProgressIndicator.setVisibility(0);
                AuthCredential credential = EmailAuthProvider.getCredential(email, string2);
                OooOOO0.OooO0o(credential, "getCredential(...)");
                Task<Void> taskReauthenticate = currentUser.reauthenticate(credential);
                final o0000O0O o0000o0o2 = new o0000O0O(currentUser, string, firebaseUserModifyPasswordFragment);
                taskReauthenticate.addOnSuccessListener(new OnSuccessListener() { // from class: o0OoO000.o000OO
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        o0000o0o2.invoke(obj);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: o0OoO000.o0000O
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception it) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                        FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment2 = firebaseUserModifyPasswordFragment;
                        firebaseUserModifyPasswordFragment2.Oooo0();
                        if (it instanceof FirebaseAuthInvalidCredentialsException) {
                            firebaseUserModifyPasswordFragment2.Oooo0O0(1010);
                        } else if (it instanceof FirebaseNetworkException) {
                            firebaseUserModifyPasswordFragment2.Oooo0O0(1002);
                        } else {
                            firebaseUserModifyPasswordFragment2.Oooo0O0(1005);
                        }
                    }
                });
                return;
            case 2:
                LatestOpenedNoteTabFragment latestOpenedNoteTabFragment = (LatestOpenedNoteTabFragment) this.f67701OooOo;
                if (latestOpenedNoteTabFragment.f74474Oooo00O == null) {
                    Context context = latestOpenedNoteTabFragment.getContext();
                    if (context != null) {
                        c29229OooO0Oo = new C29229OooO0Oo((C33163OooO0oO) context, new o000000O(latestOpenedNoteTabFragment, 1));
                    } else {
                        c29229OooO0Oo = null;
                    }
                    latestOpenedNoteTabFragment.f74474Oooo00O = c29229OooO0Oo;
                }
                C29229OooO0Oo c29229OooO0Oo2 = latestOpenedNoteTabFragment.f74474Oooo00O;
                if (c29229OooO0Oo2 != null) {
                    ImageView imageView = latestOpenedNoteTabFragment.f74473Oooo000;
                    if (imageView == null) {
                        OooOOO0.OooOOOO("ivLatestOpenedNoteMore");
                        throw null;
                    }
                    c29229OooO0Oo2.f103648OooO0O0.showAsDropDown(imageView, Oooo0.o000000O.OooO0o(20), Oooo0.o000000O.OooO0o(6), GravityCompat.END);
                }
                List<LatestOpenedNoteVO> list = (List) latestOpenedNoteTabFragment.OooOoo0().f103732OooO.f121747OooOo0o.getValue();
                C29229OooO0Oo c29229OooO0Oo3 = latestOpenedNoteTabFragment.f74474Oooo00O;
                if (c29229OooO0Oo3 != null) {
                    c29229OooO0Oo3.OooO00o(list);
                    return;
                }
                return;
            case 3:
                C29997OooOo0 c29997OooOo0 = (C29997OooOo0) this.f67701OooOo;
                C21030OooOO0o.OooO0o(c29997OooOo0.f106571OooOo0o, c29997OooOo0.f106570OooOo);
                return;
            case 4:
                ((C30174OooO00o) this.f67701OooOo).f107399OooO0O0.onClick(view);
                return;
            case 5:
                PageOperationProgressDialogFragment pageOperationProgressDialogFragment = (PageOperationProgressDialogFragment) this.f67701OooOo;
                o00000OO o00000oo2 = ((C30367OooO0o0) pageOperationProgressDialogFragment.f78496Oooo00O.getValue()).f108327OooO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                }
                Dialog dialog = pageOperationProgressDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                C24586OooOoOO c24586OooOoOO = (C24586OooOoOO) this.f67701OooOo;
                if (c24586OooOoOO != null) {
                    c24586OooOoOO.OooOOo0();
                    return;
                }
                return;
        }
    }
}
