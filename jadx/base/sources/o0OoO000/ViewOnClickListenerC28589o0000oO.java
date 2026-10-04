package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.backup.BackupResultDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import com.orion.notein.p607ui.pageeditor.ChooseNoteDialogFragment;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;
import o0o0OO0O.C30424OooO0O0;
import o0o0OO0O.C30426OooO0Oo;
import o0o0OOO0.C30544OooO0O0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO000.o0000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28589o0000oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101329OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101330OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28589o0000oO(Fragment fragment, int i) {
        this.f101330OooOo0o = i;
        this.f101329OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.f101330OooOo0o) {
            case 0:
                FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment = (FirebaseUserModifyPasswordFragment) this.f101329OooOo;
                EditText editText = firebaseUserModifyPasswordFragment.f72391Oooo00o;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
                if (editText.getInputType() == 144) {
                    ImageView imageView = firebaseUserModifyPasswordFragment.f72388Oooo0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_close_eye);
                    EditText editText2 = firebaseUserModifyPasswordFragment.f72391Oooo00o;
                    if (editText2 != null) {
                        editText2.setInputType(129);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                        throw null;
                    }
                }
                ImageView imageView2 = firebaseUserModifyPasswordFragment.f72388Oooo0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnPasswordVisibility");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_open_eye);
                EditText editText3 = firebaseUserModifyPasswordFragment.f72391Oooo00o;
                if (editText3 != null) {
                    editText3.setInputType(144);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etPassword");
                    throw null;
                }
            case 1:
                ChooseNoteDialogFragment chooseNoteDialogFragment = (ChooseNoteDialogFragment) this.f101329OooOo;
                C30544OooO0O0 c30544OooO0O0 = (C30544OooO0O0) chooseNoteDialogFragment.OooOoo0().f108317OooO.f121747OooOo0o.getValue();
                if (c30544OooO0O0 == null || (str = c30544OooO0O0.f109255OooO00o) == null) {
                    return;
                }
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C30424OooO0O0(chooseNoteDialogFragment, null), 3);
                C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(chooseNoteDialogFragment), new C30426OooO0Oo(str), new C24587OooOoo(false, false, R.id.chooseNoteDialogFragment, true, false, -1, -1, -1, -1));
                return;
            case 2:
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO((AppearanceSettingsFragment) this.f101329OooOo), R.id.f57921x33e19680, null);
                return;
            default:
                Dialog dialog = ((BackupResultDialogFragment) this.f101329OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
