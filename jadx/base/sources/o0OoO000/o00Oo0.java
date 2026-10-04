package o0OoO000;

import Oooo0oO.C21022OooO0OO;
import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsContainerDialogFragment;
import o000o0O0.C24564OooO00o;
import o00o00.C25206OooO0Oo;
import o0Oo00o.C28026OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101346OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101347OooOo0o;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f101347OooOo0o = i;
        this.f101346OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101347OooOo0o) {
            case 0:
                Bundle bundle = new Bundle();
                FirebaseUserLoginFragment firebaseUserLoginFragment = (FirebaseUserLoginFragment) this.f101346OooOo;
                C21904OooOoo0.OooO0o(bundle, firebaseUserLoginFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseUserLoginFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                return;
            case 1:
                AudioFileRenameDialogFragment audioFileRenameDialogFragment = (AudioFileRenameDialogFragment) this.f101346OooOo;
                EditText editText = audioFileRenameDialogFragment.f74420Oooo0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = audioFileRenameDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = audioFileRenameDialogFragment.getString(R.string.hint_enter_title);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                AudioFileRenameDialogFragment.OooO00o oooO00o = audioFileRenameDialogFragment.f74425Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO00o(text.toString());
                }
                Dialog dialog = audioFileRenameDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 2:
                View view2 = (View) this.f101346OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view2);
                C28026OooO0OO.OooO0O0(C21022OooO0OO.OooO0O0(view2), new C24564OooO00o(R.id.action_to_fabMediasFragment));
                return;
            default:
                ((GlobalSettingsContainerDialogFragment) this.f101346OooOo).dismissAllowingStateLoss();
                return;
        }
    }
}
