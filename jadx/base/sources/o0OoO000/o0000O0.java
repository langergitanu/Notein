package o0OoO000;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import com.orion.notein.p607ui.backup.BackupResultDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import com.orion.notein.p607ui.user.settings.entry.UserSettingsDialogFragment;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31124OooOO0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0000O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseDialogFragment f101304OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101305OooOo0o;

    public /* synthetic */ o0000O0(BaseDialogFragment baseDialogFragment, int i) {
        this.f101305OooOo0o = i;
        this.f101304OooOo = baseDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseDialogFragment baseDialogFragment = this.f101304OooOo;
        switch (this.f101305OooOo0o) {
            case 0:
                FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment = (FirebaseUserModifyPasswordFragment) baseDialogFragment;
                EditText editText = firebaseUserModifyPasswordFragment.f72393Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etNewPassword");
                    throw null;
                }
                if (editText.getInputType() == 144) {
                    ImageView imageView = firebaseUserModifyPasswordFragment.f72395Oooo0o0;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnNewPasswordVisibility");
                        throw null;
                    }
                    imageView.setImageResource(R.drawable.ic_close_eye);
                    EditText editText2 = firebaseUserModifyPasswordFragment.f72393Oooo0OO;
                    if (editText2 != null) {
                        editText2.setInputType(129);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("etNewPassword");
                        throw null;
                    }
                }
                ImageView imageView2 = firebaseUserModifyPasswordFragment.f72395Oooo0o0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnNewPasswordVisibility");
                    throw null;
                }
                imageView2.setImageResource(R.drawable.ic_open_eye);
                EditText editText3 = firebaseUserModifyPasswordFragment.f72393Oooo0OO;
                if (editText3 != null) {
                    editText3.setInputType(144);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("etNewPassword");
                    throw null;
                }
            case 1:
                ((UserSettingsDialogFragment) baseDialogFragment).dismissAllowingStateLoss();
                return;
            default:
                BackupResultDialogFragment backupResultDialogFragment = (BackupResultDialogFragment) baseDialogFragment;
                C31114OooO c31114OooOOooo00o = backupResultDialogFragment.Oooo00o();
                oO0O000.OooOO0 oooOO02 = oO0O000.OooOO0.f116798OooOo0o;
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c31114OooOOooo00o), null, null, new C31124OooOO0(c31114OooOOooo00o, null), 3);
                C32443OooOOO c32443OooOOO = (C32443OooOOO) backupResultDialogFragment.Oooo00o().f111032OooOO0o.f121747OooOo0o.getValue();
                backupResultDialogFragment.Oooo0(((Number) c32443OooOOO.f116638OooOo0o).intValue(), (Integer) c32443OooOOO.f116637OooOo);
                return;
        }
    }
}
