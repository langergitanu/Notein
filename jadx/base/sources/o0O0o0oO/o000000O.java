package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.C22026ooOO;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.feedback.FeedbackContainerFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
import o0OoO000.C28560OoooOOO;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o000000O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88971OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88972OooOo0o;

    public /* synthetic */ o000000O(Object obj, int i) {
        this.f88972OooOo0o = i;
        this.f88971OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88972OooOo0o) {
            case 0:
                ((ViewOnAttachStateChangeListenerC26064o000000o) this.f88971OooOo).f88976OooOoO0.f88968OooO0OO.OooO00o();
                return;
            case 1:
                C21030OooOO0o.OooO0OO((FeedbackContainerFragment) this.f88971OooOo).OooOOo0();
                return;
            case 2:
                FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = (FirebaseCreateUserSetNameFragment) this.f88971OooOo;
                C22026ooOO c22026ooOO = firebaseCreateUserSetNameFragment.f72268Oooo00O;
                FirebaseUser currentUser = ((C28560OoooOOO) c22026ooOO.getValue()).f101228OooOO0.getCurrentUser();
                if (currentUser == null) {
                    firebaseCreateUserSetNameFragment.Oooo0(1004);
                    return;
                }
                EditText editText = firebaseCreateUserSetNameFragment.f72271Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etUsername");
                    throw null;
                }
                String string = C33599OooOo0O.Oooooo0(editText.getText().toString()).toString();
                if (string.length() == 0) {
                    EditText editText2 = firebaseCreateUserSetNameFragment.f72271Oooo0OO;
                    if (editText2 != null) {
                        editText2.setError(firebaseCreateUserSetNameFragment.getString(R.string.content_set_display_name));
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etUsername");
                        throw null;
                    }
                }
                String email = currentUser.getEmail();
                if (email == null) {
                    return;
                }
                TextView textView = firebaseCreateUserSetNameFragment.f72273Oooo0o0;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView.setEnabled(false);
                TextView textView2 = firebaseCreateUserSetNameFragment.f72273Oooo0o0;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
                    throw null;
                }
                textView2.setText("");
                CircularProgressIndicator circularProgressIndicator = firebaseCreateUserSetNameFragment.f72272Oooo0o;
                if (circularProgressIndicator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
                    throw null;
                }
                circularProgressIndicator.setVisibility(0);
                if (!string.equals(currentUser.getDisplayName())) {
                    UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
                    builder.setDisplayName(string);
                    UserProfileChangeRequest userProfileChangeRequestBuild = builder.build();
                    kotlin.jvm.internal.OooOOO0.OooO0o(userProfileChangeRequestBuild, "build(...)");
                    currentUser.updateProfile(userProfileChangeRequestBuild).addOnCompleteListener(new o0OoO000.OooOOO0());
                }
                ((C28560OoooOOO) c22026ooOO.getValue()).OooO0oO(currentUser, email);
                return;
            default:
                ViewOnClickListenerC28523OooO00o viewOnClickListenerC28523OooO00o = ((com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o) this.f88971OooOo).f75877OooO0O0;
                if (viewOnClickListenerC28523OooO00o != null) {
                    viewOnClickListenerC28523OooO00o.onClick(view);
                    return;
                }
                return;
        }
    }
}
